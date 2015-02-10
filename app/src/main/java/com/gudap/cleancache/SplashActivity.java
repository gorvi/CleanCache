package com.gudap.cleancache;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/**
 * 闪屏页面
 */
public class SplashActivity extends BaseActivity {

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_splash);
    }

    @Override
    public void initViews() {
    }

    @Override
    public void initListeners() {

    }

    @Override
    public void initData() {
        handler.sendEmptyMessageDelayed(GO_HOME, 3000);
    }

    public void goHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    private static final int GO_HOME = 100;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case GO_HOME:
                    goHome();
                    showToast("gohome!");
                    break;
            }
        }
    };
}
