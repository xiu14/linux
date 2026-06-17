package com.bytedance.push.settings.u;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class d extends com.bytedance.common.push.c {

    @SerializedName("enable_push_launch_monitor")
    public boolean a;

    @SerializedName("enable_message_show_monitor")
    public boolean b;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("enable_real_badge_set_monitor")
    public boolean f5851d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("enable_dau_monitor")
    public boolean f5852e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("enable_network_request_monitor")
    public boolean f5853f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("enable_content_show_monitor")
    public boolean f5854g;

    @SerializedName("enable_content_request_monitor")
    public boolean h;

    @SerializedName("enable_keep_alive_from_monitor")
    public boolean i;

    @SerializedName("enable_transmit_strategy_request_monitor")
    public boolean j;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("enable_badge_apply_monitor")
    public boolean f5850c = false;

    @SerializedName("depths_process_start_monitor_model")
    public a k = new a();
}
