package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.WdmMapper;
import com.ruoyi.datasync.domain.Wdm;
import com.ruoyi.datasync.service.IWdmService;
import com.ruoyi.common.core.text.Convert;

/**
 * 波分复用设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class WdmServiceImpl implements IWdmService 
{
    @Autowired
    private WdmMapper wdmMapper;

    /**
     * 查询波分复用设备
     * 
     * @param id 波分复用设备ID
     * @return 波分复用设备
     */
    @Override
    public Wdm selectWdmById(Long id)
    {
        return wdmMapper.selectWdmById(id);
    }

    /**
     * 查询波分复用设备列表
     * 
     * @param wdm 波分复用设备
     * @return 波分复用设备
     */
    @Override
    public List<Wdm> selectWdmList(Wdm wdm)
    {
        return wdmMapper.selectWdmList(wdm);
    }

    /**
     * 新增波分复用设备
     * 
     * @param wdm 波分复用设备
     * @return 结果
     */
    @Override
    public int insertWdm(Wdm wdm)
    {
        wdm.setCreateTime(DateUtils.getNowDate());
        return wdmMapper.insertWdm(wdm);
    }

    /**
     * 修改波分复用设备
     * 
     * @param wdm 波分复用设备
     * @return 结果
     */
    @Override
    public int updateWdm(Wdm wdm)
    {
        wdm.setUpdateTime(DateUtils.getNowDate());
        return wdmMapper.updateWdm(wdm);
    }

    /**
     * 删除波分复用设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWdmByIds(String ids)
    {
        return wdmMapper.deleteWdmByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除波分复用设备信息
     * 
     * @param id 波分复用设备ID
     * @return 结果
     */
    @Override
    public int deleteWdmById(Long id)
    {
        return wdmMapper.deleteWdmById(id);
    }
}
