package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.FiberSwitchMapper;
import com.ruoyi.datasync.domain.FiberSwitch;
import com.ruoyi.datasync.service.IFiberSwitchService;
import com.ruoyi.common.core.text.Convert;

/**
 * 光纤交换机Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class FiberSwitchServiceImpl implements IFiberSwitchService 
{
    @Autowired
    private FiberSwitchMapper fiberSwitchMapper;

    /**
     * 查询光纤交换机
     * 
     * @param id 光纤交换机ID
     * @return 光纤交换机
     */
    @Override
    public FiberSwitch selectFiberSwitchById(Long id)
    {
        return fiberSwitchMapper.selectFiberSwitchById(id);
    }

    /**
     * 查询光纤交换机列表
     * 
     * @param fiberSwitch 光纤交换机
     * @return 光纤交换机
     */
    @Override
    public List<FiberSwitch> selectFiberSwitchList(FiberSwitch fiberSwitch)
    {
        return fiberSwitchMapper.selectFiberSwitchList(fiberSwitch);
    }

    /**
     * 新增光纤交换机
     * 
     * @param fiberSwitch 光纤交换机
     * @return 结果
     */
    @Override
    public int insertFiberSwitch(FiberSwitch fiberSwitch)
    {
        fiberSwitch.setCreateTime(DateUtils.getNowDate());
        return fiberSwitchMapper.insertFiberSwitch(fiberSwitch);
    }

    /**
     * 修改光纤交换机
     * 
     * @param fiberSwitch 光纤交换机
     * @return 结果
     */
    @Override
    public int updateFiberSwitch(FiberSwitch fiberSwitch)
    {
        fiberSwitch.setUpdateTime(DateUtils.getNowDate());
        return fiberSwitchMapper.updateFiberSwitch(fiberSwitch);
    }

    /**
     * 删除光纤交换机对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFiberSwitchByIds(String ids)
    {
        return fiberSwitchMapper.deleteFiberSwitchByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除光纤交换机信息
     * 
     * @param id 光纤交换机ID
     * @return 结果
     */
    @Override
    public int deleteFiberSwitchById(Long id)
    {
        return fiberSwitchMapper.deleteFiberSwitchById(id);
    }
}
