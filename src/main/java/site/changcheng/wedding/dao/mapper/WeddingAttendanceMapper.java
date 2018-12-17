package site.changcheng.wedding.dao.mapper;

import java.util.List;

import site.changcheng.wedding.dao.entity.WeddingAttendance;

public interface WeddingAttendanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WeddingAttendance record);

    int insertSelective(WeddingAttendance record);

    WeddingAttendance selectByPrimaryKey(Long id);

    List<WeddingAttendance> selectAll();

    int updateByPrimaryKeySelective(WeddingAttendance record);

    int updateByPrimaryKey(WeddingAttendance record);
}