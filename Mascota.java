
package tpclase;


public class Mascota {
    String nombre;
    String raza;
    float peso; 
    boolean ladra;
    
    public Mascota(String nombre, String raza, float peso, boolean ladra){
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.ladra = ladra;
    }
    
    
    public static void main(String[] args) {
        Mascota mascota1;
        mascota1 = new Mascota("Bruna","Dobermann", (float) 36.5,true);
        
        Mascota mascota2;
        mascota2 = new Mascota("Cachola","Rottwailer", (float) 38.5,false);
        
        System.out.println("Mascota: " + mascota1.nombre +" " +"\nRaza: " + mascota1.raza + " "+ "\nPeso: " + mascota1.peso + " " + "\nLadra?:" + mascota1.ladra);
        System.out.println("\nMascota: " + mascota2.nombre +" " +"\nRaza: " + mascota2.raza + " "+ "\nPeso: " + mascota2.peso + " " + "\nLadra?: " + mascota2.ladra);
        
    }
    
}
