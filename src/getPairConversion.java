import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class getPairConversion {
    public Conversion conversion () throws IOException, InterruptedException {

        Scanner base_coin = new Scanner(System.in);
        System.out.print("Digite o código da moeda que deseja usar como base da conversão: ");
        String base_coin_selected = base_coin.nextLine();

        Scanner target_coin = new Scanner(System.in);
        System.out.print("Digite o código da moeda que deseja usar como alvo da conversão: ");
        String target_coin_selected = target_coin.nextLine();

        Scanner amount = new Scanner(System.in);
        System.out.print("Qual valor deseja converter para moeda alvo: ");
        double amountSelected = amount.nextDouble();


        URI resultConversion = URI.create("https://v6.exchangerate-api.com/v6/"+System.getenv("apiKey")+"/pair/"+base_coin_selected+"/"+target_coin_selected+"/"+amountSelected);

                HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(resultConversion)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
         return new Gson().fromJson(response.body(), Conversion.class);


    }
}
