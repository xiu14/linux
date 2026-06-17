package com.bumptech.glide.load.j;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class l implements o<Uri, File> {
    private final Context a;

    public static final class a implements p<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, File> d(s sVar) {
            return new l(this.a);
        }
    }

    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f1712c = {"_data"};
        private final Context a;
        private final Uri b;

        b(Context context, Uri uri) {
            this.a = context;
            this.b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@NonNull Priority priority, @NonNull d.a<? super File> aVar) {
            Cursor query = this.a.getContentResolver().query(this.b, f1712c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            StringBuilder M = e.a.a.a.a.M("Failed to find file path for: ");
            M.append(this.b);
            aVar.c(new FileNotFoundException(M.toString()));
        }
    }

    public l(Context context) {
        this.a = context;
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Uri uri) {
        return com.bumptech.glide.load.data.o.b.a(uri);
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a<File> b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        Uri uri2 = uri;
        return new o.a<>(new com.bumptech.glide.q.b(uri2), new b(this.a, uri2));
    }
}
