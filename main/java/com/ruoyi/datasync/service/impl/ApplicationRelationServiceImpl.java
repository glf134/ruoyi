package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.ApplicationRelationMapper;
import com.ruoyi.datasync.domain.ApplicationRelation;
import com.ruoyi.datasync.service.IApplicationRelationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 应用系统关联关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class ApplicationRelationServiceImpl implements IApplicationRelationService 
{
    @Autowired
    private ApplicationRelationMapper applicationRelationMapper;

    /**
     * 查询应用系统关联关系
     * 
     * @param id 应用系统关联关系ID
     * @return 应用系统关联关系
     */
    @Override
    public ApplicationRelation selectApplicationRelationById(Long id)
    {
        return applicationRelationMapper.selectApplicationRelationById(id);
    }

    /**
     * 查询应用系统关联关系列表
     * 
     * @param applicationRelation 应用系统关联关系
     * @return 应用系统关联关系
     */
    @Override
    public List<ApplicationRelation> selectApplicationRelationList(ApplicationRelation applicationRelation)
    {
        return applicationRelationMapper.selectApplicationRelationList(applicationRelation);
    }

    /**
     * 新增应用系统关联关系
     * 
     * @param applicationRelation 应用系统关联关系
     * @return 结果
     */
    @Override
    public int insertApplicationRelation(ApplicationRelation applicationRelation)
    {
        applicationRelation.setCreateTime(DateUtils.getNowDate());
        return applicationRelationMapper.insertApplicationRelation(applicationRelation);
    }

    /**
     * 修改应用系统关联关系
     * 
     * @param applicationRelation 应用系统关联关系
     * @return 结果
     */
    @Override
    public int updateApplicationRelation(ApplicationRelation applicationRelation)
    {
        applicationRelation.setUpdateTime(DateUtils.getNowDate());
        return applicationRelationMapper.updateApplicationRelation(applicationRelation);
    }

    /**
     * 删除应用系统关联关系对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteApplicationRelationByIds(String ids)
    {
        return applicationRelationMapper.deleteApplicationRelationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除应用系统关联关系信息
     * 
     * @param id 应用系统关联关系ID
     * @return 结果
     */
    @Override
    public int deleteApplicationRelationById(Long id)
    {
        return applicationRelationMapper.deleteApplicationRelationById(id);
    }
}
