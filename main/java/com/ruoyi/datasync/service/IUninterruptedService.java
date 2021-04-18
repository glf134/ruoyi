package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Uninterrupted;

/**
 * 不间断配电Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IUninterruptedService 
{
    /**
     * 查询不间断配电
     * 
     * @param id 不间断配电ID
     * @return 不间断配电
     */
    public Uninterrupted selectUninterruptedById(Long id);

    /**
     * 查询不间断配电列表
     * 
     * @param uninterrupted 不间断配电
     * @return 不间断配电集合
     */
    public List<Uninterrupted> selectUninterruptedList(Uninterrupted uninterrupted);

    /**
     * 新增不间断配电
     * 
     * @param uninterrupted 不间断配电
     * @return 结果
     */
    public int insertUninterrupted(Uninterrupted uninterrupted);

    /**
     * 修改不间断配电
     * 
     * @param uninterrupted 不间断配电
     * @return 结果
     */
    public int updateUninterrupted(Uninterrupted uninterrupted);

    /**
     * 批量删除不间断配电
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUninterruptedByIds(String ids);

    /**
     * 删除不间断配电信息
     * 
     * @param id 不间断配电ID
     * @return 结果
     */
    public int deleteUninterruptedById(Long id);
}
