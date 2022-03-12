package com.company;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {


        URL url = new URL("https://api.polygon.io/v2/aggs/ticker/AAPL/range/1/day/2020-01-01/2020-12-31?adjusted=true&sort=asc&limit=120&apiKey=8YWgCP8lOZl3z4jFVy8sQSu2HQJnCLPn");
        Scanner sc = new Scanner(url.openStream());
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()) {
            sb.append(sc.next());
        }

        String result = sb.toString();
        System.out.println(result);
        result = result.replaceAll("<[^>]*>", "");
        System.out.println("Contents of the web page:\n" +result);


    }
}
