import java.util.*;

class Bill {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter price ");
    int price =sc.nextInt();
    System.out.println("Enter 1 if membership present else 0");
int membership = sc.nextInt();
    if(price >=1000){
        if(membership==1){
            System.out.println("Discount is : " + ((price*25)/100));
        }else{
            System.out.println("Discount is : "+(price*20)/100);
        }
    }else if(price >=500 && price<=999){
        if(membership==1){
            System.out.println("Discount is : "+(price*15)/100);
        }else{
        System.out.println("Discount is : "+(price*10)/100);
    }
    }else{
        if(membership==1){
System.out.println("Discount is : "+(price*10)/100);
        }else{
        System.out.println("Discount is : "+(price*5)/100);
    }
    }
}
}