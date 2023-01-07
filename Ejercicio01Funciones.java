public class Main {
    //Primera parte:
    public static void main(String[] args) {
        int resultado = miFuncion(5,10, -6);
        System.out.println("Cuanto es 5 + 10 +(-6)?");
        System.out.println("El resultado es: " + resultado);

        coche micoche = new coche();

        System.out.println("El numero de puertas antes es:" + micoche.puertas);
        micoche.Quitarpuertas();

        System.out.println("El numero de puertas actual es: " + micoche.puertas);


    }
    public static int miFuncion(int a,int  b,int c){
        return a + b + c;
    }

    //Segunda parte:
        static class coche {
            public int puertas = 6;

            public void Quitarpuertas() {
                this.puertas += 2;

            }

        }

}