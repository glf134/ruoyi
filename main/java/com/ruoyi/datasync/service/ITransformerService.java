package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Transformer;

/**
 * 变压器设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ITransformerService 
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
     * 批量删除变压器设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTransformerByIds(String ids);

    /**
     * 删除变压器设备信息
     * 
     * @param id 变压器设备ID
     * @return 结果
     */
    public int deleteTransformerById(Long id);
}
