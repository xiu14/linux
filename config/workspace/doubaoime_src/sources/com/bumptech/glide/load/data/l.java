package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {
    private final Uri a;
    private final ContentResolver b;

    /* renamed from: c, reason: collision with root package name */
    private T f1572c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t = this.f1572c;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(@NonNull Priority priority, @NonNull d.a<? super T> aVar) {
        try {
            T f2 = f(this.a, this.b);
            this.f1572c = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.c(e2);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
