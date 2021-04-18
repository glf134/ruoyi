package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.ShieldedCabinetMapper;
import com.ruoyi.datasync.domain.ShieldedCabinet;
import com.ruoyi.datasync.service.IShieldedCabinetService;
import com.ruoyi.common.core.text.Convert;

/**
 * 屏蔽机柜Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class ShieldedCabinetServiceImpl implements IShieldedCabinetService 
{
    @Autowired
    private ShieldedCabinetMapper shieldedCabinetMapper;

    /**
     * 查询屏蔽机柜
     * 
     * @param id 屏蔽机柜ID
     * @return 屏蔽机柜
     */
    @Override
    public ShieldedCabinet selectShieldedCabinetById(Long id)
    {
        return shieldedCabinetMapper.selectShieldedCabinetById(id);
    }

    /**
     * 查询屏蔽机柜列表
     * 
     * @param shieldedCabinet 屏蔽机柜
     * @return 屏蔽机柜
     */
    @Override
    public List<ShieldedCabinet> selectShieldedCabinetList(ShieldedCabinet shieldedCabinet)
    {
        return shieldedCabinetMapper.selectShieldedCabinetList(shieldedCabinet);
    }

    /**
     * 新增屏蔽机柜
     * 
     * @param shieldedCabinet 屏蔽机柜
     * @return 结果
     */
    @Override
    public int insertShieldedCabinet(ShieldedCabinet shieldedCabinet)
    {
        shieldedCabinet.setCreateTime(DateUtils.getNowDate());
        return shieldedCabinetMapper.insertShieldedCabinet(shieldedCabinet);
    }

    /**
     * 修改屏蔽机柜
     * 
     * @param shieldedCabinet 屏蔽机柜
     * @return 结果
     */
    @Override
    public int updateShieldedCabinet(ShieldedCabinet shieldedCabinet)
    {
        shieldedCabinet.setUpdateTime(DateUtils.getNowDate());
        return shieldedCabinetMapper.updateShieldedCabinet(shieldedCabinet);
    }

    /**
     * 删除屏蔽机柜对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteShieldedCabinetByIds(String ids)
    {
        return shieldedCabinetMapper.deleteShieldedCabinetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除屏蔽机柜信息
     * 
     * @param id 屏蔽机柜ID
     * @return 结果
     */
    @Override
    public int deleteShieldedCabinetById(Long id)
    {
        return shieldedCabinetMapper.deleteShieldedCabinetById(id);
    }
}
