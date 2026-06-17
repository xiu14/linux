package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.bumptech.glide.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.j.A.a;
import com.bumptech.glide.load.j.A.b;
import com.bumptech.glide.load.j.A.c;
import com.bumptech.glide.load.j.A.d;
import com.bumptech.glide.load.j.A.e;
import com.bumptech.glide.load.j.a;
import com.bumptech.glide.load.j.b;
import com.bumptech.glide.load.j.d;
import com.bumptech.glide.load.j.e;
import com.bumptech.glide.load.j.g;
import com.bumptech.glide.load.j.l;
import com.bumptech.glide.load.j.t;
import com.bumptech.glide.load.j.u;
import com.bumptech.glide.load.j.v;
import com.bumptech.glide.load.j.w;
import com.bumptech.glide.load.j.x;
import com.bumptech.glide.load.j.y;
import com.bumptech.glide.load.j.z;
import com.bumptech.glide.load.k.d.a;
import com.bumptech.glide.load.resource.bitmap.B;
import com.bumptech.glide.load.resource.bitmap.C;
import com.bumptech.glide.load.resource.bitmap.C0501a;
import com.bumptech.glide.load.resource.bitmap.C0502b;
import com.bumptech.glide.load.resource.bitmap.C0503c;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
final class i {
    static g a(c cVar, List<com.bumptech.glide.o.b> list, @Nullable com.bumptech.glide.o.a aVar) {
        com.bumptech.glide.load.g gVar;
        com.bumptech.glide.load.g zVar;
        Object obj;
        int i;
        Object obj2;
        com.bumptech.glide.load.engine.B.d d2 = cVar.d();
        com.bumptech.glide.load.engine.B.b c2 = cVar.c();
        Context applicationContext = cVar.g().getApplicationContext();
        f g2 = cVar.g().g();
        g gVar2 = new g();
        gVar2.n(new com.bumptech.glide.load.resource.bitmap.l());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            gVar2.n(new p());
        }
        Resources resources = applicationContext.getResources();
        List<ImageHeaderParser> f2 = gVar2.f();
        com.bumptech.glide.load.resource.gif.a aVar2 = new com.bumptech.glide.load.resource.gif.a(applicationContext, f2, d2, c2);
        com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> f3 = C.f(d2);
        m mVar = new m(gVar2.f(), resources.getDisplayMetrics(), d2, c2);
        if (i2 < 28 || !g2.a(d.c.class)) {
            gVar = new com.bumptech.glide.load.resource.bitmap.g(mVar);
            zVar = new z(mVar, c2);
        } else {
            zVar = new t();
            gVar = new com.bumptech.glide.load.resource.bitmap.h();
        }
        if (i2 >= 28) {
            i = i2;
            obj = Integer.class;
            gVar2.e("Animation", InputStream.class, Drawable.class, com.bumptech.glide.load.k.e.a.f(f2, c2));
            gVar2.e("Animation", ByteBuffer.class, Drawable.class, com.bumptech.glide.load.k.e.a.a(f2, c2));
        } else {
            obj = Integer.class;
            i = i2;
        }
        com.bumptech.glide.load.k.e.e eVar = new com.bumptech.glide.load.k.e.e(applicationContext);
        C0503c c0503c = new C0503c(c2);
        com.bumptech.glide.load.k.g.a aVar3 = new com.bumptech.glide.load.k.g.a();
        com.bumptech.glide.load.k.g.d dVar = new com.bumptech.glide.load.k.g.d();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        gVar2.a(ByteBuffer.class, new com.bumptech.glide.load.j.c());
        gVar2.a(InputStream.class, new v(c2));
        gVar2.e("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        gVar2.e("Bitmap", InputStream.class, Bitmap.class, zVar);
        if (ParcelFileDescriptorRewinder.c()) {
            obj2 = com.bumptech.glide.n.a.class;
            gVar2.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new com.bumptech.glide.load.resource.bitmap.v(mVar));
        } else {
            obj2 = com.bumptech.glide.n.a.class;
        }
        gVar2.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C.c(d2));
        gVar2.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, f3);
        gVar2.d(Bitmap.class, Bitmap.class, x.a.a());
        gVar2.e("Bitmap", Bitmap.class, Bitmap.class, new B());
        gVar2.b(Bitmap.class, c0503c);
        gVar2.e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0501a(resources, gVar));
        gVar2.e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0501a(resources, zVar));
        gVar2.e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0501a(resources, f3));
        gVar2.b(BitmapDrawable.class, new C0502b(d2, c0503c));
        gVar2.e("Animation", InputStream.class, GifDrawable.class, new com.bumptech.glide.load.resource.gif.i(f2, aVar2, c2));
        gVar2.e("Animation", ByteBuffer.class, GifDrawable.class, aVar2);
        gVar2.b(GifDrawable.class, new com.bumptech.glide.load.resource.gif.c());
        Object obj3 = obj2;
        gVar2.d(obj3, obj3, x.a.a());
        gVar2.e("Bitmap", obj3, Bitmap.class, new com.bumptech.glide.load.resource.gif.g(d2));
        gVar2.c(Uri.class, Drawable.class, eVar);
        gVar2.c(Uri.class, Bitmap.class, new com.bumptech.glide.load.resource.bitmap.x(eVar, d2));
        gVar2.o(new a.C0037a());
        gVar2.d(File.class, ByteBuffer.class, new d.b());
        gVar2.d(File.class, InputStream.class, new g.e());
        gVar2.c(File.class, File.class, new com.bumptech.glide.load.k.f.a());
        gVar2.d(File.class, ParcelFileDescriptor.class, new g.b());
        gVar2.d(File.class, File.class, x.a.a());
        gVar2.o(new k.a(c2));
        if (ParcelFileDescriptorRewinder.c()) {
            gVar2.o(new ParcelFileDescriptorRewinder.a());
        }
        com.bumptech.glide.load.j.p<Integer, InputStream> e2 = com.bumptech.glide.load.j.f.e(applicationContext);
        com.bumptech.glide.load.j.p<Integer, AssetFileDescriptor> c3 = com.bumptech.glide.load.j.f.c(applicationContext);
        com.bumptech.glide.load.j.p<Integer, Drawable> d3 = com.bumptech.glide.load.j.f.d(applicationContext);
        Class cls = Integer.TYPE;
        gVar2.d(cls, InputStream.class, e2);
        Object obj4 = obj;
        gVar2.d(obj4, InputStream.class, e2);
        gVar2.d(cls, AssetFileDescriptor.class, c3);
        gVar2.d(obj4, AssetFileDescriptor.class, c3);
        gVar2.d(cls, Drawable.class, d3);
        gVar2.d(obj4, Drawable.class, d3);
        gVar2.d(Uri.class, InputStream.class, u.d(applicationContext));
        gVar2.d(Uri.class, AssetFileDescriptor.class, u.c(applicationContext));
        t.c cVar2 = new t.c(resources);
        t.a aVar4 = new t.a(resources);
        t.b bVar = new t.b(resources);
        gVar2.d(obj4, Uri.class, cVar2);
        gVar2.d(cls, Uri.class, cVar2);
        gVar2.d(obj4, AssetFileDescriptor.class, aVar4);
        gVar2.d(cls, AssetFileDescriptor.class, aVar4);
        gVar2.d(obj4, InputStream.class, bVar);
        gVar2.d(cls, InputStream.class, bVar);
        gVar2.d(String.class, InputStream.class, new e.c());
        gVar2.d(Uri.class, InputStream.class, new e.c());
        gVar2.d(String.class, InputStream.class, new w.c());
        gVar2.d(String.class, ParcelFileDescriptor.class, new w.b());
        gVar2.d(String.class, AssetFileDescriptor.class, new w.a());
        gVar2.d(Uri.class, InputStream.class, new a.c(applicationContext.getAssets()));
        gVar2.d(Uri.class, AssetFileDescriptor.class, new a.b(applicationContext.getAssets()));
        gVar2.d(Uri.class, InputStream.class, new b.a(applicationContext));
        gVar2.d(Uri.class, InputStream.class, new c.a(applicationContext));
        if (i >= 29) {
            gVar2.d(Uri.class, InputStream.class, new d.c(applicationContext));
            gVar2.d(Uri.class, ParcelFileDescriptor.class, new d.b(applicationContext));
        }
        gVar2.d(Uri.class, InputStream.class, new y.d(contentResolver));
        gVar2.d(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver));
        gVar2.d(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver));
        gVar2.d(Uri.class, InputStream.class, new z.a());
        gVar2.d(URL.class, InputStream.class, new e.a());
        gVar2.d(Uri.class, File.class, new l.a(applicationContext));
        gVar2.d(com.bumptech.glide.load.j.h.class, InputStream.class, new a.C0030a());
        gVar2.d(byte[].class, ByteBuffer.class, new b.a());
        gVar2.d(byte[].class, InputStream.class, new b.d());
        gVar2.d(Uri.class, Uri.class, x.a.a());
        gVar2.d(Drawable.class, Drawable.class, x.a.a());
        gVar2.c(Drawable.class, Drawable.class, new com.bumptech.glide.load.k.e.f());
        gVar2.p(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.k.g.b(resources));
        gVar2.p(Bitmap.class, byte[].class, aVar3);
        gVar2.p(Drawable.class, byte[].class, new com.bumptech.glide.load.k.g.c(d2, aVar3, dVar));
        gVar2.p(GifDrawable.class, byte[].class, dVar);
        com.bumptech.glide.load.g<ByteBuffer, Bitmap> d4 = C.d(d2);
        gVar2.c(ByteBuffer.class, Bitmap.class, d4);
        gVar2.c(ByteBuffer.class, BitmapDrawable.class, new C0501a(resources, d4));
        for (com.bumptech.glide.o.b bVar2 : list) {
            try {
                bVar2.b(applicationContext, cVar, gVar2);
            } catch (AbstractMethodError e3) {
                StringBuilder M = e.a.a.a.a.M("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                M.append(bVar2.getClass().getName());
                throw new IllegalStateException(M.toString(), e3);
            }
        }
        if (aVar != null) {
            aVar.a(applicationContext, cVar, gVar2);
        }
        return gVar2;
    }
}
