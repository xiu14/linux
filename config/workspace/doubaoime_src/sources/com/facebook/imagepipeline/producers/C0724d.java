package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.image.EncodedImageOrigin;
import com.facebook.imagepipeline.request.ImageRequest;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.producers.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0724d implements V {
    public static final Set<String> o = e.c.c.d.g.a("id", "uri_source");
    private final ImageRequest a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6589c;

    /* renamed from: d, reason: collision with root package name */
    private final X f6590d;

    /* renamed from: e, reason: collision with root package name */
    private Y f6591e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f6592f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageRequest.RequestLevel f6593g;
    private final Map<String, Object> h;
    private boolean i;
    private Priority j;
    private boolean k;
    private boolean l;
    private final List<W> m;
    private final e.c.h.g.j n;

    public C0724d(ImageRequest imageRequest, String str, X x, Y y, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, e.c.h.g.j jVar) {
        this(imageRequest, str, null, x, y, obj, requestLevel, z, z2, priority, jVar);
    }

    public static void q(List<W> list) {
        if (list == null) {
            return;
        }
        Iterator<W> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    public static void r(List<W> list) {
        if (list == null) {
            return;
        }
        Iterator<W> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
    }

    public static void s(List<W> list) {
        if (list == null) {
            return;
        }
        Iterator<W> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.V
    public synchronized Priority a() {
        return this.j;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public Object b() {
        return this.f6592f;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public void c(String str, Object obj) {
        if (o.contains(str)) {
            return;
        }
        this.h.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.V
    public ImageRequest d() {
        return this.a;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public void e(W w) {
        boolean z;
        synchronized (this) {
            this.m.add(w);
            z = this.l;
        }
        if (z) {
            w.a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.V
    public e.c.h.g.j f() {
        return this.n;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public void g(String str, String str2) {
        this.h.put("origin", str);
        this.h.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.V
    public Map<String, Object> getExtras() {
        return this.h;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public String getId() {
        return this.b;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public void h(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.V
    public synchronized boolean i() {
        return this.i;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public <T> T j(String str) {
        return (T) this.h.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.V
    public String k() {
        return this.f6589c;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public void l(String str) {
        this.h.put("origin", str);
        this.h.put("origin_sub", DownloadSettingKeys.BugFix.DEFAULT);
    }

    @Override // com.facebook.imagepipeline.producers.V
    public Y m() {
        return this.f6591e;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public X n() {
        return this.f6590d;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public synchronized boolean o() {
        return this.k;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public ImageRequest.RequestLevel p() {
        return this.f6593g;
    }

    public void t() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.l) {
                arrayList = null;
            } else {
                this.l = true;
                arrayList = new ArrayList(this.m);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((W) it2.next()).a();
        }
    }

    public synchronized List<W> u(boolean z) {
        if (z == this.k) {
            return null;
        }
        this.k = z;
        return new ArrayList(this.m);
    }

    public synchronized List<W> v(boolean z) {
        if (z == this.i) {
            return null;
        }
        this.i = z;
        return new ArrayList(this.m);
    }

    public synchronized List<W> w(Priority priority) {
        if (priority == this.j) {
            return null;
        }
        this.j = priority;
        return new ArrayList(this.m);
    }

    public C0724d(ImageRequest imageRequest, String str, String str2, X x, Y y, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, e.c.h.g.j jVar) {
        EncodedImageOrigin encodedImageOrigin = EncodedImageOrigin.NOT_SET;
        this.a = imageRequest;
        this.b = str;
        HashMap hashMap = new HashMap();
        this.h = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", imageRequest == null ? "null-request" : imageRequest.v());
        this.f6589c = str2;
        this.f6590d = x;
        this.f6591e = y;
        this.f6592f = obj;
        this.f6593g = requestLevel;
        this.i = z;
        this.j = priority;
        this.k = z2;
        this.l = false;
        this.m = new ArrayList();
        this.n = jVar;
    }
}
