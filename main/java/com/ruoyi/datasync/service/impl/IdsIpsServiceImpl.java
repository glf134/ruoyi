package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.IdsIpsMapper;
import com.ruoyi.datasync.domain.IdsIps;
import com.ruoyi.datasync.service.IIdsIpsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 入侵检测与防御设备（IDS/IPS）Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class IdsIpsServiceImpl implements IIdsIpsService 
{
    @Autowired
    private IdsIpsMapper idsIpsMapper;

    /**
     * 查询入侵检测与防御设备（IDS/IPS）
     * 
     * @param id 入侵检测与防御设备（IDS/IPS）ID
     * @return 入侵检测与防御设备（IDS/IPS）
     */
    @Override
    public IdsIps selectIdsIpsById(Long id)
    {
        return idsIpsMapper.selectIdsIpsById(id);
    }

    /**
     * 查询入侵检测与防御设备（IDS/IPS）列表
     * 
     * @param idsIps 入侵检测与防御设备（IDS/IPS）
     * @return 入侵检测与防御设备（IDS/IPS）
     */
    @Override
    public List<IdsIps> selectIdsIpsList(IdsIps idsIps)
    {
        return idsIpsMapper.selectIdsIpsList(idsIps);
    }

    /**
     * 新增入侵检测与防御设备（IDS/IPS）
     * 
     * @param idsIps 入侵检测与防御设备（IDS/IPS）
     * @return 结果
     */
    @Override
    public int insertIdsIps(IdsIps idsIps)
    {
        idsIps.setCreateTime(DateUtils.getNowDate());
        return idsIpsMapper.insertIdsIps(idsIps);
    }

    /**
     * 修改入侵检测与防御设备（IDS/IPS）
     * 
     * @param idsIps 入侵检测与防御设备（IDS/IPS）
     * @return 结果
     */
    @Override
    public int updateIdsIps(IdsIps idsIps)
    {
        idsIps.setUpdateTime(DateUtils.getNowDate());
        return idsIpsMapper.updateIdsIps(idsIps);
    }

    /**
     * 删除入侵检测与防御设备（IDS/IPS）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIdsIpsByIds(String ids)
    {
        return idsIpsMapper.deleteIdsIpsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除入侵检测与防御设备（IDS/IPS）信息
     * 
     * @param id 入侵检测与防御设备（IDS/IPS）ID
     * @return 结果
     */
    @Override
    public int deleteIdsIpsById(Long id)
    {
        return idsIpsMapper.deleteIdsIpsById(id);
    }
}
