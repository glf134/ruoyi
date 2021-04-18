package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.DigitalSignature;

/**
 * 数字签名设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IDigitalSignatureService 
{
    /**
     * 查询数字签名设备
     * 
     * @param id 数字签名设备ID
     * @return 数字签名设备
     */
    public DigitalSignature selectDigitalSignatureById(Long id);

    /**
     * 查询数字签名设备列表
     * 
     * @param digitalSignature 数字签名设备
     * @return 数字签名设备集合
     */
    public List<DigitalSignature> selectDigitalSignatureList(DigitalSignature digitalSignature);

    /**
     * 新增数字签名设备
     * 
     * @param digitalSignature 数字签名设备
     * @return 结果
     */
    public int insertDigitalSignature(DigitalSignature digitalSignature);

    /**
     * 修改数字签名设备
     * 
     * @param digitalSignature 数字签名设备
     * @return 结果
     */
    public int updateDigitalSignature(DigitalSignature digitalSignature);

    /**
     * 批量删除数字签名设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDigitalSignatureByIds(String ids);

    /**
     * 删除数字签名设备信息
     * 
     * @param id 数字签名设备ID
     * @return 结果
     */
    public int deleteDigitalSignatureById(Long id);
}
