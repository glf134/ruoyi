package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Gap;

/**
 * 安全隔离网闸数据元（GAP）Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IGapService 
{
    /**
     * 查询安全隔离网闸数据元（GAP）
     * 
     * @param id 安全隔离网闸数据元（GAP）ID
     * @return 安全隔离网闸数据元（GAP）
     */
    public Gap selectGapById(Long id);

    /**
     * 查询安全隔离网闸数据元（GAP）列表
     * 
     * @param gap 安全隔离网闸数据元（GAP）
     * @return 安全隔离网闸数据元（GAP）集合
     */
    public List<Gap> selectGapList(Gap gap);

    /**
     * 新增安全隔离网闸数据元（GAP）
     * 
     * @param gap 安全隔离网闸数据元（GAP）
     * @return 结果
     */
    public int insertGap(Gap gap);

    /**
     * 修改安全隔离网闸数据元（GAP）
     * 
     * @param gap 安全隔离网闸数据元（GAP）
     * @return 结果
     */
    public int updateGap(Gap gap);

    /**
     * 批量删除安全隔离网闸数据元（GAP）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGapByIds(String ids);

    /**
     * 删除安全隔离网闸数据元（GAP）信息
     * 
     * @param id 安全隔离网闸数据元（GAP）ID
     * @return 结果
     */
    public int deleteGapById(Long id);
}
