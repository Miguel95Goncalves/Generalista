package Controller;

import java.util.ArrayList;

public class Caixa<Article> {
	ArrayList<Article> articles;

	public Caixa(ArrayList<Article> articles) {
		super();
		this.articles = articles;
	}
	
	public void addArticle(Article a){
		this.articles.add(a);
	}
	
	
}
