import java.util.Scanner;

public class PreenchimentoDeVetorII {
    public static void main(String[] args){
  
      Scanner leitor = new Scanner(System.in);
        int[] indiceArray  = new int[1000];
        int j = 0, t = leitor.nextInt();
          for (int i = 0; i < indiceArray .length; i++) {
          System.out.println("N[" + i + "] = " + j);
          j++;
          if (j == t) j = 0;
        }
      }
  }