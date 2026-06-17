package com.bytedance.bdinstall;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class BDInstallProvider extends ContentProvider {
    private static String a;
    private static UriMatcher b;

    /* renamed from: c, reason: collision with root package name */
    private static Uri f3941c;

    /* renamed from: d, reason: collision with root package name */
    private static Context f3942d;

    public BDInstallProvider() {
        try {
            e0.j(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static synchronized Uri a(Context context, String str) {
        Uri build;
        synchronized (BDInstallProvider.class) {
            if (f3941c == null) {
                try {
                    c(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            build = f3941c.buildUpon().appendPath(str).build();
        }
        return build;
    }

    static Context b() {
        return f3942d;
    }

    private static void c(Context context) throws IllegalStateException {
        String c2;
        if (TextUtils.isEmpty(a)) {
            String name = BDInstallProvider.class.getName();
            if (context == null) {
                c2 = null;
            } else {
                try {
                    if (!TextUtils.isEmpty(name)) {
                        for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                            if (name.equals(providerInfo.name)) {
                                c2 = providerInfo.authority;
                                break;
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                c2 = e.a.a.a.a.c(context, new StringBuilder(), ".bdinstall.provider");
            }
            a = c2;
        }
        if (TextUtils.isEmpty(a)) {
            throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI(a, "*/*", 65536);
        f3941c = Uri.parse("content://" + a);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        f3942d = context;
        if (providerInfo != null) {
            a = providerInfo.authority;
        }
        e0.j(true);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return e.a.a.a.a.J(e.a.a.a.a.M("vnd.android.cursor.item/vnd."), a, ".item");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (b == null) {
            try {
                c(getContext());
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        try {
            Context context = getContext();
            int i = e0.f3978d;
            if (!(context instanceof Application) && context != null) {
                context = context.getApplicationContext();
            }
            C0629i.g((Application) context);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
