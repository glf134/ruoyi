package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.AccessControl;

/**
 * 准入控制设备数据元Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface AccessControlMapper 
{
    /**
     * 查询准入控制设备数据元
     * 
     * @param id 准入控制设备数据元ID
     * @return 准入控制设备数据元
     */
    public AccessControl selectAccessControlById(Long id);

    /**
     * 查询准入控制设备数据元列表
     * 
     * @param accessControl 准入控制设备数据元
     * @return 准入控制设备数据元集合
     */
    public List<AccessControl> selectAccessControlList(AccessControl accessControl);

    /**
     * 新增准入控制设备数据元
     * 
     * @param accessControl 准入控制设备数据元
     * @return 结果
     */
    public int insertAccessControl(AccessControl accessControl);

    /**
     * 修改准入控制设备数据元
     * 
     * @param accessControl 准入控制设备数据元
     * @return 结果
     */
    public int updateAccessControl(AccessControl accessControl);

    /**
     * 删除准入控制设备数据元
     * 
     * @param id 准入控制设备数据元ID
     * @return 结果
     */
    public int deleteAccessControlById(Long id);

    /**
     * 批量删除准入控制设备数据元
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAccessControlByIds(String[] ids);
}
