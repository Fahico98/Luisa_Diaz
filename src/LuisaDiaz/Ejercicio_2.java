
package LuisaDiaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_2 {
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese el nombre del robot: ");
      String nombre = br.readLine();
      System.out.println("\nAcontinuacion ingrese los valores de las coordenadas del punto inicial del robot...");
      Robot robot;
      System.out.print("x: ");
      int x = Integer.parseInt(br.readLine());
      System.out.print("y: ");
      int y = Integer.parseInt(br.readLine());
      Punto3D partida = new Punto3D(x, y, 0);
      robot = new Robot(partida, nombre);
      System.out.println(
         "\nPara dejar de mover a " + robot.getNombre() + " ingrese la palabra 'parar'.\n" +
         "Para moverlo ingrese 'mover' seguido de dos numeros separados por espacio. Tembie pude ingresar la\n" +
         "palabra 'mover' seguida de la distancia y la direccion a la que quiere que se mueva (adelante, atras,\n" +
         "izquierda o derecha). Si solo ingresa la palabra 'mover' el robot se movera a un punto aleatorio."
      );
      while(true){
         System.out.println("");
         String[] input = br.readLine().split(" ");
         if(input[0].compareTo("mover") == 0){
            if(input.length == 1){
               robot.mover();
               System.out.println(
                  "Posicion del robot: " + robot.devolverUbicacion()
               );
            }else if(input.length == 3){
               if(isNumeric(input[2])){
                  x = Integer.parseInt(input[1]);
                  y = Integer.parseInt(input[2]);
                  robot.mover(x, y);
               }else{
                  int d = Integer.parseInt(input[1]);
                  robot.mover(d, input[2]);
               }
               System.out.println(
                  "Posicion del robot: " + robot.devolverUbicacion()
               );
            }else{
               System.out.println("Entrada erronea. Por favor intentelo de nuevo...\n");
               continue;
            }
         }else if(input[0].compareTo("parar") == 0){
            break;
         }else{
            System.out.println("Entrada erronea. Por favor intentelo de nuevo...\n");
            continue;
         }
      }
   }
   
   public static boolean isNumeric(String str) {
      try {
         int i = Integer.parseInt(str);
      }catch(NumberFormatException | NullPointerException nfe) {
         return false;
      }
      return true;
   }
}
