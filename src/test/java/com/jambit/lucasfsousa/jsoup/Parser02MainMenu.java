package com.jambit.lucasfsousa.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

public class Parser02MainMenu {
    @Test
    public void shouldListMenu() throws IOException {
        Document document = Jsoup.connect("http://jambit.com/en").get();
        Elements menuElements = document.select("li.c-global-header__nav-item>a");

        for (Element element: menuElements) {
            print("%s - %s", element.attr("href"), element.text());
        }
    }

    private void print(String message, String... args) {
        System.out.println(String.format(message, args));
    }
}
