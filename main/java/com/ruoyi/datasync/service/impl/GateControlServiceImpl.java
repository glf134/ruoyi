package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.GateControlMapper;
import com.ruoyi.datasync.domain.GateControl;
import com.ruoyi.datasync.service.IGateControlService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出入口控制系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class GateControlServiceImpl implements IGateControlService 
{
    @Autowired
    private GateControlMapper gateControlMapper;

    /**
     * 查询出入口控制系统
     * 
     * @param id 出入口控制系统ID
     * @return 出入口控制系统
     */
    @Override
    public GateControl selectGateControlById(Long id)
    {
        return gateControlMapper.selectGateControlById(id);
    }

    /**
     * 查询出入口控制系统列表
     * 
     * @param gateControl 出入口控制系统
     * @return 出入口控制系统
     */
    @Override
    public List<GateControl> selectGateControlList(GateControl gateControl)
    {
        return gateControlMapper.selectGateControlList(gateControl);
    }

    /**
     * 新增出入口控制系统
     * 
     * @param gateControl 出入口控制系统
     * @return 结果
     */
    @Override
    public int insertGateControl(GateControl gateControl)
    {
        gateControl.setCreateTime(DateUtils.getNowDate());
        return gateControlMapper.insertGateControl(gateControl);
    }

    /**
     * 修改出入口控制系统
     * 
     * @param gateControl 出入口控制系统
     * @return 结果
     */
    @Override
    public int updateGateControl(GateControl gateControl)
    {
        gateControl.setUpdateTime(DateUtils.getNowDate());
        return gateControlMapper.updateGateControl(gateControl);
    }

    /**
     * 删除出入口控制系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGateControlByIds(String ids)
    {
        return gateControlMapper.deleteGateControlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出入口控制系统信息
     * 
     * @param id 出入口控制系统ID
     * @return 结果
     */
    @Override
    public int deleteGateControlById(Long id)
    {
        return gateControlMapper.deleteGateControlById(id);
    }
}
