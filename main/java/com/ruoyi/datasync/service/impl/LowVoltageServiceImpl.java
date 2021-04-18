package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.LowVoltageMapper;
import com.ruoyi.datasync.domain.LowVoltage;
import com.ruoyi.datasync.service.ILowVoltageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 低压配电Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class LowVoltageServiceImpl implements ILowVoltageService 
{
    @Autowired
    private LowVoltageMapper lowVoltageMapper;

    /**
     * 查询低压配电
     * 
     * @param id 低压配电ID
     * @return 低压配电
     */
    @Override
    public LowVoltage selectLowVoltageById(Long id)
    {
        return lowVoltageMapper.selectLowVoltageById(id);
    }

    /**
     * 查询低压配电列表
     * 
     * @param lowVoltage 低压配电
     * @return 低压配电
     */
    @Override
    public List<LowVoltage> selectLowVoltageList(LowVoltage lowVoltage)
    {
        return lowVoltageMapper.selectLowVoltageList(lowVoltage);
    }

    /**
     * 新增低压配电
     * 
     * @param lowVoltage 低压配电
     * @return 结果
     */
    @Override
    public int insertLowVoltage(LowVoltage lowVoltage)
    {
        lowVoltage.setCreateTime(DateUtils.getNowDate());
        return lowVoltageMapper.insertLowVoltage(lowVoltage);
    }

    /**
     * 修改低压配电
     * 
     * @param lowVoltage 低压配电
     * @return 结果
     */
    @Override
    public int updateLowVoltage(LowVoltage lowVoltage)
    {
        lowVoltage.setUpdateTime(DateUtils.getNowDate());
        return lowVoltageMapper.updateLowVoltage(lowVoltage);
    }

    /**
     * 删除低压配电对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLowVoltageByIds(String ids)
    {
        return lowVoltageMapper.deleteLowVoltageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除低压配电信息
     * 
     * @param id 低压配电ID
     * @return 结果
     */
    @Override
    public int deleteLowVoltageById(Long id)
    {
        return lowVoltageMapper.deleteLowVoltageById(id);
    }
}
