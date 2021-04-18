package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Switches;

/**
 * 交换机Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ISwitchesService 
{
    /**
     * 查询交换机
     * 
     * @param id 交换机ID
     * @return 交换机
     */
    public Switches selectSwitchesById(Long id);

    /**
     * 查询交换机列表
     * 
     * @param switches 交换机
     * @return 交换机集合
     */
    public List<Switches> selectSwitchesList(Switches switches);

    /**
     * 新增交换机
     * 
     * @param switches 交换机
     * @return 结果
     */
    public int insertSwitches(Switches switches);

    /**
     * 修改交换机
     * 
     * @param switches 交换机
     * @return 结果
     */
    public int updateSwitches(Switches switches);

    /**
     * 批量删除交换机
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSwitchesByIds(String ids);

    /**
     * 删除交换机信息
     * 
     * @param id 交换机ID
     * @return 结果
     */
    public int deleteSwitchesById(Long id);
}
