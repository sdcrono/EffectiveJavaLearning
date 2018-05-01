package Chapter4;

public class Noninstance {
    private Noninstance() {
        throw new AssertionError();
    }
}
