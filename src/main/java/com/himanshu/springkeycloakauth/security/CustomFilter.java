//package com.himanshu.springkeycloakauth.security;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpServletResponse;
//import org.apache.http.HttpStatus;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//@Component
//public class CustomFilter implements Filter {
//  @Override
//  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//    HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//
//    filterChain.doFilter(servletRequest, servletResponse);
//
//    if (httpServletResponse.getStatus() == HttpStatus.SC_FORBIDDEN) {
//      httpServletResponse.setStatus(HttpStatus.SC_SERVICE_UNAVAILABLE);
//      httpServletResponse.setContentType("application/json");
//      httpServletResponse.getWriter().write("{\n" +
//              "    \"status\": 503,\n" +
//              "    \"error\": \"This resource is only for premium user. Kindly pay first.\",\n" +
//              "    \"message\": \"You are not authorized for this end-point\"\n" +
//              "}");
//      httpServletResponse.getWriter().flush();
//    }
//  }
//}
