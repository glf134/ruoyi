package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.SafetyPlatformMapper;
import com.ruoyi.datasync.domain.SafetyPlatform;
import com.ruoyi.datasync.service.ISafetyPlatformService;
import com.ruoyi.common.core.text.Convert;

/**
 * 安全管理平台Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class SafetyPlatformServiceImpl implements ISafetyPlatformService 
{
    @Autowired
    private SafetyPlatformMapper safetyPlatformMapper;

    /**
     * 查询安全管理平台
     * 
     * @param id 安全管理平台ID
     * @return 安全管理平台
     */
    @Override
    public SafetyPlatform selectSafetyPlatformById(Long id)
    {
        return safetyPlatformMapper.selectSafetyPlatformById(id);
    }

    /**
     * 查询安全管理平台列表
     * 
     * @param safetyPlatform 安全管理平台
     * @return 安全管理平台
     */
    @Override
    public List<SafetyPlatform> selectSafetyPlatformList(SafetyPlatform safetyPlatform)
    {
        return safetyPlatformMapper.selectSafetyPlatformList(safetyPlatform);
    }

    /**
     * 新增安全管理平台
     * 
     * @param safetyPlatform 安全管理平台
     * @return 结果
     */
    @Override
    public int insertSafetyPlatform(SafetyPlatform safetyPlatform)
    {
        safetyPlatform.setCreateTime(DateUtils.getNowDate());
        return safetyPlatformMapper.insertSafetyPlatform(safetyPlatform);
    }

    /**
     * 修改安全管理平台
     * 
     * @param safetyPlatform 安全管理平台
     * @return 结果
     */
    @Override
    public int updateSafetyPlatform(SafetyPlatform safetyPlatform)
    {
        safetyPlatform.setUpdateTime(DateUtils.getNowDate());
        return safetyPlatformMapper.updateSafetyPlatform(safetyPlatform);
    }

    /**
     * 删除安全管理平台对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSafetyPlatformByIds(String ids)
    {
        return safetyPlatformMapper.deleteSafetyPlatformByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除安全管理平台信息
     * 
     * @param id 安全管理平台ID
     * @return 结果
     */
    @Override
    public int deleteSafetyPlatformById(Long id)
    {
        return safetyPlatformMapper.deleteSafetyPlatformById(id);
    }
}
