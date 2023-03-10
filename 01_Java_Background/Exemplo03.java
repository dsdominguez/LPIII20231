//Exemplo de declaração de variáveis

public class Exemplo03 {
    public static void main(String [] args){
        int i1 = 3;
        short s1 = 3;
        //short s2=3500000;
        //short s2=(short) 3500000;        
        float f1 = 2.5f;
        double d1 = 2.5d;
        char ch1 = 'a', ch3=33; //char 33 = !
        String str2 = "Strings in Java";

        System.out.printf("Int 1: %d \n", i1);
        System.out.println("Short:" + s1);
        //System.out.println("Short:" + s2);
        System.out.println("Float:" + f1);
        System.out.println("Double:" + d1);
        System.out.println("Char 1:" + ch1 + ", Char 2:" + ch3 );
        System.out.println("String 1:" + str2);
    }
    
}
