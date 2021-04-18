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
import com.ruoyi.datasync.domain.NetworkRelation;
import com.ruoyi.datasync.service.INetworkRelationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网络线路关联关系Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/relation")
public class NetworkRelationController extends BaseController
{
    private String prefix = "datasync/relation";

    @Autowired
    private INetworkRelationService networkRelationService;

    @RequiresPermissions("datasync:relation:view")
    @GetMapping()
    public String relation()
    {
        return prefix + "/relation";
    }

    /**
     * 查询网络线路关联关系列表
     */
    @RequiresPermissions("datasync:relation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NetworkRelation networkRelation)
    {
        startPage();
        List<NetworkRelation> list = networkRelationService.selectNetworkRelationList(networkRelation);
        return getDataTable(list);
    }

    /**
     * 导出网络线路关联关系列表
     */
    @RequiresPermissions("datasync:relation:export")
    @Log(title = "网络线路关联关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NetworkRelation networkRelation)
    {
        List<NetworkRelation> list = networkRelationService.selectNetworkRelationList(networkRelation);
        ExcelUtil<NetworkRelation> util = new ExcelUtil<NetworkRelation>(NetworkRelation.class);
        return util.exportExcel(list, "relation");
    }

    /**
     * 新增网络线路关联关系
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存网络线路关联关系
     */
    @RequiresPermissions("datasync:relation:add")
    @Log(title = "网络线路关联关系", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NetworkRelation networkRelation)
    {
        return toAjax(networkRelationService.insertNetworkRelation(networkRelation));
    }

    /**
     * 修改网络线路关联关系
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NetworkRelation networkRelation = networkRelationService.selectNetworkRelationById(id);
        mmap.put("networkRelation", networkRelation);
        return prefix + "/edit";
    }

    /**
     * 修改保存网络线路关联关系
     */
    @RequiresPermissions("datasync:relation:edit")
    @Log(title = "网络线路关联关系", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NetworkRelation networkRelation)
    {
        return toAjax(networkRelationService.updateNetworkRelation(networkRelation));
    }

    /**
     * 删除网络线路关联关系
     */
    @RequiresPermissions("datasync:relation:remove")
    @Log(title = "网络线路关联关系", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(networkRelationService.deleteNetworkRelationByIds(ids));
    }
}
