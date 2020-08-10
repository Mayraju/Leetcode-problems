import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
    public String makeGood(String s) {
        
       int n = s.length();
        Stack<Character> c = new Stack<Character>();
        int top=-1;
        char p = 32;
        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            if(top == -1)
            {
                char ch = s.charAt(i);
                c.push(ch);
                top++;
            }
            else
            {
                char ch1 = c.peek();
                char ch2 = s.charAt(i);
                char ch3;
                if(Character.isUpperCase(ch2) == true)
                {
                    ch3 = (char)(ch2 + p);
                    if(ch1 == ch3)
                    {
                        flag = true;
                    }

                }
                else if(Character.isLowerCase(ch2))
                {
                    ch3 = (char)(ch2 - p);
                    if(ch1 == ch3)
                    {
                        flag = true;
                    }
                }

                if(top >= 0 && flag == true)
                {
                    if(i == n-1)
                    {
                        c.pop();
                        c.push(' ');
                    }
                    else
                    {
                        c.pop();
                        top--;
                    }
                }
                else
                {
                    if(top >= 0 )
                    {
                        ++top;
                        c.push(ch2);    
                                        }
                }
            }   
        }
        StringBuilder sd = new StringBuilder();
        for(Character ch : c)
        {
            sd.append(ch);
        }
        String st = sd.toString();
        st = st.trim();
        if(st == null)
        {
            String m = " ";
            return m;
        }
        return st;
    }      
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        //int s = sc.nextInt();
        //int l = sc.nextInt();
        String s = sc.next();
        Solution st1 = new Solution();
        String  k = st1.makeGood(s);
        System.out.println(k);
    }
}






