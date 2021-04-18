package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.PowerSupplyRelation;

/**
 * 供电关联关系Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IPowerSupplyRelationService 
{
    /**
     * 查询供电关联关系
     * 
     * @param id 供电关联关系ID
     * @return 供电关联关系
     */
    public PowerSupplyRelation selectPowerSupplyRelationById(Long id);

    /**
     * 查询供电关联关系列表
     * 
     * @param powerSupplyRelation 供电关联关系
     * @return 供电关联关系集合
     */
    public List<PowerSupplyRelation> selectPowerSupplyRelationList(PowerSupplyRelation powerSupplyRelation);

    /**
     * 新增供电关联关系
     * 
     * @param powerSupplyRelation 供电关联关系
     * @return 结果
     */
    public int insertPowerSupplyRelation(PowerSupplyRelation powerSupplyRelation);

    /**
     * 修改供电关联关系
     * 
     * @param powerSupplyRelation 供电关联关系
     * @return 结果
     */
    public int updatePowerSupplyRelation(PowerSupplyRelation powerSupplyRelation);

    /**
     * 批量删除供电关联关系
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePowerSupplyRelationByIds(String ids);

    /**
     * 删除供电关联关系信息
     * 
     * @param id 供电关联关系ID
     * @return 结果
     */
    public int deletePowerSupplyRelationById(Long id);
}
