/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Service;

import java.util.List;

import site.changcheng.wedding.web.response.TimeLineVo;

public interface TimeLineService {

    List<TimeLineVo> getTimeLinesList();
}
