package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.PrecisionAirCondition;

/**
 * 精密空调Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IPrecisionAirConditionService 
{
    /**
     * 查询精密空调
     * 
     * @param id 精密空调ID
     * @return 精密空调
     */
    public PrecisionAirCondition selectPrecisionAirConditionById(Long id);

    /**
     * 查询精密空调列表
     * 
     * @param precisionAirCondition 精密空调
     * @return 精密空调集合
     */
    public List<PrecisionAirCondition> selectPrecisionAirConditionList(PrecisionAirCondition precisionAirCondition);

    /**
     * 新增精密空调
     * 
     * @param precisionAirCondition 精密空调
     * @return 结果
     */
    public int insertPrecisionAirCondition(PrecisionAirCondition precisionAirCondition);

    /**
     * 修改精密空调
     * 
     * @param precisionAirCondition 精密空调
     * @return 结果
     */
    public int updatePrecisionAirCondition(PrecisionAirCondition precisionAirCondition);

    /**
     * 批量删除精密空调
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePrecisionAirConditionByIds(String ids);

    /**
     * 删除精密空调信息
     * 
     * @param id 精密空调ID
     * @return 结果
     */
    public int deletePrecisionAirConditionById(Long id);
}
