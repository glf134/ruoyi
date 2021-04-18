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
import com.ruoyi.datasync.domain.ShieldedCabinet;
import com.ruoyi.datasync.service.IShieldedCabinetService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 屏蔽机柜Controller
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Controller
@RequestMapping("/datasync/cabinet")
public class ShieldedCabinetController extends BaseController
{
    private String prefix = "datasync/cabinet";

    @Autowired
    private IShieldedCabinetService shieldedCabinetService;

    @RequiresPermissions("datasync:cabinet:view")
    @GetMapping()
    public String cabinet()
    {
        return prefix + "/cabinet";
    }

    /**
     * 查询屏蔽机柜列表
     */
    @RequiresPermissions("datasync:cabinet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ShieldedCabinet shieldedCabinet)
    {
        startPage();
        List<ShieldedCabinet> list = shieldedCabinetService.selectShieldedCabinetList(shieldedCabinet);
        return getDataTable(list);
    }

    /**
     * 导出屏蔽机柜列表
     */
    @RequiresPermissions("datasync:cabinet:export")
    @Log(title = "屏蔽机柜", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ShieldedCabinet shieldedCabinet)
    {
        List<ShieldedCabinet> list = shieldedCabinetService.selectShieldedCabinetList(shieldedCabinet);
        ExcelUtil<ShieldedCabinet> util = new ExcelUtil<ShieldedCabinet>(ShieldedCabinet.class);
        return util.exportExcel(list, "cabinet");
    }

    /**
     * 新增屏蔽机柜
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存屏蔽机柜
     */
    @RequiresPermissions("datasync:cabinet:add")
    @Log(title = "屏蔽机柜", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ShieldedCabinet shieldedCabinet)
    {
        return toAjax(shieldedCabinetService.insertShieldedCabinet(shieldedCabinet));
    }

    /**
     * 修改屏蔽机柜
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ShieldedCabinet shieldedCabinet = shieldedCabinetService.selectShieldedCabinetById(id);
        mmap.put("shieldedCabinet", shieldedCabinet);
        return prefix + "/edit";
    }

    /**
     * 修改保存屏蔽机柜
     */
    @RequiresPermissions("datasync:cabinet:edit")
    @Log(title = "屏蔽机柜", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ShieldedCabinet shieldedCabinet)
    {
        return toAjax(shieldedCabinetService.updateShieldedCabinet(shieldedCabinet));
    }

    /**
     * 删除屏蔽机柜
     */
    @RequiresPermissions("datasync:cabinet:remove")
    @Log(title = "屏蔽机柜", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(shieldedCabinetService.deleteShieldedCabinetByIds(ids));
    }
}
