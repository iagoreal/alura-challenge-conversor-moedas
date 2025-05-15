import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AllCodesSuported {
    public Conversion codesSuported() {

        URI url = URI.create("https://v6.exchangerate-api.com/v6/"+System.getenv("apiKey")+"/codes");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        HttpResponse<String> response = null;
        try {
             response = client.send(request, HttpResponse.BodyHandlers.ofString());


        } catch (Exception e) {
            System.out.println("erro interno do sistema");
        }

        return  new Gson().fromJson(response.body(), Conversion.class);


    }

}