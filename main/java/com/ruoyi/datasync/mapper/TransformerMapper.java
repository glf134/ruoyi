package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Transformer;

/**
 * 变压器设备Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface TransformerMapper 
{
    /**
     * 查询变压器设备
     * 
     * @param id 变压器设备ID
     * @return 变压器设备
     */
    public Transformer selectTransformerById(Long id);

    /**
     * 查询变压器设备列表
     * 
     * @param transformer 变压器设备
     * @return 变压器设备集合
     */
    public List<Transformer> selectTransformerList(Transformer transformer);

    /**
     * 新增变压器设备
     * 
     * @param transformer 变压器设备
     * @return 结果
     */
    public int insertTransformer(Transformer transformer);

    /**
     * 修改变压器设备
     * 
     * @param transformer 变压器设备
     * @return 结果
     */
    public int updateTransformer(Transformer transformer);

    /**
     * 删除变压器设备
     * 
     * @param id 变压器设备ID
     * @return 结果
     */
    public int deleteTransformerById(Long id);

    /**
     * 批量删除变压器设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTransformerByIds(String[] ids);
}
