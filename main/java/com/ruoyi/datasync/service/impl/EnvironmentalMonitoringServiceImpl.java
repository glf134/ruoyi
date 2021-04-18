package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.EnvironmentalMonitoringMapper;
import com.ruoyi.datasync.domain.EnvironmentalMonitoring;
import com.ruoyi.datasync.service.IEnvironmentalMonitoringService;
import com.ruoyi.common.core.text.Convert;

/**
 * 环境监控系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class EnvironmentalMonitoringServiceImpl implements IEnvironmentalMonitoringService 
{
    @Autowired
    private EnvironmentalMonitoringMapper environmentalMonitoringMapper;

    /**
     * 查询环境监控系统
     * 
     * @param id 环境监控系统ID
     * @return 环境监控系统
     */
    @Override
    public EnvironmentalMonitoring selectEnvironmentalMonitoringById(Long id)
    {
        return environmentalMonitoringMapper.selectEnvironmentalMonitoringById(id);
    }

    /**
     * 查询环境监控系统列表
     * 
     * @param environmentalMonitoring 环境监控系统
     * @return 环境监控系统
     */
    @Override
    public List<EnvironmentalMonitoring> selectEnvironmentalMonitoringList(EnvironmentalMonitoring environmentalMonitoring)
    {
        return environmentalMonitoringMapper.selectEnvironmentalMonitoringList(environmentalMonitoring);
    }

    /**
     * 新增环境监控系统
     * 
     * @param environmentalMonitoring 环境监控系统
     * @return 结果
     */
    @Override
    public int insertEnvironmentalMonitoring(EnvironmentalMonitoring environmentalMonitoring)
    {
        environmentalMonitoring.setCreateTime(DateUtils.getNowDate());
        return environmentalMonitoringMapper.insertEnvironmentalMonitoring(environmentalMonitoring);
    }

    /**
     * 修改环境监控系统
     * 
     * @param environmentalMonitoring 环境监控系统
     * @return 结果
     */
    @Override
    public int updateEnvironmentalMonitoring(EnvironmentalMonitoring environmentalMonitoring)
    {
        environmentalMonitoring.setUpdateTime(DateUtils.getNowDate());
        return environmentalMonitoringMapper.updateEnvironmentalMonitoring(environmentalMonitoring);
    }

    /**
     * 删除环境监控系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEnvironmentalMonitoringByIds(String ids)
    {
        return environmentalMonitoringMapper.deleteEnvironmentalMonitoringByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除环境监控系统信息
     * 
     * @param id 环境监控系统ID
     * @return 结果
     */
    @Override
    public int deleteEnvironmentalMonitoringById(Long id)
    {
        return environmentalMonitoringMapper.deleteEnvironmentalMonitoringById(id);
    }
}
