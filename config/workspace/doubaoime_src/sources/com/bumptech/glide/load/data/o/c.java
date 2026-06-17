package com.bumptech.glide.load.data.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {
    private final Uri a;
    private final e b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f1574c;

    static class a implements d {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.o.d
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.o.d
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    c(Uri uri, e eVar) {
        this.a = uri;
        this.b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.b(context).h().f(), dVar, com.bumptech.glide.c.b(context).c(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f1574c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
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
    public void e(@NonNull Priority priority, @NonNull d.a<? super InputStream> aVar) {
        try {
            InputStream b2 = this.b.b(this.a);
            int a2 = b2 != null ? this.b.a(this.a) : -1;
            if (a2 != -1) {
                b2 = new g(b2, a2);
            }
            this.f1574c = b2;
            aVar.f(b2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.c(e2);
        }
    }
}
