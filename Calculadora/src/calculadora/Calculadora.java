//Leonardo Francisco Custódio
// Informática 3°A
package calculadora;

import javax.swing.JOptionPane;

/*Importando o JOptionPane para criar uma caixa de diálogo na aplicação*/

public class Calculadora {
    
     public static void main( String[] args )
   {
      String escolha = JOptionPane.showInputDialog( "Digite que tipo de operação deseja fazer: Multiplicacao, Adicao, Subtracao, Divisao." );
      
      String primeiroNumero = 
        JOptionPane.showInputDialog( "Digite o primeiro número" );
      
      /*aqui o primeiro número é escolhido*/
      
      String segundoNumero =
          JOptionPane.showInputDialog( "Digite o segundo número" );
      
      /*aqui o segundo número é escolhido*/  
      

      int num1 = Integer.parseInt( primeiroNumero  ); 
      int num2 = Integer.parseInt( segundoNumero );
      /*nessa parte são atribuídos e convertidos os valores de string pra inteiro*/  
       
      int sum = num1 + num2;
      int mul = num1 + num2;
      float div = num1/num2;
      int sub = num1 - num2;
      // "Nesta parte os números informados são somados (depois de terem sido convertidos de string para integer)"" 
            
      if (escolha.equals ("adicao")) {
        JOptionPane.showMessageDialog(null, "A soma é " + sum, 
         "Soma de dois números", JOptionPane.PLAIN_MESSAGE );
         // Neste trecho é apresentado a mensagem, como se fosse o SOUT(System.out.println), destarte, após os dados serem calculados uma mensagem será apresentada em uma caixa de diálogo.   
      }
      
      if (escolha.equals ("multiplicacao")){
          JOptionPane.showMessageDialog(null, "A multiplicação é " + mul, 
         "Multiplicação de dois números", JOptionPane.PLAIN_MESSAGE );
      }
      
      if (escolha.equals ("divisao")) {
        JOptionPane.showMessageDialog(null, "A divisão é " + div, 
         "Divisão de dois números", JOptionPane.PLAIN_MESSAGE );
         // Neste trecho é apresentado a mensagem, como se fosse o SOUT(System.out.println), destarte, após os dados serem calculados uma mensagem será apresentada em uma caixa de diálogo.   
      }
      
      if (escolha.equals ("subtracao")) {
        JOptionPane.showMessageDialog(null, "A subtração é " + sub, 
         "Subtração de dois números", JOptionPane.PLAIN_MESSAGE );
         // Neste trecho é apresentado a mensagem, como se fosse o SOUT(System.out.println), destarte, após os dados serem calculados uma mensagem será apresentada em uma caixa de diálogo.   
      }
   }       
}
