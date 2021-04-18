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
import com.ruoyi.datasync.domain.HoleScanner;
import com.ruoyi.datasync.service.IHoleScannerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 漏洞扫描设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/scanner")
public class HoleScannerController extends BaseController
{
    private String prefix = "datasync/scanner";

    @Autowired
    private IHoleScannerService holeScannerService;

    @RequiresPermissions("datasync:scanner:view")
    @GetMapping()
    public String scanner()
    {
        return prefix + "/scanner";
    }

    /**
     * 查询漏洞扫描设备列表
     */
    @RequiresPermissions("datasync:scanner:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HoleScanner holeScanner)
    {
        startPage();
        List<HoleScanner> list = holeScannerService.selectHoleScannerList(holeScanner);
        return getDataTable(list);
    }

    /**
     * 导出漏洞扫描设备列表
     */
    @RequiresPermissions("datasync:scanner:export")
    @Log(title = "漏洞扫描设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HoleScanner holeScanner)
    {
        List<HoleScanner> list = holeScannerService.selectHoleScannerList(holeScanner);
        ExcelUtil<HoleScanner> util = new ExcelUtil<HoleScanner>(HoleScanner.class);
        return util.exportExcel(list, "scanner");
    }

    /**
     * 新增漏洞扫描设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存漏洞扫描设备
     */
    @RequiresPermissions("datasync:scanner:add")
    @Log(title = "漏洞扫描设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HoleScanner holeScanner)
    {
        return toAjax(holeScannerService.insertHoleScanner(holeScanner));
    }

    /**
     * 修改漏洞扫描设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        HoleScanner holeScanner = holeScannerService.selectHoleScannerById(id);
        mmap.put("holeScanner", holeScanner);
        return prefix + "/edit";
    }

    /**
     * 修改保存漏洞扫描设备
     */
    @RequiresPermissions("datasync:scanner:edit")
    @Log(title = "漏洞扫描设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HoleScanner holeScanner)
    {
        return toAjax(holeScannerService.updateHoleScanner(holeScanner));
    }

    /**
     * 删除漏洞扫描设备
     */
    @RequiresPermissions("datasync:scanner:remove")
    @Log(title = "漏洞扫描设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(holeScannerService.deleteHoleScannerByIds(ids));
    }
}
