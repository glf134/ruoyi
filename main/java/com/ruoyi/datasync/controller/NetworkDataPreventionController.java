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
import com.ruoyi.datasync.domain.NetworkDataPrevention;
import com.ruoyi.datasync.service.INetworkDataPreventionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网络数据防泄漏系统Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/prevention")
public class NetworkDataPreventionController extends BaseController
{
    private String prefix = "datasync/prevention";

    @Autowired
    private INetworkDataPreventionService networkDataPreventionService;

    @RequiresPermissions("datasync:prevention:view")
    @GetMapping()
    public String prevention()
    {
        return prefix + "/prevention";
    }

    /**
     * 查询网络数据防泄漏系统列表
     */
    @RequiresPermissions("datasync:prevention:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NetworkDataPrevention networkDataPrevention)
    {
        startPage();
        List<NetworkDataPrevention> list = networkDataPreventionService.selectNetworkDataPreventionList(networkDataPrevention);
        return getDataTable(list);
    }

    /**
     * 导出网络数据防泄漏系统列表
     */
    @RequiresPermissions("datasync:prevention:export")
    @Log(title = "网络数据防泄漏系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NetworkDataPrevention networkDataPrevention)
    {
        List<NetworkDataPrevention> list = networkDataPreventionService.selectNetworkDataPreventionList(networkDataPrevention);
        ExcelUtil<NetworkDataPrevention> util = new ExcelUtil<NetworkDataPrevention>(NetworkDataPrevention.class);
        return util.exportExcel(list, "prevention");
    }

    /**
     * 新增网络数据防泄漏系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存网络数据防泄漏系统
     */
    @RequiresPermissions("datasync:prevention:add")
    @Log(title = "网络数据防泄漏系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NetworkDataPrevention networkDataPrevention)
    {
        return toAjax(networkDataPreventionService.insertNetworkDataPrevention(networkDataPrevention));
    }

    /**
     * 修改网络数据防泄漏系统
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NetworkDataPrevention networkDataPrevention = networkDataPreventionService.selectNetworkDataPreventionById(id);
        mmap.put("networkDataPrevention", networkDataPrevention);
        return prefix + "/edit";
    }

    /**
     * 修改保存网络数据防泄漏系统
     */
    @RequiresPermissions("datasync:prevention:edit")
    @Log(title = "网络数据防泄漏系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NetworkDataPrevention networkDataPrevention)
    {
        return toAjax(networkDataPreventionService.updateNetworkDataPrevention(networkDataPrevention));
    }

    /**
     * 删除网络数据防泄漏系统
     */
    @RequiresPermissions("datasync:prevention:remove")
    @Log(title = "网络数据防泄漏系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(networkDataPreventionService.deleteNetworkDataPreventionByIds(ids));
    }
}
