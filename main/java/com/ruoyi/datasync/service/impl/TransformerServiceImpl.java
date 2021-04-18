package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.TransformerMapper;
import com.ruoyi.datasync.domain.Transformer;
import com.ruoyi.datasync.service.ITransformerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 变压器设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class TransformerServiceImpl implements ITransformerService 
{
    @Autowired
    private TransformerMapper transformerMapper;

    /**
     * 查询变压器设备
     * 
     * @param id 变压器设备ID
     * @return 变压器设备
     */
    @Override
    public Transformer selectTransformerById(Long id)
    {
        return transformerMapper.selectTransformerById(id);
    }

    /**
     * 查询变压器设备列表
     * 
     * @param transformer 变压器设备
     * @return 变压器设备
     */
    @Override
    public List<Transformer> selectTransformerList(Transformer transformer)
    {
        return transformerMapper.selectTransformerList(transformer);
    }

    /**
     * 新增变压器设备
     * 
     * @param transformer 变压器设备
     * @return 结果
     */
    @Override
    public int insertTransformer(Transformer transformer)
    {
        transformer.setCreateTime(DateUtils.getNowDate());
        return transformerMapper.insertTransformer(transformer);
    }

    /**
     * 修改变压器设备
     * 
     * @param transformer 变压器设备
     * @return 结果
     */
    @Override
    public int updateTransformer(Transformer transformer)
    {
        transformer.setUpdateTime(DateUtils.getNowDate());
        return transformerMapper.updateTransformer(transformer);
    }

    /**
     * 删除变压器设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTransformerByIds(String ids)
    {
        return transformerMapper.deleteTransformerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除变压器设备信息
     * 
     * @param id 变压器设备ID
     * @return 结果
     */
    @Override
    public int deleteTransformerById(Long id)
    {
        return transformerMapper.deleteTransformerById(id);
    }
}
