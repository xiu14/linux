package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class WsApi implements Parcelable {
    public static final Parcelable.Creator<WsApi> CREATOR = new a();
    int a;
    int b;

    static class a implements Parcelable.Creator<WsApi> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public WsApi createFromParcel(Parcel parcel) {
            WsApi wsApi = new WsApi();
            wsApi.a = parcel.readInt();
            wsApi.b = parcel.readInt();
            return wsApi;
        }

        @Override // android.os.Parcelable.Creator
        public WsApi[] newArray(int i) {
            return new WsApi[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
