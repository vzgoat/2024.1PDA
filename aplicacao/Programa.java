package aplicacao;
import java.util.Scanner;
import javax.swing.*;
public class Programa {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("\n Informe o produto que ser� cadastrado: ");
		produto.produto = scam.next();
		
		System.out.println("\n Informe a quantidade: ");
		produto.quantidade = scam.nextDouble();
		
		
		System.out.println("\n Informe o pre�o individual: ");
		produto.preco = scam.nextDouble();
	
		System.out.println("Confirma��o: " + produto.produto + ", estoque atual: " +produto.quantidade);
		
		//Inser��o de + produtos e atualiza��o de estoque:
		
		System.out.println("Deseja inserir mais produtos? Quantidade: ");
		int estoque = scam.nextInt();
		
		produto.AddProduto(estoque);
		
		System.out.println("Atualiza��o : " + produto.produto + "Estoque atual: " +produto.quantidade + " Pre�o: " +produto.preco); 
		
		//Subtraindo produtos ( Possiveis vendas ou percas )
		
		System.out.println(" Atualmente, alguma venda foi realizada? ");
		estoque = scam.nextInt(); 
		produto.Subtraiproduto(estoque);
		
		//Atualizando:
		
		System.out.println("Atualiza��o p�s vendas: "+produto.produto+ ", Estoque atual: "+produto.quantidade + " , Pre�o: " +produto.preco + ", Valor atual do estoque : " + produto.preco * produto.quantidade);
		
		JOptionPane.showConfirmDialog(null, "Atualiza��o p�s vendas: "+produto.produto+ ", Estoque atual: "+produto.quantidade + " , Pre�o: " +produto.preco + ", Valor atual do estoque : " + produto.preco * produto.quantidade);
		scam.close();
	}
	
}