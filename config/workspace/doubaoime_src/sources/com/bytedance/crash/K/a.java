package com.bytedance.crash.K;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.N.g;
import com.bytedance.crash.Q.b;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private static InterfaceC0192a a;
    private static final HashMap<String, b> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4392c = 0;

    /* renamed from: com.bytedance.crash.K.a$a, reason: collision with other inner class name */
    interface InterfaceC0192a {
        List<String> a(long j, String str);

        void flush();

        boolean isInit();
    }

    static class b {
        final String a;
        final List<Long> b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4393c;

        b(String str, long j, CrashType crashType) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            this.a = str;
            arrayList.add(Long.valueOf(j));
            if (crashType == CrashType.LAUNCH) {
                this.f4393c = true;
            }
        }
    }

    static class c implements InterfaceC0192a {
        private final File a;
        private final com.bytedance.crash.K.c b;

        /* renamed from: c, reason: collision with root package name */
        private final com.bytedance.crash.K.d f4394c;

        c(String str, com.bytedance.crash.K.c cVar, com.bytedance.crash.K.d dVar) {
            this.a = new File(str);
            this.b = cVar;
            this.f4394c = dVar;
        }

        @Override // com.bytedance.crash.K.a.InterfaceC0192a
        @Nullable
        public List<String> a(long j, String str) {
            if (!this.a.exists()) {
                return null;
            }
            Object obj = this.f4394c;
            if (obj instanceof com.bytedance.crash.K.b) {
                obj = new com.bytedance.crash.K.b(str);
            }
            try {
                return ((com.bytedance.crash.K.b) obj).a(this.a.getAbsolutePath(), j);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.bytedance.crash.K.a.InterfaceC0192a
        public void flush() {
            com.bytedance.crash.K.c cVar = this.b;
            if (cVar != null) {
                try {
                    cVar.a();
                } catch (Throwable th) {
                    com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
                }
            }
        }

        @Override // com.bytedance.crash.K.a.InterfaceC0192a
        public boolean isInit() {
            return true;
        }
    }

    static class d implements Runnable {
        private int a = 0;
        private com.bytedance.crash.monitor.a b;

        d(@NonNull com.bytedance.crash.monitor.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.c() && com.bytedance.crash.util.d.b()) {
                a.a(this.b);
                return;
            }
            int i = this.a;
            this.a = i + 1;
            if (i < 60) {
                com.bytedance.crash.runtime.b.f(this, 2000L);
            }
        }
    }

    static void a(com.bytedance.crash.monitor.a aVar) {
        HashMap hashMap;
        int i;
        String str;
        String f2;
        HashMap<String, b> hashMap2 = b;
        synchronized (hashMap2) {
            hashMap = new HashMap(hashMap2);
            hashMap2.clear();
        }
        Iterator it2 = hashMap.keySet().iterator();
        while (it2.hasNext()) {
            b bVar = (b) hashMap.get((String) it2.next());
            if (bVar != null && !bVar.b.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator<Long> it3 = bVar.b.iterator();
                while (it3.hasNext()) {
                    List<String> a2 = c() ? a.a(it3.next().longValue(), bVar.a) : null;
                    if (a2 != null) {
                        hashSet.addAll(a2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList(hashSet);
                    String str2 = bVar.a;
                    try {
                        i = Integer.parseInt(aVar.b());
                    } catch (Throwable unused) {
                        i = 0;
                    }
                    if (i <= 0) {
                        str = "no_aid";
                    } else {
                        try {
                            f2 = aVar.f("0");
                        } catch (Throwable th) {
                            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
                        }
                        if (TextUtils.isEmpty(f2)) {
                            str = "no_did";
                        } else {
                            if (CrashUploader.n(CrashUploader.a(g.b(), i, f2, aVar.n(), aVar.i()), i, f2, str2, arrayList)) {
                                str = "success";
                            }
                            str = "unknown";
                        }
                    }
                    b.C0199b c0199b = new b.C0199b("alog_check");
                    Object[] objArr = new Object[6];
                    objArr[0] = "check_result";
                    objArr[1] = str;
                    objArr[2] = CrashHianalyticsData.CRASH_TYPE;
                    objArr[3] = bVar.f4393c ? "lunch" : "normal";
                    objArr[4] = "alog_inited";
                    objArr[5] = c() ? "true" : "uncertain";
                    c0199b.a(objArr);
                    c0199b.d();
                }
            }
        }
    }

    public static void b() {
        if (c()) {
            a.flush();
        }
    }

    public static boolean c() {
        InterfaceC0192a interfaceC0192a = a;
        return interfaceC0192a != null && interfaceC0192a.isInit();
    }

    public static void d(String str, long j, long j2, CrashType crashType) {
        HashMap<String, b> hashMap = b;
        synchronized (hashMap) {
            b bVar = hashMap.get(str + j);
            if (bVar == null) {
                hashMap.put(str + j, new b(str, j2, crashType));
            } else {
                bVar.b.add(Long.valueOf(j2));
                if (crashType == CrashType.LAUNCH) {
                    bVar.f4393c = true;
                }
            }
        }
    }

    public static void e(String str, com.bytedance.crash.K.c cVar, com.bytedance.crash.K.d dVar) {
        if (TextUtils.isEmpty(str) || a != null) {
            return;
        }
        a = new c(str, cVar, dVar);
    }

    public static void f(@NonNull com.bytedance.crash.monitor.a aVar) {
        try {
            new d(aVar).run();
        } catch (Exception e2) {
            com.bytedance.crash.Q.b.e("NPTH_ANR_ERROR_AlogManager", e2);
        }
    }
}
