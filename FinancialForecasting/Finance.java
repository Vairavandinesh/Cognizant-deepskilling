public class Finance {
    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) return principal;
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }
    public static double futureValueIterative(double principal, double rate, int years) {
        double amount = principal;
        for (int i = 0; i < years; i++) {
            amount *= (1 + rate);
        }
        return amount;
    }
    public static void main(String[] args) {
        double principal = 1000.0;  
        double rate = 0.05;         
        int years = 10;             
        double futureValueR = futureValueRecursive(principal, rate, years);
        System.out.printf("Recursive: Future value after %d years = %.2f%n", years, futureValueR);
        double futureValueI = futureValueIterative(principal, rate, years);
        System.out.printf("Iterative: Future value after %d years = %.2f%n", years, futureValueI);
    }
}
