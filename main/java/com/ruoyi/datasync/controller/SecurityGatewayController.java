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
import com.ruoyi.datasync.domain.SecurityGateway;
import com.ruoyi.datasync.service.ISecurityGatewayService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 安全网关Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/gateway")
public class SecurityGatewayController extends BaseController
{
    private String prefix = "datasync/gateway";

    @Autowired
    private ISecurityGatewayService securityGatewayService;

    @RequiresPermissions("datasync:gateway:view")
    @GetMapping()
    public String gateway()
    {
        return prefix + "/gateway";
    }

    /**
     * 查询安全网关列表
     */
    @RequiresPermissions("datasync:gateway:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SecurityGateway securityGateway)
    {
        startPage();
        List<SecurityGateway> list = securityGatewayService.selectSecurityGatewayList(securityGateway);
        return getDataTable(list);
    }

    /**
     * 导出安全网关列表
     */
    @RequiresPermissions("datasync:gateway:export")
    @Log(title = "安全网关", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SecurityGateway securityGateway)
    {
        List<SecurityGateway> list = securityGatewayService.selectSecurityGatewayList(securityGateway);
        ExcelUtil<SecurityGateway> util = new ExcelUtil<SecurityGateway>(SecurityGateway.class);
        return util.exportExcel(list, "gateway");
    }

    /**
     * 新增安全网关
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存安全网关
     */
    @RequiresPermissions("datasync:gateway:add")
    @Log(title = "安全网关", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SecurityGateway securityGateway)
    {
        return toAjax(securityGatewayService.insertSecurityGateway(securityGateway));
    }

    /**
     * 修改安全网关
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SecurityGateway securityGateway = securityGatewayService.selectSecurityGatewayById(id);
        mmap.put("securityGateway", securityGateway);
        return prefix + "/edit";
    }

    /**
     * 修改保存安全网关
     */
    @RequiresPermissions("datasync:gateway:edit")
    @Log(title = "安全网关", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SecurityGateway securityGateway)
    {
        return toAjax(securityGatewayService.updateSecurityGateway(securityGateway));
    }

    /**
     * 删除安全网关
     */
    @RequiresPermissions("datasync:gateway:remove")
    @Log(title = "安全网关", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(securityGatewayService.deleteSecurityGatewayByIds(ids));
    }
}
