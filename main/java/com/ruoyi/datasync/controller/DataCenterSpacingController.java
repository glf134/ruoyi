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
import com.ruoyi.datasync.domain.DataCenterSpacing;
import com.ruoyi.datasync.service.IDataCenterSpacingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据中心间距Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/spacing")
public class DataCenterSpacingController extends BaseController
{
    private String prefix = "datasync/spacing";

    @Autowired
    private IDataCenterSpacingService dataCenterSpacingService;

    @RequiresPermissions("datasync:spacing:view")
    @GetMapping()
    public String spacing()
    {
        return prefix + "/spacing";
    }

    /**
     * 查询数据中心间距列表
     */
    @RequiresPermissions("datasync:spacing:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DataCenterSpacing dataCenterSpacing)
    {
        startPage();
        List<DataCenterSpacing> list = dataCenterSpacingService.selectDataCenterSpacingList(dataCenterSpacing);
        return getDataTable(list);
    }

    /**
     * 导出数据中心间距列表
     */
    @RequiresPermissions("datasync:spacing:export")
    @Log(title = "数据中心间距", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DataCenterSpacing dataCenterSpacing)
    {
        List<DataCenterSpacing> list = dataCenterSpacingService.selectDataCenterSpacingList(dataCenterSpacing);
        ExcelUtil<DataCenterSpacing> util = new ExcelUtil<DataCenterSpacing>(DataCenterSpacing.class);
        return util.exportExcel(list, "spacing");
    }

    /**
     * 新增数据中心间距
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存数据中心间距
     */
    @RequiresPermissions("datasync:spacing:add")
    @Log(title = "数据中心间距", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DataCenterSpacing dataCenterSpacing)
    {
        return toAjax(dataCenterSpacingService.insertDataCenterSpacing(dataCenterSpacing));
    }

    /**
     * 修改数据中心间距
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DataCenterSpacing dataCenterSpacing = dataCenterSpacingService.selectDataCenterSpacingById(id);
        mmap.put("dataCenterSpacing", dataCenterSpacing);
        return prefix + "/edit";
    }

    /**
     * 修改保存数据中心间距
     */
    @RequiresPermissions("datasync:spacing:edit")
    @Log(title = "数据中心间距", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DataCenterSpacing dataCenterSpacing)
    {
        return toAjax(dataCenterSpacingService.updateDataCenterSpacing(dataCenterSpacing));
    }

    /**
     * 删除数据中心间距
     */
    @RequiresPermissions("datasync:spacing:remove")
    @Log(title = "数据中心间距", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dataCenterSpacingService.deleteDataCenterSpacingByIds(ids));
    }
}
