package Homework_week1;

//    5. Display all the prime numbers lower than a given number

class PrimeNumbers {
    static void Primes(int maxCheck) {
        int i;
        boolean isPrime;

        String primeNumbersFound = "";

        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
//        return primeNumbersFound;
    }

    private static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheck is not prime and break loop. Else continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
