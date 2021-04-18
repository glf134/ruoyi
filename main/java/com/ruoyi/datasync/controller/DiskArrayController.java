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
import com.ruoyi.datasync.domain.DiskArray;
import com.ruoyi.datasync.service.IDiskArrayService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 磁盘阵列Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/array")
public class DiskArrayController extends BaseController
{
    private String prefix = "datasync/array";

    @Autowired
    private IDiskArrayService diskArrayService;

    @RequiresPermissions("datasync:array:view")
    @GetMapping()
    public String array()
    {
        return prefix + "/array";
    }

    /**
     * 查询磁盘阵列列表
     */
    @RequiresPermissions("datasync:array:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiskArray diskArray)
    {
        startPage();
        List<DiskArray> list = diskArrayService.selectDiskArrayList(diskArray);
        return getDataTable(list);
    }

    /**
     * 导出磁盘阵列列表
     */
    @RequiresPermissions("datasync:array:export")
    @Log(title = "磁盘阵列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiskArray diskArray)
    {
        List<DiskArray> list = diskArrayService.selectDiskArrayList(diskArray);
        ExcelUtil<DiskArray> util = new ExcelUtil<DiskArray>(DiskArray.class);
        return util.exportExcel(list, "array");
    }

    /**
     * 新增磁盘阵列
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存磁盘阵列
     */
    @RequiresPermissions("datasync:array:add")
    @Log(title = "磁盘阵列", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiskArray diskArray)
    {
        return toAjax(diskArrayService.insertDiskArray(diskArray));
    }

    /**
     * 修改磁盘阵列
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiskArray diskArray = diskArrayService.selectDiskArrayById(id);
        mmap.put("diskArray", diskArray);
        return prefix + "/edit";
    }

    /**
     * 修改保存磁盘阵列
     */
    @RequiresPermissions("datasync:array:edit")
    @Log(title = "磁盘阵列", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiskArray diskArray)
    {
        return toAjax(diskArrayService.updateDiskArray(diskArray));
    }

    /**
     * 删除磁盘阵列
     */
    @RequiresPermissions("datasync:array:remove")
    @Log(title = "磁盘阵列", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diskArrayService.deleteDiskArrayByIds(ids));
    }
}
