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
import com.ruoyi.datasync.domain.PrecisionPower;
import com.ruoyi.datasync.service.IPrecisionPowerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 精密配电设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/power")
public class PrecisionPowerController extends BaseController
{
    private String prefix = "datasync/power";

    @Autowired
    private IPrecisionPowerService precisionPowerService;

    @RequiresPermissions("datasync:power:view")
    @GetMapping()
    public String power()
    {
        return prefix + "/power";
    }

    /**
     * 查询精密配电设备列表
     */
    @RequiresPermissions("datasync:power:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrecisionPower precisionPower)
    {
        startPage();
        List<PrecisionPower> list = precisionPowerService.selectPrecisionPowerList(precisionPower);
        return getDataTable(list);
    }

    /**
     * 导出精密配电设备列表
     */
    @RequiresPermissions("datasync:power:export")
    @Log(title = "精密配电设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrecisionPower precisionPower)
    {
        List<PrecisionPower> list = precisionPowerService.selectPrecisionPowerList(precisionPower);
        ExcelUtil<PrecisionPower> util = new ExcelUtil<PrecisionPower>(PrecisionPower.class);
        return util.exportExcel(list, "power");
    }

    /**
     * 新增精密配电设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存精密配电设备
     */
    @RequiresPermissions("datasync:power:add")
    @Log(title = "精密配电设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrecisionPower precisionPower)
    {
        return toAjax(precisionPowerService.insertPrecisionPower(precisionPower));
    }

    /**
     * 修改精密配电设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PrecisionPower precisionPower = precisionPowerService.selectPrecisionPowerById(id);
        mmap.put("precisionPower", precisionPower);
        return prefix + "/edit";
    }

    /**
     * 修改保存精密配电设备
     */
    @RequiresPermissions("datasync:power:edit")
    @Log(title = "精密配电设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrecisionPower precisionPower)
    {
        return toAjax(precisionPowerService.updatePrecisionPower(precisionPower));
    }

    /**
     * 删除精密配电设备
     */
    @RequiresPermissions("datasync:power:remove")
    @Log(title = "精密配电设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(precisionPowerService.deletePrecisionPowerByIds(ids));
    }
}
