package Tarefa_Modulo_Streams22;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        Pessoas pessoas = new Pessoas();
        
        
        List<Pessoa> listaMuleres = pessoas.getPessoas().stream()
        .filter(pessoa -> "Feminino"
        .equals(pessoa.getGenero()))
        .collect(Collectors.toList());

        System.out.println(listaMuleres);
    }
}