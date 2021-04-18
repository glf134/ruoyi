package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.IntegratedCabinet;

/**
 * 一体化机柜Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IntegratedCabinetMapper 
{
    /**
     * 查询一体化机柜
     * 
     * @param id 一体化机柜ID
     * @return 一体化机柜
     */
    public IntegratedCabinet selectIntegratedCabinetById(Long id);

    /**
     * 查询一体化机柜列表
     * 
     * @param integratedCabinet 一体化机柜
     * @return 一体化机柜集合
     */
    public List<IntegratedCabinet> selectIntegratedCabinetList(IntegratedCabinet integratedCabinet);

    /**
     * 新增一体化机柜
     * 
     * @param integratedCabinet 一体化机柜
     * @return 结果
     */
    public int insertIntegratedCabinet(IntegratedCabinet integratedCabinet);

    /**
     * 修改一体化机柜
     * 
     * @param integratedCabinet 一体化机柜
     * @return 结果
     */
    public int updateIntegratedCabinet(IntegratedCabinet integratedCabinet);

    /**
     * 删除一体化机柜
     * 
     * @param id 一体化机柜ID
     * @return 结果
     */
    public int deleteIntegratedCabinetById(Long id);

    /**
     * 批量删除一体化机柜
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteIntegratedCabinetByIds(String[] ids);
}
