package com.bytedance.apm6.consumer.slardar.send;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class a {
    private SharedPreferences a;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private File f3624c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f3625d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private long f3626e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f3627f = false;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f3628g = new ArrayList<>();

    /* renamed from: com.bytedance.apm6.consumer.slardar.send.a$a, reason: collision with other inner class name */
    class C0132a implements Comparator<String> {
        C0132a(a aVar) {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static a a = new a(null);
    }

    static class c {
        private int a;
        private long b;

        public c(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public int c() {
            return this.a;
        }

        public String d() {
            return this.a + BundleUtil.UNDERLINE_TAG + this.b;
        }

        void e(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    a(C0132a c0132a) {
    }

    private void a(String str) {
        if (this.f3628g.size() > com.heytap.mcssdk.constant.a.r) {
            this.f3626e++;
        } else {
            this.f3628g.add(str);
        }
    }

    private synchronized void c() {
        if (this.b) {
            return;
        }
        File file = new File(e.b.b.e.a.b.e(), "log");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f3624c = file;
        this.a = e.b.b.n.a.a().getSharedPreferences("log_report_message", 0);
        this.b = true;
    }

    private synchronized void g() {
        int i = 0;
        if (!this.f3627f) {
            a aVar = b.a;
            aVar.c();
            String[] list = aVar.f3624c.list();
            int length = list.length;
            while (i < length) {
                String str = list[i];
                if (!this.f3628g.contains(str)) {
                    a(str);
                }
                i++;
            }
            this.f3627f = true;
        } else if (this.f3626e > 0 && this.f3628g.size() == 0) {
            a aVar2 = b.a;
            aVar2.c();
            String[] list2 = aVar2.f3624c.list();
            int length2 = list2.length;
            while (i < length2) {
                String str2 = list2[i];
                if (!this.f3628g.contains(str2)) {
                    a(str2);
                }
                i++;
            }
            this.f3626e -= this.f3628g.size();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    synchronized void b(File file) {
        this.f3628g.remove(file.getName());
        c();
        com.bytedance.android.input.k.b.a.t(file);
        this.f3625d.remove(file.getName());
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(file.getName());
        edit.commit();
    }

    File d() {
        c();
        return this.f3624c;
    }

    c e(File file) {
        c();
        String name = file.getName();
        if (this.f3625d.containsKey(name)) {
            return this.f3625d.get(name);
        }
        c cVar = null;
        if (this.a.contains(name)) {
            String string = this.a.getString(name, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    String[] split = string.split(BundleUtil.UNDERLINE_TAG);
                    cVar = new c(Integer.parseInt(split[0]), Long.parseLong(split[1]));
                } catch (Exception unused) {
                }
            }
            if (cVar != null) {
                this.f3625d.put(name, cVar);
            }
        }
        return cVar;
    }

    synchronized File f(String str) {
        String str2 = "." + str;
        g();
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.a("APM-Slardar", "failedFiles:" + this.f3628g + " " + str2);
        }
        File file = null;
        if (this.f3628g.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = this.f3628g.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (next.endsWith(str2)) {
                arrayList.add(next);
            }
        }
        if (com.bytedance.android.input.k.b.a.e0(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new C0132a(this));
        Iterator it3 = arrayList.iterator();
        c cVar = null;
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            a aVar = b.a;
            aVar.c();
            File file2 = new File(aVar.f3624c, str3);
            c e2 = e(file2);
            if (e2 != null) {
                if (e.b.b.n.a.b()) {
                    List<String> list2 = e.b.b.e.a.a.a;
                    e.b.b.n.g.b.a("APM-Slardar", "list send file:" + file2.getName() + " " + e2.a + " " + e2.b + " " + System.currentTimeMillis());
                }
                if (e2.a != 0 && e2.b >= System.currentTimeMillis()) {
                    if (cVar == null || cVar.b > e2.b) {
                        cVar = e2;
                        file = file2;
                    }
                }
            }
            file = file2;
        }
        return file;
    }

    File[] h() {
        c();
        File file = this.f3624c;
        if (file == null) {
            return null;
        }
        return file.listFiles();
    }

    synchronized boolean i(byte[] bArr, String str, int i, long j) {
        c();
        if (this.f3624c == null) {
            return false;
        }
        String format = String.format("%d%s%s%s%s", Long.valueOf(System.currentTimeMillis()), BundleUtil.UNDERLINE_TAG, UUID.randomUUID().toString(), ".", str);
        File file = new File(this.f3624c, format);
        FileChannel fileChannel = null;
        try {
            j(file, i, j);
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(ByteBuffer.wrap(bArr));
            if (!this.f3628g.contains(format)) {
                a(format);
            }
            if (e.b.b.n.a.b()) {
                List<String> list = e.b.b.e.a.a.a;
                e.b.b.n.g.b.a("APM-Slardar", "saveFile:" + file.getName());
            }
            try {
                fileChannel.close();
            } catch (Throwable unused) {
            }
            return true;
        } catch (Throwable th) {
            try {
                List<String> list2 = e.b.b.e.a.a.a;
                e.b.b.n.g.b.c("APM-Slardar", "saveFile", th);
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable unused2) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    void j(File file, int i, long j) {
        c cVar;
        try {
            c();
            SharedPreferences.Editor edit = this.a.edit();
            String name = file.getName();
            if (this.f3625d.containsKey(name)) {
                cVar = this.f3625d.get(name);
            } else {
                cVar = new c(i, j);
                this.f3625d.put(name, cVar);
            }
            cVar.e(i, j);
            edit.putString(name, cVar.d());
            edit.commit();
        } catch (Throwable th) {
            List<String> list = e.b.b.e.a.a.a;
            e.b.b.n.g.b.c("APM-Slardar", "updateRetryMessage", th);
        }
    }
}
