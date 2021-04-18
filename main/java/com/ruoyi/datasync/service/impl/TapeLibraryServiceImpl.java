package com.ruoyi.datasync.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.datasync.mapper.TapeLibraryMapper;
import com.ruoyi.datasync.domain.TapeLibrary;
import com.ruoyi.datasync.service.ITapeLibraryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 磁带库Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
@Service
public class TapeLibraryServiceImpl implements ITapeLibraryService 
{
    @Autowired
    private TapeLibraryMapper tapeLibraryMapper;

    /**
     * 查询磁带库
     * 
     * @param id 磁带库ID
     * @return 磁带库
     */
    @Override
    public TapeLibrary selectTapeLibraryById(Long id)
    {
        return tapeLibraryMapper.selectTapeLibraryById(id);
    }

    /**
     * 查询磁带库列表
     * 
     * @param tapeLibrary 磁带库
     * @return 磁带库
     */
    @Override
    public List<TapeLibrary> selectTapeLibraryList(TapeLibrary tapeLibrary)
    {
        return tapeLibraryMapper.selectTapeLibraryList(tapeLibrary);
    }

    /**
     * 新增磁带库
     * 
     * @param tapeLibrary 磁带库
     * @return 结果
     */
    @Override
    public int insertTapeLibrary(TapeLibrary tapeLibrary)
    {
        tapeLibrary.setCreateTime(DateUtils.getNowDate());
        return tapeLibraryMapper.insertTapeLibrary(tapeLibrary);
    }

    /**
     * 修改磁带库
     * 
     * @param tapeLibrary 磁带库
     * @return 结果
     */
    @Override
    public int updateTapeLibrary(TapeLibrary tapeLibrary)
    {
        tapeLibrary.setUpdateTime(DateUtils.getNowDate());
        return tapeLibraryMapper.updateTapeLibrary(tapeLibrary);
    }

    /**
     * 删除磁带库对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTapeLibraryByIds(String ids)
    {
        return tapeLibraryMapper.deleteTapeLibraryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除磁带库信息
     * 
     * @param id 磁带库ID
     * @return 结果
     */
    @Override
    public int deleteTapeLibraryById(Long id)
    {
        return tapeLibraryMapper.deleteTapeLibraryById(id);
    }
}
