package com.bumptech.glide.load.j;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.j.o;
import java.io.InputStream;

/* loaded from: classes.dex */
public class t<Data> implements o<Integer, Data> {
    private final o<Uri, Data> a;
    private final Resources b;

    public static final class a implements p<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // com.bumptech.glide.load.j.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new t(this.a, sVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<Integer, InputStream> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Integer, InputStream> d(s sVar) {
            return new t(this.a, sVar.c(Uri.class, InputStream.class));
        }
    }

    public static class c implements p<Integer, Uri> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Integer, Uri> d(s sVar) {
            return new t(this.a, x.c());
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.b = resources;
        this.a = oVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull Integer num, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num2.intValue()) + '/' + this.b.getResourceTypeName(num2.intValue()) + '/' + this.b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e2);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.b(uri, i, i2, fVar);
    }
}
