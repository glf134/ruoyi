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
import com.ruoyi.datasync.domain.GateControl;
import com.ruoyi.datasync.service.IGateControlService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出入口控制系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/control")
public class GateControlController extends BaseController
{
    private String prefix = "datasync/control";

    @Autowired
    private IGateControlService gateControlService;

    @RequiresPermissions("datasync:control:view")
    @GetMapping()
    public String control()
    {
        return prefix + "/control";
    }

    /**
     * 查询出入口控制系统列表
     */
    @RequiresPermissions("datasync:control:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GateControl gateControl)
    {
        startPage();
        List<GateControl> list = gateControlService.selectGateControlList(gateControl);
        return getDataTable(list);
    }

    /**
     * 导出出入口控制系统列表
     */
    @RequiresPermissions("datasync:control:export")
    @Log(title = "出入口控制系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GateControl gateControl)
    {
        List<GateControl> list = gateControlService.selectGateControlList(gateControl);
        ExcelUtil<GateControl> util = new ExcelUtil<GateControl>(GateControl.class);
        return util.exportExcel(list, "control");
    }

    /**
     * 新增出入口控制系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出入口控制系统
     */
    @RequiresPermissions("datasync:control:add")
    @Log(title = "出入口控制系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GateControl gateControl)
    {
        return toAjax(gateControlService.insertGateControl(gateControl));
    }

    /**
     * 修改出入口控制系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GateControl gateControl = gateControlService.selectGateControlById(id);
        mmap.put("gateControl", gateControl);
        return prefix + "/edit";
    }

    /**
     * 修改保存出入口控制系统
     */
    @RequiresPermissions("datasync:control:edit")
    @Log(title = "出入口控制系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GateControl gateControl)
    {
        return toAjax(gateControlService.updateGateControl(gateControl));
    }

    /**
     * 删除出入口控制系统
     */
    @RequiresPermissions("datasync:control:remove")
    @Log(title = "出入口控制系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gateControlService.deleteGateControlByIds(ids));
    }
}
