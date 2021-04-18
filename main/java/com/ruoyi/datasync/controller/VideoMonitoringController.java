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
import com.ruoyi.datasync.domain.VideoMonitoring;
import com.ruoyi.datasync.service.IVideoMonitoringService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 视频监控类Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/monitoring")
public class VideoMonitoringController extends BaseController
{
    private String prefix = "datasync/monitoring";

    @Autowired
    private IVideoMonitoringService videoMonitoringService;

    @RequiresPermissions("datasync:monitoring:view")
    @GetMapping()
    public String monitoring()
    {
        return prefix + "/monitoring";
    }

    /**
     * 查询视频监控类列表
     */
    @RequiresPermissions("datasync:monitoring:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(VideoMonitoring videoMonitoring)
    {
        startPage();
        List<VideoMonitoring> list = videoMonitoringService.selectVideoMonitoringList(videoMonitoring);
        return getDataTable(list);
    }

    /**
     * 导出视频监控类列表
     */
    @RequiresPermissions("datasync:monitoring:export")
    @Log(title = "视频监控类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(VideoMonitoring videoMonitoring)
    {
        List<VideoMonitoring> list = videoMonitoringService.selectVideoMonitoringList(videoMonitoring);
        ExcelUtil<VideoMonitoring> util = new ExcelUtil<VideoMonitoring>(VideoMonitoring.class);
        return util.exportExcel(list, "monitoring");
    }

    /**
     * 新增视频监控类
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存视频监控类
     */
    @RequiresPermissions("datasync:monitoring:add")
    @Log(title = "视频监控类", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(VideoMonitoring videoMonitoring)
    {
        return toAjax(videoMonitoringService.insertVideoMonitoring(videoMonitoring));
    }

    /**
     * 修改视频监控类
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        VideoMonitoring videoMonitoring = videoMonitoringService.selectVideoMonitoringById(id);
        mmap.put("videoMonitoring", videoMonitoring);
        return prefix + "/edit";
    }

    /**
     * 修改保存视频监控类
     */
    @RequiresPermissions("datasync:monitoring:edit")
    @Log(title = "视频监控类", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(VideoMonitoring videoMonitoring)
    {
        return toAjax(videoMonitoringService.updateVideoMonitoring(videoMonitoring));
    }

    /**
     * 删除视频监控类
     */
    @RequiresPermissions("datasync:monitoring:remove")
    @Log(title = "视频监控类", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(videoMonitoringService.deleteVideoMonitoringByIds(ids));
    }
}
