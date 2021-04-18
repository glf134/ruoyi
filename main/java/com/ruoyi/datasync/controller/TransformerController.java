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
import com.ruoyi.datasync.domain.Transformer;
import com.ruoyi.datasync.service.ITransformerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 变压器设备Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/transformer")
public class TransformerController extends BaseController
{
    private String prefix = "datasync/transformer";

    @Autowired
    private ITransformerService transformerService;

    @RequiresPermissions("datasync:transformer:view")
    @GetMapping()
    public String transformer()
    {
        return prefix + "/transformer";
    }

    /**
     * 查询变压器设备列表
     */
    @RequiresPermissions("datasync:transformer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Transformer transformer)
    {
        startPage();
        List<Transformer> list = transformerService.selectTransformerList(transformer);
        return getDataTable(list);
    }

    /**
     * 导出变压器设备列表
     */
    @RequiresPermissions("datasync:transformer:export")
    @Log(title = "变压器设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Transformer transformer)
    {
        List<Transformer> list = transformerService.selectTransformerList(transformer);
        ExcelUtil<Transformer> util = new ExcelUtil<Transformer>(Transformer.class);
        return util.exportExcel(list, "transformer");
    }

    /**
     * 新增变压器设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存变压器设备
     */
    @RequiresPermissions("datasync:transformer:add")
    @Log(title = "变压器设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Transformer transformer)
    {
        return toAjax(transformerService.insertTransformer(transformer));
    }

    /**
     * 修改变压器设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Transformer transformer = transformerService.selectTransformerById(id);
        mmap.put("transformer", transformer);
        return prefix + "/edit";
    }

    /**
     * 修改保存变压器设备
     */
    @RequiresPermissions("datasync:transformer:edit")
    @Log(title = "变压器设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Transformer transformer)
    {
        return toAjax(transformerService.updateTransformer(transformer));
    }

    /**
     * 删除变压器设备
     */
    @RequiresPermissions("datasync:transformer:remove")
    @Log(title = "变压器设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(transformerService.deleteTransformerByIds(ids));
    }
}
