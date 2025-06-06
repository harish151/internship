import java.util.Scanner;

class Swap{
    public void calculate(Scanner sc){
        System.out.println("You choose Swap of two Numbers =>");
        System.out.println("enter first num:");
        int a = sc.nextInt();
        System.out.println("enter second num:");
        int b = sc.nextInt();
        System.out.println("Before swap of two numbers: "+a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swap of two numbers: "+a+" "+b);
    }
}

class TrinagelPattern{
    public void calculate(Scanner sc){
        System.out.println("You choose Triangle Pattern =>");
        System.out.println("enter number:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" ".repeat(n-i-1));
            System.out.print(" *".repeat(i));
            System.out.println("");
        }
        }
}

class AreaOfTriangle{
    public double calculate(Scanner sc){
        System.out.println("You choose Calculate Area of Triangle =>");
        System.out.println("enter Base of a triangle(cm):");
        double base = sc.nextInt();
        System.out.println("enter height of a triangle(cm):");
        double height = sc.nextInt();
        double result = 0.5*base*height;
        return result;
    }
}

class ReverseOfString {
    public void calculate(Scanner sc){
        System.out.println("You choose Reverse of a String =>");
        System.out.print("enter a String: ");
        String str = sc.next();
        int len = str.length();
        System.out.print("Reversed String: ");
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(len-i-1));
        }
    }   
}

class PrimeOrNot{
    public void calculate(Scanner sc){
        System.out.println("You choose Prime Or Not =>");
        System.out.print("enter number:");
        int n = sc.nextInt();
        if(n==2 || n==3){
            System.out.println(n+" is a prime number");
        }
        else{
            boolean bool = false;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    bool=true;
                    break;
                }
            }
            if(!bool){
                System.out.println(n+" is prime number");
            }
            else{
                System.out.println(n+" is not prime number");
            }
    }
    }
}

public class Sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Swap swap = new Swap();
        TrinagelPattern tp = new TrinagelPattern();
        AreaOfTriangle aot = new AreaOfTriangle();
        ReverseOfString ros = new ReverseOfString();
        PrimeOrNot pon = new PrimeOrNot();
        System.out.println("1.swap\n2.triangle pattern\n3.Area of Triangle\n4.Reverse of String\n5.Prime or Not");
        System.out.print("enter n:");
        int n = sc.nextInt();
        switch(n){
            case 1:swap.calculate(sc);break;
            case 2:tp.calculate(sc);break;
            case 3:double r = aot.calculate(sc);System.out.println(r+"cm^2");break;
            case 4:ros.calculate(sc);break;
            case 5:pon.calculate(sc);break;
            default:System.out.println("enter valid number.");

            
        }
        
    }
}