package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.SecurityGateway;

/**
 * 安全网关Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface SecurityGatewayMapper 
{
    /**
     * 查询安全网关
     * 
     * @param id 安全网关ID
     * @return 安全网关
     */
    public SecurityGateway selectSecurityGatewayById(Long id);

    /**
     * 查询安全网关列表
     * 
     * @param securityGateway 安全网关
     * @return 安全网关集合
     */
    public List<SecurityGateway> selectSecurityGatewayList(SecurityGateway securityGateway);

    /**
     * 新增安全网关
     * 
     * @param securityGateway 安全网关
     * @return 结果
     */
    public int insertSecurityGateway(SecurityGateway securityGateway);

    /**
     * 修改安全网关
     * 
     * @param securityGateway 安全网关
     * @return 结果
     */
    public int updateSecurityGateway(SecurityGateway securityGateway);

    /**
     * 删除安全网关
     * 
     * @param id 安全网关ID
     * @return 结果
     */
    public int deleteSecurityGatewayById(Long id);

    /**
     * 批量删除安全网关
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSecurityGatewayByIds(String[] ids);
}
