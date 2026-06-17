package com.bytedance.lighten.core.m;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.lighten.core.e;

/* loaded from: classes.dex */
public interface b {
    void a(Uri uri, @Nullable e eVar);

    void b(Uri uri, @Nullable View view);

    void c(Uri uri);

    void d(Uri uri, @Nullable View view, @Nullable Throwable th);

    void e(Uri uri, Throwable th);

    void f(Uri uri, @Nullable View view, @Nullable e eVar, @Nullable Animatable animatable);
}
