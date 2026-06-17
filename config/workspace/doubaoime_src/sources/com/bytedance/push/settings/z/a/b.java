package com.bytedance.push.settings.z.a;

import com.bytedance.common.wschannel.WsConstants;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class b {

    @SerializedName("opt_push_click_session_id")
    public boolean a = false;

    @SerializedName("min_delay_time_in_mill")
    public long b = WsConstants.EXIT_DELAY_TIME;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("max_delay_time_in_mill")
    public long f5872c = com.heytap.mcssdk.constant.a.q;
}
