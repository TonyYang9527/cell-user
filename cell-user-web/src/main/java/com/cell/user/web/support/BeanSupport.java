/**
 * 
 */
package com.cell.user.web.support;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.google.common.base.Optional;

public class BeanSupport {

    // private static ILog logger = LogManager.getLogger(BeanSupport.class);

    @ExceptionHandler(value = {
        Throwable.class
    })
    public Result<String> error(HttpServletRequest request, Throwable ex) {
        // Map<String, String> tags = createRequestTags(request);
        // logger.error("error", ex, tags);
        return fail("internal server error.");
    }

    public static <T>boolean isNull(T reference) {
        Optional<T> optional = Optional.fromNullable(reference);
        return !optional.isPresent();
    }

    public static <T>Result<T> success() {
        return new Result<>(1);
    }

    public static <T>Result<T> success(T t) {
        return new Result<>(t);
    }

    public static <T>Result<T> fail() {
        return new Result<>(0);
    }

    public static <T>Result<T> fail(String message) {
        return new Result<T>(0, message);
    }

    public static <T>Result<T> fail(int ret) {
        return new Result<>(ret);
    }

    public static <T>Result<T> fail(int ret, T t) {
        return new Result<>(ret, t);
    }

    // public static Map<String, String> createRequestTags(HttpServletRequest
    // request) {
    // String uri =
    // request.getRequestURI().substring(request.getContextPath().length());
    // Map<String, String> tags = TagBuilder.create().append("uri",
    // uri).build();
    //
    // String client = request.getRemoteHost() + ":" + request.getRemoteAddr();
    // tags.put("client", client);
    //
    // tags.put("method", request.getMethod());
    //
    // return tags;
    // }
}
