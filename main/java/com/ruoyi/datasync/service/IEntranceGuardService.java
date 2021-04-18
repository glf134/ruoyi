package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.EntranceGuard;

/**
 * 门禁系统Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IEntranceGuardService 
{
    /**
     * 查询门禁系统
     * 
     * @param id 门禁系统ID
     * @return 门禁系统
     */
    public EntranceGuard selectEntranceGuardById(Long id);

    /**
     * 查询门禁系统列表
     * 
     * @param entranceGuard 门禁系统
     * @return 门禁系统集合
     */
    public List<EntranceGuard> selectEntranceGuardList(EntranceGuard entranceGuard);

    /**
     * 新增门禁系统
     * 
     * @param entranceGuard 门禁系统
     * @return 结果
     */
    public int insertEntranceGuard(EntranceGuard entranceGuard);

    /**
     * 修改门禁系统
     * 
     * @param entranceGuard 门禁系统
     * @return 结果
     */
    public int updateEntranceGuard(EntranceGuard entranceGuard);

    /**
     * 批量删除门禁系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEntranceGuardByIds(String ids);

    /**
     * 删除门禁系统信息
     * 
     * @param id 门禁系统ID
     * @return 结果
     */
    public int deleteEntranceGuardById(Long id);
}
