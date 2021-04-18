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
import com.ruoyi.datasync.domain.SafetyPlatform;
import com.ruoyi.datasync.service.ISafetyPlatformService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 安全管理平台Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/platform")
public class SafetyPlatformController extends BaseController
{
    private String prefix = "datasync/platform";

    @Autowired
    private ISafetyPlatformService safetyPlatformService;

    @RequiresPermissions("datasync:platform:view")
    @GetMapping()
    public String platform()
    {
        return prefix + "/platform";
    }

    /**
     * 查询安全管理平台列表
     */
    @RequiresPermissions("datasync:platform:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SafetyPlatform safetyPlatform)
    {
        startPage();
        List<SafetyPlatform> list = safetyPlatformService.selectSafetyPlatformList(safetyPlatform);
        return getDataTable(list);
    }

    /**
     * 导出安全管理平台列表
     */
    @RequiresPermissions("datasync:platform:export")
    @Log(title = "安全管理平台", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SafetyPlatform safetyPlatform)
    {
        List<SafetyPlatform> list = safetyPlatformService.selectSafetyPlatformList(safetyPlatform);
        ExcelUtil<SafetyPlatform> util = new ExcelUtil<SafetyPlatform>(SafetyPlatform.class);
        return util.exportExcel(list, "platform");
    }

    /**
     * 新增安全管理平台
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存安全管理平台
     */
    @RequiresPermissions("datasync:platform:add")
    @Log(title = "安全管理平台", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SafetyPlatform safetyPlatform)
    {
        return toAjax(safetyPlatformService.insertSafetyPlatform(safetyPlatform));
    }

    /**
     * 修改安全管理平台
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SafetyPlatform safetyPlatform = safetyPlatformService.selectSafetyPlatformById(id);
        mmap.put("safetyPlatform", safetyPlatform);
        return prefix + "/edit";
    }

    /**
     * 修改保存安全管理平台
     */
    @RequiresPermissions("datasync:platform:edit")
    @Log(title = "安全管理平台", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SafetyPlatform safetyPlatform)
    {
        return toAjax(safetyPlatformService.updateSafetyPlatform(safetyPlatform));
    }

    /**
     * 删除安全管理平台
     */
    @RequiresPermissions("datasync:platform:remove")
    @Log(title = "安全管理平台", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(safetyPlatformService.deleteSafetyPlatformByIds(ids));
    }
}
