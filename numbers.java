/*
Problem Statement 1] : Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 
4554 are palindromes because they remain the same when their digits are reversed. 

public class numbers {

    static boolean palindrome(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
        
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        if (dup == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 4554;

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

Time Complexity: O(log10N + 1) where N is the input number. The time complexity is determined by the number of digits in the input 
integer N.
In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.

In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.
Space Complexity: O(1) as only a constant amount of additional memory for the reversed number regardless of size of the input number.

*/

//....................................................................................................................................

/*
Problem Statement 2]: Check if the given year is a leap year or not.

Examples:

Example 1:
Input: 1996
Output: Yes
Explanation: Since 1996 is a leap year answer is “Yes”.

import java.util.*;
class numbers{
static boolean yyear(int year)
{
    if(year % 400 == 0) // or (year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)			
    return true;
    if(year % 100 == 0)
    return false;
    if(year % 4 == 0)
    return true;
    return false;
}
public static void main(String args[])
{
    int year=1996;
    if(yyear(year)==true)
    System.out.println("Yes");
    else
    System.out.println("No");
}
}
 
*/

//....................................................................................................................................

/*
Problem Statement 3]: Given a number N, print the smallest and largest digits present in the number.
Example 1:
Input: N = 2746
Output: Largest digit: 7
        Smallest digit: 2
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.

import java.io.*;
class numbers
{
static private void MinMax(int n)
{
	int d;
	int mini = Integer.MAX_VALUE;
	int maxi = Integer.MIN_VALUE;
	while (n != 0)
	{
		d = n % 10;
		mini = Math.min(mini,d);
		maxi = Math.max(maxi,d);
		n = n / 10;
	}

	System.out.println("The minimum number is: "+mini);
	System.out.print("The maximum number is: "+maxi);
}
public static void main(String[] args)
{
	int n = 4726;
	MinMax(n);
}
}
 */

//....................................................................................................................................

/*
Problem Statement 4]: Given an integer N. Print the Fibonacci series up to the Nth term.
Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

public class numbers {
  public static void main(String args[]) {
    int n = 5;
    if (n == 0) {
      System.out.println(0);
    } else {
      int fib[] = new int[n + 1];
      fib[0] = 0;
      fib[1] = 1;
      for (int i = 2; i <= n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
      }
      System.out.println("The Fibonacci Series up to "+n+"th term:");
      for (int i = 0; i <= n; i++) {
        System.out.print(fib[i] + " ");
      }
    }
  }
}
 */

//....................................................................................................................................

/*
Problem Statement 5]: Given an integer N, print all of its prime factors.
Example 1:
Input: N=60
Output: 2, 3, 5
Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.

import java.util.*;

public class numbers {
    public static void main(String[] args) {
        int N = 60;  // Example input
        List<Integer> primeFactors = findPrimeFactors(N);

        // Print the prime factors
        for (int factor : primeFactors) {
            System.out.print(factor + " ");
        }
    }

    // Function to find prime factors of a number
    public static List<Integer> findPrimeFactors(int N) {
        List<Integer> primeFactors = new ArrayList<>();

        // Step 1: Handle the factor 2
        if (N % 2 == 0) {
            primeFactors.add(2);
            while (N % 2 == 0) {
                N /= 2;
            }
        }

        // Step 2: Handle odd factors from 3 up to sqrt(N)
        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) {
                primeFactors.add(i);
                while (N % i == 0) {
                    N /= i;
                }
            }
        }

        // Step 3: If N is still greater than 2, it's a prime factor
        if (N > 2) {
            primeFactors.add(N);
        }

        return primeFactors;
    }
}

This solution is efficient with a time complexity of approximately O(√N) due to reducing the number of divisions significantly.

 */

//....................................................................................................................................

/*
Problem Statement 6]: Given two integers N1 and N2, find their greatest common divisor.
The Greatest Common Divisor of any two integers is the largest number that divides both integers.
For example, the GCD of 12 and 18 is 6, because 6 is the largest number that divides both 12 and 18.
The Euclidean Algorithm is an efficient way to compute the GCD. It works by repeatedly replacing the larger 
number by the remainder when dividing the larger number by the smaller number, until one of the numbers becomes zero. 
At that point, the other number is the GCD.

Euclidean Algorithm Steps:
If N2 == 0, then N1 is the GCD.
Otherwise, replace N1 with N2 and N2 with N1 % N2, and repeat the process.

public class numbers {
    public static void main(String[] args) {
        int N1 = 60;  // Example input
        int N2 = 48;  // Example input
        int result = findGCD(N1, N2);

        // Print the GCD
        System.out.println("The GCD of " + N1 + " and " + N2 + " is: " + result);
    }

    // Function to calculate GCD using Euclidean Algorithm
    public static int findGCD(int N1, int N2) {
        while (N2 != 0) {
            int remainder = N1 % N2;
            N1 = N2;
            N2 = remainder;
        }
        return N1;
    }
}
//Ans = 12
 */

