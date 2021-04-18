package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Ave;

/**
 * 防病毒网关(AVE)Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface AveMapper 
{
    /**
     * 查询防病毒网关(AVE)
     * 
     * @param id 防病毒网关(AVE)ID
     * @return 防病毒网关(AVE)
     */
    public Ave selectAveById(Long id);

    /**
     * 查询防病毒网关(AVE)列表
     * 
     * @param ave 防病毒网关(AVE)
     * @return 防病毒网关(AVE)集合
     */
    public List<Ave> selectAveList(Ave ave);

    /**
     * 新增防病毒网关(AVE)
     * 
     * @param ave 防病毒网关(AVE)
     * @return 结果
     */
    public int insertAve(Ave ave);

    /**
     * 修改防病毒网关(AVE)
     * 
     * @param ave 防病毒网关(AVE)
     * @return 结果
     */
    public int updateAve(Ave ave);

    /**
     * 删除防病毒网关(AVE)
     * 
     * @param id 防病毒网关(AVE)ID
     * @return 结果
     */
    public int deleteAveById(Long id);

    /**
     * 批量删除防病毒网关(AVE)
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAveByIds(String[] ids);
}
