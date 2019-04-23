package com.mcnz.screen.scraper;

import java.util.List;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HtmlUnitScraper {
	
	public static void main(String args[]) throws Exception {
		
	    String url = "https://www.theserverside.com/video/"
	    		+ "Tough-sample-Git-and-GitHub-interview-"
	    		+ "questions-and-answers";
	    WebClient webClient = new WebClient();
	    webClient.getOptions().setUseInsecureSSL(true);
		webClient.getOptions().setCssEnabled(false);
	    webClient.getOptions().setJavaScriptEnabled(false);
		

		HtmlPage htmlPage = webClient.getPage(url);
		System.out.println(htmlPage.getTitleText());

		DomNode domNode = htmlPage.querySelector("#author > div > a");	
		System.out.println(domNode.asText());
		
		List<HtmlAnchor> anchors =  htmlPage.getAnchors();
		for (HtmlAnchor anchor : anchors) {
			System.out.println(anchor.getAttribute("href"));
		}
	}
}

