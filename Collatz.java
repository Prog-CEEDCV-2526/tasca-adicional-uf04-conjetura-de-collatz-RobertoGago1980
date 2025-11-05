import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in) ;

        int nUsuario;
        
        
        while (true) {
            System.out.print("Introduce un numero entero positivo: ");
            if( entrada.hasNextInt()) {
                nUsuario = entrada.nextInt();
                if ( nUsuario > 0) {
                    break;
                    
                } else {
                    System.out.println("Numero introducido no valido");
                    entrada.next();
                }
            } 
        }  

        int primerNumero = nUsuario; 
        System.out.println("\n Secuencia de Collatz para el numero: "+ primerNumero);

        int contadorPasos = 0;
        System.out.print(primerNumero);
        
        while (primerNumero != 1) {
            if(primerNumero % 2 == 0) {
                primerNumero = primerNumero/2;
            
                }else {
                    primerNumero = (primerNumero * 3) + 1;
                }
            System.out.print(" - " + primerNumero);
            contadorPasos++;
        }

        System.out.println("\nNumero total de pasos realizados: "+ contadorPasos);
         
        
        entrada.close(); 
    }
}
    

    

