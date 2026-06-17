package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.thread.ThreadPoolType;
import com.ss.android.ugc.aweme.thread.j;
import e.c.h.f.t;
import e.c.h.f.y;

/* loaded from: classes.dex */
public class b {
    private e.c.h.f.j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> a;
    private g b;

    /* renamed from: c, reason: collision with root package name */
    private int f5356c;

    class a implements y<com.facebook.imagepipeline.image.d> {
        a(b bVar) {
        }

        @Override // e.c.h.f.y
        public int a(com.facebook.imagepipeline.image.d dVar) {
            return dVar.o();
        }
    }

    /* renamed from: com.bytedance.lighten.loader.b$b, reason: collision with other inner class name */
    class C0266b extends e.c.h.f.k {
        C0266b(ActivityManager activityManager) {
            super(activityManager);
        }

        @Override // e.c.h.f.k, e.c.c.d.j
        /* renamed from: a */
        public t get() {
            return new t(b.this.f5356c, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        private static final b a = new b(null);
    }

    b(com.bytedance.lighten.loader.a aVar) {
        Context a2 = com.bytedance.lighten.core.c.a();
        ActivityManager activityManager = (ActivityManager) a2.getSystemService("activity");
        int largeMemoryClass = (int) ((((a2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 10);
        WindowManager windowManager = (WindowManager) a2.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels * displayMetrics.heightPixels * 4 * 4;
        if (largeMemoryClass > i) {
            largeMemoryClass = i;
        } else if (largeMemoryClass < 6291456) {
            largeMemoryClass = 6291456;
        }
        this.f5356c = largeMemoryClass;
        c();
        j.b a3 = com.ss.android.ugc.aweme.thread.j.a(ThreadPoolType.SERIAL);
        a3.i("bitmap-cache");
        this.b = new g(com.ss.android.ugc.aweme.thread.h.a(a3.g()), 10);
    }

    private void c() {
        this.a = new e.c.h.f.j<>(new a(this), new e.c.h.f.d(), new C0266b((ActivityManager) com.bytedance.lighten.core.c.a().getSystemService("activity")));
    }

    public void b() {
        e.c.h.f.j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> jVar = this.a;
        if (jVar != null) {
            try {
                jVar.e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
