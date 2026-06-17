package com.bytedance.android.input.basic.image;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.m;
import java.io.File;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeGlideConfig extends com.bumptech.glide.o.a {
    @Override // com.bumptech.glide.o.a
    public void b(Context context, com.bumptech.glide.d dVar) {
        l.f(context, "context");
        l.f(dVar, "builder");
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        DecodeFormat decodeFormat = DecodeFormat.PREFER_RGB_565;
        Objects.requireNonNull(decodeFormat, "Argument must not be null");
        dVar.b(hVar.U(m.f1748f, decodeFormat).U(com.bumptech.glide.load.resource.gif.h.a, decodeFormat).X(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH));
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            dVar.c(new com.bumptech.glide.load.engine.C.d(cacheDir.getAbsolutePath(), "ime_glide_cache", 52428800L));
        }
        dVar.d(new com.bumptech.glide.load.engine.C.h(20971520L));
    }

    @Override // com.bumptech.glide.o.a
    public boolean c() {
        return false;
    }
}
