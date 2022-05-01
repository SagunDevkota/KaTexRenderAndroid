package com.sd2.katex_android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class RenderLatex extends LinearLayout {

    private TypedArray attributes;
    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    public RenderLatex(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.render_latex,this);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        attributes = context.obtainStyledAttributes(attrs,R.styleable.RenderLatex);
        setText(attributes.getString(R.styleable.RenderLatex_LaTex));
    }

    public void setText(WebView webView, String latex){
        Log.d("TAG", "setTextRenderLatex: "+latex);
        webView.loadData(LaTexParser.getHtml(latex), "text/html", "UTF-8");
    }
    public void setText(String latex){
        webView.loadData(LaTexParser.getHtml(latex),"text/html","UTF-8");
    }
}