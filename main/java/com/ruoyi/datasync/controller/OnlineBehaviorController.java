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
import com.ruoyi.datasync.domain.OnlineBehavior;
import com.ruoyi.datasync.service.IOnlineBehaviorService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 上网行为管理设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/behavior")
public class OnlineBehaviorController extends BaseController
{
    private String prefix = "datasync/behavior";

    @Autowired
    private IOnlineBehaviorService onlineBehaviorService;

    @RequiresPermissions("datasync:behavior:view")
    @GetMapping()
    public String behavior()
    {
        return prefix + "/behavior";
    }

    /**
     * 查询上网行为管理设备列表
     */
    @RequiresPermissions("datasync:behavior:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OnlineBehavior onlineBehavior)
    {
        startPage();
        List<OnlineBehavior> list = onlineBehaviorService.selectOnlineBehaviorList(onlineBehavior);
        return getDataTable(list);
    }

    /**
     * 导出上网行为管理设备列表
     */
    @RequiresPermissions("datasync:behavior:export")
    @Log(title = "上网行为管理设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OnlineBehavior onlineBehavior)
    {
        List<OnlineBehavior> list = onlineBehaviorService.selectOnlineBehaviorList(onlineBehavior);
        ExcelUtil<OnlineBehavior> util = new ExcelUtil<OnlineBehavior>(OnlineBehavior.class);
        return util.exportExcel(list, "behavior");
    }

    /**
     * 新增上网行为管理设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存上网行为管理设备
     */
    @RequiresPermissions("datasync:behavior:add")
    @Log(title = "上网行为管理设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OnlineBehavior onlineBehavior)
    {
        return toAjax(onlineBehaviorService.insertOnlineBehavior(onlineBehavior));
    }

    /**
     * 修改上网行为管理设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        OnlineBehavior onlineBehavior = onlineBehaviorService.selectOnlineBehaviorById(id);
        mmap.put("onlineBehavior", onlineBehavior);
        return prefix + "/edit";
    }

    /**
     * 修改保存上网行为管理设备
     */
    @RequiresPermissions("datasync:behavior:edit")
    @Log(title = "上网行为管理设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OnlineBehavior onlineBehavior)
    {
        return toAjax(onlineBehaviorService.updateOnlineBehavior(onlineBehavior));
    }

    /**
     * 删除上网行为管理设备
     */
    @RequiresPermissions("datasync:behavior:remove")
    @Log(title = "上网行为管理设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(onlineBehaviorService.deleteOnlineBehaviorByIds(ids));
    }
}
