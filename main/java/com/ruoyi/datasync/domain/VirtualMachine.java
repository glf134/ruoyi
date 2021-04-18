package com.ruoyi.datasync.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 虚拟机资源对象 virtual_machine
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class VirtualMachine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 虚拟机宿主机分类 */
    @Excel(name = "虚拟机宿主机分类")
    private String belongsServer;

    /** 软件平台品牌属地 */
    @Excel(name = "软件平台品牌属地")
    private String brandLand;

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

    /** 影响客户 */
    @Excel(name = "影响客户")
    private String influenceCustomer;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksInformation;

    /** 所属系统名称 */
    @Excel(name = "所属系统名称")
    private String systemName;

    /** 虚拟CPU信息 */
    @Excel(name = "虚拟CPU信息")
    private Integer virtualMachineCpuInformation;

    /** 虚拟硬盘大小 */
    @Excel(name = "虚拟硬盘大小")
    private Integer virtualMachineHarddiskSize;

    /** 虚拟内存大小 */
    @Excel(name = "虚拟内存大小")
    private Integer virtualMachineMemorySize;

    /** 虚拟化软件平台 */
    @Excel(name = "虚拟化软件平台")
    private String virtualizationSoftwarePlatform;

    /** 虚拟机管理平台 */
    @Excel(name = "虚拟机管理平台")
    private String vmManagementPlatform;

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
    public void setBelongsServer(String belongsServer) 
    {
        this.belongsServer = belongsServer;
    }

    public String getBelongsServer() 
    {
        return belongsServer;
    }
    public void setBrandLand(String brandLand) 
    {
        this.brandLand = brandLand;
    }

    public String getBrandLand() 
    {
        return brandLand;
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
    public void setInfluenceCustomer(String influenceCustomer) 
    {
        this.influenceCustomer = influenceCustomer;
    }

    public String getInfluenceCustomer() 
    {
        return influenceCustomer;
    }
    public void setRemarksInformation(String remarksInformation) 
    {
        this.remarksInformation = remarksInformation;
    }

    public String getRemarksInformation() 
    {
        return remarksInformation;
    }
    public void setSystemName(String systemName) 
    {
        this.systemName = systemName;
    }

    public String getSystemName() 
    {
        return systemName;
    }
    public void setVirtualMachineCpuInformation(Integer virtualMachineCpuInformation) 
    {
        this.virtualMachineCpuInformation = virtualMachineCpuInformation;
    }

    public Integer getVirtualMachineCpuInformation() 
    {
        return virtualMachineCpuInformation;
    }
    public void setVirtualMachineHarddiskSize(Integer virtualMachineHarddiskSize) 
    {
        this.virtualMachineHarddiskSize = virtualMachineHarddiskSize;
    }

    public Integer getVirtualMachineHarddiskSize() 
    {
        return virtualMachineHarddiskSize;
    }
    public void setVirtualMachineMemorySize(Integer virtualMachineMemorySize) 
    {
        this.virtualMachineMemorySize = virtualMachineMemorySize;
    }

    public Integer getVirtualMachineMemorySize() 
    {
        return virtualMachineMemorySize;
    }
    public void setVirtualizationSoftwarePlatform(String virtualizationSoftwarePlatform) 
    {
        this.virtualizationSoftwarePlatform = virtualizationSoftwarePlatform;
    }

    public String getVirtualizationSoftwarePlatform() 
    {
        return virtualizationSoftwarePlatform;
    }
    public void setVmManagementPlatform(String vmManagementPlatform) 
    {
        this.vmManagementPlatform = vmManagementPlatform;
    }

    public String getVmManagementPlatform() 
    {
        return vmManagementPlatform;
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
            .append("belongsServer", getBelongsServer())
            .append("brandLand", getBrandLand())
            .append("facilityCategory", getFacilityCategory())
            .append("facilityDescriptor", getFacilityDescriptor())
            .append("facilityName", getFacilityName())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("facilityUpdateDate", getFacilityUpdateDate())
            .append("facilityUseDate", getFacilityUseDate())
            .append("facilityUseState", getFacilityUseState())
            .append("influenceCustomer", getInfluenceCustomer())
            .append("remarksInformation", getRemarksInformation())
            .append("systemName", getSystemName())
            .append("virtualMachineCpuInformation", getVirtualMachineCpuInformation())
            .append("virtualMachineHarddiskSize", getVirtualMachineHarddiskSize())
            .append("virtualMachineMemorySize", getVirtualMachineMemorySize())
            .append("virtualizationSoftwarePlatform", getVirtualizationSoftwarePlatform())
            .append("vmManagementPlatform", getVmManagementPlatform())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
