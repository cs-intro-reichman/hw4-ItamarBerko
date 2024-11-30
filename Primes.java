public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[] primeArr = new boolean[N + 1];
        for (int i = 2; i < primeArr.length; i++)
            primeArr[i] = true;
        int i = 2;
        while (i < Math.sqrt(N)) {
            if (primeArr[i]) {
                int j = 2;
                while ((i * j) <= N) {
                    primeArr[i * j] = false;
                    j++;
                }
            }
            i++;
        }
        System.out.println("Prime numbers up to " + N + ":");
        int count = 0;
        for (int l = 2; l < primeArr.length; l++) {
            if (primeArr[l]) {
                System.out.println(l);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + N + " (" + (int)(((double)count/N) * 100) + "% are primes)");
    }
}