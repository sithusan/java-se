package language_fundamentals.enumerations;

public enum Course implements FeesShowable {

    JavaSE("Java SE", 15) {
        @Override
        public void showFee() {
            System.out.println("Java SE fee: " + this.getFee());
        }
    },
    JavaEE("Java EE", 20) {
        @Override
        public void showFee() {
            System.out.println("Java EE fee" + this.getFee());
        }
    },

    Spring("Spring Framework", 25) {
        @Override
        public void showFee() {
            System.out.println("Spring Framework fee " + this.getFee());
        }
    };

    private String name;
    private int fee;

    Course(String name, int fee) {
        this.name = name;
        this.fee = fee;
    }

    public abstract void showFee();

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void showFeesWithFormat() {
        System.out.format("%s fees is %d MMK %n", this.name, this.fee);
    }

    public int getFee() {
        return this.fee;
    }

}
