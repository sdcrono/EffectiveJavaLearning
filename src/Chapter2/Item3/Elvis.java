package Chapter2.Item3;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {

    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {

    }

//    private Objects readResolve() {
//        return INSTANCE;
//    }

//    public enum Elvis() {
//        INSTANCE;
//        public void leaveTheBuilding() {
//
//        }
//    }

}
