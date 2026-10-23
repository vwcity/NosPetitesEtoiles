package fr.maison.mesetoiles;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.Window;
import android.graphics.Color;
import android.webkit.WebSettings;

/** Application hors ligne : toute l'interface et les données sont locales. */
public class MainActivity extends Activity {
    private WebView webView;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.rgb(15, 101, 98));
        getWindow().setNavigationBarColor(Color.WHITE);
        getWindow().getDecorView().setSystemUiVisibility(android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        webView = new WebView(this);
        webView.setBackgroundColor(Color.rgb(247,247,244));
        WebSettings options = webView.getSettings();
        options.setJavaScriptEnabled(true); // Nécessaire pour l'interface interactive locale
        options.setDomStorageEnabled(true); // Sauvegarde des étoiles en localStorage
        options.setAllowFileAccess(true);  // Lecture des seuls assets embarqués
        options.setAllowFileAccessFromFileURLs(false);
        options.setAllowUniversalAccessFromFileURLs(false);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() {
        if(webView != null && webView.canGoBack()) webView.goBack();
        else super.onBackPressed();
    }
    @Override protected void onDestroy() {
        if(webView != null){webView.destroy();webView=null;}
        super.onDestroy();
    }
}
