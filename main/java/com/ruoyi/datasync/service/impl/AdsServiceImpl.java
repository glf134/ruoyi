package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.AdsMapper;
import com.ruoyi.datasync.domain.Ads;
import com.ruoyi.datasync.service.IAdsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 抗拒绝服务设备（ADS）Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class AdsServiceImpl implements IAdsService 
{
    @Autowired
    private AdsMapper adsMapper;

    /**
     * 查询抗拒绝服务设备（ADS）
     * 
     * @param id 抗拒绝服务设备（ADS）ID
     * @return 抗拒绝服务设备（ADS）
     */
    @Override
    public Ads selectAdsById(Long id)
    {
        return adsMapper.selectAdsById(id);
    }

    /**
     * 查询抗拒绝服务设备（ADS）列表
     * 
     * @param ads 抗拒绝服务设备（ADS）
     * @return 抗拒绝服务设备（ADS）
     */
    @Override
    public List<Ads> selectAdsList(Ads ads)
    {
        return adsMapper.selectAdsList(ads);
    }

    /**
     * 新增抗拒绝服务设备（ADS）
     * 
     * @param ads 抗拒绝服务设备（ADS）
     * @return 结果
     */
    @Override
    public int insertAds(Ads ads)
    {
        ads.setCreateTime(DateUtils.getNowDate());
        return adsMapper.insertAds(ads);
    }

    /**
     * 修改抗拒绝服务设备（ADS）
     * 
     * @param ads 抗拒绝服务设备（ADS）
     * @return 结果
     */
    @Override
    public int updateAds(Ads ads)
    {
        ads.setUpdateTime(DateUtils.getNowDate());
        return adsMapper.updateAds(ads);
    }

    /**
     * 删除抗拒绝服务设备（ADS）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAdsByIds(String ids)
    {
        return adsMapper.deleteAdsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除抗拒绝服务设备（ADS）信息
     * 
     * @param id 抗拒绝服务设备（ADS）ID
     * @return 结果
     */
    @Override
    public int deleteAdsById(Long id)
    {
        return adsMapper.deleteAdsById(id);
    }
}
