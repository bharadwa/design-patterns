package org.design.creational.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerServiceImpl implements Logger {

    private static Logger instance;
    private PrintWriter printWriter;
    private String logFilePath;

    private LoggerServiceImpl() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (LoggerServiceImpl.class) {
                if (instance == null) {
                    instance = new LoggerServiceImpl();
                }
            }
        }
        return instance;
    }

   /* @Override
    public void log(LogLevel level, String message) {
        if (printWriter == null) {
            throw new IllegalStateException("Log file is not set. Please set the log file before logging.");
        }
        try {
            String formattedMessage = String.format("%s [%s]: %s", java.time.LocalDateTime.now(), level.name(), message);
            printWriter.println(formattedMessage);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to log file: " + logFilePath, e);
        }
    }*/

    @Override
    public void setLogFile(String filePath) {
        File file = new File(filePath);
        this.logFilePath = filePath;
        if (printWriter != null) {
            printWriter.close();
        }
        try {
            if (!file.exists()) {
               boolean result= file.createNewFile();
               if(!result) {
                   throw new IOException("Failed to create log file: " + filePath);
               }
            }
            this.printWriter = new PrintWriter(new FileWriter(file, true), true);
            printWriter.println("Log file created at: " + filePath + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Failed to create or open log file: " + filePath, e);
        }

    }

    @Override
    public String getLogFile() {
        return this.logFilePath;
    }

    @Override
    public void flush() {
        if (printWriter == null) {
            throw new IllegalStateException("Log file is not set. Please set the log file before flushing.");
        }
        printWriter.flush();
    }

    @Override
    public void close() {
        if (printWriter == null) {
            throw new IllegalStateException("Log file is not set. Please set the log file before closing.");
        }
        printWriter.close();

    }
}
