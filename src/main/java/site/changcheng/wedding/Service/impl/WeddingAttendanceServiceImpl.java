/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import site.changcheng.wedding.Service.WeddingAttendanceService;
import site.changcheng.wedding.dao.entity.WeddingAttendance;
import site.changcheng.wedding.dao.mapper.WeddingAttendanceMapper;
import site.changcheng.wedding.web.request.WeddingAttendanceReq;
import site.changcheng.wedding.web.response.WeddingAttendanceVo;

@Service
public class WeddingAttendanceServiceImpl implements WeddingAttendanceService {

    @Resource
    WeddingAttendanceMapper weddingAttendanceMapper;

    @Override
    public WeddingAttendanceVo addWeddingAttendance(WeddingAttendanceReq req) {
        WeddingAttendance attendance = buildWeddingAttendance(req);
        weddingAttendanceMapper.insert(attendance);
        return buildWeddingAttendanceVo(attendance);
    }

    private WeddingAttendanceVo buildWeddingAttendanceVo(WeddingAttendance attendance) {
        WeddingAttendanceVo vo = new WeddingAttendanceVo();
        BeanUtils.copyProperties(attendance,vo);
        return vo;
    }

    private WeddingAttendance buildWeddingAttendance(WeddingAttendanceReq req) {
        WeddingAttendance attendance = new WeddingAttendance();
        BeanUtils.copyProperties(req,attendance);
        attendance.setCreateTime(new Date());
        return attendance;
    }

    @Override
    public List<WeddingAttendanceVo> getWeddingAttendanceAll() {
        List<WeddingAttendance> list = weddingAttendanceMapper.selectAll();
        List<WeddingAttendanceVo> targetList = new ArrayList<>();
        for (WeddingAttendance attendance:list) {
            WeddingAttendanceVo vo = new WeddingAttendanceVo();
            BeanUtils.copyProperties(attendance,vo);
            targetList.add(vo);

        }
        return targetList;
    }
}
