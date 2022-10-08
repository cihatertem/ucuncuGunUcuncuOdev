package entities;

import logger.ILogger;

public class Logger {
    private int id;
    private ILogger logger;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ILogger getLogger() {
        return logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }
}
