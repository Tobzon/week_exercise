package se.lexicon.tobias.week_exercise.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

}
