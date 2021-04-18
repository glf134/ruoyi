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
import com.ruoyi.datasync.domain.AccessControl;
import com.ruoyi.datasync.service.IAccessControlService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 准入控制设备数据元Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/control")
public class AccessControlController extends BaseController
{
    private String prefix = "datasync/control";

    @Autowired
    private IAccessControlService accessControlService;

    @RequiresPermissions("datasync:control:view")
    @GetMapping()
    public String control()
    {
        return prefix + "/control";
    }

    /**
     * 查询准入控制设备数据元列表
     */
    @RequiresPermissions("datasync:control:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AccessControl accessControl)
    {
        startPage();
        List<AccessControl> list = accessControlService.selectAccessControlList(accessControl);
        return getDataTable(list);
    }

    /**
     * 导出准入控制设备数据元列表
     */
    @RequiresPermissions("datasync:control:export")
    @Log(title = "准入控制设备数据元", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AccessControl accessControl)
    {
        List<AccessControl> list = accessControlService.selectAccessControlList(accessControl);
        ExcelUtil<AccessControl> util = new ExcelUtil<AccessControl>(AccessControl.class);
        return util.exportExcel(list, "control");
    }

    /**
     * 新增准入控制设备数据元
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存准入控制设备数据元
     */
    @RequiresPermissions("datasync:control:add")
    @Log(title = "准入控制设备数据元", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AccessControl accessControl)
    {
        return toAjax(accessControlService.insertAccessControl(accessControl));
    }

    /**
     * 修改准入控制设备数据元
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        AccessControl accessControl = accessControlService.selectAccessControlById(id);
        mmap.put("accessControl", accessControl);
        return prefix + "/edit";
    }

    /**
     * 修改保存准入控制设备数据元
     */
    @RequiresPermissions("datasync:control:edit")
    @Log(title = "准入控制设备数据元", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AccessControl accessControl)
    {
        return toAjax(accessControlService.updateAccessControl(accessControl));
    }

    /**
     * 删除准入控制设备数据元
     */
    @RequiresPermissions("datasync:control:remove")
    @Log(title = "准入控制设备数据元", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(accessControlService.deleteAccessControlByIds(ids));
    }
}
