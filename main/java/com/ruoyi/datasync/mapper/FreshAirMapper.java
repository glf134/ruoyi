package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.FreshAir;

/**
 * 新风系统Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface FreshAirMapper 
{
    /**
     * 查询新风系统
     * 
     * @param id 新风系统ID
     * @return 新风系统
     */
    public FreshAir selectFreshAirById(Long id);

    /**
     * 查询新风系统列表
     * 
     * @param freshAir 新风系统
     * @return 新风系统集合
     */
    public List<FreshAir> selectFreshAirList(FreshAir freshAir);

    /**
     * 新增新风系统
     * 
     * @param freshAir 新风系统
     * @return 结果
     */
    public int insertFreshAir(FreshAir freshAir);

    /**
     * 修改新风系统
     * 
     * @param freshAir 新风系统
     * @return 结果
     */
    public int updateFreshAir(FreshAir freshAir);

    /**
     * 删除新风系统
     * 
     * @param id 新风系统ID
     * @return 结果
     */
    public int deleteFreshAirById(Long id);

    /**
     * 批量删除新风系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFreshAirByIds(String[] ids);
}
