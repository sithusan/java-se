package language_fundamentals.writing_access_modifiers.packageA;

public class ClassB {

    private ClassA a;

    public ClassB() {
        a = new ClassA();

        a.publicMethod();
        a.defaultMethod();
        a.protectedMethod();
        // a.privateMethod();
    }
}
