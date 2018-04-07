import java.net.URL;
import java.net.URLConnection;

public class size {
   public static void main(String[] argv) throws Exception {
      int size;
      URL url = new URL(argv[0]);
      URLConnection conn = url.openConnection();
      size = conn.getContentLength();
      
      if (size < 0) System.out.println("Could not determine file size.");
      else System.out.println("The size of file is = " + size + "bytes");
      conn.getInputStream().close();
   }
}