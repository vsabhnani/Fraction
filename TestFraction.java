
//@vsabhnani

public class TestFraction
{
    public static void main(String[] args)

    {       
        Fraction1 f1 = new Fraction1();
        Fraction1 f2 = new Fraction1(1,2);
        Fraction1 f3 = new Fraction1(3,4);
        Fraction1 f4 = new Fraction1(4);
        
        
        System.out.println(f2 + " + " + f3 + " = " + f2.add(f3));
        System.out.println(f2 + " - " + f3 + " = " + f2.subtract(f3));
        System.out.println(f2 + " x " + f3 + " = " + f2.multiply(f3));
        System.out.println(f2 + " / " + f3 + " = " + f2.divide(f3));
        
        System.out.println();
        
        System.out.println(f1 + " + " + f3 + " = " + f1.add(f3));
        System.out.println(f1 + " - " + f3 + " = " + f1.subtract(f3));
        System.out.println(f1 + " x " + f3 + " = " + f1.multiply(f3));
        System.out.println(f1 + " / " + f3 + " = " + f1.divide(f3));
        
        f1.setNumDenom(3,0);
        
        System.out.println();
        
        System.out.println(f1 + " + " + f3 + " = " + f1.add(f3));
        System.out.println(f1 + " - " + f3 + " = " + f1.subtract(f3));
        System.out.println(f1 + " x " + f3 + " = " + f1.multiply(f3));
        System.out.println(f1 + " / " + f3 + " = " + f1.divide(f3));
        
        System.out.println();
        
        System.out.println(f4 + " + " + f3 + " = " + f4.add(f3));
        System.out.println(f4 + " - " + f3 + " = " + f4.subtract(f3));
        System.out.println(f4 + " x " + f3 + " = " + f4.multiply(f3));
        System.out.println(f4 + " / " + f3 + " = " + f4.divide(f3));
        
        

    }


}