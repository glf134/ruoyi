package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.CommonAirCondition;

/**
 * 普通空调Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface CommonAirConditionMapper 
{
    /**
     * 查询普通空调
     * 
     * @param id 普通空调ID
     * @return 普通空调
     */
    public CommonAirCondition selectCommonAirConditionById(Long id);

    /**
     * 查询普通空调列表
     * 
     * @param commonAirCondition 普通空调
     * @return 普通空调集合
     */
    public List<CommonAirCondition> selectCommonAirConditionList(CommonAirCondition commonAirCondition);

    /**
     * 新增普通空调
     * 
     * @param commonAirCondition 普通空调
     * @return 结果
     */
    public int insertCommonAirCondition(CommonAirCondition commonAirCondition);

    /**
     * 修改普通空调
     * 
     * @param commonAirCondition 普通空调
     * @return 结果
     */
    public int updateCommonAirCondition(CommonAirCondition commonAirCondition);

    /**
     * 删除普通空调
     * 
     * @param id 普通空调ID
     * @return 结果
     */
    public int deleteCommonAirConditionById(Long id);

    /**
     * 批量删除普通空调
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCommonAirConditionByIds(String[] ids);
}
