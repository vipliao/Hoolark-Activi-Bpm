package com.hoolark.bpm.util.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hoolark.bpm.util.Status;
import com.hoolark.bpm.util.ToWeb;

/**
 * 全局异常处理，捕获所有Controller中抛出的异常。
 * @author Administrator
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	//处理自定义的异常
	@ExceptionHandler(BaseException.class)
	@ResponseBody
	public Object customHandler(BaseException e){
//		e.printStackTrace();
		return ToWeb.buildResult().status(e.getCode()).msg(e.getMessage());
	}

	//其他未处理的异常
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object exceptionHandler(Exception e){
		e.printStackTrace();
		return ToWeb.buildResult().status(Status.FAIL).msg("系统错误");
	}
}
