package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.FlowAnalysisMapper;
import com.ruoyi.datasync.domain.FlowAnalysis;
import com.ruoyi.datasync.service.IFlowAnalysisService;
import com.ruoyi.common.core.text.Convert;

/**
 * 流量分析设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class FlowAnalysisServiceImpl implements IFlowAnalysisService 
{
    @Autowired
    private FlowAnalysisMapper flowAnalysisMapper;

    /**
     * 查询流量分析设备
     * 
     * @param id 流量分析设备ID
     * @return 流量分析设备
     */
    @Override
    public FlowAnalysis selectFlowAnalysisById(Long id)
    {
        return flowAnalysisMapper.selectFlowAnalysisById(id);
    }

    /**
     * 查询流量分析设备列表
     * 
     * @param flowAnalysis 流量分析设备
     * @return 流量分析设备
     */
    @Override
    public List<FlowAnalysis> selectFlowAnalysisList(FlowAnalysis flowAnalysis)
    {
        return flowAnalysisMapper.selectFlowAnalysisList(flowAnalysis);
    }

    /**
     * 新增流量分析设备
     * 
     * @param flowAnalysis 流量分析设备
     * @return 结果
     */
    @Override
    public int insertFlowAnalysis(FlowAnalysis flowAnalysis)
    {
        flowAnalysis.setCreateTime(DateUtils.getNowDate());
        return flowAnalysisMapper.insertFlowAnalysis(flowAnalysis);
    }

    /**
     * 修改流量分析设备
     * 
     * @param flowAnalysis 流量分析设备
     * @return 结果
     */
    @Override
    public int updateFlowAnalysis(FlowAnalysis flowAnalysis)
    {
        flowAnalysis.setUpdateTime(DateUtils.getNowDate());
        return flowAnalysisMapper.updateFlowAnalysis(flowAnalysis);
    }

    /**
     * 删除流量分析设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFlowAnalysisByIds(String ids)
    {
        return flowAnalysisMapper.deleteFlowAnalysisByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除流量分析设备信息
     * 
     * @param id 流量分析设备ID
     * @return 结果
     */
    @Override
    public int deleteFlowAnalysisById(Long id)
    {
        return flowAnalysisMapper.deleteFlowAnalysisById(id);
    }
}
