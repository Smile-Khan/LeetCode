public class 592. Fraction Addition and Subtraction
{
    QUESTION LINK:
    https://leetcode.com/problems/fraction-addition-and-subtraction/?envType=daily-question&envId=2024-08-23    
}


class Solution {
    public String fractionAddition(String expression) {
        int nume = 0;  // Numerator
        int deno = 1;  // Denomerator

        int i = 0;
        int n = expression.length();

        while(i < n)
        {
            int currNume = 0;     // Current fraction numerator
            int currDeno = 0;     // Current fraction denominator

            boolean isNegative = (expression.charAt(i) == '-');

            // Skip '+' or '-'
            if(expression.charAt(i) == '+' || expression.charAt(i) == '-')
            {
                i++;
            }

            // Build the current numerator
            while(i < n && Character.isDigit(expression.charAt(i)))
            {
                int val = expression.charAt(i) - '0';
                currNume = (currNume * 10) + val;
                i++;
            }

            i++;      // Skip the division character '/'

            if(isNegative)
            {
                currNume *= -1;  // Apply negative sign if needed
            }

            // Build the current denominator
            while(i < n && Character.isDigit(expression.charAt(i)))
            {
                int val = expression.charAt(i) - '0';
                currDeno = (currDeno * 10) + val;
                i++;
            }

            // Update the accumalted numerator and denominator
            nume = nume * currDeno + currNume * deno;
            deno = deno * currDeno;
        }

        // Simplify the fraction using the greatest common divisor (GCD)
        int gcd = gcd(Math.abs(nume), deno);


        nume /= gcd;
        deno /= gcd;

        // Return the result in the form 'numerator/denominator'
        return nume + "/" + deno;
    }
    // Helper function to calculate the GCD using EUCLIDEAN Algorithm
    private int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
}