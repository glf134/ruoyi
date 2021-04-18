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
import com.ruoyi.datasync.domain.Vpn;
import com.ruoyi.datasync.service.IVpnService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 虚拟专用网设备（VPN）Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/vpn")
public class VpnController extends BaseController
{
    private String prefix = "datasync/vpn";

    @Autowired
    private IVpnService vpnService;

    @RequiresPermissions("datasync:vpn:view")
    @GetMapping()
    public String vpn()
    {
        return prefix + "/vpn";
    }

    /**
     * 查询虚拟专用网设备（VPN）列表
     */
    @RequiresPermissions("datasync:vpn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Vpn vpn)
    {
        startPage();
        List<Vpn> list = vpnService.selectVpnList(vpn);
        return getDataTable(list);
    }

    /**
     * 导出虚拟专用网设备（VPN）列表
     */
    @RequiresPermissions("datasync:vpn:export")
    @Log(title = "虚拟专用网设备（VPN）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Vpn vpn)
    {
        List<Vpn> list = vpnService.selectVpnList(vpn);
        ExcelUtil<Vpn> util = new ExcelUtil<Vpn>(Vpn.class);
        return util.exportExcel(list, "vpn");
    }

    /**
     * 新增虚拟专用网设备（VPN）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存虚拟专用网设备（VPN）
     */
    @RequiresPermissions("datasync:vpn:add")
    @Log(title = "虚拟专用网设备（VPN）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Vpn vpn)
    {
        return toAjax(vpnService.insertVpn(vpn));
    }

    /**
     * 修改虚拟专用网设备（VPN）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Vpn vpn = vpnService.selectVpnById(id);
        mmap.put("vpn", vpn);
        return prefix + "/edit";
    }

    /**
     * 修改保存虚拟专用网设备（VPN）
     */
    @RequiresPermissions("datasync:vpn:edit")
    @Log(title = "虚拟专用网设备（VPN）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Vpn vpn)
    {
        return toAjax(vpnService.updateVpn(vpn));
    }

    /**
     * 删除虚拟专用网设备（VPN）
     */
    @RequiresPermissions("datasync:vpn:remove")
    @Log(title = "虚拟专用网设备（VPN）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vpnService.deleteVpnByIds(ids));
    }
}
