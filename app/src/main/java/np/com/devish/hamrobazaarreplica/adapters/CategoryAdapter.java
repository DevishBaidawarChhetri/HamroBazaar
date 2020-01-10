package np.com.devish.hamrobazaarreplica.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import np.com.devish.hamrobazaarreplica.R;
import np.com.devish.hamrobazaarreplica.model.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolders> {

    List<Category> categoryList;
    Context context;


    public CategoryAdapter(List<Category> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_category, parent,false);
        return new CategoryViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolders holder, int position) {
        final Category category = categoryList.get(position);

        holder.imgCatIcon.setImageResource(category.getIcons());
        holder.tvCategory.setText(category.getCategory());


    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class CategoryViewHolders extends RecyclerView.ViewHolder{
        ImageView imgCatIcon;
        TextView tvCategory;


        public CategoryViewHolders(@NonNull View itemView) {
            super(itemView);

            imgCatIcon = itemView.findViewById(R.id.imgCatIcon);
            tvCategory = itemView.findViewById(R.id.tvCategory);
        }
    }
}
