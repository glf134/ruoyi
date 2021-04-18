package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.ApplicationRelation;

/**
 * 应用系统关联关系Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ApplicationRelationMapper 
{
    /**
     * 查询应用系统关联关系
     * 
     * @param id 应用系统关联关系ID
     * @return 应用系统关联关系
     */
    public ApplicationRelation selectApplicationRelationById(Long id);

    /**
     * 查询应用系统关联关系列表
     * 
     * @param applicationRelation 应用系统关联关系
     * @return 应用系统关联关系集合
     */
    public List<ApplicationRelation> selectApplicationRelationList(ApplicationRelation applicationRelation);

    /**
     * 新增应用系统关联关系
     * 
     * @param applicationRelation 应用系统关联关系
     * @return 结果
     */
    public int insertApplicationRelation(ApplicationRelation applicationRelation);

    /**
     * 修改应用系统关联关系
     * 
     * @param applicationRelation 应用系统关联关系
     * @return 结果
     */
    public int updateApplicationRelation(ApplicationRelation applicationRelation);

    /**
     * 删除应用系统关联关系
     * 
     * @param id 应用系统关联关系ID
     * @return 结果
     */
    public int deleteApplicationRelationById(Long id);

    /**
     * 批量删除应用系统关联关系
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteApplicationRelationByIds(String[] ids);
}
