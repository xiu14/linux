package com.bumptech.glide.load.j;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.j.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class y<Data> implements o<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final c<Data> a;

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.j.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.a, uri);
        }

        @Override // com.bumptech.glide.load.j.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.j.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.a, uri);
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.j.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.a, uri);
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }
    }

    public y(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        Uri uri2 = uri;
        return new o.a(new com.bumptech.glide.q.b(uri2), this.a.a(uri2));
    }
}
