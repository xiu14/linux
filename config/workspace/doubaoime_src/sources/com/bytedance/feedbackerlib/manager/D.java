package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.manager.C;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class D implements Runnable {
    final /* synthetic */ Image a;
    final /* synthetic */ C.d b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C f4802c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((u) D.this.b).a(null);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Uri a;

        b(Uri uri) {
            this.a = uri;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((u) D.this.b).a(this.a);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((u) D.this.b).a(null);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((u) D.this.b).a(null);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((u) D.this.b).a(null);
        }
    }

    D(C c2, Image image, C.d dVar) {
        this.f4802c = c2;
        this.a = image;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    @RequiresApi(api = 21)
    public void run() {
        File file;
        Handler handler;
        Handler handler2;
        boolean z;
        Context context;
        int i;
        int i2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        c cVar;
        boolean z2;
        Context context2;
        int i3;
        int i4;
        Handler handler6;
        Handler handler7;
        boolean z3;
        Context context3;
        int i5;
        int i6;
        Handler handler8;
        Handler handler9;
        Handler handler10;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        Image.Plane[] planes = this.a.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        int pixelStride = planes[0].getPixelStride();
        Bitmap createBitmap = Bitmap.createBitmap(((planes[0].getRowStride() - (pixelStride * width)) / pixelStride) + width, height, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(buffer);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, width, height);
        this.a.close();
        StringBuilder sb = new StringBuilder();
        file = this.f4802c.j;
        sb.append(file.getPath());
        sb.append("/");
        sb.append(System.currentTimeMillis());
        sb.append(".jpeg");
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            handler = this.f4802c.n;
            handler.post(new e());
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (!file2.createNewFile()) {
                handler9 = this.f4802c.n;
                handler9.post(new a());
                handler10 = this.f4802c.n;
                handler10.post(new d());
                return;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                createBitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    z3 = this.f4802c.i;
                    if (z3) {
                        this.f4802c.i = false;
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                        this.f4802c.n(this.b);
                    } else {
                        context3 = this.f4802c.a;
                        long currentTimeMillis = System.currentTimeMillis();
                        i5 = this.f4802c.k;
                        i6 = this.f4802c.l;
                        Uri d2 = com.bytedance.feedbackerlib.util.f.d(context3, file2, currentTimeMillis, i5, i6);
                        handler8 = this.f4802c.n;
                        handler8.post(new b(d2));
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    handler5 = this.f4802c.n;
                    cVar = new c();
                    handler5.post(cVar);
                }
            } catch (IOException unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream == null) {
                    handler7 = this.f4802c.n;
                    handler7.post(new d());
                    return;
                }
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    z2 = this.f4802c.i;
                    if (z2) {
                        this.f4802c.i = false;
                        try {
                            file2.delete();
                        } catch (Throwable unused3) {
                        }
                        this.f4802c.n(this.b);
                    } else {
                        context2 = this.f4802c.a;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        i3 = this.f4802c.k;
                        i4 = this.f4802c.l;
                        Uri d3 = com.bytedance.feedbackerlib.util.f.d(context2, file2, currentTimeMillis2, i3, i4);
                        handler6 = this.f4802c.n;
                        handler6.post(new b(d3));
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    handler5 = this.f4802c.n;
                    cVar = new c();
                    handler5.post(cVar);
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        z = this.f4802c.i;
                        if (z) {
                            this.f4802c.i = false;
                            try {
                                file2.delete();
                            } catch (Throwable unused4) {
                            }
                            this.f4802c.n(this.b);
                        } else {
                            context = this.f4802c.a;
                            long currentTimeMillis3 = System.currentTimeMillis();
                            i = this.f4802c.k;
                            i2 = this.f4802c.l;
                            Uri d4 = com.bytedance.feedbackerlib.util.f.d(context, file2, currentTimeMillis3, i, i2);
                            handler3 = this.f4802c.n;
                            handler3.post(new b(d4));
                        }
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        handler2 = this.f4802c.n;
                        handler2.post(new c());
                    }
                } else {
                    handler4 = this.f4802c.n;
                    handler4.post(new d());
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
