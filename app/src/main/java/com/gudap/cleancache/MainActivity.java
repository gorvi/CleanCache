package com.gudap.cleancache;

import android.widget.RelativeLayout;

import com.gudap.cleancache.adapter.BaseAdapterHelper;
import com.gudap.cleancache.adapter.QuickAdapter;
import com.gudap.cleancache.bean.CacheInfo;

/**
 * Created by ghw on 2015/2/10.
 */
public class MainActivity extends BaseActivity {

    RelativeLayout progressBar;

    protected QuickAdapter<CacheInfo> cacheInfoAdapter;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);

    }

    @Override
    public void initViews() {
        progressBar = (RelativeLayout) findViewById(R.id.progressBar);
    }

    @Override
    public void initListeners() {

    }

    @Override
    public void initData() {
        if (cacheInfoAdapter == null) {
            cacheInfoAdapter = new QuickAdapter<CacheInfo>(this, R.layout.item_list_cache) {
                @Override
                protected void convert(BaseAdapterHelper helper, CacheInfo cacheInfo) {
                    helper.setImageResource()
                    helper.setText(tv_title, lost.getTitle())
                            .setText(tv_describe, lost.getDescribe())
                            .setText(tv_time, lost.getCreatedAt())
                            .setText(tv_photo, lost.getPhone());
                }
            };
        }
    }
}