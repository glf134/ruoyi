package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.CommonAirConditionMapper;
import com.ruoyi.datasync.domain.CommonAirCondition;
import com.ruoyi.datasync.service.ICommonAirConditionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 普通空调Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class CommonAirConditionServiceImpl implements ICommonAirConditionService 
{
    @Autowired
    private CommonAirConditionMapper commonAirConditionMapper;

    /**
     * 查询普通空调
     * 
     * @param id 普通空调ID
     * @return 普通空调
     */
    @Override
    public CommonAirCondition selectCommonAirConditionById(Long id)
    {
        return commonAirConditionMapper.selectCommonAirConditionById(id);
    }

    /**
     * 查询普通空调列表
     * 
     * @param commonAirCondition 普通空调
     * @return 普通空调
     */
    @Override
    public List<CommonAirCondition> selectCommonAirConditionList(CommonAirCondition commonAirCondition)
    {
        return commonAirConditionMapper.selectCommonAirConditionList(commonAirCondition);
    }

    /**
     * 新增普通空调
     * 
     * @param commonAirCondition 普通空调
     * @return 结果
     */
    @Override
    public int insertCommonAirCondition(CommonAirCondition commonAirCondition)
    {
        commonAirCondition.setCreateTime(DateUtils.getNowDate());
        return commonAirConditionMapper.insertCommonAirCondition(commonAirCondition);
    }

    /**
     * 修改普通空调
     * 
     * @param commonAirCondition 普通空调
     * @return 结果
     */
    @Override
    public int updateCommonAirCondition(CommonAirCondition commonAirCondition)
    {
        commonAirCondition.setUpdateTime(DateUtils.getNowDate());
        return commonAirConditionMapper.updateCommonAirCondition(commonAirCondition);
    }

    /**
     * 删除普通空调对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCommonAirConditionByIds(String ids)
    {
        return commonAirConditionMapper.deleteCommonAirConditionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除普通空调信息
     * 
     * @param id 普通空调ID
     * @return 结果
     */
    @Override
    public int deleteCommonAirConditionById(Long id)
    {
        return commonAirConditionMapper.deleteCommonAirConditionById(id);
    }
}
