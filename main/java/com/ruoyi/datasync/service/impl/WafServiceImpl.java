package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.WafMapper;
import com.ruoyi.datasync.domain.Waf;
import com.ruoyi.datasync.service.IWafService;
import com.ruoyi.common.core.text.Convert;

/**
 * Web应用防护系统（WAF）Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class WafServiceImpl implements IWafService 
{
    @Autowired
    private WafMapper wafMapper;

    /**
     * 查询Web应用防护系统（WAF）
     * 
     * @param id Web应用防护系统（WAF）ID
     * @return Web应用防护系统（WAF）
     */
    @Override
    public Waf selectWafById(Long id)
    {
        return wafMapper.selectWafById(id);
    }

    /**
     * 查询Web应用防护系统（WAF）列表
     * 
     * @param waf Web应用防护系统（WAF）
     * @return Web应用防护系统（WAF）
     */
    @Override
    public List<Waf> selectWafList(Waf waf)
    {
        return wafMapper.selectWafList(waf);
    }

    /**
     * 新增Web应用防护系统（WAF）
     * 
     * @param waf Web应用防护系统（WAF）
     * @return 结果
     */
    @Override
    public int insertWaf(Waf waf)
    {
        waf.setCreateTime(DateUtils.getNowDate());
        return wafMapper.insertWaf(waf);
    }

    /**
     * 修改Web应用防护系统（WAF）
     * 
     * @param waf Web应用防护系统（WAF）
     * @return 结果
     */
    @Override
    public int updateWaf(Waf waf)
    {
        waf.setUpdateTime(DateUtils.getNowDate());
        return wafMapper.updateWaf(waf);
    }

    /**
     * 删除Web应用防护系统（WAF）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWafByIds(String ids)
    {
        return wafMapper.deleteWafByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除Web应用防护系统（WAF）信息
     * 
     * @param id Web应用防护系统（WAF）ID
     * @return 结果
     */
    @Override
    public int deleteWafById(Long id)
    {
        return wafMapper.deleteWafById(id);
    }
}
