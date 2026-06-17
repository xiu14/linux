package com.bytedance.feedbackerlib.matisse.internal.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;
import com.bytedance.feedbackerlib.matisse.internal.loader.AlbumMediaLoader;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlbumMediaCollection implements LoaderManager.LoaderCallbacks<Cursor> {
    private WeakReference<Context> a;
    private LoaderManager b;

    /* renamed from: c, reason: collision with root package name */
    private a f4871c;

    public interface a {
        void g();

        void k(Cursor cursor);
    }

    public void a(@Nullable Album album) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", album);
        bundle.putBoolean("args_enable_capture", false);
        this.b.initLoader(2, bundle, this);
    }

    public void b(@Nullable Album album, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", album);
        bundle.putBoolean("args_enable_capture", z);
        this.b.initLoader(2, bundle, this);
    }

    public void c(@NonNull FragmentActivity fragmentActivity, @NonNull a aVar) {
        this.a = new WeakReference<>(fragmentActivity);
        this.b = fragmentActivity.getSupportLoaderManager();
        this.f4871c = aVar;
    }

    public void d() {
        LoaderManager loaderManager = this.b;
        if (loaderManager != null) {
            loaderManager.destroyLoader(2);
        }
        this.f4871c = null;
    }

    public void e(Cursor cursor) {
        if (this.a.get() == null) {
            return;
        }
        this.f4871c.k(cursor);
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        Album album;
        Context context = this.a.get();
        if (context == null || (album = (Album) bundle.getParcelable("args_album")) == null) {
            return null;
        }
        boolean z = false;
        if (album.f() && bundle.getBoolean("args_enable_capture", false)) {
            z = true;
        }
        return AlbumMediaLoader.a(context, album, z);
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public /* bridge */ /* synthetic */ void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        e(cursor);
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader<Cursor> loader) {
        if (this.a.get() == null) {
            return;
        }
        this.f4871c.g();
    }
}
