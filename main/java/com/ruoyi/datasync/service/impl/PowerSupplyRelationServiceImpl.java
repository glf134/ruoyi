package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.PowerSupplyRelationMapper;
import com.ruoyi.datasync.domain.PowerSupplyRelation;
import com.ruoyi.datasync.service.IPowerSupplyRelationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 供电关联关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class PowerSupplyRelationServiceImpl implements IPowerSupplyRelationService 
{
    @Autowired
    private PowerSupplyRelationMapper powerSupplyRelationMapper;

    /**
     * 查询供电关联关系
     * 
     * @param id 供电关联关系ID
     * @return 供电关联关系
     */
    @Override
    public PowerSupplyRelation selectPowerSupplyRelationById(Long id)
    {
        return powerSupplyRelationMapper.selectPowerSupplyRelationById(id);
    }

    /**
     * 查询供电关联关系列表
     * 
     * @param powerSupplyRelation 供电关联关系
     * @return 供电关联关系
     */
    @Override
    public List<PowerSupplyRelation> selectPowerSupplyRelationList(PowerSupplyRelation powerSupplyRelation)
    {
        return powerSupplyRelationMapper.selectPowerSupplyRelationList(powerSupplyRelation);
    }

    /**
     * 新增供电关联关系
     * 
     * @param powerSupplyRelation 供电关联关系
     * @return 结果
     */
    @Override
    public int insertPowerSupplyRelation(PowerSupplyRelation powerSupplyRelation)
    {
        powerSupplyRelation.setCreateTime(DateUtils.getNowDate());
        return powerSupplyRelationMapper.insertPowerSupplyRelation(powerSupplyRelation);
    }

    /**
     * 修改供电关联关系
     * 
     * @param powerSupplyRelation 供电关联关系
     * @return 结果
     */
    @Override
    public int updatePowerSupplyRelation(PowerSupplyRelation powerSupplyRelation)
    {
        powerSupplyRelation.setUpdateTime(DateUtils.getNowDate());
        return powerSupplyRelationMapper.updatePowerSupplyRelation(powerSupplyRelation);
    }

    /**
     * 删除供电关联关系对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePowerSupplyRelationByIds(String ids)
    {
        return powerSupplyRelationMapper.deletePowerSupplyRelationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除供电关联关系信息
     * 
     * @param id 供电关联关系ID
     * @return 结果
     */
    @Override
    public int deletePowerSupplyRelationById(Long id)
    {
        return powerSupplyRelationMapper.deletePowerSupplyRelationById(id);
    }
}
