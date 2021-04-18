package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.EnvironmentalMonitoring;

/**
 * 环境监控系统Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface EnvironmentalMonitoringMapper 
{
    /**
     * 查询环境监控系统
     * 
     * @param id 环境监控系统ID
     * @return 环境监控系统
     */
    public EnvironmentalMonitoring selectEnvironmentalMonitoringById(Long id);

    /**
     * 查询环境监控系统列表
     * 
     * @param environmentalMonitoring 环境监控系统
     * @return 环境监控系统集合
     */
    public List<EnvironmentalMonitoring> selectEnvironmentalMonitoringList(EnvironmentalMonitoring environmentalMonitoring);

    /**
     * 新增环境监控系统
     * 
     * @param environmentalMonitoring 环境监控系统
     * @return 结果
     */
    public int insertEnvironmentalMonitoring(EnvironmentalMonitoring environmentalMonitoring);

    /**
     * 修改环境监控系统
     * 
     * @param environmentalMonitoring 环境监控系统
     * @return 结果
     */
    public int updateEnvironmentalMonitoring(EnvironmentalMonitoring environmentalMonitoring);

    /**
     * 删除环境监控系统
     * 
     * @param id 环境监控系统ID
     * @return 结果
     */
    public int deleteEnvironmentalMonitoringById(Long id);

    /**
     * 批量删除环境监控系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEnvironmentalMonitoringByIds(String[] ids);
}
