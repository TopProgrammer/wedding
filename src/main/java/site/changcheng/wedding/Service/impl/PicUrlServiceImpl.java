/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import site.changcheng.wedding.Service.PicUrlService;
import site.changcheng.wedding.web.response.PicUrlVo;

@Service
public class PicUrlServiceImpl implements PicUrlService {
    @Override
    public List<PicUrlVo> getPicUrlByType(int type) {
        return new ArrayList<>();
    }
}
