package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.IntegratedCabinetMapper;
import com.ruoyi.datasync.domain.IntegratedCabinet;
import com.ruoyi.datasync.service.IIntegratedCabinetService;
import com.ruoyi.common.core.text.Convert;

/**
 * 一体化机柜Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class IntegratedCabinetServiceImpl implements IIntegratedCabinetService 
{
    @Autowired
    private IntegratedCabinetMapper integratedCabinetMapper;

    /**
     * 查询一体化机柜
     * 
     * @param id 一体化机柜ID
     * @return 一体化机柜
     */
    @Override
    public IntegratedCabinet selectIntegratedCabinetById(Long id)
    {
        return integratedCabinetMapper.selectIntegratedCabinetById(id);
    }

    /**
     * 查询一体化机柜列表
     * 
     * @param integratedCabinet 一体化机柜
     * @return 一体化机柜
     */
    @Override
    public List<IntegratedCabinet> selectIntegratedCabinetList(IntegratedCabinet integratedCabinet)
    {
        return integratedCabinetMapper.selectIntegratedCabinetList(integratedCabinet);
    }

    /**
     * 新增一体化机柜
     * 
     * @param integratedCabinet 一体化机柜
     * @return 结果
     */
    @Override
    public int insertIntegratedCabinet(IntegratedCabinet integratedCabinet)
    {
        integratedCabinet.setCreateTime(DateUtils.getNowDate());
        return integratedCabinetMapper.insertIntegratedCabinet(integratedCabinet);
    }

    /**
     * 修改一体化机柜
     * 
     * @param integratedCabinet 一体化机柜
     * @return 结果
     */
    @Override
    public int updateIntegratedCabinet(IntegratedCabinet integratedCabinet)
    {
        integratedCabinet.setUpdateTime(DateUtils.getNowDate());
        return integratedCabinetMapper.updateIntegratedCabinet(integratedCabinet);
    }

    /**
     * 删除一体化机柜对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIntegratedCabinetByIds(String ids)
    {
        return integratedCabinetMapper.deleteIntegratedCabinetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除一体化机柜信息
     * 
     * @param id 一体化机柜ID
     * @return 结果
     */
    @Override
    public int deleteIntegratedCabinetById(Long id)
    {
        return integratedCabinetMapper.deleteIntegratedCabinetById(id);
    }
}
