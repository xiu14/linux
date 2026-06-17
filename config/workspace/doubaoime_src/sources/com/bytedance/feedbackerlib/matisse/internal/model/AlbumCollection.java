package com.bytedance.feedbackerlib.matisse.internal.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.bytedance.feedbackerlib.matisse.internal.loader.AlbumLoader;
import com.bytedance.feedbackerlib.matisse.ui.MatisseActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlbumCollection implements LoaderManager.LoaderCallbacks<Cursor> {
    private WeakReference<Context> a;
    private LoaderManager b;

    /* renamed from: c, reason: collision with root package name */
    private a f4868c;

    /* renamed from: d, reason: collision with root package name */
    private int f4869d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4870e;

    public interface a {
    }

    public int a() {
        return this.f4869d;
    }

    public void b() {
        this.b.initLoader(1, null, this);
    }

    public void c(FragmentActivity fragmentActivity, a aVar) {
        this.a = new WeakReference<>(fragmentActivity);
        this.b = fragmentActivity.getSupportLoaderManager();
        this.f4868c = aVar;
    }

    public void d() {
        LoaderManager loaderManager = this.b;
        if (loaderManager != null) {
            loaderManager.destroyLoader(1);
        }
        this.f4868c = null;
    }

    public void e(Cursor cursor) {
        if (this.a.get() == null || this.f4870e) {
            return;
        }
        this.f4870e = true;
        ((MatisseActivity) this.f4868c).r(cursor);
    }

    public void f(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f4869d = bundle.getInt("state_current_selection");
    }

    public void g(Bundle bundle) {
        bundle.putInt("state_current_selection", this.f4869d);
    }

    public void h(int i) {
        this.f4869d = i;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        Context context = this.a.get();
        if (context == null) {
            return null;
        }
        this.f4870e = false;
        return AlbumLoader.c(context);
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
        ((MatisseActivity) this.f4868c).s();
    }
}
