package site.changcheng.wedding.dao.mapper;

import site.changcheng.wedding.dao.entity.Benediction;

public interface BenedictionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Benediction record);

    int insertSelective(Benediction record);

    Benediction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Benediction record);

    int updateByPrimaryKey(Benediction record);
}