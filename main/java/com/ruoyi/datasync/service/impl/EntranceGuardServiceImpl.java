package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.EntranceGuardMapper;
import com.ruoyi.datasync.domain.EntranceGuard;
import com.ruoyi.datasync.service.IEntranceGuardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 门禁系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class EntranceGuardServiceImpl implements IEntranceGuardService 
{
    @Autowired
    private EntranceGuardMapper entranceGuardMapper;

    /**
     * 查询门禁系统
     * 
     * @param id 门禁系统ID
     * @return 门禁系统
     */
    @Override
    public EntranceGuard selectEntranceGuardById(Long id)
    {
        return entranceGuardMapper.selectEntranceGuardById(id);
    }

    /**
     * 查询门禁系统列表
     * 
     * @param entranceGuard 门禁系统
     * @return 门禁系统
     */
    @Override
    public List<EntranceGuard> selectEntranceGuardList(EntranceGuard entranceGuard)
    {
        return entranceGuardMapper.selectEntranceGuardList(entranceGuard);
    }

    /**
     * 新增门禁系统
     * 
     * @param entranceGuard 门禁系统
     * @return 结果
     */
    @Override
    public int insertEntranceGuard(EntranceGuard entranceGuard)
    {
        entranceGuard.setCreateTime(DateUtils.getNowDate());
        return entranceGuardMapper.insertEntranceGuard(entranceGuard);
    }

    /**
     * 修改门禁系统
     * 
     * @param entranceGuard 门禁系统
     * @return 结果
     */
    @Override
    public int updateEntranceGuard(EntranceGuard entranceGuard)
    {
        entranceGuard.setUpdateTime(DateUtils.getNowDate());
        return entranceGuardMapper.updateEntranceGuard(entranceGuard);
    }

    /**
     * 删除门禁系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEntranceGuardByIds(String ids)
    {
        return entranceGuardMapper.deleteEntranceGuardByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除门禁系统信息
     * 
     * @param id 门禁系统ID
     * @return 结果
     */
    @Override
    public int deleteEntranceGuardById(Long id)
    {
        return entranceGuardMapper.deleteEntranceGuardById(id);
    }
}
