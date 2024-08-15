package Array;

public class 860. Lemonade Change {
    
    QUESTION :-

    https://leetcode.com/problems/lemonade-change/description/?envType=daily-question&envId=2024-08-15

}

--------------------JAVA---------------------

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int bill : bills)
        {
            if(bill == 5)
            {
                five++;
            }
            else if(bill == 10) // return 5$ to customer
            {
                if(five >= 0)
                {
                five--;
                ten++;
                }
                else 
                {
                    return false;
                }
            }
            else if(five > 0 && ten > 0) // return 15$ to customer
            {
                five--;
                ten--;
            }
            else if(five >= 3) // $5, $5, $5
            {
                five -= 3;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}


-------------------------PYTHON------------------------

class Solution:
    def lemonadeChange(self, bills):
        five, ten = 0, 0
        
        for bill in bills:
            if bill == 5:
                five += 1
            elif bill == 10:
                if five == 0:
                    return False
                five -= 1
                ten += 1
            else:
                if ten > 0 and five > 0:
                    ten -= 1
                    five -= 1
                elif five >= 3:
                    five -= 3
                else:
                    return False
        return True
