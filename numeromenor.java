import java.util.Scanner;


public class numeromenor {

	// TODO Auto-generated method stub
			static int menor(int a, int b)
			{
			     if (a<b){
			     System.out.print("El numero menor es: ");
			     
			     return a;
			     } else if (b<a) {
			     System.out.print("El numero menor es: ");
			     return b;
			     }else{
			     System.out.print("Los nuemros son Iguales");
			     return a;
			     }
			}      
		public static void main(String[] args) {
			Scanner mi_escaner= new Scanner (System.in);
			  System.out.print("Ingrese a: ");
			  int a1= mi_escaner.nextInt();
			  System.out.print("Ingrese b: ");
			  int b2= mi_escaner.nextInt();
			  System.out.print("el menor es: " + menor(a1,b2));
		}
		
	}


		
		

	
	


