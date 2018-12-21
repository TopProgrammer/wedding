/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import site.changcheng.wedding.Service.PicUrlService;
import site.changcheng.wedding.web.response.PicUrlVo;

@RestController
@RequestMapping("/pic")
@Api(value="图片controller",tags={"图片接口"})
public class PicController {

    @Resource
    PicUrlService picUrlService;

    @RequestMapping("/url")
    public ResponseEntity<List<PicUrlVo>> getIndexBackgroundPic(){

        int type = 1;

        List<PicUrlVo> picUrlVoList = picUrlService.getPicUrlByType(type);

        return ResponseEntity.ok(picUrlVoList);
    }


    @RequestMapping("/")
    public ResponseEntity<List<PicUrlVo>> getWeddingGalleryPic(){
        int type = 1;

        List<PicUrlVo> picUrlVoList = picUrlService.getPicUrlByType(type);

        return ResponseEntity.ok(picUrlVoList);
    }













}
