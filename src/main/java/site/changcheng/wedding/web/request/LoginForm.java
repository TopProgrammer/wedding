/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("登陆实体bean")
public class LoginForm {
  private String username;
  private String password;
  private String picCaptcha;

}
