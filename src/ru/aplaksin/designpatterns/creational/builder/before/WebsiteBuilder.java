package ru.aplaksin.designpatterns.creational.builder.before;

public class WebsiteBuilder {
    public static void main(String[] args) {
        Website website = new Website();
        website.setName("Visit card");
        website.setCms("Wordpress");
        website.setPrice(500);

        System.out.println(website);
    }
}
