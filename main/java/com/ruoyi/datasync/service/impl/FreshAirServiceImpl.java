package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.FreshAirMapper;
import com.ruoyi.datasync.domain.FreshAir;
import com.ruoyi.datasync.service.IFreshAirService;
import com.ruoyi.common.core.text.Convert;

/**
 * 新风系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class FreshAirServiceImpl implements IFreshAirService 
{
    @Autowired
    private FreshAirMapper freshAirMapper;

    /**
     * 查询新风系统
     * 
     * @param id 新风系统ID
     * @return 新风系统
     */
    @Override
    public FreshAir selectFreshAirById(Long id)
    {
        return freshAirMapper.selectFreshAirById(id);
    }

    /**
     * 查询新风系统列表
     * 
     * @param freshAir 新风系统
     * @return 新风系统
     */
    @Override
    public List<FreshAir> selectFreshAirList(FreshAir freshAir)
    {
        return freshAirMapper.selectFreshAirList(freshAir);
    }

    /**
     * 新增新风系统
     * 
     * @param freshAir 新风系统
     * @return 结果
     */
    @Override
    public int insertFreshAir(FreshAir freshAir)
    {
        freshAir.setCreateTime(DateUtils.getNowDate());
        return freshAirMapper.insertFreshAir(freshAir);
    }

    /**
     * 修改新风系统
     * 
     * @param freshAir 新风系统
     * @return 结果
     */
    @Override
    public int updateFreshAir(FreshAir freshAir)
    {
        freshAir.setUpdateTime(DateUtils.getNowDate());
        return freshAirMapper.updateFreshAir(freshAir);
    }

    /**
     * 删除新风系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFreshAirByIds(String ids)
    {
        return freshAirMapper.deleteFreshAirByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新风系统信息
     * 
     * @param id 新风系统ID
     * @return 结果
     */
    @Override
    public int deleteFreshAirById(Long id)
    {
        return freshAirMapper.deleteFreshAirById(id);
    }
}
