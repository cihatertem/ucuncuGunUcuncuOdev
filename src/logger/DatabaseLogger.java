package logger;

public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Log veritabanına kaydedildi.");
    }
}
