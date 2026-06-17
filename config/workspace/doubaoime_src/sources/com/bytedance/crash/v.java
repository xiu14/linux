package com.bytedance.crash;

import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface v {
    @Nullable
    Map<? extends String, ? extends String> a(CrashType crashType, JSONObject jSONObject);
}
