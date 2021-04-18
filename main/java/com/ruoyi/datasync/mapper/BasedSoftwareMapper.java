package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.BasedSoftware;

/**
 * 基础软件Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface BasedSoftwareMapper 
{
    /**
     * 查询基础软件
     * 
     * @param id 基础软件ID
     * @return 基础软件
     */
    public BasedSoftware selectBasedSoftwareById(Long id);

    /**
     * 查询基础软件列表
     * 
     * @param basedSoftware 基础软件
     * @return 基础软件集合
     */
    public List<BasedSoftware> selectBasedSoftwareList(BasedSoftware basedSoftware);

    /**
     * 新增基础软件
     * 
     * @param basedSoftware 基础软件
     * @return 结果
     */
    public int insertBasedSoftware(BasedSoftware basedSoftware);

    /**
     * 修改基础软件
     * 
     * @param basedSoftware 基础软件
     * @return 结果
     */
    public int updateBasedSoftware(BasedSoftware basedSoftware);

    /**
     * 删除基础软件
     * 
     * @param id 基础软件ID
     * @return 结果
     */
    public int deleteBasedSoftwareById(Long id);

    /**
     * 批量删除基础软件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBasedSoftwareByIds(String[] ids);
}
