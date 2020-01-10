package np.com.devish.hamrobazaarreplica.agreement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import np.com.devish.hamrobazaarreplica.R;


public class AdPostingRule extends AppCompatActivity {


    WebView webViewAdPosting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_posting_rule);


        webViewAdPosting= findViewById(R.id.webViewAdPosting);

        webViewAdPosting.getSettings().setJavaScriptEnabled(true);
        webViewAdPosting.getSettings().setAppCacheEnabled(true);
        webViewAdPosting.setWebViewClient(new WebViewClient());
        webViewAdPosting.loadUrl("https://hamrobazaar.com/postrules.html");

    }
}