package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.SafetyPlatform;

/**
 * 安全管理平台Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface SafetyPlatformMapper 
{
    /**
     * 查询安全管理平台
     * 
     * @param id 安全管理平台ID
     * @return 安全管理平台
     */
    public SafetyPlatform selectSafetyPlatformById(Long id);

    /**
     * 查询安全管理平台列表
     * 
     * @param safetyPlatform 安全管理平台
     * @return 安全管理平台集合
     */
    public List<SafetyPlatform> selectSafetyPlatformList(SafetyPlatform safetyPlatform);

    /**
     * 新增安全管理平台
     * 
     * @param safetyPlatform 安全管理平台
     * @return 结果
     */
    public int insertSafetyPlatform(SafetyPlatform safetyPlatform);

    /**
     * 修改安全管理平台
     * 
     * @param safetyPlatform 安全管理平台
     * @return 结果
     */
    public int updateSafetyPlatform(SafetyPlatform safetyPlatform);

    /**
     * 删除安全管理平台
     * 
     * @param id 安全管理平台ID
     * @return 结果
     */
    public int deleteSafetyPlatformById(Long id);

    /**
     * 批量删除安全管理平台
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSafetyPlatformByIds(String[] ids);
}
