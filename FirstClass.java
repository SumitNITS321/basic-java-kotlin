import java.util.Arrays;
import java.util.Scanner;
public class FirstClass {
    public static void main(String[] args) {
        byte roll =32;//1
        int age = 21;//4 bytes
        float cgpa = 8.91f;//4
        char grade = 'A';//2
        String fname = "Sumit";//Non-Primitive type(has its own methods like lenght)
        String lname = new String("Sharma");//Strings are immutable in java
        String name2 = lname.replace('h','a');//Original String didn't change,new one created
        String name = fname + lname;
        long num = 7889806916L;//8
        boolean isValid = true;//1
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(grade);
        System.out.println(isValid);
        System.out.println(name);
        System.out.println(num);
        System.out.println(roll);
        System.out.println(name.length());
        System.out.println(name.substring(0,5));
        
        int[] marks = new int[3];//Arrays are also non-primitive
        marks[0] = 85;
        marks[1] = 85;
        marks[2] = 91;
        System.out.println(marks);//Will return a jargon of classname+hashcode
        System.out.println(marks.length);
        Arrays.sort(marks);
        String[] rmmates = {"Vishwajeet","Priyanshu","Priyapati","Nageshwar"};
        System.out.println(rmmates[0]);
        //Here,0 instead of garbage value if not initialised
        //Casting: Bucket & Glass
        //Implicit: Glass to Bucket;happens on its own,no problem
        //Explicit: Bucket to Glass;need to type cast explicitly
        float a=10f;
        float b=a+9.99f;
        System.out.println(b);
        int p=10;
        int q=p+(int)9.99;//values after decimal will be truncated and floor value will be returned
        System.out.println(q);
        final float PI = 3.14F;//Defining a constant,if u try reassigning it later, it will show an error
        System.out.println(Math.min(9,10));
        System.out.println(Math.random());//Returns a long value b/w 0&1
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name3 = sc.next();//Input tokens only,terminates at Whitespace
        System.out.println(name3);
        printJava();
        printName("Shanu");
        System.out.println(getSum(90,9));
        int myNum = (int)(Math.random()*100);
        Scanner sn = new Scanner(System.in);
        int usern;
        do{
            System.out.println("Guess b/w 1 to 100");
            usern = sn.nextInt();
            if(usern==myNum) {
                System.out.println("CORRECT!");
                break;
            }
            else if(usern>myNum) System.out.println("LARGE");
            else System.out.println("SMALL");
        }while(usern>=0);
    }    
    public static void printJava(){
        System.out.println("Hi,its Java!");
    } 
    public static void printName(String name) {
        System.out.println(name);
    }
    public static int getSum(int a,int b) {
        return a+b;        
    }
}
