package pe.edu.upc.catchup.models;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * Created by RAMOS on 29/04/2018.
 */

public class Source {


    private String id;
    private String name;
    private String descripction;
    private String url;
    private String category;
    private String language;
    private String country;


    public Source(String id, String name, String descripction, String url, String category, String language, String country) {
        this.id = id;
        this.name = name;
        this.descripction = descripction;
        this.url = url;
        this.category = category;
        this.language = language;
        this.country = country;
    }

    public Source() {
    }


    public String getId() {
        return id;
    }

    public Source setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Source setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescripction() {
        return descripction;
    }

    public Source setDescripction(String descripction) {
        this.descripction = descripction;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Source setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Source setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Source setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Source setCountry(String country) {
        this.country = country;
        return this;
    }

    public static Source from(JSONObject jsonSource) {

        try {

            return new Source(

                    jsonSource.getString("id"),
                    jsonSource.getString("name"),
                    jsonSource.optString("description"),
                    jsonSource.optString("url"),
                    jsonSource.optString("category"),
                    jsonSource.optString("language"),
                    jsonSource.optString("country")
            );

        } catch (JSONException e) {
            return null;
        }

    }

    public static List<Source> from(JSONArray jsonSources) {
        List<Source> sources = new ArrayList<>();
        int length = jsonSources.length();
        for (int i = 0; i < length; i++) {

            try {
                sources.add(Source.from(jsonSources.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return sources;
    }


    public static Source from(Bundle bundle) {
         return new Source(

        bundle.getString("id"),
        bundle.getString("name"),
        bundle.getString("description"),
        bundle.getString("url"),
        bundle.getString("category"),
        bundle.getString("language"),
        bundle.getString("country")
    );

    }


    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("id", getId());
        bundle.putString("name", getName());
        bundle.putString("description", getDescripction());
        bundle.putString("url", getUrl());
        bundle.putString("category", getCategory());
        bundle.putString("language", getLanguage());
        bundle.putString("country", getCountry());

        return bundle;
    }

}
