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
import com.ruoyi.datasync.domain.Encryption;
import com.ruoyi.datasync.service.IEncryptionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 加密设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/encryption")
public class EncryptionController extends BaseController
{
    private String prefix = "datasync/encryption";

    @Autowired
    private IEncryptionService encryptionService;

    @RequiresPermissions("datasync:encryption:view")
    @GetMapping()
    public String encryption()
    {
        return prefix + "/encryption";
    }

    /**
     * 查询加密设备列表
     */
    @RequiresPermissions("datasync:encryption:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Encryption encryption)
    {
        startPage();
        List<Encryption> list = encryptionService.selectEncryptionList(encryption);
        return getDataTable(list);
    }

    /**
     * 导出加密设备列表
     */
    @RequiresPermissions("datasync:encryption:export")
    @Log(title = "加密设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Encryption encryption)
    {
        List<Encryption> list = encryptionService.selectEncryptionList(encryption);
        ExcelUtil<Encryption> util = new ExcelUtil<Encryption>(Encryption.class);
        return util.exportExcel(list, "encryption");
    }

    /**
     * 新增加密设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存加密设备
     */
    @RequiresPermissions("datasync:encryption:add")
    @Log(title = "加密设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Encryption encryption)
    {
        return toAjax(encryptionService.insertEncryption(encryption));
    }

    /**
     * 修改加密设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Encryption encryption = encryptionService.selectEncryptionById(id);
        mmap.put("encryption", encryption);
        return prefix + "/edit";
    }

    /**
     * 修改保存加密设备
     */
    @RequiresPermissions("datasync:encryption:edit")
    @Log(title = "加密设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Encryption encryption)
    {
        return toAjax(encryptionService.updateEncryption(encryption));
    }

    /**
     * 删除加密设备
     */
    @RequiresPermissions("datasync:encryption:remove")
    @Log(title = "加密设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(encryptionService.deleteEncryptionByIds(ids));
    }
}
