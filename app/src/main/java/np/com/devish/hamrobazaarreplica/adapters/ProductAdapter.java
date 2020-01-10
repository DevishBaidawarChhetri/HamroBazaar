package np.com.devish.hamrobazaarreplica.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;

import java.util.List;

import np.com.devish.hamrobazaarreplica.R;
import np.com.devish.hamrobazaarreplica.model.Products;
import np.com.devish.hamrobazaarreplica.url.Url;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolders>{

    List<Products> productsList;
    Context context;

    public ProductAdapter(List<Products> productsList, Context context) {
        this.productsList = productsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_product,parent,false);
        return new ProductViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolders holder, int position) {
        final Products products = productsList.get(position);

        holder.tvProductName.setText(products.getProductName());
        holder.tvPrice.setText(products.getProductPrice());
        holder.tvUserOrNot.setText(products.getProductUseOrNot());

        String image = products.getProductImage();
        String imgPath = Url.imageProductPath+image;
        Picasso.get().load(imgPath).into(holder.imgProduct);
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public class ProductViewHolders extends RecyclerView.ViewHolder{

        TextView tvProductName, tvPrice, tvUserOrNot;
        ImageView imgProduct;

        public ProductViewHolders(@NonNull View itemView) {
            super(itemView);

            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvUserOrNot = itemView.findViewById(R.id.tvUserOrNot);

            imgProduct = itemView.findViewById(R.id.imgProduct);

        }
    }
}