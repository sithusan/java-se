public class WritingConstructors {

    String type;
    String model;

    WritingConstructors(String type, String model) {
        this.type = type;
        this.model = model;
    }

    WritingConstructors(String str, Boolean isType) {
        if (isType) {
            this.type = str;
        } else {
            this.model = str;
        }
    }

    WritingConstructors() {

    }

    void showInfo() {
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
    }
}
