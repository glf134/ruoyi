package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.OpsAudit;

/**
 * 运维审计设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IOpsAuditService 
{
    /**
     * 查询运维审计设备
     * 
     * @param id 运维审计设备ID
     * @return 运维审计设备
     */
    public OpsAudit selectOpsAuditById(Long id);

    /**
     * 查询运维审计设备列表
     * 
     * @param opsAudit 运维审计设备
     * @return 运维审计设备集合
     */
    public List<OpsAudit> selectOpsAuditList(OpsAudit opsAudit);

    /**
     * 新增运维审计设备
     * 
     * @param opsAudit 运维审计设备
     * @return 结果
     */
    public int insertOpsAudit(OpsAudit opsAudit);

    /**
     * 修改运维审计设备
     * 
     * @param opsAudit 运维审计设备
     * @return 结果
     */
    public int updateOpsAudit(OpsAudit opsAudit);

    /**
     * 批量删除运维审计设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOpsAuditByIds(String ids);

    /**
     * 删除运维审计设备信息
     * 
     * @param id 运维审计设备ID
     * @return 结果
     */
    public int deleteOpsAuditById(Long id);
}
