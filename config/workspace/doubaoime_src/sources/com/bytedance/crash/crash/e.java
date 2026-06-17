package com.bytedance.crash.crash;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends CrashSummary {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4579c = CrashType.JAVA + ".summary";

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f4580d = Pattern.compile("^start_time=(\\d+)\\nstart_up_time=(\\d+)\\ncrash_time=(\\d+)\\nprocess_name=(.*)\\nthread_name=(.*)\\npid=(\\d+)\\ntid=(\\d+)\\noom=(\\d+)\\nlaunch=(\\d+)\\nthrowable=(.*)");
    private final String a;
    private final boolean b;

    private e(File file, long j, long j2, long j3, String str, String str2, int i, int i2, boolean z, String str3, boolean z2) {
        super(file, z2 ? CrashType.LAUNCH : CrashType.JAVA, j, j2, j3, str, str2, i, i2);
        this.a = str3;
        this.b = z;
        String h = e.a.a.a.a.h(this.mDirectory, "throwable.txt");
        if (TextUtils.isEmpty(h)) {
            h = e.a.a.a.a.J(e.a.a.a.a.S(str3, "\n\tat InvalidStack.NoStackAvailable: "), z ? "Is OOM" : "Not OOM", " (SourceFile.java:-1).\n");
        }
        this.mStackTrace = h;
    }

    @Nullable
    public static e a(File file) {
        String C0;
        if (!file.getName().equals(f4579c) || (C0 = com.bytedance.android.input.k.b.a.C0(file)) == null) {
            return null;
        }
        try {
            Matcher matcher = f4580d.matcher(C0);
            if (matcher.find() && matcher.groupCount() == 10) {
                String group = matcher.group(10);
                if (!TextUtils.isEmpty(group)) {
                    return new e(file.getParentFile(), Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), matcher.group(4), matcher.group(5), Integer.parseInt(matcher.group(6)), Integer.parseInt(matcher.group(7)), Integer.parseInt(matcher.group(8)) != 0, group, Integer.parseInt(matcher.group(9)) != 0);
                }
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.e("NPTH_JAVA_SUMMARY", th);
        }
        return null;
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    protected void appendSpecialFilter(JSONObject jSONObject) {
        CrashType crashType = this.mCrashType;
        CrashType crashType2 = CrashType.LAUNCH;
        if (crashType == crashType2) {
            jSONObject = getOriginalBody(jSONObject);
        }
        JSONObject J2 = com.bytedance.android.input.k.b.a.J(jSONObject, "filters");
        if (new File(this.mDirectory, "ignore").exists()) {
            com.bytedance.android.input.k.b.a.y0(J2, "has_ignore", String.valueOf(true));
        }
        CrashType crashType3 = this.mCrashType;
        if (crashType3 == crashType2 || crashType3 == CrashType.JAVA) {
            String str = this.mStackTrace;
            String str2 = null;
            if (str != null) {
                try {
                    if (!str.isEmpty()) {
                        String[] split = str.split("\n", 2);
                        if (split.length != 0) {
                            int indexOf = split[0].indexOf(58);
                            if (indexOf == -1) {
                                indexOf = split[0].indexOf(65306);
                            }
                            str2 = indexOf != -1 ? split[0].substring(0, indexOf).trim() : split[0].trim();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (str2 != null) {
                com.bytedance.android.input.k.b.a.y0(J2, "java_reason", str2);
            }
        }
        com.bytedance.android.input.k.b.a.y0(J2, "from_custom", Boolean.FALSE);
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    protected void assemblySpecialCrashBody(com.bytedance.crash.entity.a aVar, Header header) {
        com.bytedance.crash.dumper.a.w(aVar.c(), this.mDirectory, false);
        aVar.d("isOOM", Boolean.valueOf(this.b));
        aVar.d("launch_did", com.bytedance.crash.general.a.f());
        if (this.mCrashType != CrashType.LAUNCH) {
            aVar.d("isJava", 1);
            return;
        }
        aVar.d(CrashHianalyticsData.CRASH_TYPE, "java");
        aVar.d("event_type", "start_crash");
        aVar.d("stack", String.valueOf(aVar.c().remove(RemoteMessageConst.DATA)));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RemoteMessageConst.DATA, new JSONArray().put(aVar.c()));
            aVar.f(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public JSONObject getOriginalBody(JSONObject jSONObject) {
        JSONArray optJSONArray;
        return (this.mCrashType != CrashType.LAUNCH || (optJSONArray = jSONObject.optJSONArray(RemoteMessageConst.DATA)) == null || optJSONArray.length() <= 0) ? jSONObject : optJSONArray.optJSONObject(0);
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    @NonNull
    protected String loadStackTrace() {
        String h = e.a.a.a.a.h(this.mDirectory, "throwable.txt");
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n\tat InvalidStack.NoStackAvailable: ");
        return e.a.a.a.a.J(sb, this.b ? "Is OOM" : "Not OOM", " (SourceFile.java:-1).\n");
    }
}
