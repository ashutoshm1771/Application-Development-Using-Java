import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class header{
  public static void main(String args[]) throws Exception {
    URL url = new URL("http://www.google.com");
    HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();

    Map<String, List<String>> hdrs = httpCon.getHeaderFields();
    Set<String> hdrKeys = hdrs.keySet();

    for (String k : hdrKeys)
      System.out.println("Key: " + k + "  Value: " + hdrs.get(k));

 }
}
