
import java.util.Scanner;

public class EjemploGit {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
Scanner teclado = new Scanner(System.in);
boolean salir = false;
do {
System.out.println("--- MENU DE OPCIONES ---");
System.out.println("1. Cambio de unidades de horas a segundos.");
System.out.println("2. Cambio de unidades de kilómetros a metros.");

System.out.println("4. Salir");
System.out.println("Escribe una de las opciones");
int opcion = teclado.nextInt();
switch (opcion) {
case 1:
System.out.println("Introduce las horas a cambiar: ");
int horas = teclado.nextInt();
int s = horas * 3600;
System.out.println(horas + " horas son " + s + " segundos.");
break;
case 2:
System.out.println("Introduce los kilometros a cambiar");
int km = teclado.nextInt();
int m = km * 1000;
System.out.println(km + " km son " + m + " metros.");
break;

case 4:
salir = true;
break;
default:
System.out.println("Solo números entre 1 y 4");

}
}
while(salir==false);

    }
}