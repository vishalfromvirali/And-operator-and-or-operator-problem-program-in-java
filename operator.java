import java.util.*;
class operator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the ruppes 1");
        int ruppees1 =scanner.nextInt();
        System.out.println("enter the ruppes 2");
        int ruppees2 = scanner.nextInt();
        if(ruppees1==100||ruppees2==500){
            System.out.println("i give a change");
        }
        else{
            System.out.println("rupees i are  change");
        }
        if(ruppees2 ==10 &&ruppees2 ==20){
            System.out.println("i give single note");
        }
        else{
            System.out.println("rupees2 are notes");
        }

        
    }
}