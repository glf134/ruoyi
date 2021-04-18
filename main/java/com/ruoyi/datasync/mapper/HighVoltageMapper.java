package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.HighVoltage;

/**
 * 高压配电设备Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface HighVoltageMapper 
{
    /**
     * 查询高压配电设备
     * 
     * @param id 高压配电设备ID
     * @return 高压配电设备
     */
    public HighVoltage selectHighVoltageById(Long id);

    /**
     * 查询高压配电设备列表
     * 
     * @param highVoltage 高压配电设备
     * @return 高压配电设备集合
     */
    public List<HighVoltage> selectHighVoltageList(HighVoltage highVoltage);

    /**
     * 新增高压配电设备
     * 
     * @param highVoltage 高压配电设备
     * @return 结果
     */
    public int insertHighVoltage(HighVoltage highVoltage);

    /**
     * 修改高压配电设备
     * 
     * @param highVoltage 高压配电设备
     * @return 结果
     */
    public int updateHighVoltage(HighVoltage highVoltage);

    /**
     * 删除高压配电设备
     * 
     * @param id 高压配电设备ID
     * @return 结果
     */
    public int deleteHighVoltageById(Long id);

    /**
     * 批量删除高压配电设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHighVoltageByIds(String[] ids);
}
