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
import com.ruoyi.datasync.domain.ApplicationRelation;
import com.ruoyi.datasync.service.IApplicationRelationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 应用系统关联关系Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/relation")
public class ApplicationRelationController extends BaseController
{
    private String prefix = "datasync/relation";

    @Autowired
    private IApplicationRelationService applicationRelationService;

    @RequiresPermissions("datasync:relation:view")
    @GetMapping()
    public String relation()
    {
        return prefix + "/relation";
    }

    /**
     * 查询应用系统关联关系列表
     */
    @RequiresPermissions("datasync:relation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ApplicationRelation applicationRelation)
    {
        startPage();
        List<ApplicationRelation> list = applicationRelationService.selectApplicationRelationList(applicationRelation);
        return getDataTable(list);
    }

    /**
     * 导出应用系统关联关系列表
     */
    @RequiresPermissions("datasync:relation:export")
    @Log(title = "应用系统关联关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ApplicationRelation applicationRelation)
    {
        List<ApplicationRelation> list = applicationRelationService.selectApplicationRelationList(applicationRelation);
        ExcelUtil<ApplicationRelation> util = new ExcelUtil<ApplicationRelation>(ApplicationRelation.class);
        return util.exportExcel(list, "relation");
    }

    /**
     * 新增应用系统关联关系
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存应用系统关联关系
     */
    @RequiresPermissions("datasync:relation:add")
    @Log(title = "应用系统关联关系", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ApplicationRelation applicationRelation)
    {
        return toAjax(applicationRelationService.insertApplicationRelation(applicationRelation));
    }

    /**
     * 修改应用系统关联关系
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ApplicationRelation applicationRelation = applicationRelationService.selectApplicationRelationById(id);
        mmap.put("applicationRelation", applicationRelation);
        return prefix + "/edit";
    }

    /**
     * 修改保存应用系统关联关系
     */
    @RequiresPermissions("datasync:relation:edit")
    @Log(title = "应用系统关联关系", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ApplicationRelation applicationRelation)
    {
        return toAjax(applicationRelationService.updateApplicationRelation(applicationRelation));
    }

    /**
     * 删除应用系统关联关系
     */
    @RequiresPermissions("datasync:relation:remove")
    @Log(title = "应用系统关联关系", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(applicationRelationService.deleteApplicationRelationByIds(ids));
    }
}
