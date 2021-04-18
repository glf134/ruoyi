package com.ruoyi.datasync.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.datasync.domain.HighVoltage;
import com.ruoyi.datasync.service.IHighVoltageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 高压配电设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/voltage")
public class HighVoltageController extends BaseController
{
    private String prefix = "datasync/voltage";

    @Autowired
    private IHighVoltageService highVoltageService;

    @RequiresPermissions("datasync:voltage:view")
    @GetMapping()
    public String voltage()
    {
        return prefix + "/voltage";
    }

    /**
     * 查询高压配电设备列表
     */
    @RequiresPermissions("datasync:voltage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HighVoltage highVoltage)
    {
        startPage();
        List<HighVoltage> list = highVoltageService.selectHighVoltageList(highVoltage);
        return getDataTable(list);
    }

    /**
     * 导出高压配电设备列表
     */
    @RequiresPermissions("datasync:voltage:export")
    @Log(title = "高压配电设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HighVoltage highVoltage)
    {
        List<HighVoltage> list = highVoltageService.selectHighVoltageList(highVoltage);
        ExcelUtil<HighVoltage> util = new ExcelUtil<HighVoltage>(HighVoltage.class);
        return util.exportExcel(list, "voltage");
    }

    /**
     * 新增高压配电设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高压配电设备
     */
    @RequiresPermissions("datasync:voltage:add")
    @Log(title = "高压配电设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HighVoltage highVoltage)
    {
        return toAjax(highVoltageService.insertHighVoltage(highVoltage));
    }

    /**
     * 修改高压配电设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        HighVoltage highVoltage = highVoltageService.selectHighVoltageById(id);
        mmap.put("highVoltage", highVoltage);
        return prefix + "/edit";
    }

    /**
     * 修改保存高压配电设备
     */
    @RequiresPermissions("datasync:voltage:edit")
    @Log(title = "高压配电设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HighVoltage highVoltage)
    {
        return toAjax(highVoltageService.updateHighVoltage(highVoltage));
    }

    /**
     * 删除高压配电设备
     */
    @RequiresPermissions("datasync:voltage:remove")
    @Log(title = "高压配电设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(highVoltageService.deleteHighVoltageByIds(ids));
    }
}
