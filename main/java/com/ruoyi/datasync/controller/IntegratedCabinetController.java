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
import com.ruoyi.datasync.domain.IntegratedCabinet;
import com.ruoyi.datasync.service.IIntegratedCabinetService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 一体化机柜Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/cabinet")
public class IntegratedCabinetController extends BaseController
{
    private String prefix = "datasync/cabinet";

    @Autowired
    private IIntegratedCabinetService integratedCabinetService;

    @RequiresPermissions("datasync:cabinet:view")
    @GetMapping()
    public String cabinet()
    {
        return prefix + "/cabinet";
    }

    /**
     * 查询一体化机柜列表
     */
    @RequiresPermissions("datasync:cabinet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(IntegratedCabinet integratedCabinet)
    {
        startPage();
        List<IntegratedCabinet> list = integratedCabinetService.selectIntegratedCabinetList(integratedCabinet);
        return getDataTable(list);
    }

    /**
     * 导出一体化机柜列表
     */
    @RequiresPermissions("datasync:cabinet:export")
    @Log(title = "一体化机柜", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IntegratedCabinet integratedCabinet)
    {
        List<IntegratedCabinet> list = integratedCabinetService.selectIntegratedCabinetList(integratedCabinet);
        ExcelUtil<IntegratedCabinet> util = new ExcelUtil<IntegratedCabinet>(IntegratedCabinet.class);
        return util.exportExcel(list, "cabinet");
    }

    /**
     * 新增一体化机柜
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存一体化机柜
     */
    @RequiresPermissions("datasync:cabinet:add")
    @Log(title = "一体化机柜", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(IntegratedCabinet integratedCabinet)
    {
        return toAjax(integratedCabinetService.insertIntegratedCabinet(integratedCabinet));
    }

    /**
     * 修改一体化机柜
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        IntegratedCabinet integratedCabinet = integratedCabinetService.selectIntegratedCabinetById(id);
        mmap.put("integratedCabinet", integratedCabinet);
        return prefix + "/edit";
    }

    /**
     * 修改保存一体化机柜
     */
    @RequiresPermissions("datasync:cabinet:edit")
    @Log(title = "一体化机柜", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(IntegratedCabinet integratedCabinet)
    {
        return toAjax(integratedCabinetService.updateIntegratedCabinet(integratedCabinet));
    }

    /**
     * 删除一体化机柜
     */
    @RequiresPermissions("datasync:cabinet:remove")
    @Log(title = "一体化机柜", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(integratedCabinetService.deleteIntegratedCabinetByIds(ids));
    }
}
