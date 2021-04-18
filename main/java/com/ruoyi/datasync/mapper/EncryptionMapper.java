package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Encryption;

/**
 * 加密设备Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface EncryptionMapper 
{
    /**
     * 查询加密设备
     * 
     * @param id 加密设备ID
     * @return 加密设备
     */
    public Encryption selectEncryptionById(Long id);

    /**
     * 查询加密设备列表
     * 
     * @param encryption 加密设备
     * @return 加密设备集合
     */
    public List<Encryption> selectEncryptionList(Encryption encryption);

    /**
     * 新增加密设备
     * 
     * @param encryption 加密设备
     * @return 结果
     */
    public int insertEncryption(Encryption encryption);

    /**
     * 修改加密设备
     * 
     * @param encryption 加密设备
     * @return 结果
     */
    public int updateEncryption(Encryption encryption);

    /**
     * 删除加密设备
     * 
     * @param id 加密设备ID
     * @return 结果
     */
    public int deleteEncryptionById(Long id);

    /**
     * 批量删除加密设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEncryptionByIds(String[] ids);
}
