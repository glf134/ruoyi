package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.IntrusionAlarmMapper;
import com.ruoyi.datasync.domain.IntrusionAlarm;
import com.ruoyi.datasync.service.IIntrusionAlarmService;
import com.ruoyi.common.core.text.Convert;

/**
 * 入侵报警系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class IntrusionAlarmServiceImpl implements IIntrusionAlarmService 
{
    @Autowired
    private IntrusionAlarmMapper intrusionAlarmMapper;

    /**
     * 查询入侵报警系统
     * 
     * @param id 入侵报警系统ID
     * @return 入侵报警系统
     */
    @Override
    public IntrusionAlarm selectIntrusionAlarmById(Long id)
    {
        return intrusionAlarmMapper.selectIntrusionAlarmById(id);
    }

    /**
     * 查询入侵报警系统列表
     * 
     * @param intrusionAlarm 入侵报警系统
     * @return 入侵报警系统
     */
    @Override
    public List<IntrusionAlarm> selectIntrusionAlarmList(IntrusionAlarm intrusionAlarm)
    {
        return intrusionAlarmMapper.selectIntrusionAlarmList(intrusionAlarm);
    }

    /**
     * 新增入侵报警系统
     * 
     * @param intrusionAlarm 入侵报警系统
     * @return 结果
     */
    @Override
    public int insertIntrusionAlarm(IntrusionAlarm intrusionAlarm)
    {
        intrusionAlarm.setCreateTime(DateUtils.getNowDate());
        return intrusionAlarmMapper.insertIntrusionAlarm(intrusionAlarm);
    }

    /**
     * 修改入侵报警系统
     * 
     * @param intrusionAlarm 入侵报警系统
     * @return 结果
     */
    @Override
    public int updateIntrusionAlarm(IntrusionAlarm intrusionAlarm)
    {
        intrusionAlarm.setUpdateTime(DateUtils.getNowDate());
        return intrusionAlarmMapper.updateIntrusionAlarm(intrusionAlarm);
    }

    /**
     * 删除入侵报警系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIntrusionAlarmByIds(String ids)
    {
        return intrusionAlarmMapper.deleteIntrusionAlarmByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除入侵报警系统信息
     * 
     * @param id 入侵报警系统ID
     * @return 结果
     */
    @Override
    public int deleteIntrusionAlarmById(Long id)
    {
        return intrusionAlarmMapper.deleteIntrusionAlarmById(id);
    }
}
