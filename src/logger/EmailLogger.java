package logger;

public class EmailLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Log eposta ile gönderildi.");
    }
}
