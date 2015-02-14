package com.gudap.cleancache.bean;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.text.format.Formatter;

public class CacheInfo {

    String appname;
    long cachesize;
    String cacheSizeText;
    Drawable appicon;
    String packageName;

    public String getAppname() {
        return appname;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    ApplicationInfo ainfo;

    public CacheInfo(Context context, String appname, long cachesize,
                     Drawable appicon2, String pname, ApplicationInfo ainfo) {
        super();
        this.appname = appname;
        this.cachesize = cachesize;
        this.cacheSizeText = Formatter.formatFileSize(context, cachesize);
        this.appicon = appicon2;
        this.ainfo = ainfo;
        packageName = pname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public long getCachesize() {
        return cachesize;
    }

    public void setCachesize(long cachesize) {
        this.cachesize = cachesize;
    }

    public String getCacheSizeText() {
        return cacheSizeText;
    }

    public void setCacheSizeText(String cacheSizeText) {
        this.cacheSizeText = cacheSizeText;
    }

    public Drawable getAppicon() {
        return appicon;
    }

    public void setAppicon(Drawable appicon) {
        this.appicon = appicon;
    }


}
