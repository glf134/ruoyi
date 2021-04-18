package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.LoadBalancingMapper;
import com.ruoyi.datasync.domain.LoadBalancing;
import com.ruoyi.datasync.service.ILoadBalancingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 负载均衡设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class LoadBalancingServiceImpl implements ILoadBalancingService 
{
    @Autowired
    private LoadBalancingMapper loadBalancingMapper;

    /**
     * 查询负载均衡设备
     * 
     * @param id 负载均衡设备ID
     * @return 负载均衡设备
     */
    @Override
    public LoadBalancing selectLoadBalancingById(Long id)
    {
        return loadBalancingMapper.selectLoadBalancingById(id);
    }

    /**
     * 查询负载均衡设备列表
     * 
     * @param loadBalancing 负载均衡设备
     * @return 负载均衡设备
     */
    @Override
    public List<LoadBalancing> selectLoadBalancingList(LoadBalancing loadBalancing)
    {
        return loadBalancingMapper.selectLoadBalancingList(loadBalancing);
    }

    /**
     * 新增负载均衡设备
     * 
     * @param loadBalancing 负载均衡设备
     * @return 结果
     */
    @Override
    public int insertLoadBalancing(LoadBalancing loadBalancing)
    {
        loadBalancing.setCreateTime(DateUtils.getNowDate());
        return loadBalancingMapper.insertLoadBalancing(loadBalancing);
    }

    /**
     * 修改负载均衡设备
     * 
     * @param loadBalancing 负载均衡设备
     * @return 结果
     */
    @Override
    public int updateLoadBalancing(LoadBalancing loadBalancing)
    {
        loadBalancing.setUpdateTime(DateUtils.getNowDate());
        return loadBalancingMapper.updateLoadBalancing(loadBalancing);
    }

    /**
     * 删除负载均衡设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoadBalancingByIds(String ids)
    {
        return loadBalancingMapper.deleteLoadBalancingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除负载均衡设备信息
     * 
     * @param id 负载均衡设备ID
     * @return 结果
     */
    @Override
    public int deleteLoadBalancingById(Long id)
    {
        return loadBalancingMapper.deleteLoadBalancingById(id);
    }
}
