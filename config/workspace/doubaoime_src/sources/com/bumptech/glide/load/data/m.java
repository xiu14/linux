package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    protected void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    protected InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
