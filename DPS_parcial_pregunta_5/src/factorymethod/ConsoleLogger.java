package factorymethod;

public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Console Logger: " + message);
    }
}
