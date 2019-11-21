import java.util.Scanner;
import java.util.Random;
public class Wabbit {
	public static void main(String[] args) {
String[] arr= new String[10];
	  int guess,rabbit;
	  Scanner sc=new Scanner(System.in);
	Random r= new Random();
	  for(int i=0;i<10;i++)
	arr[i]="|";
	  rabbit=r.nextInt(10);
	System.out.println("Find the Rabbit!");
	  do{
	print(arr);
System.out.print("Pick a hole (0-9): ");
	guess=sc.nextInt();
	  if(guess!=rabbit){
	arr[guess]="|X|"; 
	  }
else{
	arr[guess]="|R|";
	print(arr);
	win();
	break;
	}
	}while(true);
	}
private static void print(String[] arr) {
	  System.out.println();
	for(int i=0;i<10;i++)
	System.out.print(arr[i]+" ");
	  
	System.out.print("\n");
	}
private static void win() {
	  
	System.out.println("You found the rabbit!\n");
	  
	}
	  
	}

