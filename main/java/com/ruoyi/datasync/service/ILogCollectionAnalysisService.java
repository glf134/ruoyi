package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.LogCollectionAnalysis;

/**
 * 日志收集与分析系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ILogCollectionAnalysisService 
{
    /**
     * 查询日志收集与分析系统
     * 
     * @param id 日志收集与分析系统ID
     * @return 日志收集与分析系统
     */
    public LogCollectionAnalysis selectLogCollectionAnalysisById(Long id);

    /**
     * 查询日志收集与分析系统列表
     * 
     * @param logCollectionAnalysis 日志收集与分析系统
     * @return 日志收集与分析系统集合
     */
    public List<LogCollectionAnalysis> selectLogCollectionAnalysisList(LogCollectionAnalysis logCollectionAnalysis);

    /**
     * 新增日志收集与分析系统
     * 
     * @param logCollectionAnalysis 日志收集与分析系统
     * @return 结果
     */
    public int insertLogCollectionAnalysis(LogCollectionAnalysis logCollectionAnalysis);

    /**
     * 修改日志收集与分析系统
     * 
     * @param logCollectionAnalysis 日志收集与分析系统
     * @return 结果
     */
    public int updateLogCollectionAnalysis(LogCollectionAnalysis logCollectionAnalysis);

    /**
     * 批量删除日志收集与分析系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLogCollectionAnalysisByIds(String ids);

    /**
     * 删除日志收集与分析系统信息
     * 
     * @param id 日志收集与分析系统ID
     * @return 结果
     */
    public int deleteLogCollectionAnalysisById(Long id);
}
