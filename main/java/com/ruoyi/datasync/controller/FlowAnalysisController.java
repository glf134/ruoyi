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
import com.ruoyi.datasync.domain.FlowAnalysis;
import com.ruoyi.datasync.service.IFlowAnalysisService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 流量分析设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/analysis")
public class FlowAnalysisController extends BaseController
{
    private String prefix = "datasync/analysis";

    @Autowired
    private IFlowAnalysisService flowAnalysisService;

    @RequiresPermissions("datasync:analysis:view")
    @GetMapping()
    public String analysis()
    {
        return prefix + "/analysis";
    }

    /**
     * 查询流量分析设备列表
     */
    @RequiresPermissions("datasync:analysis:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FlowAnalysis flowAnalysis)
    {
        startPage();
        List<FlowAnalysis> list = flowAnalysisService.selectFlowAnalysisList(flowAnalysis);
        return getDataTable(list);
    }

    /**
     * 导出流量分析设备列表
     */
    @RequiresPermissions("datasync:analysis:export")
    @Log(title = "流量分析设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FlowAnalysis flowAnalysis)
    {
        List<FlowAnalysis> list = flowAnalysisService.selectFlowAnalysisList(flowAnalysis);
        ExcelUtil<FlowAnalysis> util = new ExcelUtil<FlowAnalysis>(FlowAnalysis.class);
        return util.exportExcel(list, "analysis");
    }

    /**
     * 新增流量分析设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存流量分析设备
     */
    @RequiresPermissions("datasync:analysis:add")
    @Log(title = "流量分析设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FlowAnalysis flowAnalysis)
    {
        return toAjax(flowAnalysisService.insertFlowAnalysis(flowAnalysis));
    }

    /**
     * 修改流量分析设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FlowAnalysis flowAnalysis = flowAnalysisService.selectFlowAnalysisById(id);
        mmap.put("flowAnalysis", flowAnalysis);
        return prefix + "/edit";
    }

    /**
     * 修改保存流量分析设备
     */
    @RequiresPermissions("datasync:analysis:edit")
    @Log(title = "流量分析设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FlowAnalysis flowAnalysis)
    {
        return toAjax(flowAnalysisService.updateFlowAnalysis(flowAnalysis));
    }

    /**
     * 删除流量分析设备
     */
    @RequiresPermissions("datasync:analysis:remove")
    @Log(title = "流量分析设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(flowAnalysisService.deleteFlowAnalysisByIds(ids));
    }
}
