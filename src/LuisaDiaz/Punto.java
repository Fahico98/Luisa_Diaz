
package LuisaDiaz;

public class Punto{
   
   private int[] coordenadas;
   
   public Punto(int x, int y){
      this.coordenadas = new int[]{x, y};
   }
   
   public Punto(){};
   
   public void mostrarCoordenadas(){
      System.out.println("[" + this.coordenadas[0] + ", " + this.coordenadas[1] + "]");
   }
   
   public int devolverX() {
      return this.coordenadas[0];
   }
   
   public void cambiarX(int x) {
      this.coordenadas[0] = x;
   }
   
   public int devolverY() {
      return this.coordenadas[1];
   }
   
   public void cambiarY(int y) {
      this.coordenadas[1] = y;
   }
   
   public int[] getCoordenadas(){
      return this.coordenadas;
   }
   
   public void setCoordenadas(int[] nuevasCoordenadas){
      this.coordenadas = nuevasCoordenadas;
   }
}
