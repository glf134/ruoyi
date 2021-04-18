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
import com.ruoyi.datasync.domain.Ads;
import com.ruoyi.datasync.service.IAdsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 抗拒绝服务设备（ADS）Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/ads")
public class AdsController extends BaseController
{
    private String prefix = "datasync/ads";

    @Autowired
    private IAdsService adsService;

    @RequiresPermissions("datasync:ads:view")
    @GetMapping()
    public String ads()
    {
        return prefix + "/ads";
    }

    /**
     * 查询抗拒绝服务设备（ADS）列表
     */
    @RequiresPermissions("datasync:ads:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ads ads)
    {
        startPage();
        List<Ads> list = adsService.selectAdsList(ads);
        return getDataTable(list);
    }

    /**
     * 导出抗拒绝服务设备（ADS）列表
     */
    @RequiresPermissions("datasync:ads:export")
    @Log(title = "抗拒绝服务设备（ADS）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ads ads)
    {
        List<Ads> list = adsService.selectAdsList(ads);
        ExcelUtil<Ads> util = new ExcelUtil<Ads>(Ads.class);
        return util.exportExcel(list, "ads");
    }

    /**
     * 新增抗拒绝服务设备（ADS）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存抗拒绝服务设备（ADS）
     */
    @RequiresPermissions("datasync:ads:add")
    @Log(title = "抗拒绝服务设备（ADS）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ads ads)
    {
        return toAjax(adsService.insertAds(ads));
    }

    /**
     * 修改抗拒绝服务设备（ADS）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Ads ads = adsService.selectAdsById(id);
        mmap.put("ads", ads);
        return prefix + "/edit";
    }

    /**
     * 修改保存抗拒绝服务设备（ADS）
     */
    @RequiresPermissions("datasync:ads:edit")
    @Log(title = "抗拒绝服务设备（ADS）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ads ads)
    {
        return toAjax(adsService.updateAds(ads));
    }

    /**
     * 删除抗拒绝服务设备（ADS）
     */
    @RequiresPermissions("datasync:ads:remove")
    @Log(title = "抗拒绝服务设备（ADS）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(adsService.deleteAdsByIds(ids));
    }
}
