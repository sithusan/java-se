package language_fundamentals.generics;

public class ArrayTest {
    public static void main(String[] args) {
        BaseArray<String> stringArray = new UnlimitedArray<>();
        stringArray.add("Hello Java");
        stringArray.add("Mingalar Par");

        System.out.println(stringArray.get(0));
        System.out.println(stringArray.get(1));

        BaseArray<Integer> integerArray = new UnlimitedArray<>();
        integerArray.add(1000);
        integerArray.add(2000);

        System.out.println(integerArray.get(0));
        System.out.println(integerArray.get(1));
    }
}
