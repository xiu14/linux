package com.bytedance.push.settings.x.a;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    @SerializedName("is_valid_settings")
    public boolean a = false;

    @SerializedName("toast_dialog_interval")
    public int b = 30000;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("business_custom_sys_dialog_config_map")
    public Map<String, Object> f5869c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("custom_dialog_rs_config")
    public com.bytedance.push.N.a f5870d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("support_dark_mode")
    public boolean f5871e;
}
