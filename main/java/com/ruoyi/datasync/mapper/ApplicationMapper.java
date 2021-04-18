package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Application;

/**
 * 应用系统Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface ApplicationMapper 
{
    /**
     * 查询应用系统
     * 
     * @param id 应用系统ID
     * @return 应用系统
     */
    public Application selectApplicationById(Long id);

    /**
     * 查询应用系统列表
     * 
     * @param application 应用系统
     * @return 应用系统集合
     */
    public List<Application> selectApplicationList(Application application);

    /**
     * 新增应用系统
     * 
     * @param application 应用系统
     * @return 结果
     */
    public int insertApplication(Application application);

    /**
     * 修改应用系统
     * 
     * @param application 应用系统
     * @return 结果
     */
    public int updateApplication(Application application);

    /**
     * 删除应用系统
     * 
     * @param id 应用系统ID
     * @return 结果
     */
    public int deleteApplicationById(Long id);

    /**
     * 批量删除应用系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteApplicationByIds(String[] ids);
}
