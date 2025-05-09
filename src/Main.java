import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        getPairConversion pairConversion = new getPairConversion();

        Conversion response = pairConversion.conversion();

        double amountConverted = Math.round(response.conversion_result() / response.conversion_rate());

        System.out.println("Sua conversão de "+ amountConverted +" em " + response.base_code() + " resultou em " + response.conversion_result() + " " + response.target_code() );





    }
}