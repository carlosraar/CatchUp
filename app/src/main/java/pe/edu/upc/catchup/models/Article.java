package pe.edu.upc.catchup.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by RAMOS on 30/04/2018.
 */

public class Article {

    private String id;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private Source source;

    public Article() {
    }

    public Article(String id, String title, String description, String url, String urlToImage, String publishedAt, Source source) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.source = source;
    }


    public String getId() {
        return id;
    }

    public Article setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Article setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Article setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public Article setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
        return this;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public Article setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public Source getSource() {
        return source;
    }

    public Article setSource(Source source) {
        this.source = source;
        return this;
    }

    public static Article from(JSONObject jsonArticle) {
        try {
            return new Article(
                    jsonArticle.getString("author"),
                    jsonArticle.getString("title"),
                    jsonArticle.getString("description"),
                    jsonArticle.getString("url"),
                    jsonArticle.getString("urlToImage"),
                    jsonArticle.getString("publishedAt"),
                    Source.from(jsonArticle.getJSONObject("Source"))
            );
        } catch (JSONException e) {
            return null;
        }

    }

}
