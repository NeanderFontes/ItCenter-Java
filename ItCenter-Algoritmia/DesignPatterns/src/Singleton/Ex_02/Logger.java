package Singleton.Ex_02;

public class Logger {
    private static Logger instace;
    private String logTxt;

    private Logger(String logTxt) {
        this.logTxt = logTxt;
    }

    public static Logger getInstance(String logTxt) {
        if (instace == null) instace = new Logger(logTxt);
        return instace;
    }

    public void Logtxt(String msg) {
        System.out.println(msg);
    }
}
