package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Server;

/**
 * 服务器Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ServerMapper 
{
    /**
     * 查询服务器
     * 
     * @param id 服务器ID
     * @return 服务器
     */
    public Server selectServerById(Long id);

    /**
     * 查询服务器列表
     * 
     * @param server 服务器
     * @return 服务器集合
     */
    public List<Server> selectServerList(Server server);

    /**
     * 新增服务器
     * 
     * @param server 服务器
     * @return 结果
     */
    public int insertServer(Server server);

    /**
     * 修改服务器
     * 
     * @param server 服务器
     * @return 结果
     */
    public int updateServer(Server server);

    /**
     * 删除服务器
     * 
     * @param id 服务器ID
     * @return 结果
     */
    public int deleteServerById(Long id);

    /**
     * 批量删除服务器
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteServerByIds(String[] ids);
}
