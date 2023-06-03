public class IntegerToRoman {

    int[] numbers = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    String[] s = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String romanToInt(int num) {
        if (num < 1 || num > 3999) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            while (num >= numbers[i]) {
                num -= numbers[i];
                sb.append(s[i]);
            }
        }
        return sb.toString();
    }
}


