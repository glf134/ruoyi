package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.PrecisionPowerMapper;
import com.ruoyi.datasync.domain.PrecisionPower;
import com.ruoyi.datasync.service.IPrecisionPowerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 精密配电设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class PrecisionPowerServiceImpl implements IPrecisionPowerService 
{
    @Autowired
    private PrecisionPowerMapper precisionPowerMapper;

    /**
     * 查询精密配电设备
     * 
     * @param id 精密配电设备ID
     * @return 精密配电设备
     */
    @Override
    public PrecisionPower selectPrecisionPowerById(Long id)
    {
        return precisionPowerMapper.selectPrecisionPowerById(id);
    }

    /**
     * 查询精密配电设备列表
     * 
     * @param precisionPower 精密配电设备
     * @return 精密配电设备
     */
    @Override
    public List<PrecisionPower> selectPrecisionPowerList(PrecisionPower precisionPower)
    {
        return precisionPowerMapper.selectPrecisionPowerList(precisionPower);
    }

    /**
     * 新增精密配电设备
     * 
     * @param precisionPower 精密配电设备
     * @return 结果
     */
    @Override
    public int insertPrecisionPower(PrecisionPower precisionPower)
    {
        precisionPower.setCreateTime(DateUtils.getNowDate());
        return precisionPowerMapper.insertPrecisionPower(precisionPower);
    }

    /**
     * 修改精密配电设备
     * 
     * @param precisionPower 精密配电设备
     * @return 结果
     */
    @Override
    public int updatePrecisionPower(PrecisionPower precisionPower)
    {
        precisionPower.setUpdateTime(DateUtils.getNowDate());
        return precisionPowerMapper.updatePrecisionPower(precisionPower);
    }

    /**
     * 删除精密配电设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePrecisionPowerByIds(String ids)
    {
        return precisionPowerMapper.deletePrecisionPowerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除精密配电设备信息
     * 
     * @param id 精密配电设备ID
     * @return 结果
     */
    @Override
    public int deletePrecisionPowerById(Long id)
    {
        return precisionPowerMapper.deletePrecisionPowerById(id);
    }
}
