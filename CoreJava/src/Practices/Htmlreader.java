/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practices;

 import java.io.*;

  import java.net.*;

      public class Htmlreader {

public static void main(String[] args) throws IOException {
try {
    String url="http://www.hcst.edu.in";
    FileOutputStream fout =new FileOutputStream("D://content.txt");
    writeurl2file(url,fout);
    }
    catch(IOException e){
    System.out.println("I O Error");
    }
}


public static void writeurl2file(String url, FileOutputStream fout) throws MalformedURLException, IOException 
{
    URL u =new URL(url);
    HttpURLConnection uc =(HttpURLConnection) u.openConnection();
    InputStream in = new BufferedInputStream(uc.getInputStream());
    Reader r= new InputStreamReader(in);
    int c;
    while((c=r.read())!=-1){
          System.out.print((char) c);
            fout.write(c);
    }

}

   }