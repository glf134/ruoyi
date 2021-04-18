package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.DataCenterSpacing;

/**
 * 数据中心间距Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IDataCenterSpacingService 
{
    /**
     * 查询数据中心间距
     * 
     * @param id 数据中心间距ID
     * @return 数据中心间距
     */
    public DataCenterSpacing selectDataCenterSpacingById(Long id);

    /**
     * 查询数据中心间距列表
     * 
     * @param dataCenterSpacing 数据中心间距
     * @return 数据中心间距集合
     */
    public List<DataCenterSpacing> selectDataCenterSpacingList(DataCenterSpacing dataCenterSpacing);

    /**
     * 新增数据中心间距
     * 
     * @param dataCenterSpacing 数据中心间距
     * @return 结果
     */
    public int insertDataCenterSpacing(DataCenterSpacing dataCenterSpacing);

    /**
     * 修改数据中心间距
     * 
     * @param dataCenterSpacing 数据中心间距
     * @return 结果
     */
    public int updateDataCenterSpacing(DataCenterSpacing dataCenterSpacing);

    /**
     * 批量删除数据中心间距
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataCenterSpacingByIds(String ids);

    /**
     * 删除数据中心间距信息
     * 
     * @param id 数据中心间距ID
     * @return 结果
     */
    public int deleteDataCenterSpacingById(Long id);
}
