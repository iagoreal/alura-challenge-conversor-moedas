import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GetPairConversion {
    public Conversion conversion () {
        Scanner scanner = new Scanner(System.in);

        String baseCoinSelected="";
        String targetCoinSelected = "";
        double amountSelected=0;

        try {
            List<String> coinSuported = Files.readAllLines(Paths.get("/home/qwerty/IdeaProjects/ConversorMoeda/src/codes.txt"));

            while(true) {
                System.out.print("Digite o código da moeda que deseja usar como base da conversão: ");
                baseCoinSelected = scanner.nextLine();
                if(coinSuported.contains(baseCoinSelected)){
                   break;
                }
                System.out.println("código da moeda base incorreto");
            }

            while(true) {
                System.out.print("Digite o código da moeda que deseja usar como alvo da conversão: ");
                targetCoinSelected = scanner.nextLine();
                if(coinSuported.contains(targetCoinSelected)){
                    break;
                }
                System.out.println("código da moeda alvo incorreto");
            }

            while(true) {
                System.out.print("Qual valor deseja converter para moeda alvo: ");
                if(scanner.hasNextDouble()){
                    amountSelected = scanner.nextDouble();
                    break;
                }
                System.out.println("entrada invalida");
                scanner.nextLine();
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        URI resultConversion = URI.create("https://v6.exchangerate-api.com/v6/"+System.getenv("apiKey")+"/pair/"+baseCoinSelected+"/"+targetCoinSelected+"/"+amountSelected);

                HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(resultConversion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Conversion.class);

    }
}
