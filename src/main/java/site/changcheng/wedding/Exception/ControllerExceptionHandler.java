/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import site.changcheng.wedding.http.response.ResponseEntity;

/**
 * @author changcheng
 */
@ControllerAdvice
public class ControllerExceptionHandler {
  private Logger LOG = LoggerFactory.getLogger(getClass());
  @ExceptionHandler(SessionNotFoundException.class)
  @ResponseBody
  public ResponseEntity<?> sessionNotFoundExceptionHandler(HttpServletRequest request,
                                                           SessionNotFoundException exception) throws Exception {

    return ResponseEntity.build(HttpStatus.INTERNAL_SERVER_ERROR.value(), ChangchengException.CHANGHCNEG_SYSTEM_ERROR.errCode, exception, request);
  }

  @ExceptionHandler(NullPointerException.class)
  @ResponseBody
  public ResponseEntity<?> nullOrEmptyExceptionHandler(HttpServletRequest request, NullPointerException exception) throws Exception {
    LOG.error("Unhandled exception,{}", exception);
    return ResponseEntity
        .build(HttpStatus.INTERNAL_SERVER_ERROR.value(), ChangchengException.CHANGHCNEG_SYSTEM_ERROR.errCode, exception, request);
  }

  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseBody
  public ResponseEntity<?> illegalPropExceptionHandler(HttpServletRequest request, IllegalArgumentException exception) throws Exception {
    return ResponseEntity.build(HttpStatus.INTERNAL_SERVER_ERROR.value(), ChangchengException.CHANGHCNEG_SYSTEM_ERROR.errCode, exception, request);
  }
}
