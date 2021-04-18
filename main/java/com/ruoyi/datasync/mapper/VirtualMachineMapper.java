package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.VirtualMachine;

/**
 * 虚拟机资源Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface VirtualMachineMapper 
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
     * 删除虚拟机资源
     * 
     * @param id 虚拟机资源ID
     * @return 结果
     */
    public int deleteVirtualMachineById(Long id);

    /**
     * 批量删除虚拟机资源
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVirtualMachineByIds(String[] ids);
}
