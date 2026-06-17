package com.bytedance.lighten.loader;

import android.net.Uri;
import android.util.Log;
import com.bytedance.lighten.core.CacheChoice;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.ImagePiplinePriority;
import com.bytedance.lighten.loader.b;
import com.bytedance.lighten.loader.l;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.datasource.g;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.ugc.aweme.thread.ThreadPoolType;
import com.ss.android.ugc.aweme.thread.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
class k implements com.bytedance.lighten.core.d {
    private com.bytedance.lighten.core.b a;
    private ExecutorService b;

    class a implements Runnable {
        final /* synthetic */ int a;

        a(k kVar, int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d("Lighten:", String.format("before trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", Long.valueOf(e.c.h.g.l.j().l().getCount()), Long.valueOf(e.c.h.g.l.j().l().a() / DownloadConstants.KB), Long.valueOf(e.c.h.g.l.j().p().getCount()), Long.valueOf(e.c.h.g.l.j().p().a() / DownloadConstants.KB)));
            int i = this.a;
            if (i == 1) {
                e.c.h.g.l.j().l().f();
                e.c.h.g.l.j().p().f();
            } else if (i == 2) {
                e.c.h.g.l.j().l().e();
                e.c.h.g.l.j().p().e();
            }
            Log.d("Lighten:", String.format("after trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", Long.valueOf(e.c.h.g.l.j().l().getCount()), Long.valueOf(e.c.h.g.l.j().l().a() / DownloadConstants.KB), Long.valueOf(e.c.h.g.l.j().p().getCount()), Long.valueOf(e.c.h.g.l.j().p().a() / DownloadConstants.KB)));
        }
    }

    k(com.bytedance.lighten.core.b bVar) {
        this.a = bVar;
        j.b a2 = com.ss.android.ugc.aweme.thread.j.a(ThreadPoolType.FIXED);
        a2.i("fresco-loader-io");
        a2.h(2);
        this.b = com.ss.android.ugc.aweme.thread.h.a(a2.g());
    }

    static ImageRequest a(com.bytedance.lighten.core.i iVar, Uri uri) {
        return e(iVar, uri).a();
    }

