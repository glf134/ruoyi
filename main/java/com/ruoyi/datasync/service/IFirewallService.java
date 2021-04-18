package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Firewall;

/**
 * 防火墙Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IFirewallService 
{
    /**
     * 查询防火墙
     * 
     * @param id 防火墙ID
     * @return 防火墙
     */
    public Firewall selectFirewallById(Long id);

    /**
     * 查询防火墙列表
     * 
     * @param firewall 防火墙
     * @return 防火墙集合
     */
    public List<Firewall> selectFirewallList(Firewall firewall);

    /**
     * 新增防火墙
     * 
     * @param firewall 防火墙
     * @return 结果
     */
    public int insertFirewall(Firewall firewall);

    /**
     * 修改防火墙
     * 
     * @param firewall 防火墙
     * @return 结果
     */
    public int updateFirewall(Firewall firewall);

    /**
     * 批量删除防火墙
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFirewallByIds(String ids);

    /**
     * 删除防火墙信息
     * 
     * @param id 防火墙ID
     * @return 结果
     */
    public int deleteFirewallById(Long id);
}
