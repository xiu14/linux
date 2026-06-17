package com.bytedance.push.settings.C;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    @SerializedName("enable_token_retry")
    public boolean a = true;

    @SerializedName("token_register_timeout_in_second")
    public long b = 60;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("need_retry_channel")
    public List<Integer> f5799c = Arrays.asList(1, 7, 10, 11, 22);

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("retry_after_network_changed")
    public boolean f5800d = true;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("max_loop_retry_times")
    public int f5801e = -1;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("loop_retry_interval_in_second")
    public long f5802f = 60;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("retry_after_enter_background")
    public boolean f5803g = true;

    @SerializedName("trigger_retry_event_list")
    public List<String> h = new ArrayList();
}
