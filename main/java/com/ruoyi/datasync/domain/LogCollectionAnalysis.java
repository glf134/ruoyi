package com.ruoyi.datasync.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 日志收集与分析系统对象 log_collection_analysis
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class LogCollectionAnalysis extends BaseEntity
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

    /** 业务面IP地址 */
    @Excel(name = "业务面IP地址")
    private String businessIp;

    /** CPU主频 */
    @Excel(name = "CPU主频")
    private Long cpuFrequency;

    /** 接口类型 */
    @Excel(name = "接口类型")
    private String ddrType;

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

    /** 支持设备类型 */
    @Excel(name = "支持设备类型")
    private String equipmentSupported;

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

    /** 日志存储位置 */
    @Excel(name = "日志存储位置")
    private String logLocation;

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

    /** 管理IP地址 */
    @Excel(name = "管理IP地址")
    private String managementIp;

    /** 内存容量 */
    @Excel(name = "内存容量")
    private Integer memoryCapacity;

    /** CPU总核数 */
    @Excel(name = "CPU总核数")
    private Integer numberOfCoresPerCpu;

    /** 操作系统版本信息 */
    @Excel(name = "操作系统版本信息")
    private String operatingSystemVersionInformation;

    /** 运维部门 */
    @Excel(name = "运维部门")
    private String operationDepartment;

    /** 产品架构 */
    @Excel(name = "产品架构")
    private String productArchitecture;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksInformation;

    /** 安全部署方式 */
    @Excel(name = "安全部署方式")
    private String safetydeploymentMode;

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

    /** 存储周期 */
    @Excel(name = "存储周期")
    private Integer storagePeriod;

    /** IPV6支持能力 */
    @Excel(name = "IPV6支持能力")
    private Long supportIpv6;

    /** 所属系统信息 */
    @Excel(name = "所属系统信息")
    private String systemInformation;

    /** 吞吐率 */
    @Excel(name = "吞吐率")
    private String throughputRate;

    /** 存储总容量 */
    @Excel(name = "存储总容量")
    private Integer totalStorageCapacity;

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
    public void setBusinessIp(String businessIp) 
    {
        this.businessIp = businessIp;
    }

    public String getBusinessIp() 
    {
        return businessIp;
    }
    public void setCpuFrequency(Long cpuFrequency) 
    {
        this.cpuFrequency = cpuFrequency;
    }

    public Long getCpuFrequency() 
    {
        return cpuFrequency;
    }
    public void setDdrType(String ddrType) 
    {
        this.ddrType = ddrType;
    }

    public String getDdrType() 
    {
        return ddrType;
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
    public void setEquipmentSupported(String equipmentSupported) 
    {
        this.equipmentSupported = equipmentSupported;
    }

    public String getEquipmentSupported() 
    {
        return equipmentSupported;
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
    public void setLogLocation(String logLocation) 
    {
        this.logLocation = logLocation;
    }

    public String getLogLocation() 
    {
        return logLocation;
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
    public void setManagementIp(String managementIp) 
    {
        this.managementIp = managementIp;
    }

    public String getManagementIp() 
    {
        return managementIp;
    }
    public void setMemoryCapacity(Integer memoryCapacity) 
    {
        this.memoryCapacity = memoryCapacity;
    }

    public Integer getMemoryCapacity() 
    {
        return memoryCapacity;
    }
    public void setNumberOfCoresPerCpu(Integer numberOfCoresPerCpu) 
    {
        this.numberOfCoresPerCpu = numberOfCoresPerCpu;
    }

    public Integer getNumberOfCoresPerCpu() 
    {
        return numberOfCoresPerCpu;
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
    public void setProductArchitecture(String productArchitecture) 
    {
        this.productArchitecture = productArchitecture;
    }

    public String getProductArchitecture() 
    {
        return productArchitecture;
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
    public void setStoragePeriod(Integer storagePeriod) 
    {
        this.storagePeriod = storagePeriod;
    }

    public Integer getStoragePeriod() 
    {
        return storagePeriod;
    }
    public void setSupportIpv6(Long supportIpv6) 
    {
        this.supportIpv6 = supportIpv6;
    }

    public Long getSupportIpv6() 
    {
        return supportIpv6;
    }
    public void setSystemInformation(String systemInformation) 
    {
        this.systemInformation = systemInformation;
    }

    public String getSystemInformation() 
    {
        return systemInformation;
    }
    public void setThroughputRate(String throughputRate) 
    {
        this.throughputRate = throughputRate;
    }

    public String getThroughputRate() 
    {
        return throughputRate;
    }
    public void setTotalStorageCapacity(Integer totalStorageCapacity) 
    {
        this.totalStorageCapacity = totalStorageCapacity;
    }

    public Integer getTotalStorageCapacity() 
    {
        return totalStorageCapacity;
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
            .append("businessIp", getBusinessIp())
            .append("cpuFrequency", getCpuFrequency())
            .append("ddrType", getDdrType())
            .append("deployArea", getDeployArea())
            .append("deployComputerRoom", getDeployComputerRoom())
            .append("deployDb", getDeployDb())
            .append("deployFloor", getDeployFloor())
            .append("deployGallery", getDeployGallery())
            .append("deviceHeight", getDeviceHeight())
            .append("equipmentSupported", getEquipmentSupported())
            .append("facilityCategory", getFacilityCategory())
            .append("facilityDescriptor", getFacilityDescriptor())
            .append("facilityName", getFacilityName())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("facilityUpdateDate", getFacilityUpdateDate())
            .append("facilityUseDate", getFacilityUseDate())
            .append("facilityUseState", getFacilityUseState())
            .append("influenceSystem", getInfluenceSystem())
            .append("logLocation", getLogLocation())
            .append("maintenanceCause", getMaintenanceCause())
            .append("maintenanceResults", getMaintenanceResults())
            .append("maintenanceTime", getMaintenanceTime())
            .append("managementIp", getManagementIp())
            .append("memoryCapacity", getMemoryCapacity())
            .append("numberOfCoresPerCpu", getNumberOfCoresPerCpu())
            .append("operatingSystemVersionInformation", getOperatingSystemVersionInformation())
            .append("operationDepartment", getOperationDepartment())
            .append("productArchitecture", getProductArchitecture())
            .append("remarksInformation", getRemarksInformation())
            .append("safetydeploymentMode", getSafetydeploymentMode())
            .append("sellingLicense", getSellingLicense())
            .append("serviceEndTime", getServiceEndTime())
            .append("serviceLevel", getServiceLevel())
            .append("serviceProvider", getServiceProvider())
            .append("serviceStartTime", getServiceStartTime())
            .append("slotNo", getSlotNo())
            .append("storagePeriod", getStoragePeriod())
            .append("supportIpv6", getSupportIpv6())
            .append("systemInformation", getSystemInformation())
            .append("throughputRate", getThroughputRate())
            .append("totalStorageCapacity", getTotalStorageCapacity())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
