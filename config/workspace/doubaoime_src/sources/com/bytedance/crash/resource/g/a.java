package com.bytedance.crash.resource.g;

import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.resource.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class a extends com.bytedance.crash.resource.b {
    private static a h;

    /* renamed from: com.bytedance.crash.resource.g.a$a, reason: collision with other inner class name */
    static class C0216a extends b.a {
        public C0216a(com.bytedance.crash.monitor.a aVar, @NonNull File file) {
            super(aVar, file);
        }

        private static void k(File file, String str, String str2) {
            if (str2 == null || "".equals(str2)) {
                return;
            }
            File file2 = new File(file, str);
            try {
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                com.bytedance.crash.util.a.x(file2, str2, false);
            } catch (Throwable unused) {
            }
        }

        @Override // com.bytedance.crash.resource.b.a
        protected void h(Map<String, String> map, b.C0212b c0212b) {
            super.h(map, c0212b);
            map.put("is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            map.put("sdk_version", "4.2.1-rc.8-oime");
            map.put("is_64_runtime", NativeBridge.E() ? "true" : "false");
        }

        @Override // com.bytedance.crash.resource.b.a
        protected boolean i(File file, b.C0212b c0212b) {
            String str;
            String str2;
            String str3 = "Signal 6(SIGABRT), Code -12(SI_REF_LEAK)\n";
            File file2 = new File(file, "ref_table.txt");
            if (!file2.exists()) {
                return false;
            }
            String str4 = null;
            try {
                if (com.bytedance.crash.util.a.t(file2.getAbsolutePath()) == null) {
                    com.bytedance.android.input.k.b.a.X("RefMonitorAdapter: ", "refContent is null");
                    return false;
                }
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String str5 = "";
                char c2 = 0;
                boolean z = false;
                String str6 = "";
                String str7 = str6;
                String str8 = str7;
                String str9 = str8;
                String str10 = str9;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    BufferedReader bufferedReader2 = bufferedReader;
                    if (readLine == null) {
                        str = str3;
                        str2 = str6;
                        break;
                    }
                    String str11 = str5;
                    if (!str5.equals(readLine)) {
                        char charAt = readLine.charAt(0);
                        String trim = readLine.trim();
                        if (trim.length() != 0) {
                            str = str3;
                            if (charAt < 'a' || charAt > 'z') {
                                str2 = str6;
                                if (c2 == 1) {
                                    if (charAt < '0' || charAt > '9') {
                                        if (trim.startsWith("Summary")) {
                                            str6 = str2;
                                        }
                                        str6 = str2;
                                    } else {
                                        String[] split = readLine.split("\\s+");
                                        if (split.length != 2) {
                                            com.bytedance.android.input.k.b.a.p("something is wrong with ref info title");
                                            break;
                                        }
                                        str6 = split[0];
                                        str9 = split[1];
                                    }
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (trim.startsWith("#")) {
                                            sb.append(readLine);
                                            sb.append("\n");
                                        } else if (trim.startsWith("at")) {
                                            sb2.append(readLine);
                                            sb2.append("\n");
                                            if (!z) {
                                                str6 = str2;
                                                z = true;
                                            }
                                        } else {
                                            if (z) {
                                                break;
                                            }
                                            char charAt2 = trim.charAt(0);
                                            if (charAt2 > '0' && charAt2 <= '9') {
                                                String[] split2 = trim.split("\\s+");
                                                if (split2.length >= 3) {
                                                    str8 = split2[0];
                                                    str7 = split2[2];
                                                }
                                                str6 = str2;
                                                c2 = 0;
                                            }
                                        }
                                    }
                                    str6 = str2;
                                }
                            } else {
                                if (str4 == null) {
                                    str4 = readLine.split(" ")[0];
                                } else {
                                    try {
                                        Matcher matcher = Pattern.compile("^.*:\\s+(\\S+),.*:\\s+(.*),.*:\\s+(\\S+).*$").matcher(readLine);
                                        if (matcher.find()) {
                                            str10 = matcher.group(1);
                                            String group = matcher.group(2);
                                            Objects.requireNonNull(group);
                                            c0212b.f4670f = Long.decode(group).longValue();
                                            c0212b.f4667c = matcher.group(3);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                c2 = 1;
                            }
                            bufferedReader = bufferedReader2;
                            str5 = str11;
                            str3 = str;
                        }
                    }
                    bufferedReader = bufferedReader2;
                    str5 = str11;
                }
                String sb3 = sb.toString();
                c0212b.a = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                String str12 = str;
                sb4.append(str12);
                sb4.append(sb3);
                c0212b.b = sb4.toString();
                k(file, "tombstone.txt", ("pid: 1234, tid: " + c0212b.f4670f + ", ThreadName: " + c0212b.f4667c + "  >>> " + C0652g.g().getPackageName() + " <<<\n") + str12 + ("abort message: " + str4 + " ref leak type: " + str7 + "(count: " + str8 + "), backtrace type: " + str9 + "(count: " + str2 + ")\n") + "backtrace: \n" + sb3);
                k(file, "javastack.txt", c0212b.a);
                c0212b.h.put("has_ref_leak_log", "true");
                c0212b.h.put("ref_leak_type", str4);
                try {
                    c0212b.h.put(str4 + "_ref_range", l(str10));
                    c0212b.h.put(str4 + "_ref_top_type", str7);
                    return true;
                } catch (Throwable unused2) {
                    return false;
                }
            } catch (Throwable unused3) {
                return false;
            }
        }

        String l(String str) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt <= 100) {
                    return "[0, 100]";
                }
                if (parseInt <= 200) {
                    return "(100, 200]";
                }
                if (parseInt <= 500) {
                    return "(200, 500]";
                }
                if (parseInt <= 1000) {
                    return "(500, 1000]";
                }
                if (parseInt <= 5000) {
                    return "(1000, 5000]";
                }
                if (parseInt <= 10000) {
                    return "(5000, 10000]";
                }
                int i = parseInt / 10000;
                StringBuilder N = e.a.a.a.a.N("(", i, "0000, ");
                N.append(i + 1);
                N.append("0000]");
                return N.toString();
            } catch (Throwable unused) {
                return "0";
            }
        }
    }

    public static void e(b bVar) {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        a aVar = h;
        Objects.requireNonNull(aVar);
        aVar.c(bVar);
    }

    public static void f(com.bytedance.crash.monitor.a aVar) {
        try {
            new C0216a(aVar, com.bytedance.crash.resource.i.b.e()).j();
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.D("RefMonitorAdapter: ", "upload exception:" + th);
        }
    }

    @Override // com.bytedance.crash.resource.b
    protected boolean b() {
        return NativeBridge.E();
    }
}
