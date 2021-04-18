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
import com.ruoyi.datasync.domain.Gap;
import com.ruoyi.datasync.service.IGapService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 安全隔离网闸数据元（GAP）Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/gap")
public class GapController extends BaseController
{
    private String prefix = "datasync/gap";

    @Autowired
    private IGapService gapService;

    @RequiresPermissions("datasync:gap:view")
    @GetMapping()
    public String gap()
    {
        return prefix + "/gap";
    }

    /**
     * 查询安全隔离网闸数据元（GAP）列表
     */
    @RequiresPermissions("datasync:gap:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Gap gap)
    {
        startPage();
        List<Gap> list = gapService.selectGapList(gap);
        return getDataTable(list);
    }

    /**
     * 导出安全隔离网闸数据元（GAP）列表
     */
    @RequiresPermissions("datasync:gap:export")
    @Log(title = "安全隔离网闸数据元（GAP）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Gap gap)
    {
        List<Gap> list = gapService.selectGapList(gap);
        ExcelUtil<Gap> util = new ExcelUtil<Gap>(Gap.class);
        return util.exportExcel(list, "gap");
    }

    /**
     * 新增安全隔离网闸数据元（GAP）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存安全隔离网闸数据元（GAP）
     */
    @RequiresPermissions("datasync:gap:add")
    @Log(title = "安全隔离网闸数据元（GAP）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Gap gap)
    {
        return toAjax(gapService.insertGap(gap));
    }

    /**
     * 修改安全隔离网闸数据元（GAP）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Gap gap = gapService.selectGapById(id);
        mmap.put("gap", gap);
        return prefix + "/edit";
    }

    /**
     * 修改保存安全隔离网闸数据元（GAP）
     */
    @RequiresPermissions("datasync:gap:edit")
    @Log(title = "安全隔离网闸数据元（GAP）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Gap gap)
    {
        return toAjax(gapService.updateGap(gap));
    }

    /**
     * 删除安全隔离网闸数据元（GAP）
     */
    @RequiresPermissions("datasync:gap:remove")
    @Log(title = "安全隔离网闸数据元（GAP）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gapService.deleteGapByIds(ids));
    }
}
