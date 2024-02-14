import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer tamanhoArray;

        // para ler o tanto de nomes que o usuário deseja separar
        System.out.println("Olá, insira o número de nomes que deseja passar:");
        tamanhoArray = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        // cria um vetor chamado nomes, que recebe o tamanho igual ao número de pedidos
        String[] nomes = new String[tamanhoArray];
        String[] hNomes = new String[tamanhoArray];
        String[] fNomes = new String[tamanhoArray];
        
        // Armazena dentro de cada posição do vetor um novo nome
        System.out.println("Me diga um nome e um sexo \nExemplo: Arthur - H (H para homem, F para mulher)");
        for (int i = 0; i < tamanhoArray; i++) {
            nomes[i] = scanner.nextLine();
        }

        // Separa os nomes masculinos e femininos
        for (int i = 0; i < tamanhoArray; i++) {
            String[] partes = nomes[i].split("-");
            String nome = partes[0].trim(); // Remover espaços em branco em excesso
            String sexo = partes[1].trim(); // Remover espaços em branco em excesso
            
            if (sexo.equalsIgnoreCase("H")) {
                hNomes[i] = nome;
            } else if (sexo.equalsIgnoreCase("M")) {
                fNomes[i] = nome;
            } else {
                System.out.println("Sexo inválido para o nome: " + nome);
            }
        }

        // Imprime os nomes masculinos
        System.out.println("Nomes masculinos:");
        for (String nome : hNomes) {
            if (nome != null) {
                System.out.println(nome);
            }
        }
        
        // Imprime os nomes femininos
        System.out.println("Nomes femininos:");
        for (String nome : fNomes) {
            if (nome != null) {
                System.out.println(nome);
            }
        }

        scanner.close(); // Fechar o scanner
    }
}
