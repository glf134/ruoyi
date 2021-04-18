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
import com.ruoyi.datasync.domain.Firewall;
import com.ruoyi.datasync.service.IFirewallService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 防火墙Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/firewall")
public class FirewallController extends BaseController
{
    private String prefix = "datasync/firewall";

    @Autowired
    private IFirewallService firewallService;

    @RequiresPermissions("datasync:firewall:view")
    @GetMapping()
    public String firewall()
    {
        return prefix + "/firewall";
    }

    /**
     * 查询防火墙列表
     */
    @RequiresPermissions("datasync:firewall:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Firewall firewall)
    {
        startPage();
        List<Firewall> list = firewallService.selectFirewallList(firewall);
        return getDataTable(list);
    }

    /**
     * 导出防火墙列表
     */
    @RequiresPermissions("datasync:firewall:export")
    @Log(title = "防火墙", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Firewall firewall)
    {
        List<Firewall> list = firewallService.selectFirewallList(firewall);
        ExcelUtil<Firewall> util = new ExcelUtil<Firewall>(Firewall.class);
        return util.exportExcel(list, "firewall");
    }

    /**
     * 新增防火墙
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存防火墙
     */
    @RequiresPermissions("datasync:firewall:add")
    @Log(title = "防火墙", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Firewall firewall)
    {
        return toAjax(firewallService.insertFirewall(firewall));
    }

    /**
     * 修改防火墙
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Firewall firewall = firewallService.selectFirewallById(id);
        mmap.put("firewall", firewall);
        return prefix + "/edit";
    }

    /**
     * 修改保存防火墙
     */
    @RequiresPermissions("datasync:firewall:edit")
    @Log(title = "防火墙", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Firewall firewall)
    {
        return toAjax(firewallService.updateFirewall(firewall));
    }

    /**
     * 删除防火墙
     */
    @RequiresPermissions("datasync:firewall:remove")
    @Log(title = "防火墙", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(firewallService.deleteFirewallByIds(ids));
    }
}
