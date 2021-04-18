package com.ruoyi.datasync.mapper;

import java.util.List;
import com.ruoyi.datasync.domain.TapeLibrary;

/**
 * 磁带库Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-18
 */
public interface TapeLibraryMapper 
{
    /**
     * 查询磁带库
     * 
     * @param id 磁带库ID
     * @return 磁带库
     */
    public TapeLibrary selectTapeLibraryById(Long id);

    /**
     * 查询磁带库列表
     * 
     * @param tapeLibrary 磁带库
     * @return 磁带库集合
     */
    public List<TapeLibrary> selectTapeLibraryList(TapeLibrary tapeLibrary);

    /**
     * 新增磁带库
     * 
     * @param tapeLibrary 磁带库
     * @return 结果
     */
    public int insertTapeLibrary(TapeLibrary tapeLibrary);

    /**
     * 修改磁带库
     * 
     * @param tapeLibrary 磁带库
     * @return 结果
     */
    public int updateTapeLibrary(TapeLibrary tapeLibrary);

    /**
     * 删除磁带库
     * 
     * @param id 磁带库ID
     * @return 结果
     */
    public int deleteTapeLibraryById(Long id);

    /**
     * 批量删除磁带库
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTapeLibraryByIds(String[] ids);
}
