package week_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class w12p3{
    public static void main(String[] args) throws MalformedURLException, NetworkConnectionException {
        fetchWebPage("://127.0.0.1:3000/week_12/src/main/java/week_12/test.html");
    }

    public static void fetchWebPage(String urlString)
            throws MalformedURLException, NetworkConnectionException {

        HttpURLConnection con = null;

        try {
            URL url = new URL(urlString);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(3000);
            con.setReadTimeout(3000);

            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // try-with-resources to handle reader
                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                    String line;
                    while ((line = in.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            } else {
                System.out.println("Server responded with error: " + responseCode);
            }

        } catch (MalformedURLException e) {
            throw new NetworkConnectionException("Invalid URL", e);
        } catch (IOException e) {
            throw new NetworkConnectionException("Failed to connect or read data", e);
        } finally {
            if (con != null) {
                con.disconnect();
                System.out.println("Connection closed successfully).");
            }
        }
    }
}
