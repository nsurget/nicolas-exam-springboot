package fr.nsurget.nicolasexamspringboot.Centrafake.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {

    private final String type;

    private final String field;

    private final Object value;

    public NotFoundException(String type, String field, Object value) {
        super("Entity not found");
        this.type = type;
        this.field = field;
        this.value = value;
    }
}
