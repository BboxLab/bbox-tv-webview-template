package fr.bouyguestelecom.webviewtemplate;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.RelativeLayout;

import fr.bouyguestelecom.bboxapi.android.tv.activity.BboxActivity;


public class MyActivity extends BboxActivity {

    /*
    ** Set your index file.
    ** For a remote website: "http://www.example.com/index.html"
    ** For a local website (in src/main/assets folder): "file:///android_asset/index.html"
    */

    public static String WEBAPP_URL = "file:///android_asset/index.html";

    private WebView webView = null;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        webView = (WebView) findViewById(R.id.webView);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        // Init video and web views
        initWebView(WEBAPP_URL, webView, relativeLayout);

        loadWebView();
    }
}
