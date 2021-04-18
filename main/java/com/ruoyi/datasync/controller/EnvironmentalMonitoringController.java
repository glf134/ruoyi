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
import com.ruoyi.datasync.domain.EnvironmentalMonitoring;
import com.ruoyi.datasync.service.IEnvironmentalMonitoringService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 环境监控系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/monitoring")
public class EnvironmentalMonitoringController extends BaseController
{
    private String prefix = "datasync/monitoring";

    @Autowired
    private IEnvironmentalMonitoringService environmentalMonitoringService;

    @RequiresPermissions("datasync:monitoring:view")
    @GetMapping()
    public String monitoring()
    {
        return prefix + "/monitoring";
    }

    /**
     * 查询环境监控系统列表
     */
    @RequiresPermissions("datasync:monitoring:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EnvironmentalMonitoring environmentalMonitoring)
    {
        startPage();
        List<EnvironmentalMonitoring> list = environmentalMonitoringService.selectEnvironmentalMonitoringList(environmentalMonitoring);
        return getDataTable(list);
    }

    /**
     * 导出环境监控系统列表
     */
    @RequiresPermissions("datasync:monitoring:export")
    @Log(title = "环境监控系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EnvironmentalMonitoring environmentalMonitoring)
    {
        List<EnvironmentalMonitoring> list = environmentalMonitoringService.selectEnvironmentalMonitoringList(environmentalMonitoring);
        ExcelUtil<EnvironmentalMonitoring> util = new ExcelUtil<EnvironmentalMonitoring>(EnvironmentalMonitoring.class);
        return util.exportExcel(list, "monitoring");
    }

    /**
     * 新增环境监控系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存环境监控系统
     */
    @RequiresPermissions("datasync:monitoring:add")
    @Log(title = "环境监控系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EnvironmentalMonitoring environmentalMonitoring)
    {
        return toAjax(environmentalMonitoringService.insertEnvironmentalMonitoring(environmentalMonitoring));
    }

    /**
     * 修改环境监控系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        EnvironmentalMonitoring environmentalMonitoring = environmentalMonitoringService.selectEnvironmentalMonitoringById(id);
        mmap.put("environmentalMonitoring", environmentalMonitoring);
        return prefix + "/edit";
    }

    /**
     * 修改保存环境监控系统
     */
    @RequiresPermissions("datasync:monitoring:edit")
    @Log(title = "环境监控系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EnvironmentalMonitoring environmentalMonitoring)
    {
        return toAjax(environmentalMonitoringService.updateEnvironmentalMonitoring(environmentalMonitoring));
    }

    /**
     * 删除环境监控系统
     */
    @RequiresPermissions("datasync:monitoring:remove")
    @Log(title = "环境监控系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(environmentalMonitoringService.deleteEnvironmentalMonitoringByIds(ids));
    }
}
