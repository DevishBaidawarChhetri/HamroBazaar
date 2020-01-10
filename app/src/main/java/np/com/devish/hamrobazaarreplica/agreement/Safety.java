package np.com.devish.hamrobazaarreplica.agreement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import np.com.devish.hamrobazaarreplica.R;


public class Safety extends AppCompatActivity {

    private WebView webViewSafety;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety);

        webViewSafety = findViewById(R.id.webViewSafety);

        webViewSafety.getSettings().setJavaScriptEnabled(true);
        webViewSafety.getSettings().setAppCacheEnabled(true);
        webViewSafety.setWebViewClient(new WebViewClient());
        webViewSafety.loadUrl("https://hamrobazaar.com/safetytips.php");
    }
}