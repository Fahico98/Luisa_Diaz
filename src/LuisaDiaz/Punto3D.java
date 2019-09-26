
package LuisaDiaz;

public class Punto3D extends Punto{
   
   public Punto3D(int x, int y, int z) {
      this.setCoordenadas(new int[]{x, y, z});
   }
   
   @Override
   public void mostrarCoordenadas(){
      System.out.println("[" + this.devolverX() + ", " + this.devolverY() + ", " + this.devolverZ() + "]");
   }
   
   public int devolverZ() {
      return this.getCoordenadas()[2];
   }
   
   public void cambiarZ(int z) {
      this.setCoordenadas(new int[]{this.getCoordenadas()[0], this.getCoordenadas()[1], z});
   }
}
