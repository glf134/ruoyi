package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.DiskArray;

/**
 * 磁盘阵列Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface DiskArrayMapper 
{
    /**
     * 查询磁盘阵列
     * 
     * @param id 磁盘阵列ID
     * @return 磁盘阵列
     */
    public DiskArray selectDiskArrayById(Long id);

    /**
     * 查询磁盘阵列列表
     * 
     * @param diskArray 磁盘阵列
     * @return 磁盘阵列集合
     */
    public List<DiskArray> selectDiskArrayList(DiskArray diskArray);

    /**
     * 新增磁盘阵列
     * 
     * @param diskArray 磁盘阵列
     * @return 结果
     */
    public int insertDiskArray(DiskArray diskArray);

    /**
     * 修改磁盘阵列
     * 
     * @param diskArray 磁盘阵列
     * @return 结果
     */
    public int updateDiskArray(DiskArray diskArray);

    /**
     * 删除磁盘阵列
     * 
     * @param id 磁盘阵列ID
     * @return 结果
     */
    public int deleteDiskArrayById(Long id);

    /**
     * 批量删除磁盘阵列
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDiskArrayByIds(String[] ids);
}
