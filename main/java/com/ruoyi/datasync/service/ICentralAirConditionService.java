package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.CentralAirCondition;

/**
 * 中央空调Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ICentralAirConditionService 
{
    /**
     * 查询中央空调
     * 
     * @param id 中央空调ID
     * @return 中央空调
     */
    public CentralAirCondition selectCentralAirConditionById(Long id);

    /**
     * 查询中央空调列表
     * 
     * @param centralAirCondition 中央空调
     * @return 中央空调集合
     */
    public List<CentralAirCondition> selectCentralAirConditionList(CentralAirCondition centralAirCondition);

    /**
     * 新增中央空调
     * 
     * @param centralAirCondition 中央空调
     * @return 结果
     */
    public int insertCentralAirCondition(CentralAirCondition centralAirCondition);

    /**
     * 修改中央空调
     * 
     * @param centralAirCondition 中央空调
     * @return 结果
     */
    public int updateCentralAirCondition(CentralAirCondition centralAirCondition);

    /**
     * 批量删除中央空调
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCentralAirConditionByIds(String ids);

    /**
     * 删除中央空调信息
     * 
     * @param id 中央空调ID
     * @return 结果
     */
    public int deleteCentralAirConditionById(Long id);
}
