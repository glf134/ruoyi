package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.NetworkRelation;

/**
 * 网络线路关联关系Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface NetworkRelationMapper 
{
    /**
     * 查询网络线路关联关系
     * 
     * @param id 网络线路关联关系ID
     * @return 网络线路关联关系
     */
    public NetworkRelation selectNetworkRelationById(Long id);

    /**
     * 查询网络线路关联关系列表
     * 
     * @param networkRelation 网络线路关联关系
     * @return 网络线路关联关系集合
     */
    public List<NetworkRelation> selectNetworkRelationList(NetworkRelation networkRelation);

    /**
     * 新增网络线路关联关系
     * 
     * @param networkRelation 网络线路关联关系
     * @return 结果
     */
    public int insertNetworkRelation(NetworkRelation networkRelation);

    /**
     * 修改网络线路关联关系
     * 
     * @param networkRelation 网络线路关联关系
     * @return 结果
     */
    public int updateNetworkRelation(NetworkRelation networkRelation);

    /**
     * 删除网络线路关联关系
     * 
     * @param id 网络线路关联关系ID
     * @return 结果
     */
    public int deleteNetworkRelationById(Long id);

    /**
     * 批量删除网络线路关联关系
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNetworkRelationByIds(String[] ids);
}
