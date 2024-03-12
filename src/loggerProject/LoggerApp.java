package loggerProject;

// Step 1: Create the Logger interface
// Step 2: Add two void methods to the Logger interface, each should take a String as an argument
public interface Logger {
    // method to log a message
    void log(String message);

    // method to log an error message
    void error(String message);
}

// Step 3a: Create the AsteriskLogger class implementing Logger interface
class AsteriskLogger implements Logger {
    // Overrides the log method to print message between ***
	// Step 4: implements  AsteriskLogger method 
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    // Overrides the method to print error message between *** and print "ERROR: "
    @Override
    public void error(String message) {
        String errorMessage = "ERROR: " + message;
        int length = errorMessage.length();
        printStars(length); // Print *** equal to the length of the error message
        System.out.println("***" + errorMessage + "***");
        printStars(length); // Print *** equal to the length of the error message again
    }

    //  method to print stars
    private void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

// Step 3b: Create the SpacedLogger class implementing Logger interface
class SpacedLogger implements Logger {
    // Overrides the log method to print each character of the message with a space in between
	// step 5: implements SpacedLogger method
    public void log(String message) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
        }
        System.out.println();
    }

    // Overrides the error method to print "ERROR: " then each caracter after with a space 
    @Override
    public void error(String message) {
        System.out.print("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
        }
        System.out.println();
    }
}

public class LoggerApp {

    public static void main(String[] args) {
        // Step 6b: Test methods on both instances
        // Create an instance of AsteriskLogger
        Logger asteriskLogger = new AsteriskLogger();
        // Create an instance of SpacedLogger
        Logger spacedLogger = new SpacedLogger();

        // Test  of AsteriskLogger
        asteriskLogger.log("Hello");
        asteriskLogger.error("World");

        // Test of SpacedLogger
        spacedLogger.log("Hello");
        spacedLogger.error("World");
    }
}
