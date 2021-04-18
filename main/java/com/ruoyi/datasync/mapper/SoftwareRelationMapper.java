package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.SoftwareRelation;

/**
 * 软件实例关联关系Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface SoftwareRelationMapper 
{
    /**
     * 查询软件实例关联关系
     * 
     * @param id 软件实例关联关系ID
     * @return 软件实例关联关系
     */
    public SoftwareRelation selectSoftwareRelationById(Long id);

    /**
     * 查询软件实例关联关系列表
     * 
     * @param softwareRelation 软件实例关联关系
     * @return 软件实例关联关系集合
     */
    public List<SoftwareRelation> selectSoftwareRelationList(SoftwareRelation softwareRelation);

    /**
     * 新增软件实例关联关系
     * 
     * @param softwareRelation 软件实例关联关系
     * @return 结果
     */
    public int insertSoftwareRelation(SoftwareRelation softwareRelation);

    /**
     * 修改软件实例关联关系
     * 
     * @param softwareRelation 软件实例关联关系
     * @return 结果
     */
    public int updateSoftwareRelation(SoftwareRelation softwareRelation);

    /**
     * 删除软件实例关联关系
     * 
     * @param id 软件实例关联关系ID
     * @return 结果
     */
    public int deleteSoftwareRelationById(Long id);

    /**
     * 批量删除软件实例关联关系
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSoftwareRelationByIds(String[] ids);
}
