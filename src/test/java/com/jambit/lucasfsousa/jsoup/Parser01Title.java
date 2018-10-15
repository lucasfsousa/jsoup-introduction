package com.jambit.lucasfsousa.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Parser01Title {
    @Test
    public void shouldParseTitle() throws IOException {
        Document document = Jsoup.connect("http://jambit.com").get();
        Element h1Image = document.select("h1 img").first();
        assertEquals("jambit – Where Innovation Works", h1Image.attr("alt"));
    }
}
