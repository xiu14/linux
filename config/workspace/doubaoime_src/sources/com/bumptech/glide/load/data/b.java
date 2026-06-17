package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {
    private final String a;
    private final AssetManager b;

    /* renamed from: c, reason: collision with root package name */
    private T f1561c;

    public b(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t = this.f1561c;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
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
    public void e(@NonNull Priority priority, @NonNull d.a<? super T> aVar) {
        try {
            T f2 = f(this.b, this.a);
            this.f1561c = f2;
            aVar.f(f2);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.c(e2);
        }
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;
}
