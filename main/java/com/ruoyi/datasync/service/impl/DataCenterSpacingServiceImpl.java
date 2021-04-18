package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.DataCenterSpacingMapper;
import com.ruoyi.datasync.domain.DataCenterSpacing;
import com.ruoyi.datasync.service.IDataCenterSpacingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 数据中心间距Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class DataCenterSpacingServiceImpl implements IDataCenterSpacingService 
{
    @Autowired
    private DataCenterSpacingMapper dataCenterSpacingMapper;

    /**
     * 查询数据中心间距
     * 
     * @param id 数据中心间距ID
     * @return 数据中心间距
     */
    @Override
    public DataCenterSpacing selectDataCenterSpacingById(Long id)
    {
        return dataCenterSpacingMapper.selectDataCenterSpacingById(id);
    }

    /**
     * 查询数据中心间距列表
     * 
     * @param dataCenterSpacing 数据中心间距
     * @return 数据中心间距
     */
    @Override
    public List<DataCenterSpacing> selectDataCenterSpacingList(DataCenterSpacing dataCenterSpacing)
    {
        return dataCenterSpacingMapper.selectDataCenterSpacingList(dataCenterSpacing);
    }

    /**
     * 新增数据中心间距
     * 
     * @param dataCenterSpacing 数据中心间距
     * @return 结果
     */
    @Override
    public int insertDataCenterSpacing(DataCenterSpacing dataCenterSpacing)
    {
        dataCenterSpacing.setCreateTime(DateUtils.getNowDate());
        return dataCenterSpacingMapper.insertDataCenterSpacing(dataCenterSpacing);
    }

    /**
     * 修改数据中心间距
     * 
     * @param dataCenterSpacing 数据中心间距
     * @return 结果
     */
    @Override
    public int updateDataCenterSpacing(DataCenterSpacing dataCenterSpacing)
    {
        dataCenterSpacing.setUpdateTime(DateUtils.getNowDate());
        return dataCenterSpacingMapper.updateDataCenterSpacing(dataCenterSpacing);
    }

    /**
     * 删除数据中心间距对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDataCenterSpacingByIds(String ids)
    {
        return dataCenterSpacingMapper.deleteDataCenterSpacingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除数据中心间距信息
     * 
     * @param id 数据中心间距ID
     * @return 结果
     */
    @Override
    public int deleteDataCenterSpacingById(Long id)
    {
        return dataCenterSpacingMapper.deleteDataCenterSpacingById(id);
    }
}
