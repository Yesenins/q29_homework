package Lesson9.exeption;

public class BasicValidationExeption extends RuntimeException{

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public BasicValidationExeption(String message){
        this.message = message;
    }
}
