package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.AveMapper;
import com.ruoyi.datasync.domain.Ave;
import com.ruoyi.datasync.service.IAveService;
import com.ruoyi.common.core.text.Convert;

/**
 * 防病毒网关(AVE)Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class AveServiceImpl implements IAveService 
{
    @Autowired
    private AveMapper aveMapper;

    /**
     * 查询防病毒网关(AVE)
     * 
     * @param id 防病毒网关(AVE)ID
     * @return 防病毒网关(AVE)
     */
    @Override
    public Ave selectAveById(Long id)
    {
        return aveMapper.selectAveById(id);
    }

    /**
     * 查询防病毒网关(AVE)列表
     * 
     * @param ave 防病毒网关(AVE)
     * @return 防病毒网关(AVE)
     */
    @Override
    public List<Ave> selectAveList(Ave ave)
    {
        return aveMapper.selectAveList(ave);
    }

    /**
     * 新增防病毒网关(AVE)
     * 
     * @param ave 防病毒网关(AVE)
     * @return 结果
     */
    @Override
    public int insertAve(Ave ave)
    {
        ave.setCreateTime(DateUtils.getNowDate());
        return aveMapper.insertAve(ave);
    }

    /**
     * 修改防病毒网关(AVE)
     * 
     * @param ave 防病毒网关(AVE)
     * @return 结果
     */
    @Override
    public int updateAve(Ave ave)
    {
        ave.setUpdateTime(DateUtils.getNowDate());
        return aveMapper.updateAve(ave);
    }

    /**
     * 删除防病毒网关(AVE)对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAveByIds(String ids)
    {
        return aveMapper.deleteAveByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除防病毒网关(AVE)信息
     * 
     * @param id 防病毒网关(AVE)ID
     * @return 结果
     */
    @Override
    public int deleteAveById(Long id)
    {
        return aveMapper.deleteAveById(id);
    }
}
