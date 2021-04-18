package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.FireProtectionMapper;
import com.ruoyi.datasync.domain.FireProtection;
import com.ruoyi.datasync.service.IFireProtectionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 消防系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class FireProtectionServiceImpl implements IFireProtectionService 
{
    @Autowired
    private FireProtectionMapper fireProtectionMapper;

    /**
     * 查询消防系统
     * 
     * @param id 消防系统ID
     * @return 消防系统
     */
    @Override
    public FireProtection selectFireProtectionById(Long id)
    {
        return fireProtectionMapper.selectFireProtectionById(id);
    }

    /**
     * 查询消防系统列表
     * 
     * @param fireProtection 消防系统
     * @return 消防系统
     */
    @Override
    public List<FireProtection> selectFireProtectionList(FireProtection fireProtection)
    {
        return fireProtectionMapper.selectFireProtectionList(fireProtection);
    }

    /**
     * 新增消防系统
     * 
     * @param fireProtection 消防系统
     * @return 结果
     */
    @Override
    public int insertFireProtection(FireProtection fireProtection)
    {
        fireProtection.setCreateTime(DateUtils.getNowDate());
        return fireProtectionMapper.insertFireProtection(fireProtection);
    }

    /**
     * 修改消防系统
     * 
     * @param fireProtection 消防系统
     * @return 结果
     */
    @Override
    public int updateFireProtection(FireProtection fireProtection)
    {
        fireProtection.setUpdateTime(DateUtils.getNowDate());
        return fireProtectionMapper.updateFireProtection(fireProtection);
    }

    /**
     * 删除消防系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFireProtectionByIds(String ids)
    {
        return fireProtectionMapper.deleteFireProtectionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除消防系统信息
     * 
     * @param id 消防系统ID
     * @return 结果
     */
    @Override
    public int deleteFireProtectionById(Long id)
    {
        return fireProtectionMapper.deleteFireProtectionById(id);
    }
}
