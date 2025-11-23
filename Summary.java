import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++);
        System.out.println(++a);

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age=obj1.nextInt();
        System.out.println(age);

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Input your cgpa: ");
        float cgpa = obj2.nextFloat();
        System.out.println(cgpa);

        Scanner obj3 = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = obj3.nextLine();
        System.out.println(name);

        char grade = 'A';
        switch(grade){
            case 'A':
            System.out.println("Good");
            break;
            case 'B':
            System.out.println("Not good");
            break;
            default:
            System.out.println("Invalid Grade");
        }

        int arr[] = new int[10];
        try{
           System.out.println(arr[11]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }
        try{
            System.out.println(1/0);
         }
         catch(Exception e){
             System.out.println(e.getLocalizedMessage());
         }

        int marks[] = {85,85,63,81,72,91};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println(sum(21,78));
    }
    static int sum(int a,int b){
        return a+b;
    }
}
//Control Structures same as C/C++