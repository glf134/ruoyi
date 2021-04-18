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
import com.ruoyi.datasync.domain.MailFiltering;
import com.ruoyi.datasync.service.IMailFilteringService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 邮件安全过滤系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/filtering")
public class MailFilteringController extends BaseController
{
    private String prefix = "datasync/filtering";

    @Autowired
    private IMailFilteringService mailFilteringService;

    @RequiresPermissions("datasync:filtering:view")
    @GetMapping()
    public String filtering()
    {
        return prefix + "/filtering";
    }

    /**
     * 查询邮件安全过滤系统列表
     */
    @RequiresPermissions("datasync:filtering:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MailFiltering mailFiltering)
    {
        startPage();
        List<MailFiltering> list = mailFilteringService.selectMailFilteringList(mailFiltering);
        return getDataTable(list);
    }

    /**
     * 导出邮件安全过滤系统列表
     */
    @RequiresPermissions("datasync:filtering:export")
    @Log(title = "邮件安全过滤系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MailFiltering mailFiltering)
    {
        List<MailFiltering> list = mailFilteringService.selectMailFilteringList(mailFiltering);
        ExcelUtil<MailFiltering> util = new ExcelUtil<MailFiltering>(MailFiltering.class);
        return util.exportExcel(list, "filtering");
    }

    /**
     * 新增邮件安全过滤系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存邮件安全过滤系统
     */
    @RequiresPermissions("datasync:filtering:add")
    @Log(title = "邮件安全过滤系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MailFiltering mailFiltering)
    {
        return toAjax(mailFilteringService.insertMailFiltering(mailFiltering));
    }

    /**
     * 修改邮件安全过滤系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MailFiltering mailFiltering = mailFilteringService.selectMailFilteringById(id);
        mmap.put("mailFiltering", mailFiltering);
        return prefix + "/edit";
    }

    /**
     * 修改保存邮件安全过滤系统
     */
    @RequiresPermissions("datasync:filtering:edit")
    @Log(title = "邮件安全过滤系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MailFiltering mailFiltering)
    {
        return toAjax(mailFilteringService.updateMailFiltering(mailFiltering));
    }

    /**
     * 删除邮件安全过滤系统
     */
    @RequiresPermissions("datasync:filtering:remove")
    @Log(title = "邮件安全过滤系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mailFilteringService.deleteMailFilteringByIds(ids));
    }
}
