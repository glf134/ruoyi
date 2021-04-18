package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.DatabaseDesensitizationMapper;
import com.ruoyi.datasync.domain.DatabaseDesensitization;
import com.ruoyi.datasync.service.IDatabaseDesensitizationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 数据库脱敏Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class DatabaseDesensitizationServiceImpl implements IDatabaseDesensitizationService 
{
    @Autowired
    private DatabaseDesensitizationMapper databaseDesensitizationMapper;

    /**
     * 查询数据库脱敏
     * 
     * @param id 数据库脱敏ID
     * @return 数据库脱敏
     */
    @Override
    public DatabaseDesensitization selectDatabaseDesensitizationById(Long id)
    {
        return databaseDesensitizationMapper.selectDatabaseDesensitizationById(id);
    }

    /**
     * 查询数据库脱敏列表
     * 
     * @param databaseDesensitization 数据库脱敏
     * @return 数据库脱敏
     */
    @Override
    public List<DatabaseDesensitization> selectDatabaseDesensitizationList(DatabaseDesensitization databaseDesensitization)
    {
        return databaseDesensitizationMapper.selectDatabaseDesensitizationList(databaseDesensitization);
    }

    /**
     * 新增数据库脱敏
     * 
     * @param databaseDesensitization 数据库脱敏
     * @return 结果
     */
    @Override
    public int insertDatabaseDesensitization(DatabaseDesensitization databaseDesensitization)
    {
        databaseDesensitization.setCreateTime(DateUtils.getNowDate());
        return databaseDesensitizationMapper.insertDatabaseDesensitization(databaseDesensitization);
    }

    /**
     * 修改数据库脱敏
     * 
     * @param databaseDesensitization 数据库脱敏
     * @return 结果
     */
    @Override
    public int updateDatabaseDesensitization(DatabaseDesensitization databaseDesensitization)
    {
        databaseDesensitization.setUpdateTime(DateUtils.getNowDate());
        return databaseDesensitizationMapper.updateDatabaseDesensitization(databaseDesensitization);
    }

    /**
     * 删除数据库脱敏对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDatabaseDesensitizationByIds(String ids)
    {
        return databaseDesensitizationMapper.deleteDatabaseDesensitizationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除数据库脱敏信息
     * 
     * @param id 数据库脱敏ID
     * @return 结果
     */
    @Override
    public int deleteDatabaseDesensitizationById(Long id)
    {
        return databaseDesensitizationMapper.deleteDatabaseDesensitizationById(id);
    }
}
