package com.bytedance.push.settings.A.a;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {

    @SerializedName("signal_name")
    public String a;

    @SerializedName("signal_type")
    public int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("report_interval")
    public long f5796c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("signal_scene")
    public List<String> f5797d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("extra_config")
    public Map<String, String> f5798e = new HashMap();

    public String toString() {
        return com.bytedance.push.g0.d.b(this);
    }
}
