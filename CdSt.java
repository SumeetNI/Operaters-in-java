/* 
import java.util.*;
public class CdSt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("Adult");
        }
        else if ((age>=12)&&(age<18)) {
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
    }
}
*/

/* 
import java.util.*;

public class CdSt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is :" + a + " big");
        } else {
            System.out.println("b is :" + b + " big");
        }

    }
}
*/


/* 
import java.util.*;

public class CdSt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println("a is : " + a + " big");
        } else if ((b > c)) {
            System.out.println("b is :" + b + " big");
        } else {
            System.out.println("c is : " + c + " big");
        }
    }
}
*/



/* 
import java.util.*;
public class CdSt {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("n is Even num : "+n);
        }else{
            System.out.println("n is odd num :"+n);
        }
    }
}
*/    

/* 
public class CdSt {

    public static void main(String[] args) {
        int a = (4>2)?4:2;
        System.out.println(a);
    }
}
*/

/* 
public class CdSt {

    public static void main(String[] args) {
        String a = (4%2==0)?"Even":"Odd";
        System.out.println(a);
    }
}
*/

/* 
public class CdSt {

    public static void main(String[] args) {
        int marks = 45;
        String a = (marks>=34)?"Pass":"Fail";
        System.out.println(a);
    }
}
    
*/

/* 
import java.util.*;
public class CdSt {

     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op= sc.next().charAt(0);
        switch (op) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
         
            default:System.out.println("invalid input");
                break;
        }
     }
}
*/


