package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.HumidificationMapper;
import com.ruoyi.datasync.domain.Humidification;
import com.ruoyi.datasync.service.IHumidificationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 加湿系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class HumidificationServiceImpl implements IHumidificationService 
{
    @Autowired
    private HumidificationMapper humidificationMapper;

    /**
     * 查询加湿系统
     * 
     * @param id 加湿系统ID
     * @return 加湿系统
     */
    @Override
    public Humidification selectHumidificationById(Long id)
    {
        return humidificationMapper.selectHumidificationById(id);
    }

    /**
     * 查询加湿系统列表
     * 
     * @param humidification 加湿系统
     * @return 加湿系统
     */
    @Override
    public List<Humidification> selectHumidificationList(Humidification humidification)
    {
        return humidificationMapper.selectHumidificationList(humidification);
    }

    /**
     * 新增加湿系统
     * 
     * @param humidification 加湿系统
     * @return 结果
     */
    @Override
    public int insertHumidification(Humidification humidification)
    {
        humidification.setCreateTime(DateUtils.getNowDate());
        return humidificationMapper.insertHumidification(humidification);
    }

    /**
     * 修改加湿系统
     * 
     * @param humidification 加湿系统
     * @return 结果
     */
    @Override
    public int updateHumidification(Humidification humidification)
    {
        humidification.setUpdateTime(DateUtils.getNowDate());
        return humidificationMapper.updateHumidification(humidification);
    }

    /**
     * 删除加湿系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteHumidificationByIds(String ids)
    {
        return humidificationMapper.deleteHumidificationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除加湿系统信息
     * 
     * @param id 加湿系统ID
     * @return 结果
     */
    @Override
    public int deleteHumidificationById(Long id)
    {
        return humidificationMapper.deleteHumidificationById(id);
    }
}
