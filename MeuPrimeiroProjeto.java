package meuprimeiroprojeto;

/**
 *
 * @author yasmin
 */
public class MeuPrimeiroProjeto {

    /**A granja Frangotech possui um controle automatizado de cada frango da sua
     * produção. No pé direito do frango há um anel com um chip de identificação;
     * no pé esquerdo são dois anéis para indicar o tipo de alimento que ele
     * deve consumir. Sabendo que o anel com chip custa R$4,00 e o anel de 
     * alimento custa R$3,50, faça um algoritmo para calcular o gasto total da 
     * granja para marcar todos os seus frangos.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner frango = new Scanner(System.in);
      
       double anelIndent, anelAliment, custoTotal;
       anelIndent = 4.00;
       anelAliment = 7.00;

       System.out.println("Digite o numero de frangos na granja: ");
       int quantFrangos = frango.nextInt();

       custoTotal = quantFrangos * (anelIndent + anelAliment);
       System.out.println("O total a pagar é: " + custoTotal);
    }

}
    


    


    
    
    
    
    
    