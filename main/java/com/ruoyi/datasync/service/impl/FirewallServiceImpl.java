package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.FirewallMapper;
import com.ruoyi.datasync.domain.Firewall;
import com.ruoyi.datasync.service.IFirewallService;
import com.ruoyi.common.core.text.Convert;

/**
 * 防火墙Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class FirewallServiceImpl implements IFirewallService 
{
    @Autowired
    private FirewallMapper firewallMapper;

    /**
     * 查询防火墙
     * 
     * @param id 防火墙ID
     * @return 防火墙
     */
    @Override
    public Firewall selectFirewallById(Long id)
    {
        return firewallMapper.selectFirewallById(id);
    }

    /**
     * 查询防火墙列表
     * 
     * @param firewall 防火墙
     * @return 防火墙
     */
    @Override
    public List<Firewall> selectFirewallList(Firewall firewall)
    {
        return firewallMapper.selectFirewallList(firewall);
    }

    /**
     * 新增防火墙
     * 
     * @param firewall 防火墙
     * @return 结果
     */
    @Override
    public int insertFirewall(Firewall firewall)
    {
        firewall.setCreateTime(DateUtils.getNowDate());
        return firewallMapper.insertFirewall(firewall);
    }

    /**
     * 修改防火墙
     * 
     * @param firewall 防火墙
     * @return 结果
     */
    @Override
    public int updateFirewall(Firewall firewall)
    {
        firewall.setUpdateTime(DateUtils.getNowDate());
        return firewallMapper.updateFirewall(firewall);
    }

    /**
     * 删除防火墙对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFirewallByIds(String ids)
    {
        return firewallMapper.deleteFirewallByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除防火墙信息
     * 
     * @param id 防火墙ID
     * @return 结果
     */
    @Override
    public int deleteFirewallById(Long id)
    {
        return firewallMapper.deleteFirewallById(id);
    }
}
