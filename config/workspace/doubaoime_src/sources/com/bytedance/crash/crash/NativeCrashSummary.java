package com.bytedance.crash.crash;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class NativeCrashSummary extends CrashSummary {
    public static final String FILE_NAME = CrashType.NATIVE + ".summary";
    private final String mSigLine;
    private final int mStartPid;

    NativeCrashSummary(String str, long j, long j2, long j3, String str2, String str3, int i, int i2, int i3, String str4) {
        super(new File(str).getParentFile(), CrashType.NATIVE, j, j2, j3, str2, str3, i, i2);
        this.mStartPid = i3;
        this.mSigLine = str4;
        this.mStackTrace = loadStackTrace();
    }

    @Nullable
    public static NativeCrashSummary load(File file) {
        if (file.getName().equals(FILE_NAME)) {
            return NativeBridge.I(file.getAbsolutePath());
        }
        return null;
    }

    private static String parseSignalType(String str) {
        try {
            Matcher matcher = Pattern.compile("\\(([A-Z_]+)\\)").matcher(str);
            ArrayList arrayList = new ArrayList(2);
            while (matcher.find() && arrayList.size() < 2) {
                arrayList.add(matcher.group(1));
            }
            return String.join(BundleUtil.UNDERLINE_TAG, arrayList);
        } catch (Throwable unused) {
            return "SIG_PARSE_ERR";
        }
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    protected void appendSpecialFilter(JSONObject jSONObject) {
        String parseSignalType;
        JSONObject J2 = com.bytedance.android.input.k.b.a.J(jSONObject, "filters");
        com.bytedance.android.input.k.b.a.d(J2, "coredump_send_cfg_valid", Boolean.valueOf(new File(new File(C0652g.k(), "configs"), l.f() + ".config").exists()));
        String valueOf = String.valueOf(jSONObject.opt("java_data") != null);
        if (valueOf != null) {
            try {
                J2.put("has_java_stack", valueOf);
            } catch (JSONException unused) {
            }
        }
        String str = this.mSigLine;
        if (str != null && (parseSignalType = parseSignalType(str)) != null) {
            try {
                J2.put("native_reason", parseSignalType);
            } catch (JSONException unused2) {
            }
        }
        com.bytedance.android.input.k.b.a.y0(J2, "fork_crash", String.valueOf(this.mStartPid != this.mPid));
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    protected void assemblySpecialCrashBody(com.bytedance.crash.entity.a aVar, Header header) {
        String C0;
        JSONObject optJSONObject = aVar.c().optJSONObject("filters");
        aVar.d("is_root", Boolean.valueOf(optJSONObject != null && optJSONObject.optBoolean("is_root")));
        aVar.d("start_pid", Integer.valueOf(this.mStartPid));
        com.bytedance.crash.dumper.a.w(aVar.c(), this.mDirectory, true);
        aVar.d("is_native_crash", 1);
        if (com.bytedance.crash.O.b.b() != null) {
            aVar.d("coredump_ver", Integer.valueOf(com.bytedance.crash.O.b.f() ? 1 : 0));
            aVar.d("core_dump_uuid", com.bytedance.crash.O.b.b());
        }
        JSONObject c2 = aVar.c();
        File file = this.mDirectory;
        File file2 = new File(file, "jstack.txt");
        File file3 = new File(file, "abort.txt");
        String C02 = file2.exists() ? com.bytedance.android.input.k.b.a.C0(file2) : null;
        if (file3.exists() && (C0 = com.bytedance.android.input.k.b.a.C0(file3)) != null && C0.startsWith("[FATAL:") && C0.contains("Please include Java exception stack in crash report ttwebview:")) {
            StringBuilder M = e.a.a.a.a.M(C02);
            int indexOf = C0.indexOf(" ttwebview:");
            M.append("Caused by: ");
            M.append("Please include Java exception stack in crash report");
            M.append("\n");
            M.append(C0.substring(indexOf + 11));
            C02 = M.toString();
        }
        if (!TextUtils.isEmpty(C02)) {
            com.bytedance.android.input.k.b.a.y0(c2, "java_data", C02);
        }
        JSONObject c3 = aVar.c();
        File file4 = new File(this.mDirectory, "game_script_stack.txt");
        if (file4.exists()) {
            String C03 = com.bytedance.android.input.k.b.a.C0(file4);
            if (TextUtils.isEmpty(C03)) {
                return;
            }
            com.bytedance.android.input.k.b.a.y0(c3, "game_script_stack", C03);
        }
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    @NonNull
    protected String loadStackTrace() {
        return e.a.a.a.a.J(new StringBuilder(), this.mSigLine, NativeBridge.H(this.mDirectory.getAbsolutePath()));
    }
}
