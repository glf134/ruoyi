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
import com.ruoyi.datasync.domain.Server;
import com.ruoyi.datasync.service.IServerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 服务器Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/server")
public class ServerController extends BaseController
{
    private String prefix = "datasync/server";

    @Autowired
    private IServerService serverService;

    @RequiresPermissions("datasync:server:view")
    @GetMapping()
    public String server()
    {
        return prefix + "/server";
    }

    /**
     * 查询服务器列表
     */
    @RequiresPermissions("datasync:server:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Server server)
    {
        startPage();
        List<Server> list = serverService.selectServerList(server);
        return getDataTable(list);
    }

    /**
     * 导出服务器列表
     */
    @RequiresPermissions("datasync:server:export")
    @Log(title = "服务器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Server server)
    {
        List<Server> list = serverService.selectServerList(server);
        ExcelUtil<Server> util = new ExcelUtil<Server>(Server.class);
        return util.exportExcel(list, "server");
    }

    /**
     * 新增服务器
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存服务器
     */
    @RequiresPermissions("datasync:server:add")
    @Log(title = "服务器", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Server server)
    {
        return toAjax(serverService.insertServer(server));
    }

    /**
     * 修改服务器
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Server server = serverService.selectServerById(id);
        mmap.put("server", server);
        return prefix + "/edit";
    }

    /**
     * 修改保存服务器
     */
    @RequiresPermissions("datasync:server:edit")
    @Log(title = "服务器", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Server server)
    {
        return toAjax(serverService.updateServer(server));
    }

    /**
     * 删除服务器
     */
    @RequiresPermissions("datasync:server:remove")
    @Log(title = "服务器", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(serverService.deleteServerByIds(ids));
    }
}
