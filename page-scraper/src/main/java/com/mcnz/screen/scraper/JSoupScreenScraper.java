package com.mcnz.screen.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupScreenScraper {

	public static void main(String[] args) throws Exception {
		String url = "https://www.theserverside.com/video/Tough-sample-Git-and-GitHub-interview-questions-and-answers";
		Document pageToScrape = Jsoup.connect(url).get();
		
		System.out.printf("The title is: %s. \n", pageToScrape.title());
		
		String authorLinkSelector = "#author > div > a";
		Element authorLink = pageToScrape.selectFirst(authorLinkSelector);
		System.out.printf("The authors name is: %s.\n", authorLink.text());
		
		String selector = "#commenting > div > div.content-center.comments-center > h3 > span";
		Element publishDate = pageToScrape.selectFirst(selector);
		System.out.printf("There have been %s comments.\n", publishDate.text());
		
		Elements links = pageToScrape.select("a[href]");
		for (Element link : links) {
			System.out.print("\nLink: " + link.attr("href"));
		}
		

	}

}
