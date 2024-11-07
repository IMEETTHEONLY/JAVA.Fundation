package 异常处理;

public class AgeOutBoundsException extends RuntimeException{
    public AgeOutBoundsException() {
        super();
    }

    public AgeOutBoundsException(String message) {
        super(message);
    }
}
