package com.ruoyi.datasync.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础软件对象 based_software
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class BasedSoftware extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 品牌属地 */
    @Excel(name = "品牌属地")
    private String brandLand;

    /** 购买数量 */
    @Excel(name = "购买数量")
    private Integer number;

    /** 软件实例数 */
    @Excel(name = "软件实例数")
    private Integer numberOfSoftwareInstance;

    /** 软件许可数量 */
    @Excel(name = "软件许可数量")
    private Integer numberOfSoftwareLicenses;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksInformation;

    /** 使用范围 */
    @Excel(name = "使用范围")
    private String scopeOfUse;

    /** 软件分类标识符 */
    @Excel(name = "软件分类标识符")
    private String softwareCategory;

    /** 软件标识符 */
    @Excel(name = "软件标识符")
    private String softwareDescriptor;

    /** 软件安装条件 */
    @Excel(name = "软件安装条件")
    private String softwareInstallationConditions;

    /** 软件使用期限 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "软件使用期限", width = 30, dateFormat = "yyyy-MM-dd")
    private Date softwareLife;

    /** 软件生产商 */
    @Excel(name = "软件生产商")
    private String softwareManufacturer;

    /** 软件名称 */
    @Excel(name = "软件名称")
    private String softwareName;

    /** 软件来源 */
    @Excel(name = "软件来源")
    private String softwareSource;

    /** 软件使用机构 */
    @Excel(name = "软件使用机构")
    private String softwareUsingAgency;

    /** 软件版本信息 */
    @Excel(name = "软件版本信息")
    private String softwareVersionInformation;

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
    public void setBrandLand(String brandLand) 
    {
        this.brandLand = brandLand;
    }

    public String getBrandLand() 
    {
        return brandLand;
    }
    public void setNumber(Integer number) 
    {
        this.number = number;
    }

    public Integer getNumber() 
    {
        return number;
    }
    public void setNumberOfSoftwareInstance(Integer numberOfSoftwareInstance) 
    {
        this.numberOfSoftwareInstance = numberOfSoftwareInstance;
    }

    public Integer getNumberOfSoftwareInstance() 
    {
        return numberOfSoftwareInstance;
    }
    public void setNumberOfSoftwareLicenses(Integer numberOfSoftwareLicenses) 
    {
        this.numberOfSoftwareLicenses = numberOfSoftwareLicenses;
    }

    public Integer getNumberOfSoftwareLicenses() 
    {
        return numberOfSoftwareLicenses;
    }
    public void setRemarksInformation(String remarksInformation) 
    {
        this.remarksInformation = remarksInformation;
    }

    public String getRemarksInformation() 
    {
        return remarksInformation;
    }
    public void setScopeOfUse(String scopeOfUse) 
    {
        this.scopeOfUse = scopeOfUse;
    }

    public String getScopeOfUse() 
    {
        return scopeOfUse;
    }
    public void setSoftwareCategory(String softwareCategory) 
    {
        this.softwareCategory = softwareCategory;
    }

    public String getSoftwareCategory() 
    {
        return softwareCategory;
    }
    public void setSoftwareDescriptor(String softwareDescriptor) 
    {
        this.softwareDescriptor = softwareDescriptor;
    }

    public String getSoftwareDescriptor() 
    {
        return softwareDescriptor;
    }
    public void setSoftwareInstallationConditions(String softwareInstallationConditions) 
    {
        this.softwareInstallationConditions = softwareInstallationConditions;
    }

    public String getSoftwareInstallationConditions() 
    {
        return softwareInstallationConditions;
    }
    public void setSoftwareLife(Date softwareLife) 
    {
        this.softwareLife = softwareLife;
    }

    public Date getSoftwareLife() 
    {
        return softwareLife;
    }
    public void setSoftwareManufacturer(String softwareManufacturer) 
    {
        this.softwareManufacturer = softwareManufacturer;
    }

    public String getSoftwareManufacturer() 
    {
        return softwareManufacturer;
    }
    public void setSoftwareName(String softwareName) 
    {
        this.softwareName = softwareName;
    }

    public String getSoftwareName() 
    {
        return softwareName;
    }
    public void setSoftwareSource(String softwareSource) 
    {
        this.softwareSource = softwareSource;
    }

    public String getSoftwareSource() 
    {
        return softwareSource;
    }
    public void setSoftwareUsingAgency(String softwareUsingAgency) 
    {
        this.softwareUsingAgency = softwareUsingAgency;
    }

    public String getSoftwareUsingAgency() 
    {
        return softwareUsingAgency;
    }
    public void setSoftwareVersionInformation(String softwareVersionInformation) 
    {
        this.softwareVersionInformation = softwareVersionInformation;
    }

    public String getSoftwareVersionInformation() 
    {
        return softwareVersionInformation;
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
            .append("brandLand", getBrandLand())
            .append("number", getNumber())
            .append("numberOfSoftwareInstance", getNumberOfSoftwareInstance())
            .append("numberOfSoftwareLicenses", getNumberOfSoftwareLicenses())
            .append("remarksInformation", getRemarksInformation())
            .append("scopeOfUse", getScopeOfUse())
            .append("softwareCategory", getSoftwareCategory())
            .append("softwareDescriptor", getSoftwareDescriptor())
            .append("softwareInstallationConditions", getSoftwareInstallationConditions())
            .append("softwareLife", getSoftwareLife())
            .append("softwareManufacturer", getSoftwareManufacturer())
            .append("softwareName", getSoftwareName())
            .append("softwareSource", getSoftwareSource())
            .append("softwareUsingAgency", getSoftwareUsingAgency())
            .append("softwareVersionInformation", getSoftwareVersionInformation())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
