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
import com.ruoyi.datasync.domain.FreshAir;
import com.ruoyi.datasync.service.IFreshAirService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 新风系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/air")
public class FreshAirController extends BaseController
{
    private String prefix = "datasync/air";

    @Autowired
    private IFreshAirService freshAirService;

    @RequiresPermissions("datasync:air:view")
    @GetMapping()
    public String air()
    {
        return prefix + "/air";
    }

    /**
     * 查询新风系统列表
     */
    @RequiresPermissions("datasync:air:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FreshAir freshAir)
    {
        startPage();
        List<FreshAir> list = freshAirService.selectFreshAirList(freshAir);
        return getDataTable(list);
    }

    /**
     * 导出新风系统列表
     */
    @RequiresPermissions("datasync:air:export")
    @Log(title = "新风系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FreshAir freshAir)
    {
        List<FreshAir> list = freshAirService.selectFreshAirList(freshAir);
        ExcelUtil<FreshAir> util = new ExcelUtil<FreshAir>(FreshAir.class);
        return util.exportExcel(list, "air");
    }

    /**
     * 新增新风系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新风系统
     */
    @RequiresPermissions("datasync:air:add")
    @Log(title = "新风系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FreshAir freshAir)
    {
        return toAjax(freshAirService.insertFreshAir(freshAir));
    }

    /**
     * 修改新风系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FreshAir freshAir = freshAirService.selectFreshAirById(id);
        mmap.put("freshAir", freshAir);
        return prefix + "/edit";
    }

    /**
     * 修改保存新风系统
     */
    @RequiresPermissions("datasync:air:edit")
    @Log(title = "新风系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FreshAir freshAir)
    {
        return toAjax(freshAirService.updateFreshAir(freshAir));
    }

    /**
     * 删除新风系统
     */
    @RequiresPermissions("datasync:air:remove")
    @Log(title = "新风系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(freshAirService.deleteFreshAirByIds(ids));
    }
}
