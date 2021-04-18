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
import com.ruoyi.datasync.domain.TapeLibrary;
import com.ruoyi.datasync.service.ITapeLibraryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 磁带库Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/library")
public class TapeLibraryController extends BaseController
{
    private String prefix = "datasync/library";

    @Autowired
    private ITapeLibraryService tapeLibraryService;

    @RequiresPermissions("datasync:library:view")
    @GetMapping()
    public String library()
    {
        return prefix + "/library";
    }

    /**
     * 查询磁带库列表
     */
    @RequiresPermissions("datasync:library:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TapeLibrary tapeLibrary)
    {
        startPage();
        List<TapeLibrary> list = tapeLibraryService.selectTapeLibraryList(tapeLibrary);
        return getDataTable(list);
    }

    /**
     * 导出磁带库列表
     */
    @RequiresPermissions("datasync:library:export")
    @Log(title = "磁带库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TapeLibrary tapeLibrary)
    {
        List<TapeLibrary> list = tapeLibraryService.selectTapeLibraryList(tapeLibrary);
        ExcelUtil<TapeLibrary> util = new ExcelUtil<TapeLibrary>(TapeLibrary.class);
        return util.exportExcel(list, "library");
    }

    /**
     * 新增磁带库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存磁带库
     */
    @RequiresPermissions("datasync:library:add")
    @Log(title = "磁带库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TapeLibrary tapeLibrary)
    {
        return toAjax(tapeLibraryService.insertTapeLibrary(tapeLibrary));
    }

    /**
     * 修改磁带库
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TapeLibrary tapeLibrary = tapeLibraryService.selectTapeLibraryById(id);
        mmap.put("tapeLibrary", tapeLibrary);
        return prefix + "/edit";
    }

    /**
     * 修改保存磁带库
     */
    @RequiresPermissions("datasync:library:edit")
    @Log(title = "磁带库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TapeLibrary tapeLibrary)
    {
        return toAjax(tapeLibraryService.updateTapeLibrary(tapeLibrary));
    }

    /**
     * 删除磁带库
     */
    @RequiresPermissions("datasync:library:remove")
    @Log(title = "磁带库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tapeLibraryService.deleteTapeLibraryByIds(ids));
    }
}
