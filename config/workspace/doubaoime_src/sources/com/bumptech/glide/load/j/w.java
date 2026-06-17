package com.bumptech.glide.load.j;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.j.o;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public class w<Data> implements o<String, Data> {
    private final o<Uri, Data> a;

    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.j.p
        public o<String, AssetFileDescriptor> d(@NonNull s sVar) {
            return new w(sVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<String, ParcelFileDescriptor> d(@NonNull s sVar) {
            return new w(sVar.c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements p<String, InputStream> {
        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<String, InputStream> d(@NonNull s sVar) {
            return new w(sVar.c(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.a = oVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull String str) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a b(@NonNull String str, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        Uri fromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            fromFile = null;
        } else if (str2.charAt(0) == '/') {
            fromFile = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str2)) : parse;
        }
        if (fromFile == null || !this.a.a(fromFile)) {
            return null;
        }
        return this.a.b(fromFile, i, i2, fVar);
    }
}
