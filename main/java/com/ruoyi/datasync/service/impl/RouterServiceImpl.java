package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.RouterMapper;
import com.ruoyi.datasync.domain.Router;
import com.ruoyi.datasync.service.IRouterService;
import com.ruoyi.common.core.text.Convert;

/**
 * 路由器Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class RouterServiceImpl implements IRouterService 
{
    @Autowired
    private RouterMapper routerMapper;

    /**
     * 查询路由器
     * 
     * @param id 路由器ID
     * @return 路由器
     */
    @Override
    public Router selectRouterById(Long id)
    {
        return routerMapper.selectRouterById(id);
    }

    /**
     * 查询路由器列表
     * 
     * @param router 路由器
     * @return 路由器
     */
    @Override
    public List<Router> selectRouterList(Router router)
    {
        return routerMapper.selectRouterList(router);
    }

    /**
     * 新增路由器
     * 
     * @param router 路由器
     * @return 结果
     */
    @Override
    public int insertRouter(Router router)
    {
        router.setCreateTime(DateUtils.getNowDate());
        return routerMapper.insertRouter(router);
    }

    /**
     * 修改路由器
     * 
     * @param router 路由器
     * @return 结果
     */
    @Override
    public int updateRouter(Router router)
    {
        router.setUpdateTime(DateUtils.getNowDate());
        return routerMapper.updateRouter(router);
    }

    /**
     * 删除路由器对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRouterByIds(String ids)
    {
        return routerMapper.deleteRouterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除路由器信息
     * 
     * @param id 路由器ID
     * @return 结果
     */
    @Override
    public int deleteRouterById(Long id)
    {
        return routerMapper.deleteRouterById(id);
    }
}
