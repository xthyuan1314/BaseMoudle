package com.example.admin.myapplication;

import android.content.Context;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.module.AppGlideModule;


@GlideModule
public class MyGlideMoudle extends AppGlideModule {

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        int diskCache = 1024 * 1024 * 100;
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, "glide", diskCache));

        MemorySizeCalculator calculator = new MemorySizeCalculator.Builder(context).build();
        int defaultMemoryCacheSize =calculator.getMemoryCacheSize();
        int defaultBitmapPoolSize = calculator.getBitmapPoolSize();

        int customMemoryCacheSize =(int)(1.2*defaultMemoryCacheSize);
        int customBitmapPoolSize =(int)(1.2*defaultBitmapPoolSize);

        builder.setMemoryCache(new LruResourceCache(customMemoryCacheSize));
        builder.setBitmapPool(new LruBitmapPool(customBitmapPoolSize));
    }
}
