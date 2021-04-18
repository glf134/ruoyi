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
import com.ruoyi.datasync.domain.CommonAirCondition;
import com.ruoyi.datasync.service.ICommonAirConditionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 普通空调Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/condition")
public class CommonAirConditionController extends BaseController
{
    private String prefix = "datasync/condition";

    @Autowired
    private ICommonAirConditionService commonAirConditionService;

    @RequiresPermissions("datasync:condition:view")
    @GetMapping()
    public String condition()
    {
        return prefix + "/condition";
    }

    /**
     * 查询普通空调列表
     */
    @RequiresPermissions("datasync:condition:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommonAirCondition commonAirCondition)
    {
        startPage();
        List<CommonAirCondition> list = commonAirConditionService.selectCommonAirConditionList(commonAirCondition);
        return getDataTable(list);
    }

    /**
     * 导出普通空调列表
     */
    @RequiresPermissions("datasync:condition:export")
    @Log(title = "普通空调", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommonAirCondition commonAirCondition)
    {
        List<CommonAirCondition> list = commonAirConditionService.selectCommonAirConditionList(commonAirCondition);
        ExcelUtil<CommonAirCondition> util = new ExcelUtil<CommonAirCondition>(CommonAirCondition.class);
        return util.exportExcel(list, "condition");
    }

    /**
     * 新增普通空调
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存普通空调
     */
    @RequiresPermissions("datasync:condition:add")
    @Log(title = "普通空调", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommonAirCondition commonAirCondition)
    {
        return toAjax(commonAirConditionService.insertCommonAirCondition(commonAirCondition));
    }

    /**
     * 修改普通空调
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CommonAirCondition commonAirCondition = commonAirConditionService.selectCommonAirConditionById(id);
        mmap.put("commonAirCondition", commonAirCondition);
        return prefix + "/edit";
    }

    /**
     * 修改保存普通空调
     */
    @RequiresPermissions("datasync:condition:edit")
    @Log(title = "普通空调", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommonAirCondition commonAirCondition)
    {
        return toAjax(commonAirConditionService.updateCommonAirCondition(commonAirCondition));
    }

    /**
     * 删除普通空调
     */
    @RequiresPermissions("datasync:condition:remove")
    @Log(title = "普通空调", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commonAirConditionService.deleteCommonAirConditionByIds(ids));
    }
}
