package com.bytedance.apm6.consumer.slardar.send;

import com.bytedance.apm6.consumer.slardar.send.DropDataMonitor;
import com.bytedance.apm6.consumer.slardar.send.a;
import com.bytedance.apm6.consumer.slardar.send.b;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.common.utility.NetworkUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class c implements e.b.b.e.a.k.d {
    private com.bytedance.apm6.util.timetask.a b;
    private LinkedHashMap<e, ConcurrentLinkedQueue<d>> a = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private long f3634c = 30000;

    /* renamed from: d, reason: collision with root package name */
    private long f3635d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f3636e = 1;

    class a extends com.bytedance.apm6.util.timetask.a {
        a(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (System.currentTimeMillis() - c.this.f3635d >= c.this.f3634c) {
                try {
                    Objects.requireNonNull(c.this);
                    c.g(c.this);
                } catch (Throwable th) {
                    List<String> list = e.b.b.e.a.a.a;
                    e.b.b.n.g.b.c("APM-Slardar", "send", th);
                }
                c.this.f3635d = System.currentTimeMillis();
            }
        }
    }

    class b implements Comparator<File> {
        b(c cVar) {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file.compareTo(file2);
        }
    }

    /* renamed from: com.bytedance.apm6.consumer.slardar.send.c$c, reason: collision with other inner class name */
    private static class C0134c {
        private static final c a = new c(null);
    }

    private static final class d {
        byte[] a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        long f3638c;

        d(byte[] bArr, int i, long j) {
            this.a = bArr;
            this.b = i;
            this.f3638c = j;
        }
    }

    c(a aVar) {
    }

    static void g(c cVar) {
        boolean z;
        d dVar;
        Objects.requireNonNull(cVar);
        if (NetworkUtils.h(e.b.b.n.a.a())) {
            if (b.C0133b.a.j()) {
                if (e.b.b.n.a.b()) {
                    List<String> list = e.b.b.e.a.a.a;
                    e.b.b.n.g.b.a("APM-Slardar", "trigger send.");
                }
                if (cVar.a.isEmpty()) {
                    z = true;
                } else {
                    z = true;
                    for (e eVar : cVar.a.keySet()) {
                        ConcurrentLinkedQueue<d> concurrentLinkedQueue = cVar.a.get(eVar);
                        if (concurrentLinkedQueue != null) {
                            d[] dVarArr = (d[]) concurrentLinkedQueue.toArray(new d[0]);
                            int length = dVarArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    dVar = null;
                                    break;
                                }
                                dVar = dVarArr[i];
                                if (dVar.b <= 0 || System.currentTimeMillis() - dVar.f3638c > 0) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            if (dVar == null && concurrentLinkedQueue.size() > 0) {
                                dVar = concurrentLinkedQueue.peek();
                            }
                            if (dVar != null) {
                                if (e.b.b.n.a.b()) {
                                    List<String> list2 = e.b.b.e.a.a.a;
                                    e.b.b.n.g.b.a("APM-Slardar", "sendMemory");
                                }
                                boolean g2 = com.bytedance.apm6.consumer.slardar.send.d.e(eVar).g(dVar.a);
                                if (g2) {
                                    concurrentLinkedQueue.remove(dVar);
                                } else {
                                    int i2 = dVar.b + 1;
                                    dVar.b = i2;
                                    dVar.f3638c = System.currentTimeMillis() + b.C0133b.a.g(i2);
                                }
                                if (!g2) {
                                    z = false;
                                }
                            }
                        }
                    }
                }
                if (e.b.b.h.c.a.y()) {
                    z = true;
                    for (e eVar2 : f.b()) {
                        File f2 = a.b.a.f(eVar2.getName());
                        if (f2 != null && f2.exists()) {
                            if (com.bytedance.apm6.consumer.slardar.send.d.e(eVar2).g(com.bytedance.android.input.k.b.a.B0(f2))) {
                                if (e.b.b.n.a.b()) {
                                    List<String> list3 = e.b.b.e.a.a.a;
                                    e.b.b.n.g.b.a("APM-Slardar", "sendFile: success");
                                }
                                a.b.a.b(f2);
                            } else {
                                a.c e2 = a.b.a.e(f2);
                                int c2 = e2 != null ? e2.c() + 1 : 0;
                                long currentTimeMillis = System.currentTimeMillis() + b.C0133b.a.g(c2);
                                a.b.a.j(f2, c2, currentTimeMillis);
                                if (e.b.b.n.a.b()) {
                                    List<String> list4 = e.b.b.e.a.a.a;
                                    StringBuilder M = e.a.a.a.a.M("sendfile error retry count:");
                                    M.append(f2.getName());
                                    M.append("  ");
                                    M.append(c2);
                                    M.append(" nextRetryTime:");
                                    M.append(currentTimeMillis);
                                    e.b.b.n.g.b.a("APM-Slardar", M.toString());
                                }
                                z = false;
                            }
                        }
                    }
                }
                if (z) {
                    cVar.f3636e = 1L;
                    cVar.f3634c = 30000L;
                } else {
                    if (cVar.f3634c < 120000) {
                        long j = cVar.f3636e + 1;
                        cVar.f3634c = 30000 * j;
                        cVar.f3636e = j;
                    }
                    if (cVar.f3634c > 120000) {
                        cVar.f3634c = 120000L;
                    }
                }
            }
            if (!e.b.b.n.a.b() || b.C0133b.a.j()) {
                return;
            }
            List<String> list5 = e.b.b.e.a.a.a;
            e.b.b.n.g.b.a("APM-Slardar", "report log disable");
        }
    }

    private void h(List<e.b.b.e.a.j.a> list) {
        for (e.b.b.e.a.j.a aVar : list) {
            try {
                if (aVar.d() != null) {
                    com.bytedance.android.input.k.b.a.t(aVar.d());
                }
            } catch (Exception unused) {
                List<String> list2 = e.b.b.e.a.a.a;
                StringBuilder M = e.a.a.a.a.M("delete LogFile's source File failed. logFile=");
                M.append(aVar.d());
                e.b.b.n.g.b.f("APM-Slardar", M.toString());
            }
        }
    }

    public static c i() {
        return C0134c.a;
    }

    @Override // e.b.b.e.a.k.d
    public long a() {
        File[] h = a.b.a.h();
        long j = 0;
        if (h == null) {
            return 0L;
        }
        for (File file : h) {
            j += file.length();
        }
        return j;
    }

    @Override // e.b.b.e.a.k.d
    public void b(long j) {
        File[] h = a.b.a.h();
        if (h == null) {
            return;
        }
        for (File file : h) {
            long j2 = -1;
            try {
                String[] split = file.getName().split(BundleUtil.UNDERLINE_TAG);
                if (split.length == 2) {
                    j2 = Long.parseLong(split[0]);
                }
            } catch (Throwable unused) {
            }
            if (j2 <= j) {
                com.bytedance.android.input.k.b.a.t(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[SYNTHETIC] */
    @Override // e.b.b.e.a.k.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r13) {
        /*
            r12 = this;
            com.bytedance.apm6.consumer.slardar.send.a r0 = com.bytedance.apm6.consumer.slardar.send.a.b.a()
            java.io.File[] r0 = r0.h()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.bytedance.apm6.consumer.slardar.send.c$b r1 = new com.bytedance.apm6.consumer.slardar.send.c$b
            r1.<init>(r12)
            java.util.Arrays.sort(r0, r1)
            int r1 = r0.length
            r2 = 0
            r4 = 0
            r6 = r2
            r5 = r4
        L19:
            if (r5 >= r1) goto L31
            r8 = r0[r5]
            boolean r9 = r8.exists()
            if (r9 == 0) goto L2e
            boolean r9 = r8.isFile()
            if (r9 == 0) goto L2e
            long r8 = r8.length()
            long r6 = r6 + r8
        L2e:
            int r5 = r5 + 1
            goto L19
        L31:
            int r1 = r0.length
            r5 = r4
        L33:
            if (r5 >= r1) goto L60
            r8 = r0[r5]
            long r9 = r6 - r2
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 <= 0) goto L60
            boolean r9 = r8.exists()
            if (r9 == 0) goto L5d
            boolean r9 = r8.isFile()
            if (r9 == 0) goto L5d
            long r9 = r8.length()
            boolean r11 = r8.exists()
            if (r11 != 0) goto L54
            goto L59
        L54:
            boolean r8 = r8.delete()     // Catch: java.lang.Throwable -> L59
            goto L5a
        L59:
            r8 = r4
        L5a:
            if (r8 == 0) goto L5d
            long r2 = r2 + r9
        L5d:
            int r5 = r5 + 1
            goto L33
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.consumer.slardar.send.c.c(long):void");
    }

    @Override // e.b.b.e.a.k.d
    public String getName() {
        return "second_log_dir";
    }

    public void j() {
        this.b = new a(0L, 30000L);
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.IO).c(this.b);
    }

    public void k(List<e.b.b.e.a.j.a> list, int i) {
        boolean z;
        int i2;
        boolean z2;
        long j;
        long j2;
        ConcurrentLinkedQueue<d> concurrentLinkedQueue;
        DropDataMonitor dropDataMonitor;
        try {
            if (b.C0133b.a.k()) {
                if (e.b.b.n.a.b()) {
                    List<String> list2 = e.b.b.e.a.a.a;
                    e.b.b.n.g.b.a("APM-Slardar", "stop collect log");
                }
                long j3 = 0;
                long j4 = 0;
                for (e.b.b.e.a.j.a aVar : list) {
                    j3 += aVar.g();
                    j4 += aVar.f();
                }
                dropDataMonitor = DropDataMonitor.a.a;
                dropDataMonitor.c(j3, j4, System.currentTimeMillis(), DropDataMonitor.Reason.SERVER_DROP);
                h(list);
                return;
            }
            Map<e, byte[]> c2 = f.c(list, i);
            if (c2 == null) {
                h(list);
                return;
            }
            boolean h = NetworkUtils.h(e.b.b.n.a.a());
            boolean z3 = false;
            for (e eVar : c2.keySet()) {
                byte[] bArr = c2.get(eVar);
                if (bArr != null) {
                    if (b.C0133b.a.j() && h) {
                        if (e.b.b.n.a.b()) {
                            com.bytedance.apm.doctor.a.d(bArr);
                        }
                        z = com.bytedance.apm6.consumer.slardar.send.d.e(eVar).g(bArr);
                        if (e.b.b.n.a.b()) {
                            if (z) {
                                com.bytedance.apm.doctor.a.h(bArr);
                            } else {
                                com.bytedance.apm.doctor.a.f(bArr);
                            }
                        }
                        this.f3635d = System.currentTimeMillis();
                        z3 |= z;
                        i2 = 1;
                    } else {
                        z = false;
                        i2 = 0;
                    }
                    if (e.b.b.n.a.b()) {
                        List<String> list3 = e.b.b.e.a.a.a;
                        e.b.b.n.g.b.a("APM-Slardar", "sendDirect:isReportLogEnable " + b.C0133b.a.j() + " :sendResult " + z);
                    }
                    if (z) {
                        z2 = z3;
                    } else {
                        long g2 = b.C0133b.a.g(i2);
                        long currentTimeMillis = System.currentTimeMillis() + g2;
                        if (e.b.b.h.c.a.y()) {
                            j = currentTimeMillis;
                            z2 = z3;
                            j2 = g2;
                            z = a.b.a.i(bArr, eVar.getName(), i2, j);
                        } else {
                            z2 = z3;
                            j = currentTimeMillis;
                            j2 = g2;
                        }
                        if (e.b.b.n.a.b()) {
                            List<String> list4 = e.b.b.e.a.a.a;
                            e.b.b.n.g.b.a("APM-Slardar", "saveFile:Result:" + z + ":isMaiProcess:" + e.b.b.h.c.a.y() + " :" + i2 + " " + j2);
                        }
                        if (!z) {
                            if (this.a.containsKey(eVar)) {
                                concurrentLinkedQueue = this.a.get(eVar);
                            } else {
                                concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                                concurrentLinkedQueue.add(new d(bArr, i2, j));
                            }
                            if (concurrentLinkedQueue.size() > 10) {
                                concurrentLinkedQueue.poll();
                            }
                        }
                    }
                    z3 = z2;
                }
            }
            if (z3) {
                this.f3636e = 1L;
                this.f3634c = 30000L;
            }
            h(list);
        } catch (Throwable th) {
            List<String> list5 = e.b.b.e.a.a.a;
            e.b.b.n.g.b.c("APM-Slardar", "sendLog", th);
        }
    }
}
