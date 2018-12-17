package site.changcheng.wedding.dao.mapper;

import site.changcheng.wedding.dao.entity.TimeLine;

public interface TimeLineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TimeLine record);

    int insertSelective(TimeLine record);

    TimeLine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TimeLine record);

    int updateByPrimaryKey(TimeLine record);
}