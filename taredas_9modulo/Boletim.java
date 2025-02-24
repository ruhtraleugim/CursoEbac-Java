<<<<<<< HEAD
import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        
        System.out.println("me diga a nota do seus bimestres");
        

        Scanner scanner = new Scanner(System.in);
        Double nota1 = scanner.nextDouble();
        Double nota2 = scanner.nextDouble();
        Double nota3 = scanner.nextDouble();
        Double nota4 = scanner.nextDouble();
        Double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;
        if (mediaNota <= 3 ) {
            System.out.println( mediaNota +"reprovado");
        }
        else if (mediaNota <= 6) {
            System.out.println( mediaNota +" recuperação");
        }
        else {
            System.out.println( mediaNota +"aprovado");
        }
    }
}

    

=======
import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        
        System.out.println("me diga a nota do seus bimestres");
        

        Scanner scanner = new Scanner(System.in);
        Double nota1 = scanner.nextDouble();
        Double nota2 = scanner.nextDouble();
        Double nota3 = scanner.nextDouble();
        Double nota4 = scanner.nextDouble();
        Double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;
        if (mediaNota <= 3 ) {
            System.out.println( mediaNota +"reprovado");
        }
        else if (mediaNota <= 6) {
            System.out.println( mediaNota +" recuperação");
        }
        else {
            System.out.println( mediaNota +"aprovado");
        }
    }
}

    

>>>>>>> cc41bfd39beddbcf387a11d66ec6ed2e0473dd1f
    