package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.DigitalSignatureMapper;
import com.ruoyi.datasync.domain.DigitalSignature;
import com.ruoyi.datasync.service.IDigitalSignatureService;
import com.ruoyi.common.core.text.Convert;

/**
 * 数字签名设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class DigitalSignatureServiceImpl implements IDigitalSignatureService 
{
    @Autowired
    private DigitalSignatureMapper digitalSignatureMapper;

    /**
     * 查询数字签名设备
     * 
     * @param id 数字签名设备ID
     * @return 数字签名设备
     */
    @Override
    public DigitalSignature selectDigitalSignatureById(Long id)
    {
        return digitalSignatureMapper.selectDigitalSignatureById(id);
    }

    /**
     * 查询数字签名设备列表
     * 
     * @param digitalSignature 数字签名设备
     * @return 数字签名设备
     */
    @Override
    public List<DigitalSignature> selectDigitalSignatureList(DigitalSignature digitalSignature)
    {
        return digitalSignatureMapper.selectDigitalSignatureList(digitalSignature);
    }

    /**
     * 新增数字签名设备
     * 
     * @param digitalSignature 数字签名设备
     * @return 结果
     */
    @Override
    public int insertDigitalSignature(DigitalSignature digitalSignature)
    {
        digitalSignature.setCreateTime(DateUtils.getNowDate());
        return digitalSignatureMapper.insertDigitalSignature(digitalSignature);
    }

    /**
     * 修改数字签名设备
     * 
     * @param digitalSignature 数字签名设备
     * @return 结果
     */
    @Override
    public int updateDigitalSignature(DigitalSignature digitalSignature)
    {
        digitalSignature.setUpdateTime(DateUtils.getNowDate());
        return digitalSignatureMapper.updateDigitalSignature(digitalSignature);
    }

    /**
     * 删除数字签名设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDigitalSignatureByIds(String ids)
    {
        return digitalSignatureMapper.deleteDigitalSignatureByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除数字签名设备信息
     * 
     * @param id 数字签名设备ID
     * @return 结果
     */
    @Override
    public int deleteDigitalSignatureById(Long id)
    {
        return digitalSignatureMapper.deleteDigitalSignatureById(id);
    }
}
