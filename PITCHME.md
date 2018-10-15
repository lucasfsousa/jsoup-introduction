### jsoup
![logo](jambit_logo.png)

---

## What?
`jsoup` is a Java library for processing HTML data:
- scrape and parse HTML data from URL, file or string.
- find and extract data using DOM or CSS selectors.

---

### How?
```
Document document = Jsoup.connect("http://jambit.com").get();
Element h1Image = document.select("h1 img").first();
assertEquals("jambit – Where Innovation Works", h1Image.attr("alt"));
```
---

### Try it!
- https://try.jsoup.org/

---

## Sources 
- https://jsoup.org/
- https://jsoup.org/cookbook/