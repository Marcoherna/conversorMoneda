import com.google.gson.Gson;
import models.Moneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    public Moneda buscarDivisa(String divisaBase, String divisaDestino) {

        URI direction = URI.create("https://v6.exchangerate-api.com/v6/91f72fe19ac8bba59bfbbcb0/pair/"
                + divisaBase + "/" + divisaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }catch(Exception e) {
            throw new RuntimeException("No se pudo hacer la conversión");
        }


    }
}
