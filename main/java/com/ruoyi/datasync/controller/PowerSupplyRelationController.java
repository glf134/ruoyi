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
import com.ruoyi.datasync.domain.PowerSupplyRelation;
import com.ruoyi.datasync.service.IPowerSupplyRelationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 供电关联关系Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/relation")
public class PowerSupplyRelationController extends BaseController
{
    private String prefix = "datasync/relation";

    @Autowired
    private IPowerSupplyRelationService powerSupplyRelationService;

    @RequiresPermissions("datasync:relation:view")
    @GetMapping()
    public String relation()
    {
        return prefix + "/relation";
    }

    /**
     * 查询供电关联关系列表
     */
    @RequiresPermissions("datasync:relation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PowerSupplyRelation powerSupplyRelation)
    {
        startPage();
        List<PowerSupplyRelation> list = powerSupplyRelationService.selectPowerSupplyRelationList(powerSupplyRelation);
        return getDataTable(list);
    }

    /**
     * 导出供电关联关系列表
     */
    @RequiresPermissions("datasync:relation:export")
    @Log(title = "供电关联关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PowerSupplyRelation powerSupplyRelation)
    {
        List<PowerSupplyRelation> list = powerSupplyRelationService.selectPowerSupplyRelationList(powerSupplyRelation);
        ExcelUtil<PowerSupplyRelation> util = new ExcelUtil<PowerSupplyRelation>(PowerSupplyRelation.class);
        return util.exportExcel(list, "relation");
    }

    /**
     * 新增供电关联关系
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存供电关联关系
     */
    @RequiresPermissions("datasync:relation:add")
    @Log(title = "供电关联关系", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PowerSupplyRelation powerSupplyRelation)
    {
        return toAjax(powerSupplyRelationService.insertPowerSupplyRelation(powerSupplyRelation));
    }

    /**
     * 修改供电关联关系
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PowerSupplyRelation powerSupplyRelation = powerSupplyRelationService.selectPowerSupplyRelationById(id);
        mmap.put("powerSupplyRelation", powerSupplyRelation);
        return prefix + "/edit";
    }

    /**
     * 修改保存供电关联关系
     */
    @RequiresPermissions("datasync:relation:edit")
    @Log(title = "供电关联关系", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PowerSupplyRelation powerSupplyRelation)
    {
        return toAjax(powerSupplyRelationService.updatePowerSupplyRelation(powerSupplyRelation));
    }

    /**
     * 删除供电关联关系
     */
    @RequiresPermissions("datasync:relation:remove")
    @Log(title = "供电关联关系", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(powerSupplyRelationService.deletePowerSupplyRelationByIds(ids));
    }
}
