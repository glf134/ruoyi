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
import com.ruoyi.datasync.domain.Wdm;
import com.ruoyi.datasync.service.IWdmService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 波分复用设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/wdm")
public class WdmController extends BaseController
{
    private String prefix = "datasync/wdm";

    @Autowired
    private IWdmService wdmService;

    @RequiresPermissions("datasync:wdm:view")
    @GetMapping()
    public String wdm()
    {
        return prefix + "/wdm";
    }

    /**
     * 查询波分复用设备列表
     */
    @RequiresPermissions("datasync:wdm:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Wdm wdm)
    {
        startPage();
        List<Wdm> list = wdmService.selectWdmList(wdm);
        return getDataTable(list);
    }

    /**
     * 导出波分复用设备列表
     */
    @RequiresPermissions("datasync:wdm:export")
    @Log(title = "波分复用设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Wdm wdm)
    {
        List<Wdm> list = wdmService.selectWdmList(wdm);
        ExcelUtil<Wdm> util = new ExcelUtil<Wdm>(Wdm.class);
        return util.exportExcel(list, "wdm");
    }

    /**
     * 新增波分复用设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存波分复用设备
     */
    @RequiresPermissions("datasync:wdm:add")
    @Log(title = "波分复用设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Wdm wdm)
    {
        return toAjax(wdmService.insertWdm(wdm));
    }

    /**
     * 修改波分复用设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Wdm wdm = wdmService.selectWdmById(id);
        mmap.put("wdm", wdm);
        return prefix + "/edit";
    }

    /**
     * 修改保存波分复用设备
     */
    @RequiresPermissions("datasync:wdm:edit")
    @Log(title = "波分复用设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Wdm wdm)
    {
        return toAjax(wdmService.updateWdm(wdm));
    }

    /**
     * 删除波分复用设备
     */
    @RequiresPermissions("datasync:wdm:remove")
    @Log(title = "波分复用设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wdmService.deleteWdmByIds(ids));
    }
}
