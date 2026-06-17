package e.b.b.f;

import android.app.Application;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.apm.util.o;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.dumper.Scraps;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static c p = new c();
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f9415c;

    /* renamed from: d, reason: collision with root package name */
    private String f9416d;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f9418f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f9419g;
    private List<String> h;
    private boolean i;
    private e.b.b.f.d.a j;
    private com.bytedance.apm.x.d o;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f9417e = false;
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;

    private class b {
        public String a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        public float f9420c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9421d;

        /* renamed from: e, reason: collision with root package name */
        public String f9422e = "normal";

        /* renamed from: f, reason: collision with root package name */
        public List<b> f9423f = new ArrayList();

        b(a aVar) {
        }

        private String a() {
            String str = this.a;
            String c2 = c.c(c.this, str);
            if (c2 != null) {
                str = c2;
            }
            return str.contains(c.this.a) ? str.replace(c.this.a, "internal") : str.contains(c.this.f9415c) ? str.replace(c.this.f9415c, "external") : str;
        }

        public JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(DownloadConstants.PATH_KEY, a());
                jSONObject.put(MonitorConstants.SIZE, this.b);
                jSONObject.put("size_rate", this.f9420c);
                jSONObject.put("is_folder", this.f9421d);
                jSONObject.put("report_type", this.f9422e);
                if (!this.f9423f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<b> it2 = this.f9423f.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().b());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: e.b.b.f.c$c, reason: collision with other inner class name */
    private class C0425c implements Comparable {
        private String a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        private int f9425c;

        public C0425c() {
        }

        private String b() {
            String str = this.a;
            String c2 = c.c(c.this, str);
            if (c2 != null) {
                str = c2;
            }
            return str.contains(c.this.a) ? str.replace(c.this.a, "internal") : str.contains(c.this.f9415c) ? str.replace(c.this.f9415c, "external") : str;
        }

        public JSONObject c() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", b());
                jSONObject.put(MonitorConstants.SIZE, this.b);
                int i = this.f9425c;
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
            long j2 = ((C0425c) obj).b;
            if (j == j2) {
                return 0;
            }
            return j > j2 ? 1 : -1;
        }

        public C0425c(String str, long j, int i) {
            this.a = str;
            this.b = j;
            this.f9425c = i;
        }
    }

    private class d {
        private String a;
        public d b;

        /* renamed from: c, reason: collision with root package name */
        public long f9427c;

        /* renamed from: d, reason: collision with root package name */
        private int f9428d;

        /* renamed from: e, reason: collision with root package name */
        private int f9429e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9430f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9431g;

        d(a aVar) {
        }

        static /* synthetic */ int d(d dVar) {
            int i = dVar.f9428d;
            dVar.f9428d = i - 1;
            return i;
        }

        public void g(long j, o<C0425c> oVar, o<C0425c> oVar2) {
            long j2 = this.f9427c + j;
            this.f9427c = j2;
            int i = this.f9429e + 1;
            this.f9429e = i;
            d dVar = this.b;
            if (dVar != null) {
                if (i == this.f9428d) {
                    if (this.f9431g) {
                        dVar.f9431g = true;
                    }
                    if (j2 >= c.this.j.e() && !this.f9431g) {
                        if (!c.this.w(this.f9427c)) {
                            oVar2.a(c.this.new C0425c(this.a, this.f9427c, this.f9428d));
                        }
                        this.b.f9431g = true;
                    }
                    this.b.g(this.f9427c, oVar, oVar2);
                    if (this.f9430f) {
                        c cVar = c.this;
                        long j3 = this.f9427c;
                        Objects.requireNonNull(cVar);
                        if (j3 >= 104857600 && j3 <= 17179869184L) {
                            c cVar2 = c.this;
                            String str = this.a;
                            long j4 = this.f9427c;
                            int i2 = this.f9428d;
                            oVar.a(cVar2.new e(str, j4, i2, i2));
                        }
                    }
                }
            }
        }
    }

    private class e extends C0425c {

        /* renamed from: e, reason: collision with root package name */
        private final String f9432e;

        /* renamed from: f, reason: collision with root package name */
        public long f9433f;

        /* renamed from: g, reason: collision with root package name */
        private int f9434g;
        private long h;

        public e(String str, long j, int i, long j2) {
            super();
            this.f9432e = str;
            this.f9433f = j;
            this.f9434g = i;
            this.h = j2;
        }

        private String b() {
            String str = this.f9432e;
            String c2 = c.c(c.this, str);
            if (c2 != null) {
                str = c2;
            }
            return str.contains(c.this.a) ? str.replace(c.this.a, "internal") : str.contains(c.this.f9415c) ? str.replace(c.this.f9415c, "external") : str;
        }

        @Override // e.b.b.f.c.C0425c
        public JSONObject c() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", b());
                jSONObject.put(MonitorConstants.SIZE, this.f9433f);
                int i = this.f9434g;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                jSONObject.put("outdate_interval", this.h);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // e.b.b.f.c.C0425c, java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.h;
            long j2 = ((e) obj).h;
            if (j == j2) {
                return 0;
            }
            return j > j2 ? 1 : -1;
        }
    }

    private c() {
    }

    static String c(c cVar, String str) {
        String str2;
        if (!com.bytedance.android.input.k.b.a.e0(cVar.h) && str != null) {
            Iterator<String> it2 = cVar.h.iterator();
            while (it2.hasNext()) {
                str2 = it2.next();
                if (str.startsWith(str2)) {
                    break;
                }
            }
        }
        str2 = null;
        if (str2 == null || str == null) {
            return null;
        }
        return e.a.a.a.a.s(str2, str.substring(str2.length()).replaceAll("[^/]", "*"));
    }

    private long f(File file, List<b> list) {
        long j = 0;
        if (file != null && file.exists() && !u(file)) {
            if (file.isFile()) {
                long length = file.length();
                if (length < this.j.d()) {
                    return length;
                }
                b bVar = new b(null);
                bVar.f9421d = false;
                bVar.a = file.getAbsolutePath();
                bVar.b = length;
                list.add(bVar);
                return length;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                b bVar2 = new b(null);
                bVar2.f9421d = file.isDirectory();
                bVar2.a = file.getAbsolutePath();
                ArrayList arrayList = new ArrayList();
                bVar2.f9423f = arrayList;
                list.add(bVar2);
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && !u(file2)) {
                        j += f(file2, arrayList);
                    }
                }
                bVar2.b = j;
            }
        }
        return j;
    }

    private List<d> g(String str, o<C0425c> oVar, o<C0425c> oVar2, o<C0425c> oVar3, List<String> list) {
        int i;
        List<String> list2;
        ArrayList arrayList;
        LinkedList linkedList;
        File[] fileArr;
        int i2;
        File file;
        String str2;
        ArrayList arrayList2;
        long j;
        List<String> list3 = list;
        ArrayList arrayList3 = new ArrayList();
        File file2 = new File(str);
        d dVar = new d(null);
        dVar.a = str;
        dVar.b = new d(null);
        File[] listFiles = file2.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        if (list3.contains(file2.getAbsolutePath())) {
            arrayList3.add(dVar);
            list3.remove(file2.getAbsolutePath());
        }
        dVar.f9428d = listFiles.length;
        LinkedList linkedList2 = new LinkedList();
        linkedList2.offer(dVar);
        while (!linkedList2.isEmpty()) {
            int size = linkedList2.size();
            int i3 = 0;
            while (i3 < size) {
                d dVar2 = (d) linkedList2.poll();
                if (dVar2 == null) {
                    i = i3;
                    list2 = list3;
                    arrayList = arrayList3;
                    linkedList = linkedList2;
                } else {
                    String str3 = dVar2.a;
                    File file3 = new File(str3);
                    if (!file3.exists() || u(file3)) {
                        i = i3;
                        list2 = list3;
                        arrayList = arrayList3;
                        linkedList = linkedList2;
                        d.d(dVar2.b);
                    } else if (file3.isFile()) {
                        LinkedList linkedList3 = linkedList2;
                        long length = file3.length();
                        if (w(length)) {
                            file = file3;
                            str2 = str3;
                            arrayList2 = arrayList3;
                            j = 0;
                        } else {
                            arrayList2 = arrayList3;
                            j = 0;
                            file = file3;
                            str2 = str3;
                            oVar.a(new C0425c(str3, length, 1));
                        }
                        d dVar3 = dVar2.b;
                        if (dVar3 != null) {
                            dVar3.g(length, oVar3, oVar2);
                            if (!dVar2.b.f9430f) {
                                long r = r(file.lastModified());
                                if (r > j) {
                                    if (length >= 104857600 && length <= 17179869184L) {
                                        i = i3;
                                        oVar3.a(new e(str2, size, 0, r));
                                        linkedList = linkedList3;
                                        list2 = list;
                                        arrayList = arrayList2;
                                    }
                                }
                            }
                        }
                        i = i3;
                        linkedList = linkedList3;
                        list2 = list;
                        arrayList = arrayList2;
                    } else {
                        i = i3;
                        ArrayList arrayList4 = arrayList3;
                        LinkedList linkedList4 = linkedList2;
                        list2 = list;
                        if (list2.contains(file3.getAbsolutePath())) {
                            arrayList = arrayList4;
                            arrayList.add(dVar2);
                            list2.remove(file3.getAbsolutePath());
                        } else {
                            arrayList = arrayList4;
                        }
                        File[] listFiles2 = file3.listFiles();
                        if (listFiles2 == null || listFiles2.length == 0) {
                            linkedList = linkedList4;
                            dVar2.b.g(0L, oVar3, oVar2);
                        } else {
                            dVar2.f9428d = listFiles2.length;
                            int i4 = 0;
                            for (int length2 = listFiles2.length; i4 < length2; length2 = i2) {
                                File file4 = listFiles2[i4];
                                d dVar4 = new d(null);
                                dVar4.b = dVar2;
                                dVar4.a = file4.getAbsolutePath();
                                if (!file4.isDirectory() || dVar2.f9430f) {
                                    fileArr = listFiles2;
                                    i2 = length2;
                                } else {
                                    fileArr = listFiles2;
                                    i2 = length2;
                                    if (r(file4.lastModified()) > 0) {
                                        dVar4.f9430f = true;
                                        LinkedList linkedList5 = linkedList4;
                                        linkedList5.offer(dVar4);
                                        i4++;
                                        linkedList4 = linkedList5;
                                        listFiles2 = fileArr;
                                    }
                                }
                                LinkedList linkedList52 = linkedList4;
                                linkedList52.offer(dVar4);
                                i4++;
                                linkedList4 = linkedList52;
                                listFiles2 = fileArr;
                            }
                            linkedList = linkedList4;
                        }
                    }
                }
                i3 = i + 1;
                arrayList3 = arrayList;
                list3 = list2;
                linkedList2 = linkedList;
            }
        }
        return arrayList3;
    }

    private void h(List<d> list) {
        if (com.bytedance.android.input.k.b.a.e0(list)) {
            return;
        }
        for (d dVar : list) {
            if (TextUtils.equals(dVar.a, this.a)) {
                this.k = dVar.f9427c;
            } else if (TextUtils.equals(dVar.a, this.f9415c)) {
                this.l = dVar.f9427c;
            } else if (TextUtils.equals(dVar.a, this.b)) {
                this.m = dVar.f9427c;
            } else if (TextUtils.equals(dVar.a, this.f9416d)) {
                this.n = dVar.f9427c;
            }
        }
    }

    private void i(File file, List<b> list) {
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (File file2 : listFiles) {
            f(file2, list);
        }
    }

    private static List<String> k(o<? extends C0425c> oVar) {
        if (oVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it2 = ((ArrayList) oVar.d()).iterator();
        while (it2.hasNext()) {
            linkedList.add(((C0425c) it2.next()).a);
        }
        return linkedList;
    }

    private JSONArray l(List<b> list, long j) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal(j);
        JSONArray jSONArray = new JSONArray();
        for (b bVar : list) {
            if (v(bVar)) {
                bVar.f9420c = 0.0f;
            } else {
                bVar.f9420c = t(bVar.b, bigDecimal);
            }
            List<b> list2 = bVar.f9423f;
            if (list2 != null && list2.size() > 0) {
                for (b bVar2 : list2) {
                    if (v(bVar2)) {
                        bVar2.f9420c = 0.0f;
                    } else {
                        bVar2.f9420c = t(bVar2.b, bigDecimal);
                    }
                }
            }
            jSONArray.put(bVar.b());
        }
        return jSONArray;
    }

    private long n() {
        try {
            try {
                Application a2 = e.b.b.n.a.a();
                String packageName = a2.getPackageName();
                StorageStats queryStatsForUid = ((StorageStatsManager) a2.getSystemService("storagestats")).queryStatsForUid(((StorageManager) a2.getSystemService(Scraps.STORAGE)).getUuidForPath(new File(a2.getDataDir().getParent(), packageName)), a2.getPackageManager().getApplicationInfo(packageName, 128).uid);
                if (e.b.b.n.a.b()) {
                    Log.e("APM-Disk", "storageStats.getAppBytes():" + queryStatsForUid.getAppBytes());
                }
                return queryStatsForUid.getAppBytes();
            } catch (Throwable unused) {
                long o = o(new File(e.b.b.n.a.a().getPackageManager().getApplicationInfo(e.b.b.n.a.a().getPackageName(), 0).sourceDir).getParentFile());
                if (e.b.b.n.a.b()) {
                    Log.e("APM-Disk", "storageStats.getAppBytes():" + (q() + o + this.k + this.l));
                }
                return o + q() + this.k + this.l;
            }
        } catch (Exception unused2) {
            return 0L;
        }
    }

    private long o(File file) {
        File[] listFiles;
        long j = 0;
        try {
            listFiles = file.listFiles();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                j += file2.isDirectory() ? o(file2) : file2.length();
            }
            return j;
        }
        return 0L;
    }

    public static c p() {
        return p;
    }

    private long q() {
        long j = 0;
        for (File file : e.b.b.n.a.a().getApplicationContext().getExternalMediaDirs()) {
            j += o(file);
        }
        return j;
    }

    private long r(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.j.g() || currentTimeMillis >= 62899200000L) {
            return 0L;
        }
        return currentTimeMillis;
    }

    private Pair<Long, Long> s() {
        try {
            StorageStatsManager storageStatsManager = (StorageStatsManager) e.b.b.n.a.a().getSystemService("storagestats");
            StorageManager storageManager = (StorageManager) e.b.b.n.a.a().getSystemService(Scraps.STORAGE);
            Iterator<StorageVolume> it2 = storageManager.getStorageVolumes().iterator();
            long j = 0;
            long j2 = 0;
            while (it2.hasNext()) {
                String uuid = it2.next().getUuid();
                UUID fromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                j += storageStatsManager.getTotalBytes(fromString);
                j2 += storageManager.getAllocatableBytes(fromString);
            }
            return new Pair<>(Long.valueOf(((j / 1000) / 1000) * DownloadConstants.KB * DownloadConstants.KB), Long.valueOf(((j2 / 1000) / 1000) * DownloadConstants.KB * DownloadConstants.KB));
        } catch (Throwable unused) {
            return new Pair<>(Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes() + new StatFs(Environment.getRootDirectory().getPath()).getTotalBytes()), Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes()));
        }
    }

    private float t(long j, BigDecimal bigDecimal) {
        return (float) new BigDecimal(j).divide(bigDecimal, 4, 4).doubleValue();
    }

    private boolean u(File file) {
        if (com.bytedance.android.input.k.b.a.e0(this.f9418f)) {
            return false;
        }
        return this.f9418f.contains(file.getAbsolutePath());
    }

    private boolean v(b bVar) {
        Iterator<String> it2 = this.f9418f.iterator();
        while (it2.hasNext()) {
            if (bVar.a.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(long j) {
        return j < 0 || j > 17179869184L;
    }

    private List<String> y(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (com.bytedance.android.input.k.b.a.e0(list)) {
            return arrayList;
        }
        for (String str : list) {
            if (str.contains("internal")) {
                arrayList.add(str.replace("internal", this.a));
            } else if (str.contains("external")) {
                arrayList.add(str.replace("external", this.f9415c));
            }
        }
        return arrayList;
    }

    e.b.b.f.b j(e.b.b.f.d.a aVar) {
        String str;
        long j;
        long totalSpace;
        long freeSpace;
        long min;
        long min2;
        String str2;
        if (aVar == null || this.f9417e) {
            return null;
        }
        this.j = aVar;
        if (!this.i) {
            this.i = true;
            Application a2 = e.b.b.n.a.a();
            try {
                a2.getPackageName();
                this.a = a2.getFilesDir().getParent();
                this.b = a2.getCacheDir().getAbsolutePath();
                try {
                    str2 = a2.getExternalFilesDir(null).getParentFile().getAbsolutePath();
                } catch (Exception unused) {
                    str2 = null;
                }
                this.f9415c = str2;
                File externalCacheDir = a2.getExternalCacheDir();
                if (externalCacheDir != null) {
                    this.f9416d = externalCacheDir.getAbsolutePath();
                }
            } catch (Exception unused2) {
                this.f9417e = true;
            }
        }
        this.f9418f = y(aVar.f());
        this.f9419g = y(aVar.b());
        this.h = y(aVar.a());
        ArrayList arrayList = new ArrayList();
        i(new File(this.a), arrayList);
        i(new File(this.f9415c), arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            b bVar = (b) it2.next();
            Iterator<b> it3 = bVar.f9423f.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = true;
                    break;
                }
                if (it3.next().f9421d) {
                    break;
                }
            }
            if (z) {
                arrayList2.remove(bVar);
            }
        }
        arrayList.removeAll(arrayList2);
        if (e.b.b.n.a.b()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                b bVar2 = (b) it4.next();
                StringBuilder M = e.a.a.a.a.M("diskInfoNodes:");
                M.append(bVar2.b());
                e.b.b.n.g.b.a("APM-Disk", M.toString());
            }
        }
        o<C0425c> oVar = new o<>(this.j.j());
        o<C0425c> oVar2 = new o<>(this.j.h());
        o<C0425c> oVar3 = new o<>(this.j.i());
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.a);
        arrayList3.add(this.b);
        h(g(this.a, oVar, oVar2, oVar3, arrayList3));
        arrayList3.clear();
        arrayList3.add(this.f9416d);
        arrayList3.add(this.f9415c);
        h(g(this.f9415c, oVar, oVar2, oVar3, arrayList3));
        if (e.b.b.n.a.b()) {
            Iterator it5 = ((ArrayList) oVar.d()).iterator();
            while (it5.hasNext()) {
                C0425c c0425c = (C0425c) it5.next();
                StringBuilder M2 = e.a.a.a.a.M("fileListTopK:");
                M2.append(c0425c.c());
                e.b.b.n.g.b.a("APM-Disk", M2.toString());
            }
            Iterator it6 = ((ArrayList) oVar2.d()).iterator();
            while (it6.hasNext()) {
                C0425c c0425c2 = (C0425c) it6.next();
                StringBuilder M3 = e.a.a.a.a.M("dirListTopK:");
                M3.append(c0425c2.c());
                e.b.b.n.g.b.a("APM-Disk", M3.toString());
            }
            Iterator it7 = ((ArrayList) oVar3.d()).iterator();
            while (it7.hasNext()) {
                C0425c c0425c3 = (C0425c) it7.next();
                StringBuilder M4 = e.a.a.a.a.M("outdatedListTopK:");
                M4.append(c0425c3.c());
                e.b.b.n.g.b.a("APM-Disk", M4.toString());
            }
            StringBuilder M5 = e.a.a.a.a.M("insideDataSize:");
            M5.append(this.k);
            M5.append(" outsideDataSize:");
            M5.append(this.l);
            M5.append(" insideCacheSize:");
            M5.append(this.m);
            M5.append(" outsideCacheSize:");
            M5.append(this.n);
            e.b.b.n.g.b.a("APM-Disk", M5.toString());
        }
        if (!com.bytedance.android.input.k.b.a.e0(this.f9419g)) {
            Iterator<String> it8 = this.f9419g.iterator();
            while (it8.hasNext()) {
                File file = new File(it8.next());
                if (file.exists() && !u(file)) {
                    if (file.isFile()) {
                        long length = file.length();
                        b bVar3 = new b(null);
                        bVar3.f9421d = false;
                        bVar3.a = file.getAbsolutePath();
                        bVar3.b = length;
                        bVar3.f9422e = MonitorConstants.CUSTOM;
                        arrayList.add(bVar3);
                    } else {
                        b bVar4 = new b(null);
                        bVar4.f9421d = true;
                        bVar4.f9422e = MonitorConstants.CUSTOM;
                        bVar4.a = file.getAbsolutePath();
                        bVar4.b = o(file);
                        arrayList.add(bVar4);
                    }
                }
            }
        }
        try {
            j = this.k + this.l;
            long j2 = this.m + this.n;
            totalSpace = Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace();
            freeSpace = Environment.getDataDirectory().getFreeSpace();
            min = Math.min(j, 17179869184L);
            min2 = Math.min(j2, 17179869184L);
        } catch (Throwable th) {
            th = th;
            str = "APM-Disk";
        }
        if (min < 0) {
            return null;
        }
        if (this.o != null) {
            this.o.a(this.j.c(), min, k(oVar), k(oVar2), k(oVar3));
        }
        Pair<Long, Long> s = s();
        long n = n();
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Disk", "appUsage:" + n);
        }
        str = "APM-Disk";
        try {
            return new e.b.b.f.b(j, min2, totalSpace, freeSpace, n, ((Long) s.first).longValue(), ((Long) s.second).longValue(), t(n, new BigDecimal(totalSpace)), m(oVar), m(oVar2), m(oVar3), l(arrayList, min));
        } catch (Throwable th2) {
            th = th2;
            Log.e(str, WsConstants.KEY_CONNECTION_ERROR, th);
            return null;
        }
    }

    JSONArray m(o<C0425c> oVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = ((ArrayList) oVar.d()).iterator();
        while (it2.hasNext()) {
            JSONObject c2 = ((C0425c) it2.next()).c();
            if (c2 != null) {
                jSONArray.put(c2);
            }
        }
        return jSONArray;
    }

    public void x(com.bytedance.apm.x.d dVar) {
        this.o = dVar;
    }
}
