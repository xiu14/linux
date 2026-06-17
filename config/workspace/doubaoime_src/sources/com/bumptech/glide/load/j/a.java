package com.bumptech.glide.load.j;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.j.o;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a<Data> implements o<Uri, Data> {
    private final AssetManager a;
    private final InterfaceC0032a<Data> b;

    /* renamed from: com.bumptech.glide.load.j.a$a, reason: collision with other inner class name */
    public interface InterfaceC0032a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0032a<AssetFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.bumptech.glide.load.j.a.InterfaceC0032a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new a(this.a, this);
        }
    }

    public static class c implements p<Uri, InputStream>, InterfaceC0032a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.bumptech.glide.load.j.a.InterfaceC0032a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, InputStream> d(s sVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0032a<Data> interfaceC0032a) {
        this.a = assetManager;
        this.b = interfaceC0032a;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        Uri uri2 = uri;
        return new o.a(new com.bumptech.glide.q.b(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }
}
