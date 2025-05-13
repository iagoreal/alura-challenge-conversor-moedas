import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        boolean condition = true;
        GetPairConversion pairConversion = new GetPairConversion();


        while(condition){
            Thread.sleep(1000);
            System.out.println(" ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ecolha o serviço que deseja realizar, digitando seu respectivo número");
            Thread.sleep(500);
            System.out.println("1: Listar códigos das moedas suportadas");
            System.out.println("2: Fazer uma conversão");
            System.out.println("3: Encerrar programa");
            System.out.println(" ");
            int chose = 0;

            System.out.print("R: ");
            Scanner scanner = new Scanner(System.in);

            try {
                if(scanner.hasNextInt()) {
                    chose = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.nextLine();
                    continue;
                }
                switch (chose){
                    case 1:

                        break;
                    case 2:
                        Conversion response = pairConversion.conversion();
                        double amountConverted = Math.round(response.conversion_result() / response.conversion_rate());
                        System.out.println("Sua conversão de "+ amountConverted +" em " + response.base_code() + " resultou em " + response.conversion_result() + " " + response.target_code() );
                        break;
                    case 3:
                        System.out.println("Fechando programa...");
                        Thread.sleep(500);
                        condition = false;
                        break;
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
                Thread.sleep(1000);

            }




        }








    }
}