/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Service;

import java.util.List;

import site.changcheng.wedding.web.request.WeddingAttendanceReq;
import site.changcheng.wedding.web.response.WeddingAttendanceVo;

public interface WeddingAttendanceService {
    WeddingAttendanceVo addWeddingAttendance(WeddingAttendanceReq req);

    List<WeddingAttendanceVo> getWeddingAttendanceAll();
}
