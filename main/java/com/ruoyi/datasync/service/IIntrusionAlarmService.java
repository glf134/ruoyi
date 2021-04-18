package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.IntrusionAlarm;

/**
 * 入侵报警系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IIntrusionAlarmService 
{
    /**
     * 查询入侵报警系统
     * 
     * @param id 入侵报警系统ID
     * @return 入侵报警系统
     */
    public IntrusionAlarm selectIntrusionAlarmById(Long id);

    /**
     * 查询入侵报警系统列表
     * 
     * @param intrusionAlarm 入侵报警系统
     * @return 入侵报警系统集合
     */
    public List<IntrusionAlarm> selectIntrusionAlarmList(IntrusionAlarm intrusionAlarm);

    /**
     * 新增入侵报警系统
     * 
     * @param intrusionAlarm 入侵报警系统
     * @return 结果
     */
    public int insertIntrusionAlarm(IntrusionAlarm intrusionAlarm);

    /**
     * 修改入侵报警系统
     * 
     * @param intrusionAlarm 入侵报警系统
     * @return 结果
     */
    public int updateIntrusionAlarm(IntrusionAlarm intrusionAlarm);

    /**
     * 批量删除入侵报警系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteIntrusionAlarmByIds(String ids);

    /**
     * 删除入侵报警系统信息
     * 
     * @param id 入侵报警系统ID
     * @return 结果
     */
    public int deleteIntrusionAlarmById(Long id);
}
