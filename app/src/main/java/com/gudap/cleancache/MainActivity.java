package com.gudap.cleancache;

import static com.gudap.cleancache.R.id.item_list_cache_iv_appicon;
import static com.gudap.cleancache.R.id.item_list_cache_tv_appname;
import static com.gudap.cleancache.R.id.item_list_cache_tv_cachesize;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gudap.cleancache.adapter.BaseAdapterHelper;
import com.gudap.cleancache.adapter.QuickAdapter;
import com.gudap.cleancache.bean.CacheInfo;

/**
 * Created by ghw on 2015/2/10.
 */
public class MainActivity extends BaseActivity {

    RelativeLayout include_progress_rlayout_progressbar;
    LinearLayout include_no_data_llayout_nodata;
    TextView include_no_data_tv_nodata;

    RelativeLayout include_action_bar_rlayout_action;
    LinearLayout include_action_bar_llayout_all;

    TextView include_action_bar_tv_name;
    Button include_action_bar_btn_add;

    ListView activity_main_listview_cache;

    protected QuickAdapter<CacheInfo> cacheInfoAdapter;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);

    }

    @Override
    public void initViews() {

        //加载等待的圆圈
        include_progress_rlayout_progressbar = (RelativeLayout) findViewById(R.id.include_progress_rlayout_progressbar);

        //没有数据的情况显示
        include_no_data_llayout_nodata = (LinearLayout)findViewById(R.id.include_no_data_llayout_nodata);
        include_no_data_tv_nodata = (TextView)findViewById(R.id.include_no_data_tv_nodata);

        //顶部的菜单栏ActionBar
        include_action_bar_rlayout_action = (RelativeLayout) findViewById(R.id.include_action_bar_rlayout_action);
        include_action_bar_llayout_all = (LinearLayout) findViewById(R.id.include_action_bar_llayout_all);

        // 默认是按名称Name排序,另外按缓存大小Size排序
        include_action_bar_tv_name = (TextView) findViewById(R.id.include_action_bar_tv_name);
        include_action_bar_tv_name.setTag("Name");

        //缓存的Listview列表
        activity_main_listview_cache = (ListView)findViewById(R.id.activity_main_listview_cache);

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