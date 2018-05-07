package Chapter2.Item2;

public class Duke {
    private final int form;
    private final String weapon;
    private final int weight;
    private final int height;

    public static class Builder {
        private final int form;
        private final String weapon;

        private int weight = 60;
        private int height = 150;

        public Builder(int form, String weapon) {
            this.form = form;
            this.weapon = weapon;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Duke build() {
            return new Duke(this);
        }
    }

    private Duke(Builder builder) {
        form = builder.form;
        weapon = builder.weapon;
        weight = builder.weight;
        height = builder.height;
    }

    public int getForm() {
        return form;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

}
