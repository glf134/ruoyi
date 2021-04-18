package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.PrecisionAirConditionMapper;
import com.ruoyi.datasync.domain.PrecisionAirCondition;
import com.ruoyi.datasync.service.IPrecisionAirConditionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 精密空调Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class PrecisionAirConditionServiceImpl implements IPrecisionAirConditionService 
{
    @Autowired
    private PrecisionAirConditionMapper precisionAirConditionMapper;

    /**
     * 查询精密空调
     * 
     * @param id 精密空调ID
     * @return 精密空调
     */
    @Override
    public PrecisionAirCondition selectPrecisionAirConditionById(Long id)
    {
        return precisionAirConditionMapper.selectPrecisionAirConditionById(id);
    }

    /**
     * 查询精密空调列表
     * 
     * @param precisionAirCondition 精密空调
     * @return 精密空调
     */
    @Override
    public List<PrecisionAirCondition> selectPrecisionAirConditionList(PrecisionAirCondition precisionAirCondition)
    {
        return precisionAirConditionMapper.selectPrecisionAirConditionList(precisionAirCondition);
    }

    /**
     * 新增精密空调
     * 
     * @param precisionAirCondition 精密空调
     * @return 结果
     */
    @Override
    public int insertPrecisionAirCondition(PrecisionAirCondition precisionAirCondition)
    {
        precisionAirCondition.setCreateTime(DateUtils.getNowDate());
        return precisionAirConditionMapper.insertPrecisionAirCondition(precisionAirCondition);
    }

    /**
     * 修改精密空调
     * 
     * @param precisionAirCondition 精密空调
     * @return 结果
     */
    @Override
    public int updatePrecisionAirCondition(PrecisionAirCondition precisionAirCondition)
    {
        precisionAirCondition.setUpdateTime(DateUtils.getNowDate());
        return precisionAirConditionMapper.updatePrecisionAirCondition(precisionAirCondition);
    }

    /**
     * 删除精密空调对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePrecisionAirConditionByIds(String ids)
    {
        return precisionAirConditionMapper.deletePrecisionAirConditionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除精密空调信息
     * 
     * @param id 精密空调ID
     * @return 结果
     */
    @Override
    public int deletePrecisionAirConditionById(Long id)
    {
        return precisionAirConditionMapper.deletePrecisionAirConditionById(id);
    }
}
