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
import com.ruoyi.datasync.domain.Uninterrupted;
import com.ruoyi.datasync.service.IUninterruptedService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 不间断配电Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/uninterrupted")
public class UninterruptedController extends BaseController
{
    private String prefix = "datasync/uninterrupted";

    @Autowired
    private IUninterruptedService uninterruptedService;

    @RequiresPermissions("datasync:uninterrupted:view")
    @GetMapping()
    public String uninterrupted()
    {
        return prefix + "/uninterrupted";
    }

    /**
     * 查询不间断配电列表
     */
    @RequiresPermissions("datasync:uninterrupted:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Uninterrupted uninterrupted)
    {
        startPage();
        List<Uninterrupted> list = uninterruptedService.selectUninterruptedList(uninterrupted);
        return getDataTable(list);
    }

    /**
     * 导出不间断配电列表
     */
    @RequiresPermissions("datasync:uninterrupted:export")
    @Log(title = "不间断配电", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Uninterrupted uninterrupted)
    {
        List<Uninterrupted> list = uninterruptedService.selectUninterruptedList(uninterrupted);
        ExcelUtil<Uninterrupted> util = new ExcelUtil<Uninterrupted>(Uninterrupted.class);
        return util.exportExcel(list, "uninterrupted");
    }

    /**
     * 新增不间断配电
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存不间断配电
     */
    @RequiresPermissions("datasync:uninterrupted:add")
    @Log(title = "不间断配电", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Uninterrupted uninterrupted)
    {
        return toAjax(uninterruptedService.insertUninterrupted(uninterrupted));
    }

    /**
     * 修改不间断配电
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Uninterrupted uninterrupted = uninterruptedService.selectUninterruptedById(id);
        mmap.put("uninterrupted", uninterrupted);
        return prefix + "/edit";
    }

    /**
     * 修改保存不间断配电
     */
    @RequiresPermissions("datasync:uninterrupted:edit")
    @Log(title = "不间断配电", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Uninterrupted uninterrupted)
    {
        return toAjax(uninterruptedService.updateUninterrupted(uninterrupted));
    }

    /**
     * 删除不间断配电
     */
    @RequiresPermissions("datasync:uninterrupted:remove")
    @Log(title = "不间断配电", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(uninterruptedService.deleteUninterruptedByIds(ids));
    }
}
