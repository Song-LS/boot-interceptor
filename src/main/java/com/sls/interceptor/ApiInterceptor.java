package com.sls.interceptor;

import cn.gjing.ParamUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.security.auth.message.AuthException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义拦截器，并实现HandlerInterceptor 接口
 * @author sls
 **/
@Component
public class ApiInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws AuthException {
        String token = request.getHeader("token");
        if (ParamUtil.isEmpty(token)) {
            throw new AuthException("Token cannot be null");
        }
        return true;
    }
}
