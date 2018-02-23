package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Permutation
{
    public static void main(String[] args)
    {
    	Utility utility=new Utility();
        String str = "ABCD";
        int n = str.length();
        utility.permute(str, 0, n-1);
    }
    
}
