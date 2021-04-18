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
import com.ruoyi.datasync.domain.PrecisionAirCondition;
import com.ruoyi.datasync.service.IPrecisionAirConditionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 精密空调Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/condition")
public class PrecisionAirConditionController extends BaseController
{
    private String prefix = "datasync/condition";

    @Autowired
    private IPrecisionAirConditionService precisionAirConditionService;

    @RequiresPermissions("datasync:condition:view")
    @GetMapping()
    public String condition()
    {
        return prefix + "/condition";
    }

    /**
     * 查询精密空调列表
     */
    @RequiresPermissions("datasync:condition:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrecisionAirCondition precisionAirCondition)
    {
        startPage();
        List<PrecisionAirCondition> list = precisionAirConditionService.selectPrecisionAirConditionList(precisionAirCondition);
        return getDataTable(list);
    }

    /**
     * 导出精密空调列表
     */
    @RequiresPermissions("datasync:condition:export")
    @Log(title = "精密空调", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrecisionAirCondition precisionAirCondition)
    {
        List<PrecisionAirCondition> list = precisionAirConditionService.selectPrecisionAirConditionList(precisionAirCondition);
        ExcelUtil<PrecisionAirCondition> util = new ExcelUtil<PrecisionAirCondition>(PrecisionAirCondition.class);
        return util.exportExcel(list, "condition");
    }

    /**
     * 新增精密空调
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存精密空调
     */
    @RequiresPermissions("datasync:condition:add")
    @Log(title = "精密空调", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrecisionAirCondition precisionAirCondition)
    {
        return toAjax(precisionAirConditionService.insertPrecisionAirCondition(precisionAirCondition));
    }

    /**
     * 修改精密空调
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PrecisionAirCondition precisionAirCondition = precisionAirConditionService.selectPrecisionAirConditionById(id);
        mmap.put("precisionAirCondition", precisionAirCondition);
        return prefix + "/edit";
    }

    /**
     * 修改保存精密空调
     */
    @RequiresPermissions("datasync:condition:edit")
    @Log(title = "精密空调", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrecisionAirCondition precisionAirCondition)
    {
        return toAjax(precisionAirConditionService.updatePrecisionAirCondition(precisionAirCondition));
    }

    /**
     * 删除精密空调
     */
    @RequiresPermissions("datasync:condition:remove")
    @Log(title = "精密空调", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(precisionAirConditionService.deletePrecisionAirConditionByIds(ids));
    }
}
