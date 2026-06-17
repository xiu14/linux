package com.bytedance.crash.W;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.crash.c;
import com.bytedance.crash.runtime.b;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static final Pattern a = Pattern.compile("^(\\d+)-(\\d+)\\.json");
    private static File b;

    /* renamed from: com.bytedance.crash.W.a$a, reason: collision with other inner class name */
    static class RunnableC0204a implements Runnable {
        RunnableC0204a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a();
        }
    }

    static void a() {
        File[] listFiles;
        File[] listFiles2;
        boolean z;
        File b2 = b();
        if (b2 == null || (listFiles = b2.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        File[] listFiles3 = new File("/proc").listFiles();
        if (listFiles3 != null && listFiles3.length != 0) {
            for (File file : listFiles3) {
                String name = file.getName();
                for (int i = 0; i < name.length(); i++) {
                    char charAt = name.charAt(i);
                    if (charAt < '0' || charAt > '9') {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    arrayList.add(file.getName());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        File c2 = c.c();
        if (c2 != null && (listFiles2 = c2.listFiles()) != null && listFiles2.length != 0) {
            for (File file2 : listFiles2) {
                arrayList2.add(file2.getName());
            }
        }
        for (File file3 : listFiles) {
            String name2 = file3.getName();
            if (!arrayList2.contains(name2)) {
                Matcher matcher = a.matcher(name2);
                if (matcher.find() && matcher.groupCount() == 2) {
                    String group = matcher.group(1);
                    long parseLong = group != null ? Long.parseLong(group) : 0L;
                    String group2 = matcher.group(2);
                    if (parseLong <= currentTimeMillis) {
                        if (arrayList.contains(group2)) {
                        }
                    }
                }
                com.bytedance.android.input.k.b.a.s(file3);
            }
        }
    }

    @Nullable
    private static File b() {
        File k;
        if (b == null && (k = C0652g.k()) != null) {
            b = com.bytedance.android.input.k.b.a.n(k, "plugin");
        }
        return b;
    }

    public static void c() {
        b.f(new RunnableC0204a(), 1000L);
    }

    public static void d(@NonNull JSONObject jSONObject, File file) {
        String C0;
        String name = file.getName();
        File b2 = b();
        File file2 = b2 != null ? new File(b2, e.a.a.a.a.s(name, ".json")) : null;
        if (file2 != null && file2.exists() && (C0 = com.bytedance.android.input.k.b.a.C0(file2)) != null) {
            try {
                com.bytedance.android.input.k.b.a.j(jSONObject, new JSONObject(C0));
                return;
            } catch (Throwable unused) {
            }
        }
        com.bytedance.android.input.k.b.a.y0(jSONObject, "mira_init", Boolean.FALSE);
    }
}
