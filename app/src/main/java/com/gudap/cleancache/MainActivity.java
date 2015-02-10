package com.gudap.cleancache;

import android.widget.RelativeLayout;

/**
 * Created by ghw on 2015/2/10.
 */
public class MainActivity extends BaseActivity {

    RelativeLayout relativeLayout_progressBar;
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);

    }

    @Override
    public void initViews() {
        relativeLayout_progressBar = (RelativeLayout) findViewById(R.id.relativeLayout_progressBar);


    }

    @Override
    public void initListeners() {

    }

    @Override
    public void initData() {

    }
}
