package language_fundamentals.integer_literals;

public class IntegerLiteralTypes {
    public static void main(String[] args) {

        for (String str : args) {
showLiterals(str);
        }
    }

    static void showLiterals(String str) {

        int value = Integer.parseInt(str);
        String octal = getLiteralNumber(value, 8);

        System.out.printf("Octal Number of %d is %s%n", value, octal);
        System.out.printf("%s = %d%n", octal, Integer.valueOf(octal, 8));

        String binary = getLiteralNumber(value, 2);

        System.out.printf("Binary Number of %d is %s%n", value, binary);
        System.out.printf("%s = %d%n", binary, Integer.valueOf(binary, 2));

        String hex = getLiteralNumber(value, 16);

        System.out.printf("Hex Number of %d is %s%n", value, hex);
        System.out.printf("%s = %d%n", hex, Integer.valueOf(hex, 16));
    }

    static String getLiteralNumber(int data, int format) {
        StringBuilder sb = new StringBuilder();

        while (data > 0) {
            int remain = data % format;
            sb.append(format == 16 ? getHex(remain) : remain);
            data /= format;
        }

        sb.reverse();
        // can't parse if prefix is included.
        // sb.insert(0, getPrefix(format));

        return sb.toString();
    }

    static String getHex(int value) {

        String[] values = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

        return values[value];
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
