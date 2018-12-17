package site.changcheng.wedding.dao.mapper;

import site.changcheng.wedding.dao.entity.PicUrl;

public interface PicUrlMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PicUrl record);

    int insertSelective(PicUrl record);

    PicUrl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PicUrl record);

    int updateByPrimaryKey(PicUrl record);
}