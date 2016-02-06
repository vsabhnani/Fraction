
//@vsabhnani

import java.util.*;
import java.text.*;

public class Fraction1
{
   private int num;
   private int denom;

   public Fraction1 () 
   {
        num = 0;
        denom = 1;
   }

   public Fraction1 (int userNum, int userDenom) 
   {
        num = userNum;
        denom = userDenom;
   }
   
   public Fraction1 (int userNum)
   {
        num = userNum;
        denom = 1;
   }
   
   public Fraction1 (Fraction1 frac)
   {
       this.num = frac.num;
       this.denom = frac.denom;
   }
   
//    public Fraction getNumDenom()
//    {
//        return 
//    }
  
   
   public void setNumDenom(int numer, int denomin)
   {
       num = numer;
       denom = denomin;
   }
   
   public Fraction1 add (Fraction1 fra)
   {
        int newNum = ((fra.num * denom) + (num * fra.denom));
        int newDenom = denom * fra.denom;
        Fraction1 frac = new Fraction1 (newNum, newDenom);
        return frac.reduce();
   }

   public Fraction1 subtract (Fraction1 fra)
   {
        Fraction1 frac = new Fraction1(-fra.num,fra.denom);
        return add(frac);
   }

   public Fraction1 multiply (Fraction1 fra)
   {
        int newNum = num * fra.num;
        int newDenom = denom * fra.denom;
        Fraction1 frac = new Fraction1 (newNum, newDenom);
        return frac.reduce();
   }

   public Fraction1 divide (Fraction1 fra)
   {
        Fraction1 frac = new Fraction1(fra.denom, fra.num);
        return multiply(frac);
   }  

   public String toString()
   {
       if (this.num == 0 && this.denom != 0) 
       {
           String result = "0";
           return result;
       }
       
       else if (this.denom == 0)
       {
           String result = "UNDEFINED";
           return result;
       } 
       else if (this.denom == 1)
       {
           String result = "" + this.num;
           return result;
        }
       else
       {
           String result = this.num +"/" + this.denom;
           return result;
       }
   }
    
   public int gcd (int d1, int d2)
   {
        int factor = d2;
        while (d2 != 0)
        {
            factor = d2;
            d2 = d1 % d2;
            d1 = factor;
        }
        return d1;
   }
    
   private Fraction1 reduce()
   {
      Fraction1 result = new Fraction1();
      
      int common = 0;
      int numer = Math.abs(num);
      int denomin = Math.abs(denom);
      
      if (numer > denomin)
         common = gcd(numer, denomin);
         
      else if (num < denomin)
         common = gcd(denomin, numer);
         
      else  
         common = numer;
         
      result.num = num / common;
      result.denom = denom / common;
      return result;
   }

    
}