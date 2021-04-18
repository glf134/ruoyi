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
import com.ruoyi.datasync.domain.EntranceGuard;
import com.ruoyi.datasync.service.IEntranceGuardService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 门禁系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/guard")
public class EntranceGuardController extends BaseController
{
    private String prefix = "datasync/guard";

    @Autowired
    private IEntranceGuardService entranceGuardService;

    @RequiresPermissions("datasync:guard:view")
    @GetMapping()
    public String guard()
    {
        return prefix + "/guard";
    }

    /**
     * 查询门禁系统列表
     */
    @RequiresPermissions("datasync:guard:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EntranceGuard entranceGuard)
    {
        startPage();
        List<EntranceGuard> list = entranceGuardService.selectEntranceGuardList(entranceGuard);
        return getDataTable(list);
    }

    /**
     * 导出门禁系统列表
     */
    @RequiresPermissions("datasync:guard:export")
    @Log(title = "门禁系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EntranceGuard entranceGuard)
    {
        List<EntranceGuard> list = entranceGuardService.selectEntranceGuardList(entranceGuard);
        ExcelUtil<EntranceGuard> util = new ExcelUtil<EntranceGuard>(EntranceGuard.class);
        return util.exportExcel(list, "guard");
    }

    /**
     * 新增门禁系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存门禁系统
     */
    @RequiresPermissions("datasync:guard:add")
    @Log(title = "门禁系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EntranceGuard entranceGuard)
    {
        return toAjax(entranceGuardService.insertEntranceGuard(entranceGuard));
    }

    /**
     * 修改门禁系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        EntranceGuard entranceGuard = entranceGuardService.selectEntranceGuardById(id);
        mmap.put("entranceGuard", entranceGuard);
        return prefix + "/edit";
    }

    /**
     * 修改保存门禁系统
     */
    @RequiresPermissions("datasync:guard:edit")
    @Log(title = "门禁系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EntranceGuard entranceGuard)
    {
        return toAjax(entranceGuardService.updateEntranceGuard(entranceGuard));
    }

    /**
     * 删除门禁系统
     */
    @RequiresPermissions("datasync:guard:remove")
    @Log(title = "门禁系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(entranceGuardService.deleteEntranceGuardByIds(ids));
    }
}
