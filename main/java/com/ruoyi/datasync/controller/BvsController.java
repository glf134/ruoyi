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
import com.ruoyi.datasync.domain.Bvs;
import com.ruoyi.datasync.service.IBvsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配置核查设备数据元（BVS）Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/bvs")
public class BvsController extends BaseController
{
    private String prefix = "datasync/bvs";

    @Autowired
    private IBvsService bvsService;

    @RequiresPermissions("datasync:bvs:view")
    @GetMapping()
    public String bvs()
    {
        return prefix + "/bvs";
    }

    /**
     * 查询配置核查设备数据元（BVS）列表
     */
    @RequiresPermissions("datasync:bvs:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Bvs bvs)
    {
        startPage();
        List<Bvs> list = bvsService.selectBvsList(bvs);
        return getDataTable(list);
    }

    /**
     * 导出配置核查设备数据元（BVS）列表
     */
    @RequiresPermissions("datasync:bvs:export")
    @Log(title = "配置核查设备数据元（BVS）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Bvs bvs)
    {
        List<Bvs> list = bvsService.selectBvsList(bvs);
        ExcelUtil<Bvs> util = new ExcelUtil<Bvs>(Bvs.class);
        return util.exportExcel(list, "bvs");
    }

    /**
     * 新增配置核查设备数据元（BVS）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存配置核查设备数据元（BVS）
     */
    @RequiresPermissions("datasync:bvs:add")
    @Log(title = "配置核查设备数据元（BVS）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Bvs bvs)
    {
        return toAjax(bvsService.insertBvs(bvs));
    }

    /**
     * 修改配置核查设备数据元（BVS）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Bvs bvs = bvsService.selectBvsById(id);
        mmap.put("bvs", bvs);
        return prefix + "/edit";
    }

    /**
     * 修改保存配置核查设备数据元（BVS）
     */
    @RequiresPermissions("datasync:bvs:edit")
    @Log(title = "配置核查设备数据元（BVS）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Bvs bvs)
    {
        return toAjax(bvsService.updateBvs(bvs));
    }

    /**
     * 删除配置核查设备数据元（BVS）
     */
    @RequiresPermissions("datasync:bvs:remove")
    @Log(title = "配置核查设备数据元（BVS）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bvsService.deleteBvsByIds(ids));
    }
}
