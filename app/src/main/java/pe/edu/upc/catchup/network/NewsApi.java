package pe.edu.upc.catchup.network;

/**
 * Created by RAMOS on 30/04/2018.
 */

public class NewsApi {

    private static String BASE_URL = "https://newsapi.org";

    public static String getTopHeadlinesUrl() {
        return BASE_URL + "/v2/top-headlines";

    }

    public   static  String getEverythingUrl(){
         return BASE_URL + "/v2/everything";
    }

    public   static  String getSourcesUrl(){
        return BASE_URL + "/v2/sources";
    }


}
