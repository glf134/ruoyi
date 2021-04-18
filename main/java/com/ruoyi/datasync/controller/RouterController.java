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
import com.ruoyi.datasync.domain.Router;
import com.ruoyi.datasync.service.IRouterService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 路由器Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/router")
public class RouterController extends BaseController
{
    private String prefix = "datasync/router";

    @Autowired
    private IRouterService routerService;

    @RequiresPermissions("datasync:router:view")
    @GetMapping()
    public String router()
    {
        return prefix + "/router";
    }

    /**
     * 查询路由器列表
     */
    @RequiresPermissions("datasync:router:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Router router)
    {
        startPage();
        List<Router> list = routerService.selectRouterList(router);
        return getDataTable(list);
    }

    /**
     * 导出路由器列表
     */
    @RequiresPermissions("datasync:router:export")
    @Log(title = "路由器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Router router)
    {
        List<Router> list = routerService.selectRouterList(router);
        ExcelUtil<Router> util = new ExcelUtil<Router>(Router.class);
        return util.exportExcel(list, "router");
    }

    /**
     * 新增路由器
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存路由器
     */
    @RequiresPermissions("datasync:router:add")
    @Log(title = "路由器", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Router router)
    {
        return toAjax(routerService.insertRouter(router));
    }

    /**
     * 修改路由器
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Router router = routerService.selectRouterById(id);
        mmap.put("router", router);
        return prefix + "/edit";
    }

    /**
     * 修改保存路由器
     */
    @RequiresPermissions("datasync:router:edit")
    @Log(title = "路由器", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Router router)
    {
        return toAjax(routerService.updateRouter(router));
    }

    /**
     * 删除路由器
     */
    @RequiresPermissions("datasync:router:remove")
    @Log(title = "路由器", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(routerService.deleteRouterByIds(ids));
    }
}
