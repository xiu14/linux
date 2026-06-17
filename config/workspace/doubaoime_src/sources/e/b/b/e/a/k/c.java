package e.b.b.e.a.k;

import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f9401f = new c();
    private b b;
    private Set<d> a = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private int f9402c = 80;

    /* renamed from: d, reason: collision with root package name */
    private int f9403d = 5;

    /* renamed from: e, reason: collision with root package name */
    private int f9404e = -1;

    class a extends com.bytedance.apm6.util.timetask.a {
        a(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            int i = c.this.f9403d;
            long j2 = c.this.f9402c * DownloadConstants.KB * DownloadConstants.KB;
            HashMap hashMap = new HashMap();
            if (e.b.b.n.a.b()) {
                List<String> list = e.b.b.e.a.a.a;
                StringBuilder M = e.a.a.a.a.M("start weedOut:");
                M.append(currentTimeMillis - (i * com.heytap.mcssdk.constant.a.f6888f));
                e.b.b.n.g.b.a("APM-Slardar", M.toString());
            }
            Iterator it2 = c.this.a.iterator();
            long j3 = 0;
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                e.b.b.e.a.k.a aVar = new e.b.b.e.a.k.a();
                hashMap.put(dVar.getName(), aVar);
                aVar.g(dVar.getName());
                HashMap hashMap2 = hashMap;
                Iterator it3 = it2;
                aVar.f(dVar.a());
                if (e.b.b.n.a.b()) {
                    List<String> list2 = e.b.b.e.a.a.a;
                    StringBuilder M2 = e.a.a.a.a.M("weedOut:name:");
                    M2.append(aVar.c());
                    M2.append(" beforeSize:");
                    j = j2;
                    M2.append(aVar.b());
                    e.b.b.n.g.b.a("APM-Slardar", M2.toString());
                } else {
                    j = j2;
                }
                dVar.b(currentTimeMillis - (i * com.heytap.mcssdk.constant.a.f6888f));
                long a = dVar.a();
                aVar.e(a);
                if (e.b.b.n.a.b()) {
                    List<String> list3 = e.b.b.e.a.a.a;
                    StringBuilder M3 = e.a.a.a.a.M("weedOut:name:");
                    M3.append(aVar.c());
                    M3.append(" afterSize:");
                    M3.append(aVar.a());
                    e.b.b.n.g.b.a("APM-Slardar", M3.toString());
                }
                j3 += a;
                hashMap = hashMap2;
                it2 = it3;
                j2 = j;
            }
            long j4 = j2;
            HashMap hashMap3 = hashMap;
            while (true) {
                i--;
                if (j3 <= j4 || i <= 0) {
                    break;
                }
                j3 = 0;
                for (d dVar2 : c.this.a) {
                    dVar2.b(currentTimeMillis - (i * com.heytap.mcssdk.constant.a.f6888f));
                    long a2 = dVar2.a();
                    HashMap hashMap4 = hashMap3;
                    e.b.b.e.a.k.a aVar2 = (e.b.b.e.a.k.a) hashMap4.get(dVar2.getName());
                    if (aVar2 != null) {
                        aVar2.e(a2);
                    }
                    j3 += dVar2.a();
                    hashMap3 = hashMap4;
                }
            }
            HashMap hashMap5 = hashMap3;
            if (c.this.f9404e > 0) {
                long j5 = c.this.f9404e * DownloadConstants.KB * DownloadConstants.KB;
                if (j3 > j5) {
                    for (d dVar3 : c.this.a) {
                        long a3 = dVar3.a();
                        if (a3 > 0) {
                            dVar3.c(j5);
                            long a4 = dVar3.a();
                            e.b.b.e.a.k.a aVar3 = (e.b.b.e.a.k.a) hashMap5.get(dVar3.getName());
                            if (aVar3 != null) {
                                if (e.b.b.n.a.b()) {
                                    List<String> list4 = e.b.b.e.a.a.a;
                                    StringBuilder M4 = e.a.a.a.a.M("weedOut:name:");
                                    M4.append(aVar3.c());
                                    M4.append(" afterSize:");
                                    M4.append(a4);
                                    M4.append(" maxBytesToday clean: ");
                                    M4.append(a3 - a4);
                                    e.b.b.n.g.b.a("APM-Slardar", M4.toString());
                                }
                                aVar3.h(true);
                                aVar3.e(a4);
                            }
                        }
                    }
                }
            }
            if (c.this.b != null) {
                c.this.b.a(new ArrayList(hashMap5.values()));
            }
        }
    }

    public static c g() {
        return f9401f;
    }

    public synchronized void f(d dVar) {
        if (dVar == null) {
            return;
        }
        this.a.add(dVar);
    }

    public void h() {
        if (e.b.b.h.c.a.y()) {
            com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.IO).c(new a(0L, 14400000L));
        }
    }

    public synchronized void i(b bVar) {
        this.b = bVar;
    }

    public void j(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f9402c = i;
        this.f9403d = i2;
        this.f9404e = i3 != -1 ? Math.max(i3, 80) : -1;
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.a("APM-Slardar", "weed out config:maxSizeMB:" + i + " keepDays:" + i2);
        }
    }
}
