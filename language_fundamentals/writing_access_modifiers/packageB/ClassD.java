package language_fundamentals.writing_access_modifiers.packageB;

import language_fundamentals.writing_access_modifiers.packageA.ClassA;

public class ClassD {

    private ClassA $a;

    public ClassD() {
        $a = new ClassA();

        $a.publicMethod();
        // $a.defaultMethod();
        // $a.protectedMethod();
        // $a.privateMethod();
    }
}
