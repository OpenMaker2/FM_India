package com.openmaker.radiogarden;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.MediaController;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    WebView myWebView;
    public static final String ACTION_PLAY = "action_play";
    public static final String ACTION_PAUSE = "action_pause";
    public static final String ACTION_REWIND = "action_rewind";
    public static final String ACTION_FAST_FORWARD = "action_fast_foward";
    public static final String ACTION_NEXT = "action_next";
    public static final String ACTION_PREVIOUS = "action_previous";
    public static final String ACTION_STOP = "action_stop";

    private MediaPlayer mMediaPlayer;
    private MediaSessionManager mManager;
    private MediaSession mSession;
    private MediaController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


          myWebView = (WebView) findViewById(R.id.radiogarden);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.getSettings().setDatabaseEnabled(true);
        myWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        myWebView.getSettings().setAppCacheEnabled(true);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.radio1switch);
        ToggleButton toggle2 = (ToggleButton) findViewById(R.id.radio2button);
        ToggleButton toggle3 = (ToggleButton) findViewById(R.id.radio3button);


        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    //myWebView.loadUrl("http://50.7.71.27:9699/;stream.mp3");

                } else {
                    // The toggle is disabled

                    myWebView.loadUrl("about:blank");

                }
            }
        });

        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    myWebView.loadUrl("http://s2.voscast.com:10616/;stream1493622076708/1");
                } else {
                    // The toggle is disabled
                    myWebView.loadUrl("about:blank");

                }
            }
        });
        toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    myWebView.loadUrl("http://192.240.102.198:14349/stream?type=http&nocache=2");
                } else {
                    // The toggle is disabled
                    myWebView.loadUrl("about:blank");

                }
            }
        });

    }
}
