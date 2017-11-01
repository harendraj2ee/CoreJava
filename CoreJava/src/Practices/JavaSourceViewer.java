/*
 
1:- To read HTML from any website say "http://www.google.com" ( You can use any API of inbuilt APIs in Java like URLConnection )
2:- Print on console the HTML from the url above and save it to a file ( web-content.txt) in local machine.
3:- JUnit test cases for above programme.

 */
package Practices;
import java.io.*;
import java.net.*;

public class JavaSourceViewer{
  public static void main (String[] args) throws IOException{
    System.out.print("Enter url of local for viewing html source code: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String url = br.readLine();
    try {
      URL u = new URL(url);
      HttpURLConnection uc = (HttpURLConnection) u.openConnection();
      int code = uc.getResponseCode();
      String response = uc.getResponseMessage();
      System.out.println("HTTP/1.x " + code + " " + response);

      InputStream in = new BufferedInputStream(uc.getInputStream());
      Reader r = new InputStreamReader(in);
      int c;
      FileOutputStream fout=new FileOutputStream("D://web-content.txt");
      while((c = r.read()) != -1){
        System.out.print((char)c);
        fout.write(c);
      }
      fout.close();
    } catch(MalformedURLException ex) {
      System.err.println(url + " is not a valid URL.");
    } catch (IOException ie) {
      System.out.println("Input/Output Error: " + ie.getMessage());
    }
  }
}    