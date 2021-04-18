package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.DiskArrayMapper;
import com.ruoyi.datasync.domain.DiskArray;
import com.ruoyi.datasync.service.IDiskArrayService;
import com.ruoyi.common.core.text.Convert;

/**
 * 磁盘阵列Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class DiskArrayServiceImpl implements IDiskArrayService 
{
    @Autowired
    private DiskArrayMapper diskArrayMapper;

    /**
     * 查询磁盘阵列
     * 
     * @param id 磁盘阵列ID
     * @return 磁盘阵列
     */
    @Override
    public DiskArray selectDiskArrayById(Long id)
    {
        return diskArrayMapper.selectDiskArrayById(id);
    }

    /**
     * 查询磁盘阵列列表
     * 
     * @param diskArray 磁盘阵列
     * @return 磁盘阵列
     */
    @Override
    public List<DiskArray> selectDiskArrayList(DiskArray diskArray)
    {
        return diskArrayMapper.selectDiskArrayList(diskArray);
    }

    /**
     * 新增磁盘阵列
     * 
     * @param diskArray 磁盘阵列
     * @return 结果
     */
    @Override
    public int insertDiskArray(DiskArray diskArray)
    {
        diskArray.setCreateTime(DateUtils.getNowDate());
        return diskArrayMapper.insertDiskArray(diskArray);
    }

    /**
     * 修改磁盘阵列
     * 
     * @param diskArray 磁盘阵列
     * @return 结果
     */
    @Override
    public int updateDiskArray(DiskArray diskArray)
    {
        diskArray.setUpdateTime(DateUtils.getNowDate());
        return diskArrayMapper.updateDiskArray(diskArray);
    }

    /**
     * 删除磁盘阵列对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDiskArrayByIds(String ids)
    {
        return diskArrayMapper.deleteDiskArrayByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除磁盘阵列信息
     * 
     * @param id 磁盘阵列ID
     * @return 结果
     */
    @Override
    public int deleteDiskArrayById(Long id)
    {
        return diskArrayMapper.deleteDiskArrayById(id);
    }
}
