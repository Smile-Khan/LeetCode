package Array;

public class 264. Ugly Number II {
 
    QUESTION LINK

    https://leetcode.com/problems/ugly-number-ii/?envType=daily-question&envId=2024-08-18

}

--------------------------JAVA--------------------------

class Solution {
    public int nthUglyNumber(int n) {
        int[] t = new int[n + 1];
        // t[i] = ith ugly number;
        // we will return t[n] = nth ugly number

        t[1] = 1;  // 1st ugly number

        int i2 = 1;  // i2th Ugly Number
        int i3 = 1;  // i3rd Ugly Number
        int i5 = 1;  // i5th Ugly Number

        for(int i = 2; i <= n; i++)
        {
            int i2th_Ugly = t[i2] * 2;
            int i3rd_Ugly = t[i3] * 3;
            int i5th_Ugly = t[i5] * 5;

            t[i] = Math.min(Math.min(i2th_Ugly, i3rd_Ugly), i5th_Ugly);

            if(t[i] == i2th_Ugly)
            {
                i2++;
            }
            
            if(t[i] == i3rd_Ugly)
            {
                i3++;
            }

            if(t[i] == i5th_Ugly)
            {
                i5++;
            }
        }
        return t[n];
    }
}


-------------------PYTHON---------------------

class Solution:
    def nthUglyNumber(self, n: int) -> int:
        t = [0] * (n + 1)
        t[1] = 1  # 1st ugly number

        i2 = i3 = i5 = 1

        for i in range(2, n + 1):
            i2th_Ugly = t[i2] * 2
            i3rd_Ugly = t[i3] * 3
            i5th_Ugly = t[i5] * 5

            t[i] = min(i2th_Ugly, i3rd_Ugly, i5th_Ugly)

            if t[i] == i2th_Ugly:
                i2 += 1
            if t[i] == i3rd_Ugly:
                i3 += 1
            if t[i] == i5th_Ugly:
                i5 += 1

        return t[n]

