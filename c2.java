import java.util.*;
class c3{
public static void main(String args[]){
   
  int i,fact=1;
  System.out.println("Enter the No:-");
  Scanner sc=new Scanner(System.in);
   int no=sc.nextInt();
   for(i=1;i<=no;i++){
     fact=fact*i;
         }
    System.out.println("Factorial of "+no+" is: "+fact); 

}
}