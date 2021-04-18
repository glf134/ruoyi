package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Bvs;

/**
 * 配置核查设备数据元（BVS）Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface BvsMapper 
{
    /**
     * 查询配置核查设备数据元（BVS）
     * 
     * @param id 配置核查设备数据元（BVS）ID
     * @return 配置核查设备数据元（BVS）
     */
    public Bvs selectBvsById(Long id);

    /**
     * 查询配置核查设备数据元（BVS）列表
     * 
     * @param bvs 配置核查设备数据元（BVS）
     * @return 配置核查设备数据元（BVS）集合
     */
    public List<Bvs> selectBvsList(Bvs bvs);

    /**
     * 新增配置核查设备数据元（BVS）
     * 
     * @param bvs 配置核查设备数据元（BVS）
     * @return 结果
     */
    public int insertBvs(Bvs bvs);

    /**
     * 修改配置核查设备数据元（BVS）
     * 
     * @param bvs 配置核查设备数据元（BVS）
     * @return 结果
     */
    public int updateBvs(Bvs bvs);

    /**
     * 删除配置核查设备数据元（BVS）
     * 
     * @param id 配置核查设备数据元（BVS）ID
     * @return 结果
     */
    public int deleteBvsById(Long id);

    /**
     * 批量删除配置核查设备数据元（BVS）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBvsByIds(String[] ids);
}
