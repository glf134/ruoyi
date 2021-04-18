package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Router;

/**
 * 路由器Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface RouterMapper 
{
    /**
     * 查询路由器
     * 
     * @param id 路由器ID
     * @return 路由器
     */
    public Router selectRouterById(Long id);

    /**
     * 查询路由器列表
     * 
     * @param router 路由器
     * @return 路由器集合
     */
    public List<Router> selectRouterList(Router router);

    /**
     * 新增路由器
     * 
     * @param router 路由器
     * @return 结果
     */
    public int insertRouter(Router router);

    /**
     * 修改路由器
     * 
     * @param router 路由器
     * @return 结果
     */
    public int updateRouter(Router router);

    /**
     * 删除路由器
     * 
     * @param id 路由器ID
     * @return 结果
     */
    public int deleteRouterById(Long id);

    /**
     * 批量删除路由器
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRouterByIds(String[] ids);
}
