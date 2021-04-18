package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Humidification;

/**
 * 加湿系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IHumidificationService 
{
    /**
     * 查询加湿系统
     * 
     * @param id 加湿系统ID
     * @return 加湿系统
     */
    public Humidification selectHumidificationById(Long id);

    /**
     * 查询加湿系统列表
     * 
     * @param humidification 加湿系统
     * @return 加湿系统集合
     */
    public List<Humidification> selectHumidificationList(Humidification humidification);

    /**
     * 新增加湿系统
     * 
     * @param humidification 加湿系统
     * @return 结果
     */
    public int insertHumidification(Humidification humidification);

    /**
     * 修改加湿系统
     * 
     * @param humidification 加湿系统
     * @return 结果
     */
    public int updateHumidification(Humidification humidification);

    /**
     * 批量删除加湿系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHumidificationByIds(String ids);

    /**
     * 删除加湿系统信息
     * 
     * @param id 加湿系统ID
     * @return 结果
     */
    public int deleteHumidificationById(Long id);
}
