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
import com.ruoyi.datasync.domain.LoadBalancing;
import com.ruoyi.datasync.service.ILoadBalancingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 负载均衡设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/balancing")
public class LoadBalancingController extends BaseController
{
    private String prefix = "datasync/balancing";

    @Autowired
    private ILoadBalancingService loadBalancingService;

    @RequiresPermissions("datasync:balancing:view")
    @GetMapping()
    public String balancing()
    {
        return prefix + "/balancing";
    }

    /**
     * 查询负载均衡设备列表
     */
    @RequiresPermissions("datasync:balancing:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoadBalancing loadBalancing)
    {
        startPage();
        List<LoadBalancing> list = loadBalancingService.selectLoadBalancingList(loadBalancing);
        return getDataTable(list);
    }

    /**
     * 导出负载均衡设备列表
     */
    @RequiresPermissions("datasync:balancing:export")
    @Log(title = "负载均衡设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoadBalancing loadBalancing)
    {
        List<LoadBalancing> list = loadBalancingService.selectLoadBalancingList(loadBalancing);
        ExcelUtil<LoadBalancing> util = new ExcelUtil<LoadBalancing>(LoadBalancing.class);
        return util.exportExcel(list, "balancing");
    }

    /**
     * 新增负载均衡设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存负载均衡设备
     */
    @RequiresPermissions("datasync:balancing:add")
    @Log(title = "负载均衡设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoadBalancing loadBalancing)
    {
        return toAjax(loadBalancingService.insertLoadBalancing(loadBalancing));
    }

    /**
     * 修改负载均衡设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LoadBalancing loadBalancing = loadBalancingService.selectLoadBalancingById(id);
        mmap.put("loadBalancing", loadBalancing);
        return prefix + "/edit";
    }

    /**
     * 修改保存负载均衡设备
     */
    @RequiresPermissions("datasync:balancing:edit")
    @Log(title = "负载均衡设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoadBalancing loadBalancing)
    {
        return toAjax(loadBalancingService.updateLoadBalancing(loadBalancing));
    }

    /**
     * 删除负载均衡设备
     */
    @RequiresPermissions("datasync:balancing:remove")
    @Log(title = "负载均衡设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(loadBalancingService.deleteLoadBalancingByIds(ids));
    }
}
