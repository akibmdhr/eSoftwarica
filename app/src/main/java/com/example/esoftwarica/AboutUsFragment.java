package com.example.esoftwarica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutUsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_aboutus, container, false);
        WebView webView=(WebView)v.findViewById (R.id.webView);
        webView.getSettings ().setJavaScriptEnabled (true);
        webView.setWebViewClient (new WebViewClient ());
        webView.loadUrl("https://softwarica.edu.np/");
    return v;
    }
}
