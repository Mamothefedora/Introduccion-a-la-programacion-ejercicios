public class main{
    public static void main(String[] args){
        persona persona = new persona();
        persona.setNombre("Roberto");
        System.out.println("Nombre: " + persona.getNombre());
        persona.setEdad(48);
        System.out.println("Edad: " + persona.getEdad());
        persona.setNumero(1056874390);
        System.out.println("Numero: " + persona.getNumero());
    }
}
public class persona{
    private String nombre;
    private int edad;
    private int numero;
    public persona(){
        System.out.println("Datos del individuo: ");
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }    
    public String getNombre(){
    return this.nombre;
    }
    public void setEdad(int edad){
    this.edad = edad;
    }    
    public int getEdad(){
    return this.edad;
    }
    public void setNumero(int numero){
    this.numero= numero;
    }    
    public int getNumero(){
    return this.numero;
    }
}