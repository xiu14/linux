package com.bumptech.glide.load.j;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.j.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class z<Data> implements o<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final o<h, Data> a;

    public static class a implements p<Uri, InputStream> {
        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, InputStream> d(s sVar) {
            return new z(sVar.c(h.class, InputStream.class));
        }
    }

    public z(o<h, Data> oVar) {
        this.a = oVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        return this.a.b(new h(uri.toString()), i, i2, fVar);
    }
}
