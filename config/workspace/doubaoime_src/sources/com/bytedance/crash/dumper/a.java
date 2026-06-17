package com.bytedance.crash.dumper;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.C0648c;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.util.JSONWriter;
import com.bytedance.crash.v;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static C0648c a;

    /* renamed from: com.bytedance.crash.dumper.a$a, reason: collision with other inner class name */
    static class C0207a extends d {
        C0207a(File file) {
            super(file);
        }

        @Override // com.bytedance.crash.dumper.a.d
        Pattern a() {
            return Pattern.compile("^  native: #\\d{1,3} pc [0-9a-f]{8,16} {2}(/(?:[^/]+/)+.*\\.so).*");
        }

        @Override // com.bytedance.crash.dumper.a.d
        boolean b(String str) {
            return str.startsWith("  native: #");
        }
    }

    static class b extends d {
        b(File file) {
            super(file);
        }

        @Override // com.bytedance.crash.dumper.a.d
        Pattern a() {
            return Pattern.compile("^#\\d{1,3} pc [0-9a-f]{8,16} {2}(/(?:[^/]+/)+.*\\.so).*");
        }

        @Override // com.bytedance.crash.dumper.a.d
        boolean b(String str) {
            return str.startsWith("#");
        }
    }

    static class c extends d {
        c(File file) {
            super(file);
        }

        @Override // com.bytedance.crash.dumper.a.d
        Pattern a() {
            return Pattern.compile("^0x[0-9a-f]{1,16}:(/(?:[^/]+/)+[^.]+\\.so):.*");
        }

        @Override // com.bytedance.crash.dumper.a.d
        boolean b(String str) {
            return str.startsWith("0x");
        }
    }

    static abstract class d {
        private final File a;
        private final Pattern b = a();

        d(File file) {
            this.a = file;
        }

        abstract Pattern a();

        abstract boolean b(String str);

        /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void c(java.util.List<java.lang.String> r6) {
            /*
                r5 = this;
                java.io.File r0 = r5.a
                boolean r0 = r0.exists()
                if (r0 != 0) goto L9
                return
            L9:
                r0 = 0
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L49
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49
                java.io.File r4 = r5.a     // Catch: java.lang.Throwable -> L49
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L49
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L49
            L1b:
                java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L48
                if (r0 == 0) goto L4a
                boolean r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L1b
                java.util.regex.Pattern r2 = r5.b     // Catch: java.lang.Throwable -> L48
                java.util.regex.Matcher r0 = r2.matcher(r0)     // Catch: java.lang.Throwable -> L48
                boolean r2 = r0.find()     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L1b
                int r2 = r0.groupCount()     // Catch: java.lang.Throwable -> L48
                r3 = 1
                if (r2 != r3) goto L1b
                java.lang.String r0 = r0.group(r3)     // Catch: java.lang.Throwable -> L48
                boolean r2 = r6.contains(r0)     // Catch: java.lang.Throwable -> L48
                if (r2 != 0) goto L1b
                r6.add(r0)     // Catch: java.lang.Throwable -> L48
                goto L1b
            L48:
                r0 = r1
            L49:
                r1 = r0
            L4a:
                if (r1 == 0) goto L4f
                r1.close()     // Catch: java.lang.Throwable -> L4f
            L4f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.a.d.c(java.util.List):void");
        }
    }

    private static boolean a(com.bytedance.crash.dumper.j.f fVar, Map<? extends String, ? extends String> map, String str, long j, boolean z) {
        if (map != null && map.size() != 0) {
            StringBuilder S = e.a.a.a.a.S("zz_cost_", str);
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    fVar.a(',');
                }
                fVar.i(entry.getKey());
                fVar.j(entry.getValue());
                S.append(BundleUtil.UNDERLINE_TAG);
                S.append(entry.getKey());
            }
            fVar.a(',');
            fVar.i(S.toString());
            fVar.c(SystemClock.uptimeMillis() - j);
        }
        return z;
    }

    private static String b(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    public static void c(File file) {
        File[] a2;
        C0648c c0648c = a;
        if (c0648c == null || (a2 = c0648c.a(CrashType.ANR)) == null) {
            return;
        }
        for (File file2 : a2) {
            File file3 = new File(file, file2.getName());
            if (!file3.exists()) {
                com.bytedance.crash.util.a.a(file2, file3, Integer.MAX_VALUE, false);
            }
        }
    }

    public static void d(File file, CrashType crashType, int i) {
        com.bytedance.crash.dumper.j.f fVar = new com.bytedance.crash.dumper.j.f(file.getAbsolutePath() + "/" + MonitorConstants.CUSTOM + ".json");
        fVar.a('{');
        fVar.i(MonitorConstants.CUSTOM);
        fVar.a('{');
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 != null) {
            List<AttachUserData> r = e2.j().r(crashType);
            boolean z = true;
            for (int i2 = 0; i2 < r.size(); i2++) {
                AttachUserData attachUserData = r.get(i2);
                try {
                    z = a(fVar, attachUserData.getUserData(crashType), attachUserData.getClass().getName(), SystemClock.uptimeMillis(), z);
                } catch (Throwable unused) {
                }
            }
            List<v> D = e2.j().D(crashType);
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.input.k.b.a.y0(jSONObject, "tid", Integer.valueOf(i));
            for (int i3 = 0; i3 < D.size(); i3++) {
                v vVar = D.get(i3);
                try {
                    z = a(fVar, vVar.a(crashType, jSONObject), vVar.getClass().getName(), SystemClock.uptimeMillis(), z);
                } catch (Throwable unused2) {
                }
            }
        }
        fVar.a('}');
        fVar.a('}');
        fVar.h();
    }

    public static void e(File file) {
        Context g2 = C0652g.g();
        if (g2 != null) {
            ActivityManager activityManager = (ActivityManager) g2.getSystemService("activity");
            MemoryInfo$DevMemoryInfo.dump(file);
            MemoryInfo$SysMemoryInfo.dump(file, activityManager);
            MemoryInfo$AppMemoryInfo.dump(file, activityManager);
        }
    }

    public static void f(File file) {
        Window window;
        View peekDecorView;
        JSONArray jSONArray = new JSONArray();
        ArrayList<WeakReference<Activity>> v = com.bytedance.crash.a0.a.v();
        BufferedWriter bufferedWriter = null;
        if (v == null || v.size() <= 0) {
            jSONArray = null;
        } else {
            LinkedList linkedList = new LinkedList();
            Iterator<WeakReference<Activity>> it2 = v.iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().get();
                if (activity != null && (window = activity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    linkedList.add(new Pair(peekDecorView, jSONObject));
                    jSONArray.put(jSONObject);
                }
            }
            while (!linkedList.isEmpty()) {
                Pair pair = (Pair) linkedList.pop();
                View view = (View) pair.first;
                JSONObject jSONObject2 = (JSONObject) pair.second;
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "cls", String.valueOf(view.getClass()));
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    JSONArray jSONArray2 = new JSONArray();
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "children", jSONArray2);
                    for (int i = 0; i < childCount; i++) {
                        try {
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONArray2.put(jSONObject3);
                                linkedList.push(new Pair(childAt, jSONObject3));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        if (jSONArray != null) {
            File file2 = new File(file, "viewTree.txt");
            try {
                file2.getParentFile().mkdirs();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file2, false));
                    try {
                        JSONWriter.h(jSONArray, bufferedWriter2);
                        bufferedWriter2.close();
                    } catch (Throwable unused2) {
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
            }
        }
    }

    private static String g(long j) {
        com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("ms");
        eVar.c(new Long[]{0L, 1000L, 2000L, Long.valueOf(WsConstants.EXIT_DELAY_TIME), Long.valueOf(com.heytap.mcssdk.constant.a.r), 7000L, Long.valueOf(com.heytap.mcssdk.constant.a.q)});
        return eVar.a(j);
    }

    private static String h(int i) {
        com.bytedance.crash.util.e eVar = new com.bytedance.crash.util.e("");
        eVar.c(new Long[]{0L, 1L, 5L, 10L, 20L});
        return eVar.a(i);
    }

    public static String i(long j) {
        return j <= 52428800 ? "0 - 50M" : j <= 104857600 ? "50M - 100M" : j <= DownloadConstants.GB ? "100M - 1G" : "1G - ";
    }

    private static long j(long j, String str) {
        Date date;
        try {
            String substring = str.substring(0, 18);
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(String.format("%tY", new Date(j)) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + substring);
        } catch (Throwable unused) {
            date = null;
        }
        if (date != null) {
            return date.getTime();
        }
        return -1L;
    }

    public static String k(long j) {
        long j2 = j * DownloadConstants.KB;
        return j2 > 25769803776L ? "(24GB - MAX)" : j2 > 21474836480L ? "(20GB - 24GB]" : j2 > 17179869184L ? "(16GB - 20GB]" : j2 > 12884901888L ? "(12GB - 16GB]" : j2 > 10737418240L ? "(10GB - 12GB]" : j2 > 9663676416L ? "(9GB - 10GB]" : j2 > 8589934592L ? "(8GB - 9GB]" : j2 > 7516192768L ? "(7GB - 8GB]" : j2 > 6442450944L ? "(6GB - 7GB]" : j2 > 5368709120L ? "(5GB - 6GB]" : j2 > 4294967296L ? "(4GB - 5GB]" : "[0GB - 4GB]";
    }

    public static String l(long j, boolean z) {
        long j2 = z ? 4294967296L : 3221225472L;
        float f2 = j * DownloadConstants.KB;
        float f3 = j2;
        return f2 > 0.95f * f3 ? "(95% - 100%]" : f2 > 0.9f * f3 ? "(90% - 95%]" : f2 > 0.85f * f3 ? "(85% - 90%]" : f2 > 0.8f * f3 ? "(80% - 85%]" : f2 > 0.7f * f3 ? "(70% - 80%]" : f2 > 0.6f * f3 ? "(60% - 70%]" : f2 > f3 * 0.5f ? "(50% - 60%]" : "[0% - 50%]";
    }

    private static boolean m(String str) {
        return str.startsWith("/system/lib") || str.startsWith("/vendor/lib") || str.startsWith("/apex/");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r12 >= r10) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:7:0x000d, B:9:0x001d, B:15:0x0057, B:17:0x005b, B:19:0x006e, B:21:0x007e, B:22:0x00a2, B:25:0x003b), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:7:0x000d, B:9:0x001d, B:15:0x0057, B:17:0x005b, B:19:0x006e, B:21:0x007e, B:22:0x00a2, B:25:0x003b), top: B:6:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(com.bytedance.crash.dumper.g r9, long r10, long r12, java.lang.String r14) {
        /*
            java.lang.String r0 = "Blocked msg"
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 1
            r9.a(r0)
            java.lang.String r1 = ".*?Blocked msg = (\\{.*?\\}) , cost\\s+=\\s+(\\d+)\\s+ms"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Throwable -> Lae
            java.util.regex.Matcher r14 = r1.matcher(r14)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = r14.find()     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto Lb4
            r1 = 2
            r9.a(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = r14.group(r0)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r14 = r14.group(r1)     // Catch: java.lang.Throwable -> Lae
            int r14 = java.lang.Integer.parseInt(r14)     // Catch: java.lang.Throwable -> Lae
            long r3 = (long) r14     // Catch: java.lang.Throwable -> Lae
            r14 = -1
            r5 = 20000(0x4e20, double:9.8813E-320)
            long r5 = r10 - r5
            r7 = 10000(0x2710, double:4.9407E-320)
            long r10 = r10 - r7
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 >= 0) goto L3b
            goto L53
        L3b:
            long r5 = r9.a     // Catch: java.lang.Throwable -> Lae
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 > 0) goto L4b
            r10 = 2000(0x7d0, double:9.88E-321)
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r10 >= 0) goto L54
            goto L53
        L4b:
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L53
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 >= 0) goto L54
        L53:
            r8 = r0
        L54:
            r10 = 3
            if (r8 == 0) goto L5b
            r9.a(r10)     // Catch: java.lang.Throwable -> Lae
            return
        L5b:
            r9.b = r12     // Catch: java.lang.Throwable -> Lae
            r9.a = r3     // Catch: java.lang.Throwable -> Lae
            r11 = -1
            r9.f4588d = r11     // Catch: java.lang.Throwable -> Lae
            r9.f4589e = r11     // Catch: java.lang.Throwable -> Lae
            r13 = 0
            r9.f4590f = r13     // Catch: java.lang.Throwable -> Lae
            r9.f4591g = r13     // Catch: java.lang.Throwable -> Lae
            r9.h = r13     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto La0
            java.lang.String r3 = ".*?when=(\\S+)\\s+what=(\\d+)\\s+target=(\\S+)\\s+(.*?)=(.*?)\\}$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> Lae
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r2.find()     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto La0
            java.lang.String r11 = r2.group(r0)     // Catch: java.lang.Throwable -> Lae
            long r11 = q(r11)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r13 = r2.group(r1)     // Catch: java.lang.Throwable -> Lae
            int r14 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r13 = r2.group(r10)     // Catch: java.lang.Throwable -> Lae
            r10 = 4
            java.lang.String r0 = r2.group(r10)     // Catch: java.lang.Throwable -> Lae
            r1 = 5
            java.lang.String r1 = r2.group(r1)     // Catch: java.lang.Throwable -> Lae
            r9.a(r10)     // Catch: java.lang.Throwable -> Lae
            goto La2
        La0:
            r0 = r13
            r1 = r0
        La2:
            r9.f4588d = r11     // Catch: java.lang.Throwable -> Lae
            long r10 = (long) r14     // Catch: java.lang.Throwable -> Lae
            r9.f4589e = r10     // Catch: java.lang.Throwable -> Lae
            r9.f4590f = r13     // Catch: java.lang.Throwable -> Lae
            r9.f4591g = r0     // Catch: java.lang.Throwable -> Lae
            r9.h = r1     // Catch: java.lang.Throwable -> Lae
            goto Lb4
        Lae:
            r9 = move-exception
            java.lang.String r10 = "parseAnrLogException"
            com.bytedance.crash.Q.b.e(r10, r9)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.a.n(com.bytedance.crash.dumper.g, long, long, java.lang.String):void");
    }

    private static void o(h hVar, long j, int i, long j2, long j3, long j4, String str) {
        if (j2 > com.heytap.mcssdk.constant.a.r + j || j2 < j - 30000) {
            return;
        }
        if (i == 1) {
            hVar.f4595f++;
            Matcher matcher = Pattern.compile("(\\S+)\\s+.*?GC freed.*?paused \\S+ total (\\S+)").matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                float p = p(matcher.group(2));
                hVar.b = (long) (hVar.b + p);
                if (!"Background".equals(group)) {
                    hVar.a = (long) (hVar.a + p);
                    hVar.f4594e++;
                }
                if (j3 == j4) {
                    hVar.f4593d = (long) (hVar.f4593d + p);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            Matcher matcher2 = Pattern.compile("WaitForGcToComplete blocked \\S+ on (\\S+) for (\\S+)").matcher(str);
            if (matcher2.find()) {
                String group2 = matcher2.group(1);
                long p2 = (long) p(matcher2.group(2));
                Long l = hVar.j.get(group2);
                if (l == null) {
                    hVar.j.put(group2, Long.valueOf(p2));
                } else {
                    hVar.j.put(group2, Long.valueOf(l.longValue() + p2));
                }
                if (j3 == j4) {
                    long j5 = hVar.f4592c + 1;
                    hVar.f4592c = j5;
                    hVar.f4592c = j5 + p2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float p(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            r2 = 2
            if (r1 >= r2) goto Lc
            goto L8e
        Lc:
            r1 = 0
            r3 = r1
        Le:
            int r4 = r9.length()
            r5 = -1
            if (r3 >= r4) goto L2b
            char r4 = r9.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L28
            char r4 = r9.charAt(r3)
            r6 = 46
            if (r4 == r6) goto L28
            goto L2c
        L28:
            int r3 = r3 + 1
            goto Le
        L2b:
            r3 = r5
        L2c:
            if (r3 != r5) goto L2f
            return r0
        L2f:
            java.lang.String r4 = r9.substring(r1, r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r9.substring(r3)     // Catch: java.lang.Throwable -> L8e
            float r3 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Throwable -> L8e
            int r4 = r9.hashCode()     // Catch: java.lang.Throwable -> L8e
            r6 = 115(0x73, float:1.61E-43)
            r7 = 3
            r8 = 1
            if (r4 == r6) goto L6f
            r6 = 3494(0xda6, float:4.896E-42)
            if (r4 == r6) goto L65
            r6 = 3525(0xdc5, float:4.94E-42)
            if (r4 == r6) goto L5c
            r1 = 3742(0xe9e, float:5.244E-42)
            if (r4 == r1) goto L52
            goto L79
        L52:
            java.lang.String r1 = "us"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L79
            r1 = r8
            goto L7a
        L5c:
            java.lang.String r4 = "ns"
            boolean r9 = r9.equals(r4)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L79
            goto L7a
        L65:
            java.lang.String r1 = "ms"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L79
            r1 = r2
            goto L7a
        L6f:
            java.lang.String r1 = "s"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L79
            r1 = r7
            goto L7a
        L79:
            r1 = r5
        L7a:
            if (r1 == 0) goto L89
            r9 = 1148846080(0x447a0000, float:1000.0)
            if (r1 == r8) goto L87
            if (r1 == r2) goto L86
            if (r1 == r7) goto L85
            return r0
        L85:
            float r3 = r3 * r9
        L86:
            return r3
        L87:
            float r3 = r3 / r9
            return r3
        L89:
            r9 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r9
            return r3
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.a.p(java.lang.String):float");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r7.equals("m") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long q(java.lang.String r10) {
        /*
            if (r10 == 0) goto L9b
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto La
            goto L9b
        La:
            java.lang.String r0 = "-"
            boolean r0 = r10.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L1b
            java.lang.String r2 = "+"
            boolean r2 = r10.startsWith(r2)
            if (r2 == 0) goto L1f
        L1b:
            java.lang.String r10 = r10.substring(r1)
        L1f:
            r2 = 0
            java.lang.String r4 = "(\\d+)([dhms]+)"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r10 = r4.matcher(r10)
        L2b:
            boolean r4 = r10.find()
            if (r4 == 0) goto L97
            java.lang.String r4 = r10.group(r1)
            long r4 = java.lang.Long.parseLong(r4)
            r6 = 2
            java.lang.String r7 = r10.group(r6)
            r7.hashCode()
            r8 = -1
            int r9 = r7.hashCode()
            switch(r9) {
                case 100: goto L75;
                case 104: goto L6a;
                case 109: goto L61;
                case 115: goto L56;
                case 3494: goto L4b;
                default: goto L49;
            }
        L49:
            r6 = r8
            goto L7f
        L4b:
            java.lang.String r6 = "ms"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L54
            goto L49
        L54:
            r6 = 4
            goto L7f
        L56:
            java.lang.String r6 = "s"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L5f
            goto L49
        L5f:
            r6 = 3
            goto L7f
        L61:
            java.lang.String r9 = "m"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L7f
            goto L49
        L6a:
            java.lang.String r6 = "h"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L73
            goto L49
        L73:
            r6 = r1
            goto L7f
        L75:
            java.lang.String r6 = "d"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L7e
            goto L49
        L7e:
            r6 = 0
        L7f:
            switch(r6) {
                case 0: goto L90;
                case 1: goto L8c;
                case 2: goto L88;
                case 3: goto L85;
                case 4: goto L83;
                default: goto L82;
            }
        L82:
            goto L2b
        L83:
            long r2 = r2 + r4
            goto L2b
        L85:
            r6 = 1000(0x3e8, double:4.94E-321)
            goto L93
        L88:
            r6 = 60000(0xea60, double:2.9644E-319)
            goto L93
        L8c:
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L93
        L90:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
        L93:
            long r4 = r4 * r6
            long r4 = r4 + r2
            r2 = r4
            goto L2b
        L97:
            if (r0 == 0) goto L9a
            long r2 = -r2
        L9a:
            return r2
        L9b:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.a.q(java.lang.String):long");
    }

    public static void r(File file, JSONObject jSONObject) {
        try {
            file.listFiles(new com.bytedance.crash.dumper.d(jSONObject));
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.c("pushEvilFile", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(org.json.JSONObject r8, java.io.File r9) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "logcat.txt"
            r0.<init>(r9, r1)
            boolean r2 = r0.exists()
            r3 = 1
            if (r2 == 0) goto L1e
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L1e
            long r4 = r0.length()
            r6 = 50
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L38
        L1e:
            r0 = 0
            java.lang.String r2 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L26
            com.bytedance.crash.jni.NativeBridge.l(r2, r3, r0)     // Catch: java.lang.Throwable -> L26
        L26:
            java.io.File r0 = new java.io.File
            r0.<init>(r9, r1)
            boolean r9 = r0.exists()
            if (r9 == 0) goto L84
            boolean r9 = r0.isDirectory()
            if (r9 == 0) goto L38
            goto L84
        L38:
            long r1 = r0.length()
            int r9 = (int) r1
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L68
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L68
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L68
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L68
        L4d:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L61
            r4 = 524288(0x80000, float:7.34684E-40)
            if (r9 >= r4) goto L5a
            r1.put(r2)     // Catch: java.lang.Throwable -> L65
        L5a:
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L65
            int r2 = r2 + r3
            int r9 = r9 - r2
            goto L4d
        L61:
            r0.close()     // Catch: java.io.IOException -> L71
            goto L71
        L65:
            r9 = move-exception
            r2 = r0
            goto L69
        L68:
            r9 = move-exception
        L69:
            com.bytedance.android.input.k.b.a.W(r9)     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.io.IOException -> L71
        L71:
            int r9 = r1.length()
            if (r9 == 0) goto L7c
            java.lang.String r9 = "logcat"
            r8.put(r9, r1)     // Catch: org.json.JSONException -> L7c
        L7c:
            return
        L7d:
            r8 = move-exception
            if (r2 == 0) goto L83
            r2.close()     // Catch: java.io.IOException -> L83
        L83:
            throw r8
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.a.s(org.json.JSONObject, java.io.File):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(@androidx.annotation.NonNull org.json.JSONObject r12, java.io.File r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L6e
            com.bytedance.crash.dumper.MemoryInfo$AppMemoryInfo r1 = com.bytedance.crash.dumper.MemoryInfo$AppMemoryInfo.load(r13)
            com.bytedance.crash.dumper.MemoryInfo$SysMemoryInfo r2 = com.bytedance.crash.dumper.MemoryInfo$SysMemoryInfo.load(r13)
            com.bytedance.crash.dumper.MemoryInfo$DevMemoryInfo r3 = com.bytedance.crash.dumper.MemoryInfo$DevMemoryInfo.load(r13)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "sys_memtrack.txt"
            r5.<init>(r13, r6)
            boolean r13 = r5.exists()
            if (r13 == 0) goto L6c
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L67
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> L67
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L67
            r13.<init>(r6)     // Catch: java.lang.Throwable -> L67
        L2b:
            java.lang.String r0 = r13.readLine()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L62
            java.lang.String r5 = ""
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L3a
            goto L2b
        L3a:
            java.lang.String r5 = " "
            java.lang.String[] r0 = r0.split(r5)     // Catch: java.lang.Throwable -> L66
            int r5 = r0.length     // Catch: java.lang.Throwable -> L66
            r6 = 3
            if (r5 != r6) goto L2b
            r5 = 0
            r6 = r0[r5]     // Catch: java.lang.Throwable -> L66
            r7 = 1
            r0 = r0[r7]     // Catch: java.lang.Throwable -> L66
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L66
            r10 = 1024(0x400, double:5.06E-321)
            long r8 = r8 * r10
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L66
            int r0 = r0 - r7
            java.lang.String r0 = r6.substring(r5, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L66
            r4.putOpt(r0, r5)     // Catch: java.lang.Throwable -> L66
            goto L2b
        L62:
            r13.close()     // Catch: java.lang.Throwable -> L6c
            goto L6c
        L66:
            r0 = r13
        L67:
            if (r0 == 0) goto L6c
            r0.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = r4
            goto L90
        L6e:
            android.content.Context r13 = com.bytedance.crash.C0652g.g()
            if (r13 == 0) goto L89
            java.lang.String r1 = "activity"
            java.lang.Object r13 = r13.getSystemService(r1)
            android.app.ActivityManager r13 = (android.app.ActivityManager) r13
            if (r13 == 0) goto L89
            com.bytedance.crash.dumper.MemoryInfo$AppMemoryInfo r1 = new com.bytedance.crash.dumper.MemoryInfo$AppMemoryInfo
            r1.<init>(r13)
            com.bytedance.crash.dumper.MemoryInfo$SysMemoryInfo r2 = new com.bytedance.crash.dumper.MemoryInfo$SysMemoryInfo
            r2.<init>(r13)
            goto L8b
        L89:
            r1 = r0
            r2 = r1
        L8b:
            com.bytedance.crash.dumper.MemoryInfo$DevMemoryInfo r3 = new com.bytedance.crash.dumper.MemoryInfo$DevMemoryInfo
            r3.<init>()
        L90:
            if (r1 == 0) goto L95
            r1.pushTo(r12)
        L95:
            if (r2 == 0) goto L9a
            r2.pushTo(r12)
        L9a:
            if (r3 == 0) goto L9f
            r3.pushTo(r12)
        L9f:
            if (r0 == 0) goto Ld3
            java.lang.String r13 = "memory_info"
            org.json.JSONObject r1 = r12.optJSONObject(r13)
            if (r1 != 0) goto Lad
            r12.putOpt(r13, r0)     // Catch: java.lang.Throwable -> Ld3
            goto Ld3
        Lad:
            java.lang.String r12 = "graphicPss"
            boolean r12 = r1.has(r12)
            if (r12 != 0) goto Ld3
            java.util.Iterator r12 = r0.keys()
        Lb9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Ld3
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r2 = r1.has(r13)
            if (r2 != 0) goto Lb9
            java.lang.Object r2 = r0.opt(r13)
            r1.put(r13, r2)
            goto Lb9
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.a.t(org.json.JSONObject, java.io.File):void");
    }

    public static void u(JSONObject jSONObject) {
        JSONArray jSONArray;
        int i;
        h hVar;
        int i2;
        long j;
        g gVar;
        int i3;
        String string;
        long j2;
        long j3;
        JSONArray optJSONArray = jSONObject.optJSONArray("logcat");
        JSONObject optJSONObject = jSONObject.optJSONObject("filters");
        long optLong = jSONObject.optLong("crash_time");
        int optInt = jSONObject.optInt("pid");
        if (optJSONArray == null || optJSONArray.length() == 0 || optJSONObject == null) {
            return;
        }
        h hVar2 = new h(30000L);
        g gVar2 = new g();
        int i4 = 1;
        int length = optJSONArray.length() - 1;
        while (length > 0) {
            try {
                string = optJSONArray.getString(length);
            } catch (Exception e2) {
                e = e2;
                jSONArray = optJSONArray;
                i = length;
            }
            if (!TextUtils.isEmpty(string)) {
                long j4 = j(optLong, string);
                String substring = string.substring(19);
                int i5 = substring.contains("ANR_LOG") ? 0 : substring.contains("GC freed") ? i4 : substring.contains("WaitForGcToComplete blocked") ? 2 : -1;
                if (i5 != -1) {
                    Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+) \\S\\s+[\\s\\S]*:([\\s\\S]*)").matcher(substring);
                    if (matcher.find()) {
                        String group = matcher.group(i4);
                        String group2 = matcher.group(2);
                        String group3 = matcher.group(3);
                        long parseLong = group != null ? Long.parseLong(group) : 0L;
                        if (group2 != null) {
                            j3 = Long.parseLong(group2);
                            j2 = 0;
                        } else {
                            j2 = 0;
                            j3 = 0;
                        }
                        if (parseLong != j2 && optInt == parseLong && group3 != null) {
                            if (i5 == 0) {
                                i = length;
                                try {
                                    n(gVar2, optLong, j4, group3);
                                    jSONArray = optJSONArray;
                                    gVar = gVar2;
                                    i3 = i4;
                                    i2 = optInt;
                                    hVar = hVar2;
                                    j = optLong;
                                } catch (Exception e3) {
                                    e = e3;
                                    jSONArray = optJSONArray;
                                    gVar = gVar2;
                                    i3 = i4;
                                    i2 = optInt;
                                    hVar = hVar2;
                                    j = optLong;
                                    com.bytedance.android.input.k.b.a.F(new RuntimeException(e));
                                    length = i - 1;
                                    i4 = i3;
                                    gVar2 = gVar;
                                    optJSONArray = jSONArray;
                                    optLong = j;
                                    optInt = i2;
                                    hVar2 = hVar;
                                }
                                length = i - 1;
                                i4 = i3;
                                gVar2 = gVar;
                                optJSONArray = jSONArray;
                                optLong = j;
                                optInt = i2;
                                hVar2 = hVar;
                            } else {
                                i = length;
                                jSONArray = optJSONArray;
                                gVar = gVar2;
                                i3 = i4;
                                long j5 = parseLong;
                                i2 = optInt;
                                hVar = hVar2;
                                long j6 = j3;
                                j = optLong;
                                try {
                                    o(hVar2, optLong, i5, j4, j5, j6, group3);
                                } catch (Exception e4) {
                                    e = e4;
                                    com.bytedance.android.input.k.b.a.F(new RuntimeException(e));
                                    length = i - 1;
                                    i4 = i3;
                                    gVar2 = gVar;
                                    optJSONArray = jSONArray;
                                    optLong = j;
                                    optInt = i2;
                                    hVar2 = hVar;
                                }
                                length = i - 1;
                                i4 = i3;
                                gVar2 = gVar;
                                optJSONArray = jSONArray;
                                optLong = j;
                                optInt = i2;
                                hVar2 = hVar;
                            }
                        }
                    }
                }
            }
            jSONArray = optJSONArray;
            i = length;
            gVar = gVar2;
            i3 = i4;
            i2 = optInt;
            hVar = hVar2;
            j = optLong;
            length = i - 1;
            i4 = i3;
            gVar2 = gVar;
            optJSONArray = jSONArray;
            optLong = j;
            optInt = i2;
            hVar2 = hVar;
        }
        g gVar3 = gVar2;
        int i6 = i4;
        h hVar3 = hVar2;
        long j7 = 0;
        try {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "logcat_gc_info", hVar3.c());
            String str = hVar3.h;
            if (str != null) {
                optJSONObject.put("logcat_gc_cause", str);
                optJSONObject.put("logcat_gc_cause_cost", g(hVar3.i));
                optJSONObject.put("logcat_gc_count_range", h(hVar3.f4594e));
                optJSONObject.put("logcat_gc_total_cost_range", g(hVar3.a));
                int i7 = hVar3.f4594e;
                if (i7 != 0) {
                    j7 = hVar3.a / i7;
                }
                optJSONObject.put("logcat_gc_avg_cost_range", g(j7));
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject, "logcat_anr_info", gVar3.b());
            int i8 = gVar3.f4587c;
            com.bytedance.android.input.k.b.a.y0(optJSONObject, "anr_log_tag", i8 != 0 ? i8 != i6 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "wrong" : "parsed_msg" : "dropped" : "parsed_log" : "found" : "none");
        } catch (Throwable unused) {
        }
    }

    public static void v(@NonNull JSONObject jSONObject, File file) {
        String a2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        new C0207a(file).c(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!m(str) && !hashMap.containsKey(str) && (a2 = NativeBridge.a(str)) != null) {
                hashMap.put(str, a2);
            }
        }
        x(jSONObject, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(@androidx.annotation.NonNull org.json.JSONObject r7, java.io.File r8, boolean r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r9 == 0) goto L8f
            java.io.File r9 = new java.io.File
            java.lang.String r2 = "tombstone.txt"
            r9.<init>(r8, r2)
            boolean r2 = r9.exists()
            if (r2 != 0) goto L1a
            goto L80
        L1a:
            java.lang.String r2 = "^ {4}(/(?:[^/]+/)+[^.]+\\.so) \\(BuildId: ([0-9a-f]+)\\).*"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7a
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7a
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7a
        L30:
            java.lang.String r9 = r4.readLine()     // Catch: java.lang.Throwable -> L79
            if (r9 == 0) goto L7b
            java.lang.String r3 = "build id:"
            boolean r9 = r9.startsWith(r3)     // Catch: java.lang.Throwable -> L79
            if (r9 == 0) goto L30
        L3e:
            java.lang.String r9 = r4.readLine()     // Catch: java.lang.Throwable -> L79
            if (r9 == 0) goto L30
            java.lang.String r3 = "    /"
            boolean r3 = r9.startsWith(r3)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L4d
            goto L30
        L4d:
            java.util.regex.Matcher r9 = r2.matcher(r9)     // Catch: java.lang.Throwable -> L79
            boolean r3 = r9.find()     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L3e
            int r3 = r9.groupCount()     // Catch: java.lang.Throwable -> L79
            r5 = 2
            if (r3 != r5) goto L3e
            r3 = 1
            java.lang.String r3 = r9.group(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = r9.group(r5)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L3e
            boolean r5 = m(r3)     // Catch: java.lang.Throwable -> L79
            if (r5 != 0) goto L3e
            boolean r5 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L79
            if (r5 != 0) goto L3e
            r0.put(r3, r9)     // Catch: java.lang.Throwable -> L79
            goto L3e
        L79:
            r3 = r4
        L7a:
            r4 = r3
        L7b:
            if (r4 == 0) goto L80
            r4.close()     // Catch: java.lang.Throwable -> L80
        L80:
            com.bytedance.crash.dumper.a$b r9 = new com.bytedance.crash.dumper.a$b
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "nstack.txt"
            r2.<init>(r8, r3)
            r9.<init>(r2)
            r9.c(r1)
        L8f:
            com.bytedance.crash.dumper.a$c r9 = new com.bytedance.crash.dumper.a$c
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "rountines.txt"
            r2.<init>(r8, r3)
            r9.<init>(r2)
            r9.c(r1)
            java.util.Iterator r8 = r1.iterator()
        La2:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc4
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r1 = m(r9)
            if (r1 != 0) goto La2
            boolean r1 = r0.containsKey(r9)
            if (r1 != 0) goto La2
            java.lang.String r1 = com.bytedance.crash.jni.NativeBridge.a(r9)
            if (r1 == 0) goto La2
            r0.put(r9, r1)
            goto La2
        Lc4:
            x(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.a.w(org.json.JSONObject, java.io.File, boolean):void");
    }

    private static void x(JSONObject jSONObject, Map<String, String> map) {
        String str;
        int lastIndexOf;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                String key = entry.getKey();
                if (TextUtils.isEmpty(key) || (lastIndexOf = key.lastIndexOf(47)) == -1) {
                    str = null;
                } else {
                    str = key.substring(lastIndexOf + 1);
                    int indexOf = str.indexOf(".apk!");
                    if (indexOf != -1) {
                        str = str.substring(indexOf + 5);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "lib_name", str);
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "lib_uuid", b(entry.getValue()));
                    jSONArray.put(jSONObject2);
                }
            } catch (Throwable unused) {
            }
        }
        com.bytedance.android.input.k.b.a.y0(jSONObject, "crash_lib_uuid", jSONArray);
    }

    public static long y() {
        Context g2 = C0652g.g();
        if (g2 == null) {
            return 0L;
        }
        try {
            return new StatFs(g2.getFilesDir().getPath()).getFreeBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
