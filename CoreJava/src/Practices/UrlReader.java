/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practices;

//package client;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlReader {
public static void main(String[] args) {

URL url;

try {
// Define your URL
url = new URL("http://www.google.com");
URLConnection conn = url.openConnection();

// open the stream and put it into BufferedReader
BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

String inputLine;

//Save text file (HTML Source)
String fileName = "D:/web-content.txt";
File file = new File(fileName);

if (!file.exists()) {
file.createNewFile();
}

//use FileWriter to write file
FileWriter fw = new FileWriter(file.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);
System.out.println("Printing WebPage source on console, Please wait...\n");
while ((inputLine = br.readLine()) != null) {
System.out.println(inputLine);
bw.write(inputLine);
}

bw.close();
br.close();

System.out.println("\n\nYour file is save in D drive! Congratulations ");

} catch (MalformedURLException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}

}
} 