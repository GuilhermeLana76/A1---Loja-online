import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;

        System.out.println("Bem-vindo!");
        System.out.println("para selecionar os itens que deseja comprar, digite o número do item.");
        System.out.println("1. Camiseta (R$ 30)");
        System.out.println("2. Calça (R$ 50)");
        System.out.println("3. Sapato (R$ 80)");
        System.out.println("Digite 0 para parar de adicionar itens ao seu carrinho.");
        int numeroItem = scanner.nextInt();

        while (numeroItem != 0) {
            
        if (numeroItem == 1) {
            totalCompra += 30;
            System.out.println("Camiseta adicionada ao carrinho!");

        } else if (numeroItem == 2) {
            totalCompra += 50;
            System.out.println("Calça adicionada ao carrinho!");

        } else if (numeroItem == 3) {
            totalCompra += 80;
            System.out.println("Sapato adicionada ao carrinho!");

        } else {
            System.out.println("Item inválido. Por favor, escolha um número válido.");
        }

        numeroItem = scanner.nextInt();
    }

        System.out.println("Total da compra: R$ " + totalCompra);
        System.out.println("Possui algum desconto?");
        System.out.println("1 - sim");
        System.out.println("2 - não");
        int desconto = scanner.nextInt();

        if (desconto == 1) {

        System.out.println("Digite a porcentagem do desconto: ");
        Double porcentagem = scanner.nextDouble();
        Double calculoDesconto = totalCompra * (porcentagem/100);
        Double valorFinal = totalCompra - calculoDesconto;
        System.out.println("O valor a ser pago é: " + valorFinal + "R$");

        } else { System.out.println("O valor a ser pago é: " + totalCompra + "R$"); }

        scanner.close();
    }
}