package com.ruoyi.datasync.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 防病毒网关(AVE)对象 ave
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class Ave extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 管理部门 */
    @Excel(name = "管理部门")
    private String administrativeDepartment;

    /** 设备品牌 */
    @Excel(name = "设备品牌")
    private String assetBrand;

    /** 资产编码（可读性标识编码） */
    @Excel(name = "资产编码", readConverterExp = "可=读性标识编码")
    private String assetCode;

    /** 产品序列号 */
    @Excel(name = "产品序列号")
    private String assetSerialNumber;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String assetType;

    /** 资产价值 */
    @Excel(name = "资产价值")
    private Long assetValue;

    /** 所属机柜 */
    @Excel(name = "所属机柜")
    private String belongCabinet;

    /** 品牌属地 */
    @Excel(name = "品牌属地")
    private String brandLand;

    /** 部署区域 */
    @Excel(name = "部署区域")
    private String deployArea;

    /** 所属机房 */
    @Excel(name = "所属机房")
    private String deployComputerRoom;

    /** 部署数据中心 */
    @Excel(name = "部署数据中心")
    private String deployDb;

    /** 所属楼层 */
    @Excel(name = "所属楼层")
    private String deployFloor;

    /** 所属楼座 */
    @Excel(name = "所属楼座")
    private String deployGallery;

    /** 设备高度 */
    @Excel(name = "设备高度")
    private Integer deviceHeight;

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

    /** 影响系统 */
    @Excel(name = "影响系统")
    private String influenceSystem;

    /** 维修故障原因 */
    @Excel(name = "维修故障原因")
    private String maintenanceCause;

    /** 维修结果 */
    @Excel(name = "维修结果")
    private String maintenanceResults;

    /** 维修时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "维修时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date maintenanceTime;

    /** 主要功能 */
    @Excel(name = "主要功能")
    private String majorFunction;

    /** 管理IP地址 */
    @Excel(name = "管理IP地址")
    private String managementIp;

    /** 操作系统版本信息 */
    @Excel(name = "操作系统版本信息")
    private String operatingSystemVersionInformation;

    /** 运维部门 */
    @Excel(name = "运维部门")
    private String operationDepartment;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksInformation;

    /** 安全部署方式 */
    @Excel(name = "安全部署方式")
    private String safetydeploymentMode;

    /** 扫描类型 */
    @Excel(name = "扫描类型")
    private String scanningType;

    /** 安全销售许可 */
    @Excel(name = "安全销售许可")
    private Long sellingLicense;

    /** 服务截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "服务截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date serviceEndTime;

    /** 服务级别 */
    @Excel(name = "服务级别")
    private String serviceLevel;

    /** 服务提供商 */
    @Excel(name = "服务提供商")
    private String serviceProvider;

    /** 服务开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "服务开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date serviceStartTime;

    /** 槽位号 */
    @Excel(name = "槽位号")
    private String slotNo;

    /** IPV6支持能力 */
    @Excel(name = "IPV6支持能力")
    private Long supportIpv6;

    /** 吞吐率 */
    @Excel(name = "吞吐率")
    private String throughputRate;

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
    public void setAdministrativeDepartment(String administrativeDepartment) 
    {
        this.administrativeDepartment = administrativeDepartment;
    }

    public String getAdministrativeDepartment() 
    {
        return administrativeDepartment;
    }
    public void setAssetBrand(String assetBrand) 
    {
        this.assetBrand = assetBrand;
    }

    public String getAssetBrand() 
    {
        return assetBrand;
    }
    public void setAssetCode(String assetCode) 
    {
        this.assetCode = assetCode;
    }

    public String getAssetCode() 
    {
        return assetCode;
    }
    public void setAssetSerialNumber(String assetSerialNumber) 
    {
        this.assetSerialNumber = assetSerialNumber;
    }

    public String getAssetSerialNumber() 
    {
        return assetSerialNumber;
    }
    public void setAssetType(String assetType) 
    {
        this.assetType = assetType;
    }

    public String getAssetType() 
    {
        return assetType;
    }
    public void setAssetValue(Long assetValue) 
    {
        this.assetValue = assetValue;
    }

    public Long getAssetValue() 
    {
        return assetValue;
    }
    public void setBelongCabinet(String belongCabinet) 
    {
        this.belongCabinet = belongCabinet;
    }

    public String getBelongCabinet() 
    {
        return belongCabinet;
    }
    public void setBrandLand(String brandLand) 
    {
        this.brandLand = brandLand;
    }

    public String getBrandLand() 
    {
        return brandLand;
    }
    public void setDeployArea(String deployArea) 
    {
        this.deployArea = deployArea;
    }

    public String getDeployArea() 
    {
        return deployArea;
    }
    public void setDeployComputerRoom(String deployComputerRoom) 
    {
        this.deployComputerRoom = deployComputerRoom;
    }

    public String getDeployComputerRoom() 
    {
        return deployComputerRoom;
    }
    public void setDeployDb(String deployDb) 
    {
        this.deployDb = deployDb;
    }

    public String getDeployDb() 
    {
        return deployDb;
    }
    public void setDeployFloor(String deployFloor) 
    {
        this.deployFloor = deployFloor;
    }

    public String getDeployFloor() 
    {
        return deployFloor;
    }
    public void setDeployGallery(String deployGallery) 
    {
        this.deployGallery = deployGallery;
    }

    public String getDeployGallery() 
    {
        return deployGallery;
    }
    public void setDeviceHeight(Integer deviceHeight) 
    {
        this.deviceHeight = deviceHeight;
    }

    public Integer getDeviceHeight() 
    {
        return deviceHeight;
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
    public void setInfluenceSystem(String influenceSystem) 
    {
        this.influenceSystem = influenceSystem;
    }

    public String getInfluenceSystem() 
    {
        return influenceSystem;
    }
    public void setMaintenanceCause(String maintenanceCause) 
    {
        this.maintenanceCause = maintenanceCause;
    }

    public String getMaintenanceCause() 
    {
        return maintenanceCause;
    }
    public void setMaintenanceResults(String maintenanceResults) 
    {
        this.maintenanceResults = maintenanceResults;
    }

    public String getMaintenanceResults() 
    {
        return maintenanceResults;
    }
    public void setMaintenanceTime(Date maintenanceTime) 
    {
        this.maintenanceTime = maintenanceTime;
    }

    public Date getMaintenanceTime() 
    {
        return maintenanceTime;
    }
    public void setMajorFunction(String majorFunction) 
    {
        this.majorFunction = majorFunction;
    }

    public String getMajorFunction() 
    {
        return majorFunction;
    }
    public void setManagementIp(String managementIp) 
    {
        this.managementIp = managementIp;
    }

    public String getManagementIp() 
    {
        return managementIp;
    }
    public void setOperatingSystemVersionInformation(String operatingSystemVersionInformation) 
    {
        this.operatingSystemVersionInformation = operatingSystemVersionInformation;
    }

    public String getOperatingSystemVersionInformation() 
    {
        return operatingSystemVersionInformation;
    }
    public void setOperationDepartment(String operationDepartment) 
    {
        this.operationDepartment = operationDepartment;
    }

    public String getOperationDepartment() 
    {
        return operationDepartment;
    }
    public void setRemarksInformation(String remarksInformation) 
    {
        this.remarksInformation = remarksInformation;
    }

    public String getRemarksInformation() 
    {
        return remarksInformation;
    }
    public void setSafetydeploymentMode(String safetydeploymentMode) 
    {
        this.safetydeploymentMode = safetydeploymentMode;
    }

    public String getSafetydeploymentMode() 
    {
        return safetydeploymentMode;
    }
    public void setScanningType(String scanningType) 
    {
        this.scanningType = scanningType;
    }

    public String getScanningType() 
    {
        return scanningType;
    }
    public void setSellingLicense(Long sellingLicense) 
    {
        this.sellingLicense = sellingLicense;
    }

    public Long getSellingLicense() 
    {
        return sellingLicense;
    }
    public void setServiceEndTime(Date serviceEndTime) 
    {
        this.serviceEndTime = serviceEndTime;
    }

    public Date getServiceEndTime() 
    {
        return serviceEndTime;
    }
    public void setServiceLevel(String serviceLevel) 
    {
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel() 
    {
        return serviceLevel;
    }
    public void setServiceProvider(String serviceProvider) 
    {
        this.serviceProvider = serviceProvider;
    }

    public String getServiceProvider() 
    {
        return serviceProvider;
    }
    public void setServiceStartTime(Date serviceStartTime) 
    {
        this.serviceStartTime = serviceStartTime;
    }

    public Date getServiceStartTime() 
    {
        return serviceStartTime;
    }
    public void setSlotNo(String slotNo) 
    {
        this.slotNo = slotNo;
    }

    public String getSlotNo() 
    {
        return slotNo;
    }
    public void setSupportIpv6(Long supportIpv6) 
    {
        this.supportIpv6 = supportIpv6;
    }

    public Long getSupportIpv6() 
    {
        return supportIpv6;
    }
    public void setThroughputRate(String throughputRate) 
    {
        this.throughputRate = throughputRate;
    }

    public String getThroughputRate() 
    {
        return throughputRate;
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
            .append("administrativeDepartment", getAdministrativeDepartment())
            .append("assetBrand", getAssetBrand())
            .append("assetCode", getAssetCode())
            .append("assetSerialNumber", getAssetSerialNumber())
            .append("assetType", getAssetType())
            .append("assetValue", getAssetValue())
            .append("belongCabinet", getBelongCabinet())
            .append("brandLand", getBrandLand())
            .append("deployArea", getDeployArea())
            .append("deployComputerRoom", getDeployComputerRoom())
            .append("deployDb", getDeployDb())
            .append("deployFloor", getDeployFloor())
            .append("deployGallery", getDeployGallery())
            .append("deviceHeight", getDeviceHeight())
            .append("facilityCategory", getFacilityCategory())
            .append("facilityDescriptor", getFacilityDescriptor())
            .append("facilityName", getFacilityName())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("facilityUpdateDate", getFacilityUpdateDate())
            .append("facilityUseDate", getFacilityUseDate())
            .append("facilityUseState", getFacilityUseState())
            .append("influenceSystem", getInfluenceSystem())
            .append("maintenanceCause", getMaintenanceCause())
            .append("maintenanceResults", getMaintenanceResults())
            .append("maintenanceTime", getMaintenanceTime())
            .append("majorFunction", getMajorFunction())
            .append("managementIp", getManagementIp())
            .append("operatingSystemVersionInformation", getOperatingSystemVersionInformation())
            .append("operationDepartment", getOperationDepartment())
            .append("remarksInformation", getRemarksInformation())
            .append("safetydeploymentMode", getSafetydeploymentMode())
            .append("scanningType", getScanningType())
            .append("sellingLicense", getSellingLicense())
            .append("serviceEndTime", getServiceEndTime())
            .append("serviceLevel", getServiceLevel())
            .append("serviceProvider", getServiceProvider())
            .append("serviceStartTime", getServiceStartTime())
            .append("slotNo", getSlotNo())
            .append("supportIpv6", getSupportIpv6())
            .append("throughputRate", getThroughputRate())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
