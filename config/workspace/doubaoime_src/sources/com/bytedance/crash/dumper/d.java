package com.bytedance.crash.dumper;

import java.io.File;
import java.io.FilenameFilter;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class d implements FilenameFilter {
    final /* synthetic */ JSONObject a;

    d(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        try {
            if (!str.contains("evil_trace")) {
                return false;
            }
            this.a.put("has_evil_trace_file", String.valueOf(true));
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
