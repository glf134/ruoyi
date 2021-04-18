package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.VpnMapper;
import com.ruoyi.datasync.domain.Vpn;
import com.ruoyi.datasync.service.IVpnService;
import com.ruoyi.common.core.text.Convert;

/**
 * 虚拟专用网设备（VPN）Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class VpnServiceImpl implements IVpnService 
{
    @Autowired
    private VpnMapper vpnMapper;

    /**
     * 查询虚拟专用网设备（VPN）
     * 
     * @param id 虚拟专用网设备（VPN）ID
     * @return 虚拟专用网设备（VPN）
     */
    @Override
    public Vpn selectVpnById(Long id)
    {
        return vpnMapper.selectVpnById(id);
    }

    /**
     * 查询虚拟专用网设备（VPN）列表
     * 
     * @param vpn 虚拟专用网设备（VPN）
     * @return 虚拟专用网设备（VPN）
     */
    @Override
    public List<Vpn> selectVpnList(Vpn vpn)
    {
        return vpnMapper.selectVpnList(vpn);
    }

    /**
     * 新增虚拟专用网设备（VPN）
     * 
     * @param vpn 虚拟专用网设备（VPN）
     * @return 结果
     */
    @Override
    public int insertVpn(Vpn vpn)
    {
        vpn.setCreateTime(DateUtils.getNowDate());
        return vpnMapper.insertVpn(vpn);
    }

    /**
     * 修改虚拟专用网设备（VPN）
     * 
     * @param vpn 虚拟专用网设备（VPN）
     * @return 结果
     */
    @Override
    public int updateVpn(Vpn vpn)
    {
        vpn.setUpdateTime(DateUtils.getNowDate());
        return vpnMapper.updateVpn(vpn);
    }

    /**
     * 删除虚拟专用网设备（VPN）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVpnByIds(String ids)
    {
        return vpnMapper.deleteVpnByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除虚拟专用网设备（VPN）信息
     * 
     * @param id 虚拟专用网设备（VPN）ID
     * @return 结果
     */
    @Override
    public int deleteVpnById(Long id)
    {
        return vpnMapper.deleteVpnById(id);
    }
}
