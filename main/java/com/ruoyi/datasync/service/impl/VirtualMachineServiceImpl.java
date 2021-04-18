package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.VirtualMachineMapper;
import com.ruoyi.datasync.domain.VirtualMachine;
import com.ruoyi.datasync.service.IVirtualMachineService;
import com.ruoyi.common.core.text.Convert;

/**
 * 虚拟机资源Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class VirtualMachineServiceImpl implements IVirtualMachineService 
{
    @Autowired
    private VirtualMachineMapper virtualMachineMapper;

    /**
     * 查询虚拟机资源
     * 
     * @param id 虚拟机资源ID
     * @return 虚拟机资源
     */
    @Override
    public VirtualMachine selectVirtualMachineById(Long id)
    {
        return virtualMachineMapper.selectVirtualMachineById(id);
    }

    /**
     * 查询虚拟机资源列表
     * 
     * @param virtualMachine 虚拟机资源
     * @return 虚拟机资源
     */
    @Override
    public List<VirtualMachine> selectVirtualMachineList(VirtualMachine virtualMachine)
    {
        return virtualMachineMapper.selectVirtualMachineList(virtualMachine);
    }

    /**
     * 新增虚拟机资源
     * 
     * @param virtualMachine 虚拟机资源
     * @return 结果
     */
    @Override
    public int insertVirtualMachine(VirtualMachine virtualMachine)
    {
        virtualMachine.setCreateTime(DateUtils.getNowDate());
        return virtualMachineMapper.insertVirtualMachine(virtualMachine);
    }

    /**
     * 修改虚拟机资源
     * 
     * @param virtualMachine 虚拟机资源
     * @return 结果
     */
    @Override
    public int updateVirtualMachine(VirtualMachine virtualMachine)
    {
        virtualMachine.setUpdateTime(DateUtils.getNowDate());
        return virtualMachineMapper.updateVirtualMachine(virtualMachine);
    }

    /**
     * 删除虚拟机资源对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVirtualMachineByIds(String ids)
    {
        return virtualMachineMapper.deleteVirtualMachineByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除虚拟机资源信息
     * 
     * @param id 虚拟机资源ID
     * @return 结果
     */
    @Override
    public int deleteVirtualMachineById(Long id)
    {
        return virtualMachineMapper.deleteVirtualMachineById(id);
    }
}
