package np.com.devish.hamrobazaarreplica.api;


import java.util.List;

import np.com.devish.hamrobazaarreplica.model.Products;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductAPI {

    @GET("products/allProducts")
    Call<List<Products>> getAllProducts();
}
