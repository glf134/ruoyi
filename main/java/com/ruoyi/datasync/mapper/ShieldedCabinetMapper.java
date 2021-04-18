package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.ShieldedCabinet;

/**
 * 屏蔽机柜Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ShieldedCabinetMapper 
{
    /**
     * 查询屏蔽机柜
     * 
     * @param id 屏蔽机柜ID
     * @return 屏蔽机柜
     */
    public ShieldedCabinet selectShieldedCabinetById(Long id);

    /**
     * 查询屏蔽机柜列表
     * 
     * @param shieldedCabinet 屏蔽机柜
     * @return 屏蔽机柜集合
     */
    public List<ShieldedCabinet> selectShieldedCabinetList(ShieldedCabinet shieldedCabinet);

    /**
     * 新增屏蔽机柜
     * 
     * @param shieldedCabinet 屏蔽机柜
     * @return 结果
     */
    public int insertShieldedCabinet(ShieldedCabinet shieldedCabinet);

    /**
     * 修改屏蔽机柜
     * 
     * @param shieldedCabinet 屏蔽机柜
     * @return 结果
     */
    public int updateShieldedCabinet(ShieldedCabinet shieldedCabinet);

    /**
     * 删除屏蔽机柜
     * 
     * @param id 屏蔽机柜ID
     * @return 结果
     */
    public int deleteShieldedCabinetById(Long id);

    /**
     * 批量删除屏蔽机柜
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteShieldedCabinetByIds(String[] ids);
}
