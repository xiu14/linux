package com.bytedance.apm6.consumer.slardar.send;

import com.bytedance.apm6.consumer.slardar.send.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class f {
    private static AtomicInteger a = new AtomicInteger(0);
    private static final List<String> b = Arrays.asList("tracing");

    /* renamed from: c, reason: collision with root package name */
    private static final List<e> f3644c;

    /* renamed from: d, reason: collision with root package name */
    private static final e.a f3645d;

    /* renamed from: e, reason: collision with root package name */
    private static final e.c f3646e;

    /* renamed from: f, reason: collision with root package name */
    private static final e.b f3647f;

    static {
        e.a aVar = new e.a();
        f3645d = aVar;
        e.c cVar = new e.c();
        f3646e = cVar;
        e.b bVar = new e.b();
        f3647f = bVar;
        ArrayList arrayList = new ArrayList();
        f3644c = arrayList;
        arrayList.add(aVar);
        arrayList.add(cVar);
        arrayList.add(bVar);
    }

    private static void a(Map<Long, List<e.b.b.e.a.j.b>> map) {
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            StringBuilder M = e.a.a.a.a.M("sendLog: input sendList merged into ");
            M.append(map.size());
            M.append(" group(s)");
            e.b.b.n.g.b.a("APM-Slardar", M.toString());
            int i = 0;
            for (Long l : map.keySet()) {
                List<e.b.b.e.a.j.b> list2 = map.get(l);
                List<String> list3 = e.b.b.e.a.a.a;
                e.b.b.n.g.b.a("APM-Slardar", "----------------");
                e.b.b.e.a.i.a e2 = e.b.b.e.a.i.c.f().e(String.valueOf(l));
                StringBuilder M2 = e.a.a.a.a.M("group ");
                int i2 = i + 1;
                M2.append(i);
                M2.append(" header:");
                M2.append(e2);
                e.b.b.n.g.b.a("APM-Slardar", M2.toString());
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    List<String> list4 = e.b.b.e.a.a.a;
                    StringBuilder N = e.a.a.a.a.N("  log[", i3, "]=");
                    N.append(list2.get(i3).toString());
                    e.b.b.n.g.b.a("APM-Slardar", N.toString());
                }
                List<String> list5 = e.b.b.e.a.a.a;
                e.b.b.n.g.b.a("APM-Slardar", "----------------");
                i = i2;
            }
        }
    }

    public static List<e> b() {
        return f3644c;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x016b A[Catch: all -> 0x01cf, TryCatch #7 {all -> 0x01cf, blocks: (B:3:0x0004, B:4:0x0015, B:6:0x001b, B:8:0x0031, B:10:0x003d, B:13:0x0051, B:15:0x005e, B:17:0x0064, B:18:0x0067, B:19:0x0079, B:21:0x007f, B:25:0x0091, B:27:0x0097, B:30:0x009f, B:33:0x00a3, B:34:0x00af, B:36:0x00bd, B:38:0x00c3, B:43:0x00d5, B:45:0x00e3, B:46:0x00f3, B:58:0x00f7, B:60:0x00fd, B:63:0x0107, B:66:0x010d, B:69:0x0118, B:72:0x0137, B:73:0x0148, B:75:0x014e, B:49:0x0163, B:51:0x016b, B:52:0x0173, B:54:0x0179, B:55:0x0181, B:42:0x0194, B:89:0x00e6, B:91:0x00ee, B:92:0x00f1, B:105:0x01a6, B:106:0x01b4, B:108:0x01ba), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179 A[Catch: all -> 0x01cf, TryCatch #7 {all -> 0x01cf, blocks: (B:3:0x0004, B:4:0x0015, B:6:0x001b, B:8:0x0031, B:10:0x003d, B:13:0x0051, B:15:0x005e, B:17:0x0064, B:18:0x0067, B:19:0x0079, B:21:0x007f, B:25:0x0091, B:27:0x0097, B:30:0x009f, B:33:0x00a3, B:34:0x00af, B:36:0x00bd, B:38:0x00c3, B:43:0x00d5, B:45:0x00e3, B:46:0x00f3, B:58:0x00f7, B:60:0x00fd, B:63:0x0107, B:66:0x010d, B:69:0x0118, B:72:0x0137, B:73:0x0148, B:75:0x014e, B:49:0x0163, B:51:0x016b, B:52:0x0173, B:54:0x0179, B:55:0x0181, B:42:0x0194, B:89:0x00e6, B:91:0x00ee, B:92:0x00f1, B:105:0x01a6, B:106:0x01b4, B:108:0x01ba), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e A[Catch: all -> 0x01cf, TryCatch #7 {all -> 0x01cf, blocks: (B:3:0x0004, B:4:0x0015, B:6:0x001b, B:8:0x0031, B:10:0x003d, B:13:0x0051, B:15:0x005e, B:17:0x0064, B:18:0x0067, B:19:0x0079, B:21:0x007f, B:25:0x0091, B:27:0x0097, B:30:0x009f, B:33:0x00a3, B:34:0x00af, B:36:0x00bd, B:38:0x00c3, B:43:0x00d5, B:45:0x00e3, B:46:0x00f3, B:58:0x00f7, B:60:0x00fd, B:63:0x0107, B:66:0x010d, B:69:0x0118, B:72:0x0137, B:73:0x0148, B:75:0x014e, B:49:0x0163, B:51:0x016b, B:52:0x0173, B:54:0x0179, B:55:0x0181, B:42:0x0194, B:89:0x00e6, B:91:0x00ee, B:92:0x00f1, B:105:0x01a6, B:106:0x01b4, B:108:0x01ba), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<com.bytedance.apm6.consumer.slardar.send.e, byte[]> c(java.util.List<e.b.b.e.a.j.a> r22, int r23) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.consumer.slardar.send.f.c(java.util.List, int):java.util.Map");
    }
}
