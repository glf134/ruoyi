package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.MailFilteringMapper;
import com.ruoyi.datasync.domain.MailFiltering;
import com.ruoyi.datasync.service.IMailFilteringService;
import com.ruoyi.common.core.text.Convert;

/**
 * 邮件安全过滤系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class MailFilteringServiceImpl implements IMailFilteringService 
{
    @Autowired
    private MailFilteringMapper mailFilteringMapper;

    /**
     * 查询邮件安全过滤系统
     * 
     * @param id 邮件安全过滤系统ID
     * @return 邮件安全过滤系统
     */
    @Override
    public MailFiltering selectMailFilteringById(Long id)
    {
        return mailFilteringMapper.selectMailFilteringById(id);
    }

    /**
     * 查询邮件安全过滤系统列表
     * 
     * @param mailFiltering 邮件安全过滤系统
     * @return 邮件安全过滤系统
     */
    @Override
    public List<MailFiltering> selectMailFilteringList(MailFiltering mailFiltering)
    {
        return mailFilteringMapper.selectMailFilteringList(mailFiltering);
    }

    /**
     * 新增邮件安全过滤系统
     * 
     * @param mailFiltering 邮件安全过滤系统
     * @return 结果
     */
    @Override
    public int insertMailFiltering(MailFiltering mailFiltering)
    {
        mailFiltering.setCreateTime(DateUtils.getNowDate());
        return mailFilteringMapper.insertMailFiltering(mailFiltering);
    }

    /**
     * 修改邮件安全过滤系统
     * 
     * @param mailFiltering 邮件安全过滤系统
     * @return 结果
     */
    @Override
    public int updateMailFiltering(MailFiltering mailFiltering)
    {
        mailFiltering.setUpdateTime(DateUtils.getNowDate());
        return mailFilteringMapper.updateMailFiltering(mailFiltering);
    }

    /**
     * 删除邮件安全过滤系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMailFilteringByIds(String ids)
    {
        return mailFilteringMapper.deleteMailFilteringByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除邮件安全过滤系统信息
     * 
     * @param id 邮件安全过滤系统ID
     * @return 结果
     */
    @Override
    public int deleteMailFilteringById(Long id)
    {
        return mailFilteringMapper.deleteMailFilteringById(id);
    }
}
