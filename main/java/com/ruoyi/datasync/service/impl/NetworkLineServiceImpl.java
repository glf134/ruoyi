package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.NetworkLineMapper;
import com.ruoyi.datasync.domain.NetworkLine;
import com.ruoyi.datasync.service.INetworkLineService;
import com.ruoyi.common.core.text.Convert;

/**
 * 网络线路Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class NetworkLineServiceImpl implements INetworkLineService 
{
    @Autowired
    private NetworkLineMapper networkLineMapper;

    /**
     * 查询网络线路
     * 
     * @param id 网络线路ID
     * @return 网络线路
     */
    @Override
    public NetworkLine selectNetworkLineById(Long id)
    {
        return networkLineMapper.selectNetworkLineById(id);
    }

    /**
     * 查询网络线路列表
     * 
     * @param networkLine 网络线路
     * @return 网络线路
     */
    @Override
    public List<NetworkLine> selectNetworkLineList(NetworkLine networkLine)
    {
        return networkLineMapper.selectNetworkLineList(networkLine);
    }

    /**
     * 新增网络线路
     * 
     * @param networkLine 网络线路
     * @return 结果
     */
    @Override
    public int insertNetworkLine(NetworkLine networkLine)
    {
        networkLine.setCreateTime(DateUtils.getNowDate());
        return networkLineMapper.insertNetworkLine(networkLine);
    }

    /**
     * 修改网络线路
     * 
     * @param networkLine 网络线路
     * @return 结果
     */
    @Override
    public int updateNetworkLine(NetworkLine networkLine)
    {
        networkLine.setUpdateTime(DateUtils.getNowDate());
        return networkLineMapper.updateNetworkLine(networkLine);
    }

    /**
     * 删除网络线路对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNetworkLineByIds(String ids)
    {
        return networkLineMapper.deleteNetworkLineByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除网络线路信息
     * 
     * @param id 网络线路ID
     * @return 结果
     */
    @Override
    public int deleteNetworkLineById(Long id)
    {
        return networkLineMapper.deleteNetworkLineById(id);
    }
}
