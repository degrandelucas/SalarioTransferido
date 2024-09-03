import java.util.Scanner;

public class SalarioTransferido {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        try{
            System.out.println("Digite o valor do Salário Bruto (exemplo R$ 2000,85): ");
            double salarioProposto = leitura.nextDouble();
            System.out.println("Qual o valor total dos benefícios (exemplo R$ 400,25): ");
            double beneficios = leitura.nextDouble();

            if (salarioProposto < 0 || beneficios < 0){ 
                throw new IllegalArgumentException("Salário ou benefícios não pode ser negativos");
            }

            double imposto = (salarioProposto >= 0 && salarioProposto <= 1100.00) ? 0.05 :
                             (salarioProposto >= 1100.01 && salarioProposto <= 2500.00) ? 0.1 : 0.15;
            double salarioBeneficiosTotal = (salarioProposto - (salarioProposto * imposto)) + beneficios;   
            System.out.println("Segue valor total líquido do salário com os benefócios: " + salarioBeneficiosTotal);


            /*if (salarioProposto >= 0 && salarioProposto <= 1100.00 ) { 
                double salarioBeneficiosTotal = (salarioProposto - (salarioProposto * 0.05)) + beneficios;   
                System.out.println("Segue valor total líquido do salário com os benefócios: " + salarioBeneficiosTotal);
            }
            else if (salarioProposto >= 1100.01 && salarioProposto <= 2500.00) {
                double salarioBeneficiosTotal = (salarioProposto - (salarioProposto * 0.1)) + beneficios;   
                System.out.println("Segue valor total líquido do salário com os benefócios: " + salarioBeneficiosTotal);
            }

            else{
                double salarioBeneficiosTotal = (salarioProposto - (salarioProposto * 0.15)) + beneficios;   
                System.out.println("Segue valor total líquido do salário com os benefócios: " + salarioBeneficiosTotal);
            }*/
        }

        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro de inserção: " + e.getMessage());
        }
        finally{
            leitura.close();
        }
    }
}
