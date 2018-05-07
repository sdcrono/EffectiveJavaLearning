package Chapter2.Item4;

public class Noninstance {
    private Noninstance() {
        throw new AssertionError();
    }
}