//....................................................................................................................................

/*Problem Statement 7]: Find lcm of two numbers.
Example 1:
Input: num1 = 4,num2 = 8
Output: 8 

//formula :
LCM(N1,N2)= 
N1×N2/GCD(N1,N2)


public class numbers {
    public static void main(String[] args) {
        int N1 = 4;  // Example input
        int N2 = 8;  // Example input

        // Find GCD using Euclidean algorithm
        int gcd = findGCD(N1, N2);

        // Calculate LCM using the formula: LCM = (N1 * N2) / GCD
        int lcm = (N1 * N2) / gcd;

        // Print the LCM
        System.out.println("The LCM of " + N1 + " and " + N2 + " is: " + lcm);
    }

    // Function to calculate GCD using Euclidean Algorithm
    public static int findGCD(int N1, int N2) {
        while (N2 != 0) {
            int remainder = N1 % N2;
            N1 = N2;
            N2 = remainder;
        }
        return N1;
    }
}
*/ 

//....................................................................................................................................

/*
Problem Statement 8]: Adding two fractional numbers.
Example 1:
Input: 3/4 + 1/7 
Output: 25/28
Explanation: Since 3/4 + 1/7 = 25/28

Steps to Add Fractions:
Let the fractions be a/b and c/d. The LCM of b and d will be the denominator of the result.
Adjust the numerators:
New numerator = (LCM/𝑏×𝑎)+(LCM/𝑑×𝑐)
Simplify the result.

public class numbers {
    public static void main(String[] args) {
        int numerator1 = 3, denominator1 = 4;  // First fraction: 3/4
        int numerator2 = 1, denominator2 = 7;  // Second fraction: 1/7
        
        // Find LCM of the two denominators
        int lcm = findLCM(denominator1, denominator2);
        
        // Adjust numerators according to the new denominator
        int adjustedNumerator1 = numerator1 * (lcm / denominator1);
        int adjustedNumerator2 = numerator2 * (lcm / denominator2);
        
        // Add the numerators
        int resultNumerator = adjustedNumerator1 + adjustedNumerator2;
        
        // Result is resultNumerator / lcm. Now, simplify the fraction.
        int gcd = findGCD(resultNumerator, lcm);
        resultNumerator /= gcd;
        int resultDenominator = lcm / gcd;
        
        // Print the result
        System.out.println("The sum of fractions is: " + resultNumerator + "/" + resultDenominator);
    }

    // Function to find GCD using Euclidean Algorithm
    public static int findGCD(int N1, int N2) {
        while (N2 != 0) {
            int remainder = N1 % N2;
            N1 = N2;
            N2 = remainder;
        }
        return N1;
    }

    // Function to find LCM using the relation between GCD and LCM
    public static int findLCM(int N1, int N2) {
        return (N1 * N2) / findGCD(N1, N2);
    }
}
 */

//....................................................................................................................................

/*
Problem Statement 9]: You are given an integer. Your task is to replace all the zeros in the integer with ones.
Example 1:
Input: N = 102003
Output: 112113
Explanation: The 2nd,4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

public class numbers{
   static int replaceZerosWithOnes(int num) {
      if (num == 0) {
         return 1;
      }
      int ans = 0, tmp = 1;
      while (num > 0) {
         int d = num % 10;
         if (d == 0) {
            d = 1;
         }
         ans = d * tmp + ans;
         num = num / 10;
         tmp = tmp * 10;
      }
      return ans;
   }

   public static void main(String[] args) {

      int n = 204;
      int result = replaceZerosWithOnes(n);
      System.out.println("After replacing zeros with ones " + n + " becomes " + result);
   }
}  
*/

//....................................................................................................................................

/*
Problem 10]: Given a number n, express the number as a sum of 2 prime numbers.
Example 1:
Input : N = 74
Output : True . 
Explanation: 74 can be expressed as 71 + 3 and both are prime numbers.

import java.util.*;

public class numbers {

       static boolean prime(int n) {

              if (n <= 1)
                     return false;

              for (int i = 2; i * i <= n; i++) {
                     if (n % i == 0) {
                            return false;
                     }
              }

              return true;
       }

       static boolean isPrime(int n) {

              if (prime(n) && prime(n - 2)) {
                     return true;
              } else {
                     return false;
              }
       }

       public static void main(String[] args) {

              int n = 19;

              if (isPrime(n)) {
                     System.out.println("Yes");
              } else if (isPrime(n)) {
                     System.out.println("No");
              }
       }
}

 */

//....................................................................................................................................


