package com.bytedance.lighten.core;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class g {
    private static final f a;
    private static volatile h b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f5338c;

    /* renamed from: d, reason: collision with root package name */
    public static String f5339d;

    static {
        f fVar;
        f fVar2 = null;
        try {
            fVar = (f) Class.forName("com.bytedance.lighten.loader.FrescoImageLoaderDelegate").asSubclass(f.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            fVar = null;
        }
        if (fVar == null) {
            try {
                fVar = (f) Class.forName("com.bytedance.lighten.loader.GlideImageLoaderDelegate").asSubclass(f.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e3) {
                e3.printStackTrace();
                fVar = null;
            }
            if (fVar == null) {
                try {
                    fVar2 = (f) Class.forName("com.bytedance.lighten.loader.PicassoImageLoaderDelegate").asSubclass(f.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                fVar = fVar2 != null ? fVar2 : com.bytedance.lighten.core.l.a.a();
            }
        }
        a = fVar;
    }

    static void a(i iVar) {
        if (!f5338c) {
            Log.e("Lighten:", "display, lighten is not initialized, call Lighten.init");
        } else {
            if (iVar == null) {
                return;
            }
            a.display(iVar);
        }
    }

    public static h b() {
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Lighten:lighten is not initialized, call Lighten.init");
    }

    public static void c(@NonNull h hVar) {
        if (f5338c) {
            return;
        }
        f5338c = true;
        b = hVar;
        f5339d = hVar.b().getPackageName();
        a.init(hVar);
    }

    public static j d(@DrawableRes int i) {
        return a.load(i);
    }

    public static j e(@NonNull Uri uri) {
        return a.load(uri);
    }
}