    static ImageRequest[] b(com.bytedance.lighten.core.i iVar) {
        List<String> d2 = d(iVar);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = d2.iterator();
        while (it2.hasNext()) {
            arrayList.add(e(iVar, Uri.parse(it2.next())).a());
        }
        return arrayList.size() == 0 ? new ImageRequest[0] : (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }

    static RoundingParams c(RoundingParams roundingParams, CircleOptions circleOptions) {
        if (circleOptions == null) {
            return roundingParams;
        }
        roundingParams.k(circleOptions.a());
        roundingParams.n(false);
        roundingParams.i(0.0f);
        roundingParams.h(0);
        roundingParams.l(0);
        roundingParams.m(0.0f);
        roundingParams.o(circleOptions.b() == CircleOptions.RoundingMethod.OVERLAY_COLOR ? RoundingParams.RoundingMethod.OVERLAY_COLOR : RoundingParams.RoundingMethod.BITMAP_ONLY);
        return roundingParams;
    }

    private static List<String> d(com.bytedance.lighten.core.i iVar) {
        return (iVar.o() == null || iVar.o().b()) ? Collections.emptyList() : iVar.o().a();
    }

    private static com.facebook.imagepipeline.request.b e(com.bytedance.lighten.core.i iVar, Uri uri) {
        com.facebook.imagepipeline.request.b y = com.facebook.imagepipeline.request.b.y(uri);
        y.D(iVar.u());
        com.facebook.imagepipeline.request.b z = y.z(iVar.s());
        if (iVar.e() == CacheChoice.SMALL) {
            z.B(ImageRequest.CacheChoice.SMALL);
        }
        ImagePiplinePriority m = iVar.m();
        Priority priority = m == ImagePiplinePriority.LOW ? Priority.LOW : m == ImagePiplinePriority.HIGH ? Priority.HIGH : Priority.MEDIUM;
        int i = com.facebook.imagepipeline.common.c.r;
        com.facebook.imagepipeline.common.d dVar = new com.facebook.imagepipeline.common.d();
        if (iVar.d() != null) {
            dVar.q(iVar.d());
        }
        dVar.r(iVar.t());
        if (iVar.l() >= 0) {
            dVar.u(iVar.l());
        }
        if (iVar.b() != com.bytedance.lighten.core.a.f5337c.a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("frame_scheduler_id", Integer.valueOf(iVar.b()));
            dVar.s(hashMap);
        }
        z.C(new com.facebook.imagepipeline.common.c(dVar));
        z.E(priority);
        z.z(iVar.s());
        if (iVar.p() > 0 || iVar.i() > 0) {
            z.F(new com.facebook.imagepipeline.common.e(iVar.p(), iVar.i()));
        }
        return z;
    }

    @Override // com.bytedance.lighten.core.d
    public void display(com.bytedance.lighten.core.i iVar) {
        Objects.requireNonNull(iVar);
        if (iVar.c() == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView or ImageView to display, use with(view)");
        }
        m.b(iVar.c(), iVar);
    }

    @Override // com.bytedance.lighten.core.d
    public void download(com.bytedance.lighten.core.i iVar) {
        List<String> d2 = d(iVar);
        Uri n = d2.isEmpty() ? iVar.n() : Uri.parse(d2.get(0));
        Objects.requireNonNull((j) this.a);
        com.facebook.cache.common.b b = e.c.h.f.l.c().b(ImageRequest.a(n), null);
        if (e.c.h.g.l.j().l().h(b) || e.c.h.g.l.j().p().h(b)) {
            return;
        }
        e.c.h.g.l.j().i().h(ImageRequest.a(n), null);
    }

    @Override // com.bytedance.lighten.core.d
    public void loadBitmap(com.bytedance.lighten.core.i iVar) {
        Log.d("Lighten:", "loadBitmap");
        if (iVar.o() == null || iVar.o().b()) {
            ImageRequest a2 = a(iVar, iVar.n());
            e.c.h.g.h i = e.c.h.g.l.j().i();
            Objects.requireNonNull(i);
            i.a(a2, null, ImageRequest.RequestLevel.FULL_FETCH);
            return;
        }
        ImageRequest[] b = b(iVar);
        if (b.length == 0) {
            Log.d("Lighten:", "loadBitmap, url is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ImageRequest imageRequest : b) {
            if (imageRequest != null) {
                arrayList.add(e.c.h.g.l.j().i().e(imageRequest, null, ImageRequest.RequestLevel.FULL_FETCH));
            }
        }
        if (arrayList.isEmpty()) {
            Log.d("Lighten:", "loadBitmap, suppliers is empty");
        } else {
            new g.b();
        }
    }

    @Override // com.bytedance.lighten.core.d
    public void trimDisk(int i) {
        e.a.a.a.a.i0("trimDisk: level=", i, "Lighten:");
        this.b.submit(new a(this, i));
    }

    @Override // com.bytedance.lighten.core.d
    public void trimMemory(int i) {
        l lVar;
        b bVar;
        l lVar2;
        b bVar2;
        l lVar3;
        e.a.a.a.a.i0("trimMemory: level=", i, "Lighten:");
        if (i == 5) {
            lVar = l.b.a;
            lVar.b(MemoryTrimType.OnSystemLowMemoryWhileAppInForeground);
            bVar = b.c.a;
            bVar.b();
            return;
        }
        if (i != 10) {
            if (i != 40) {
                return;
            }
            lVar3 = l.b.a;
            lVar3.b(MemoryTrimType.OnSystemLowMemoryWhileAppInBackground);
            return;
        }
        lVar2 = l.b.a;
        lVar2.b(MemoryTrimType.OnCloseToDalvikHeapLimit);
        bVar2 = b.c.a;
        bVar2.b();
    }
}
