package com.ruoyi.datasync.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 数据中心间距对象 data_center_spacing
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class DataCenterSpacing extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 从属关系 */
    @Excel(name = "从属关系")
    private String affiliation;

    /** 直线距离 */
    @Excel(name = "直线距离")
    private Long airlineDistance;

    /** 分类标识符 */
    @Excel(name = "分类标识符")
    private String facilityCategory;

    /** 归属机构 */
    @Excel(name = "归属机构")
    private String facilityOwnershipAgency;

    /** 本端数据中心 */
    @Excel(name = "本端数据中心")
    private String localDb;

    /** 对端数据中心 */
    @Excel(name = "对端数据中心")
    private String oppositeDb;

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
    public void setAffiliation(String affiliation) 
    {
        this.affiliation = affiliation;
    }

    public String getAffiliation() 
    {
        return affiliation;
    }
    public void setAirlineDistance(Long airlineDistance) 
    {
        this.airlineDistance = airlineDistance;
    }

    public Long getAirlineDistance() 
    {
        return airlineDistance;
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
    public void setLocalDb(String localDb) 
    {
        this.localDb = localDb;
    }

    public String getLocalDb() 
    {
        return localDb;
    }
    public void setOppositeDb(String oppositeDb) 
    {
        this.oppositeDb = oppositeDb;
    }

    public String getOppositeDb() 
    {
        return oppositeDb;
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
            .append("affiliation", getAffiliation())
            .append("airlineDistance", getAirlineDistance())
            .append("facilityCategory", getFacilityCategory())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("localDb", getLocalDb())
            .append("oppositeDb", getOppositeDb())
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
