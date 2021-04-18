package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.FiberSwitch;

/**
 * 光纤交换机Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IFiberSwitchService 
{
    /**
     * 查询光纤交换机
     * 
     * @param id 光纤交换机ID
     * @return 光纤交换机
     */
    public FiberSwitch selectFiberSwitchById(Long id);

    /**
     * 查询光纤交换机列表
     * 
     * @param fiberSwitch 光纤交换机
     * @return 光纤交换机集合
     */
    public List<FiberSwitch> selectFiberSwitchList(FiberSwitch fiberSwitch);

    /**
     * 新增光纤交换机
     * 
     * @param fiberSwitch 光纤交换机
     * @return 结果
     */
    public int insertFiberSwitch(FiberSwitch fiberSwitch);

    /**
     * 修改光纤交换机
     * 
     * @param fiberSwitch 光纤交换机
     * @return 结果
     */
    public int updateFiberSwitch(FiberSwitch fiberSwitch);

    /**
     * 批量删除光纤交换机
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFiberSwitchByIds(String ids);

    /**
     * 删除光纤交换机信息
     * 
     * @param id 光纤交换机ID
     * @return 结果
     */
    public int deleteFiberSwitchById(Long id);
}
