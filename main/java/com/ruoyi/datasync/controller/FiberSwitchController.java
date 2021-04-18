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
import com.ruoyi.datasync.domain.FiberSwitch;
import com.ruoyi.datasync.service.IFiberSwitchService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 光纤交换机Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/switch")
public class FiberSwitchController extends BaseController
{
    private String prefix = "datasync/switch";

    @Autowired
    private IFiberSwitchService fiberSwitchService;

    @RequiresPermissions("datasync:switch:view")
    @GetMapping()
    public String switch()
    {
        return prefix + "/switch";
    }

    /**
     * 查询光纤交换机列表
     */
    @RequiresPermissions("datasync:switch:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FiberSwitch fiberSwitch)
    {
        startPage();
        List<FiberSwitch> list = fiberSwitchService.selectFiberSwitchList(fiberSwitch);
        return getDataTable(list);
    }

    /**
     * 导出光纤交换机列表
     */
    @RequiresPermissions("datasync:switch:export")
    @Log(title = "光纤交换机", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FiberSwitch fiberSwitch)
    {
        List<FiberSwitch> list = fiberSwitchService.selectFiberSwitchList(fiberSwitch);
        ExcelUtil<FiberSwitch> util = new ExcelUtil<FiberSwitch>(FiberSwitch.class);
        return util.exportExcel(list, "switch");
    }

    /**
     * 新增光纤交换机
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存光纤交换机
     */
    @RequiresPermissions("datasync:switch:add")
    @Log(title = "光纤交换机", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FiberSwitch fiberSwitch)
    {
        return toAjax(fiberSwitchService.insertFiberSwitch(fiberSwitch));
    }

    /**
     * 修改光纤交换机
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FiberSwitch fiberSwitch = fiberSwitchService.selectFiberSwitchById(id);
        mmap.put("fiberSwitch", fiberSwitch);
        return prefix + "/edit";
    }

    /**
     * 修改保存光纤交换机
     */
    @RequiresPermissions("datasync:switch:edit")
    @Log(title = "光纤交换机", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FiberSwitch fiberSwitch)
    {
        return toAjax(fiberSwitchService.updateFiberSwitch(fiberSwitch));
    }

    /**
     * 删除光纤交换机
     */
    @RequiresPermissions("datasync:switch:remove")
    @Log(title = "光纤交换机", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fiberSwitchService.deleteFiberSwitchByIds(ids));
    }
}
