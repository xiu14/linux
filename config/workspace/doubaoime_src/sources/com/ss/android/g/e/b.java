package com.ss.android.g.e;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface b extends com.ss.android.ug.bus.a {
    boolean b();

    Map<String, String> n();

    void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

    void onEventV3(String str, JSONObject jSONObject);
}
