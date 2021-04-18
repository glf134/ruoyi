package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.LoadBalancing;

/**
 * 负载均衡设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ILoadBalancingService 
{
    /**
     * 查询负载均衡设备
     * 
     * @param id 负载均衡设备ID
     * @return 负载均衡设备
     */
    public LoadBalancing selectLoadBalancingById(Long id);

    /**
     * 查询负载均衡设备列表
     * 
     * @param loadBalancing 负载均衡设备
     * @return 负载均衡设备集合
     */
    public List<LoadBalancing> selectLoadBalancingList(LoadBalancing loadBalancing);

    /**
     * 新增负载均衡设备
     * 
     * @param loadBalancing 负载均衡设备
     * @return 结果
     */
    public int insertLoadBalancing(LoadBalancing loadBalancing);

    /**
     * 修改负载均衡设备
     * 
     * @param loadBalancing 负载均衡设备
     * @return 结果
     */
    public int updateLoadBalancing(LoadBalancing loadBalancing);

    /**
     * 批量删除负载均衡设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoadBalancingByIds(String ids);

    /**
     * 删除负载均衡设备信息
     * 
     * @param id 负载均衡设备ID
     * @return 结果
     */
    public int deleteLoadBalancingById(Long id);
}
