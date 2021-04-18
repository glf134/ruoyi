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
import com.ruoyi.datasync.domain.OpsAudit;
import com.ruoyi.datasync.service.IOpsAuditService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运维审计设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/audit")
public class OpsAuditController extends BaseController
{
    private String prefix = "datasync/audit";

    @Autowired
    private IOpsAuditService opsAuditService;

    @RequiresPermissions("datasync:audit:view")
    @GetMapping()
    public String audit()
    {
        return prefix + "/audit";
    }

    /**
     * 查询运维审计设备列表
     */
    @RequiresPermissions("datasync:audit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OpsAudit opsAudit)
    {
        startPage();
        List<OpsAudit> list = opsAuditService.selectOpsAuditList(opsAudit);
        return getDataTable(list);
    }

    /**
     * 导出运维审计设备列表
     */
    @RequiresPermissions("datasync:audit:export")
    @Log(title = "运维审计设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OpsAudit opsAudit)
    {
        List<OpsAudit> list = opsAuditService.selectOpsAuditList(opsAudit);
        ExcelUtil<OpsAudit> util = new ExcelUtil<OpsAudit>(OpsAudit.class);
        return util.exportExcel(list, "audit");
    }

    /**
     * 新增运维审计设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存运维审计设备
     */
    @RequiresPermissions("datasync:audit:add")
    @Log(title = "运维审计设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OpsAudit opsAudit)
    {
        return toAjax(opsAuditService.insertOpsAudit(opsAudit));
    }

    /**
     * 修改运维审计设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        OpsAudit opsAudit = opsAuditService.selectOpsAuditById(id);
        mmap.put("opsAudit", opsAudit);
        return prefix + "/edit";
    }

    /**
     * 修改保存运维审计设备
     */
    @RequiresPermissions("datasync:audit:edit")
    @Log(title = "运维审计设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OpsAudit opsAudit)
    {
        return toAjax(opsAuditService.updateOpsAudit(opsAudit));
    }

    /**
     * 删除运维审计设备
     */
    @RequiresPermissions("datasync:audit:remove")
    @Log(title = "运维审计设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(opsAuditService.deleteOpsAuditByIds(ids));
    }
}
