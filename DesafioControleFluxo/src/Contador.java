import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contador(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contador(int parametroUm, int parametroDois) throws Exception {
        if (parametroUm >= parametroDois) {
            throw new Exception("O primeiro parâmetro deve ser MENOR que o segundo parâmetro");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}




