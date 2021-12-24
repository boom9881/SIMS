package com.tt.sms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

/**
 * 登录验证过滤器
 */
@WebFilter(filterName = "authFilter", urlPatterns = "/*")
@Component
public class AuthenticationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rep = (HttpServletResponse) response;

		// 设置允许跨域的配置
		// 这里填写你允许进行跨域的主机ip
		rep.setHeader("Access-Control-Allow-Origin", "*");
		// 允许的访问方法
		rep.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
		// Access-Control-Max-Age 用于 CORS 相关配置的缓存
		rep.setHeader("Access-Control-Allow-Credentials", "true");
		rep.setHeader("Access-Control-Max-Age", "3600");
		rep.setHeader("Access-Control-Allow-Headers", "token,Origin, X-Requested-With, Content-Type, Accept");
		response.setCharacterEncoding("UTF-8");

		if (req.getServletPath().indexOf("userLogin") >= 0) {
			chain.doFilter(request, response);
			return;
		}
	}

}
