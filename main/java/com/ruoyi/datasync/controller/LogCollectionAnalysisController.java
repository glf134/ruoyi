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
import com.ruoyi.datasync.domain.LogCollectionAnalysis;
import com.ruoyi.datasync.service.ILogCollectionAnalysisService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 日志收集与分析系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/analysis")
public class LogCollectionAnalysisController extends BaseController
{
    private String prefix = "datasync/analysis";

    @Autowired
    private ILogCollectionAnalysisService logCollectionAnalysisService;

    @RequiresPermissions("datasync:analysis:view")
    @GetMapping()
    public String analysis()
    {
        return prefix + "/analysis";
    }

    /**
     * 查询日志收集与分析系统列表
     */
    @RequiresPermissions("datasync:analysis:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LogCollectionAnalysis logCollectionAnalysis)
    {
        startPage();
        List<LogCollectionAnalysis> list = logCollectionAnalysisService.selectLogCollectionAnalysisList(logCollectionAnalysis);
        return getDataTable(list);
    }

    /**
     * 导出日志收集与分析系统列表
     */
    @RequiresPermissions("datasync:analysis:export")
    @Log(title = "日志收集与分析系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LogCollectionAnalysis logCollectionAnalysis)
    {
        List<LogCollectionAnalysis> list = logCollectionAnalysisService.selectLogCollectionAnalysisList(logCollectionAnalysis);
        ExcelUtil<LogCollectionAnalysis> util = new ExcelUtil<LogCollectionAnalysis>(LogCollectionAnalysis.class);
        return util.exportExcel(list, "analysis");
    }

    /**
     * 新增日志收集与分析系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存日志收集与分析系统
     */
    @RequiresPermissions("datasync:analysis:add")
    @Log(title = "日志收集与分析系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LogCollectionAnalysis logCollectionAnalysis)
    {
        return toAjax(logCollectionAnalysisService.insertLogCollectionAnalysis(logCollectionAnalysis));
    }

    /**
     * 修改日志收集与分析系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LogCollectionAnalysis logCollectionAnalysis = logCollectionAnalysisService.selectLogCollectionAnalysisById(id);
        mmap.put("logCollectionAnalysis", logCollectionAnalysis);
        return prefix + "/edit";
    }

    /**
     * 修改保存日志收集与分析系统
     */
    @RequiresPermissions("datasync:analysis:edit")
    @Log(title = "日志收集与分析系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LogCollectionAnalysis logCollectionAnalysis)
    {
        return toAjax(logCollectionAnalysisService.updateLogCollectionAnalysis(logCollectionAnalysis));
    }

    /**
     * 删除日志收集与分析系统
     */
    @RequiresPermissions("datasync:analysis:remove")
    @Log(title = "日志收集与分析系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(logCollectionAnalysisService.deleteLogCollectionAnalysisByIds(ids));
    }
}
