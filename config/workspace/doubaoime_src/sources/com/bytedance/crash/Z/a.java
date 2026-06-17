package com.bytedance.crash.Z;

import android.app.ApplicationExitInfo;
import android.icu.text.SimpleDateFormat;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private String a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private int f4530c;

    /* renamed from: d, reason: collision with root package name */
    private String f4531d;

    /* renamed from: e, reason: collision with root package name */
    private int f4532e;

    /* renamed from: f, reason: collision with root package name */
    private int f4533f;

    /* renamed from: g, reason: collision with root package name */
    private String f4534g;
    private String h;
    private String i;
    private long j;
    private long k;
    private String l;

    public static a b(ApplicationExitInfo applicationExitInfo) {
        String str;
        a aVar = new a();
        aVar.a = applicationExitInfo.getProcessName();
        aVar.b = applicationExitInfo.getTimestamp();
        aVar.f4530c = applicationExitInfo.getPid();
        aVar.f4533f = applicationExitInfo.getImportance();
        int reason = applicationExitInfo.getReason();
        int i = c.f4536d;
        switch (reason) {
            case 1:
                str = "EXIT_SELF";
                break;
            case 2:
                str = "SIGNALED";
                break;
            case 3:
                str = "LOW_MEMORY";
                break;
            case 4:
                str = "APP CRASH(EXCEPTION)";
                break;
            case 5:
                str = "APP CRASH(NATIVE)";
                break;
            case 6:
                str = "ANR";
                break;
            case 7:
                str = "INITIALIZATION FAILURE";
                break;
            case 8:
                str = "PERMISSION CHANGE";
                break;
            case 9:
                str = "EXCESSIVE RESOURCE USAGE";
                break;
            case 10:
                str = "USER REQUESTED";
                break;
            case 11:
                str = "USER STOPPED";
                break;
            case 12:
                str = "DEPENDENCY DIED";
                break;
            case 13:
                str = "OTHER KILLS BY SYSTEM";
                break;
            case 14:
                str = "FREEZER";
                break;
            default:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
        }
        aVar.f4531d = str;
        aVar.f4532e = applicationExitInfo.getStatus();
        aVar.j = applicationExitInfo.getPss();
        aVar.k = applicationExitInfo.getRss();
        aVar.f4534g = (applicationExitInfo.getPss() / DownloadConstants.KB) + "M";
        aVar.h = (applicationExitInfo.getRss() / DownloadConstants.KB) + "M";
        aVar.i = applicationExitInfo.getDescription();
        try {
            aVar.l = c.d(((Integer) f.a(applicationExitInfo, "getSubReason", new Object[0])).intValue());
        } catch (Throwable unused) {
            aVar.l = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        return aVar;
    }

    public void a(JSONObject jSONObject, Map<String, String> map) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            if (com.bytedance.android.input.k.b.a.f0(jSONObject2)) {
                return;
            }
            jSONObject.put("filters", jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public String c() {
        return this.i;
    }

    public int d() {
        return this.f4533f;
    }

    public String e(long j) {
        StringBuilder sb = new StringBuilder();
        e.a.a.a.a.K0(sb, this.f4531d, "\n", "pid:");
        sb.append(this.f4530c);
        sb.append(" process:");
        sb.append(this.a);
        sb.append(" alive_time:");
        sb.append(this.b - j);
        sb.append(" last_alive_time:");
        sb.append(this.b - j);
        sb.append("\n");
        sb.append("#exitInfo\n");
        sb.append(new SimpleDateFormat().format(new Date(this.b)));
        sb.append("\n");
        sb.append("importance=");
        sb.append(this.f4533f);
        sb.append("\n");
        sb.append("sub_reason=");
        e.a.a.a.a.K0(sb, this.l, "\n", "status=");
        sb.append(this.f4532e);
        sb.append("\n");
        sb.append("description=");
        e.a.a.a.a.K0(sb, this.i, "\n", "pss=");
        e.a.a.a.a.K0(sb, this.f4534g, "\n", "reason=");
        e.a.a.a.a.K0(sb, this.f4531d, "\n", "process=");
        e.a.a.a.a.K0(sb, this.a, "\n", "rss=");
        return e.a.a.a.a.J(sb, this.h, "\n");
    }

    public int f() {
        return this.f4530c;
    }

    public String g() {
        return this.a;
    }

    public long h() {
        return this.j;
    }

    public long i() {
        return this.k;
    }

    public String j() {
        return this.f4531d;
    }

    public int k() {
        return this.f4532e;
    }

    public String l() {
        return this.l;
    }

    public long m() {
        return this.b;
    }

    public JSONObject n(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("exit_status", String.valueOf(this.f4532e));
        hashMap.put("exit_pss", c.c(this.j));
        hashMap.put("exit_rss", c.c(this.k));
        hashMap.put("has_exit_info", "true");
        hashMap.put("exit_reason", this.f4531d);
        hashMap.put("exit_sub_reason", this.l);
        Map<String, String> hashMap2 = new HashMap<>(hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_type", "exception");
            jSONObject.put("crash_time", this.b);
            jSONObject.put("log_type", "PROCESS_DIED");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("message", "PROCESS_DIED");
            jSONObject.put("crash_thread_name", "UNKNOW");
            jSONObject.put("crash_md5", com.bytedance.android.input.k.b.a.N(str));
            jSONObject.put("process_name", this.a);
            jSONObject.put("app_start_time", j);
            jSONObject.put("exception_type", 1);
            jSONObject.put("pid", this.f4530c);
            jSONObject.put("class_ref", "Native");
            jSONObject.put("method", "Native");
            jSONObject.put("is_core", 1);
            jSONObject.put("line_num", -1);
            jSONObject.put("ensure_type", "EnsureNotReachHere");
            jSONObject.put("stack", str);
            jSONObject.put("has_dump", "true");
            jSONObject.put("java_data", "DiedProcess.unknownReason: App was killed, please see logcat.\n");
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                if (!com.bytedance.android.input.k.b.a.f0(jSONObject2)) {
                    jSONObject.put(MonitorConstants.CUSTOM, jSONObject2);
                }
            } catch (Throwable unused) {
            }
            a(jSONObject, hashMap2);
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AppExitInfo{mProcessName='");
        e.a.a.a.a.G0(M, this.a, '\'', ", mTimestamp=");
        M.append(this.b);
        M.append(", mPid=");
        M.append(this.f4530c);
        M.append(", mReason='");
        e.a.a.a.a.G0(M, this.f4531d, '\'', ", mStatus=");
        M.append(this.f4532e);
        M.append(", mImportance=");
        M.append(this.f4533f);
        M.append(", mPss='");
        e.a.a.a.a.G0(M, this.f4534g, '\'', ", mRss='");
        e.a.a.a.a.G0(M, this.h, '\'', ", mDescription='");
        e.a.a.a.a.G0(M, this.i, '\'', ", mRealPss=");
        M.append(this.j);
        M.append(", mRealRss=");
        M.append(this.k);
        M.append(", subReason='");
        return e.a.a.a.a.H(M, this.l, '\'', '}');
    }
}
