package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.BasedSoftwareMapper;
import com.ruoyi.datasync.domain.BasedSoftware;
import com.ruoyi.datasync.service.IBasedSoftwareService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基础软件Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class BasedSoftwareServiceImpl implements IBasedSoftwareService 
{
    @Autowired
    private BasedSoftwareMapper basedSoftwareMapper;

    /**
     * 查询基础软件
     * 
     * @param id 基础软件ID
     * @return 基础软件
     */
    @Override
    public BasedSoftware selectBasedSoftwareById(Long id)
    {
        return basedSoftwareMapper.selectBasedSoftwareById(id);
    }

    /**
     * 查询基础软件列表
     * 
     * @param basedSoftware 基础软件
     * @return 基础软件
     */
    @Override
    public List<BasedSoftware> selectBasedSoftwareList(BasedSoftware basedSoftware)
    {
        return basedSoftwareMapper.selectBasedSoftwareList(basedSoftware);
    }

    /**
     * 新增基础软件
     * 
     * @param basedSoftware 基础软件
     * @return 结果
     */
    @Override
    public int insertBasedSoftware(BasedSoftware basedSoftware)
    {
        basedSoftware.setCreateTime(DateUtils.getNowDate());
        return basedSoftwareMapper.insertBasedSoftware(basedSoftware);
    }

    /**
     * 修改基础软件
     * 
     * @param basedSoftware 基础软件
     * @return 结果
     */
    @Override
    public int updateBasedSoftware(BasedSoftware basedSoftware)
    {
        basedSoftware.setUpdateTime(DateUtils.getNowDate());
        return basedSoftwareMapper.updateBasedSoftware(basedSoftware);
    }

    /**
     * 删除基础软件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBasedSoftwareByIds(String ids)
    {
        return basedSoftwareMapper.deleteBasedSoftwareByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除基础软件信息
     * 
     * @param id 基础软件ID
     * @return 结果
     */
    @Override
    public int deleteBasedSoftwareById(Long id)
    {
        return basedSoftwareMapper.deleteBasedSoftwareById(id);
    }
}
