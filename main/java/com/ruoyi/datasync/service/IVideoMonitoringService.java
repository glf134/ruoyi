package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.VideoMonitoring;

/**
 * 视频监控类Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IVideoMonitoringService 
{
    /**
     * 查询视频监控类
     * 
     * @param id 视频监控类ID
     * @return 视频监控类
     */
    public VideoMonitoring selectVideoMonitoringById(Long id);

    /**
     * 查询视频监控类列表
     * 
     * @param videoMonitoring 视频监控类
     * @return 视频监控类集合
     */
    public List<VideoMonitoring> selectVideoMonitoringList(VideoMonitoring videoMonitoring);

    /**
     * 新增视频监控类
     * 
     * @param videoMonitoring 视频监控类
     * @return 结果
     */
    public int insertVideoMonitoring(VideoMonitoring videoMonitoring);

    /**
     * 修改视频监控类
     * 
     * @param videoMonitoring 视频监控类
     * @return 结果
     */
    public int updateVideoMonitoring(VideoMonitoring videoMonitoring);

    /**
     * 批量删除视频监控类
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVideoMonitoringByIds(String ids);

    /**
     * 删除视频监控类信息
     * 
     * @param id 视频监控类ID
     * @return 结果
     */
    public int deleteVideoMonitoringById(Long id);
}
