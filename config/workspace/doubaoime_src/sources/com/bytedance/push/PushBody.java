package com.bytedance.push;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.service.manager.alliance.IAllianceService;
import com.bytedance.android.service.manager.push.notification.NotificationBody;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.segment.Segment;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushBody implements Parcelable {
    public static final Parcelable.Creator<PushBody> CREATOR = new a();
    public int A;
    public boolean B;
    public long C;
    public int D;
    public int E;

    /* renamed from: J, reason: collision with root package name */
    public int f5568J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public String O;
    public int P;
    private int Q;
    private boolean R;
    public long S;
    public boolean T;
    public String a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f5569c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5570d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5571e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5572f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5573g;
    public String h;
    public String i;
    public boolean j;
    public JSONObject k;
    public String l;
    public String m;
    public String n;
    public int o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public String u;
    public JSONObject v;
    public long w;
    public int x;
    public int y;
    public String z;

    static class a implements Parcelable.Creator<PushBody> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public PushBody createFromParcel(Parcel parcel) {
            return new PushBody(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PushBody[] newArray(int i) {
            return new PushBody[i];
        }
    }

    public PushBody(JSONObject jSONObject) {
        this.k = jSONObject;
        this.p = jSONObject.optString("open_url");
        this.l = jSONObject.optString("text");
        this.m = jSONObject.optString("title");
        this.n = jSONObject.optString("image_url");
        this.b = jSONObject.optLong("id", 0L);
        this.f5569c = jSONObject.optLong("rid64", 0L);
        this.q = f(jSONObject, "use_led", false);
        this.r = f(jSONObject, RemoteMessageConst.Notification.SOUND, false);
        this.s = f(jSONObject, "use_vibrator", false);
        this.o = jSONObject.optInt("image_type", 0);
        this.Q = jSONObject.optInt("avatar_display_mode", 0);
        this.R = jSONObject.optBoolean("force_same_with_ios");
        this.j = jSONObject.optInt("pass_through", 1) > 0;
        this.i = jSONObject.optString("notify_channel");
        this.t = jSONObject.optInt("msg_from");
        this.f5570d = jSONObject.optString("group_id_str");
        this.f5571e = jSONObject.optInt(Segment.JsonKey.START, 1) > 0;
        this.f5572f = jSONObject.optString("ttpush_sec_target_uid");
        this.f5573g = jSONObject.optInt("ttpush_need_filter_uid", 0) > 0;
        this.w = jSONObject.optLong("revoke_id");
        this.h = jSONObject.optString("extra_str");
        this.u = jSONObject.optString("bdpush_str");
        this.a = jSONObject.optString("sign");
        this.v = jSONObject.optJSONObject("ttpush_event_extra");
        this.y = jSONObject.optInt("push_show_type", 0);
        jSONObject.optString("business_type", "");
        this.x = jSONObject.optInt(IAllianceService.CONTENT_TYPE_BADGE);
        this.y = jSONObject.optInt("push_show_type", 0);
        jSONObject.optString("business_type", "");
        jSONObject.optString("voip_params", "");
        this.z = jSONObject.optString("android_group", "");
        this.A = jSONObject.optInt("group_fold_num", 3);
        this.B = jSONObject.optBoolean("client_intelligent");
        this.C = jSONObject.optLong("message_expire_time", -1L);
        this.T = jSONObject.optBoolean("use_custom_type", false);
        jSONObject.optString(RemoteMessageConst.DATA);
        if (this.C == -1) {
            this.C = jSONObject.optLong("expire_time", -1L);
        }
        this.D = jSONObject.optInt("client_intelligence_push_show_mode", 1);
        this.E = jSONObject.optInt("client_intelligence_push_show_sub_mode", 0);
        this.L = jSONObject.optBoolean("allow_intercept_in_black_time_window", true);
        this.O = jSONObject.optString(PushLog.KEY_CATEGORY, "");
        this.P = jSONObject.optInt("importance", -1);
        long j = this.C;
        if (j == -1) {
            com.bytedance.push.g0.f.m("PushBody", "expiredTime is None so force set useClientIntelligenceShow and allowInterceptInBlackTimeWindow to false");
            this.B = false;
            this.L = false;
        } else {
            this.C = j * 1000;
        }
        if (com.bytedance.common.g.a.c().e().c().k && !TextUtils.isEmpty(this.h)) {
            try {
                JSONObject jSONObject2 = new JSONObject(this.h);
                if (TextUtils.isEmpty(this.z)) {
                    this.z = jSONObject2.optString("android_group");
                }
                int optInt = jSONObject2.optInt("image_type", -1);
                if (optInt > 0) {
                    this.o = optInt;
                }
                if (jSONObject2.optBoolean("force_same_with_ios", false)) {
                    this.R = true;
                }
                int optInt2 = jSONObject2.optInt("avatar_display_mode", -1);
                if (optInt2 > 0) {
                    this.Q = optInt2;
                }
                if (jSONObject2.optBoolean("client_intelligent", false)) {
                    this.B = true;
                    this.C = System.currentTimeMillis() + 28800000;
                }
                int optInt3 = jSONObject2.optInt("client_intelligence_push_show_mode", -1);
                if (optInt3 > -1) {
                    this.D = optInt3;
                }
                int optInt4 = jSONObject2.optInt("client_intelligence_push_show_sub_mode", -1);
                if (optInt4 > -1) {
                    this.E = optInt4;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.f5568J = jSONObject.optInt("min_display_interval_from_last_msg", -1);
        this.K = jSONObject.optInt("min_display_interval_from_foreground", -1);
        this.M = jSONObject.optBoolean("additional_arrive_callback", false);
        this.N = jSONObject.optBoolean("additional_click_callback", false);
        this.S = jSONObject.optLong("delay_show_interval_in_second", 0L);
    }

    private static boolean f(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt >= 1) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    public NotificationBody a() {
        return new NotificationBody.Builder().msgData(this.k).id(this.b).showWhen(this.f5571e).title(this.m).content(this.l).groupId(this.f5570d).channelId(this.i).redBadgeNum(this.x).imageUrl(this.n).imageType(this.o).useLED(this.q).useSound(this.r).useVibrator(this.s).androidGroup(this.z).groupFoldNum(this.A).setBdPushStr(this.u).setOpenUrl(this.p).setEventExtra(this.v).setChannelImportance(this.P).setNotificationCategory(this.O).setAvatarDisplayMode(this.Q).setForceSameWithIos(this.R).build();
    }

    public int b() {
        JSONObject optJSONObject;
        JSONObject jSONObject = this.k;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("proxy_notification_info")) == null) {
            return -1;
        }
        return optJSONObject.optInt("origin_app", -1);
    }

    public int c() {
        JSONObject optJSONObject;
        JSONObject jSONObject = this.k;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("proxy_notification_info")) == null) {
            return -1;
        }
        return optJSONObject.optInt("sender", -1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        JSONObject optJSONObject;
        JSONObject jSONObject = this.k;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("proxy_notification_info")) == null) {
            return -1;
        }
        return optJSONObject.optInt("target_app", -1);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("PushBody{groupId='");
        e.a.a.a.a.G0(M, this.f5570d, '\'', ", extra='");
        e.a.a.a.a.G0(M, this.h, '\'', ", mNotificationChannelId='");
        e.a.a.a.a.G0(M, this.i, '\'', ", mIsPassThough=");
        M.append(this.j);
        M.append(", msgData=");
        M.append(this.k);
        M.append(", text='");
        e.a.a.a.a.G0(M, this.l, '\'', ", title='");
        e.a.a.a.a.G0(M, this.m, '\'', ", imageUrl='");
        e.a.a.a.a.G0(M, this.n, '\'', ", imageType=");
        M.append(this.o);
        M.append(", id=");
        M.append(this.b);
        M.append(", open_url='");
        e.a.a.a.a.G0(M, this.p, '\'', ", useLED=");
        M.append(this.q);
        M.append(", useSound=");
        M.append(this.r);
        M.append(", useVibrator=");
        M.append(this.s);
        M.append(", messageType=");
        M.append(this.t);
        M.append(", androidGroup=");
        return e.a.a.a.a.G(M, this.z, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.f5569c);
        parcel.writeString(this.f5570d);
        parcel.writeByte(this.f5571e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5572f);
        parcel.writeByte(this.f5573g ? (byte) 1 : (byte) 0);
        parcel.writeString(this.h);
        parcel.writeString(this.u);
        parcel.writeString(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeString(this.k.toString());
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.t);
        parcel.writeLong(this.w);
        parcel.writeString(this.a);
        parcel.writeByte(this.R ? (byte) 1 : (byte) 0);
        JSONObject jSONObject = this.v;
        parcel.writeString(jSONObject == null ? "" : jSONObject.toString());
    }

    protected PushBody(Parcel parcel) {
        this.b = parcel.readLong();
        this.f5569c = parcel.readLong();
        this.f5570d = parcel.readString();
        this.f5571e = parcel.readByte() != 0;
        this.f5572f = parcel.readString();
        this.f5573g = parcel.readByte() != 0;
        this.h = parcel.readString();
        this.u = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readByte() != 0;
        try {
            this.k = new JSONObject(parcel.readString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readByte() != 0;
        this.r = parcel.readByte() != 0;
        this.s = parcel.readByte() != 0;
        this.t = parcel.readInt();
        this.w = parcel.readLong();
        this.a = parcel.readString();
        this.R = parcel.readByte() != 0;
        try {
            this.v = new JSONObject(parcel.readString());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
