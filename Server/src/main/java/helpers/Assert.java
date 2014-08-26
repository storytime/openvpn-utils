package helpers;

public final class Assert {
    private Assert() {
    }

    public static void require(boolean condition, String argumentName, Object argumentValue) {
        if (!condition) {
            throw new IllegalArgumentException("Illegal argument " + argumentName + ": " + argumentValue);
        }
    }
}
