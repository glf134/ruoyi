package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.BvsMapper;
import com.ruoyi.datasync.domain.Bvs;
import com.ruoyi.datasync.service.IBvsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 配置核查设备数据元（BVS）Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class BvsServiceImpl implements IBvsService 
{
    @Autowired
    private BvsMapper bvsMapper;

    /**
     * 查询配置核查设备数据元（BVS）
     * 
     * @param id 配置核查设备数据元（BVS）ID
     * @return 配置核查设备数据元（BVS）
     */
    @Override
    public Bvs selectBvsById(Long id)
    {
        return bvsMapper.selectBvsById(id);
    }

    /**
     * 查询配置核查设备数据元（BVS）列表
     * 
     * @param bvs 配置核查设备数据元（BVS）
     * @return 配置核查设备数据元（BVS）
     */
    @Override
    public List<Bvs> selectBvsList(Bvs bvs)
    {
        return bvsMapper.selectBvsList(bvs);
    }

    /**
     * 新增配置核查设备数据元（BVS）
     * 
     * @param bvs 配置核查设备数据元（BVS）
     * @return 结果
     */
    @Override
    public int insertBvs(Bvs bvs)
    {
        bvs.setCreateTime(DateUtils.getNowDate());
        return bvsMapper.insertBvs(bvs);
    }

    /**
     * 修改配置核查设备数据元（BVS）
     * 
     * @param bvs 配置核查设备数据元（BVS）
     * @return 结果
     */
    @Override
    public int updateBvs(Bvs bvs)
    {
        bvs.setUpdateTime(DateUtils.getNowDate());
        return bvsMapper.updateBvs(bvs);
    }

    /**
     * 删除配置核查设备数据元（BVS）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBvsByIds(String ids)
    {
        return bvsMapper.deleteBvsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除配置核查设备数据元（BVS）信息
     * 
     * @param id 配置核查设备数据元（BVS）ID
     * @return 结果
     */
    @Override
    public int deleteBvsById(Long id)
    {
        return bvsMapper.deleteBvsById(id);
    }
}
