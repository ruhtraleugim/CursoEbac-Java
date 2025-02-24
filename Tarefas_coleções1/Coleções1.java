<<<<<<< HEAD

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Coleções1 {

    public static void main(String[] args) {
        
        List Nomes = new ArrayList<String>();
        System.out.println("me diga 10 nomes");
        Scanner Reader = new Scanner(System.in);
        for (int i = 0 ; i < 9; i++){
            Nomes.add(Reader.nextLine());
        }
        Collections.sort(Nomes);
        System.out.println(Nomes);
    }
=======

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Coleções1 {

    public static void main(String[] args) {
        
        List Nomes = new ArrayList<String>();
        System.out.println("me diga 10 nomes");
        Scanner Reader = new Scanner(System.in);
        for (int i = 0 ; i < 9; i++){
            Nomes.add(Reader.nextLine());
        }
        Collections.sort(Nomes);
        System.out.println(Nomes);
    }
>>>>>>> cc41bfd39beddbcf387a11d66ec6ed2e0473dd1f
}