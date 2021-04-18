package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Waf;

/**
 * Web应用防护系统（WAF）Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IWafService 
{
    /**
     * 查询Web应用防护系统（WAF）
     * 
     * @param id Web应用防护系统（WAF）ID
     * @return Web应用防护系统（WAF）
     */
    public Waf selectWafById(Long id);

    /**
     * 查询Web应用防护系统（WAF）列表
     * 
     * @param waf Web应用防护系统（WAF）
     * @return Web应用防护系统（WAF）集合
     */
    public List<Waf> selectWafList(Waf waf);

    /**
     * 新增Web应用防护系统（WAF）
     * 
     * @param waf Web应用防护系统（WAF）
     * @return 结果
     */
    public int insertWaf(Waf waf);

    /**
     * 修改Web应用防护系统（WAF）
     * 
     * @param waf Web应用防护系统（WAF）
     * @return 结果
     */
    public int updateWaf(Waf waf);

    /**
     * 批量删除Web应用防护系统（WAF）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWafByIds(String ids);

    /**
     * 删除Web应用防护系统（WAF）信息
     * 
     * @param id Web应用防护系统（WAF）ID
     * @return 结果
     */
    public int deleteWafById(Long id);
}
