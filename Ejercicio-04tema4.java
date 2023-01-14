import java.text.BreakIterator;

public class main{
    public static void main(String[] args){
    //Punto 1
    System.out.print(" Punto 1: ");
        int numeroIf = -71;
    if (numeroIf > 0){
        System.out.print(" Positivo. ");
    } 
    else if (numeroIf == 0){
        System.out.println("0");
    }   
    else{
        System.out.print(" Negativo.");
    }
    
    //Punto 2
    System.out.print(" Punto 2: ");
    int numeroWhile = 0;
    while (numeroWhile <= 3){
        System.out.print(numeroWhile);
        numeroWhile++;
    }
    //Punto 3
    System.out.print(" Punto 3: ");
    int numerodoWhile = 0;
    do{
        System.out.print(numerodoWhile);
        numerodoWhile ++;
    }while (numerodoWhile <= 3);{}

    //Punto 4
    System.out.print(" Punto 4: ");
    for (int numeroFor = 0; numeroFor<= 3; numeroFor+=1){
        System.out.print(numeroFor);

    }



   










    }
    
    

}