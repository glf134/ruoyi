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
import com.ruoyi.datasync.domain.FireProtection;
import com.ruoyi.datasync.service.IFireProtectionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消防系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/protection")
public class FireProtectionController extends BaseController
{
    private String prefix = "datasync/protection";

    @Autowired
    private IFireProtectionService fireProtectionService;

    @RequiresPermissions("datasync:protection:view")
    @GetMapping()
    public String protection()
    {
        return prefix + "/protection";
    }

    /**
     * 查询消防系统列表
     */
    @RequiresPermissions("datasync:protection:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FireProtection fireProtection)
    {
        startPage();
        List<FireProtection> list = fireProtectionService.selectFireProtectionList(fireProtection);
        return getDataTable(list);
    }

    /**
     * 导出消防系统列表
     */
    @RequiresPermissions("datasync:protection:export")
    @Log(title = "消防系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FireProtection fireProtection)
    {
        List<FireProtection> list = fireProtectionService.selectFireProtectionList(fireProtection);
        ExcelUtil<FireProtection> util = new ExcelUtil<FireProtection>(FireProtection.class);
        return util.exportExcel(list, "protection");
    }

    /**
     * 新增消防系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存消防系统
     */
    @RequiresPermissions("datasync:protection:add")
    @Log(title = "消防系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FireProtection fireProtection)
    {
        return toAjax(fireProtectionService.insertFireProtection(fireProtection));
    }

    /**
     * 修改消防系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FireProtection fireProtection = fireProtectionService.selectFireProtectionById(id);
        mmap.put("fireProtection", fireProtection);
        return prefix + "/edit";
    }

    /**
     * 修改保存消防系统
     */
    @RequiresPermissions("datasync:protection:edit")
    @Log(title = "消防系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FireProtection fireProtection)
    {
        return toAjax(fireProtectionService.updateFireProtection(fireProtection));
    }

    /**
     * 删除消防系统
     */
    @RequiresPermissions("datasync:protection:remove")
    @Log(title = "消防系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fireProtectionService.deleteFireProtectionByIds(ids));
    }
}
