package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import java.io.File;
import java.util.Objects;

/* loaded from: classes.dex */
class C {
    private static volatile C o;
    private Context a;
    private MediaProjection b;

    /* renamed from: c, reason: collision with root package name */
    private MediaProjectionManager f4796c;

    /* renamed from: d, reason: collision with root package name */
    private VirtualDisplay f4797d;

    /* renamed from: e, reason: collision with root package name */
    private WindowManager f4798e;

    /* renamed from: f, reason: collision with root package name */
    private ImageReader f4799f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f4800g;
    private boolean h = false;
    private boolean i = true;
    private final File j;
    private final int k;
    private final int l;
    private final int m;
    private final Handler n;

    class a implements e {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        public void a(boolean z) {
            if (z) {
                C.this.n(this.a);
            } else {
                ((u) this.a).a(null);
            }
        }
    }

    class b extends VirtualDisplay.Callback {
        private boolean a = true;
        final /* synthetic */ d b;

        b(d dVar) {
            this.b = dVar;
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
            super.onPaused();
            C.this.h = false;
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
            super.onResumed();
            C.this.h = true;
            if (this.a) {
                this.a = false;
                C.this.o(this.b);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ d a;

        class a implements ImageReader.OnImageAvailableListener {
            a() {
            }

            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                C.this.f4799f.setOnImageAvailableListener(null, null);
                Image acquireLatestImage = C.this.f4799f.acquireLatestImage();
                c cVar = c.this;
                C.f(C.this, acquireLatestImage, cVar.a);
            }
        }

        c(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Image acquireLatestImage = C.this.f4799f.acquireLatestImage();
            if (acquireLatestImage == null) {
                C.this.f4799f.setOnImageAvailableListener(new a(), null);
            } else {
                C.f(C.this, acquireLatestImage, this.a);
            }
        }
    }

    interface d {
    }

    interface e {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r8 != null) goto L7;
     */
    @androidx.annotation.RequiresApi(api = 21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C(@androidx.annotation.NonNull android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.h = r0
            r1 = 1
            r7.i = r1
            android.content.Context r8 = r8.getApplicationContext()
            r7.a = r8
            r7.p()
            android.view.WindowManager r8 = r7.f4798e
            if (r8 == 0) goto L17
            goto L25
        L17:
            android.content.Context r8 = r7.a
            java.lang.String r2 = "window"
            java.lang.Object r8 = r8.getSystemService(r2)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f4798e = r8
            if (r8 == 0) goto L26
        L25:
            r0 = r1
        L26:
            r8 = 300(0x12c, float:4.2E-43)
            r2 = 1920(0x780, float:2.69E-42)
            r3 = 1080(0x438, float:1.513E-42)
            if (r0 == 0) goto L6d
            android.content.Context r0 = r7.a
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r4 = "status_bar_height"
            java.lang.String r5 = "dimen"
            java.lang.String r6 = "android"
            int r0 = r0.getIdentifier(r4, r5, r6)
            if (r0 <= 0) goto L49
            android.content.Context r4 = r7.a
            android.content.res.Resources r4 = r4.getResources()
            r4.getDimensionPixelSize(r0)
        L49:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.WindowManager r4 = r7.f4798e
            android.view.Display r4 = r4.getDefaultDisplay()
            if (r4 != 0) goto L5d
            r7.k = r3
            r7.l = r2
            r7.m = r8
            goto L73
        L5d:
            r4.getRealMetrics(r0)
            int r8 = r0.heightPixels
            r7.l = r8
            int r8 = r0.widthPixels
            r7.k = r8
            int r8 = r0.densityDpi
            r7.m = r8
            goto L73
        L6d:
            r7.k = r3
            r7.l = r2
            r7.m = r8
        L73:
            int r8 = r7.k
            int r0 = r7.l
            r2 = 3
            android.media.ImageReader r8 = android.media.ImageReader.newInstance(r8, r0, r1, r2)
            r7.f4799f = r8
            java.io.File r8 = new java.io.File
            android.content.Context r0 = r7.a
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r1 = "ScreenShot"
            r8.<init>(r0, r1)
            r7.j = r8
            boolean r0 = r8.exists()
            if (r0 != 0) goto L96
            r8.mkdirs()
        L96:
            android.os.HandlerThread r8 = new android.os.HandlerThread
            r8.<init>(r1)
            r8.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r8 = r8.getLooper()
            r0.<init>(r8)
            r7.f4800g = r0
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r8.<init>(r0)
            r7.n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.manager.C.<init>(android.content.Context):void");
    }

    static void f(C c2, Image image, d dVar) {
        Objects.requireNonNull(c2);
        if (dVar == null) {
            return;
        }
        if (image == null) {
            ((u) dVar).a(null);
        } else {
            c2.f4800g.post(new D(c2, image, dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 19)
    public void o(d dVar) {
        if (this.h) {
            this.f4800g.postDelayed(new c(dVar), 100L);
        } else {
            ((u) dVar).a(null);
        }
    }

    @RequiresApi(api = 21)
    private boolean p() {
        if (this.f4796c != null) {
            return true;
        }
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) this.a.getSystemService("media_projection");
        this.f4796c = mediaProjectionManager;
        return mediaProjectionManager != null;
    }

    @RequiresApi(api = 21)
    static C q(@NonNull Context context) {
        if (o == null) {
            synchronized (C.class) {
                if (o == null) {
                    o = new C(context);
                }
            }
        }
        return o;
    }

    @RequiresApi(api = 21)
    void n(d dVar) {
        boolean z;
        if (dVar == null) {
            return;
        }
        if (!p()) {
            ((u) dVar).a(null);
            return;
        }
        a aVar = new a(dVar);
        if (this.b != null) {
            z = true;
        } else {
            TranslucentOnePixelActivity.l(this.a, new E(this, aVar), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
            z = false;
        }
        if (z) {
            if (this.f4797d != null) {
                o(dVar);
                return;
            }
            try {
                this.f4797d = this.b.createVirtualDisplay("ScreenShotManager", this.k, this.l, this.m, 16, this.f4799f.getSurface(), new b(dVar), null);
            } catch (Throwable unused) {
                this.f4797d = null;
                this.b = null;
                com.bytedance.feedbackerlib.model.g.e(this.a).g();
                n(dVar);
            }
        }
    }
}
