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
import com.ruoyi.datasync.domain.Switches;
import com.ruoyi.datasync.service.ISwitchesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交换机Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/switches")
public class SwitchesController extends BaseController
{
    private String prefix = "datasync/switches";

    @Autowired
    private ISwitchesService switchesService;

    @RequiresPermissions("datasync:switches:view")
    @GetMapping()
    public String switches()
    {
        return prefix + "/switches";
    }

    /**
     * 查询交换机列表
     */
    @RequiresPermissions("datasync:switches:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Switches switches)
    {
        startPage();
        List<Switches> list = switchesService.selectSwitchesList(switches);
        return getDataTable(list);
    }

    /**
     * 导出交换机列表
     */
    @RequiresPermissions("datasync:switches:export")
    @Log(title = "交换机", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Switches switches)
    {
        List<Switches> list = switchesService.selectSwitchesList(switches);
        ExcelUtil<Switches> util = new ExcelUtil<Switches>(Switches.class);
        return util.exportExcel(list, "switches");
    }

    /**
     * 新增交换机
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存交换机
     */
    @RequiresPermissions("datasync:switches:add")
    @Log(title = "交换机", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Switches switches)
    {
        return toAjax(switchesService.insertSwitches(switches));
    }

    /**
     * 修改交换机
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Switches switches = switchesService.selectSwitchesById(id);
        mmap.put("switches", switches);
        return prefix + "/edit";
    }

    /**
     * 修改保存交换机
     */
    @RequiresPermissions("datasync:switches:edit")
    @Log(title = "交换机", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Switches switches)
    {
        return toAjax(switchesService.updateSwitches(switches));
    }

    /**
     * 删除交换机
     */
    @RequiresPermissions("datasync:switches:remove")
    @Log(title = "交换机", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(switchesService.deleteSwitchesByIds(ids));
    }
}
