package com.heytap.mcs.liquid.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ActionResult implements Parcelable {
    public static final Parcelable.Creator<ActionResult> CREATOR = new a();
    private int a;

    static class a implements Parcelable.Creator<ActionResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActionResult createFromParcel(Parcel parcel) {
            return new ActionResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActionResult[] newArray(int i) {
            return new ActionResult[i];
        }
    }

    public ActionResult() {
    }

    public ActionResult(int i) {
        this.a = i;
    }

    protected ActionResult(Parcel parcel) {
        this.a = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
