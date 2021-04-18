package com.ruoyi.datasync.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供电关联关系对象 power_supply_relation
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class PowerSupplyRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 分类标识符 */
    @Excel(name = "分类标识符")
    private String facilityCategory;

    /** 归属机构 */
    @Excel(name = "归属机构")
    private String facilityOwnershipAgency;

    /** 供电设施 */
    @Excel(name = "供电设施")
    private String powerSupplyAsset;

    /** 供电设施类型 */
    @Excel(name = "供电设施类型")
    private String powerSupplyAssetCategory;

    /** 用电设施 */
    @Excel(name = "用电设施")
    private String powerUsedAsset;

    /** 用电设施类型 */
    @Excel(name = "用电设施类型")
    private String powerUsedAssetCategory;

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
    public void setPowerSupplyAsset(String powerSupplyAsset) 
    {
        this.powerSupplyAsset = powerSupplyAsset;
    }

    public String getPowerSupplyAsset() 
    {
        return powerSupplyAsset;
    }
    public void setPowerSupplyAssetCategory(String powerSupplyAssetCategory) 
    {
        this.powerSupplyAssetCategory = powerSupplyAssetCategory;
    }

    public String getPowerSupplyAssetCategory() 
    {
        return powerSupplyAssetCategory;
    }
    public void setPowerUsedAsset(String powerUsedAsset) 
    {
        this.powerUsedAsset = powerUsedAsset;
    }

    public String getPowerUsedAsset() 
    {
        return powerUsedAsset;
    }
    public void setPowerUsedAssetCategory(String powerUsedAssetCategory) 
    {
        this.powerUsedAssetCategory = powerUsedAssetCategory;
    }

    public String getPowerUsedAssetCategory() 
    {
        return powerUsedAssetCategory;
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
            .append("facilityCategory", getFacilityCategory())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("powerSupplyAsset", getPowerSupplyAsset())
            .append("powerSupplyAssetCategory", getPowerSupplyAssetCategory())
            .append("powerUsedAsset", getPowerUsedAsset())
            .append("powerUsedAssetCategory", getPowerUsedAssetCategory())
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
