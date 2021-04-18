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
import com.ruoyi.datasync.domain.LowVoltage;
import com.ruoyi.datasync.service.ILowVoltageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 低压配电Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/voltage")
public class LowVoltageController extends BaseController
{
    private String prefix = "datasync/voltage";

    @Autowired
    private ILowVoltageService lowVoltageService;

    @RequiresPermissions("datasync:voltage:view")
    @GetMapping()
    public String voltage()
    {
        return prefix + "/voltage";
    }

    /**
     * 查询低压配电列表
     */
    @RequiresPermissions("datasync:voltage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LowVoltage lowVoltage)
    {
        startPage();
        List<LowVoltage> list = lowVoltageService.selectLowVoltageList(lowVoltage);
        return getDataTable(list);
    }

    /**
     * 导出低压配电列表
     */
    @RequiresPermissions("datasync:voltage:export")
    @Log(title = "低压配电", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LowVoltage lowVoltage)
    {
        List<LowVoltage> list = lowVoltageService.selectLowVoltageList(lowVoltage);
        ExcelUtil<LowVoltage> util = new ExcelUtil<LowVoltage>(LowVoltage.class);
        return util.exportExcel(list, "voltage");
    }

    /**
     * 新增低压配电
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存低压配电
     */
    @RequiresPermissions("datasync:voltage:add")
    @Log(title = "低压配电", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LowVoltage lowVoltage)
    {
        return toAjax(lowVoltageService.insertLowVoltage(lowVoltage));
    }

    /**
     * 修改低压配电
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LowVoltage lowVoltage = lowVoltageService.selectLowVoltageById(id);
        mmap.put("lowVoltage", lowVoltage);
        return prefix + "/edit";
    }

    /**
     * 修改保存低压配电
     */
    @RequiresPermissions("datasync:voltage:edit")
    @Log(title = "低压配电", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LowVoltage lowVoltage)
    {
        return toAjax(lowVoltageService.updateLowVoltage(lowVoltage));
    }

    /**
     * 删除低压配电
     */
    @RequiresPermissions("datasync:voltage:remove")
    @Log(title = "低压配电", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lowVoltageService.deleteLowVoltageByIds(ids));
    }
}
