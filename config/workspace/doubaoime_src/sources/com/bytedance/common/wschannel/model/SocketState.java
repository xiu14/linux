package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.wschannel.WsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SocketState implements Parcelable {
    public static final Parcelable.Creator<SocketState> CREATOR = new a();
    public int a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public String f4280c;

    /* renamed from: d, reason: collision with root package name */
    public int f4281d;

    /* renamed from: e, reason: collision with root package name */
    public int f4282e;

    /* renamed from: f, reason: collision with root package name */
    public String f4283f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4284g;

    @Deprecated
    public int h;

    static class a implements Parcelable.Creator<SocketState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public SocketState createFromParcel(Parcel parcel) {
            return new SocketState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SocketState[] newArray(int i) {
            return new SocketState[i];
        }
    }

    public SocketState() {
    }

    public static SocketState a(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.f4281d = jSONObject.optInt(WsConstants.KEY_CHANNEL_ID, Integer.MIN_VALUE);
        socketState.a = jSONObject.optInt("type", -1);
        socketState.b = jSONObject.optInt(WsConstants.KEY_CONNECTION_STATE, -1);
        socketState.f4280c = jSONObject.optString("url", "");
        socketState.f4282e = jSONObject.optInt(WsConstants.KEY_CHANNEL_TYPE);
        socketState.f4283f = jSONObject.optString(WsConstants.KEY_CONNECTION_ERROR, "");
        socketState.h = jSONObject.optInt("error_code");
        socketState.f4284g = jSONObject.optInt(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE, 0) > 0;
        return socketState;
    }

    public boolean b() {
        return this.f4284g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(WsConstants.KEY_CHANNEL_ID, this.f4281d);
            jSONObject.put("type", this.a);
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, this.b);
            jSONObject.put("url", this.f4280c);
            jSONObject.put(WsConstants.KEY_CHANNEL_TYPE, this.f4282e);
            jSONObject.put(WsConstants.KEY_CONNECTION_ERROR, this.f4283f);
            jSONObject.put("error_code", this.h);
            jSONObject.put(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE, this.f4284g ? 1 : 0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("SocketState{connectionType=");
        M.append(this.a);
        M.append(", connectionState=");
        M.append(this.b);
        M.append(", connectionUrl='");
        e.a.a.a.a.G0(M, this.f4280c, '\'', ", channelId=");
        M.append(this.f4281d);
        M.append(", channelType=");
        M.append(this.f4282e);
        M.append(", error='");
        e.a.a.a.a.G0(M, this.f4283f, '\'', ", privateProtocol=");
        M.append(this.f4284g);
        M.append('\'');
        M.append('}');
        return M.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.f4280c);
        parcel.writeInt(this.f4281d);
        parcel.writeInt(this.f4282e);
        parcel.writeString(this.f4283f);
        parcel.writeInt(this.h);
        parcel.writeInt(this.f4284g ? 1 : 0);
    }

    protected SocketState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.f4280c = parcel.readString();
        this.f4281d = parcel.readInt();
        this.f4282e = parcel.readInt();
        this.f4283f = parcel.readString();
        this.h = parcel.readInt();
        this.f4284g = parcel.readInt() > 0;
    }
}
