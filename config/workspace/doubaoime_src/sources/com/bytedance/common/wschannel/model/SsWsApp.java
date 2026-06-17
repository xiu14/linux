package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.IWsApp;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SsWsApp implements IWsApp, Parcelable {
    public static final Parcelable.Creator<SsWsApp> CREATOR = new a();
    private Map<String, String> a;
    private List<String> b;

    /* renamed from: c, reason: collision with root package name */
    private int f4285c;

    /* renamed from: d, reason: collision with root package name */
    private String f4286d;

    /* renamed from: e, reason: collision with root package name */
    private int f4287e;

    /* renamed from: f, reason: collision with root package name */
    private String f4288f;

    /* renamed from: g, reason: collision with root package name */
    private String f4289g;
    private int h;
    private int i;
    boolean j;
    List<Integer> k;
    String l;
    int m;
    boolean n;
    private int o;
    private String p;

    static class a implements Parcelable.Creator<SsWsApp> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public SsWsApp createFromParcel(Parcel parcel) {
            return new SsWsApp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SsWsApp[] newArray(int i) {
            return new SsWsApp[i];
        }
    }

    public static class b {
        public b() {
            new ArrayList();
        }

        public SsWsApp a(JSONObject jSONObject) {
            SsWsApp ssWsApp = new SsWsApp();
            ssWsApp.a(jSONObject);
            return ssWsApp;
        }
    }

    protected SsWsApp() {
        this.a = new HashMap();
        this.b = new ArrayList();
        this.k = new ArrayList();
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public List<Integer> A() {
        return this.k;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int D() {
        return this.h;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    @Nullable
    public String N() {
        return this.l;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public boolean P() {
        return this.n;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f4285c = jSONObject.optInt(WsConstants.KEY_CHANNEL_ID);
        this.f4287e = jSONObject.optInt("app_id");
        this.f4288f = jSONObject.optString("device_id");
        this.f4289g = jSONObject.optString("install_id");
        this.h = jSONObject.optInt("app_version");
        this.i = jSONObject.optInt(WsConstants.KEY_PLATFORM);
        this.o = jSONObject.optInt(WsConstants.KEY_FPID);
        this.p = jSONObject.optString("app_kay");
        this.f4286d = jSONObject.optString("extra");
        JSONArray optJSONArray = jSONObject.optJSONArray(MonitorConstants.URLS);
        this.b.clear();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                this.b.add(optJSONArray.optString(i));
            }
        }
        this.j = jSONObject.optBoolean(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(WsConstants.KEY_SERVICE_ID_LIST);
        this.k.clear();
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                this.k.add(Integer.valueOf(optJSONArray2.optInt(i2)));
            }
        }
        this.l = jSONObject.optString(WsConstants.KEY_PRIVATE_PROTOCOL_URL);
        this.m = jSONObject.optInt(WsConstants.KEY_TRANSPORT_MODE);
        this.n = jSONObject.optBoolean(WsConstants.KEY_DISABLE_FALLBACK_WEBSOCKET);
        this.a.clear();
        Map<String, String> map = this.a;
        JSONObject optJSONObject = jSONObject.optJSONObject("headers");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    Object opt = optJSONObject.opt(next);
                    hashMap.put(next, opt == null ? null : opt.toString());
                }
            }
        }
        map.putAll(hashMap);
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public Map<String, String> d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int e0() {
        return this.o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (this.f4285c != ssWsApp.f4285c || this.f4287e != ssWsApp.f4287e || this.h != ssWsApp.h || this.i != ssWsApp.i || this.o != ssWsApp.o || !this.a.equals(ssWsApp.a)) {
            return false;
        }
        List<String> list = this.b;
        if (list == null ? ssWsApp.b != null : !list.equals(ssWsApp.b)) {
            return false;
        }
        String str = this.f4286d;
        if (str == null ? ssWsApp.f4286d != null : !str.equals(ssWsApp.f4286d)) {
            return false;
        }
        String str2 = this.f4288f;
        if (str2 == null ? ssWsApp.f4288f != null : !str2.equals(ssWsApp.f4288f)) {
            return false;
        }
        String str3 = this.f4289g;
        if (str3 == null ? ssWsApp.f4289g != null : !str3.equals(ssWsApp.f4289g)) {
            return false;
        }
        String str4 = this.p;
        String str5 = ssWsApp.p;
        return str4 != null ? str4.equals(str5) : str5 == null;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int getAppId() {
        return this.f4287e;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String getDeviceId() {
        return this.f4288f;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String getExtra() {
        return this.f4286d;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int getPlatform() {
        return this.i;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String h() {
        return this.f4289g;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<String> list = this.b;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f4285c) * 31;
        String str = this.f4286d;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f4287e) * 31;
        String str2 = this.f4288f;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4289g;
        int hashCode5 = (((((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.o) * 31;
        String str4 = this.p;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public List<String> j0() {
        return this.b;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int l() {
        return this.f4285c;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int o() {
        return this.m;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public JSONObject p() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WsConstants.KEY_CHANNEL_ID, this.f4285c);
        jSONObject.put("app_id", this.f4287e);
        jSONObject.put("device_id", this.f4288f);
        jSONObject.put("install_id", this.f4289g);
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.b;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
        }
        Map<String, String> map = this.a;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    try {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        jSONObject.put("headers", jSONObject2);
        jSONObject.put(MonitorConstants.URLS, jSONArray);
        jSONObject.put("app_version", this.h);
        jSONObject.put(WsConstants.KEY_PLATFORM, this.i);
        jSONObject.put(WsConstants.KEY_FPID, this.o);
        jSONObject.put("app_kay", this.p);
        jSONObject.put("extra", this.f4286d);
        jSONObject.put(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE, this.j);
        JSONArray jSONArray2 = new JSONArray();
        List<Integer> list2 = this.k;
        if (list2 != null) {
            Iterator<Integer> it3 = list2.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next());
            }
        }
        jSONObject.put(WsConstants.KEY_SERVICE_ID_LIST, jSONArray2);
        jSONObject.put(WsConstants.KEY_PRIVATE_PROTOCOL_URL, this.l);
        jSONObject.put(WsConstants.KEY_TRANSPORT_MODE, this.m);
        jSONObject.put(WsConstants.KEY_DISABLE_FALLBACK_WEBSOCKET, this.n);
        return jSONObject;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public boolean r() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeStringList(this.b);
        parcel.writeInt(this.f4285c);
        parcel.writeString(this.f4286d);
        parcel.writeInt(this.f4287e);
        parcel.writeString(this.f4288f);
        parcel.writeString(this.f4289g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.k.size());
        Iterator<Integer> it2 = this.k.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String x() {
        return this.p;
    }

    protected SsWsApp(Parcel parcel) {
        this.a = new HashMap();
        this.b = new ArrayList();
        this.k = new ArrayList();
        int readInt = parcel.readInt();
        this.a = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put(parcel.readString(), parcel.readString());
        }
        this.b = parcel.createStringArrayList();
        this.f4285c = parcel.readInt();
        this.f4286d = parcel.readString();
        this.f4287e = parcel.readInt();
        this.f4288f = parcel.readString();
        this.f4289g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.j = parcel.readByte() != 0;
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.k.add(Integer.valueOf(parcel.readInt()));
        }
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.n = parcel.readByte() != 0;
    }
}
