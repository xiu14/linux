package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class WsComponent implements Parcelable {
    public static final Parcelable.Creator<WsComponent> CREATOR = new a();
    ComponentName a;
    List<WsApi> b;

    static class a implements Parcelable.Creator<WsComponent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public WsComponent createFromParcel(Parcel parcel) {
            WsComponent wsComponent = new WsComponent();
            wsComponent.a = (ComponentName) parcel.readParcelable(a.class.getClassLoader());
            wsComponent.b = parcel.createTypedArrayList(WsApi.CREATOR);
            return wsComponent;
        }

        @Override // android.os.Parcelable.Creator
        public WsComponent[] newArray(int i) {
            return new WsComponent[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }
}
