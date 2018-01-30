package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Permutation
{
    public static void main(String[] args)
    {
    	Utility utility=new Utility();
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        utility.permute(str, 0, n-1);
    }
    
}
