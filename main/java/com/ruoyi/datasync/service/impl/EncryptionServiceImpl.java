package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.EncryptionMapper;
import com.ruoyi.datasync.domain.Encryption;
import com.ruoyi.datasync.service.IEncryptionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 加密设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class EncryptionServiceImpl implements IEncryptionService 
{
    @Autowired
    private EncryptionMapper encryptionMapper;

    /**
     * 查询加密设备
     * 
     * @param id 加密设备ID
     * @return 加密设备
     */
    @Override
    public Encryption selectEncryptionById(Long id)
    {
        return encryptionMapper.selectEncryptionById(id);
    }

    /**
     * 查询加密设备列表
     * 
     * @param encryption 加密设备
     * @return 加密设备
     */
    @Override
    public List<Encryption> selectEncryptionList(Encryption encryption)
    {
        return encryptionMapper.selectEncryptionList(encryption);
    }

    /**
     * 新增加密设备
     * 
     * @param encryption 加密设备
     * @return 结果
     */
    @Override
    public int insertEncryption(Encryption encryption)
    {
        encryption.setCreateTime(DateUtils.getNowDate());
        return encryptionMapper.insertEncryption(encryption);
    }

    /**
     * 修改加密设备
     * 
     * @param encryption 加密设备
     * @return 结果
     */
    @Override
    public int updateEncryption(Encryption encryption)
    {
        encryption.setUpdateTime(DateUtils.getNowDate());
        return encryptionMapper.updateEncryption(encryption);
    }

    /**
     * 删除加密设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEncryptionByIds(String ids)
    {
        return encryptionMapper.deleteEncryptionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除加密设备信息
     * 
     * @param id 加密设备ID
     * @return 结果
     */
    @Override
    public int deleteEncryptionById(Long id)
    {
        return encryptionMapper.deleteEncryptionById(id);
    }
}
