package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.Wdm;

/**
 * 波分复用设备Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IWdmService 
{
    /**
     * 查询波分复用设备
     * 
     * @param id 波分复用设备ID
     * @return 波分复用设备
     */
    public Wdm selectWdmById(Long id);

    /**
     * 查询波分复用设备列表
     * 
     * @param wdm 波分复用设备
     * @return 波分复用设备集合
     */
    public List<Wdm> selectWdmList(Wdm wdm);

    /**
     * 新增波分复用设备
     * 
     * @param wdm 波分复用设备
     * @return 结果
     */
    public int insertWdm(Wdm wdm);

    /**
     * 修改波分复用设备
     * 
     * @param wdm 波分复用设备
     * @return 结果
     */
    public int updateWdm(Wdm wdm);

    /**
     * 批量删除波分复用设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWdmByIds(String ids);

    /**
     * 删除波分复用设备信息
     * 
     * @param id 波分复用设备ID
     * @return 结果
     */
    public int deleteWdmById(Long id);
}
