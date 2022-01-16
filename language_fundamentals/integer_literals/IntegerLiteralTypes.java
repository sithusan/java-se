package language_fundamentals.integer_literals;

public class IntegerLiteralTypes {
    public static void main(String[] args) {
        String octal = getLiteralNumber(267, 8);

        System.out.printf("Octal Number of %d is %s%n", 267, octal);
        System.out.printf("%s = %d%n", octal, Integer.valueOf(octal, 8));

        String binary = getLiteralNumber(267, 2);

        System.out.printf("Binary Number of %d is %s%n", 267, binary);
        System.out.printf("%s = %d%n", binary, Integer.valueOf(binary, 2));
    }

    static String getLiteralNumber(int data, int format) {
        StringBuilder sb = new StringBuilder();

        while (data > 0) {
            sb.append(data % format);
            data /= format;
        }

        sb.reverse();
        sb.insert(0, getPrefix(format));

        return sb.toString();
    }

    static String getPrefix(int format) {

        String prefix = null;

        switch (format) {
            // prefix should be 0b for binary. But not needed here.
            case 2:
                prefix = "";
                break;
            case 8:
                prefix = "0";
                break;
            case 16:
                prefix = "0x";
                break;
            default:
                break;

        }
        return prefix;
    }
}
