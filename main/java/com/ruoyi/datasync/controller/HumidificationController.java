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
import com.ruoyi.datasync.domain.Humidification;
import com.ruoyi.datasync.service.IHumidificationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 加湿系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/humidification")
public class HumidificationController extends BaseController
{
    private String prefix = "datasync/humidification";

    @Autowired
    private IHumidificationService humidificationService;

    @RequiresPermissions("datasync:humidification:view")
    @GetMapping()
    public String humidification()
    {
        return prefix + "/humidification";
    }

    /**
     * 查询加湿系统列表
     */
    @RequiresPermissions("datasync:humidification:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Humidification humidification)
    {
        startPage();
        List<Humidification> list = humidificationService.selectHumidificationList(humidification);
        return getDataTable(list);
    }

    /**
     * 导出加湿系统列表
     */
    @RequiresPermissions("datasync:humidification:export")
    @Log(title = "加湿系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Humidification humidification)
    {
        List<Humidification> list = humidificationService.selectHumidificationList(humidification);
        ExcelUtil<Humidification> util = new ExcelUtil<Humidification>(Humidification.class);
        return util.exportExcel(list, "humidification");
    }

    /**
     * 新增加湿系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存加湿系统
     */
    @RequiresPermissions("datasync:humidification:add")
    @Log(title = "加湿系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Humidification humidification)
    {
        return toAjax(humidificationService.insertHumidification(humidification));
    }

    /**
     * 修改加湿系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Humidification humidification = humidificationService.selectHumidificationById(id);
        mmap.put("humidification", humidification);
        return prefix + "/edit";
    }

    /**
     * 修改保存加湿系统
     */
    @RequiresPermissions("datasync:humidification:edit")
    @Log(title = "加湿系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Humidification humidification)
    {
        return toAjax(humidificationService.updateHumidification(humidification));
    }

    /**
     * 删除加湿系统
     */
    @RequiresPermissions("datasync:humidification:remove")
    @Log(title = "加湿系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(humidificationService.deleteHumidificationByIds(ids));
    }
}
