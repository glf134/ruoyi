package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.HighVoltageMapper;
import com.ruoyi.datasync.domain.HighVoltage;
import com.ruoyi.datasync.service.IHighVoltageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 高压配电设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class HighVoltageServiceImpl implements IHighVoltageService 
{
    @Autowired
    private HighVoltageMapper highVoltageMapper;

    /**
     * 查询高压配电设备
     * 
     * @param id 高压配电设备ID
     * @return 高压配电设备
     */
    @Override
    public HighVoltage selectHighVoltageById(Long id)
    {
        return highVoltageMapper.selectHighVoltageById(id);
    }

    /**
     * 查询高压配电设备列表
     * 
     * @param highVoltage 高压配电设备
     * @return 高压配电设备
     */
    @Override
    public List<HighVoltage> selectHighVoltageList(HighVoltage highVoltage)
    {
        return highVoltageMapper.selectHighVoltageList(highVoltage);
    }

    /**
     * 新增高压配电设备
     * 
     * @param highVoltage 高压配电设备
     * @return 结果
     */
    @Override
    public int insertHighVoltage(HighVoltage highVoltage)
    {
        highVoltage.setCreateTime(DateUtils.getNowDate());
        return highVoltageMapper.insertHighVoltage(highVoltage);
    }

    /**
     * 修改高压配电设备
     * 
     * @param highVoltage 高压配电设备
     * @return 结果
     */
    @Override
    public int updateHighVoltage(HighVoltage highVoltage)
    {
        highVoltage.setUpdateTime(DateUtils.getNowDate());
        return highVoltageMapper.updateHighVoltage(highVoltage);
    }

    /**
     * 删除高压配电设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteHighVoltageByIds(String ids)
    {
        return highVoltageMapper.deleteHighVoltageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高压配电设备信息
     * 
     * @param id 高压配电设备ID
     * @return 结果
     */
    @Override
    public int deleteHighVoltageById(Long id)
    {
        return highVoltageMapper.deleteHighVoltageById(id);
    }
}
