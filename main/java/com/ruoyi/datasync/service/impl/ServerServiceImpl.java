package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.ServerMapper;
import com.ruoyi.datasync.domain.Server;
import com.ruoyi.datasync.service.IServerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 服务器Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class ServerServiceImpl implements IServerService 
{
    @Autowired
    private ServerMapper serverMapper;

    /**
     * 查询服务器
     * 
     * @param id 服务器ID
     * @return 服务器
     */
    @Override
    public Server selectServerById(Long id)
    {
        return serverMapper.selectServerById(id);
    }

    /**
     * 查询服务器列表
     * 
     * @param server 服务器
     * @return 服务器
     */
    @Override
    public List<Server> selectServerList(Server server)
    {
        return serverMapper.selectServerList(server);
    }

    /**
     * 新增服务器
     * 
     * @param server 服务器
     * @return 结果
     */
    @Override
    public int insertServer(Server server)
    {
        server.setCreateTime(DateUtils.getNowDate());
        return serverMapper.insertServer(server);
    }

    /**
     * 修改服务器
     * 
     * @param server 服务器
     * @return 结果
     */
    @Override
    public int updateServer(Server server)
    {
        server.setUpdateTime(DateUtils.getNowDate());
        return serverMapper.updateServer(server);
    }

    /**
     * 删除服务器对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteServerByIds(String ids)
    {
        return serverMapper.deleteServerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除服务器信息
     * 
     * @param id 服务器ID
     * @return 结果
     */
    @Override
    public int deleteServerById(Long id)
    {
        return serverMapper.deleteServerById(id);
    }
}
