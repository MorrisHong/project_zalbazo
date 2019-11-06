package kr.project.zalbazo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.stream.Stream;

@Slf4j
public class SampleInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        request.setCharacterEncoding("UTF-8");
//        Cookie cookie = new Cookie("member", "memberCookie");
//        response.addCookie(cookie);
//        log.debug("Interceptor preHandle..............");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("Interceptor postHandle............");
//        Arrays.stream(request.getCookies()).map(Cookie::getName).forEach(log::debug);
//        response.setHeader("Content-Type","text/html;charset=utf-8");

    }
}
