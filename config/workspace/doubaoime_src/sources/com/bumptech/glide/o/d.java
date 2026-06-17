package com.bumptech.glide.o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class d {
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    private static b b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof b) {
                    return (b) newInstance;
                }
                throw new RuntimeException(e.a.a.a.a.q("Expected instanceof GlideModule, but found: ", newInstance));
            } catch (IllegalAccessException e2) {
                c(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                c(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                c(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                c(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    private static void c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<b> a() {
        ApplicationInfo applicationInfo;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e2);
            }
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(b(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
        }
        return arrayList;
    }
}
