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
import com.ruoyi.datasync.domain.Waf;
import com.ruoyi.datasync.service.IWafService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * Web应用防护系统（WAF）Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/waf")
public class WafController extends BaseController
{
    private String prefix = "datasync/waf";

    @Autowired
    private IWafService wafService;

    @RequiresPermissions("datasync:waf:view")
    @GetMapping()
    public String waf()
    {
        return prefix + "/waf";
    }

    /**
     * 查询Web应用防护系统（WAF）列表
     */
    @RequiresPermissions("datasync:waf:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Waf waf)
    {
        startPage();
        List<Waf> list = wafService.selectWafList(waf);
        return getDataTable(list);
    }

    /**
     * 导出Web应用防护系统（WAF）列表
     */
    @RequiresPermissions("datasync:waf:export")
    @Log(title = "Web应用防护系统（WAF）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Waf waf)
    {
        List<Waf> list = wafService.selectWafList(waf);
        ExcelUtil<Waf> util = new ExcelUtil<Waf>(Waf.class);
        return util.exportExcel(list, "waf");
    }

    /**
     * 新增Web应用防护系统（WAF）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存Web应用防护系统（WAF）
     */
    @RequiresPermissions("datasync:waf:add")
    @Log(title = "Web应用防护系统（WAF）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Waf waf)
    {
        return toAjax(wafService.insertWaf(waf));
    }

    /**
     * 修改Web应用防护系统（WAF）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Waf waf = wafService.selectWafById(id);
        mmap.put("waf", waf);
        return prefix + "/edit";
    }

    /**
     * 修改保存Web应用防护系统（WAF）
     */
    @RequiresPermissions("datasync:waf:edit")
    @Log(title = "Web应用防护系统（WAF）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Waf waf)
    {
        return toAjax(wafService.updateWaf(waf));
    }

    /**
     * 删除Web应用防护系统（WAF）
     */
    @RequiresPermissions("datasync:waf:remove")
    @Log(title = "Web应用防护系统（WAF）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wafService.deleteWafByIds(ids));
    }
}
