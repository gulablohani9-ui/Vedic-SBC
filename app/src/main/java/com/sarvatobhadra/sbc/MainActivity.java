package com.sarvatobhadra.sbc;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Color;
import android.view.View;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b){ super.onCreate(b);
    WebView w=new WebView(this); w.setBackgroundColor(Color.WHITE); w.setWebViewClient(new WebViewClient());
    WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setBuiltInZoomControls(false); s.setDisplayZoomControls(false);
    w.loadUrl("file:///android_asset/index.html"); setContentView(w);
  }
}
