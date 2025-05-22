import java.util.Scanner;

public class SimpleLoginApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded credentials (problema)
        String adminUser = "admin";
        String adminPassword = "123456";

        System.out.println("Digite o nome de usuário:");
        String username = scanner.nextLine();

        System.out.println("Digite a senha:");
        String password = scanner.nextLine();

        // Comparação incorreta de strings (erro comum)
        if (username == adminUser && password == adminPassword) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        // Simulação de comando inseguro (input não validado)
        System.out.println("Digite um nome de arquivo para deletar:");
        String file = scanner.nextLine();

        // Simula um comando perigoso (Ex: rm, del, etc.)
        String command = "del " + file;
        System.out.println("Executando comando: " + command);
        // Aqui apenas printa, mas simula execução de um comando baseado na entrada (risco típico)

        scanner.close();
    }
}