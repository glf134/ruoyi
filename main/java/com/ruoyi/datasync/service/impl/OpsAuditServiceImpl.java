package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.OpsAuditMapper;
import com.ruoyi.datasync.domain.OpsAudit;
import com.ruoyi.datasync.service.IOpsAuditService;
import com.ruoyi.common.core.text.Convert;

/**
 * 运维审计设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class OpsAuditServiceImpl implements IOpsAuditService 
{
    @Autowired
    private OpsAuditMapper opsAuditMapper;

    /**
     * 查询运维审计设备
     * 
     * @param id 运维审计设备ID
     * @return 运维审计设备
     */
    @Override
    public OpsAudit selectOpsAuditById(Long id)
    {
        return opsAuditMapper.selectOpsAuditById(id);
    }

    /**
     * 查询运维审计设备列表
     * 
     * @param opsAudit 运维审计设备
     * @return 运维审计设备
     */
    @Override
    public List<OpsAudit> selectOpsAuditList(OpsAudit opsAudit)
    {
        return opsAuditMapper.selectOpsAuditList(opsAudit);
    }

    /**
     * 新增运维审计设备
     * 
     * @param opsAudit 运维审计设备
     * @return 结果
     */
    @Override
    public int insertOpsAudit(OpsAudit opsAudit)
    {
        opsAudit.setCreateTime(DateUtils.getNowDate());
        return opsAuditMapper.insertOpsAudit(opsAudit);
    }

    /**
     * 修改运维审计设备
     * 
     * @param opsAudit 运维审计设备
     * @return 结果
     */
    @Override
    public int updateOpsAudit(OpsAudit opsAudit)
    {
        opsAudit.setUpdateTime(DateUtils.getNowDate());
        return opsAuditMapper.updateOpsAudit(opsAudit);
    }

    /**
     * 删除运维审计设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOpsAuditByIds(String ids)
    {
        return opsAuditMapper.deleteOpsAuditByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除运维审计设备信息
     * 
     * @param id 运维审计设备ID
     * @return 结果
     */
    @Override
    public int deleteOpsAuditById(Long id)
    {
        return opsAuditMapper.deleteOpsAuditById(id);
    }
}
