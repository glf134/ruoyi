package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.UninterruptedMapper;
import com.ruoyi.datasync.domain.Uninterrupted;
import com.ruoyi.datasync.service.IUninterruptedService;
import com.ruoyi.common.core.text.Convert;

/**
 * 不间断配电Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class UninterruptedServiceImpl implements IUninterruptedService 
{
    @Autowired
    private UninterruptedMapper uninterruptedMapper;

    /**
     * 查询不间断配电
     * 
     * @param id 不间断配电ID
     * @return 不间断配电
     */
    @Override
    public Uninterrupted selectUninterruptedById(Long id)
    {
        return uninterruptedMapper.selectUninterruptedById(id);
    }

    /**
     * 查询不间断配电列表
     * 
     * @param uninterrupted 不间断配电
     * @return 不间断配电
     */
    @Override
    public List<Uninterrupted> selectUninterruptedList(Uninterrupted uninterrupted)
    {
        return uninterruptedMapper.selectUninterruptedList(uninterrupted);
    }

    /**
     * 新增不间断配电
     * 
     * @param uninterrupted 不间断配电
     * @return 结果
     */
    @Override
    public int insertUninterrupted(Uninterrupted uninterrupted)
    {
        uninterrupted.setCreateTime(DateUtils.getNowDate());
        return uninterruptedMapper.insertUninterrupted(uninterrupted);
    }

    /**
     * 修改不间断配电
     * 
     * @param uninterrupted 不间断配电
     * @return 结果
     */
    @Override
    public int updateUninterrupted(Uninterrupted uninterrupted)
    {
        uninterrupted.setUpdateTime(DateUtils.getNowDate());
        return uninterruptedMapper.updateUninterrupted(uninterrupted);
    }

    /**
     * 删除不间断配电对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUninterruptedByIds(String ids)
    {
        return uninterruptedMapper.deleteUninterruptedByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除不间断配电信息
     * 
     * @param id 不间断配电ID
     * @return 结果
     */
    @Override
    public int deleteUninterruptedById(Long id)
    {
        return uninterruptedMapper.deleteUninterruptedById(id);
    }
}
