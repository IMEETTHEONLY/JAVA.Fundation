package 异常处理;

public class NameFormatException extends RuntimeException{
    //区分编译时异常和运行时异常
    //编译时:就是如果说你不加try..catch它代码都会爆红，目的是让程序员检查本地资源（文件）等等
    //运行时：由于参数问题引起的错误

    //所以说这是由于参数引起的问题
    public NameFormatException() {
        super();
    }

    public NameFormatException(String message) {
        super(message);
    }
}
