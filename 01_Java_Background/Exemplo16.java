import java.util.Arrays;

import javax.print.event.PrintEvent;

public class Exemplo16 {
  public static void main(String args[]) {
    float vet3[] = {1.7f, 2.0f, -32.90f, 0.412f, 52f, 905f};
    int vet2[] = {1, 2, 3, 4, 5, 6};

    //Imprimindo os vetores
    prnVet("Vetor de floats: ", vet3);
    prnVet("Vetor de Ints: ", vet2);

    //Busca binaria no vetor de floats
    int pos = Arrays.binarySearch(vet3, 2);
    System.out.println("No vetor de F o valor 2 se encontra na " + (pos+1) + "º posicao");
    
    //Busca binaria no vetor de ints
    pos = Arrays.binarySearch(vet2, 2);
    System.out.println("O valor 2 se encontra na " + (pos+1) + "º posicao");

    //Ordenando o vetor de floats
    Arrays.sort(vet3);
    //Imprimindo o vetor de floats
    prnVet("Vetor de floats: ", vet3);

    //Nova Busca binaria no vetor de floats
    pos = Arrays.binarySearch(vet3, 2);
    System.out.println("No vetor de F o valor 2 se encontra na " + (pos+1) + "º posicao");
    
  }

  public static void prnVet(String msg, int [] vet){
    System.out.println(msg);
    for(int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
    System.out.println();        
  }

  public static void prnVet(String msg, float [] vet){
    System.out.println(msg);
    for(int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
    System.out.println();        
  }
}