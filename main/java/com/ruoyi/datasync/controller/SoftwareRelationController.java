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
import com.ruoyi.datasync.domain.SoftwareRelation;
import com.ruoyi.datasync.service.ISoftwareRelationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 软件实例关联关系Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/relation")
public class SoftwareRelationController extends BaseController
{
    private String prefix = "datasync/relation";

    @Autowired
    private ISoftwareRelationService softwareRelationService;

    @RequiresPermissions("datasync:relation:view")
    @GetMapping()
    public String relation()
    {
        return prefix + "/relation";
    }

    /**
     * 查询软件实例关联关系列表
     */
    @RequiresPermissions("datasync:relation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SoftwareRelation softwareRelation)
    {
        startPage();
        List<SoftwareRelation> list = softwareRelationService.selectSoftwareRelationList(softwareRelation);
        return getDataTable(list);
    }

    /**
     * 导出软件实例关联关系列表
     */
    @RequiresPermissions("datasync:relation:export")
    @Log(title = "软件实例关联关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SoftwareRelation softwareRelation)
    {
        List<SoftwareRelation> list = softwareRelationService.selectSoftwareRelationList(softwareRelation);
        ExcelUtil<SoftwareRelation> util = new ExcelUtil<SoftwareRelation>(SoftwareRelation.class);
        return util.exportExcel(list, "relation");
    }

    /**
     * 新增软件实例关联关系
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存软件实例关联关系
     */
    @RequiresPermissions("datasync:relation:add")
    @Log(title = "软件实例关联关系", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SoftwareRelation softwareRelation)
    {
        return toAjax(softwareRelationService.insertSoftwareRelation(softwareRelation));
    }

    /**
     * 修改软件实例关联关系
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SoftwareRelation softwareRelation = softwareRelationService.selectSoftwareRelationById(id);
        mmap.put("softwareRelation", softwareRelation);
        return prefix + "/edit";
    }

    /**
     * 修改保存软件实例关联关系
     */
    @RequiresPermissions("datasync:relation:edit")
    @Log(title = "软件实例关联关系", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SoftwareRelation softwareRelation)
    {
        return toAjax(softwareRelationService.updateSoftwareRelation(softwareRelation));
    }

    /**
     * 删除软件实例关联关系
     */
    @RequiresPermissions("datasync:relation:remove")
    @Log(title = "软件实例关联关系", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(softwareRelationService.deleteSoftwareRelationByIds(ids));
    }
}
