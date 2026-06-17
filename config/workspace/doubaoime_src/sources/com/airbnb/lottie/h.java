package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.parser.moshi.JsonReader;
import f.z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class h {
    private static final Map<String, q<com.airbnb.lottie.g>> a = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1265c = 0;

    class a implements k<com.airbnb.lottie.g> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.k
        public void onResult(com.airbnb.lottie.g gVar) {
            h.a.remove(this.a);
        }
    }

    class b implements k<Throwable> {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.k
        public void onResult(Throwable th) {
            h.a.remove(this.a);
        }
    }

    class c implements Callable<o<com.airbnb.lottie.g>> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1266c;

        c(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.f1266c = str2;
        }

        @Override // java.util.concurrent.Callable
        public o<com.airbnb.lottie.g> call() throws Exception {
            o<com.airbnb.lottie.g> a = com.airbnb.lottie.d.b(this.a).a(this.b, this.f1266c);
            if (this.f1266c != null && a.b() != null) {
                com.airbnb.lottie.model.f.b().c(this.f1266c, a.b());
            }
            return a;
        }
    }

    class d implements Callable<o<com.airbnb.lottie.g>> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1267c;

        d(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.f1267c = str2;
        }

        @Override // java.util.concurrent.Callable
        public o<com.airbnb.lottie.g> call() throws Exception {
            return h.e(this.a, this.b, this.f1267c);
        }
    }

    class e implements Callable<o<com.airbnb.lottie.g>> {
        final /* synthetic */ WeakReference a;
        final /* synthetic */ Context b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1268c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f1269d;

        e(WeakReference weakReference, Context context, int i, String str) {
            this.a = weakReference;
            this.b = context;
            this.f1268c = i;
            this.f1269d = str;
        }

        @Override // java.util.concurrent.Callable
        public o<com.airbnb.lottie.g> call() throws Exception {
            Context context = (Context) this.a.get();
            if (context == null) {
                context = this.b;
            }
            return h.l(context, this.f1268c, this.f1269d);
        }
    }

    class f implements Callable<o<com.airbnb.lottie.g>> {
        final /* synthetic */ InputStream a;
        final /* synthetic */ String b;

        f(InputStream inputStream, String str) {
            this.a = inputStream;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        public o<com.airbnb.lottie.g> call() throws Exception {
            return h.g(this.a, this.b);
        }
    }

    class g implements Callable<o<com.airbnb.lottie.g>> {
        final /* synthetic */ com.airbnb.lottie.g a;

        g(com.airbnb.lottie.g gVar) {
            this.a = gVar;
        }

        @Override // java.util.concurrent.Callable
        public o<com.airbnb.lottie.g> call() throws Exception {
            return new o<>(this.a);
        }
    }

    private static q<com.airbnb.lottie.g> b(@Nullable String str, Callable<o<com.airbnb.lottie.g>> callable) {
        com.airbnb.lottie.g a2 = str == null ? null : com.airbnb.lottie.model.f.b().a(str);
        if (a2 != null) {
            return new q<>(new g(a2), false);
        }
        if (str != null) {
            Map<String, q<com.airbnb.lottie.g>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        q<com.airbnb.lottie.g> qVar = new q<>(callable, false);
        if (str != null) {
            qVar.f(new a(str));
            qVar.e(new b(str));
            a.put(str, qVar);
        }
        return qVar;
    }

    public static q<com.airbnb.lottie.g> c(Context context, String str) {
        String s = e.a.a.a.a.s("asset_", str);
        return b(s, new d(context.getApplicationContext(), str, s));
    }

    public static q<com.airbnb.lottie.g> d(Context context, String str, @Nullable String str2) {
        return b(null, new d(context.getApplicationContext(), str, null));
    }

    @WorkerThread
    public static o<com.airbnb.lottie.g> e(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return g(context.getAssets().open(str), str2);
            }
            return n(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e2) {
            return new o<>((Throwable) e2);
        }
    }

    public static q<com.airbnb.lottie.g> f(InputStream inputStream, @Nullable String str) {
        return b(str, new f(inputStream, str));
    }

    @WorkerThread
    public static o<com.airbnb.lottie.g> g(InputStream inputStream, @Nullable String str) {
        try {
            z e2 = f.o.e(inputStream);
            kotlin.s.c.l.g(e2, "$receiver");
            return h(JsonReader.D(new f.t(e2)), str, true);
        } finally {
            com.airbnb.lottie.y.h.b(inputStream);
        }
    }

    private static o<com.airbnb.lottie.g> h(JsonReader jsonReader, @Nullable String str, boolean z) {
        try {
            try {
                com.airbnb.lottie.g a2 = com.airbnb.lottie.x.t.a(jsonReader);
                if (str != null) {
                    com.airbnb.lottie.model.f.b().c(str, a2);
                }
                o<com.airbnb.lottie.g> oVar = new o<>(a2);
                if (z) {
                    com.airbnb.lottie.y.h.b(jsonReader);
                }
                return oVar;
            } catch (Exception e2) {
                o<com.airbnb.lottie.g> oVar2 = new o<>(e2);
                if (z) {
                    com.airbnb.lottie.y.h.b(jsonReader);
                }
                return oVar2;
            }
        } catch (Throwable th) {
            if (z) {
                com.airbnb.lottie.y.h.b(jsonReader);
            }
            throw th;
        }
    }

    public static q<com.airbnb.lottie.g> i(Context context, @RawRes int i) {
        String p = p(context, i);
        return b(p, new e(new WeakReference(context), context.getApplicationContext(), i, p));
    }

    public static q<com.airbnb.lottie.g> j(Context context, @RawRes int i, @Nullable String str) {
        return b(null, new e(new WeakReference(context), context.getApplicationContext(), i, null));
    }

    @WorkerThread
    public static o<com.airbnb.lottie.g> k(Context context, @RawRes int i) {
        return l(context, i, p(context, i));
    }

    @WorkerThread
    public static o<com.airbnb.lottie.g> l(Context context, @RawRes int i, @Nullable String str) {
        Boolean bool;
        try {
            z e2 = f.o.e(context.getResources().openRawResource(i));
            kotlin.s.c.l.g(e2, "$receiver");
            f.t tVar = new f.t(e2);
            try {
                f.g d2 = tVar.d();
                byte[] bArr = b;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        ((f.t) d2).close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (((f.t) d2).readByte() != bArr[i2]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e3) {
                com.airbnb.lottie.y.d.b("Failed to check zip file header", e3);
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? n(new ZipInputStream(tVar.j()), str) : g(tVar.j(), str);
        } catch (Resources.NotFoundException e4) {
            return new o<>((Throwable) e4);
        }
    }

    public static q<com.airbnb.lottie.g> m(Context context, String str, @Nullable String str2) {
        return b(str2, new c(context, str, str2));
    }

    @WorkerThread
    public static o<com.airbnb.lottie.g> n(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return o(zipInputStream, str);
        } finally {
            com.airbnb.lottie.y.h.b(zipInputStream);
        }
    }

    @WorkerThread
    private static o<com.airbnb.lottie.g> o(ZipInputStream zipInputStream, @Nullable String str) {
        j jVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            com.airbnb.lottie.g gVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    z e2 = f.o.e(zipInputStream);
                    kotlin.s.c.l.g(e2, "$receiver");
                    gVar = h(JsonReader.D(new f.t(e2)), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (gVar == null) {
                return new o<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<j> it2 = gVar.j().values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        jVar = null;
                        break;
                    }
                    jVar = it2.next();
                    if (jVar.b().equals(str2)) {
                        break;
                    }
                }
                if (jVar != null) {
                    jVar.f(com.airbnb.lottie.y.h.f((Bitmap) entry.getValue(), jVar.e(), jVar.c()));
                }
            }
            for (Map.Entry<String, j> entry2 : gVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    StringBuilder M = e.a.a.a.a.M("There is no image for ");
                    M.append(entry2.getValue().b());
                    return new o<>((Throwable) new IllegalStateException(M.toString()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.f.b().c(str, gVar);
            }
            return new o<>(gVar);
        } catch (IOException e3) {
            return new o<>((Throwable) e3);
        }
    }

    private static String p(Context context, @RawRes int i) {
        StringBuilder M = e.a.a.a.a.M("rawRes");
        M.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        M.append(i);
        return M.toString();
    }
}
