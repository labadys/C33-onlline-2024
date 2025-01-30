package lesson_13;

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}