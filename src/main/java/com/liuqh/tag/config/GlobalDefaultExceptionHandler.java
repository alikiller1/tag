package com.liuqh.tag.config;

import com.liuqh.tag.vo.ResultObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResultObject exceptionHandler(Exception e) {
		log.error(e.getMessage(), e);
		return ResultObject.fail("系统错误");
	}

	// 处理请求参数格式错误 @RequestBody上validate失败后抛出的异常是MethodArgumentNotValidException异常。
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public ResultObject MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
		log.error(e.getMessage(), e);
		String message = e.getBindingResult().getAllErrors().stream()
				.map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
		return ResultObject.fail(message);
	}

}
