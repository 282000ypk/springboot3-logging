package net.guides.springboot3.springboot3logging;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
	private static final Logger logger = LoggerFactory.getLogger(ArticleService.class);
	@Autowired
	private ArticleService articleService;
	@GetMapping("/hello")
	public List<Article> getArticles() {
		logger.debug("inside ArticleController.getArticles() method");
		return articleService.getArticles();
	}
}
