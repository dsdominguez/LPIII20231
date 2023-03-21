public class Exemplo14
{
    public static void main(String [] args){
        int [] vet = {1,2,3,4,5,6,7,8,9};

        System.out.println(vet);

        //mostrar os metodos e propriedades da classe array
        //vet.

        prnVet("Vetor Inicial: ", vet);
        
        for(int i=0; i<vet.length; i++)
            vet[i]++;

        prnVet("Vetor apos for: ", vet);
            
        for (int i : vet) 
            i++;    
        
        prnVet("Vetor apos foreach: ", vet);        
    }

    public static void prnVet(String msg, int [] vet){
        System.out.println(msg);
        for(int i = 0; i < vet.length; i++)
                System.out.print(vet[i] + " ");
        System.out.println();        
    }
}

