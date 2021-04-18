package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.AccessControlMapper;
import com.ruoyi.datasync.domain.AccessControl;
import com.ruoyi.datasync.service.IAccessControlService;
import com.ruoyi.common.core.text.Convert;

/**
 * 准入控制设备数据元Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class AccessControlServiceImpl implements IAccessControlService 
{
    @Autowired
    private AccessControlMapper accessControlMapper;

    /**
     * 查询准入控制设备数据元
     * 
     * @param id 准入控制设备数据元ID
     * @return 准入控制设备数据元
     */
    @Override
    public AccessControl selectAccessControlById(Long id)
    {
        return accessControlMapper.selectAccessControlById(id);
    }

    /**
     * 查询准入控制设备数据元列表
     * 
     * @param accessControl 准入控制设备数据元
     * @return 准入控制设备数据元
     */
    @Override
    public List<AccessControl> selectAccessControlList(AccessControl accessControl)
    {
        return accessControlMapper.selectAccessControlList(accessControl);
    }

    /**
     * 新增准入控制设备数据元
     * 
     * @param accessControl 准入控制设备数据元
     * @return 结果
     */
    @Override
    public int insertAccessControl(AccessControl accessControl)
    {
        accessControl.setCreateTime(DateUtils.getNowDate());
        return accessControlMapper.insertAccessControl(accessControl);
    }

    /**
     * 修改准入控制设备数据元
     * 
     * @param accessControl 准入控制设备数据元
     * @return 结果
     */
    @Override
    public int updateAccessControl(AccessControl accessControl)
    {
        accessControl.setUpdateTime(DateUtils.getNowDate());
        return accessControlMapper.updateAccessControl(accessControl);
    }

    /**
     * 删除准入控制设备数据元对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAccessControlByIds(String ids)
    {
        return accessControlMapper.deleteAccessControlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除准入控制设备数据元信息
     * 
     * @param id 准入控制设备数据元ID
     * @return 结果
     */
    @Override
    public int deleteAccessControlById(Long id)
    {
        return accessControlMapper.deleteAccessControlById(id);
    }
}
