package com.bytedance.android.input.basic.settings.api.c;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    @SerializedName("is_support_fps_upload")
    private boolean A;

    @SerializedName("is_support_draw_path_upload")
    private boolean B;

    @SerializedName("is_support_refresh_rate_upload")
    private boolean C;

    @SerializedName("is_sp_monitor_enabled")
    private boolean D;

    @SerializedName("is_support_high_refresh_rate")
    private boolean E;

    @SerializedName("is_no_freq_render")
    private boolean F;

    @SerializedName("upload_high_refresh_rate_max_num")
    private int G;

    @SerializedName("word_segmentation_input_by_pre_edit")
    private List<String> H;

    @SerializedName("is_can_force_association")
    private List<String> I;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("is_open_force_association_for_package")
    private boolean f2095J;

    @SerializedName("settings_update")
    private int a;

    @SerializedName("enable_report_inputdata")
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("max_cloud_network_delay_ms")
    private int f2096c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("app_upgrade_check_gap")
    private int f2097d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("app_upgrade_tips_gap")
    private int f2098e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("enable_QUIC")
    private boolean f2099f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("cloud_request_timeout_short")
    private int f2100g;

    @SerializedName("cloud_request_timeout_long")
    private int h;

    @SerializedName("enable_correct")
    private boolean i;

    @SerializedName("correct_gap_time_ms")
    private int j;

    @SerializedName("timely_update_setting")
    private boolean k;

    @SerializedName("immediately_pull_setting")
    private boolean l;

    @SerializedName("is_support_system_font")
    private boolean m;

    @SerializedName("is_support_hit_interceptor_app")
    private boolean n;

    @SerializedName("is_check_network")
    private boolean o;

    @SerializedName("is_support_three_refresh")
    private boolean p;

    @SerializedName("is_support_freeze_opt")
    private boolean q;

    @SerializedName("disable_one_click_sending")
    private String r;

    @SerializedName("one_send_config")
    private List<i> s;

    @SerializedName("search_config")
    private List<k> t;

    @SerializedName("handwrite_stroke_timeout_ms")
    private long u;

    @SerializedName("is_support_modify_v2")
    private boolean v;

    @SerializedName("opt_text_pre_edit")
    private boolean w;

    @SerializedName("pre_edit_white_list")
    private List<String> x;

    @SerializedName("opt_pre_edit_black_list")
    private List<String> y;

    @SerializedName("vibrate_rom_list")
    private List<String> z;

    public e() {
        this(0, false, 0, 0, 0, false, 0, 0, false, 0, false, false, false, false, false, false, false, null, null, null, 0L, false, false, null, null, null, false, false, false, false, false, false, 0, null, null, false, -1, 15);
    }

    public e(int i, boolean z, int i2, int i3, int i4, boolean z2, int i5, int i6, boolean z3, int i7, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, List list, List list2, long j, boolean z11, boolean z12, List list3, List list4, List list5, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i8, List list6, List list7, boolean z19, int i9, int i10) {
        boolean z20;
        String str2;
        boolean z21;
        kotlin.collections.l lVar;
        boolean z22;
        boolean z23;
        boolean z24;
        ArrayList arrayList;
        boolean z25;
        boolean z26;
        int i11 = (i9 & 1) != 0 ? 60 : i;
        boolean z27 = (i9 & 2) != 0 ? true : z;
        int i12 = (i9 & 4) != 0 ? 100 : i2;
        int i13 = (i9 & 8) != 0 ? 3 : i3;
        int i14 = (i9 & 16) == 0 ? i4 : 3;
        boolean z28 = (i9 & 32) != 0 ? true : z2;
        int i15 = (i9 & 64) != 0 ? 120 : i5;
        int i16 = (i9 & 128) != 0 ? 200 : i6;
        boolean z29 = (i9 & 256) != 0 ? true : z3;
        int i17 = (i9 & 512) != 0 ? 50 : i7;
        boolean z30 = (i9 & 1024) != 0 ? true : z4;
        boolean z31 = (i9 & 2048) != 0 ? true : z5;
        boolean z32 = (i9 & 4096) != 0 ? true : z6;
        boolean z33 = (i9 & 8192) != 0 ? true : z7;
        boolean z34 = (i9 & 16384) != 0 ? true : z8;
        boolean z35 = (i9 & 32768) != 0 ? true : z9;
        boolean z36 = (i9 & 65536) != 0 ? true : z10;
        if ((i9 & 131072) != 0) {
            z20 = z34;
            str2 = "";
        } else {
            z20 = z34;
            str2 = null;
        }
        if ((i9 & 262144) != 0) {
            z21 = z32;
            lVar = kotlin.collections.l.a;
        } else {
            z21 = z32;
            lVar = null;
        }
        if ((i9 & 524288) != 0) {
            z22 = z30;
            z23 = z31;
            z24 = true;
            arrayList = kotlin.collections.g.c(new k("com.baidu.BaiduMap", 131073, 1207959555, null, false, true, 24));
        } else {
            z22 = z30;
            z23 = z31;
            z24 = true;
            arrayList = null;
        }
        long j2 = (i9 & 1048576) != 0 ? 500L : j;
        z24 = (i9 & 2097152) == 0 ? z11 : z24;
        boolean z37 = (i9 & 4194304) != 0 ? false : z12;
        ArrayList c2 = (i9 & 8388608) != 0 ? kotlin.collections.g.c("com.marriott.mrt") : null;
        ArrayList c3 = (i9 & 16777216) != 0 ? kotlin.collections.g.c("com.hihonor.notepad") : null;
        ArrayList c4 = (i9 & 33554432) != 0 ? kotlin.collections.g.c("OPPO") : null;
        boolean z38 = (i9 & 67108864) != 0 ? true : z13;
        boolean z39 = (i9 & 134217728) != 0 ? true : z14;
        boolean z40 = (i9 & 268435456) != 0 ? true : z15;
        boolean z41 = (i9 & 536870912) != 0 ? true : z16;
        boolean z42 = (i9 & BasicMeasure.EXACTLY) != 0 ? true : z17;
        boolean z43 = (i9 & Integer.MIN_VALUE) != 0 ? true : z18;
        int i18 = (i10 & 1) != 0 ? 2 : i8;
        ArrayList c5 = (i10 & 2) != 0 ? kotlin.collections.g.c("com.smartisan.notes") : null;
        ArrayList c6 = (i10 & 4) != 0 ? kotlin.collections.g.c("com.coloros.note") : null;
        if ((i10 & 8) != 0) {
            z26 = z43;
            z25 = true;
        } else {
            z25 = z19;
            z26 = z43;
        }
        kotlin.s.c.l.f(str2, "disableOneClickSending");
        kotlin.s.c.l.f(lVar, "oneSendConfig");
        kotlin.s.c.l.f(arrayList, "searchConfig");
        this.a = i11;
        this.b = z27;
        this.f2096c = i12;
        this.f2097d = i13;
        this.f2098e = i14;
        this.f2099f = z28;
        this.f2100g = i15;
        this.h = i16;
        this.i = z29;
        this.j = i17;
        this.k = z22;
        this.l = z23;
        this.m = z21;
        this.n = z33;
        this.o = z20;
        this.p = z35;
        this.q = z36;
        this.r = str2;
        this.s = lVar;
        this.t = arrayList;
        this.u = j2;
        this.v = z24;
        this.w = z37;
        this.x = c2;
        this.y = c3;
        this.z = c4;
        this.A = z38;
        this.B = z39;
        this.C = z40;
        this.D = z41;
        this.E = z42;
        this.F = z26;
        this.G = i18;
        this.H = c5;
        this.I = c6;
        this.f2095J = z25;
    }

    public final boolean A() {
        return this.B;
    }

    public final boolean B() {
        return this.A;
    }

    public final boolean C() {
        return this.q;
    }

    public final boolean D() {
        return this.E;
    }

    public final boolean E() {
        return this.v;
    }

    public final boolean F() {
        return this.C;
    }

    public final boolean G() {
        return this.m;
    }

    public final int a() {
        return this.f2097d;
    }

    public final int b() {
        return this.f2098e;
    }

    public final int c() {
        return this.h;
    }

    public final int d() {
        return this.f2100g;
    }

    public final int e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.f2096c == eVar.f2096c && this.f2097d == eVar.f2097d && this.f2098e == eVar.f2098e && this.f2099f == eVar.f2099f && this.f2100g == eVar.f2100g && this.h == eVar.h && this.i == eVar.i && this.j == eVar.j && this.k == eVar.k && this.l == eVar.l && this.m == eVar.m && this.n == eVar.n && this.o == eVar.o && this.p == eVar.p && this.q == eVar.q && kotlin.s.c.l.a(this.r, eVar.r) && kotlin.s.c.l.a(this.s, eVar.s) && kotlin.s.c.l.a(this.t, eVar.t) && this.u == eVar.u && this.v == eVar.v && this.w == eVar.w && kotlin.s.c.l.a(this.x, eVar.x) && kotlin.s.c.l.a(this.y, eVar.y) && kotlin.s.c.l.a(this.z, eVar.z) && this.A == eVar.A && this.B == eVar.B && this.C == eVar.C && this.D == eVar.D && this.E == eVar.E && this.F == eVar.F && this.G == eVar.G && kotlin.s.c.l.a(this.H, eVar.H) && kotlin.s.c.l.a(this.I, eVar.I) && this.f2095J == eVar.f2095J;
    }

    public final String f() {
        return this.r;
    }

    public final boolean g() {
        return this.i;
    }

    public final boolean h() {
        return this.f2099f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int I = e.a.a.a.a.I(this.f2098e, e.a.a.a.a.I(this.f2097d, e.a.a.a.a.I(this.f2096c, (hashCode + i) * 31, 31), 31), 31);
        boolean z2 = this.f2099f;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int I2 = e.a.a.a.a.I(this.h, e.a.a.a.a.I(this.f2100g, (I + i2) * 31, 31), 31);
        boolean z3 = this.i;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        int I3 = e.a.a.a.a.I(this.j, (I2 + i3) * 31, 31);
        boolean z4 = this.k;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        int i5 = (I3 + i4) * 31;
        boolean z5 = this.l;
        int i6 = z5;
        if (z5 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z6 = this.m;
        int i8 = z6;
        if (z6 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z7 = this.n;
        int i10 = z7;
        if (z7 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z8 = this.o;
        int i12 = z8;
        if (z8 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z9 = this.p;
        int i14 = z9;
        if (z9 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z10 = this.q;
        int i16 = z10;
        if (z10 != 0) {
            i16 = 1;
        }
        int hashCode2 = (Long.hashCode(this.u) + ((this.t.hashCode() + ((this.s.hashCode() + e.a.a.a.a.p0(this.r, (i15 + i16) * 31, 31)) * 31)) * 31)) * 31;
        boolean z11 = this.v;
        int i17 = z11;
        if (z11 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode2 + i17) * 31;
        boolean z12 = this.w;
        int i19 = z12;
        if (z12 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        List<String> list = this.x;
        int hashCode3 = (i20 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.y;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.z;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        boolean z13 = this.A;
        int i21 = z13;
        if (z13 != 0) {
            i21 = 1;
        }
        int i22 = (hashCode5 + i21) * 31;
        boolean z14 = this.B;
        int i23 = z14;
        if (z14 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        boolean z15 = this.C;
        int i25 = z15;
        if (z15 != 0) {
            i25 = 1;
        }
        int i26 = (i24 + i25) * 31;
        boolean z16 = this.D;
        int i27 = z16;
        if (z16 != 0) {
            i27 = 1;
        }
        int i28 = (i26 + i27) * 31;
        boolean z17 = this.E;
        int i29 = z17;
        if (z17 != 0) {
            i29 = 1;
        }
        int i30 = (i28 + i29) * 31;
        boolean z18 = this.F;
        int i31 = z18;
        if (z18 != 0) {
            i31 = 1;
        }
        int I4 = e.a.a.a.a.I(this.G, (i30 + i31) * 31, 31);
        List<String> list4 = this.H;
        int hashCode6 = (I4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.I;
        int hashCode7 = (hashCode6 + (list5 != null ? list5.hashCode() : 0)) * 31;
        boolean z19 = this.f2095J;
        return hashCode7 + (z19 ? 1 : z19 ? 1 : 0);
    }

    public final boolean i() {
        return this.b;
    }

    public final long j() {
        return this.u;
    }

    public final boolean k() {
        return this.l;
    }

    public final List<i> l() {
        return this.s;
    }

    public final List<String> m() {
        return this.y;
    }

    public final boolean n() {
        return this.w;
    }

    public final List<String> o() {
        return this.x;
    }

    public final List<k> p() {
        return this.t;
    }

    public final int q() {
        return this.a;
    }

    public final boolean r() {
        return this.k;
    }

    public final int s() {
        return this.G;
    }

    public final List<String> t() {
        return this.z;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CommonConfig(settingsUpdate=");
        M.append(this.a);
        M.append(", enableReportInputData=");
        M.append(this.b);
        M.append(", maxCloudNetworkDelay=");
        M.append(this.f2096c);
        M.append(", appUpgradeCheckGap=");
        M.append(this.f2097d);
        M.append(", appUpgradeTipsGap=");
        M.append(this.f2098e);
        M.append(", enableQUIC=");
        M.append(this.f2099f);
        M.append(", cloudRequestTimeoutShort=");
        M.append(this.f2100g);
        M.append(", cloudRequestTimeoutLong=");
        M.append(this.h);
        M.append(", enableCorrect=");
        M.append(this.i);
        M.append(", correctGapTimeMs=");
        M.append(this.j);
        M.append(", timelyUpdateSetting=");
        M.append(this.k);
        M.append(", immediatelyPullSetting=");
        M.append(this.l);
        M.append(", isSupportSystemFont=");
        M.append(this.m);
        M.append(", isSupportHitInterceptorApp=");
        M.append(this.n);
        M.append(", isCheckNetwork=");
        M.append(this.o);
        M.append(", isSupportThreeRefresh=");
        M.append(this.p);
        M.append(", isSupportFreezeOpt=");
        M.append(this.q);
        M.append(", disableOneClickSending=");
        M.append(this.r);
        M.append(", oneSendConfig=");
        M.append(this.s);
        M.append(", searchConfig=");
        M.append(this.t);
        M.append(", handwriteStrokeTimeoutMs=");
        M.append(this.u);
        M.append(", isSupportModifyV2=");
        M.append(this.v);
        M.append(", optTextPreEdit=");
        M.append(this.w);
        M.append(", preEditWhiteList=");
        M.append(this.x);
        M.append(", optPreEditBlackList=");
        M.append(this.y);
        M.append(", vibrateRomList=");
        M.append(this.z);
        M.append(", isSupportFpsUpload=");
        M.append(this.A);
        M.append(", isSupportDrawPathUpload=");
        M.append(this.B);
        M.append(", isSupportRefreshRateUpload=");
        M.append(this.C);
        M.append(", isSpMonitorEnabled=");
        M.append(this.D);
        M.append(", isSupportHighRefreshRate=");
        M.append(this.E);
        M.append(", isNoFreqRender=");
        M.append(this.F);
        M.append(", uploadHighRefreshRateMaxNum=");
        M.append(this.G);
        M.append(", wordSegmentationInputByPreEditList=");
        M.append(this.H);
        M.append(", isCanForceAssociation=");
        M.append(this.I);
        M.append(", isOpenForceAssociationForPackage=");
        return e.a.a.a.a.L(M, this.f2095J, ')');
    }

    public final List<String> u() {
        return this.H;
    }

    public final List<String> v() {
        return this.I;
    }

    public final boolean w() {
        return this.o;
    }

    public final boolean x() {
        return this.F;
    }

    public final boolean y() {
        return this.f2095J;
    }

    public final boolean z() {
        return this.D;
    }
}
