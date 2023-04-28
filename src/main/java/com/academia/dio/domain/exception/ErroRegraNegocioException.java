package com.academia.dio.domain.exception;

/**
 *
 * @author Matheus
 */
public class ErroRegraNegocioException extends RuntimeException {

    public ErroRegraNegocioException() {
        super();
    }

    public ErroRegraNegocioException(String msg) {
        super(msg);
    }
}
