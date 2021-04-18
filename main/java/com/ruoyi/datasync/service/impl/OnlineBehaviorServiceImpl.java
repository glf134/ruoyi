package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.OnlineBehaviorMapper;
import com.ruoyi.datasync.domain.OnlineBehavior;
import com.ruoyi.datasync.service.IOnlineBehaviorService;
import com.ruoyi.common.core.text.Convert;

/**
 * 上网行为管理设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class OnlineBehaviorServiceImpl implements IOnlineBehaviorService 
{
    @Autowired
    private OnlineBehaviorMapper onlineBehaviorMapper;

    /**
     * 查询上网行为管理设备
     * 
     * @param id 上网行为管理设备ID
     * @return 上网行为管理设备
     */
    @Override
    public OnlineBehavior selectOnlineBehaviorById(Long id)
    {
        return onlineBehaviorMapper.selectOnlineBehaviorById(id);
    }

    /**
     * 查询上网行为管理设备列表
     * 
     * @param onlineBehavior 上网行为管理设备
     * @return 上网行为管理设备
     */
    @Override
    public List<OnlineBehavior> selectOnlineBehaviorList(OnlineBehavior onlineBehavior)
    {
        return onlineBehaviorMapper.selectOnlineBehaviorList(onlineBehavior);
    }

    /**
     * 新增上网行为管理设备
     * 
     * @param onlineBehavior 上网行为管理设备
     * @return 结果
     */
    @Override
    public int insertOnlineBehavior(OnlineBehavior onlineBehavior)
    {
        onlineBehavior.setCreateTime(DateUtils.getNowDate());
        return onlineBehaviorMapper.insertOnlineBehavior(onlineBehavior);
    }

    /**
     * 修改上网行为管理设备
     * 
     * @param onlineBehavior 上网行为管理设备
     * @return 结果
     */
    @Override
    public int updateOnlineBehavior(OnlineBehavior onlineBehavior)
    {
        onlineBehavior.setUpdateTime(DateUtils.getNowDate());
        return onlineBehaviorMapper.updateOnlineBehavior(onlineBehavior);
    }

    /**
     * 删除上网行为管理设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOnlineBehaviorByIds(String ids)
    {
        return onlineBehaviorMapper.deleteOnlineBehaviorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除上网行为管理设备信息
     * 
     * @param id 上网行为管理设备ID
     * @return 结果
     */
    @Override
    public int deleteOnlineBehaviorById(Long id)
    {
        return onlineBehaviorMapper.deleteOnlineBehaviorById(id);
    }
}
