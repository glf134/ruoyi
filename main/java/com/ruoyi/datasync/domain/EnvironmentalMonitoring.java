package com.ruoyi.datasync.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 环境监控系统对象 environmental_monitoring
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public class EnvironmentalMonitoring extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 管理部门 */
    @Excel(name = "管理部门")
    private String administrativeDepartment;

    /** 空调制冷系统 */
    @Excel(name = "空调制冷系统")
    private String airConditioningSystem;

    /** 报警功能 */
    @Excel(name = "报警功能")
    private String alarmFunction;

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

    /** 电池监控 */
    @Excel(name = "电池监控")
    private String batteryMonitor;

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

    /** 环境监控软件 */
    @Excel(name = "环境监控软件")
    private String environmentalMonitoringSoftware;

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

    /** 发电机系统 */
    @Excel(name = "发电机系统")
    private String generatorSystem;

    /** 漏水检测 */
    @Excel(name = "漏水检测")
    private String leakageDetection;

    /** 联动功能 */
    @Excel(name = "联动功能")
    private String linkageFunction;

    /** 日志功能 */
    @Excel(name = "日志功能")
    private String logging;

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

    /** 监控功能 */
    @Excel(name = "监控功能")
    private String monitoringFunction;

    /** 运维部门 */
    @Excel(name = "运维部门")
    private String operationDepartment;

    /** 其它功能 */
    @Excel(name = "其它功能")
    private String otherFeatures;

    /** 其它范围 */
    @Excel(name = "其它范围")
    private String otherRange;

    /** 配电系统 */
    @Excel(name = "配电系统")
    private String powerDistributionSystem;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksInformation;

    /** 机房温湿度 */
    @Excel(name = "机房温湿度")
    private String roomTemperatureAndHumidity;

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

    /** 系统集成商 */
    @Excel(name = "系统集成商")
    private String systemIntegrator;

    /** UPS系统 */
    @Excel(name = "UPS系统")
    private String upsSystem;

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
    public void setAirConditioningSystem(String airConditioningSystem) 
    {
        this.airConditioningSystem = airConditioningSystem;
    }

    public String getAirConditioningSystem() 
    {
        return airConditioningSystem;
    }
    public void setAlarmFunction(String alarmFunction) 
    {
        this.alarmFunction = alarmFunction;
    }

    public String getAlarmFunction() 
    {
        return alarmFunction;
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
    public void setBatteryMonitor(String batteryMonitor) 
    {
        this.batteryMonitor = batteryMonitor;
    }

    public String getBatteryMonitor() 
    {
        return batteryMonitor;
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
    public void setEnvironmentalMonitoringSoftware(String environmentalMonitoringSoftware) 
    {
        this.environmentalMonitoringSoftware = environmentalMonitoringSoftware;
    }

    public String getEnvironmentalMonitoringSoftware() 
    {
        return environmentalMonitoringSoftware;
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
    public void setGeneratorSystem(String generatorSystem) 
    {
        this.generatorSystem = generatorSystem;
    }

    public String getGeneratorSystem() 
    {
        return generatorSystem;
    }
    public void setLeakageDetection(String leakageDetection) 
    {
        this.leakageDetection = leakageDetection;
    }

    public String getLeakageDetection() 
    {
        return leakageDetection;
    }
    public void setLinkageFunction(String linkageFunction) 
    {
        this.linkageFunction = linkageFunction;
    }

    public String getLinkageFunction() 
    {
        return linkageFunction;
    }
    public void setLogging(String logging) 
    {
        this.logging = logging;
    }

    public String getLogging() 
    {
        return logging;
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
    public void setMonitoringFunction(String monitoringFunction) 
    {
        this.monitoringFunction = monitoringFunction;
    }

    public String getMonitoringFunction() 
    {
        return monitoringFunction;
    }
    public void setOperationDepartment(String operationDepartment) 
    {
        this.operationDepartment = operationDepartment;
    }

    public String getOperationDepartment() 
    {
        return operationDepartment;
    }
    public void setOtherFeatures(String otherFeatures) 
    {
        this.otherFeatures = otherFeatures;
    }

    public String getOtherFeatures() 
    {
        return otherFeatures;
    }
    public void setOtherRange(String otherRange) 
    {
        this.otherRange = otherRange;
    }

    public String getOtherRange() 
    {
        return otherRange;
    }
    public void setPowerDistributionSystem(String powerDistributionSystem) 
    {
        this.powerDistributionSystem = powerDistributionSystem;
    }

    public String getPowerDistributionSystem() 
    {
        return powerDistributionSystem;
    }
    public void setRemarksInformation(String remarksInformation) 
    {
        this.remarksInformation = remarksInformation;
    }

    public String getRemarksInformation() 
    {
        return remarksInformation;
    }
    public void setRoomTemperatureAndHumidity(String roomTemperatureAndHumidity) 
    {
        this.roomTemperatureAndHumidity = roomTemperatureAndHumidity;
    }

    public String getRoomTemperatureAndHumidity() 
    {
        return roomTemperatureAndHumidity;
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
    public void setSystemIntegrator(String systemIntegrator) 
    {
        this.systemIntegrator = systemIntegrator;
    }

    public String getSystemIntegrator() 
    {
        return systemIntegrator;
    }
    public void setUpsSystem(String upsSystem) 
    {
        this.upsSystem = upsSystem;
    }

    public String getUpsSystem() 
    {
        return upsSystem;
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
            .append("airConditioningSystem", getAirConditioningSystem())
            .append("alarmFunction", getAlarmFunction())
            .append("assetBrand", getAssetBrand())
            .append("assetCode", getAssetCode())
            .append("assetSerialNumber", getAssetSerialNumber())
            .append("assetType", getAssetType())
            .append("assetValue", getAssetValue())
            .append("batteryMonitor", getBatteryMonitor())
            .append("brandLand", getBrandLand())
            .append("deployArea", getDeployArea())
            .append("deployComputerRoom", getDeployComputerRoom())
            .append("deployDb", getDeployDb())
            .append("deployFloor", getDeployFloor())
            .append("deployGallery", getDeployGallery())
            .append("environmentalMonitoringSoftware", getEnvironmentalMonitoringSoftware())
            .append("facilityCategory", getFacilityCategory())
            .append("facilityDescriptor", getFacilityDescriptor())
            .append("facilityName", getFacilityName())
            .append("facilityOwnershipAgency", getFacilityOwnershipAgency())
            .append("facilityUpdateDate", getFacilityUpdateDate())
            .append("facilityUseDate", getFacilityUseDate())
            .append("facilityUseState", getFacilityUseState())
            .append("generatorSystem", getGeneratorSystem())
            .append("leakageDetection", getLeakageDetection())
            .append("linkageFunction", getLinkageFunction())
            .append("logging", getLogging())
            .append("maintenanceCause", getMaintenanceCause())
            .append("maintenanceResults", getMaintenanceResults())
            .append("maintenanceTime", getMaintenanceTime())
            .append("monitoringFunction", getMonitoringFunction())
            .append("operationDepartment", getOperationDepartment())
            .append("otherFeatures", getOtherFeatures())
            .append("otherRange", getOtherRange())
            .append("powerDistributionSystem", getPowerDistributionSystem())
            .append("remarksInformation", getRemarksInformation())
            .append("roomTemperatureAndHumidity", getRoomTemperatureAndHumidity())
            .append("serviceEndTime", getServiceEndTime())
            .append("serviceLevel", getServiceLevel())
            .append("serviceProvider", getServiceProvider())
            .append("serviceStartTime", getServiceStartTime())
            .append("systemIntegrator", getSystemIntegrator())
            .append("upsSystem", getUpsSystem())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
