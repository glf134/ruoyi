package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.SecurityGatewayMapper;
import com.ruoyi.datasync.domain.SecurityGateway;
import com.ruoyi.datasync.service.ISecurityGatewayService;
import com.ruoyi.common.core.text.Convert;

/**
 * 安全网关Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class SecurityGatewayServiceImpl implements ISecurityGatewayService 
{
    @Autowired
    private SecurityGatewayMapper securityGatewayMapper;

    /**
     * 查询安全网关
     * 
     * @param id 安全网关ID
     * @return 安全网关
     */
    @Override
    public SecurityGateway selectSecurityGatewayById(Long id)
    {
        return securityGatewayMapper.selectSecurityGatewayById(id);
    }

    /**
     * 查询安全网关列表
     * 
     * @param securityGateway 安全网关
     * @return 安全网关
     */
    @Override
    public List<SecurityGateway> selectSecurityGatewayList(SecurityGateway securityGateway)
    {
        return securityGatewayMapper.selectSecurityGatewayList(securityGateway);
    }

    /**
     * 新增安全网关
     * 
     * @param securityGateway 安全网关
     * @return 结果
     */
    @Override
    public int insertSecurityGateway(SecurityGateway securityGateway)
    {
        securityGateway.setCreateTime(DateUtils.getNowDate());
        return securityGatewayMapper.insertSecurityGateway(securityGateway);
    }

    /**
     * 修改安全网关
     * 
     * @param securityGateway 安全网关
     * @return 结果
     */
    @Override
    public int updateSecurityGateway(SecurityGateway securityGateway)
    {
        securityGateway.setUpdateTime(DateUtils.getNowDate());
        return securityGatewayMapper.updateSecurityGateway(securityGateway);
    }

    /**
     * 删除安全网关对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSecurityGatewayByIds(String ids)
    {
        return securityGatewayMapper.deleteSecurityGatewayByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除安全网关信息
     * 
     * @param id 安全网关ID
     * @return 结果
     */
    @Override
    public int deleteSecurityGatewayById(Long id)
    {
        return securityGatewayMapper.deleteSecurityGatewayById(id);
    }
}
