package com.bytedance.crash.L;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.jni.NativeBridge;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {
    private long a;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.crash.monitor.b.f()) {
                return;
            }
            try {
                NativeBridge.Y();
            } catch (Throwable unused) {
            }
        }
    }

    public static class b {
        private final File a;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        b(java.io.File r11, @androidx.annotation.NonNull org.json.JSONObject r12, com.bytedance.crash.L.r r13, com.bytedance.crash.L.g r14) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.L.m.b.<init>(java.io.File, org.json.JSONObject, com.bytedance.crash.L.r, com.bytedance.crash.L.g):void");
        }

        private void a(@NonNull JSONObject jSONObject, String str) {
            int i;
            Matcher matcher = Pattern.compile("^ (\\d{1,2})% (.+)$").matcher(str);
            if (!matcher.find()) {
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_cpu_efficiency", "unavailable");
                return;
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("%");
            eVar.b(0L, 100L, 10L);
            com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_cpu_efficiency", eVar.a(parseInt));
            Matcher matcher2 = Pattern.compile("\\[(\\d+\\.\\d+)-\\d+\\.\\d+\\]\\{([\\d-]+)\\}(?:,\\\\s*)?").matcher(matcher.group(2));
            double d2 = 0.0d;
            while (matcher2.find()) {
                double parseDouble = Double.parseDouble(matcher2.group(1));
                String group = matcher2.group(2);
                if (group == null || !group.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    i = 1;
                } else {
                    String[] split = group.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    i = (Integer.parseInt(split[1]) - Integer.parseInt(split[0])) + 1;
                }
                d2 += parseDouble * i;
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_cpu_total_power", Long.valueOf((long) d2));
        }

        private void b(@NonNull JSONObject jSONObject, String str) {
            Matcher matcher = Pattern.compile("^ Thread \\d+ = (\\d+) \\+ (\\d+), Process \\d+ = (\\d+) \\+ (\\d+)$").matcher(str);
            if (matcher.find() && matcher.groupCount() == 4) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                int parseInt3 = Integer.parseInt(matcher.group(3));
                int parseInt4 = Integer.parseInt(matcher.group(4));
                com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("%");
                eVar.c(new Long[]{0L, 1L, 10L, 25L, 50L, 75L, 100L});
                int i = parseInt4 + parseInt3;
                if (i != 0) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_jiff_thread_ratio", eVar.a(((parseInt + parseInt2) * 100) / i));
                }
                if (parseInt2 + parseInt != 0) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_jiff_thread_user_ratio", eVar.a((parseInt * 100) / r4));
                }
                if (i != 0) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_jiff_process_user_ratio", eVar.a((parseInt3 * 100) / i));
                }
            }
        }

        private void c(@NonNull JSONObject jSONObject, String str) {
            Matcher matcher = Pattern.compile("^ (\\d+)\\.\\d{2} \\(.*\\)$").matcher(str);
            if (matcher.find() && matcher.groupCount() == 1) {
                int parseInt = Integer.parseInt(matcher.group(1));
                com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("");
                eVar.c(new Long[]{0L, 4L, 10L, 30L, 60L, 100L, 150L, 200L});
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_loads", eVar.a(parseInt));
            }
        }

        private void d(@NonNull JSONObject jSONObject, String str) {
            long j;
            Matcher matcher = Pattern.compile("^ Exec \\d+\\.\\d+\\((\\d+)%\\), Wait (.*), Sleep (.*), IOWait (.*)$").matcher(str);
            if (matcher.find() && matcher.groupCount() == 4) {
                com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("%");
                eVar.c(new Long[]{0L, 1L, 10L, 25L, 50L, 75L, 100L});
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_exec_ratio", eVar.a(Integer.parseInt(matcher.group(1))));
                String[] strArr = {"wait_ratio", "sleep_ratio", "iowait_ratio"};
                for (int i = 0; i < 3; i++) {
                    String group = matcher.group(i + 2);
                    String str2 = "---";
                    if (!"---".equals(group)) {
                        Matcher matcher2 = Pattern.compile("^\\d+\\.\\d+\\((\\d+)%\\)$").matcher(group);
                        if (matcher2.find() && matcher2.groupCount() == 1) {
                            if (i == 2) {
                                j = 25;
                                eVar.c(new Long[]{0L, 1L, 5L, 10L, 25L, 50L, 75L, 100L});
                            } else {
                                j = 25;
                            }
                            str2 = eVar.a(Integer.parseInt(matcher2.group(1)));
                            StringBuilder M = e.a.a.a.a.M("npth_profiler_");
                            M.append(strArr[i]);
                            com.bytedance.android.input.k.b.a.y0(jSONObject, M.toString(), str2);
                        }
                    }
                    j = 25;
                    StringBuilder M2 = e.a.a.a.a.M("npth_profiler_");
                    M2.append(strArr[i]);
                    com.bytedance.android.input.k.b.a.y0(jSONObject, M2.toString(), str2);
                }
            }
        }

        private void e(@NonNull JSONObject jSONObject, String str) {
            Matcher matcher = Pattern.compile("^ JavaHeap \\d+MB, Time (\\d+)\\.(\\d+), BlockTime (\\d+)\\.(\\d+), Count (\\d+), BlockCount (\\d+), MainWaitGcTime (\\d+)\\.(\\d+), MainGcTime (\\d+)\\.(\\d+)$").matcher(str);
            if (matcher.find() && matcher.groupCount() == 10) {
                long parseLong = Long.parseLong(matcher.group(2)) + (Long.parseLong(matcher.group(1)) * 1000);
                long parseLong2 = Long.parseLong(matcher.group(4)) + (Long.parseLong(matcher.group(3)) * 1000);
                long parseLong3 = Long.parseLong(matcher.group(5));
                long parseLong4 = Long.parseLong(matcher.group(6));
                long parseLong5 = Long.parseLong(matcher.group(8)) + (Long.parseLong(matcher.group(7)) * 1000);
                long parseLong6 = Long.parseLong(matcher.group(10)) + (Long.parseLong(matcher.group(9)) * 1000);
                com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("ms");
                eVar.c(new Long[]{0L, 1L, 500L, 1000L, 1500L, 2000L, Long.valueOf(WsConstants.EXIT_DELAY_TIME), Long.valueOf(com.heytap.mcssdk.constant.a.r)});
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_gc_time", eVar.a(parseLong));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_gc_block_time", eVar.a(parseLong2));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_main_wait_gc_time", eVar.a(parseLong5));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_main_gc_time", eVar.a(parseLong6));
                com.bytedance.crash.util.e eVar2 = new com.bytedance.crash.util.e("");
                eVar2.c(new Long[]{0L, 1L, 5L, 10L, 50L, 100L});
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_gc_count", eVar2.a(parseLong3));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_gc_block_count", eVar2.a(parseLong4));
            }
        }

        private void f(@NonNull JSONObject jSONObject, String str) {
            Matcher matcher = Pattern.compile("^ Thread (\\d+) (\\d+), Process (\\d+) (\\d+)$").matcher(str);
            if (matcher.find() && matcher.groupCount() == 4) {
                com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("");
                int i = 0;
                eVar.c(new Long[]{0L, 1L, 10L, 100L, 1000L, Long.valueOf(com.heytap.mcssdk.constant.a.q), 100000L});
                String[] strArr = {"thread_minor", "thread_major", "process_minor", "process_major"};
                while (i < 4) {
                    int i2 = i + 1;
                    long parseLong = Long.parseLong(matcher.group(i2));
                    StringBuilder M = e.a.a.a.a.M("npth_profiler_fault_");
                    M.append(strArr[i]);
                    com.bytedance.android.input.k.b.a.y0(jSONObject, M.toString(), eVar.a(parseLong));
                    i = i2;
                }
            }
        }

        private void g(@NonNull JSONObject jSONObject, String str) {
            Matcher matcher = Pattern.compile("^ VSS \\d+\\([+-]\\d+\\)MB, RSS (\\d+)\\([+-]\\d+\\)MB, SWAP (\\d+)\\([+-]\\d+\\)MB$").matcher(str);
            if (matcher.find() && matcher.groupCount() == 2) {
                long parseLong = Long.parseLong(matcher.group(2)) + Long.parseLong(matcher.group(1));
                com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("MB");
                eVar.c(new Long[]{0L, 1L, 64L, 128L, 256L, 512L, 768L, Long.valueOf(DownloadConstants.KB), 1536L, 2048L});
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_procram_total", eVar.a(parseLong));
            }
        }

        private void h(@NonNull JSONObject jSONObject, String str) {
            Matcher matcher = Pattern.compile("^ Total (\\d+)MB, Used \\d+\\([+-]\\d+\\)MB, Free \\d+\\([+-]\\d+\\)MB, Swapped (\\d+)\\(([+-])(\\d+)\\)MB$").matcher(str);
            if (matcher.find() && matcher.groupCount() == 4) {
                long parseLong = Long.parseLong(matcher.group(1));
                long parseLong2 = Long.parseLong(matcher.group(2));
                String group = matcher.group(3);
                long parseLong3 = Long.parseLong(matcher.group(4));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_sysram_total_size", ((parseLong / DownloadConstants.KB) + 1) + "GB");
                com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("MB");
                eVar.c(new Long[]{0L, 1L, 128L, 256L, 512L, Long.valueOf(DownloadConstants.KB), 1536L, 2048L, 3072L, 4096L});
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_sysram_swapped_size", eVar.a(parseLong2));
                eVar.c(new Long[]{0L, 1L, 16L, 32L, 64L, 128L, 256L, 512L});
                StringBuilder S = e.a.a.a.a.S(group, " ");
                S.append(eVar.a(parseLong3));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_sysram_swapped_delta", S.toString());
            }
        }

        public void i(@NonNull JSONObject jSONObject, File file) {
            String h = e.a.a.a.a.h(file, "anr_ml_features.json");
            if (h != null) {
                try {
                    com.bytedance.android.input.k.b.a.j(jSONObject, new JSONObject(h));
                } catch (Throwable unused) {
                }
            }
            try {
                String p = com.bytedance.crash.util.a.p(new File(file, "/anr_profiler.txt"));
                com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_profiler", p);
                if (p.isEmpty() || p.length() <= 10) {
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("filters");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    jSONObject.put("filters", optJSONObject);
                }
                com.bytedance.android.input.k.b.a.y0(optJSONObject, "has_anr_profiler", "true");
            } catch (Throwable unused2) {
            }
        }

        public void j(@NonNull JSONObject jSONObject) {
            BufferedReader bufferedReader;
            String str;
            String str2;
            String readLine;
            String str3;
            File file = new File(this.a + "/anr_profiler.txt");
            if (!file.exists()) {
                return;
            }
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    str = "";
                    str2 = null;
                } catch (Throwable unused) {
                }
                while (true) {
                    try {
                        readLine = bufferedReader.readLine();
                    } catch (Throwable unused2) {
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                            return;
                        }
                        return;
                    }
                    if (readLine == null) {
                        bufferedReader.close();
                        return;
                    }
                    String[] split = readLine.split(">");
                    char c2 = 3;
                    boolean z = false;
                    if (split.length == 2) {
                        str = split[0].trim();
                        try {
                            switch (str.hashCode()) {
                                case -1771995437:
                                    if (str.equals("SYS_MEMORY")) {
                                        c2 = '\n';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1427608066:
                                    if (str.equals("ANR_REASON")) {
                                        c2 = '\b';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1276471214:
                                    if (str.equals("PAGE_FAULT")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -523188726:
                                    if (str.equals("PROC_MEMORY")) {
                                        c2 = '\t';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 262265095:
                                    if (str.equals("ANR_TIME")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1317675854:
                                    if (str.equals("GC_STATE")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1367485235:
                                    if (str.equals("JVM_STATE")) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2060837732:
                                    if (str.equals("CPU_FREQS")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2064264317:
                                    if (str.equals("CPU_JIFFS")) {
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2066285238:
                                    if (str.equals("CPU_LOADS")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2072399136:
                                    if (str.equals("CPU_SCHED")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    try {
                                        str3 = split[1].trim().split(" ")[1];
                                        try {
                                            str2 = TextUtils.isEmpty(str3) ? "" : str3.substring(0, 8);
                                        } catch (Exception unused3) {
                                            str2 = str3;
                                        }
                                    } catch (Exception unused4) {
                                        str3 = null;
                                    }
                                case 1:
                                    c(jSONObject, split[1]);
                                    break;
                                case 2:
                                    d(jSONObject, split[1]);
                                    break;
                                case 3:
                                    b(jSONObject, split[1]);
                                    break;
                                case 4:
                                    a(jSONObject, split[1]);
                                    break;
                                case 5:
                                    f(jSONObject, split[1]);
                                    break;
                                case 6:
                                    e(jSONObject, split[1]);
                                    break;
                                case 7:
                                    Matcher matcher = Pattern.compile("^ JavaLock (.*)$").matcher(split[1]);
                                    if (matcher.find() && matcher.groupCount() == 1) {
                                        com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_java_lock_owner", matcher.group(1));
                                        break;
                                    }
                                    break;
                                case '\b':
                                    com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_profiler_anr_reason", split[1].trim());
                                    g(jSONObject, split[1]);
                                    break;
                                case '\t':
                                    g(jSONObject, split[1]);
                                    break;
                                case '\n':
                                    h(jSONObject, split[1]);
                                    break;
                            }
                        } catch (Throwable unused5) {
                        }
                    } else if ("SCHED_STREAM".equals(str) && !TextUtils.isEmpty(str2)) {
                        try {
                            String[] split2 = readLine.trim().split(" ");
                            String str4 = split2[0];
                            int parseInt = Integer.parseInt(split2[3]);
                            if (str4.startsWith(str2)) {
                                jSONObject.put("is_background", parseInt <= 200);
                                jSONObject.put("lifecycle_from_adj", 1);
                            }
                            z = true;
                        } catch (Throwable unused6) {
                        }
                        if (z) {
                            str = "";
                        }
                    }
                }
            } catch (Throwable unused7) {
            }
        }
    }

    public static void d(boolean z) {
        if (z) {
            com.bytedance.crash.runtime.b.d(new a());
        }
    }

    public void b(File file, long j) {
        long j2 = this.a;
        if (j2 != 0) {
            NativeBridge.nAnrNativeProfilerDump(j2, file + "/anr_profiler.inf", j);
        }
    }

    public void c() {
        long j = this.a;
        if (j != 0) {
            NativeBridge.nAnrNativeProfilerExit(j);
        }
    }
}
