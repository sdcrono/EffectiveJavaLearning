public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Duke duke = new Duke.Builder(1, "Sword").height(170).build();
        System.out.println(duke);
    }
}
