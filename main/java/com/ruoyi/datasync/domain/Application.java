package com.ruoyi.datasync.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 应用系统对象 application
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class Application extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 应用简介 */
    @Excel(name = "应用简介")
    private String applicationProfile;

    /** 应用系统标识符 */
    @Excel(name = "应用系统标识符")
    private String applySystemIdentifiers;

    /** 品牌属地 */
    @Excel(name = "品牌属地")
    private String brandLand;

    /** 等级保护级别 */
    @Excel(name = "等级保护级别")
    private String levelOfProtection;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

    /** 软件分类标识符 */
    @Excel(name = "软件分类标识符")
    private String softwareCategory;

    /** 软件名称 */
    @Excel(name = "软件名称")
    private String softwareName;

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
    public void setApplicationProfile(String applicationProfile) 
    {
        this.applicationProfile = applicationProfile;
    }

    public String getApplicationProfile() 
    {
        return applicationProfile;
    }
    public void setApplySystemIdentifiers(String applySystemIdentifiers) 
    {
        this.applySystemIdentifiers = applySystemIdentifiers;
    }

    public String getApplySystemIdentifiers() 
    {
        return applySystemIdentifiers;
    }
    public void setBrandLand(String brandLand) 
    {
        this.brandLand = brandLand;
    }

    public String getBrandLand() 
    {
        return brandLand;
    }
    public void setLevelOfProtection(String levelOfProtection) 
    {
        this.levelOfProtection = levelOfProtection;
    }

    public String getLevelOfProtection() 
    {
        return levelOfProtection;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
    }
    public void setSoftwareCategory(String softwareCategory) 
    {
        this.softwareCategory = softwareCategory;
    }

    public String getSoftwareCategory() 
    {
        return softwareCategory;
    }
    public void setSoftwareName(String softwareName) 
    {
        this.softwareName = softwareName;
    }

    public String getSoftwareName() 
    {
        return softwareName;
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
            .append("applicationProfile", getApplicationProfile())
            .append("applySystemIdentifiers", getApplySystemIdentifiers())
            .append("brandLand", getBrandLand())
            .append("levelOfProtection", getLevelOfProtection())
            .append("note", getNote())
            .append("softwareCategory", getSoftwareCategory())
            .append("softwareName", getSoftwareName())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
