package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.SoftwareRelationMapper;
import com.ruoyi.datasync.domain.SoftwareRelation;
import com.ruoyi.datasync.service.ISoftwareRelationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 软件实例关联关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class SoftwareRelationServiceImpl implements ISoftwareRelationService 
{
    @Autowired
    private SoftwareRelationMapper softwareRelationMapper;

    /**
     * 查询软件实例关联关系
     * 
     * @param id 软件实例关联关系ID
     * @return 软件实例关联关系
     */
    @Override
    public SoftwareRelation selectSoftwareRelationById(Long id)
    {
        return softwareRelationMapper.selectSoftwareRelationById(id);
    }

    /**
     * 查询软件实例关联关系列表
     * 
     * @param softwareRelation 软件实例关联关系
     * @return 软件实例关联关系
     */
    @Override
    public List<SoftwareRelation> selectSoftwareRelationList(SoftwareRelation softwareRelation)
    {
        return softwareRelationMapper.selectSoftwareRelationList(softwareRelation);
    }

    /**
     * 新增软件实例关联关系
     * 
     * @param softwareRelation 软件实例关联关系
     * @return 结果
     */
    @Override
    public int insertSoftwareRelation(SoftwareRelation softwareRelation)
    {
        softwareRelation.setCreateTime(DateUtils.getNowDate());
        return softwareRelationMapper.insertSoftwareRelation(softwareRelation);
    }

    /**
     * 修改软件实例关联关系
     * 
     * @param softwareRelation 软件实例关联关系
     * @return 结果
     */
    @Override
    public int updateSoftwareRelation(SoftwareRelation softwareRelation)
    {
        softwareRelation.setUpdateTime(DateUtils.getNowDate());
        return softwareRelationMapper.updateSoftwareRelation(softwareRelation);
    }

    /**
     * 删除软件实例关联关系对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSoftwareRelationByIds(String ids)
    {
        return softwareRelationMapper.deleteSoftwareRelationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除软件实例关联关系信息
     * 
     * @param id 软件实例关联关系ID
     * @return 结果
     */
    @Override
    public int deleteSoftwareRelationById(Long id)
    {
        return softwareRelationMapper.deleteSoftwareRelationById(id);
    }
}
