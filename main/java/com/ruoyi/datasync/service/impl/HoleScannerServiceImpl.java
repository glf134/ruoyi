package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.HoleScannerMapper;
import com.ruoyi.datasync.domain.HoleScanner;
import com.ruoyi.datasync.service.IHoleScannerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 漏洞扫描设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class HoleScannerServiceImpl implements IHoleScannerService 
{
    @Autowired
    private HoleScannerMapper holeScannerMapper;

    /**
     * 查询漏洞扫描设备
     * 
     * @param id 漏洞扫描设备ID
     * @return 漏洞扫描设备
     */
    @Override
    public HoleScanner selectHoleScannerById(Long id)
    {
        return holeScannerMapper.selectHoleScannerById(id);
    }

    /**
     * 查询漏洞扫描设备列表
     * 
     * @param holeScanner 漏洞扫描设备
     * @return 漏洞扫描设备
     */
    @Override
    public List<HoleScanner> selectHoleScannerList(HoleScanner holeScanner)
    {
        return holeScannerMapper.selectHoleScannerList(holeScanner);
    }

    /**
     * 新增漏洞扫描设备
     * 
     * @param holeScanner 漏洞扫描设备
     * @return 结果
     */
    @Override
    public int insertHoleScanner(HoleScanner holeScanner)
    {
        holeScanner.setCreateTime(DateUtils.getNowDate());
        return holeScannerMapper.insertHoleScanner(holeScanner);
    }

    /**
     * 修改漏洞扫描设备
     * 
     * @param holeScanner 漏洞扫描设备
     * @return 结果
     */
    @Override
    public int updateHoleScanner(HoleScanner holeScanner)
    {
        holeScanner.setUpdateTime(DateUtils.getNowDate());
        return holeScannerMapper.updateHoleScanner(holeScanner);
    }

    /**
     * 删除漏洞扫描设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteHoleScannerByIds(String ids)
    {
        return holeScannerMapper.deleteHoleScannerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除漏洞扫描设备信息
     * 
     * @param id 漏洞扫描设备ID
     * @return 结果
     */
    @Override
    public int deleteHoleScannerById(Long id)
    {
        return holeScannerMapper.deleteHoleScannerById(id);
    }
}
