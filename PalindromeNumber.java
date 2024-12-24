public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();

        // Примеры
        System.out.println("Число: 121 -> Вывод: " + solution.isPalindrome(121)); 
        System.out.println("Число: -121 -> Вывод: " + solution.isPalindrome(-121)); 
        System.out.println("Число: 10 -> Вывод: " + solution.isPalindrome(10)); 
    }
}
