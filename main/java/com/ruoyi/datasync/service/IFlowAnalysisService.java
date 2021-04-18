package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.FlowAnalysis;

/**
 * 流量分析设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IFlowAnalysisService 
{
    /**
     * 查询流量分析设备
     * 
     * @param id 流量分析设备ID
     * @return 流量分析设备
     */
    public FlowAnalysis selectFlowAnalysisById(Long id);

    /**
     * 查询流量分析设备列表
     * 
     * @param flowAnalysis 流量分析设备
     * @return 流量分析设备集合
     */
    public List<FlowAnalysis> selectFlowAnalysisList(FlowAnalysis flowAnalysis);

    /**
     * 新增流量分析设备
     * 
     * @param flowAnalysis 流量分析设备
     * @return 结果
     */
    public int insertFlowAnalysis(FlowAnalysis flowAnalysis);

    /**
     * 修改流量分析设备
     * 
     * @param flowAnalysis 流量分析设备
     * @return 结果
     */
    public int updateFlowAnalysis(FlowAnalysis flowAnalysis);

    /**
     * 批量删除流量分析设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFlowAnalysisByIds(String ids);

    /**
     * 删除流量分析设备信息
     * 
     * @param id 流量分析设备ID
     * @return 结果
     */
    public int deleteFlowAnalysisById(Long id);
}
