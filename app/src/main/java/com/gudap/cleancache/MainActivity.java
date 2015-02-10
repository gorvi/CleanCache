package com.gudap.cleancache;

import android.widget.RelativeLayout;

/**
 * Created by ghw on 2015/2/10.
 */
public class MainActivity extends BaseActivity {

    RelativeLayout proBar;
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);

    }

    @Override
    public void initViews() {
        proBar = (RelativeLayout) findViewById(R.id.proBar);


    }

    @Override
    public void initListeners() {

    }

    @Override
    public void initData() {

    }
}