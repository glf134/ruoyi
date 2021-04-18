package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.PrecisionPower;

/**
 * 精密配电设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IPrecisionPowerService 
{
    /**
     * 查询精密配电设备
     * 
     * @param id 精密配电设备ID
     * @return 精密配电设备
     */
    public PrecisionPower selectPrecisionPowerById(Long id);

    /**
     * 查询精密配电设备列表
     * 
     * @param precisionPower 精密配电设备
     * @return 精密配电设备集合
     */
    public List<PrecisionPower> selectPrecisionPowerList(PrecisionPower precisionPower);

    /**
     * 新增精密配电设备
     * 
     * @param precisionPower 精密配电设备
     * @return 结果
     */
    public int insertPrecisionPower(PrecisionPower precisionPower);

    /**
     * 修改精密配电设备
     * 
     * @param precisionPower 精密配电设备
     * @return 结果
     */
    public int updatePrecisionPower(PrecisionPower precisionPower);

    /**
     * 批量删除精密配电设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePrecisionPowerByIds(String ids);

    /**
     * 删除精密配电设备信息
     * 
     * @param id 精密配电设备ID
     * @return 结果
     */
    public int deletePrecisionPowerById(Long id);
}
