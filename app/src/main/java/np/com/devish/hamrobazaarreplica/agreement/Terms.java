package np.com.devish.hamrobazaarreplica.agreement;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.deepak.hamrobazzar.R;

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
