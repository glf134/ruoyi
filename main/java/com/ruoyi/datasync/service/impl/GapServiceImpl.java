package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.GapMapper;
import com.ruoyi.datasync.domain.Gap;
import com.ruoyi.datasync.service.IGapService;
import com.ruoyi.common.core.text.Convert;

/**
 * 安全隔离网闸数据元（GAP）Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class GapServiceImpl implements IGapService 
{
    @Autowired
    private GapMapper gapMapper;

    /**
     * 查询安全隔离网闸数据元（GAP）
     * 
     * @param id 安全隔离网闸数据元（GAP）ID
     * @return 安全隔离网闸数据元（GAP）
     */
    @Override
    public Gap selectGapById(Long id)
    {
        return gapMapper.selectGapById(id);
    }

    /**
     * 查询安全隔离网闸数据元（GAP）列表
     * 
     * @param gap 安全隔离网闸数据元（GAP）
     * @return 安全隔离网闸数据元（GAP）
     */
    @Override
    public List<Gap> selectGapList(Gap gap)
    {
        return gapMapper.selectGapList(gap);
    }

    /**
     * 新增安全隔离网闸数据元（GAP）
     * 
     * @param gap 安全隔离网闸数据元（GAP）
     * @return 结果
     */
    @Override
    public int insertGap(Gap gap)
    {
        gap.setCreateTime(DateUtils.getNowDate());
        return gapMapper.insertGap(gap);
    }

    /**
     * 修改安全隔离网闸数据元（GAP）
     * 
     * @param gap 安全隔离网闸数据元（GAP）
     * @return 结果
     */
    @Override
    public int updateGap(Gap gap)
    {
        gap.setUpdateTime(DateUtils.getNowDate());
        return gapMapper.updateGap(gap);
    }

    /**
     * 删除安全隔离网闸数据元（GAP）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGapByIds(String ids)
    {
        return gapMapper.deleteGapByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除安全隔离网闸数据元（GAP）信息
     * 
     * @param id 安全隔离网闸数据元（GAP）ID
     * @return 结果
     */
    @Override
    public int deleteGapById(Long id)
    {
        return gapMapper.deleteGapById(id);
    }
}
