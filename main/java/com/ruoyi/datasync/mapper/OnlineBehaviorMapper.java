package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.OnlineBehavior;

/**
 * 上网行为管理设备Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface OnlineBehaviorMapper 
{
    /**
     * 查询上网行为管理设备
     * 
     * @param id 上网行为管理设备ID
     * @return 上网行为管理设备
     */
    public OnlineBehavior selectOnlineBehaviorById(Long id);

    /**
     * 查询上网行为管理设备列表
     * 
     * @param onlineBehavior 上网行为管理设备
     * @return 上网行为管理设备集合
     */
    public List<OnlineBehavior> selectOnlineBehaviorList(OnlineBehavior onlineBehavior);

    /**
     * 新增上网行为管理设备
     * 
     * @param onlineBehavior 上网行为管理设备
     * @return 结果
     */
    public int insertOnlineBehavior(OnlineBehavior onlineBehavior);

    /**
     * 修改上网行为管理设备
     * 
     * @param onlineBehavior 上网行为管理设备
     * @return 结果
     */
    public int updateOnlineBehavior(OnlineBehavior onlineBehavior);

    /**
     * 删除上网行为管理设备
     * 
     * @param id 上网行为管理设备ID
     * @return 结果
     */
    public int deleteOnlineBehaviorById(Long id);

    /**
     * 批量删除上网行为管理设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOnlineBehaviorByIds(String[] ids);
}
