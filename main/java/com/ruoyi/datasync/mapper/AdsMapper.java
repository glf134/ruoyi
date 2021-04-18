package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.Ads;

/**
 * 抗拒绝服务设备（ADS）Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface AdsMapper 
{
    /**
     * 查询抗拒绝服务设备（ADS）
     * 
     * @param id 抗拒绝服务设备（ADS）ID
     * @return 抗拒绝服务设备（ADS）
     */
    public Ads selectAdsById(Long id);

    /**
     * 查询抗拒绝服务设备（ADS）列表
     * 
     * @param ads 抗拒绝服务设备（ADS）
     * @return 抗拒绝服务设备（ADS）集合
     */
    public List<Ads> selectAdsList(Ads ads);

    /**
     * 新增抗拒绝服务设备（ADS）
     * 
     * @param ads 抗拒绝服务设备（ADS）
     * @return 结果
     */
    public int insertAds(Ads ads);

    /**
     * 修改抗拒绝服务设备（ADS）
     * 
     * @param ads 抗拒绝服务设备（ADS）
     * @return 结果
     */
    public int updateAds(Ads ads);

    /**
     * 删除抗拒绝服务设备（ADS）
     * 
     * @param id 抗拒绝服务设备（ADS）ID
     * @return 结果
     */
    public int deleteAdsById(Long id);

    /**
     * 批量删除抗拒绝服务设备（ADS）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAdsByIds(String[] ids);
}
