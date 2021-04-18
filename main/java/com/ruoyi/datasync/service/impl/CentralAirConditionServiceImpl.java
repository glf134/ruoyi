package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.CentralAirConditionMapper;
import com.ruoyi.datasync.domain.CentralAirCondition;
import com.ruoyi.datasync.service.ICentralAirConditionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 中央空调Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class CentralAirConditionServiceImpl implements ICentralAirConditionService 
{
    @Autowired
    private CentralAirConditionMapper centralAirConditionMapper;

    /**
     * 查询中央空调
     * 
     * @param id 中央空调ID
     * @return 中央空调
     */
    @Override
    public CentralAirCondition selectCentralAirConditionById(Long id)
    {
        return centralAirConditionMapper.selectCentralAirConditionById(id);
    }

    /**
     * 查询中央空调列表
     * 
     * @param centralAirCondition 中央空调
     * @return 中央空调
     */
    @Override
    public List<CentralAirCondition> selectCentralAirConditionList(CentralAirCondition centralAirCondition)
    {
        return centralAirConditionMapper.selectCentralAirConditionList(centralAirCondition);
    }

    /**
     * 新增中央空调
     * 
     * @param centralAirCondition 中央空调
     * @return 结果
     */
    @Override
    public int insertCentralAirCondition(CentralAirCondition centralAirCondition)
    {
        centralAirCondition.setCreateTime(DateUtils.getNowDate());
        return centralAirConditionMapper.insertCentralAirCondition(centralAirCondition);
    }

    /**
     * 修改中央空调
     * 
     * @param centralAirCondition 中央空调
     * @return 结果
     */
    @Override
    public int updateCentralAirCondition(CentralAirCondition centralAirCondition)
    {
        centralAirCondition.setUpdateTime(DateUtils.getNowDate());
        return centralAirConditionMapper.updateCentralAirCondition(centralAirCondition);
    }

    /**
     * 删除中央空调对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCentralAirConditionByIds(String ids)
    {
        return centralAirConditionMapper.deleteCentralAirConditionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除中央空调信息
     * 
     * @param id 中央空调ID
     * @return 结果
     */
    @Override
    public int deleteCentralAirConditionById(Long id)
    {
        return centralAirConditionMapper.deleteCentralAirConditionById(id);
    }
}
