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
import com.ruoyi.datasync.domain.CentralAirCondition;
import com.ruoyi.datasync.service.ICentralAirConditionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 中央空调Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/condition")
public class CentralAirConditionController extends BaseController
{
    private String prefix = "datasync/condition";

    @Autowired
    private ICentralAirConditionService centralAirConditionService;

    @RequiresPermissions("datasync:condition:view")
    @GetMapping()
    public String condition()
    {
        return prefix + "/condition";
    }

    /**
     * 查询中央空调列表
     */
    @RequiresPermissions("datasync:condition:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CentralAirCondition centralAirCondition)
    {
        startPage();
        List<CentralAirCondition> list = centralAirConditionService.selectCentralAirConditionList(centralAirCondition);
        return getDataTable(list);
    }

    /**
     * 导出中央空调列表
     */
    @RequiresPermissions("datasync:condition:export")
    @Log(title = "中央空调", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CentralAirCondition centralAirCondition)
    {
        List<CentralAirCondition> list = centralAirConditionService.selectCentralAirConditionList(centralAirCondition);
        ExcelUtil<CentralAirCondition> util = new ExcelUtil<CentralAirCondition>(CentralAirCondition.class);
        return util.exportExcel(list, "condition");
    }

    /**
     * 新增中央空调
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存中央空调
     */
    @RequiresPermissions("datasync:condition:add")
    @Log(title = "中央空调", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CentralAirCondition centralAirCondition)
    {
        return toAjax(centralAirConditionService.insertCentralAirCondition(centralAirCondition));
    }

    /**
     * 修改中央空调
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CentralAirCondition centralAirCondition = centralAirConditionService.selectCentralAirConditionById(id);
        mmap.put("centralAirCondition", centralAirCondition);
        return prefix + "/edit";
    }

    /**
     * 修改保存中央空调
     */
    @RequiresPermissions("datasync:condition:edit")
    @Log(title = "中央空调", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CentralAirCondition centralAirCondition)
    {
        return toAjax(centralAirConditionService.updateCentralAirCondition(centralAirCondition));
    }

    /**
     * 删除中央空调
     */
    @RequiresPermissions("datasync:condition:remove")
    @Log(title = "中央空调", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(centralAirConditionService.deleteCentralAirConditionByIds(ids));
    }
}
