package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.HighVoltage;

/**
 * 高压配电设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IHighVoltageService 
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
     * 批量删除高压配电设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHighVoltageByIds(String ids);

    /**
     * 删除高压配电设备信息
     * 
     * @param id 高压配电设备ID
     * @return 结果
     */
    public int deleteHighVoltageById(Long id);
}
