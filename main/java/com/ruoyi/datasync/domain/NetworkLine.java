package com.ruoyi.datasync.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 网络线路对象 network_line
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class NetworkLine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 设施分类标识符 */
    @Excel(name = "设施分类标识符")
    private String facilityCategory;

    /** 设施标识符 */
    @Excel(name = "设施标识符")
    private String facilityDescriptor;

    /** 设施名称 */
    @Excel(name = "设施名称")
    private String facilityName;

    /** 设施归属机构 */
    @Excel(name = "设施归属机构")
    private String facilityOwnershipAgency;

    /** 设施信息更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "设施信息更新日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date facilityUpdateDate;

    /** 设施投产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "设施投产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date facilityUseDate;

    /** 设施在用状态 */
    @Excel(name = "设施在用状态")
    private String facilityUseState;

    /** 网络线路运营商 */
    @Excel(name = "网络线路运营商")
    private String isp;

    /** 线路资费 */
    @Excel(name = "线路资费")
    private Long lineCost;

    /** 线路类型 */
    @Excel(name = "线路类型")
    private String lineType;

    /** 线路用途 */
    @Excel(name = "线路用途")
    private String lineUsage;

    /** 网络带宽 */
    @Excel(name = "网络带宽")
    private Long networkBandwidth;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksInformation;

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
    public void setFacilityCategory(String facilityCategory) 
    {
        this.facilityCategory = facilityCategory;
    }

    public String getFacilityCategory() 
    {
        return facilityCategory;
    }
    public void setFacilityDescriptor(String facilityDescriptor) 
    {
        this.facilityDescriptor = facilityDescriptor;
    }

    public String getFacilityDescriptor() 
    {
        return facilityDescriptor;
    }
    public void setFacilityName(String facilityName) 
    {
        this.facilityName = facilityName;
    }

    public String getFacilityName() 
    {
        return facilityName;
    }
    public void setFacilityOwnershipAgency(String facilityOwnershipAgency) 
    {
        this.facilityOwnershipAgency = facilityOwnershipAgency;
    }

    public String getFacilityOwnershipAgency() 
    {
        return facilityOwnershipAgency;
    }
    public void setFacilityUpdateDate(Date facilityUpdateDate) 
    {
        this.facilityUpdateDate = facilityUpdateDate;
    }

    public Date getFacilityUpdateDate() 
    {
        return facilityUpdateDate;
    }
    public void setFacilityUseDate(Date facilityUseDate) 
    {
        this.facilityUseDate = facilityUseDate;
    }

    public Date getFacilityUseDate() 
    {
        return facilityUseDate;
    }
    public void setFacilityUseState(String facilityUseState) 
    {
        this.facilityUseState = facilityUseState;
    }

    public String getFacilityUseState() 
    {
        return facilityUseState;
    }
    public void setIsp(String isp) 
    {
        this.isp = isp;
    }

    public String getIsp() 
    {
        return isp;
    }
    public void setLineCost(Long lineCost) 
    {
        this.lineCost = lineCost;
    }

    public Long getLineCost() 
    {
        return lineCost;
    }
    public void setLineType(String lineType) 
    {
        this.lineType = lineType;
    }

    public String getLineType() 
    {
        return lineType;
    }
    public void setLineUsage(String lineUsage) 
    {
        this.lineUsage = lineUsage;
    }

    public String getLineUsage() 
    {
        return lineUsage;
    }
    public void setNetworkBandwidth(Long networkBandwidth) 
    {
        this.networkBandwidth = networkBandwidth;
    }

    public Long getNetworkBandwidth() 
    {
        return networkBandwidth;
    }
    public void setRemarksInformation(String remarksInformation) 
    {
        this.remarksInformation = remarksInformation;
    }

    public String getRemarksInformation() 
    {
        return remarksInformation;
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
            .append("facilityCategory", getFacilityCategory())
            .append("facilityDescriptor", getFacilityDescriptor())
            .append("facilityName", getFacilityName())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("facilityUpdateDate", getFacilityUpdateDate())
            .append("facilityUseDate", getFacilityUseDate())
            .append("facilityUseState", getFacilityUseState())
            .append("isp", getIsp())
            .append("lineCost", getLineCost())
            .append("lineType", getLineType())
            .append("lineUsage", getLineUsage())
            .append("networkBandwidth", getNetworkBandwidth())
            .append("remarksInformation", getRemarksInformation())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
