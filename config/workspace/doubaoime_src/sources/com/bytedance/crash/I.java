package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.crash.D;
import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class I {
    private static t a;
    private static volatile String b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f4385c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4386d = 0;

    static class a implements FilenameFilter {
        final /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            try {
                String[] split = str.split(BundleUtil.UNDERLINE_TAG);
                if (split.length == 2) {
                    if (Math.abs(Long.parseLong(split[1].substring(0, split[1].length())) - this.a) < 1000) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    static class b implements Runnable {
        final /* synthetic */ Map a;

        b(Map map) {
            this.a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            I.d(this.a);
        }
    }

    static class c implements Runnable {
        final /* synthetic */ Map a;

        c(Map map) {
            this.a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            I.d(this.a);
        }
    }

    static class d implements Runnable {
        final /* synthetic */ Map a;

        d(Map map) {
            this.a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            I.d(this.a);
        }
    }

    static class e implements FilenameFilter {
        final /* synthetic */ long a;

        e(long j) {
            this.a = j;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            try {
                String[] split = str.split(BundleUtil.UNDERLINE_TAG);
                return Math.abs(Long.parseLong(split[2].substring(0, split[2].length() + (-4))) - this.a) < 1000;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    static void a() {
        Context g2;
        if (b == null && (g2 = C0652g.g()) != null) {
            File file = new File(C0652g.k(), "custom_tags");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, com.bytedance.crash.util.a.l(g2) ? PullConfiguration.PROCESS_NAME_MAIN : com.bytedance.crash.util.a.e().replaceAll(Constants.COLON_SEPARATOR, "@"));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            StringBuilder M = e.a.a.a.a.M("tag_");
            M.append(C0652g.b());
            File file3 = new File(file2, M.toString());
            if (!file3.exists()) {
                file3.mkdirs();
            }
            b = file3.getAbsolutePath();
        }
    }

    static void d(Map map) {
        ObjectOutputStream objectOutputStream = null;
        try {
            Application d2 = C0652g.d();
            if (d2 == null) {
                return;
            }
            File file = new File(C0652g.k(), "tags");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, com.bytedance.crash.util.a.l(d2) ? PullConfiguration.PROCESS_NAME_MAIN : com.bytedance.crash.util.a.e().replaceAll(Constants.COLON_SEPARATOR, "@"));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("import_tag_");
            int i = A.b;
            sb.append(C0652g.b());
            sb.append(".txt");
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(new File(file2, sb.toString())));
            try {
                objectOutputStream2.writeObject(map);
            } catch (Throwable unused) {
                objectOutputStream = objectOutputStream2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public static void e(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            p(str);
            return;
        }
        Map<String, String> map = f4385c;
        map.put(str, str2);
        if (D.a.b()) {
            com.bytedance.crash.runtime.b.d(new b(new HashMap(map)));
        }
    }

    public static void f(Map<? extends String, ? extends String> map) {
        if (!D.a.b()) {
            f4385c.putAll(map);
            return;
        }
        Map<String, String> map2 = f4385c;
        map2.putAll(map);
        com.bytedance.crash.runtime.b.d(new d(new HashMap(map2)));
    }

    public static void g(String str, String str2, J j) {
        if (a != null) {
            com.bytedance.crash.runtime.b.d(new G(str2, str));
        } else {
            j.i(str, str2);
        }
    }

    public static void h(Map<? extends String, ? extends String> map, J j) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    t tVar = a;
                    if (tVar == null) {
                        j.j(map);
                    } else if (tVar != null) {
                        com.bytedance.crash.runtime.b.d(new H(map));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void i(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                com.bytedance.crash.util.a.b(file2);
            } else {
                File[] listFiles2 = file2.listFiles();
                if (listFiles2 == null) {
                    continue;
                } else {
                    if (listFiles2.length <= 5) {
                        return;
                    }
                    Arrays.sort(listFiles2);
                    for (int i = 0; i < listFiles2.length - 5; i++) {
                        com.bytedance.crash.util.a.b(listFiles2[i]);
                    }
                }
            }
        }
    }

    public static void j(JSONObject jSONObject, long j, String str) {
        ObjectInputStream objectInputStream;
        File[] listFiles = new File(new File(C0652g.k(), "tags"), com.bytedance.crash.util.a.m(C0652g.g(), str) ? PullConfiguration.PROCESS_NAME_MAIN : str.replaceAll(Constants.COLON_SEPARATOR, "@")).listFiles(new e(j));
        if (listFiles == null || listFiles.length < 1) {
            return;
        }
        ObjectInputStream objectInputStream2 = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(listFiles[0]));
        } catch (Throwable unused) {
        }
        try {
            Map map = (Map) objectInputStream.readObject();
            if (map != null) {
                com.bytedance.android.input.k.b.a.l0(jSONObject, map);
            }
        } catch (Throwable unused2) {
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                try {
                    objectInputStream2.close();
                } catch (Throwable unused3) {
                }
            }
        }
    }

    public static Map<String, String> k() {
        return f4385c;
    }

    public static t l() {
        return a;
    }

    public static Map<String, String> m() {
        return a.b(b);
    }

    public static void n(JSONObject jSONObject) {
        t tVar;
        Map<String, String> b2;
        try {
            long optLong = jSONObject.optLong("app_start_time");
            String optString = jSONObject.optString("process_name");
            JSONObject optJSONObject = jSONObject.optJSONObject("filters");
            File[] listFiles = new File(new File(C0652g.k(), "custom_tags"), com.bytedance.crash.util.a.m(C0652g.g(), optString) ? PullConfiguration.PROCESS_NAME_MAIN : optString.replaceAll(Constants.COLON_SEPARATOR, "@")).listFiles(new a(optLong));
            if (listFiles == null || listFiles.length < 1 || (tVar = a) == null || (b2 = tVar.b(listFiles[0].getAbsolutePath())) == null) {
                return;
            }
            com.bytedance.android.input.k.b.a.l0(optJSONObject, b2);
        } catch (Throwable unused) {
        }
    }

    public static void o(String str, J j) {
        if (a != null) {
            com.bytedance.crash.runtime.b.d(new G(null, str));
        } else {
            j.N(str);
        }
    }

    public static void p(String str) {
        Map<String, String> map = f4385c;
        if (map.containsKey(str)) {
            map.remove(str);
            if (D.a.b()) {
                com.bytedance.crash.runtime.b.d(new c(new HashMap(map)));
            }
        }
    }

    public static void q(t tVar) {
        a = tVar;
    }
}
