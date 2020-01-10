package np.com.devish.hamrobazaarreplica.agreement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import np.com.devish.hamrobazaarreplica.R;


public class Terms extends AppCompatActivity {

    private WebView webViewTerms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        webViewTerms = findViewById(R.id.webViewTerms);

        webViewTerms.getSettings().setJavaScriptEnabled(true);
        webViewTerms.getSettings().setAppCacheEnabled(true);
        webViewTerms.setWebViewClient(new WebViewClient());
        webViewTerms.loadUrl("https://hamrobazaar.com/terms.html");

    }
}
