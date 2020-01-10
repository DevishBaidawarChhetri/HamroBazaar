package np.com.devish.hamrobazaarreplica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import np.com.devish.hamrobazaarreplica.adapters.ImageSliderAdapter;

public class MainActivity extends AppCompatActivity {

    Toolbar mainToolbar;

    ImageView imgLoginIcon;

    //Category Recycler View
    RecyclerView rvCategory, rvTrendingProducts, rvRecentlyListedAds;

    ViewPager viewPager;

    LinearLayout sliderDotsPanel;
    private int dotscount;
    private ImageView[] dots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLoginIcon = findViewById(R.id.imgLoginIcon);
        imgLoginIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

        viewPager = findViewById(R.id.imageSlider);

        //For Indicators
        sliderDotsPanel = (LinearLayout) findViewById(R.id.sliderDots);


        ImageSliderAdapter adapter = new ImageSliderAdapter(this);
        viewPager.setAdapter(adapter);

        //Indicator
        dotscount = adapter.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.default_indicator    ));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotsPanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.selected_indicator));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.default_indicator));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.selected_indicator));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //------------Category Recycler View------------//
        rvCategory = findViewById(R.id.rvCategory);

        //Create a list of category
        List<Category> categoryList = new ArrayList<>();

        categoryList.add(new Category(R.drawable.post_free_ad, "Post FREE Ad"));
        categoryList.add(new Category(R.drawable.mobile_handset,"Mobile Handset"));
        categoryList.add(new Category(R.drawable.laptop,"Laptops / Notebooks"));
        categoryList.add(new Category(R.drawable.houses_for_sale,"Rental Houses"));
        categoryList.add(new Category(R.drawable.furnitures_for_home,"Furnitures for Home"));
        categoryList.add(new Category(R.drawable.rental_houses, "Houses for Sale"));
        categoryList.add(new Category(R.drawable.see_more_categories, "See More Categories"));



        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryList,this);
        rvCategory.setAdapter(categoryAdapter);
        rvCategory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //------------Ending Category Recycler View------------//



        //------------Trending Product Recycler View------------//
        rvTrendingProducts = findViewById(R.id.rvTrendingProducts);

        //Create a list of category
        List<Products> productsList = new ArrayList<>();

        productsList.add(new Products("Iphone 6s 16gb", R.drawable.iphone, "Rs.10,000", "(Used)"));
        productsList.add(new Products("21 gear black Mountain Bike", R.drawable.mountain_bike, "Rs.10,000", "(Used)"));
        productsList.add(new Products("Iphone 6s 16gb", R.drawable.iphone, "Rs.10,000", "(Used)"));
        productsList.add(new Products("21 gear black Mountain Bike", R.drawable.mountain_bike, "Rs.10,000", "(Used)"));productsList.add(new Products("Iphone 6s 16gb", R.drawable.iphone, "Rs.10,000", "(Used)"));
        productsList.add(new Products("21 gear black Mountain Bike", R.drawable.mountain_bike, "Rs.10,000", "(Used)"));


        ProductAdapter productAdapter= new ProductAdapter(productsList,this);
        rvTrendingProducts.setAdapter(productAdapter);
        rvTrendingProducts.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        //------------Ending Category Recycler View------------//





        //------------Recently Listed Ads Product Recycler View------------//
        rvRecentlyListedAds = findViewById(R.id.rvRecentlyListedAds);

        //Create a list of category
        List<Products> recentProductsList = new ArrayList<>();

        recentProductsList.add(new Products("21 gear black Mountain Bike", R.drawable.mountain_bike, "Rs.10,000", "(Used)"));
        recentProductsList.add(new Products("Iphone 6s 16gb", R.drawable.iphone, "Rs.10,000", "(Used)"));
        recentProductsList.add(new Products("21 gear black Mountain Bike", R.drawable.mountain_bike, "Rs.10,000", "(Used)"));productsList.add(new Products("Iphone 6s 16gb", R.drawable.iphone, "Rs.10,000", "(Used)"));
        recentProductsList.add(new Products("Iphone 6s 16gb", R.drawable.iphone, "Rs.10,000", "(Used)"));
        recentProductsList.add(new Products("21 gear black Mountain Bike", R.drawable.mountain_bike, "Rs.10,000", "(Used)"));
        recentProductsList.add(new Products("Iphone 6s 16gb", R.drawable.iphone, "Rs.10,000", "(Used)"));


        ProductAdapter recentProductAdapter= new ProductAdapter(recentProductsList,this);
        rvRecentlyListedAds.setAdapter(recentProductAdapter);
        rvRecentlyListedAds.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        //------------Ending Category Recycler View------------//
    }

    private boolean pagerMoved = false;
    private static final long ANIM_VIEWPAGER_DELAY = 5000;

    private Handler h = new Handler();

    private Runnable animateViewPager = new Runnable() {
        @Override
        public void run() {

            if (!pagerMoved){
                if (viewPager.getCurrentItem() == viewPager.getChildCount()){
                    viewPager.setCurrentItem(0,true);
                }
                else {
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1, true);
                }
                pagerMoved = false;
                h.postDelayed(animateViewPager, ANIM_VIEWPAGER_DELAY);
            }
        }
    };

    @Override
    protected void onPause() {
        super.onPause();

        if (h != null){
            h.removeCallbacks(animateViewPager);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        h.postDelayed(animateViewPager,ANIM_VIEWPAGER_DELAY);
    }
}
