
  package com.krishna.training.interceptor;
  
  import javax.servlet.http.HttpServletRequest;
import
  javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import
  org.springframework.web.servlet.ModelAndView;
import
  org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
  
  public class WelcomeInterceptor extends HandlerInterceptorAdapter {
  
  
  
 /**
	 * This implementation always returns {@code true}.
	 */

  @Override public boolean preHandle(HttpServletRequest request,
  HttpServletResponse response, Object handler) throws Exception {
  
  System.out.println("in preHandle() method");
  
  return true; }
  
 /**
	 * This implementation is empty.
	 */

  @Override public void postHandle(HttpServletRequest request,
  HttpServletResponse response, Object handler,
  
  @Nullable ModelAndView modelAndView) throws Exception {
  
  System.out.println("In postHandle () method"); }
  
 /**
	 * This implementation is empty.
	 */
		  @Override public void afterCompletion(HttpServletRequest request,
		  HttpServletResponse response, Object handler,
		  
		  @Nullable Exception ex) throws Exception {
		  
		  System.out.println("After Completion method"); }
		  
		  }
		 