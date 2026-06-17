package com.bumptech.glide.load.engine.C;

import android.content.Context;
import com.bumptech.glide.load.engine.C.d;
import java.io.File;

/* loaded from: classes.dex */
class f implements d.b {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    f(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // com.bumptech.glide.load.engine.C.d.b
    public File a() {
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        return this.b != null ? new File(cacheDir, this.b) : cacheDir;
    }
}
