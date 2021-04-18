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
import com.ruoyi.datasync.domain.VirtualMachine;
import com.ruoyi.datasync.service.IVirtualMachineService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 虚拟机资源Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/machine")
public class VirtualMachineController extends BaseController
{
    private String prefix = "datasync/machine";

    @Autowired
    private IVirtualMachineService virtualMachineService;

    @RequiresPermissions("datasync:machine:view")
    @GetMapping()
    public String machine()
    {
        return prefix + "/machine";
    }

    /**
     * 查询虚拟机资源列表
     */
    @RequiresPermissions("datasync:machine:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(VirtualMachine virtualMachine)
    {
        startPage();
        List<VirtualMachine> list = virtualMachineService.selectVirtualMachineList(virtualMachine);
        return getDataTable(list);
    }

    /**
     * 导出虚拟机资源列表
     */
    @RequiresPermissions("datasync:machine:export")
    @Log(title = "虚拟机资源", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(VirtualMachine virtualMachine)
    {
        List<VirtualMachine> list = virtualMachineService.selectVirtualMachineList(virtualMachine);
        ExcelUtil<VirtualMachine> util = new ExcelUtil<VirtualMachine>(VirtualMachine.class);
        return util.exportExcel(list, "machine");
    }

    /**
     * 新增虚拟机资源
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存虚拟机资源
     */
    @RequiresPermissions("datasync:machine:add")
    @Log(title = "虚拟机资源", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(VirtualMachine virtualMachine)
    {
        return toAjax(virtualMachineService.insertVirtualMachine(virtualMachine));
    }

    /**
     * 修改虚拟机资源
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        VirtualMachine virtualMachine = virtualMachineService.selectVirtualMachineById(id);
        mmap.put("virtualMachine", virtualMachine);
        return prefix + "/edit";
    }

    /**
     * 修改保存虚拟机资源
     */
    @RequiresPermissions("datasync:machine:edit")
    @Log(title = "虚拟机资源", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(VirtualMachine virtualMachine)
    {
        return toAjax(virtualMachineService.updateVirtualMachine(virtualMachine));
    }

    /**
     * 删除虚拟机资源
     */
    @RequiresPermissions("datasync:machine:remove")
    @Log(title = "虚拟机资源", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(virtualMachineService.deleteVirtualMachineByIds(ids));
    }
}
