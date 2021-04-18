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
import com.ruoyi.datasync.domain.Ave;
import com.ruoyi.datasync.service.IAveService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 防病毒网关(AVE)Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/ave")
public class AveController extends BaseController
{
    private String prefix = "datasync/ave";

    @Autowired
    private IAveService aveService;

    @RequiresPermissions("datasync:ave:view")
    @GetMapping()
    public String ave()
    {
        return prefix + "/ave";
    }

    /**
     * 查询防病毒网关(AVE)列表
     */
    @RequiresPermissions("datasync:ave:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ave ave)
    {
        startPage();
        List<Ave> list = aveService.selectAveList(ave);
        return getDataTable(list);
    }

    /**
     * 导出防病毒网关(AVE)列表
     */
    @RequiresPermissions("datasync:ave:export")
    @Log(title = "防病毒网关(AVE)", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ave ave)
    {
        List<Ave> list = aveService.selectAveList(ave);
        ExcelUtil<Ave> util = new ExcelUtil<Ave>(Ave.class);
        return util.exportExcel(list, "ave");
    }

    /**
     * 新增防病毒网关(AVE)
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存防病毒网关(AVE)
     */
    @RequiresPermissions("datasync:ave:add")
    @Log(title = "防病毒网关(AVE)", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ave ave)
    {
        return toAjax(aveService.insertAve(ave));
    }

    /**
     * 修改防病毒网关(AVE)
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Ave ave = aveService.selectAveById(id);
        mmap.put("ave", ave);
        return prefix + "/edit";
    }

    /**
     * 修改保存防病毒网关(AVE)
     */
    @RequiresPermissions("datasync:ave:edit")
    @Log(title = "防病毒网关(AVE)", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ave ave)
    {
        return toAjax(aveService.updateAve(ave));
    }

    /**
     * 删除防病毒网关(AVE)
     */
    @RequiresPermissions("datasync:ave:remove")
    @Log(title = "防病毒网关(AVE)", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(aveService.deleteAveByIds(ids));
    }
}
