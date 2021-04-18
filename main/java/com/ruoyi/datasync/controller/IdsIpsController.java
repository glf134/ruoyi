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
import com.ruoyi.datasync.domain.IdsIps;
import com.ruoyi.datasync.service.IIdsIpsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 入侵检测与防御设备（IDS/IPS）Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/ips")
public class IdsIpsController extends BaseController
{
    private String prefix = "datasync/ips";

    @Autowired
    private IIdsIpsService idsIpsService;

    @RequiresPermissions("datasync:ips:view")
    @GetMapping()
    public String ips()
    {
        return prefix + "/ips";
    }

    /**
     * 查询入侵检测与防御设备（IDS/IPS）列表
     */
    @RequiresPermissions("datasync:ips:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(IdsIps idsIps)
    {
        startPage();
        List<IdsIps> list = idsIpsService.selectIdsIpsList(idsIps);
        return getDataTable(list);
    }

    /**
     * 导出入侵检测与防御设备（IDS/IPS）列表
     */
    @RequiresPermissions("datasync:ips:export")
    @Log(title = "入侵检测与防御设备（IDS/IPS）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IdsIps idsIps)
    {
        List<IdsIps> list = idsIpsService.selectIdsIpsList(idsIps);
        ExcelUtil<IdsIps> util = new ExcelUtil<IdsIps>(IdsIps.class);
        return util.exportExcel(list, "ips");
    }

    /**
     * 新增入侵检测与防御设备（IDS/IPS）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存入侵检测与防御设备（IDS/IPS）
     */
    @RequiresPermissions("datasync:ips:add")
    @Log(title = "入侵检测与防御设备（IDS/IPS）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(IdsIps idsIps)
    {
        return toAjax(idsIpsService.insertIdsIps(idsIps));
    }

    /**
     * 修改入侵检测与防御设备（IDS/IPS）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        IdsIps idsIps = idsIpsService.selectIdsIpsById(id);
        mmap.put("idsIps", idsIps);
        return prefix + "/edit";
    }

    /**
     * 修改保存入侵检测与防御设备（IDS/IPS）
     */
    @RequiresPermissions("datasync:ips:edit")
    @Log(title = "入侵检测与防御设备（IDS/IPS）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(IdsIps idsIps)
    {
        return toAjax(idsIpsService.updateIdsIps(idsIps));
    }

    /**
     * 删除入侵检测与防御设备（IDS/IPS）
     */
    @RequiresPermissions("datasync:ips:remove")
    @Log(title = "入侵检测与防御设备（IDS/IPS）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(idsIpsService.deleteIdsIpsByIds(ids));
    }
}
