package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Vpn;

/**
 * 虚拟专用网设备（VPN）Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface VpnMapper 
{
    /**
     * 查询虚拟专用网设备（VPN）
     * 
     * @param id 虚拟专用网设备（VPN）ID
     * @return 虚拟专用网设备（VPN）
     */
    public Vpn selectVpnById(Long id);

    /**
     * 查询虚拟专用网设备（VPN）列表
     * 
     * @param vpn 虚拟专用网设备（VPN）
     * @return 虚拟专用网设备（VPN）集合
     */
    public List<Vpn> selectVpnList(Vpn vpn);

    /**
     * 新增虚拟专用网设备（VPN）
     * 
     * @param vpn 虚拟专用网设备（VPN）
     * @return 结果
     */
    public int insertVpn(Vpn vpn);

    /**
     * 修改虚拟专用网设备（VPN）
     * 
     * @param vpn 虚拟专用网设备（VPN）
     * @return 结果
     */
    public int updateVpn(Vpn vpn);

    /**
     * 删除虚拟专用网设备（VPN）
     * 
     * @param id 虚拟专用网设备（VPN）ID
     * @return 结果
     */
    public int deleteVpnById(Long id);

    /**
     * 批量删除虚拟专用网设备（VPN）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVpnByIds(String[] ids);
}
