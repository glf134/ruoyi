package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.SwitchesMapper;
import com.ruoyi.datasync.domain.Switches;
import com.ruoyi.datasync.service.ISwitchesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 交换机Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class SwitchesServiceImpl implements ISwitchesService 
{
    @Autowired
    private SwitchesMapper switchesMapper;

    /**
     * 查询交换机
     * 
     * @param id 交换机ID
     * @return 交换机
     */
    @Override
    public Switches selectSwitchesById(Long id)
    {
        return switchesMapper.selectSwitchesById(id);
    }

    /**
     * 查询交换机列表
     * 
     * @param switches 交换机
     * @return 交换机
     */
    @Override
    public List<Switches> selectSwitchesList(Switches switches)
    {
        return switchesMapper.selectSwitchesList(switches);
    }

    /**
     * 新增交换机
     * 
     * @param switches 交换机
     * @return 结果
     */
    @Override
    public int insertSwitches(Switches switches)
    {
        switches.setCreateTime(DateUtils.getNowDate());
        return switchesMapper.insertSwitches(switches);
    }

    /**
     * 修改交换机
     * 
     * @param switches 交换机
     * @return 结果
     */
    @Override
    public int updateSwitches(Switches switches)
    {
        switches.setUpdateTime(DateUtils.getNowDate());
        return switchesMapper.updateSwitches(switches);
    }

    /**
     * 删除交换机对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSwitchesByIds(String ids)
    {
        return switchesMapper.deleteSwitchesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除交换机信息
     * 
     * @param id 交换机ID
     * @return 结果
     */
    @Override
    public int deleteSwitchesById(Long id)
    {
        return switchesMapper.deleteSwitchesById(id);
    }
}
