package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.NetworkLine;

/**
 * 网络线路Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface NetworkLineMapper 
{
    /**
     * 查询网络线路
     * 
     * @param id 网络线路ID
     * @return 网络线路
     */
    public NetworkLine selectNetworkLineById(Long id);

    /**
     * 查询网络线路列表
     * 
     * @param networkLine 网络线路
     * @return 网络线路集合
     */
    public List<NetworkLine> selectNetworkLineList(NetworkLine networkLine);

    /**
     * 新增网络线路
     * 
     * @param networkLine 网络线路
     * @return 结果
     */
    public int insertNetworkLine(NetworkLine networkLine);

    /**
     * 修改网络线路
     * 
     * @param networkLine 网络线路
     * @return 结果
     */
    public int updateNetworkLine(NetworkLine networkLine);

    /**
     * 删除网络线路
     * 
     * @param id 网络线路ID
     * @return 结果
     */
    public int deleteNetworkLineById(Long id);

    /**
     * 批量删除网络线路
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNetworkLineByIds(String[] ids);
}
