package com.bytedance.crash.resource.e;

import android.os.Build;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.crash.c;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.resource.NativeResourceMonitor;
import com.bytedance.crash.resource.b;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.bytedance.crash.resource.b {
    private static a h;

    /* renamed from: com.bytedance.crash.resource.e.a$a, reason: collision with other inner class name */
    static class C0214a extends b.a {
        protected C0214a(com.bytedance.crash.monitor.a aVar, @NonNull File file) {
            super(aVar, file);
        }

        private static String k(String str, String str2, String str3) {
            int indexOf = str.indexOf(str2);
            int indexOf2 = str.indexOf(str3);
            return (indexOf >= 0 && indexOf2 >= 0) ? str.substring(indexOf, indexOf2).substring(str2.length()) : "null";
        }

        @Override // com.bytedance.crash.resource.b.a
        protected void h(Map<String, String> map, b.C0212b c0212b) {
            super.h(map, c0212b);
            map.put("has_gwp_asan", !c0212b.b.isEmpty() ? "true" : "false");
            map.put("gwp_asan_app", C0652g.g().getPackageName());
        }

        @Override // com.bytedance.crash.resource.b.a
        protected boolean i(File file, b.C0212b c0212b) {
            String str;
            String str2;
            String str3;
            String[] split;
            String str4;
            String[] split2;
            String[] split3;
            String[] split4;
            String str5 = "NPTH_XASAN: ";
            File file2 = new File(file, "tombstone.txt");
            if (!file2.exists()) {
                return false;
            }
            try {
                JSONArray t = com.bytedance.crash.util.a.t(file2.getAbsolutePath());
                if (t == null) {
                    com.bytedance.android.input.k.b.a.D("NPTH_XASAN: ", "parseReport  native stack is null");
                    return false;
                }
                int c2 = b.a.c(t, 0, "pid:");
                if (c2 < 0) {
                    com.bytedance.android.input.k.b.a.D("NPTH_XASAN: ", "parseReport  pid index err");
                    return false;
                }
                String[] split5 = t.optString(c2, null).trim().split("\\s");
                for (int i = 0; i < split5.length; i++) {
                    String str6 = split5[i];
                    if ("pid:".equals(str6)) {
                        int i2 = i + 1;
                        c0212b.f4669e = Long.decode(split5[i2].substring(0, split5[i2].length() - 1)).intValue();
                    } else if ("tid:".equals(str6)) {
                        int i3 = i + 1;
                        c0212b.f4670f = Long.decode(split5[i3].substring(0, split5[i3].length() - 1)).intValue();
                    } else if ("name:".equals(str6)) {
                        int i4 = i + 1;
                        c0212b.f4667c = split5[i4].substring(0, split5[i4].length() - 1);
                    }
                }
                String str7 = split5[split5.length - 2];
                StringBuilder sb = new StringBuilder();
                int c3 = b.a.c(t, c2 + 1, "Signal ");
                if (c3 < 0) {
                    com.bytedance.android.input.k.b.a.D("NPTH_XASAN: ", "parseReport  signal index err");
                    return false;
                }
                sb.append(t.optString(c3, null));
                sb.append('\n');
                int c4 = b.a.c(t, c3 + 1, "GWP-ASan message:");
                if (c4 < 0) {
                    com.bytedance.android.input.k.b.a.D("NPTH_XASAN: ", "parseReport abort msg index err");
                    return false;
                }
                String replace = t.optString(c4, null).replace("GWP-ASan message:", "abort message:");
                sb.append(replace);
                sb.append('\n');
                String str8 = "Double Free";
                String str9 = replace.contains("Use After Free") ? "Use After Free" : replace.contains("Double Free") ? "Double Free" : replace.contains("Buffer Overflow") ? "Buffer Overflow" : replace.contains("Buffer Underflow") ? "Buffer Underflow" : replace.contains("Invalid Free") ? "Invalid Free" : "Unknown";
                int c5 = b.a.c(t, c4 + 1, "backtrace:");
                if (c5 < 0) {
                    com.bytedance.android.input.k.b.a.D("NPTH_XASAN: ", "parseReport backtrace index err");
                    return false;
                }
                String str10 = "    #00";
                int i5 = c5 + 1;
                String str11 = "None";
                String str12 = "None";
                while (true) {
                    String str13 = str10;
                    str2 = "==/lib/";
                    str3 = str11;
                    if (i5 >= t.length()) {
                        break;
                    }
                    String optString = t.optString(i5, null);
                    if (!optString.startsWith("    #")) {
                        break;
                    }
                    sb.append(optString.trim());
                    sb.append('\n');
                    if (str8.equals(str9)) {
                        str13 = "    #03";
                    }
                    String str14 = str13;
                    String str15 = str8;
                    if (optString.endsWith("libc.so") || optString.endsWith("libc++_shared.so")) {
                        if (optString.startsWith("    #01") && (split3 = k(optString, "==/lib/", ".so").trim().split("/")) != null && split3.length > 1) {
                            str12 = split3[1].substring(split3[1].lastIndexOf(47) + 1);
                        }
                    } else if (optString.startsWith(str14) && (split4 = k(optString, "==/lib/", ".so").trim().split("/")) != null && split4.length > 1) {
                        str12 = split4[1].substring(split4[1].lastIndexOf(47) + 1);
                    }
                    i5++;
                    str10 = str14;
                    str8 = str15;
                    str11 = str3;
                }
                c0212b.b = sb.toString();
                int c6 = b.a.c(t, i5, "deallocated by thread") + 1;
                String str16 = str3;
                while (true) {
                    if (c6 >= t.length()) {
                        str = str5;
                        str16 = str16;
                        break;
                    }
                    String str17 = str16;
                    String optString2 = t.optString(c6, null);
                    try {
                        if (!(optString2.startsWith("    #01") || optString2.startsWith("    #02")) || optString2.endsWith("libnpth_xasan.so") || optString2.endsWith("libc++_shared.so") || (split2 = k(optString2, "==/lib/", ".so").trim().split("/")) == null) {
                            str = str5;
                        } else {
                            str = str5;
                            if (split2.length > 1) {
                                str16 = split2[1].substring(split2[1].lastIndexOf(47) + 1);
                                if (str16.length() >= 1 && !str16.isEmpty()) {
                                    break;
                                }
                                c6++;
                                str5 = str;
                            }
                        }
                        c6++;
                        str5 = str;
                    } catch (IOException e2) {
                        e = e2;
                        com.bytedance.android.input.k.b.a.D(str, "parseReport :" + e);
                        return false;
                    } catch (JSONException e3) {
                        e = e3;
                        com.bytedance.android.input.k.b.a.D(str, "parseReport :" + e);
                        return false;
                    }
                    str16 = str17;
                }
                int c7 = b.a.c(t, c6, "allocated by thread") + 1;
                while (c7 < t.length()) {
                    String optString3 = t.optString(c7, null);
                    if (!(optString3.startsWith("    #01") || optString3.startsWith("    #02")) || optString3.endsWith("libnpth_xasan.so") || optString3.endsWith("libc++_shared.so") || (split = k(optString3, str2, ".so").trim().split("/")) == null) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        if (split.length > 1) {
                            str3 = split[1].substring(split[1].lastIndexOf(47) + 1);
                            if (str3.length() >= 1 && !str3.isEmpty()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    c7++;
                    str2 = str4;
                }
                String str18 = str3;
                int c8 = b.a.c(t, c7, "build id:");
                if (c8 > 0) {
                    for (int i6 = c8 + 1; i6 < t.length(); i6++) {
                        String optString4 = t.optString(i6, null);
                        if (optString4.startsWith("    /")) {
                            String[] split6 = optString4.trim().split("\\s");
                            if (split6.length >= 3) {
                                c0212b.f4671g.put(new JSONObject().put("lib_name", split6[0].substring(split6[0].lastIndexOf(47) + 1)).put("lib_uuid", b.a.b(split6[split6.length - 1].substring(0, split6[split6.length - 1].length() - 1))));
                            }
                        }
                    }
                }
                c0212b.h.put("gwp_asan_type", str9);
                c0212b.h.put("gwp_asan_fatal_lib", str12);
                c0212b.h.put("gwp_asan_deallocated_lib", str16);
                c0212b.h.put("gwp_asan_allocated_lib", str18);
                return true;
            } catch (IOException | JSONException e4) {
                e = e4;
                str = "NPTH_XASAN: ";
            }
        }
    }

    public static void e() {
        try {
            if (!NativeBridge.E()) {
                com.bytedance.android.input.k.b.a.p("xasan 32bit app Not supported");
                return;
            }
            a f2 = f();
            if (f2.f4663g) {
                com.bytedance.android.input.k.b.a.p("xasan has init");
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i <= 34) {
                String str = com.bytedance.crash.resource.i.b.b().getAbsolutePath() + "/" + c.b();
                if (!com.bytedance.crash.resource.i.b.b().exists()) {
                    com.bytedance.crash.resource.i.b.b().mkdirs();
                }
                String f3 = C0652g.f();
                File file = new File(f3, "xasan.config");
                if (!file.exists()) {
                    file.createNewFile();
                }
                com.bytedance.crash.util.a.x(file, new b(com.bytedance.crash.monitor.b.g()).toString(), false);
                NativeResourceMonitor.b(i, str, f3);
                f2.f4663g = true;
            }
        } catch (IOException e2) {
            com.bytedance.android.input.k.b.a.D("NPTH_XASAN: ", "GwpAsanStart err:" + e2);
        }
    }

    @NonNull
    public static a f() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public static void g(b bVar) {
        a f2 = f();
        Objects.requireNonNull(f2);
        f2.c(bVar);
    }

    public static void h(com.bytedance.crash.monitor.a aVar) {
        try {
            new C0214a(aVar, com.bytedance.crash.resource.i.b.b()).j();
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.D("NPTH_XASAN: ", "upload exception:" + th);
        }
    }

    @Override // com.bytedance.crash.resource.b
    protected void a() {
    }

    @Override // com.bytedance.crash.resource.b
    protected boolean b() {
        return NativeBridge.E();
    }
}
