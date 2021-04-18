package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.NetworkDataPreventionMapper;
import com.ruoyi.datasync.domain.NetworkDataPrevention;
import com.ruoyi.datasync.service.INetworkDataPreventionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 网络数据防泄漏系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class NetworkDataPreventionServiceImpl implements INetworkDataPreventionService 
{
    @Autowired
    private NetworkDataPreventionMapper networkDataPreventionMapper;

    /**
     * 查询网络数据防泄漏系统
     * 
     * @param id 网络数据防泄漏系统ID
     * @return 网络数据防泄漏系统
     */
    @Override
    public NetworkDataPrevention selectNetworkDataPreventionById(Long id)
    {
        return networkDataPreventionMapper.selectNetworkDataPreventionById(id);
    }

    /**
     * 查询网络数据防泄漏系统列表
     * 
     * @param networkDataPrevention 网络数据防泄漏系统
     * @return 网络数据防泄漏系统
     */
    @Override
    public List<NetworkDataPrevention> selectNetworkDataPreventionList(NetworkDataPrevention networkDataPrevention)
    {
        return networkDataPreventionMapper.selectNetworkDataPreventionList(networkDataPrevention);
    }

    /**
     * 新增网络数据防泄漏系统
     * 
     * @param networkDataPrevention 网络数据防泄漏系统
     * @return 结果
     */
    @Override
    public int insertNetworkDataPrevention(NetworkDataPrevention networkDataPrevention)
    {
        networkDataPrevention.setCreateTime(DateUtils.getNowDate());
        return networkDataPreventionMapper.insertNetworkDataPrevention(networkDataPrevention);
    }

    /**
     * 修改网络数据防泄漏系统
     * 
     * @param networkDataPrevention 网络数据防泄漏系统
     * @return 结果
     */
    @Override
    public int updateNetworkDataPrevention(NetworkDataPrevention networkDataPrevention)
    {
        networkDataPrevention.setUpdateTime(DateUtils.getNowDate());
        return networkDataPreventionMapper.updateNetworkDataPrevention(networkDataPrevention);
    }

    /**
     * 删除网络数据防泄漏系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNetworkDataPreventionByIds(String ids)
    {
        return networkDataPreventionMapper.deleteNetworkDataPreventionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除网络数据防泄漏系统信息
     * 
     * @param id 网络数据防泄漏系统ID
     * @return 结果
     */
    @Override
    public int deleteNetworkDataPreventionById(Long id)
    {
        return networkDataPreventionMapper.deleteNetworkDataPreventionById(id);
    }
}
