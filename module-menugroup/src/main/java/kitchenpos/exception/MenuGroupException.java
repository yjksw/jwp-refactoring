package kitchenpos.exception;

import org.springframework.http.HttpStatus;

public class MenuGroupException extends RuntimeException {

    private final HttpStatus httpStatus;
    private final String message;

    public MenuGroupException(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
