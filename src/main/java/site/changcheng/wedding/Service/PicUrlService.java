/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Service;

import java.util.List;

import site.changcheng.wedding.web.response.PicUrlVo;

public interface PicUrlService {
    List<PicUrlVo> getPicUrlByType(int type);
}

