package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.VideoMonitoringMapper;
import com.ruoyi.datasync.domain.VideoMonitoring;
import com.ruoyi.datasync.service.IVideoMonitoringService;
import com.ruoyi.common.core.text.Convert;

/**
 * 视频监控类Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class VideoMonitoringServiceImpl implements IVideoMonitoringService 
{
    @Autowired
    private VideoMonitoringMapper videoMonitoringMapper;

    /**
     * 查询视频监控类
     * 
     * @param id 视频监控类ID
     * @return 视频监控类
     */
    @Override
    public VideoMonitoring selectVideoMonitoringById(Long id)
    {
        return videoMonitoringMapper.selectVideoMonitoringById(id);
    }

    /**
     * 查询视频监控类列表
     * 
     * @param videoMonitoring 视频监控类
     * @return 视频监控类
     */
    @Override
    public List<VideoMonitoring> selectVideoMonitoringList(VideoMonitoring videoMonitoring)
    {
        return videoMonitoringMapper.selectVideoMonitoringList(videoMonitoring);
    }

    /**
     * 新增视频监控类
     * 
     * @param videoMonitoring 视频监控类
     * @return 结果
     */
    @Override
    public int insertVideoMonitoring(VideoMonitoring videoMonitoring)
    {
        videoMonitoring.setCreateTime(DateUtils.getNowDate());
        return videoMonitoringMapper.insertVideoMonitoring(videoMonitoring);
    }

    /**
     * 修改视频监控类
     * 
     * @param videoMonitoring 视频监控类
     * @return 结果
     */
    @Override
    public int updateVideoMonitoring(VideoMonitoring videoMonitoring)
    {
        videoMonitoring.setUpdateTime(DateUtils.getNowDate());
        return videoMonitoringMapper.updateVideoMonitoring(videoMonitoring);
    }

    /**
     * 删除视频监控类对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVideoMonitoringByIds(String ids)
    {
        return videoMonitoringMapper.deleteVideoMonitoringByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除视频监控类信息
     * 
     * @param id 视频监控类ID
     * @return 结果
     */
    @Override
    public int deleteVideoMonitoringById(Long id)
    {
        return videoMonitoringMapper.deleteVideoMonitoringById(id);
    }
}
