import java.net.HttpURLConnection;
import java.net.URL;

public class GETrequest {
    public static void main(String[] args) {
        try {
            // URL zu Google
            URL url = new URL("https://www.google.de");

            // Öffne eine Verbindung zur URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Setze den HTTP-Methoden-Typ (GET)
            connection.setRequestMethod("GET");

            // Hole den Statuscode
            int statusCode = connection.getResponseCode();

            // Gib den Statuscode auf der Konsole aus
            System.out.println("HTTP Status Code: " + statusCode);
        } catch (Exception e) {
            // Fehlerbehandlung
            e.printStackTrace();
        }
    }
}
