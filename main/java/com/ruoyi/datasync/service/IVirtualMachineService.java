package com.ruoyi.datasync.service;

import java.util.List;
import com.ruoyi.datasync.domain.VirtualMachine;

/**
 * 虚拟机资源Service接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface IVirtualMachineService 
{
    /**
     * 查询虚拟机资源
     * 
     * @param id 虚拟机资源ID
     * @return 虚拟机资源
     */
    public VirtualMachine selectVirtualMachineById(Long id);

    /**
     * 查询虚拟机资源列表
     * 
     * @param virtualMachine 虚拟机资源
     * @return 虚拟机资源集合
     */
    public List<VirtualMachine> selectVirtualMachineList(VirtualMachine virtualMachine);

    /**
     * 新增虚拟机资源
     * 
     * @param virtualMachine 虚拟机资源
     * @return 结果
     */
    public int insertVirtualMachine(VirtualMachine virtualMachine);

    /**
     * 修改虚拟机资源
     * 
     * @param virtualMachine 虚拟机资源
     * @return 结果
     */
    public int updateVirtualMachine(VirtualMachine virtualMachine);

    /**
     * 批量删除虚拟机资源
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVirtualMachineByIds(String ids);

    /**
     * 删除虚拟机资源信息
     * 
     * @param id 虚拟机资源ID
     * @return 结果
     */
    public int deleteVirtualMachineById(Long id);
}
