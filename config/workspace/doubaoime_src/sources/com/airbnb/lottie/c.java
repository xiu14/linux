package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes.dex */
class c implements com.airbnb.lottie.network.c {
    final /* synthetic */ Context a;

    c(Context context) {
        this.a = context;
    }

    @Override // com.airbnb.lottie.network.c
    @NonNull
    public File a() {
        return new File(this.a.getCacheDir(), "lottie_network_cache");
    }
}
