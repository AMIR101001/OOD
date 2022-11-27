package designpatterns.creational.sngleton;

public class ProgramRunner {
    public static void main(String[] args) {
       ProgramLogger.getProgramLogger().addLogInfo("First lof...");
        ProgramLogger.getProgramLogger().addLogInfo("Second lof...");
        ProgramLogger.getProgramLogger().addLogInfo("Third lof...");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
