package com.bytedance.crash.L;

import android.app.ActivityManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    private final String a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f4411c;

    /* renamed from: d, reason: collision with root package name */
    private int f4412d;

    /* renamed from: e, reason: collision with root package name */
    private String f4413e;

    /* renamed from: f, reason: collision with root package name */
    private String f4414f;

    /* renamed from: g, reason: collision with root package name */
    private String f4415g;
    private int h;
    private int i;
    private final float[] j;
    a k;
    a l;
    a m;

    class a {
        String a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f4416c;

        /* renamed from: d, reason: collision with root package name */
        int f4417d;

        /* renamed from: e, reason: collision with root package name */
        int f4418e;

        /* renamed from: f, reason: collision with root package name */
        long f4419f;

        /* renamed from: g, reason: collision with root package name */
        long f4420g;
        String h;
        boolean i;
        boolean j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        double r;
        double s;
        double t;
        double u;
        double v;
        ArrayList<c> q = new ArrayList<>();
        ArrayList<Double> w = new ArrayList<>();

        /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        a(java.lang.String r11, int[] r12) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.L.g.a.<init>(com.bytedance.crash.L.g, java.lang.String, int[]):void");
        }

        @Nullable
        c a() {
            Iterator<c> it2 = this.q.iterator();
            while (it2.hasNext()) {
                c next = it2.next();
                if (next.f4425g == g.this.f4412d) {
                    return next;
                }
            }
            return null;
        }

        JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            Iterator<c> it2 = this.q.iterator();
            while (it2.hasNext()) {
                c next = it2.next();
                com.bytedance.android.input.k.b.a.y0(jSONObject, String.valueOf(next.f4425g), com.bytedance.android.input.k.b.a.y0(com.bytedance.android.input.k.b.a.y0(new JSONObject(), "process_name", next.a), MonitorConstants.CPU, Double.valueOf(next.b)));
            }
            return jSONObject;
        }

        c c() {
            if (this.q.size() != 0) {
                return this.q.get(0);
            }
            return null;
        }

        void d() {
            int indexOf;
            int i = this.f4416c + 1;
            while (i < this.f4417d && (indexOf = this.a.indexOf("\n", i)) >= 0) {
                if (indexOf - i <= 4 || this.a.charAt(i + 2) != ' ') {
                    c cVar = null;
                    try {
                        cVar = e(this.a, i, indexOf);
                    } catch (Throwable unused) {
                    }
                    if (cVar == null) {
                        continue;
                    } else if (cVar.b < 1.0d) {
                        return;
                    } else {
                        this.q.add(cVar);
                    }
                }
                i = indexOf + 1;
            }
        }

        @Nullable
        c e(String str, int i, int i2) {
            int i3;
            int indexOf;
            int i4 = i + 2;
            int indexOf2 = str.indexOf(37, i4);
            c cVar = null;
            if (indexOf2 >= 0 && indexOf2 <= i2) {
                double parseDouble = Double.parseDouble(str.substring(i4, indexOf2));
                int i5 = indexOf2 + 2;
                int indexOf3 = str.indexOf(47, i5);
                if (indexOf3 >= 0 && indexOf3 <= i2) {
                    int parseInt = Integer.parseInt(str.substring(i5, indexOf3));
                    int i6 = indexOf3 + 1;
                    int indexOf4 = str.indexOf(": ", i6);
                    if (indexOf4 >= 0 && indexOf4 <= i2) {
                        cVar = new c(parseInt, str.substring(i6, indexOf4), parseDouble);
                        if (parseInt == g.this.f4412d && (indexOf = str.indexOf("% user + ", (i3 = indexOf4 + 2))) >= 0 && indexOf <= i2) {
                            cVar.f4421c = Double.parseDouble(str.substring(i3, indexOf));
                            int i7 = indexOf + 9;
                            int indexOf5 = str.indexOf("% kernel", i7);
                            if (indexOf5 >= 0 && indexOf5 <= i2) {
                                cVar.f4422d = Double.parseDouble(str.substring(i7, indexOf5));
                                int indexOf6 = str.indexOf("faults: ", indexOf5);
                                if (indexOf6 >= 0 && indexOf6 <= i2) {
                                    int i8 = indexOf6 + 8;
                                    int indexOf7 = str.indexOf(" minor", i8);
                                    if (indexOf7 > 0 && indexOf7 < i2) {
                                        cVar.f4423e = Long.parseLong(str.substring(i8, indexOf7));
                                        i8 = indexOf7 + 7;
                                    }
                                    int indexOf8 = str.indexOf(" major", i8);
                                    if (indexOf8 > 0 && indexOf8 < i2) {
                                        cVar.f4424f = Long.parseLong(str.substring(i8, indexOf8));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return cVar;
        }

        void f() {
            Iterator<c> it2 = this.q.iterator();
            while (it2.hasNext()) {
                c next = it2.next();
                String str = next.a;
                double d2 = next.b;
                if (str.contains("kworker")) {
                    this.t += d2;
                } else if (str.contains("kswapd")) {
                    this.r += d2;
                } else if (str.contains("mmcqd")) {
                    this.s += d2;
                } else if (str.contains("system_server")) {
                    this.u += d2;
                } else if (str.contains("lmkd")) {
                    this.v += d2;
                } else if (str.contains("dex2oat")) {
                    this.w.add(Double.valueOf(d2));
                }
            }
        }

        void g(@NonNull JSONObject jSONObject, boolean z) {
            try {
                jSONObject.put(z ? "user" : "user2", this.l);
                jSONObject.put(z ? NotificationCompat.CATEGORY_SYSTEM : "sys2", this.m);
                jSONObject.put(z ? "iowait" : "iowait2", this.n);
                jSONObject.put(z ? "irq" : "irq2", this.o);
                jSONObject.put(z ? "softirq" : "softirq2", this.p);
                c a = a();
                if (a != null) {
                    jSONObject.put(z ? "minor" : "minor2", a.f4423e);
                    jSONObject.put(z ? "major" : "major2", a.f4424f);
                }
                jSONObject.put(z ? "before_cpu_list" : "after_cpu_list", b());
            } catch (Throwable unused) {
            }
        }

        void h(@NonNull JSONObject jSONObject) {
            try {
                jSONObject.put("kswapd", this.r);
                jSONObject.put("mmcqd", this.s);
                jSONObject.put("kwork", this.t);
                jSONObject.put("system_server", this.u);
                jSONObject.put("lmkd", this.v);
                if (this.w.isEmpty()) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<Double> it2 = this.w.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                jSONObject.put("dex2oat", jSONArray);
            } catch (Throwable unused) {
            }
        }
    }

    static class b {
        String a;
        int b = 0;

        b(String str) {
            this.a = str;
        }

        void a(int i) {
            this.b += i;
        }

        @Nullable
        String b(String str, String str2) {
            int i = this.b;
            if (str != null) {
                int indexOf = this.a.indexOf(str, i);
                if (indexOf < 0) {
                    return null;
                }
                this.b = str.length() + indexOf;
            }
            int indexOf2 = this.a.indexOf(str2, this.b);
            if (indexOf2 < 0) {
                this.b = i;
                return null;
            }
            String substring = this.a.substring(this.b, indexOf2);
            this.b = str2.length() + indexOf2;
            return substring;
        }
    }

    static class c {
        String a;
        double b;

        /* renamed from: c, reason: collision with root package name */
        double f4421c;

        /* renamed from: d, reason: collision with root package name */
        double f4422d;

        /* renamed from: e, reason: collision with root package name */
        long f4423e;

        /* renamed from: f, reason: collision with root package name */
        long f4424f;

        /* renamed from: g, reason: collision with root package name */
        int f4425g;

        c(int i, String str, double d2) {
            this.f4425g = i;
            this.a = str;
            this.b = d2;
        }
    }

    public g(String str) {
        this.j = new float[]{-1.0f, -1.0f, -1.0f};
        this.a = str;
        this.b = false;
        l(str);
    }

    private static String b(float f2) {
        return f2 < 0.0f ? "invalid" : f2 > 100.0f ? "> 100" : new String[]{"0~10", "10~20", "20~30", "30~40", "40~50", "50~60", "60~70", "70~80", "80~90", "90~100"}[((int) f2) / 10];
    }

    private static boolean c(String str, String str2) {
        return (str == null || str2 == null) ? str == null && str2 == null : str.equals(str2);
    }

    private static String d(float f2) {
        if (f2 < 0.0f) {
            return "invalid";
        }
        float[] fArr = {2000.0f, 3000.0f, 4000.0f, 5000.0f, 10000.0f, 20000.0f, 30000.0f, 40000.0f, 50000.0f, 60000.0f, 70000.0f, 80000.0f, 90000.0f, 100000.0f, 150000.0f, 200000.0f, 300000.0f, 400000.0f, 500000.0f};
        String[] strArr = {"0~2k", "2k~3k", "3k~4k", "4k~5k", "5k~1w", "1w~2w", "2w~3w", "3w~4w", "4w~5w", "5w~6w", "7w~8w", "8w~9w", "9w~10w", "10w~15w", "15w~20w", "20w~30w", "30w~40w", "40w~50w", "> 50w"};
        for (int i = 0; i < 19; i++) {
            if (f2 <= fArr[i]) {
                return strArr[i];
            }
        }
        return strArr[18];
    }

    static String e(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        StringBuilder R = e.a.a.a.a.R("|------------- processErrorStateInfo--------------|\n", "condition: ");
        R.append(processErrorStateInfo.condition);
        R.append("\n");
        R.append("processName: ");
        e.a.a.a.a.K0(R, processErrorStateInfo.processName, "\n", "pid: ");
        R.append(processErrorStateInfo.pid);
        R.append("\n");
        R.append("uid: ");
        R.append(processErrorStateInfo.uid);
        R.append("\n");
        R.append("tag: ");
        e.a.a.a.a.K0(R, processErrorStateInfo.tag, "\n", "shortMsg : ");
        e.a.a.a.a.K0(R, processErrorStateInfo.shortMsg, "\n", "longMsg : ");
        return e.a.a.a.a.K(R, processErrorStateInfo.longMsg, "\n", "-----------------------end----------------------------");
    }

    static boolean j(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        return processErrorStateInfo.condition == processErrorStateInfo2.condition && processErrorStateInfo.pid == processErrorStateInfo2.pid && processErrorStateInfo.uid == processErrorStateInfo2.uid && c(processErrorStateInfo.processName, processErrorStateInfo2.processName) && c(processErrorStateInfo.tag, processErrorStateInfo2.tag) && c(processErrorStateInfo.shortMsg, processErrorStateInfo2.shortMsg) && c(processErrorStateInfo.longMsg, processErrorStateInfo2.longMsg);
    }

    @Nullable
    c f(a aVar) {
        Iterator<c> it2 = aVar.q.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (next.f4425g == this.f4412d) {
                return next;
            }
        }
        return null;
    }

    int g() {
        return this.f4412d;
    }

    String h() {
        String str = this.f4414f;
        if (str == null || !str.equals("Input dispatching timed out")) {
            return "invalid";
        }
        String lowerCase = this.f4413e.toLowerCase();
        return (lowerCase.contains("no window has focus but there is a focused application") || lowerCase.contains("does not have a focused window")) ? "no focused window" : lowerCase.contains("waiting to send non-key event because the touched window has not finished") ? "non-key event not finished" : lowerCase.contains("waiting to send key event because the focused window has not finished") ? "key event not finished" : lowerCase.contains("window is paused") ? "window is paused" : lowerCase.contains("window’s input channel is not registered") ? "input channel not registered" : lowerCase.contains("window’s input connection is") ? "window being removed" : lowerCase.contains("window’s input channel is full") ? "input channel is full" : lowerCase.contains("is not responding. waited") ? "activity is not responding" : "invalid";
    }

    c i(a aVar) {
        if (aVar.q.size() != 0) {
            return aVar.q.get(0);
        }
        return null;
    }

    boolean k() {
        return !TextUtils.isEmpty(this.a);
    }

    int l(String str) {
        Float valueOf;
        int indexOf;
        if (TextUtils.isEmpty(str) || !str.startsWith("|------------- processErrorStateInfo--------------|\n") || !str.endsWith("-----------------------end----------------------------")) {
            return -1;
        }
        try {
            b bVar = new b(str);
            bVar.b = 52;
            if (bVar.b("condition: ", "\n") == null) {
                return -2;
            }
            String b2 = bVar.b("processName: ", "\n");
            if (b2 == null) {
                return -3;
            }
            this.f4411c = b2;
            String b3 = bVar.b("pid: ", "\n");
            if (b3 == null) {
                return -4;
            }
            try {
                this.f4412d = Integer.parseInt(b3);
                if (bVar.b("uid: ", "\n") == null) {
                    return -6;
                }
                String b4 = bVar.b("tag: ", "\n");
                if (b4 == null) {
                    return -7;
                }
                this.f4415g = b4;
                int indexOf2 = str.indexOf("shortMsg : ", bVar.b);
                if (indexOf2 < 0) {
                    return -8;
                }
                int i = indexOf2 + 11;
                int indexOf3 = str.indexOf(10, i);
                if (indexOf3 < 0) {
                    return -9;
                }
                int indexOf4 = str.indexOf("longMsg : ", indexOf3);
                if (indexOf4 < 0) {
                    return -10;
                }
                this.h = indexOf4 + 10;
                this.f4413e = str.substring(i, indexOf4 - 1);
                int length = str.length() - 54;
                this.i = length;
                if (length != 0) {
                    int i2 = this.h;
                    while (true) {
                        if (i2 >= this.i || (indexOf = str.indexOf("\n", i2)) < 0) {
                            break;
                        }
                        int[] iArr = new int[4];
                        while (true) {
                            int indexOf5 = str.indexOf("\n", i2);
                            if (indexOf5 < 0) {
                                break;
                            }
                            if (str.startsWith("CPU usage from", i2)) {
                                iArr[0] = i2;
                                iArr[1] = indexOf5;
                                int indexOf6 = str.indexOf("% TOTAL: ", indexOf5 + 1);
                                if (indexOf6 > 0) {
                                    int lastIndexOf = str.lastIndexOf(10, indexOf6) + 1;
                                    int indexOf7 = str.indexOf(10, indexOf6);
                                    if (lastIndexOf > 0 && indexOf7 > 0) {
                                        iArr[2] = lastIndexOf;
                                        iArr[3] = indexOf7;
                                    }
                                }
                            } else {
                                i2 = indexOf5 + 1;
                            }
                        }
                        iArr = null;
                        if (iArr != null) {
                            a aVar = new a(this, str, iArr);
                            if (aVar.j) {
                                if (this.k == null) {
                                    this.k = aVar;
                                    aVar.d();
                                } else if (this.l == null) {
                                    this.l = aVar;
                                    aVar.d();
                                    break;
                                }
                            }
                            i2 = iArr[3] + 1;
                        } else {
                            i2 = indexOf + 1;
                        }
                    }
                    a aVar2 = this.k;
                    this.m = aVar2;
                    if (this.l != null && aVar2.i) {
                        long abs = Math.abs(aVar2.f4419f + aVar2.f4420g);
                        a aVar3 = this.l;
                        if (abs > Math.abs(aVar3.f4419f + aVar3.f4420g)) {
                            this.m = this.l;
                        }
                    }
                    a aVar4 = this.m;
                    if (aVar4 != null) {
                        aVar4.f();
                    }
                }
                String b5 = bVar.b("Load: ", "\n");
                if (b5 != null) {
                    String[] split = b5.split("/");
                    if (this.j.length == split.length) {
                        for (int i3 = 0; i3 < split.length; i3++) {
                            float[] fArr = this.j;
                            try {
                                valueOf = Float.valueOf(split[i3].trim());
                            } catch (Exception unused) {
                                valueOf = Float.valueOf(-1.0f);
                            }
                            fArr[i3] = valueOf.floatValue();
                        }
                    }
                }
                return 0;
            } catch (Throwable unused2) {
                return -5;
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.e("NPTH_ANR_ERROR", th);
            return -11;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(23:54|55|57|58|(1:60)(2:63|64)|61|4|(1:8)|9|10|11|(1:13)|14|(1:16)|17|(2:19|(1:21))|22|23|(9:25|(1:27)|28|(1:30)|31|32|(2:35|33)|36|37)|40|(2:42|(1:44))|45|(2:47|48)(1:50))|3|4|(2:6|8)|9|10|11|(0)|14|(0)|17|(0)|22|23|(0)|40|(0)|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0084, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0085, code lost:
    
        com.bytedance.android.input.k.b.a.W(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0042, B:13:0x0049, B:14:0x004d, B:16:0x0051, B:17:0x0055, B:19:0x005a, B:21:0x0065, B:22:0x0072), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0042, B:13:0x0049, B:14:0x004d, B:16:0x0051, B:17:0x0055, B:19:0x005a, B:21:0x0065, B:22:0x0072), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0042, B:13:0x0049, B:14:0x004d, B:16:0x0051, B:17:0x0055, B:19:0x005a, B:21:0x0065, B:22:0x0072), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m(@androidx.annotation.NonNull org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.L.g.m(org.json.JSONObject):void");
    }

    public void n(@NonNull JSONObject jSONObject) {
        try {
            jSONObject.put("anr_tag", this.f4415g);
            jSONObject.put("anr_reason", this.f4414f);
            jSONObject.put("is_current_process", this.b);
            jSONObject.put("input_timeout_type", h());
            if (TextUtils.isEmpty(this.a) || this.a.equals("silent anr no anr info")) {
                jSONObject.put("has_anrinfo", "false");
            } else {
                jSONObject.put("has_anrinfo", "true");
            }
            a aVar = this.k;
            jSONObject.put("anr_has_ago", String.valueOf(aVar != null && aVar.i));
            jSONObject.put("success_end_anrinfo", String.valueOf(this.k != null));
            jSONObject.put("anr_cpu_load_1", b(this.j[0]));
            jSONObject.put("anr_cpu_load_5", b(this.j[1]));
            jSONObject.put("anr_cpu_load_15", b(this.j[2]));
            a aVar2 = this.k;
            if (aVar2 != null) {
                jSONObject.put("anr_cpu_total", b((float) aVar2.k));
                jSONObject.put("anr_cpu_user", b((float) this.k.l));
                jSONObject.put("anr_cpu_kernel", b((float) this.k.m));
                jSONObject.put("anr_cpu_iowait", b((float) this.k.n));
                c f2 = f(this.k);
                if (f2 != null) {
                    jSONObject.put("anr_app_cpu_total", b((float) f2.b));
                    jSONObject.put("anr_app_cpu_user", b((float) f2.f4421c));
                    jSONObject.put("anr_app_cpu_kernel", b((float) f2.f4422d));
                    jSONObject.put("anr_faults_minor", d(f2.f4423e));
                    jSONObject.put("anr_faults_major", d(f2.f4424f));
                }
                c i = i(this.k);
                if (i != null) {
                    jSONObject.put("anr_top_cpu_process", i.a);
                    return;
                }
                return;
            }
            if (this.l != null) {
                jSONObject.put("anr_cpu_total", b((float) aVar2.k));
                jSONObject.put("anr_cpu_user", b((float) this.k.l));
                jSONObject.put("anr_cpu_kernel", b((float) this.k.m));
                jSONObject.put("anr_cpu_iowait", b((float) this.k.n));
                c f3 = f(this.l);
                if (f3 != null) {
                    jSONObject.put("anr_app_cpu_total", b((float) f3.b));
                    jSONObject.put("anr_app_cpu_user", b((float) f3.f4421c));
                    jSONObject.put("anr_app_cpu_kernel", b((float) f3.f4422d));
                    jSONObject.put("anr_faults_minor", d(f3.f4423e));
                    jSONObject.put("anr_faults_major", d(f3.f4424f));
                }
                c i2 = i(this.k);
                if (i2 != null) {
                    jSONObject.put("anr_top_cpu_process", i2.a);
                }
            }
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.W(th);
        }
    }

    void o(JSONObject jSONObject) {
        String str;
        int indexOf;
        int i = this.h;
        while (i < this.i && (indexOf = this.a.indexOf("\n", i)) >= 0) {
            if (this.a.startsWith("Load: ", i)) {
                str = this.a.substring(i + 6, indexOf);
                break;
            }
            i = indexOf + 1;
        }
        str = null;
        if (str != null) {
            String[] split = str.split(" / ");
            if (split.length == 3) {
                try {
                    double parseDouble = Double.parseDouble(split[0].trim());
                    double parseDouble2 = Double.parseDouble(split[1].trim());
                    double parseDouble3 = Double.parseDouble(split[2].trim());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(parseDouble);
                    jSONArray.put(parseDouble2);
                    jSONArray.put(parseDouble3);
                    jSONObject.put("load", jSONArray);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public g(File file) {
        String str;
        String str2;
        String trim;
        this.j = new float[]{-1.0f, -1.0f, -1.0f};
        String h = e.a.a.a.a.h(file, "anr_info.txt");
        if (h != null && !h.isEmpty()) {
            String str3 = "unknown";
            if (h.equals("silent anr no anr info")) {
                this.f4414f = "silent anr";
            } else if (h.equals("close anr_info report")) {
                this.f4414f = "Not report anrInfo";
            } else {
                int l = l(h);
                if (l < 0) {
                    com.bytedance.android.input.k.b.a.D("NPTH", "Anr Info Parse Error:" + l);
                }
                if (TextUtils.isEmpty(this.f4413e) || "null".equals(this.f4413e)) {
                    str = "unknown";
                } else if (this.f4413e.startsWith("ANR ")) {
                    str = "Input dispatching timed out";
                    if (this.f4413e.startsWith("Input dispatching timed out", 4)) {
                        String str4 = this.f4413e;
                        if (str4.contains("Waiting to send non-key event") && str4.contains("finished processing certain input events that were delivered")) {
                            str = "Input dispatching timed out (Waiting to send non-key event because the touched window has not finished processing certain input events that were delivered to it over xxms ago.  Wait queue length: xx.  Wait queue head age: xxms.)";
                        } else if (str4.contains("Application does not have a focused window")) {
                            str = "Input dispatching timed out (Application does not have a focused window)";
                        } else if (str4.contains("Waiting because no window has focus but there is a focused")) {
                            str = "Input dispatching timed out (Waiting because no window has focus but there is a focused application that may eventually add a window when it finishes starting up.)";
                        } else if (str4.contains("window's input channel is full.")) {
                            str = "Input dispatching timed out (Waiting because the touched window input channel is full.Outbound queue length: XXX.Wait queue length: XX.)";
                        }
                    } else if (this.f4413e.startsWith("executing service", 4)) {
                        str = "executing service";
                    } else if (this.f4413e.startsWith("Broadcast of Intent", 4)) {
                        str = "Broadcast of Intent";
                    } else {
                        str = "keyDispatchingTimedOut";
                        if (!this.f4413e.startsWith("keyDispatchingTimedOut", 4)) {
                            str = "not then call Service.startForeground";
                            if (!this.f4413e.contains("not then call Service.startForeground")) {
                                str = this.f4413e.substring(4);
                            }
                        }
                    }
                } else {
                    str = this.f4413e;
                }
                this.f4414f = str;
            }
            if (!TextUtils.isEmpty(this.f4415g) && !"null".equals(this.f4415g)) {
                str2 = this.f4415g;
            } else {
                if (!TextUtils.isEmpty(this.f4413e) && !"null".equals(this.f4413e)) {
                    if (this.f4413e.contains("executing service")) {
                        String str5 = this.f4413e;
                        trim = str5.substring(str5.indexOf("service ") + 8).trim();
                        String[] split = trim.split("/");
                        if (split.length > 1) {
                            trim = split[split.length - 1];
                        }
                    } else if (this.f4413e.contains("Broadcast of Intent")) {
                        String str6 = this.f4413e;
                        trim = str6.substring(str6.indexOf("{") + 1, this.f4413e.indexOf("}")).trim();
                        String[] split2 = trim.split("/");
                        if (split2.length > 1) {
                            trim = split2[split2.length - 1];
                        }
                    }
                    str3 = trim;
                }
                str2 = str3;
            }
            this.f4415g = str2;
        }
        this.a = h;
        this.b = !e.a.a.a.a.Q0(file, "from_external_flag");
    }
}
