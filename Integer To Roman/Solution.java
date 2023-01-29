class Solution {
    public String intToRoman(int num) 
        {
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String f = "";
        String g = "";

        if(num / 1000 > 0)
        {   
            int thou = num / 1000;
            num -= (thou * 1000);

            a = "M".repeat(thou);
        }
        if(num / 500 > 0)
        {
            if (num / 900 == 1)
            {
                num -= 900;
                b = "CM";
            }

            else
            {
                num -= 500;
                b = "D";
            }           
        }

        if(num / 100 > 0)
        {
            int hound = num / 100;
            num -= (hound*100);

            if (hound == 4)
            {
                c = "CD";
            }
            else
            {
                c = "C".repeat(hound);
            }

        }
        if (num / 50 > 0)
        {
            if(num / 90 == 1)
            {
                num -= 90;
                d = "XC";
            }
            else
            {
                num -= 50;
                d = "L";
            }

        }
        if (num / 10 > 0)
        {
            int ten = num / 10;
            num -=(ten*10);

            if (ten == 4)
            {
                e = "XL";
            }
            else
            {
                e = "X".repeat(ten);
            }

        }
        if (num / 5 > 0)
        {
            if(num / 9 == 1)
            {
                num-= 9;
                f = "IX";
            }
            else
            {
                num -= 5;
                f = "V";
            }

        }
        if(num / 1 > 0)
        {
            int one = num / 1;
            num -= one;

            if (one == 4)
            {
                g = "IV";
            }
            else
            {
                g = "I".repeat(one);
            }
        }
            
        String roman = a+b+c+d+e+f+g;
        return roman;

    }
}
