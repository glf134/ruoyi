package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.LoadBalancing;

/**
 * 负载均衡设备Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface LoadBalancingMapper 
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
     * 删除负载均衡设备
     * 
     * @param id 负载均衡设备ID
     * @return 结果
     */
    public int deleteLoadBalancingById(Long id);

    /**
     * 批量删除负载均衡设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoadBalancingByIds(String[] ids);
}
