package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.LowVoltage;

/**
 * 低压配电Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface LowVoltageMapper 
{
    /**
     * 查询低压配电
     * 
     * @param id 低压配电ID
     * @return 低压配电
     */
    public LowVoltage selectLowVoltageById(Long id);

    /**
     * 查询低压配电列表
     * 
     * @param lowVoltage 低压配电
     * @return 低压配电集合
     */
    public List<LowVoltage> selectLowVoltageList(LowVoltage lowVoltage);

    /**
     * 新增低压配电
     * 
     * @param lowVoltage 低压配电
     * @return 结果
     */
    public int insertLowVoltage(LowVoltage lowVoltage);

    /**
     * 修改低压配电
     * 
     * @param lowVoltage 低压配电
     * @return 结果
     */
    public int updateLowVoltage(LowVoltage lowVoltage);

    /**
     * 删除低压配电
     * 
     * @param id 低压配电ID
     * @return 结果
     */
    public int deleteLowVoltageById(Long id);

    /**
     * 批量删除低压配电
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLowVoltageByIds(String[] ids);
}
