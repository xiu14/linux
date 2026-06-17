package com.bytedance.crash.resource.j;

import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.resource.NativeResourceMonitor;
import com.bytedance.crash.resource.b;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c extends com.bytedance.crash.resource.b {
    private static long i = 819200;
    private static long j = 512000;
    private static a k;
    private static a l;
    private static c m;
    protected d h;

    static class a {
        boolean a = false;
        boolean b = true;

        /* renamed from: c, reason: collision with root package name */
        boolean f4683c = false;

        /* renamed from: d, reason: collision with root package name */
        int f4684d = 0;

        public a(int i) {
        }
    }

    static class b extends b.a {
        public b(com.bytedance.crash.monitor.a aVar, @NonNull File file) {
            super(aVar, file);
        }

        @Override // com.bytedance.crash.resource.b.a
        protected void h(Map<String, String> map, b.C0212b c0212b) {
            super.h(map, c0212b);
            map.put("mmap_monitor", "true");
            map.put("has_mmap_leak", "true");
            map.put("is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            map.put("sdk_version", "4.2.1-rc.8-oime");
            map.put("is_64_runtime", NativeBridge.E() ? "true" : "false");
            map.put("mmap_leak_app", C0652g.g().getPackageName());
        }

        @Override // com.bytedance.crash.resource.b.a
        protected boolean i(File file, b.C0212b c0212b) {
            File file2 = new File(file, "tombstone.txt");
            File file3 = new File(file, "javastack.txt");
            if (!file2.exists()) {
                return false;
            }
            try {
                if (file3.exists()) {
                    c0212b.a = com.bytedance.crash.util.a.r(file3.getAbsolutePath());
                }
                JSONArray t = com.bytedance.crash.util.a.t(file2.getAbsolutePath());
                if (t == null) {
                    com.bytedance.android.input.k.b.a.X("VmMonitor: ", "stack content is null");
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
                            c0212b.f4667c = split[i + 1];
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
                            Matcher matcher = Pattern.compile("^.*:\\s+(\\S+):.*,.*,.*:\\s+(\\S+)\\(.*:(\\S+)\\s+(\\S+)\\).*$").matcher(c0212b.f4668d);
                            if (matcher.find()) {
                                c0212b.h.put("mmap_leak_lib", matcher.group(1));
                                c0212b.h.put("mmap_leak_reason", matcher.group(2));
                                c0212b.h.put("mmap_leak_size", b.a.d(matcher.group(3), matcher.group(4)));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                int c5 = b.a.c(t, c4 + 1, "backtrace:");
                if (c5 >= 0) {
                    for (int i2 = c5 + 1; i2 < t.length(); i2++) {
                        String optString = t.optString(i2, null);
                        if (!optString.startsWith("    #")) {
                            break;
                        }
                        sb.append(optString.trim());
                        sb.append('\n');
                    }
                    c0212b.b = sb.toString();
                }
                return true;
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    static void g(int i2) {
        com.bytedance.android.input.k.b.a.p("VmMonitor: recover");
        if (i2 == 1) {
            k.f4684d = 5;
        }
        t(0, 0, NativeResourceMonitor.h(0, i2));
    }

    static long k(boolean z) {
        a aVar;
        if (z) {
            long q = q();
            if (q < j) {
                j = q;
            }
            return q - j;
        }
        if (NativeResourceMonitor.h(6, 0) < 0 && (aVar = k) != null) {
            aVar.f4684d = -1;
        }
        return Math.max(0, r4);
    }

    static void l(c cVar, int i2) {
        Objects.requireNonNull(cVar);
        com.bytedance.android.input.k.b.a.p("VmMonitor: stop monitor native");
        t(i2, 4, NativeResourceMonitor.h(4, i2));
    }

    static void m(c cVar, int i2) {
        Objects.requireNonNull(cVar);
        com.bytedance.android.input.k.b.a.p("VmMonitor: exit hook");
        a aVar = i2 == 0 ? k : l;
        if (aVar.a) {
            int h = NativeResourceMonitor.h(2, i2);
            boolean z = h == 0;
            aVar.b = z;
            aVar.a = true ^ z;
            t(i2, 2, h);
        }
    }

    static void n(c cVar, int i2) {
        NativeResourceMonitor.i(cVar.b);
        NativeResourceMonitor.h(5, 1);
        int h = NativeResourceMonitor.h(5, i2);
        t(i2, 5, h);
        if (h != 0) {
            return;
        }
        com.bytedance.crash.runtime.b.f(new com.bytedance.crash.resource.j.b(cVar), com.heytap.mcssdk.constant.a.f6886d);
        r(i2).f4683c = false;
    }

    private boolean p(int i2) {
        int i3;
        a r = r(i2);
        if (!((r == null || (i3 = r.f4684d) == 4 || i3 == -1 || i3 == 5) ? false : true)) {
            return false;
        }
        if (!r.a && r.b) {
            com.bytedance.android.input.k.b.a.p("VmMonitor: start hook: " + i2);
            a aVar = i2 == 0 ? k : l;
            if (!aVar.a) {
                int h = NativeResourceMonitor.h(1, i2);
                aVar.a = h == 0;
                aVar.b = false;
                t(i2, 1, h);
            }
        }
        return r.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long q() {
        a aVar;
        if (NativeResourceMonitor.h(8, 0) < 0 && (aVar = k) != null) {
            aVar.f4684d = -1;
        }
        return Math.max(0, r0);
    }

    private static a r(int i2) {
        return i2 == 0 ? k : l;
    }

    public static long s(boolean z) {
        long max;
        long j2;
        if (z) {
            max = q();
            if (max < j) {
                j = max;
            }
            j2 = j;
        } else {
            max = Math.max(0, NativeResourceMonitor.h(7, 0));
            j2 = i;
        }
        return max - j2;
    }

    private static void t(int i2, int i3, int i4) {
        if (i4 != 0) {
            r(i2).f4684d = -1;
            StringBuilder M = e.a.a.a.a.M("VmMonitor: ");
            M.append(i3 != 0 ? i3 != 1 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? "unknown command" : "get_vm_size" : "get_leak_size" : "dump" : "stop_monitor" : "start_monitor" : "hook" : "recover");
            M.append(": ");
            M.append(i4);
            com.bytedance.android.input.k.b.a.p(M.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(int i2) {
        com.bytedance.android.input.k.b.a.p("VmMonitor: start monitor native");
        if (p(i2)) {
            t(i2, 3, NativeResourceMonitor.h(3, i2));
        }
    }

    public static void v(d dVar) {
        if (m == null) {
            synchronized (c.class) {
                if (m == null) {
                    m = new c();
                }
            }
        }
        c cVar = m;
        cVar.h = dVar;
        cVar.c(dVar);
    }

    public static void w(com.bytedance.crash.monitor.a aVar) {
        try {
            new b(aVar, com.bytedance.crash.resource.i.b.g()).j();
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.D("VmMonitor: ", "upload exception:" + th);
        }
    }

    @Override // com.bytedance.crash.resource.b
    protected void a() {
        k = new a(1);
        l = new a(2);
        if ((this.h.l & 1) != 0) {
            i = Math.max(0, NativeResourceMonitor.h(7, 0));
            if (p(0)) {
                a aVar = k;
                if (aVar.f4683c) {
                    com.bytedance.android.input.k.b.a.p("VmMonitor: execute water line mode Already running");
                } else {
                    aVar.f4683c = true;
                    aVar.f4684d = 0;
                    new com.bytedance.crash.resource.j.a(this, "mmapWaterLineModeMonitor").start();
                }
            }
        }
        if ((this.h.l & 2) != 0) {
            u(1);
        }
    }
}
