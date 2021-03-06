/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import site.changcheng.wedding.Service.WeddingAttendanceService;
import site.changcheng.wedding.web.request.WeddingAttendanceReq;
import site.changcheng.wedding.web.response.WeddingAttendanceVo;

@RestController
@RequestMapping(value = "/wedding")
@Api(value="出席婚礼controller",tags={"出席婚礼相关接口"})
@CrossOrigin
public class WeddingAttenditionController {

    @Resource
    private WeddingAttendanceService weddingAttendanceService;

    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @RequestMapping(value = "/attendance",method = RequestMethod.PUT)
    public ResponseEntity<WeddingAttendanceVo> addAttend(@RequestBody WeddingAttendanceReq req){
        WeddingAttendanceVo vo = weddingAttendanceService.addWeddingAttendance(req);

        return ResponseEntity.ok(vo);
    }

    @RequestMapping(value = "/attendance",method = RequestMethod.GET)
    public ResponseEntity<List<WeddingAttendanceVo>> getAttendAll(){
        List<WeddingAttendanceVo> vos = weddingAttendanceService.getWeddingAttendanceAll();

        return ResponseEntity.ok(vos);
    }

}
