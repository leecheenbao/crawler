package ptt.crawler.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class Article {
    private Board parent; // 所屬板塊
    private String url; // 網址
    private String title; // 標題
    private String body; // 內容
    private String author; // 作者
    private Date date; // 發文時間

    public Article(Board parent, String url, String title, String author, Date date) {
        this.parent = parent;
        this.url = url;
        this.title = title;
        this.author = author;
        this.date = date;
    }
}
