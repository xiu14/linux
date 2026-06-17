package e.b.b.e.a;

import androidx.core.location.LocationRequestCompat;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public class c implements e.b.b.e.a.k.d {
    private volatile long a = com.heytap.mcssdk.constant.a.f6886d;
    private volatile long b = 1048576;

    /* renamed from: c, reason: collision with root package name */
    private e.b.b.n.f.a<e.b.b.e.a.j.a> f9372c = new e.b.b.n.f.a<>(10);

    /* renamed from: d, reason: collision with root package name */
    private volatile e.b.b.e.a.j.c f9373d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.bytedance.apm6.util.timetask.a f9374e;

    class a extends com.bytedance.apm6.util.timetask.a {
        a(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            c.d(c.this);
        }
    }

    class b extends com.bytedance.apm6.util.timetask.a {
        b(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            c.d(c.this);
        }
    }

    /* renamed from: e.b.b.e.a.c$c, reason: collision with other inner class name */
    class C0423c extends com.bytedance.apm6.util.timetask.a {
        C0423c(long j) {
            super(j, 0L);
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] listFiles;
            Objects.requireNonNull(c.this);
            File file = new File(e.b.b.e.a.b.e(), "child_process_persistent");
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && file2.length() > 0) {
                        try {
                            if (Long.parseLong(file2.getName().split(BundleUtil.UNDERLINE_TAG)[0]) >= e.b.b.h.c.a.m()) {
                                continue;
                            } else {
                                FileChannel fileChannel = null;
                                try {
                                    fileChannel = new RandomAccessFile(file2, "rw").getChannel();
                                    FileLock tryLock = fileChannel.tryLock(0L, LocationRequestCompat.PASSIVE_INTERVAL, false);
                                    if (tryLock != null && tryLock.isValid()) {
                                        File file3 = new File(e.b.b.e.a.b.a(), System.currentTimeMillis() + BundleUtil.UNDERLINE_TAG + UUID.randomUUID().toString() + ".log");
                                        String absolutePath = file2.getAbsolutePath();
                                        String absolutePath2 = file3.getAbsolutePath();
                                        File file4 = new File(absolutePath);
                                        boolean renameTo = !file4.exists() ? false : file4.renameTo(new File(absolutePath2));
                                        if (e.b.b.n.a.b()) {
                                            List<String> list = e.b.b.e.a.a.a;
                                            e.b.b.n.g.b.a("APM-Slardar", "moveInactiveSubProcessData: src:" + file2.getAbsolutePath() + " dst:" + file3.getAbsolutePath() + " isSuccess:" + renameTo);
                                        }
                                        tryLock.release();
                                    } else if (e.b.b.n.a.b()) {
                                        List<String> list2 = e.b.b.e.a.a.a;
                                        e.b.b.n.g.b.a("APM-Slardar", "moveInactiveSubProcessData isValid is not true ");
                                    }
                                } finally {
                                    try {
                                        fileChannel.close();
                                    } catch (Throwable th) {
                                        if (fileChannel != null) {
                                            try {
                                                fileChannel.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                }
                                fileChannel.close();
                            }
                        } catch (Throwable unused2) {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d {
        private static final c a = new c();
    }

    static void d(c cVar) {
        String[] strArr;
        Objects.requireNonNull(cVar);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (cVar.f9373d != null) {
                cVar.f9373d.a();
            }
        } catch (Throwable th) {
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.c("APM-Slardar", "flushBuffer", th);
        }
        if (!cVar.f9372c.a()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (!cVar.f9372c.a()) {
                arrayList.add(cVar.f9372c.b());
                e.b.b.e.a.j.a b2 = cVar.f9372c.b();
                if (b2 != null) {
                    int f2 = b2.f();
                    if (i == 0 || i + f2 < cVar.b) {
                        i += f2;
                        arrayList.add(b2);
                    } else {
                        com.bytedance.apm6.consumer.slardar.send.c.i().k(arrayList, 0);
                        arrayList.clear();
                        arrayList.add(b2);
                        i = f2;
                    }
                }
            }
            com.bytedance.apm6.consumer.slardar.send.c.i().k(arrayList, 0);
        }
        if (e.b.b.h.c.a.y()) {
            if (cVar.f9373d != null) {
                strArr = cVar.f9373d.e();
            } else {
                List<String> list2 = e.b.b.e.a.a.a;
                e.b.b.n.g.b.b("APM-Slardar", "persistentBuffer is null");
                strArr = null;
            }
            if (strArr != null && strArr.length != 0) {
                List asList = Arrays.asList(strArr);
                Collections.sort(asList, new e.b.b.e.a.d(cVar));
                if (e.b.b.n.a.b()) {
                    List<String> list3 = e.b.b.e.a.a.a;
                    StringBuilder M = e.a.a.a.a.M("reportFile: parsing ");
                    M.append(asList.size());
                    M.append(" files. fileNameList");
                    M.append(asList);
                    e.b.b.n.g.b.a("APM-Slardar", M.toString());
                }
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= asList.size()) {
                        com.bytedance.apm6.consumer.slardar.send.c.i().k(arrayList2, 0);
                        break;
                    }
                    File file = new File(e.b.b.e.a.b.a(), (String) asList.get(i2));
                    if (file.exists()) {
                        e.b.b.e.a.j.a a2 = e.b.b.e.a.j.a.a(file);
                        if (a2 != null) {
                            int f3 = a2.f();
                            if (i3 != 0 && i3 + f3 >= cVar.b) {
                                com.bytedance.apm6.consumer.slardar.send.c.i().k(arrayList2, asList.size() - arrayList2.size());
                                break;
                            } else {
                                i3 += f3;
                                arrayList2.add(a2);
                            }
                        } else {
                            if (e.b.b.n.a.b()) {
                                List<String> list4 = e.b.b.e.a.a.a;
                                e.b.b.n.g.b.a("APM-Slardar", "logFile invalid. delete now.");
                            }
                            file.delete();
                        }
                    }
                    i2++;
                }
            }
        }
        if (e.b.b.n.a.b()) {
            List<String> list5 = e.b.b.e.a.a.a;
            StringBuilder M2 = e.a.a.a.a.M("LogReporter One Loop Cost:");
            M2.append(System.currentTimeMillis() - currentTimeMillis);
            e.b.b.n.g.b.a("APM-Slardar", M2.toString());
        }
    }

    public static c e() {
        return d.a;
    }

    @Override // e.b.b.e.a.k.d
    public long a() {
        String[] e2 = this.f9373d.e();
        long j = 0;
        if (e2 != null && e2.length != 0) {
            for (String str : e2) {
                j += new File(e.b.b.e.a.b.a(), str).length();
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // e.b.b.e.a.k.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r11) {
        /*
            r10 = this;
            e.b.b.e.a.j.c r0 = r10.f9373d
            if (r0 != 0) goto L5
            return
        L5:
            e.b.b.e.a.j.c r0 = r10.f9373d
            java.lang.String[] r0 = r0.e()
            if (r0 == 0) goto L4c
            int r1 = r0.length
            if (r1 != 0) goto L11
            goto L4c
        L11:
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r1) goto L4c
            r4 = r0[r3]
            java.io.File r5 = new java.io.File
            java.io.File r6 = e.b.b.e.a.b.a()
            r5.<init>(r6, r4)
            java.lang.String r4 = r5.getName()
            java.lang.String r6 = "_"
            int r6 = r4.indexOf(r6)
            r7 = -1
            r8 = -1
            if (r6 != r7) goto L32
        L30:
            r6 = r8
            goto L3a
        L32:
            java.lang.String r4 = r4.substring(r2, r6)     // Catch: java.lang.Exception -> L30
            long r6 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> L30
        L3a:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L42
            com.bytedance.android.input.k.b.a.t(r5)
            goto L49
        L42:
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 > 0) goto L49
            com.bytedance.android.input.k.b.a.t(r5)
        L49:
            int r3 = r3 + 1
            goto L14
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.e.a.c.b(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[SYNTHETIC] */
    @Override // e.b.b.e.a.k.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r13) {
        /*
            r12 = this;
            e.b.b.e.a.j.c r0 = r12.f9373d
            if (r0 != 0) goto L5
            return
        L5:
            e.b.b.e.a.j.c r0 = r12.f9373d
            java.lang.String[] r0 = r0.e()
            if (r0 == 0) goto L73
            int r1 = r0.length
            if (r1 != 0) goto L11
            goto L73
        L11:
            java.util.Arrays.sort(r0)
            int r1 = r0.length
            r2 = 0
            r4 = 0
            r6 = r2
            r5 = r4
        L1a:
            if (r5 >= r1) goto L3b
            r8 = r0[r5]
            java.io.File r9 = new java.io.File
            java.io.File r10 = e.b.b.e.a.b.a()
            r9.<init>(r10, r8)
            boolean r8 = r9.exists()
            if (r8 == 0) goto L38
            boolean r8 = r9.isFile()
            if (r8 == 0) goto L38
            long r8 = r9.length()
            long r6 = r6 + r8
        L38:
            int r5 = r5 + 1
            goto L1a
        L3b:
            int r1 = r0.length
            r5 = r4
        L3d:
            if (r5 >= r1) goto L73
            r8 = r0[r5]
            long r9 = r6 - r2
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 <= 0) goto L73
            java.io.File r9 = new java.io.File
            java.io.File r10 = e.b.b.e.a.b.a()
            r9.<init>(r10, r8)
            boolean r8 = r9.exists()
            if (r8 == 0) goto L70
            boolean r8 = r9.isFile()
            if (r8 == 0) goto L70
            long r10 = r9.length()
            boolean r8 = r9.exists()
            if (r8 != 0) goto L67
            goto L6c
        L67:
            boolean r8 = r9.delete()     // Catch: java.lang.Throwable -> L6c
            goto L6d
        L6c:
            r8 = r4
        L6d:
            if (r8 == 0) goto L70
            long r2 = r2 + r10
        L70:
            int r5 = r5 + 1
            goto L3d
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.e.a.c.c(long):void");
    }

    public synchronized void f() {
        this.f9374e = new b(0L, this.a);
        AsyncTaskManagerType asyncTaskManagerType = AsyncTaskManagerType.IO;
        com.bytedance.apm6.util.timetask.b.a(asyncTaskManagerType).c(this.f9374e);
        if (e.b.b.h.c.a.y()) {
            com.bytedance.apm6.util.timetask.b.a(asyncTaskManagerType).c(new C0423c(com.heytap.mcssdk.constant.a.q));
        }
    }

    public void g(e.b.b.e.a.j.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f9372c.c(aVar);
    }

    @Override // e.b.b.e.a.k.d
    public String getName() {
        return "first_log_dir";
    }

    public synchronized void h(long j) {
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.a("APM-Slardar", "setLoopInterval:" + this.a);
        }
        if (j > 0 && this.a != j) {
            this.a = j;
            if (this.f9374e == null) {
                return;
            }
            AsyncTaskManagerType asyncTaskManagerType = AsyncTaskManagerType.IO;
            com.bytedance.apm6.util.timetask.b.a(asyncTaskManagerType).b(this.f9374e);
            this.f9374e = new a(this.a, this.a);
            com.bytedance.apm6.util.timetask.b.a(asyncTaskManagerType).c(this.f9374e);
        }
    }

    public void i(long j) {
        if (j <= 0) {
            return;
        }
        this.b = j;
    }

    public void j(e.b.b.e.a.j.c cVar) {
        this.f9373d = cVar;
    }
}
