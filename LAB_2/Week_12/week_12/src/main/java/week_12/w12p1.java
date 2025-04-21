package week_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class w12p1 {
    public static void main(String[] args) {
        try {
            fetchWebPage("http://127.0.0.1:3000/Week_11/test.html");
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
            e.printStackTrace();  // Optional: show where it failed
        } catch (IOException e) {
            System.out.println("IO error occurred: " + e.getMessage());
            e.printStackTrace();  // Optional: detailed trace
        }
    }

    public static void fetchWebPage(String urlString) throws MalformedURLException, IOException {
        URL url = new URL(urlString);  // Can throw MalformedURLException
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(3000);
        con.setReadTimeout(3000);

        int responseCode = con.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } else {
            System.out.println("Server responded with error: " + responseCode);
        }

        con.disconnect();
    }
}
