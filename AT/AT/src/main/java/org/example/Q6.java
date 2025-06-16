package org.example;

public class Q6 {
    public static void main(String[] args) {
        Document_Q6 pdf = new PdfDocument_Q6();
        Document_Q6 html = new HtmlDocument_Q6();
        Document_Q6 txt = new TxtDocument_Q6();

        Document_Q6[] documents = {pdf, html, txt};
        for (Document_Q6 doc : documents) {
            doc.print();
        }
    }
}
