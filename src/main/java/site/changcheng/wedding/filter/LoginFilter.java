/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.filter;

import java.io.IOException;

import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.servlet.*;

@WebFilter
@Component
public class LoginFilter implements Filter {

  private Logger LOG = LoggerFactory.getLogger(getClass());
  @Override public void init(FilterConfig filterConfig) throws ServletException {
    LOG.info("======登录过滤器初始化=======");
  }

  @Override public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
      ServletException {
    LOG.info("LoginFilter  ===  执行中");
    chain.doFilter(request, response);
  }

  @Override public void destroy() {
    LOG.info("======登陆过滤器销毁=========");
  }
}
