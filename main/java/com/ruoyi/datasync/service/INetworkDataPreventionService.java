package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.NetworkDataPrevention;

/**
 * 网络数据防泄漏系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface INetworkDataPreventionService 
{
    /**
     * 查询网络数据防泄漏系统
     * 
     * @param id 网络数据防泄漏系统ID
     * @return 网络数据防泄漏系统
     */
    public NetworkDataPrevention selectNetworkDataPreventionById(Long id);

    /**
     * 查询网络数据防泄漏系统列表
     * 
     * @param networkDataPrevention 网络数据防泄漏系统
     * @return 网络数据防泄漏系统集合
     */
    public List<NetworkDataPrevention> selectNetworkDataPreventionList(NetworkDataPrevention networkDataPrevention);

    /**
     * 新增网络数据防泄漏系统
     * 
     * @param networkDataPrevention 网络数据防泄漏系统
     * @return 结果
     */
    public int insertNetworkDataPrevention(NetworkDataPrevention networkDataPrevention);

    /**
     * 修改网络数据防泄漏系统
     * 
     * @param networkDataPrevention 网络数据防泄漏系统
     * @return 结果
     */
    public int updateNetworkDataPrevention(NetworkDataPrevention networkDataPrevention);

    /**
     * 批量删除网络数据防泄漏系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNetworkDataPreventionByIds(String ids);

    /**
     * 删除网络数据防泄漏系统信息
     * 
     * @param id 网络数据防泄漏系统ID
     * @return 结果
     */
    public int deleteNetworkDataPreventionById(Long id);
}
