package np.com.devish.hamrobazaarreplica.url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {
    // public static final String base_url = "http://192.168.1.11:3024/";
    public static final String base_url = "http://10.0.2.2:3024/";
    // public static final String base_url = "http://172.100.100.5:3024/";
    public static String token = "Bearer ";
    public static String imageUserPath = base_url + "uploads/users/";
    public static String imageProductPath = base_url + "uploads/products/";

    public static Retrofit getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
