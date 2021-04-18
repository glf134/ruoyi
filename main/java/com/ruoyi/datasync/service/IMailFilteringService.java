package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.MailFiltering;

/**
 * 邮件安全过滤系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IMailFilteringService 
{
    /**
     * 查询邮件安全过滤系统
     * 
     * @param id 邮件安全过滤系统ID
     * @return 邮件安全过滤系统
     */
    public MailFiltering selectMailFilteringById(Long id);

    /**
     * 查询邮件安全过滤系统列表
     * 
     * @param mailFiltering 邮件安全过滤系统
     * @return 邮件安全过滤系统集合
     */
    public List<MailFiltering> selectMailFilteringList(MailFiltering mailFiltering);

    /**
     * 新增邮件安全过滤系统
     * 
     * @param mailFiltering 邮件安全过滤系统
     * @return 结果
     */
    public int insertMailFiltering(MailFiltering mailFiltering);

    /**
     * 修改邮件安全过滤系统
     * 
     * @param mailFiltering 邮件安全过滤系统
     * @return 结果
     */
    public int updateMailFiltering(MailFiltering mailFiltering);

    /**
     * 批量删除邮件安全过滤系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMailFilteringByIds(String ids);

    /**
     * 删除邮件安全过滤系统信息
     * 
     * @param id 邮件安全过滤系统ID
     * @return 结果
     */
    public int deleteMailFilteringById(Long id);
}
