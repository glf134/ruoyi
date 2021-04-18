package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.IdsIps;

/**
 * 入侵检测与防御设备（IDS/IPS）Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IdsIpsMapper 
{
    /**
     * 查询入侵检测与防御设备（IDS/IPS）
     * 
     * @param id 入侵检测与防御设备（IDS/IPS）ID
     * @return 入侵检测与防御设备（IDS/IPS）
     */
    public IdsIps selectIdsIpsById(Long id);

    /**
     * 查询入侵检测与防御设备（IDS/IPS）列表
     * 
     * @param idsIps 入侵检测与防御设备（IDS/IPS）
     * @return 入侵检测与防御设备（IDS/IPS）集合
     */
    public List<IdsIps> selectIdsIpsList(IdsIps idsIps);

    /**
     * 新增入侵检测与防御设备（IDS/IPS）
     * 
     * @param idsIps 入侵检测与防御设备（IDS/IPS）
     * @return 结果
     */
    public int insertIdsIps(IdsIps idsIps);

    /**
     * 修改入侵检测与防御设备（IDS/IPS）
     * 
     * @param idsIps 入侵检测与防御设备（IDS/IPS）
     * @return 结果
     */
    public int updateIdsIps(IdsIps idsIps);

    /**
     * 删除入侵检测与防御设备（IDS/IPS）
     * 
     * @param id 入侵检测与防御设备（IDS/IPS）ID
     * @return 结果
     */
    public int deleteIdsIpsById(Long id);

    /**
     * 批量删除入侵检测与防御设备（IDS/IPS）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteIdsIpsByIds(String[] ids);
}
