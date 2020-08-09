import java.io.*;
import java.util.*;
import java.lang.*;
class Solution1
{

    public char findKthBit(int n,int k)
    {
        String s1 = "0"  ;   
        for(int i=2;i<=n;i++)
        {
            int m = s1.length();
            int temp=0;
            char[] c = new char[m];
            while(temp < m)
            {
                if(s1.charAt(temp) == '0')
                {
                    c[temp] = '1';
                    temp++;
                }
                else
                {
                    c[temp] = '0';
                    temp++;
                }
            }
            String st = new String(c);
            StringBuilder input = new StringBuilder();
            input.append(st);
            input =input.reverse(); 
            s1 = s1 + 1 + input;  
        }
        System.out.println(s1);
        /*char ch = '0';
        for(int i=0;i<n;i++)
        {
            if((k-1) == (i-1))
            {
                 ch = s1.charAt(i-1);
            }  
        }*/
        return s1.charAt(k-1);
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Solution1 st = new Solution1();
        char l = st.findKthBit(n,k);
        System.out.println(l);
    }
}