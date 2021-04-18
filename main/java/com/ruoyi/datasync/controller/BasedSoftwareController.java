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
import com.ruoyi.datasync.domain.BasedSoftware;
import com.ruoyi.datasync.service.IBasedSoftwareService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础软件Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/software")
public class BasedSoftwareController extends BaseController
{
    private String prefix = "datasync/software";

    @Autowired
    private IBasedSoftwareService basedSoftwareService;

    @RequiresPermissions("datasync:software:view")
    @GetMapping()
    public String software()
    {
        return prefix + "/software";
    }

    /**
     * 查询基础软件列表
     */
    @RequiresPermissions("datasync:software:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BasedSoftware basedSoftware)
    {
        startPage();
        List<BasedSoftware> list = basedSoftwareService.selectBasedSoftwareList(basedSoftware);
        return getDataTable(list);
    }

    /**
     * 导出基础软件列表
     */
    @RequiresPermissions("datasync:software:export")
    @Log(title = "基础软件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BasedSoftware basedSoftware)
    {
        List<BasedSoftware> list = basedSoftwareService.selectBasedSoftwareList(basedSoftware);
        ExcelUtil<BasedSoftware> util = new ExcelUtil<BasedSoftware>(BasedSoftware.class);
        return util.exportExcel(list, "software");
    }

    /**
     * 新增基础软件
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基础软件
     */
    @RequiresPermissions("datasync:software:add")
    @Log(title = "基础软件", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BasedSoftware basedSoftware)
    {
        return toAjax(basedSoftwareService.insertBasedSoftware(basedSoftware));
    }

    /**
     * 修改基础软件
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BasedSoftware basedSoftware = basedSoftwareService.selectBasedSoftwareById(id);
        mmap.put("basedSoftware", basedSoftware);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础软件
     */
    @RequiresPermissions("datasync:software:edit")
    @Log(title = "基础软件", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BasedSoftware basedSoftware)
    {
        return toAjax(basedSoftwareService.updateBasedSoftware(basedSoftware));
    }

    /**
     * 删除基础软件
     */
    @RequiresPermissions("datasync:software:remove")
    @Log(title = "基础软件", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(basedSoftwareService.deleteBasedSoftwareByIds(ids));
    }
}
