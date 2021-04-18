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
import com.ruoyi.datasync.domain.DigitalSignature;
import com.ruoyi.datasync.service.IDigitalSignatureService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数字签名设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/signature")
public class DigitalSignatureController extends BaseController
{
    private String prefix = "datasync/signature";

    @Autowired
    private IDigitalSignatureService digitalSignatureService;

    @RequiresPermissions("datasync:signature:view")
    @GetMapping()
    public String signature()
    {
        return prefix + "/signature";
    }

    /**
     * 查询数字签名设备列表
     */
    @RequiresPermissions("datasync:signature:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DigitalSignature digitalSignature)
    {
        startPage();
        List<DigitalSignature> list = digitalSignatureService.selectDigitalSignatureList(digitalSignature);
        return getDataTable(list);
    }

    /**
     * 导出数字签名设备列表
     */
    @RequiresPermissions("datasync:signature:export")
    @Log(title = "数字签名设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DigitalSignature digitalSignature)
    {
        List<DigitalSignature> list = digitalSignatureService.selectDigitalSignatureList(digitalSignature);
        ExcelUtil<DigitalSignature> util = new ExcelUtil<DigitalSignature>(DigitalSignature.class);
        return util.exportExcel(list, "signature");
    }

    /**
     * 新增数字签名设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存数字签名设备
     */
    @RequiresPermissions("datasync:signature:add")
    @Log(title = "数字签名设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DigitalSignature digitalSignature)
    {
        return toAjax(digitalSignatureService.insertDigitalSignature(digitalSignature));
    }

    /**
     * 修改数字签名设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DigitalSignature digitalSignature = digitalSignatureService.selectDigitalSignatureById(id);
        mmap.put("digitalSignature", digitalSignature);
        return prefix + "/edit";
    }

    /**
     * 修改保存数字签名设备
     */
    @RequiresPermissions("datasync:signature:edit")
    @Log(title = "数字签名设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DigitalSignature digitalSignature)
    {
        return toAjax(digitalSignatureService.updateDigitalSignature(digitalSignature));
    }

    /**
     * 删除数字签名设备
     */
    @RequiresPermissions("datasync:signature:remove")
    @Log(title = "数字签名设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(digitalSignatureService.deleteDigitalSignatureByIds(ids));
    }
}
