package language_fundamentals.writing_access_modifiers.packageB;

import language_fundamentals.writing_access_modifiers.packageA.ClassA;

public class ClassC extends ClassA {

    public ClassC() {

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

    }
}
