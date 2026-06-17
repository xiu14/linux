package com.bytedance.apm.B;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.util.o;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.bytedance.apm.B.a {
    private static String C;
    private static String D;
    private o<c> A;
    private o<C0106e> B;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3237g;
    private boolean h;
    private com.bytedance.apm.x.d m;
    private String n;
    private String o;
    private long p;
    private long q;
    private long r;
    private long s;
    private boolean t;
    private List<b> u;
    private o<c> z;
    private long i = 524288000;
    private long j = 524288000;
    private int k = 20;
    private long l = 2592000000L;
    private List<String> v = new ArrayList();
    private List<String> w = new ArrayList();
    private List<String> x = new ArrayList();
    private List<String> y = new ArrayList();

    class a implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ List b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f3238c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f3239d;

        a(long j, List list, List list2, List list3) {
            this.a = j;
            this.b = list;
            this.f3238c = list2;
            this.f3239d = list3;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.m.a(e.this.i, this.a, this.b, this.f3238c, this.f3239d);
        }
    }

    private static class c implements Comparable {
        private String a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        private int f3245c;

        public c() {
        }

        public JSONObject b() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.a;
                if (str.contains(e.C)) {
                    str = str.replace(e.C, "internal");
                } else if (str.contains(e.D)) {
                    str = str.replace(e.D, "external");
                }
                jSONObject.put("name", str);
                jSONObject.put(MonitorConstants.SIZE, this.b);
                int i = this.f3245c;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.b;
            long j2 = ((c) obj).b;
            if (j == j2) {
                return 0;
            }
            return j > j2 ? 1 : -1;
        }

        public c(String str, long j, int i) {
            this.a = str;
            this.b = j;
            this.f3245c = i;
        }
    }

    private class d {
        private String a;
        public d b;

        /* renamed from: c, reason: collision with root package name */
        public long f3246c;

        /* renamed from: d, reason: collision with root package name */
        private int f3247d;

        /* renamed from: e, reason: collision with root package name */
        private int f3248e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3249f;

        /* renamed from: g, reason: collision with root package name */
        private long f3250g;
        private boolean h;

        d(a aVar) {
        }

        static /* synthetic */ int d(d dVar) {
            int i = dVar.f3247d;
            dVar.f3247d = i - 1;
            return i;
        }

        public void h(long j) {
            long j2 = this.f3246c + j;
            this.f3246c = j2;
            int i = this.f3248e + 1;
            this.f3248e = i;
            d dVar = this.b;
            if (dVar != null) {
                if (i == this.f3247d) {
                    if (this.h) {
                        dVar.h = true;
                    }
                    if (j2 >= e.this.j && !this.h) {
                        e.p(e.this, this.a, this.f3246c, this.f3248e, this.f3247d);
                        this.b.h = true;
                    }
                    this.b.h(this.f3246c);
                    if (this.f3249f) {
                        e.this.y(this.a, this.f3246c, this.f3247d, this.f3250g);
                    }
                    if (TextUtils.equals(this.a, e.C)) {
                        e.this.p = this.f3246c;
                        return;
                    }
                    if (TextUtils.equals(this.a, e.D)) {
                        e.this.q = this.f3246c;
                    } else if (TextUtils.equals(this.a, e.this.n)) {
                        e.this.r = this.f3246c;
                    } else if (TextUtils.equals(this.a, e.this.o)) {
                        e.this.s = this.f3246c;
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.apm.B.e$e, reason: collision with other inner class name */
    private static class C0106e extends c {

        /* renamed from: d, reason: collision with root package name */
        private String f3251d;

        /* renamed from: e, reason: collision with root package name */
        public long f3252e;

        /* renamed from: f, reason: collision with root package name */
        private int f3253f;

        /* renamed from: g, reason: collision with root package name */
        private long f3254g;

        public C0106e(String str, long j, int i, long j2) {
            this.f3251d = str;
            this.f3252e = j;
            this.f3253f = i;
            this.f3254g = j2;
        }

        @Override // com.bytedance.apm.B.e.c
        public JSONObject b() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f3251d;
                if (str.contains(e.C)) {
                    str = str.replace(e.C, "internal");
                } else if (str.contains(e.D)) {
                    str = str.replace(e.D, "external");
                }
                jSONObject.put("name", str);
                jSONObject.put(MonitorConstants.SIZE, this.f3252e);
                int i = this.f3253f;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                jSONObject.put("outdate_interval", this.f3254g);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.apm.B.e.c, java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f3254g;
            long j2 = ((C0106e) obj).f3254g;
            if (j == j2) {
                return 0;
            }
            return j > j2 ? 1 : -1;
        }
    }

    public e() {
        this.f3229e = "disk";
    }

    private static List<String> B(o<? extends c> oVar) {
        if (oVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it2 = ((ArrayList) oVar.d()).iterator();
        while (it2.hasNext()) {
            linkedList.add(((c) it2.next()).a);
        }
        return linkedList;
    }

    private long C(File file) {
        File[] listFiles;
        long j = 0;
        try {
            listFiles = file.listFiles();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                j += file2.isDirectory() ? C(file2) : file2.length();
            }
            return j;
        }
        return 0L;
    }

    private boolean D(b bVar) {
        Iterator<String> it2 = this.x.iterator();
        while (it2.hasNext()) {
            if (bVar.a.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private long E(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.l || currentTimeMillis >= 62899200000L) {
            return 0L;
        }
        return currentTimeMillis;
    }

    private void F(long j, long j2, long j3, long j4) {
        try {
            if (com.bytedance.apm.g.B()) {
                com.bytedance.apm.y.d.d("<monitor><perf>", "disk: data: " + j + " , cache: " + j2 + " , total: " + j3 + " , free: " + j4);
            }
            long j5 = 17179869184L;
            long j6 = j > 17179869184L ? 17179869184L : j;
            if (j2 <= 17179869184L) {
                j5 = j2;
            }
            JSONObject jSONObject = new JSONObject();
            if (j > 0) {
                jSONObject.put(RemoteMessageConst.DATA, j6);
            }
            if (j2 > 0) {
                jSONObject.put("cache", j5);
            }
            if (j3 > 0) {
                jSONObject.put("total", j3 / DownloadConstants.GB);
            }
            if (j4 > 0) {
                jSONObject.put("rom_free", j4 / DownloadConstants.GB);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.h && j6 > this.i) {
                if (this.z != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = ((ArrayList) this.z.d()).iterator();
                    while (it2.hasNext()) {
                        JSONObject b2 = ((c) it2.next()).b();
                        if (b2 != null) {
                            jSONArray.put(b2);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                }
                if (this.A != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it3 = ((ArrayList) this.A.d()).iterator();
                    while (it3.hasNext()) {
                        JSONObject b3 = ((c) it3.next()).b();
                        if (b3 != null) {
                            jSONArray2.put(b3);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                }
                if (this.B != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it4 = ((ArrayList) this.B.d()).iterator();
                    while (it4.hasNext()) {
                        JSONObject b4 = ((C0106e) it4.next()).b();
                        if (b4 != null) {
                            jSONArray3.put(b4);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                }
                List<b> list = this.u;
                if (list != null && !list.isEmpty()) {
                    BigDecimal bigDecimal = new BigDecimal(j6);
                    JSONArray jSONArray4 = new JSONArray();
                    for (b bVar : this.u) {
                        if (D(bVar)) {
                            bVar.f3241c = 0.0f;
                        } else {
                            bVar.f3241c = (float) new BigDecimal(bVar.b).divide(bigDecimal, 4, 4).doubleValue();
                        }
                        List<b> list2 = bVar.f3244f;
                        if (list2 != null && list2.size() > 0) {
                            for (b bVar2 : list2) {
                                if (D(bVar2)) {
                                    bVar2.f3241c = 0.0f;
                                } else {
                                    bVar2.f3241c = (float) new BigDecimal(bVar2.b).divide(bigDecimal, 4, 4).doubleValue();
                                }
                            }
                        }
                        jSONArray4.put(bVar.a());
                    }
                    jSONObject2.put("disk_info", jSONArray4);
                }
                if (this.m != null) {
                    com.bytedance.apm.F.b.e().o(new a(j6, B(this.z), B(this.A), B(this.B)));
                }
                this.z = null;
                this.A = null;
                this.B = null;
                this.u = null;
            }
            h(new com.bytedance.apm.v.d.d("disk", "storageUsed", false, jSONObject, null, jSONObject2));
        } catch (Exception unused) {
        }
    }

    static void p(e eVar, String str, long j, int i, int i2) {
        Objects.requireNonNull(eVar);
        if (com.bytedance.apm.g.B()) {
            Log.d("MonitorStorage", "appendExceptionFolderQueue: path: " + str + ":  size: " + j + " , accumulateNum: " + i + " , num: " + i2);
        }
        if (j > 17179869184L) {
            return;
        }
        if (eVar.A == null) {
            eVar.A = new o<>(eVar.k);
        }
        eVar.A.a(new c(str, j, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str, long j, int i, long j2) {
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.d.b("MonitorStorage", "appendutdatedFileQueue: path: " + str + ", size: " + j);
        }
        if (j < WsConstants.DEFAULT_IO_LIMIT || j > 17179869184L) {
            return;
        }
        if (this.B == null) {
            this.B = new o<>(this.k);
        }
        this.B.a(new C0106e(str, j, i, j2));
    }

    private void z(File file, int i, boolean z, List<b> list) {
        if (i > 2 || !file.exists() || this.x.contains(file.getAbsolutePath())) {
            return;
        }
        if (!file.isDirectory()) {
            b bVar = new b(null);
            bVar.f3242d = false;
            bVar.a = file.getAbsolutePath();
            bVar.b = file.length();
            if (!z) {
                bVar.f3243e = MonitorConstants.CUSTOM;
            }
            list.add(bVar);
            return;
        }
        if (!z) {
            b bVar2 = new b(null);
            bVar2.f3242d = true;
            bVar2.f3243e = MonitorConstants.CUSTOM;
            bVar2.a = file.getAbsolutePath();
            bVar2.b = C(file);
            list.add(bVar2);
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2 != null && file2.exists() && !this.x.contains(file2.getAbsolutePath())) {
                b bVar3 = new b(null);
                bVar3.f3242d = file2.isDirectory();
                bVar3.a = file2.getAbsolutePath();
                if (file2.isDirectory()) {
                    ArrayList arrayList = new ArrayList();
                    bVar3.f3244f = arrayList;
                    if (i == 2) {
                        bVar3.b = C(file2);
                    }
                    z(file2, i + 1, z, arrayList);
                    list.add(bVar3);
                } else {
                    bVar3.b = file2.length();
                    list.add(bVar3);
                }
            }
        }
    }

    public void A() {
        List<b> list;
        String[] strArr;
        Object obj;
        int i;
        String[] strArr2 = {C, D};
        this.u = new ArrayList();
        int i2 = 0;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            String str = strArr2[i2];
            z(new File(str), 1, true, this.u);
            File file = new File(str);
            Object obj2 = null;
            d dVar = new d(null);
            dVar.a = str;
            dVar.b = new d(null);
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                dVar.f3247d = listFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(dVar);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        d dVar2 = (d) linkedList.poll();
                        if (dVar2 == null) {
                            strArr = strArr2;
                            obj = obj2;
                            i = i4;
                        } else {
                            String str2 = dVar2.a;
                            File file2 = new File(str2);
                            if (!file2.exists() || this.x.contains(str2)) {
                                strArr = strArr2;
                                obj = obj2;
                                i = i4;
                                d.d(dVar2.b);
                            } else {
                                strArr = strArr2;
                                if (file2.isFile()) {
                                    long length = file2.length();
                                    if (length > 0) {
                                        if (com.bytedance.apm.g.B()) {
                                            com.bytedance.apm.y.d.b("MonitorStorage", "appendExceptionFileQueue: path: " + str2 + ", size: " + length);
                                        }
                                        if (length <= 17179869184L) {
                                            if (this.z == null) {
                                                this.z = new o<>(this.k);
                                            }
                                            this.z.a(new c(str2, length, 1));
                                        }
                                    }
                                    d dVar3 = dVar2.b;
                                    if (dVar3 != null) {
                                        dVar3.h(length);
                                        if (!dVar2.b.f3249f) {
                                            long E = E(file2.lastModified());
                                            if (E > 0) {
                                                i = i4;
                                                y(str2, length, 0, E);
                                            }
                                        }
                                    }
                                    i = i4;
                                } else {
                                    i = i4;
                                    File[] listFiles2 = file2.listFiles();
                                    if (listFiles2 == null || listFiles2.length == 0) {
                                        obj = null;
                                        dVar2.b.h(0L);
                                    } else {
                                        dVar2.f3247d = listFiles2.length;
                                        for (File file3 : listFiles2) {
                                            d dVar4 = new d(null);
                                            dVar4.b = dVar2;
                                            dVar4.a = file3.getAbsolutePath();
                                            if (file3.isDirectory() && !dVar2.f3249f) {
                                                long E2 = E(file3.lastModified());
                                                if (E2 > 0) {
                                                    dVar4.f3249f = true;
                                                    dVar4.f3250g = E2;
                                                }
                                            }
                                            linkedList.offer(dVar4);
                                        }
                                    }
                                }
                                obj = null;
                            }
                        }
                        i4 = i + 1;
                        obj2 = obj;
                        strArr2 = strArr;
                    }
                }
            }
            i2++;
            strArr2 = strArr2;
        }
        List<String> list2 = this.y;
        if (list2 != null && list2.size() > 0) {
            Iterator<String> it2 = this.y.iterator();
            while (it2.hasNext()) {
                z(new File(it2.next()), 1, false, this.u);
            }
        }
        for (b bVar : this.u) {
            if ("normal".equals(bVar.f3243e) && (list = bVar.f3244f) != null && !list.isEmpty()) {
                Iterator<b> it3 = list.iterator();
                while (it3.hasNext()) {
                    bVar.b += it3.next().b;
                }
            }
        }
    }

    public void G(com.bytedance.apm.x.d dVar) {
        this.m = null;
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("dump_switch", true);
        this.h = optBoolean;
        if (optBoolean) {
            long currentTimeMillis = System.currentTimeMillis() - com.bytedance.apm.internal.h.a().c("check_disk_last_time");
            if (currentTimeMillis < com.heytap.mcssdk.constant.a.f6888f && currentTimeMillis > 0) {
                this.f3237g = true;
            }
            if (jSONObject.optInt("dump_threshold") > 0) {
                this.i = jSONObject.optInt("dump_threshold") * DownloadConstants.KB * DownloadConstants.KB;
            }
            if (jSONObject.optInt("abnormal_folder_size") > 0) {
                this.j = jSONObject.optInt("abnormal_folder_size") * DownloadConstants.KB * DownloadConstants.KB;
            }
            if (jSONObject.optInt("dump_top_count") > 0) {
                this.k = jSONObject.optInt("dump_top_count");
            }
            if (jSONObject.optInt("outdated_days") > 0) {
                this.l = jSONObject.optInt("outdated_days") * com.heytap.mcssdk.constant.a.f6888f;
            }
            this.v = com.bytedance.android.input.k.b.a.t0(jSONObject, "disk_customed_paths");
            this.w = com.bytedance.android.input.k.b.a.s0(jSONObject, "ignored_relative_paths");
        }
        this.f3237g = true;
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:65|(3:101|102|(1:104)(2:105|(15:107|(1:109)(1:112)|110|68|(3:86|87|(1:89)(14:90|(1:92)(1:99)|93|(1:95)(1:98)|96|71|72|73|(6:75|76|77|78|79|80)|84|77|78|79|80))|70|71|72|73|(0)|84|77|78|79|80)))|67|68|(0)|70|71|72|73|(0)|84|77|78|79|80) */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #3 {all -> 0x01a3, blocks: (B:73:0x0181, B:75:0x018d), top: B:72:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.apm.B.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.B.e.g():void");
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return 120000L;
    }

    private static class b {
        public String a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        public float f3241c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3242d;

        /* renamed from: e, reason: collision with root package name */
        public String f3243e = "normal";

        /* renamed from: f, reason: collision with root package name */
        public List<b> f3244f = new ArrayList();

        private b() {
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                String str = this.a;
                if (str.contains(e.C)) {
                    str = str.replace(e.C, "internal");
                } else if (str.contains(e.D)) {
                    str = str.replace(e.D, "external");
                }
                jSONObject.put(DownloadConstants.PATH_KEY, str);
                jSONObject.put(MonitorConstants.SIZE, this.b);
                jSONObject.put("size_rate", this.f3241c);
                jSONObject.put("is_folder", this.f3242d);
                jSONObject.put("report_type", this.f3243e);
                if (!this.f3244f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<b> it2 = this.f3244f.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().a());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        b(a aVar) {
        }
    }
}
