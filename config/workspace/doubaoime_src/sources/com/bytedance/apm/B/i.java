package com.bytedance.apm.B;

import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i extends a {
    private static final int h = Runtime.getRuntime().availableProcessors();
    private static boolean i = false;
    private static int j = 300;
    private static boolean k = false;
    private static boolean l = false;

    /* renamed from: g, reason: collision with root package name */
    private long f3258g = 600000;

    public i() {
        this.f3229e = "thread";
    }

    static JSONObject n(String str, int i2, int i3, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                jSONObject.put("total_thread_count", i2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        jSONObject.put("java_thread_count", i3);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("scene", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("thread_detail", str2);
        }
        jSONObject.put("is_main_process", com.bytedance.apm.g.F());
        jSONObject.put("cpu_count", h);
        jSONObject.put("process_name", com.bytedance.apm.g.i());
        return jSONObject;
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        k = jSONObject.optInt("enable_thread_collect", 0) == 1;
        l = jSONObject.optInt("enable_upload", 0) == 1;
        j = jSONObject.optInt("thread_count_threshold", 300);
        this.f3258g = jSONObject.optLong("collect_interval", 10L) * com.heytap.mcssdk.constant.a.f6886d;
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return true;
    }

    @Override // com.bytedance.apm.B.a
    protected void g() {
        int i2;
        if (k && l && System.currentTimeMillis() - com.bytedance.apm.g.s() > 1200000) {
            try {
                i2 = new File("/proc/self/task/").list().length;
            } catch (Throwable unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                return;
            }
            ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            int[] iArr = {threadGroup.activeCount()};
            com.bytedance.apm.F.b.e().h(new h(false, iArr, null, i2, threadGroup));
            int i3 = iArr[0];
        }
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return this.f3258g;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.slardar.config.a
    public void onReady() {
        super.onReady();
        i = true;
    }
}
