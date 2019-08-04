package cl.robot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ExceptionControllerAdvice {


    /*@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    ErrorInfo handleException(HttpServletRequest req, Exception ex) {
        return new ErrorInfo(req.getRequestURL().toString(), String.valueOf(Errors.ERROR_GENERAL_APLICACION.getCode()), ex.getLocalizedMessage());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Throwable.class)
    @ResponseBody
    ErrorInfo handleThrowable(HttpServletRequest req, Throwable e) {
        return new ErrorInfo(req.getRequestURL().toString(), String.valueOf(Errors.ERROR_GENERAL_APLICACION.getCode()), e.getLocalizedMessage());
    }	

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(SuraBusinessException.class)
    @ResponseBody
    ErrorInfo handleSuraBusinessException(HttpServletRequest req, SuraBusinessException e) {
    	if(e.getError() != null) {
    		return new ErrorInfo(req.getRequestURL().toString(), String.valueOf(e.getError().getCode()), e.getError().getDescription());
    	}else {
    		return new ErrorInfo(req.getRequestURL().toString(), "", e.getLocalizedMessage());
    	}
    }*/
}
