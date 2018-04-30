package pe.edu.upc.catchup.network;

/**
 * Created by RAMOS on 30/04/2018.
 */

public class LogoApi {

    private static String BASE_URL = "https://logo.clearbit.com/";
    public static String getUrlToLogo(String url) {
        return BASE_URL + url;
    }

}
