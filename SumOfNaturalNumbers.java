public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 100; 
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }
}
