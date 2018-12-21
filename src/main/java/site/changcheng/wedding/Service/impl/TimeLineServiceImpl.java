/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import site.changcheng.wedding.Service.TimeLineService;
import site.changcheng.wedding.dao.mapper.TimeLineMapper;
import site.changcheng.wedding.web.response.TimeLineVo;

@Service
public class TimeLineServiceImpl implements TimeLineService {

    @Resource
    private TimeLineMapper timeLineMapper;

    @Override
    public List<TimeLineVo> getTimeLinesList() {
        return null;
    }
}
