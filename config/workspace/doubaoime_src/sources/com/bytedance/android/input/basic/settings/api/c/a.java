package com.bytedance.android.input.basic.settings.api.c;

import com.bytedance.common.wschannel.WsConstants;
import com.google.gson.annotations.SerializedName;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    @SerializedName(WsConstants.KEY_APP_KEY)
    private String a;

    @SerializedName("bot_id")
    private String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("finish_wait_offline_time")
    private int f2084c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("offline_wait_online_time")
    private int f2085d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("max_wait_switch_offline_time")
    private int f2086e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("switch_network_quality_threshold")
    private int f2087f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("switch_network_rtt_threshold")
    private int f2088g;

    @SerializedName("switch_network_ping_timeout")
    private int h;

    @SerializedName("offline_wait_online_interval_time")
    private int i;

    @SerializedName("retry_server_code")
    private List<Integer> j;

    @SerializedName("cell_compress_rate")
    private int k;

    @SerializedName("wait_all_asr_back_timeout")
    private long l;

    @SerializedName("wait_all_asr_back_enable")
    private boolean m;

    @SerializedName("restart_input_stop_asr_enable")
    private boolean n;

    @SerializedName("open_stop_asr_for_restart_input")
    private boolean o;

    @SerializedName("opt_asr_pre_edit_repeat")
    private boolean p;

    @SerializedName("window_shown_stop_asr_white_list")
    private List<String> q;

    @SerializedName("allow_opt_pre_edit_white_list")
    private List<String> r;

    @SerializedName("restart_input_not_stop_asr_list")
    private List<String> s;

    @SerializedName("on_update_select_stop_asr")
    private boolean t;

    @SerializedName("asr_params")
    private String u;

    @SerializedName("is_support_voice_network_optimize")
    private boolean v;

    @SerializedName("send_action_default")
    private String w;

    @SerializedName("send_action_list")
    private List<String> x;

    @SerializedName("bugfix_net_error_tip")
    private boolean y;

    @SerializedName("bugfix_hand_write_space_tips")
    private boolean z;

    public a() {
        this(null, null, 0, 0, 0, 0, 0, 0, 0, null, 0, 0L, false, false, false, false, null, null, null, false, null, false, null, null, false, false, 67108863);
    }

    public a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, int i8, long j, boolean z, boolean z2, boolean z3, boolean z4, List list2, List list3, List list4, boolean z5, String str3, boolean z6, String str4, List list5, boolean z7, boolean z8, int i9) {
        long j2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str5;
        ArrayList arrayList3;
        String str6;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList4;
        String str7 = (i9 & 1) != 0 ? "RTIHIRzbwS" : null;
        String str8 = (i9 & 2) != 0 ? "7320241109563686949" : null;
        int i14 = (i9 & 4) != 0 ? 1000 : i;
        int i15 = i9 & 8;
        int i16 = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        int i17 = i15 != 0 ? 5000 : i2;
        int i18 = (i9 & 16) != 0 ? 1000 : i3;
        int i19 = (i9 & 32) != 0 ? 4 : i4;
        int i20 = (i9 & 64) != 0 ? 273 : i5;
        int i21 = (i9 & 128) == 0 ? i6 : 1000;
        i16 = (i9 & 256) == 0 ? i7 : i16;
        List<Integer> G = (i9 & 512) != 0 ? kotlin.collections.g.G(40100000, 40100004, 50000104, 50700000) : null;
        int i22 = (i9 & 1024) != 0 ? 8 : i8;
        long j3 = (i9 & 2048) != 0 ? 1500L : j;
        boolean z9 = (i9 & 4096) != 0 ? true : z;
        boolean z10 = (i9 & 8192) != 0 ? true : z2;
        boolean z11 = (i9 & 16384) != 0 ? true : z3;
        boolean z12 = (i9 & 32768) != 0 ? false : z4;
        boolean z13 = z11;
        if ((i9 & 65536) != 0) {
            j2 = j3;
            arrayList = kotlin.collections.g.c("com.miui.notes", "cn.wps.moffice_eng", "com.baidu.tieba");
        } else {
            j2 = j3;
            arrayList = null;
        }
        ArrayList c2 = (131072 & i9) != 0 ? kotlin.collections.g.c("com.miui.notes") : null;
        ArrayList arrayList5 = (262144 & i9) != 0 ? new ArrayList() : null;
        boolean z14 = (i9 & 524288) != 0 ? false : z5;
        if ((i9 & 1048576) != 0) {
            arrayList2 = arrayList5;
            str5 = "";
        } else {
            arrayList2 = arrayList5;
            str5 = null;
        }
        boolean z15 = (i9 & 2097152) != 0 ? true : z6;
        ArrayList arrayList6 = c2;
        if ((i9 & 4194304) != 0) {
            arrayList3 = arrayList;
            str6 = "帮我发送";
        } else {
            arrayList3 = arrayList;
            str6 = null;
        }
        if ((i9 & 8388608) != 0) {
            i13 = i22;
            i11 = i16;
            i10 = i21;
            i12 = i20;
            arrayList4 = kotlin.collections.g.c("帮我发送", "我说完了", "立即发送", "发送发送", "overover");
        } else {
            i10 = i21;
            i11 = i16;
            i12 = i20;
            i13 = i22;
            arrayList4 = null;
        }
        boolean z16 = (16777216 & i9) != 0 ? true : z7;
        boolean z17 = (i9 & 33554432) != 0 ? true : z8;
        kotlin.s.c.l.f(str7, com.heytap.mcssdk.constant.b.z);
        kotlin.s.c.l.f(str8, "botId");
        kotlin.s.c.l.f(G, "retryServerCode");
        kotlin.s.c.l.f(str5, "asrParams");
        kotlin.s.c.l.f(str6, "sendActionDefault");
        kotlin.s.c.l.f(arrayList4, "sendActionList");
        this.a = str7;
        this.b = str8;
        this.f2084c = i14;
        this.f2085d = i17;
        this.f2086e = i18;
        this.f2087f = i19;
        this.f2088g = i12;
        this.h = i10;
        this.i = i11;
        this.j = G;
        this.k = i13;
        this.l = j2;
        this.m = z9;
        this.n = z10;
        this.o = z13;
        this.p = z12;
        this.q = arrayList3;
        this.r = arrayList6;
        this.s = arrayList2;
        this.t = z14;
        this.u = str5;
        this.v = z15;
        this.w = str6;
        this.x = arrayList4;
        this.y = z16;
        this.z = z17;
    }

    public final List<String> a() {
        return this.r;
    }

    public final String b() {
        return this.u;
    }

    public final boolean c() {
        return this.z;
    }

    public final boolean d() {
        return this.y;
    }

    public final int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.s.c.l.a(this.a, aVar.a) && kotlin.s.c.l.a(this.b, aVar.b) && this.f2084c == aVar.f2084c && this.f2085d == aVar.f2085d && this.f2086e == aVar.f2086e && this.f2087f == aVar.f2087f && this.f2088g == aVar.f2088g && this.h == aVar.h && this.i == aVar.i && kotlin.s.c.l.a(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && kotlin.s.c.l.a(this.q, aVar.q) && kotlin.s.c.l.a(this.r, aVar.r) && kotlin.s.c.l.a(this.s, aVar.s) && this.t == aVar.t && kotlin.s.c.l.a(this.u, aVar.u) && this.v == aVar.v && kotlin.s.c.l.a(this.w, aVar.w) && kotlin.s.c.l.a(this.x, aVar.x) && this.y == aVar.y && this.z == aVar.z;
    }

    public final int f() {
        return this.f2084c;
    }

    public final int g() {
        return this.f2086e;
    }

    public final int h() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (Long.hashCode(this.l) + e.a.a.a.a.I(this.k, (this.j.hashCode() + e.a.a.a.a.I(this.i, e.a.a.a.a.I(this.h, e.a.a.a.a.I(this.f2088g, e.a.a.a.a.I(this.f2087f, e.a.a.a.a.I(this.f2086e, e.a.a.a.a.I(this.f2085d, e.a.a.a.a.I(this.f2084c, e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31;
        boolean z = this.m;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.n;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.o;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.p;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        List<String> list = this.q;
        int hashCode2 = (i8 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.r;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.s;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        boolean z5 = this.t;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int p0 = e.a.a.a.a.p0(this.u, (hashCode4 + i9) * 31, 31);
        boolean z6 = this.v;
        int i10 = z6;
        if (z6 != 0) {
            i10 = 1;
        }
        int hashCode5 = (this.x.hashCode() + e.a.a.a.a.p0(this.w, (p0 + i10) * 31, 31)) * 31;
        boolean z7 = this.y;
        int i11 = z7;
        if (z7 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode5 + i11) * 31;
        boolean z8 = this.z;
        return i12 + (z8 ? 1 : z8 ? 1 : 0);
    }

    public final int i() {
        return this.f2085d;
    }

    public final boolean j() {
        return this.t;
    }

    public final boolean k() {
        return this.o;
    }

    public final boolean l() {
        return this.p;
    }

    public final List<String> m() {
        return this.s;
    }

    public final boolean n() {
        return this.n;
    }

    public final List<Integer> o() {
        return this.j;
    }

    public final String p() {
        return this.w;
    }

    public final List<String> q() {
        return this.x;
    }

    public final int r() {
        return this.h;
    }

    public final int s() {
        return this.f2087f;
    }

    public final int t() {
        return this.f2088g;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AsrConfig(appKey=");
        M.append(this.a);
        M.append(", botId=");
        M.append(this.b);
        M.append(", finishWaitOfflineTime=");
        M.append(this.f2084c);
        M.append(", offlineWaitOnlineTime=");
        M.append(this.f2085d);
        M.append(", maxWaitSwitchOfflineTime=");
        M.append(this.f2086e);
        M.append(", switchNetworkQualityThreshold=");
        M.append(this.f2087f);
        M.append(", switchNetworkRttThreshold=");
        M.append(this.f2088g);
        M.append(", switchNetworkPingTimeout=");
        M.append(this.h);
        M.append(", offlineWaitOnlineIntervalTime=");
        M.append(this.i);
        M.append(", retryServerCode=");
        M.append(this.j);
        M.append(", cellCompressRate=");
        M.append(this.k);
        M.append(", waitAllAsrBackTimeout=");
        M.append(this.l);
        M.append(", waitAllAsrBackEnable=");
        M.append(this.m);
        M.append(", restartInputStopAsrEnable=");
        M.append(this.n);
        M.append(", openStopAsrForRestartInput=");
        M.append(this.o);
        M.append(", optAsrPreEditRepeat=");
        M.append(this.p);
        M.append(", windowShownStopAsrWhiteList=");
        M.append(this.q);
        M.append(", allowOptPreEditWhiteList=");
        M.append(this.r);
        M.append(", restartInputNotStopAsrList=");
        M.append(this.s);
        M.append(", onUpdateSelectStopAsr=");
        M.append(this.t);
        M.append(", asrParams=");
        M.append(this.u);
        M.append(", isSupportVoiceNetworkOptimize=");
        M.append(this.v);
        M.append(", sendActionDefault=");
        M.append(this.w);
        M.append(", sendActionList=");
        M.append(this.x);
        M.append(", bugfixNetErrorTip=");
        M.append(this.y);
        M.append(", bugfixHandeWriteSpaceTips=");
        return e.a.a.a.a.L(M, this.z, ')');
    }

    public final boolean u() {
        return this.m;
    }

    public final long v() {
        return this.l;
    }

    public final List<String> w() {
        return this.q;
    }

    public final boolean x() {
        return this.v;
    }
}
