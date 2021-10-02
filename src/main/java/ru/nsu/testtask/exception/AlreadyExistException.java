package ru.nsu.testtask.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Setter
@Getter
@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class AlreadyExistException extends RuntimeException{

    public AlreadyExistException(String name){
        super("Entity with " + name + "is already exist.");
    }

}
