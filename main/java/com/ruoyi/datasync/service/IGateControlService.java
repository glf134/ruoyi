package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.GateControl;

/**
 * 出入口控制系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IGateControlService 
{
    /**
     * 查询出入口控制系统
     * 
     * @param id 出入口控制系统ID
     * @return 出入口控制系统
     */
    public GateControl selectGateControlById(Long id);

    /**
     * 查询出入口控制系统列表
     * 
     * @param gateControl 出入口控制系统
     * @return 出入口控制系统集合
     */
    public List<GateControl> selectGateControlList(GateControl gateControl);

    /**
     * 新增出入口控制系统
     * 
     * @param gateControl 出入口控制系统
     * @return 结果
     */
    public int insertGateControl(GateControl gateControl);

    /**
     * 修改出入口控制系统
     * 
     * @param gateControl 出入口控制系统
     * @return 结果
     */
    public int updateGateControl(GateControl gateControl);

    /**
     * 批量删除出入口控制系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGateControlByIds(String ids);

    /**
     * 删除出入口控制系统信息
     * 
     * @param id 出入口控制系统ID
     * @return 结果
     */
    public int deleteGateControlById(Long id);
}
