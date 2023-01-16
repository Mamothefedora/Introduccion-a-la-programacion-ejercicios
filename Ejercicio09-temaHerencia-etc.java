public class main{
    public static void main(String[] args){
        cliente cliente = new cliente();
        cliente.impnombre("Mario Chayanne");
        cliente.impedad(21);
        cliente.impnumero(359863);
        cliente.setEstado("Acreditado");
        cliente.impcredito(567.780);
        trabajador trabajador = new trabajador();
        trabajador.impnombre("Roberto Carlos");
        trabajador.impedad(31);
        trabajador.impnumero(355672);
        trabajador.setEstado("trabajador");
        trabajador.impsueldo(12567.780);
        
    }
}
public class persona{
    String nombre;
    int edad;
    int numero;
    String estado;
    
    public persona(){
        System.out.println("Datos del individuo: ");
    }
    public void impnombre(String nombre){
        System.out.println("Nombre: " + nombre);

    }
    public void impedad(int edad){
        System.out.println("Edad: " + edad);

    }
    public void impnumero(int numero){
        System.out.println("Numero telefonico: " + numero);

    }
    
    public void setEstado(String estado){
        this.estado = estado;
        if (estado == "trabajador"){
            System.out.println("Estado: Trabajando");
        } 
        else{
            System.out.println("Estado: Acreditado");
        }
    }
}
public class cliente extends persona{
    double credito;
    public void impcredito(double credito){
        System.out.println("Valor del credito: " + credito + "$");
    }
} 
public class trabajador extends persona{
    double sueldo;
     public void impsueldo(double sueldo){
        System.out.println("Sueldo vigente: " + sueldo + "$");
    }
}