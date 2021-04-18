package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.ApplicationMapper;
import com.ruoyi.datasync.domain.Application;
import com.ruoyi.datasync.service.IApplicationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 应用系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class ApplicationServiceImpl implements IApplicationService 
{
    @Autowired
    private ApplicationMapper applicationMapper;

    /**
     * 查询应用系统
     * 
     * @param id 应用系统ID
     * @return 应用系统
     */
    @Override
    public Application selectApplicationById(Long id)
    {
        return applicationMapper.selectApplicationById(id);
    }

    /**
     * 查询应用系统列表
     * 
     * @param application 应用系统
     * @return 应用系统
     */
    @Override
    public List<Application> selectApplicationList(Application application)
    {
        return applicationMapper.selectApplicationList(application);
    }

    /**
     * 新增应用系统
     * 
     * @param application 应用系统
     * @return 结果
     */
    @Override
    public int insertApplication(Application application)
    {
        application.setCreateTime(DateUtils.getNowDate());
        return applicationMapper.insertApplication(application);
    }

    /**
     * 修改应用系统
     * 
     * @param application 应用系统
     * @return 结果
     */
    @Override
    public int updateApplication(Application application)
    {
        application.setUpdateTime(DateUtils.getNowDate());
        return applicationMapper.updateApplication(application);
    }

    /**
     * 删除应用系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteApplicationByIds(String ids)
    {
        return applicationMapper.deleteApplicationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除应用系统信息
     * 
     * @param id 应用系统ID
     * @return 结果
     */
    @Override
    public int deleteApplicationById(Long id)
    {
        return applicationMapper.deleteApplicationById(id);
    }
}
