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
import com.ruoyi.datasync.domain.IntrusionAlarm;
import com.ruoyi.datasync.service.IIntrusionAlarmService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 入侵报警系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/alarm")
public class IntrusionAlarmController extends BaseController
{
    private String prefix = "datasync/alarm";

    @Autowired
    private IIntrusionAlarmService intrusionAlarmService;

    @RequiresPermissions("datasync:alarm:view")
    @GetMapping()
    public String alarm()
    {
        return prefix + "/alarm";
    }

    /**
     * 查询入侵报警系统列表
     */
    @RequiresPermissions("datasync:alarm:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(IntrusionAlarm intrusionAlarm)
    {
        startPage();
        List<IntrusionAlarm> list = intrusionAlarmService.selectIntrusionAlarmList(intrusionAlarm);
        return getDataTable(list);
    }

    /**
     * 导出入侵报警系统列表
     */
    @RequiresPermissions("datasync:alarm:export")
    @Log(title = "入侵报警系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IntrusionAlarm intrusionAlarm)
    {
        List<IntrusionAlarm> list = intrusionAlarmService.selectIntrusionAlarmList(intrusionAlarm);
        ExcelUtil<IntrusionAlarm> util = new ExcelUtil<IntrusionAlarm>(IntrusionAlarm.class);
        return util.exportExcel(list, "alarm");
    }

    /**
     * 新增入侵报警系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存入侵报警系统
     */
    @RequiresPermissions("datasync:alarm:add")
    @Log(title = "入侵报警系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(IntrusionAlarm intrusionAlarm)
    {
        return toAjax(intrusionAlarmService.insertIntrusionAlarm(intrusionAlarm));
    }

    /**
     * 修改入侵报警系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        IntrusionAlarm intrusionAlarm = intrusionAlarmService.selectIntrusionAlarmById(id);
        mmap.put("intrusionAlarm", intrusionAlarm);
        return prefix + "/edit";
    }

    /**
     * 修改保存入侵报警系统
     */
    @RequiresPermissions("datasync:alarm:edit")
    @Log(title = "入侵报警系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(IntrusionAlarm intrusionAlarm)
    {
        return toAjax(intrusionAlarmService.updateIntrusionAlarm(intrusionAlarm));
    }

    /**
     * 删除入侵报警系统
     */
    @RequiresPermissions("datasync:alarm:remove")
    @Log(title = "入侵报警系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(intrusionAlarmService.deleteIntrusionAlarmByIds(ids));
    }
}
