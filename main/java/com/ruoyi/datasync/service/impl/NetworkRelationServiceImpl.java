package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.NetworkRelationMapper;
import com.ruoyi.datasync.domain.NetworkRelation;
import com.ruoyi.datasync.service.INetworkRelationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 网络线路关联关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class NetworkRelationServiceImpl implements INetworkRelationService 
{
    @Autowired
    private NetworkRelationMapper networkRelationMapper;

    /**
     * 查询网络线路关联关系
     * 
     * @param id 网络线路关联关系ID
     * @return 网络线路关联关系
     */
    @Override
    public NetworkRelation selectNetworkRelationById(Long id)
    {
        return networkRelationMapper.selectNetworkRelationById(id);
    }

    /**
     * 查询网络线路关联关系列表
     * 
     * @param networkRelation 网络线路关联关系
     * @return 网络线路关联关系
     */
    @Override
    public List<NetworkRelation> selectNetworkRelationList(NetworkRelation networkRelation)
    {
        return networkRelationMapper.selectNetworkRelationList(networkRelation);
    }

    /**
     * 新增网络线路关联关系
     * 
     * @param networkRelation 网络线路关联关系
     * @return 结果
     */
    @Override
    public int insertNetworkRelation(NetworkRelation networkRelation)
    {
        networkRelation.setCreateTime(DateUtils.getNowDate());
        return networkRelationMapper.insertNetworkRelation(networkRelation);
    }

    /**
     * 修改网络线路关联关系
     * 
     * @param networkRelation 网络线路关联关系
     * @return 结果
     */
    @Override
    public int updateNetworkRelation(NetworkRelation networkRelation)
    {
        networkRelation.setUpdateTime(DateUtils.getNowDate());
        return networkRelationMapper.updateNetworkRelation(networkRelation);
    }

    /**
     * 删除网络线路关联关系对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNetworkRelationByIds(String ids)
    {
        return networkRelationMapper.deleteNetworkRelationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除网络线路关联关系信息
     * 
     * @param id 网络线路关联关系ID
     * @return 结果
     */
    @Override
    public int deleteNetworkRelationById(Long id)
    {
        return networkRelationMapper.deleteNetworkRelationById(id);
    }
}
