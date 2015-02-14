package com.gudap.cleancache;

import static com.gudap.cleancache.R.id.item_list_cache_iv_appicon;
import static com.gudap.cleancache.R.id.item_list_cache_tv_appname;
import static com.gudap.cleancache.R.id.item_list_cache_tv_cachesize;

import android.widget.ListView;
import android.widget.RelativeLayout;

import com.gudap.cleancache.adapter.BaseAdapterHelper;
import com.gudap.cleancache.adapter.QuickAdapter;
import com.gudap.cleancache.bean.CacheInfo;

/**
 * Created by ghw on 2015/2/10.
 */
public class MainActivity extends BaseActivity {

    ListView listView_cache;

    RelativeLayout progressBar;

    protected QuickAdapter<CacheInfo> cacheInfoAdapter;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);

    }

    @Override
    public void initViews() {
        progressBar = (RelativeLayout) findViewById(R.id.progressBar);
        listView_cache = (ListView)findViewById(R.id.list_cache);


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
                    helper.setImageDrawable(item_list_cache_iv_appicon, cacheInfo.getAppicon())
                            .setText(item_list_cache_tv_appname, cacheInfo.getAppname())
                            .setText(item_list_cache_tv_cachesize, cacheInfo.getCacheSizeText());
                }
            };
        }
    }
}