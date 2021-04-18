package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.DatabaseDesensitization;

/**
 * 数据库脱敏Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface DatabaseDesensitizationMapper 
{
    /**
     * 查询数据库脱敏
     * 
     * @param id 数据库脱敏ID
     * @return 数据库脱敏
     */
    public DatabaseDesensitization selectDatabaseDesensitizationById(Long id);

    /**
     * 查询数据库脱敏列表
     * 
     * @param databaseDesensitization 数据库脱敏
     * @return 数据库脱敏集合
     */
    public List<DatabaseDesensitization> selectDatabaseDesensitizationList(DatabaseDesensitization databaseDesensitization);

    /**
     * 新增数据库脱敏
     * 
     * @param databaseDesensitization 数据库脱敏
     * @return 结果
     */
    public int insertDatabaseDesensitization(DatabaseDesensitization databaseDesensitization);

    /**
     * 修改数据库脱敏
     * 
     * @param databaseDesensitization 数据库脱敏
     * @return 结果
     */
    public int updateDatabaseDesensitization(DatabaseDesensitization databaseDesensitization);

    /**
     * 删除数据库脱敏
     * 
     * @param id 数据库脱敏ID
     * @return 结果
     */
    public int deleteDatabaseDesensitizationById(Long id);

    /**
     * 批量删除数据库脱敏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDatabaseDesensitizationByIds(String[] ids);
}
