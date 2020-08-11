import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class main<JSONArray> {
    URL url = new URL("https://www.olo.com/pizzas.json");
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//    Step 3) Set the request type, as in, whether the request to the API is a GET request or a POST request.
    conn.setRequestMethod(“GET”);

//    Step 4) Open a connection stream to the corresponding API.

            conn.connect();

//    Step 5) Get the corresponding response code.

    int responsecode = conn.getResponseCode();

    JSONParser parse = new JSONParser();

//    Step 9) Convert the string objects into JSON objects:

    JSONObject jobj = (JSONObject)parse.parse(inline);
    public String topping;

    public main(String topping) throws IOException {
        this.topping = topping;
        JSONArray jsonarr_1 = (JSONArray) jobj.get(topping);
    }

}
