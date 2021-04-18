package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.FireProtection;

/**
 * 消防系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IFireProtectionService 
{
    /**
     * 查询消防系统
     * 
     * @param id 消防系统ID
     * @return 消防系统
     */
    public FireProtection selectFireProtectionById(Long id);

    /**
     * 查询消防系统列表
     * 
     * @param fireProtection 消防系统
     * @return 消防系统集合
     */
    public List<FireProtection> selectFireProtectionList(FireProtection fireProtection);

    /**
     * 新增消防系统
     * 
     * @param fireProtection 消防系统
     * @return 结果
     */
    public int insertFireProtection(FireProtection fireProtection);

    /**
     * 修改消防系统
     * 
     * @param fireProtection 消防系统
     * @return 结果
     */
    public int updateFireProtection(FireProtection fireProtection);

    /**
     * 批量删除消防系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFireProtectionByIds(String ids);

    /**
     * 删除消防系统信息
     * 
     * @param id 消防系统ID
     * @return 结果
     */
    public int deleteFireProtectionById(Long id);
}
