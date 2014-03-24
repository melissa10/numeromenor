import java.util.Scanner;


public class numeromenor {

	// TODO Auto-generated method stub
			static int menor(int a1, int b2)
			{
			     if (a1<b2){
			     System.out.print("El numero menor es: ");
			     
			     return a1;
			     } else if (b2<a1) {
			     System.out.print("El numero menor es: ");
			     return b2;
			     }else{
			     System.out.print("Los numeros son Iguales");
			     return 0;
			     }
			}      
		public static void main(String[] args) {
			Scanner mi_escaner= new Scanner (System.in);
			  System.out.print("Ingrese el primer numero: ");
			  int a1= mi_escaner.nextInt();
			  System.out.print("Ingrese el segundo numero: ");
			  int b2= mi_escaner.nextInt();
			  System.out.print(menor(a1,b2));
		}
		
	}


		
		

	
	


