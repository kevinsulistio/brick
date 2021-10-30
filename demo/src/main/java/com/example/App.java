package com.example;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try {
            org.jsoup.nodes.Document doc = Jsoup.connect("https://www.tokopedia.com/p/handphone-tablet/handphone?ob=23").userAgent("Mozilla").get();

            Elements repo = doc.getElementsByClass("css-bk6tzz e1nlzfl3");
            System.out.println(repo.size());
            for(Element repository : repo){
                System.out.println("Name of Product "+repository.getElementsByClass("css-1bjwylw").text());
                System.out.println("Image Link "+repository.getElementsByClass("css-t8frx0"));
                System.out.println("Description ");//dont know yet how to get this
                System.out.println("Price "+repository.getElementsByClass("css-o5uqvq").text());
                System.out.println("Rating "+repository.getElementsByClass("css-177n1u3").size());
                System.out.println("Store Name "+repository.getElementsByClass("css-1kr22w3").get(1).text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}