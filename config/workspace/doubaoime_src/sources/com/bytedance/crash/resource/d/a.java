package com.bytedance.crash.resource.d;

import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.resource.NativeResourceMonitor;
import com.bytedance.crash.resource.b;
import java.io.File;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a extends com.bytedance.crash.resource.b {
    private static a k;
    private int h;
    private boolean i;
    private com.bytedance.crash.resource.d.b j;

    /* renamed from: com.bytedance.crash.resource.d.a$a, reason: collision with other inner class name */
    class C0213a extends Thread {
        C0213a(String str) {
            super(str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
        
            if (r2 < r12.a.j.k) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
        
            if (r2 < (r12.a.j.l / 4)) goto L29;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.resource.d.a.C0213a.run():void");
        }
    }

    static class b extends b.a {
        public b(com.bytedance.crash.monitor.a aVar, @NonNull File file) {
            super(aVar, file);
        }

        @Override // com.bytedance.crash.resource.b.a
        protected void h(Map<String, String> map, b.C0212b c0212b) {
            super.h(map, c0212b);
            map.put("is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            map.put("sdk_version", "4.2.1-rc.8-oime");
            map.put("is_64_runtime", NativeBridge.E() ? "true" : "false");
            map.put("fd_leak_app", C0652g.g().getPackageName());
        }

        @Override // com.bytedance.crash.resource.b.a
        protected boolean i(File file, b.C0212b c0212b) {
            String optString;
            File file2 = new File(file, "tombstone.txt");
            File file3 = new File(file, "javastack.txt");
            File file4 = new File(file, "fd_types.txt");
            if (!file2.exists()) {
                return false;
            }
            try {
                if (file3.exists()) {
                    c0212b.a = com.bytedance.crash.util.a.r(file3.getAbsolutePath());
                }
                JSONArray t = com.bytedance.crash.util.a.t(file2.getAbsolutePath());
                if (t == null) {
                    com.bytedance.android.input.k.b.a.X("FdTracker: ", "stack content is null");
                    return false;
                }
                int c2 = b.a.c(t, 0, "pid:");
                if (c2 >= 0) {
                    String[] split = t.optString(c2, null).trim().split("\\s");
                    int i = 0;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        if ("name:".equals(split[i])) {
                            int i2 = i + 1;
                            c0212b.f4667c = split[i2].substring(0, split[i2].length());
                            break;
                        }
                        i++;
                    }
                }
                StringBuilder sb = new StringBuilder();
                int c3 = b.a.c(t, c2 + 1, "Signal ");
                if (c3 >= 0) {
                    sb.append(t.optString(c3, null));
                    sb.append('\n');
                }
                int c4 = b.a.c(t, c3 + 1, "Abort message:");
                if (c4 >= 0) {
                    String replace = t.optString(c4, null).replace("Abort message:", "abort message:");
                    c0212b.f4668d = replace;
                    sb.append(replace);
                    sb.append('\n');
                    if (c0212b.f4668d.startsWith("abort message:")) {
                        try {
                            Matcher matcher = Pattern.compile("^.*:\\s+(\\S+):.*,.*,\\s+\\S+\\s+(\\S+)\\(.*$").matcher(c0212b.f4668d);
                            if (matcher.find()) {
                                c0212b.h.put("fd_leak_lib", matcher.group(1));
                                c0212b.h.put("fd_leak_reason", matcher.group(2));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                int c5 = b.a.c(t, c4 + 1, "backtrace:");
                if (c5 >= 0) {
                    for (int i3 = c5 + 1; i3 < t.length(); i3++) {
                        String optString2 = t.optString(i3, null);
                        if (!optString2.startsWith("    #")) {
                            break;
                        }
                        sb.append(optString2.trim());
                        sb.append('\n');
                    }
                    c0212b.b = sb.toString();
                }
                try {
                    JSONArray t2 = com.bytedance.crash.util.a.t(file4.getAbsolutePath());
                    if (t2 != null && (optString = t2.optString(0, null)) != null && !"".equals(optString)) {
                        Map<String, String> map = c0212b.h;
                        int parseInt = Integer.parseInt(optString.trim().split(" ")[1]);
                        map.put("fd_leak_count_range", parseInt < 300 ? "0 ~ 200" : parseInt < 500 ? "200 ~ 500" : parseInt < 800 ? "500 ~ 800" : parseInt < 1024 ? "800 ~ 1000" : parseInt < 1500 ? "1000 ~ 1500" : "> 1500");
                    }
                    c0212b.h.put("has_fd_track", "true");
                } catch (Throwable unused2) {
                }
                return true;
            } catch (Throwable unused3) {
                return false;
            }
        }
    }

    static int h(a aVar) {
        return NativeResourceMonitor.d(aVar.h <= 2 ? 0 : 1);
    }

    public static void k(com.bytedance.crash.resource.d.b bVar) {
        if (k == null) {
            synchronized (a.class) {
                if (k == null) {
                    k = new a();
                }
            }
        }
        a aVar = k;
        aVar.j = bVar;
        aVar.c(bVar);
    }

    public static void l(com.bytedance.crash.monitor.a aVar) {
        try {
            new b(aVar, com.bytedance.crash.resource.i.b.a()).j();
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.D("FdTracker: ", "upload exception:" + th);
        }
    }

    @Override // com.bytedance.crash.resource.b
    protected void a() {
        com.bytedance.android.input.k.b.a.X("FdTracker: ", "begin execute");
        boolean z = false;
        if (this.i) {
            com.bytedance.android.input.k.b.a.X("FdTracker: ", "already is running");
        } else if (this.h != 0) {
            com.bytedance.android.input.k.b.a.X("FdTracker: ", "invalid state");
        } else {
            this.h = 1;
            z = true;
        }
        if (z) {
            this.i = true;
            new C0213a("npthFdTracker").start();
        }
    }
}
