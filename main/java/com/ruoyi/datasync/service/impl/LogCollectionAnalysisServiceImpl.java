package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.LogCollectionAnalysisMapper;
import com.ruoyi.datasync.domain.LogCollectionAnalysis;
import com.ruoyi.datasync.service.ILogCollectionAnalysisService;
import com.ruoyi.common.core.text.Convert;

/**
 * 日志收集与分析系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class LogCollectionAnalysisServiceImpl implements ILogCollectionAnalysisService 
{
    @Autowired
    private LogCollectionAnalysisMapper logCollectionAnalysisMapper;

    /**
     * 查询日志收集与分析系统
     * 
     * @param id 日志收集与分析系统ID
     * @return 日志收集与分析系统
     */
    @Override
    public LogCollectionAnalysis selectLogCollectionAnalysisById(Long id)
    {
        return logCollectionAnalysisMapper.selectLogCollectionAnalysisById(id);
    }

    /**
     * 查询日志收集与分析系统列表
     * 
     * @param logCollectionAnalysis 日志收集与分析系统
     * @return 日志收集与分析系统
     */
    @Override
    public List<LogCollectionAnalysis> selectLogCollectionAnalysisList(LogCollectionAnalysis logCollectionAnalysis)
    {
        return logCollectionAnalysisMapper.selectLogCollectionAnalysisList(logCollectionAnalysis);
    }

    /**
     * 新增日志收集与分析系统
     * 
     * @param logCollectionAnalysis 日志收集与分析系统
     * @return 结果
     */
    @Override
    public int insertLogCollectionAnalysis(LogCollectionAnalysis logCollectionAnalysis)
    {
        logCollectionAnalysis.setCreateTime(DateUtils.getNowDate());
        return logCollectionAnalysisMapper.insertLogCollectionAnalysis(logCollectionAnalysis);
    }

    /**
     * 修改日志收集与分析系统
     * 
     * @param logCollectionAnalysis 日志收集与分析系统
     * @return 结果
     */
    @Override
    public int updateLogCollectionAnalysis(LogCollectionAnalysis logCollectionAnalysis)
    {
        logCollectionAnalysis.setUpdateTime(DateUtils.getNowDate());
        return logCollectionAnalysisMapper.updateLogCollectionAnalysis(logCollectionAnalysis);
    }

    /**
     * 删除日志收集与分析系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLogCollectionAnalysisByIds(String ids)
    {
        return logCollectionAnalysisMapper.deleteLogCollectionAnalysisByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除日志收集与分析系统信息
     * 
     * @param id 日志收集与分析系统ID
     * @return 结果
     */
    @Override
    public int deleteLogCollectionAnalysisById(Long id)
    {
        return logCollectionAnalysisMapper.deleteLogCollectionAnalysisById(id);
    }
}
