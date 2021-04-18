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
import com.ruoyi.datasync.domain.NetworkLine;
import com.ruoyi.datasync.service.INetworkLineService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网络线路Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/line")
public class NetworkLineController extends BaseController
{
    private String prefix = "datasync/line";

    @Autowired
    private INetworkLineService networkLineService;

    @RequiresPermissions("datasync:line:view")
    @GetMapping()
    public String line()
    {
        return prefix + "/line";
    }

    /**
     * 查询网络线路列表
     */
    @RequiresPermissions("datasync:line:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NetworkLine networkLine)
    {
        startPage();
        List<NetworkLine> list = networkLineService.selectNetworkLineList(networkLine);
        return getDataTable(list);
    }

    /**
     * 导出网络线路列表
     */
    @RequiresPermissions("datasync:line:export")
    @Log(title = "网络线路", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NetworkLine networkLine)
    {
        List<NetworkLine> list = networkLineService.selectNetworkLineList(networkLine);
        ExcelUtil<NetworkLine> util = new ExcelUtil<NetworkLine>(NetworkLine.class);
        return util.exportExcel(list, "line");
    }

    /**
     * 新增网络线路
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存网络线路
     */
    @RequiresPermissions("datasync:line:add")
    @Log(title = "网络线路", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NetworkLine networkLine)
    {
        return toAjax(networkLineService.insertNetworkLine(networkLine));
    }

    /**
     * 修改网络线路
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NetworkLine networkLine = networkLineService.selectNetworkLineById(id);
        mmap.put("networkLine", networkLine);
        return prefix + "/edit";
    }

    /**
     * 修改保存网络线路
     */
    @RequiresPermissions("datasync:line:edit")
    @Log(title = "网络线路", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NetworkLine networkLine)
    {
        return toAjax(networkLineService.updateNetworkLine(networkLine));
    }

    /**
     * 删除网络线路
     */
    @RequiresPermissions("datasync:line:remove")
    @Log(title = "网络线路", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(networkLineService.deleteNetworkLineByIds(ids));
    }
}
