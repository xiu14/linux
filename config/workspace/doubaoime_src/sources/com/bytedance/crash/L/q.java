package com.bytedance.crash.L;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.C0653h;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.L.m;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.entity.Header;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q extends CrashSummary {

    /* renamed from: f, reason: collision with root package name */
    public static final String f4432f = CrashType.ANR + ".summary";

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f4433g = Pattern.compile("^start_time=(\\d+)\\nstart_up_time=(\\d+)\\ncrash_time=(\\d+)\\nprocess_name=(.*)\\npid=(\\d+)\\nby_signal=(.*)");
    private final boolean a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private final r f4434c;

    /* renamed from: d, reason: collision with root package name */
    private g f4435d;

    /* renamed from: e, reason: collision with root package name */
    private m.b f4436e;

    protected q(File file, long j, long j2, long j3, String str, int i, boolean z) {
        super(file, CrashType.ANR, j, j2, j3, str, PullConfiguration.PROCESS_NAME_MAIN, i, i);
        this.a = z;
        r rVar = new r(file, i);
        this.f4434c = rVar;
        JSONObject jSONObject = new JSONObject();
        String a = rVar.a();
        this.b = a;
        if (TextUtils.isEmpty(a)) {
            this.b = e.a.a.a.a.h(this.mDirectory, "main_stack.txt");
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = "at InvalidStack.NoStackAvailable(Invalid.java:1).\n";
        }
        try {
            jSONObject.put("mainStackFromTrace", this.b);
            jSONObject.put("invalid", this.b == "at InvalidStack.NoStackAvailable(Invalid.java:1).\n");
            jSONObject.put("is_new_stack", 10);
        } catch (JSONException unused) {
        }
        this.mStackTrace = jSONObject.toString();
    }

    private void a(@NonNull JSONObject jSONObject) {
        String optString = jSONObject.optString(RemoteMessageConst.DATA);
        if (!TextUtils.isEmpty(optString) && optString.startsWith("{\"mainStackFromTrace\":\"\\\"main\\\"")) {
            String h = e.a.a.a.a.h(this.mDirectory, "main_stack.txt");
            if (TextUtils.isEmpty(h)) {
                return;
            }
            String[] split = h.split("\n");
            JSONArray jSONArray = new JSONArray();
            for (String str : split) {
                jSONArray.put(str);
            }
            com.bytedance.android.input.k.b.a.b(jSONObject, "main_stack_2nd", jSONArray);
        }
    }

    static void b(File file, long j, boolean z) {
        com.bytedance.crash.dumper.j.i iVar = new com.bytedance.crash.dumper.j.i(file + "/" + f4432f);
        String i = com.bytedance.crash.util.a.i();
        long b = C0652g.b();
        long c2 = C0652g.c();
        int myPid = Process.myPid();
        iVar.d("start_time=");
        iVar.c(b);
        iVar.a('\n');
        iVar.d("start_up_time=");
        iVar.c(c2);
        iVar.a('\n');
        iVar.d("crash_time=");
        iVar.c(j);
        iVar.a('\n');
        iVar.d("process_name=");
        iVar.d(i);
        iVar.a('\n');
        iVar.d("pid=");
        iVar.b(myPid);
        iVar.a('\n');
        iVar.d("by_signal=");
        iVar.f(z);
        iVar.a('\n');
        iVar.h();
    }

    @Nullable
    static q c(File file) {
        File file2 = new File(file, f4432f);
        String C0 = com.bytedance.android.input.k.b.a.C0(file2);
        if (!TextUtils.isEmpty(C0)) {
            try {
                Matcher matcher = f4433g.matcher(C0);
                if (matcher.find() && matcher.groupCount() == 6) {
                    return new q(file2.getParentFile(), Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), matcher.group(4), Integer.parseInt(matcher.group(5)), Boolean.parseBoolean(matcher.group(6)));
                }
            } catch (Throwable th) {
                com.bytedance.crash.Q.b.e("NPTH_ANR_ERROR_LOAD", th);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147 A[Catch: all -> 0x0157, TryCatch #1 {all -> 0x0157, blocks: (B:58:0x013d, B:60:0x0147, B:61:0x014a, B:63:0x0154), top: B:57:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #1 {all -> 0x0157, blocks: (B:58:0x013d, B:60:0x0147, B:61:0x014a, B:63:0x0154), top: B:57:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.crash.crash.CrashSummary
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void appendSpecialFilter(org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.L.q.appendSpecialFilter(org.json.JSONObject):void");
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    protected void assemblySpecialCrashBody(com.bytedance.crash.entity.a aVar, Header header) {
        try {
            aVar.d("is_anr", 1);
            this.f4434c.j(aVar.c());
            g gVar = new g(this.mDirectory);
            this.f4435d = gVar;
            gVar.m(aVar.c());
            com.bytedance.crash.U.a.b(aVar.c());
            com.bytedance.crash.dumper.a.u(aVar.c());
            m.b bVar = new m.b(this.mDirectory, aVar.c(), this.f4434c, this.f4435d);
            this.f4436e = bVar;
            bVar.i(aVar.c(), this.mDirectory);
            a(aVar.c());
            com.bytedance.android.input.k.b.a.u0(aVar.c());
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
        }
        if (!this.f4435d.k() || this.b == "at InvalidStack.NoStackAvailable(Invalid.java:1).\n") {
            com.bytedance.android.input.k.b.a.y0(header.e(), WsConstants.KEY_APP_ID, 2010);
            return;
        }
        if (C0653h.b()) {
            String optString = aVar.c().optString("exit_reason");
            if (TextUtils.isEmpty(optString) || optString.contains("6")) {
                return;
            }
            com.bytedance.android.input.k.b.a.y0(header.e(), WsConstants.KEY_APP_ID, 2010);
        }
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    protected void loadCrashInfo(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        com.bytedance.crash.dumper.e c2;
        com.bytedance.crash.dumper.a.t(jSONObject, file);
        com.bytedance.crash.U.c.e(jSONObject, file);
        if (file != null) {
            com.bytedance.crash.W.a.d(jSONObject, file.getParentFile());
        }
        com.bytedance.android.input.k.b.a.x0(jSONObject, file);
        com.bytedance.crash.dumper.a.s(jSONObject, file);
        com.bytedance.crash.a0.a.B(jSONObject, file);
        Scraps.pushTo(jSONObject, file);
        String C0 = com.bytedance.android.input.k.b.a.C0(new File(file, "custom.json"));
        if (C0 != null) {
            try {
                com.bytedance.android.input.k.b.a.j(jSONObject, new JSONObject(C0));
            } catch (Throwable unused) {
            }
        }
        com.bytedance.crash.monitor.a e2 = com.bytedance.crash.monitor.l.e();
        if (e2 == null || (c2 = e2.c()) == null) {
            return;
        }
        c2.d(jSONObject, jSONObject2, file);
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    @NonNull
    protected String loadStackTrace() {
        JSONObject jSONObject = new JSONObject();
        String a = this.f4434c.a();
        this.b = a;
        if (TextUtils.isEmpty(a)) {
            this.b = e.a.a.a.a.h(this.mDirectory, "main_stack.txt");
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = "at InvalidStack.NoStackAvailable(Invalid.java:1).\n";
        }
        try {
            jSONObject.put("mainStackFromTrace", this.b);
            jSONObject.put("invalid", this.b == "at InvalidStack.NoStackAvailable(Invalid.java:1).\n");
            jSONObject.put("is_new_stack", 10);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public boolean upload(@NonNull com.bytedance.crash.monitor.a aVar, JSONObject jSONObject) {
        boolean upload = super.upload(aVar, jSONObject);
        if (!C0653h.a() && !upload) {
            com.bytedance.android.input.k.b.a.s(this.mDirectory);
        }
        return upload;
    }
}
