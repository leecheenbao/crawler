package ptt.crawler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ptt.crawler.model.Article;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

class ReaderTest {
    private Reader reader;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        try {
            reader = new Reader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void list() {
        try {
            List<Article> result = reader.getList("Keelung");
            Assertions.assertInstanceOf(List.class, result);

            System.out.println("count:" + result.size());
            for (Article article : result){
                System.out.println("title:" + article.getTitle() + "\tAuth:" + article.getAuthor() + "\tDate:" + article.getDate());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}