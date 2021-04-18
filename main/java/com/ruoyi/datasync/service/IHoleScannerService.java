package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.HoleScanner;

/**
 * 漏洞扫描设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IHoleScannerService 
{
    /**
     * 查询漏洞扫描设备
     * 
     * @param id 漏洞扫描设备ID
     * @return 漏洞扫描设备
     */
    public HoleScanner selectHoleScannerById(Long id);

    /**
     * 查询漏洞扫描设备列表
     * 
     * @param holeScanner 漏洞扫描设备
     * @return 漏洞扫描设备集合
     */
    public List<HoleScanner> selectHoleScannerList(HoleScanner holeScanner);

    /**
     * 新增漏洞扫描设备
     * 
     * @param holeScanner 漏洞扫描设备
     * @return 结果
     */
    public int insertHoleScanner(HoleScanner holeScanner);

    /**
     * 修改漏洞扫描设备
     * 
     * @param holeScanner 漏洞扫描设备
     * @return 结果
     */
    public int updateHoleScanner(HoleScanner holeScanner);

    /**
     * 批量删除漏洞扫描设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHoleScannerByIds(String ids);

    /**
     * 删除漏洞扫描设备信息
     * 
     * @param id 漏洞扫描设备ID
     * @return 结果
     */
    public int deleteHoleScannerById(Long id);
}
