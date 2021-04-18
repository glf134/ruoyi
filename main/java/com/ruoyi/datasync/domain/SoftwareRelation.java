package com.ruoyi.datasync.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 软件实例关联关系对象 software_relation
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class SoftwareRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 基础软件关联服务器 */
    @Excel(name = "基础软件关联服务器")
    private String FacilityDescriptor;

    /** 软件标识符 */
    @Excel(name = "软件标识符")
    private String SoftwareDescriptor;

    /** 服务器类型标识 */
    @Excel(name = "服务器类型标识")
    private String applicationServerType;

    /** 分类标识符 */
    @Excel(name = "分类标识符")
    private String facilityCategory;

    /** 归属机构 */
    @Excel(name = "归属机构")
    private String facilityOwnershipAgency;

    /** 关系标识符 */
    @Excel(name = "关系标识符")
    private String relationalIdentifier;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFacilityDescriptor(String FacilityDescriptor) 
    {
        this.FacilityDescriptor = FacilityDescriptor;
    }

    public String getFacilityDescriptor() 
    {
        return FacilityDescriptor;
    }
    public void setSoftwareDescriptor(String SoftwareDescriptor) 
    {
        this.SoftwareDescriptor = SoftwareDescriptor;
    }

    public String getSoftwareDescriptor() 
    {
        return SoftwareDescriptor;
    }
    public void setApplicationServerType(String applicationServerType) 
    {
        this.applicationServerType = applicationServerType;
    }

    public String getApplicationServerType() 
    {
        return applicationServerType;
    }
    public void setFacilityCategory(String facilityCategory) 
    {
        this.facilityCategory = facilityCategory;
    }

    public String getFacilityCategory() 
    {
        return facilityCategory;
    }
    public void setFacilityOwnershipAgency(String facilityOwnershipAgency) 
    {
        this.facilityOwnershipAgency = facilityOwnershipAgency;
    }

    public String getFacilityOwnershipAgency() 
    {
        return facilityOwnershipAgency;
    }
    public void setRelationalIdentifier(String relationalIdentifier) 
    {
        this.relationalIdentifier = relationalIdentifier;
    }

    public String getRelationalIdentifier() 
    {
        return relationalIdentifier;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("FacilityDescriptor", getFacilityDescriptor())
            .append("SoftwareDescriptor", getSoftwareDescriptor())
            .append("applicationServerType", getApplicationServerType())
            .append("facilityCategory", getFacilityCategory())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("relationalIdentifier", getRelationalIdentifier())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
