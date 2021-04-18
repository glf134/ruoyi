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
import com.ruoyi.datasync.domain.Application;
import com.ruoyi.datasync.service.IApplicationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 应用系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/application")
public class ApplicationController extends BaseController
{
    private String prefix = "datasync/application";

    @Autowired
    private IApplicationService applicationService;

    @RequiresPermissions("datasync:application:view")
    @GetMapping()
    public String application()
    {
        return prefix + "/application";
    }

    /**
     * 查询应用系统列表
     */
    @RequiresPermissions("datasync:application:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Application application)
    {
        startPage();
        List<Application> list = applicationService.selectApplicationList(application);
        return getDataTable(list);
    }

    /**
     * 导出应用系统列表
     */
    @RequiresPermissions("datasync:application:export")
    @Log(title = "应用系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Application application)
    {
        List<Application> list = applicationService.selectApplicationList(application);
        ExcelUtil<Application> util = new ExcelUtil<Application>(Application.class);
        return util.exportExcel(list, "application");
    }

    /**
     * 新增应用系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存应用系统
     */
    @RequiresPermissions("datasync:application:add")
    @Log(title = "应用系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Application application)
    {
        return toAjax(applicationService.insertApplication(application));
    }

    /**
     * 修改应用系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Application application = applicationService.selectApplicationById(id);
        mmap.put("application", application);
        return prefix + "/edit";
    }

    /**
     * 修改保存应用系统
     */
    @RequiresPermissions("datasync:application:edit")
    @Log(title = "应用系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Application application)
    {
        return toAjax(applicationService.updateApplication(application));
    }

    /**
     * 删除应用系统
     */
    @RequiresPermissions("datasync:application:remove")
    @Log(title = "应用系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(applicationService.deleteApplicationByIds(ids));
    }
}
