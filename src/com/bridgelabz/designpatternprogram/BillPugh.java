package com.bridgelabz.designpatternprogram;


public class BillPugh 
{

private BillPugh() 
{
 
}
private static class BillPughSingleton
{
 private static final BillPugh INSTANCE = new BillPugh();
}

public static BillPugh getInstance() 
{
 return BillPughSingleton.INSTANCE;
}
}