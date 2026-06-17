package com.bumptech.glide.load.j.A;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j.o;
import com.bumptech.glide.load.j.p;
import com.bumptech.glide.load.j.s;
import com.bumptech.glide.load.resource.bitmap.C;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements o<Uri, InputStream> {
    private final Context a;

    public static class a implements p<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, InputStream> d(s sVar) {
            return new c(this.a);
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return com.bumptech.glide.load.data.o.b.a(uri2) && uri2.getPathSegments().contains("video");
    }

    @Override // com.bumptech.glide.load.j.o
    @Nullable
    public o.a<InputStream> b(@NonNull Uri uri, int i, int i2, @NonNull f fVar) {
        Uri uri2 = uri;
        if (com.bumptech.glide.load.data.o.b.b(i, i2)) {
            Long l = (Long) fVar.c(C.f1737d);
            if (l != null && l.longValue() == -1) {
                return new o.a<>(new com.bumptech.glide.q.b(uri2), com.bumptech.glide.load.data.o.c.g(this.a, uri2));
            }
        }
        return null;
    }
}
