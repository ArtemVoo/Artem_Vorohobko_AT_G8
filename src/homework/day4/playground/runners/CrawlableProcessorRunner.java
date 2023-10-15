package homework.day4.playground.runners;

import homework.day4.playground.essence.creatures.*;
import homework.day4.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {

    public static void main(String[] args) {

        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };
        crawlableProcessor.runCrawlable(crawlableCrocodile);
        crawlableProcessor.runCrawlable(crawlableBeetle);
        //crawlableProcessor.runCrawlable(vertebrataCrocodile);
        //crawlableProcessor.runCrawlable(insectBeetle);
        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(aBeetle);
        crawlableProcessor.runCrawlable(anonymousCrawlable);

        crawlableProcessor.runCrawlable(crawlableCrocodile, "nowhere");
        crawlableProcessor.runCrawlable(crawlableBeetle, "left");

        crawlableProcessor.runCrawlable(aCrocodile, "back", 37);

        crawlableProcessor.runCrawlable(new Crawlable() {
            final String name = "AnonCreature";

            @Override
            public void crawl(String direction, int distance) {
                String str = String.format("I am %s, my name is %s and I am crawling to %s for %d units", this.getClass().getSimpleName(), this.name, "down", 37);
                System.out.println(str);
            }
        });
    }
}
