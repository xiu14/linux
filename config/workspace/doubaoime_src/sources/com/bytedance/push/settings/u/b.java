package com.bytedance.push.settings.u;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    @SerializedName("enable_illegal_notification_monitor")
    public boolean a = false;

    @SerializedName("enable_illegal_notification_hook")
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("enable_illegal_notification_intercept")
    public boolean f5845c = false;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("enable_illegal_notification_debug")
    public boolean f5846d = false;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("illegal_notification_report_extra")
    public boolean f5847e = true;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("illegal_notification_intercept_all")
    public boolean f5848f = false;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("illegal_notification_public_key")
    public String f5849g = "";

    @SerializedName("illegal_notification_check_interval")
    public Long h = Long.valueOf(com.heytap.mcssdk.constant.a.q);

    @SerializedName("illegal_notification_referrer_list")
    public List<String> i = Collections.emptyList();

    @SerializedName("illegal_notification_extra_intercept_white_list")
    public List<String> j = Collections.emptyList();

    @SerializedName("illegal_notification_intercept_white_list")
    public List<String> k = Collections.emptyList();

    @SerializedName("illegal_notification_intercept_black_list")
    public List<String> l = Collections.emptyList();
}
