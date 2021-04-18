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
import com.ruoyi.datasync.domain.DatabaseDesensitization;
import com.ruoyi.datasync.service.IDatabaseDesensitizationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据库脱敏Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/desensitization")
public class DatabaseDesensitizationController extends BaseController
{
    private String prefix = "datasync/desensitization";

    @Autowired
    private IDatabaseDesensitizationService databaseDesensitizationService;

    @RequiresPermissions("datasync:desensitization:view")
    @GetMapping()
    public String desensitization()
    {
        return prefix + "/desensitization";
    }

    /**
     * 查询数据库脱敏列表
     */
    @RequiresPermissions("datasync:desensitization:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DatabaseDesensitization databaseDesensitization)
    {
        startPage();
        List<DatabaseDesensitization> list = databaseDesensitizationService.selectDatabaseDesensitizationList(databaseDesensitization);
        return getDataTable(list);
    }

    /**
     * 导出数据库脱敏列表
     */
    @RequiresPermissions("datasync:desensitization:export")
    @Log(title = "数据库脱敏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DatabaseDesensitization databaseDesensitization)
    {
        List<DatabaseDesensitization> list = databaseDesensitizationService.selectDatabaseDesensitizationList(databaseDesensitization);
        ExcelUtil<DatabaseDesensitization> util = new ExcelUtil<DatabaseDesensitization>(DatabaseDesensitization.class);
        return util.exportExcel(list, "desensitization");
    }

    /**
     * 新增数据库脱敏
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存数据库脱敏
     */
    @RequiresPermissions("datasync:desensitization:add")
    @Log(title = "数据库脱敏", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DatabaseDesensitization databaseDesensitization)
    {
        return toAjax(databaseDesensitizationService.insertDatabaseDesensitization(databaseDesensitization));
    }

    /**
     * 修改数据库脱敏
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DatabaseDesensitization databaseDesensitization = databaseDesensitizationService.selectDatabaseDesensitizationById(id);
        mmap.put("databaseDesensitization", databaseDesensitization);
        return prefix + "/edit";
    }

    /**
     * 修改保存数据库脱敏
     */
    @RequiresPermissions("datasync:desensitization:edit")
    @Log(title = "数据库脱敏", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DatabaseDesensitization databaseDesensitization)
    {
        return toAjax(databaseDesensitizationService.updateDatabaseDesensitization(databaseDesensitization));
    }

    /**
     * 删除数据库脱敏
     */
    @RequiresPermissions("datasync:desensitization:remove")
    @Log(title = "数据库脱敏", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(databaseDesensitizationService.deleteDatabaseDesensitizationByIds(ids));
    }
}
