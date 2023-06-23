package com.example.meusgastos.domain.exception;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message) {
        super(message);
        //super manda a mensagem para construtor da classe pai
    }
    
}
