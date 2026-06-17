package com.bytedance.android.input.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class FeedbackAssociateContentShownInUi implements Parcelable {
    public static final Parcelable.Creator<FeedbackAssociateContentShownInUi> CREATOR = new a();
    public final String candidateList;
    public final String contextAfter;
    public final String contextBefore;
    public final int feedbackId;
    public final boolean isFeedbackSubmitted;

    class a implements Parcelable.Creator<FeedbackAssociateContentShownInUi> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public FeedbackAssociateContentShownInUi createFromParcel(Parcel parcel) {
            return new FeedbackAssociateContentShownInUi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FeedbackAssociateContentShownInUi[] newArray(int i) {
            return new FeedbackAssociateContentShownInUi[i];
        }
    }

    public FeedbackAssociateContentShownInUi(String str, String str2, String str3, boolean z, int i) {
        this.contextBefore = str;
        this.contextAfter = str2;
        this.candidateList = str3;
        this.isFeedbackSubmitted = z;
        this.feedbackId = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contextBefore);
        parcel.writeString(this.contextAfter);
        parcel.writeString(this.candidateList);
        parcel.writeByte(this.isFeedbackSubmitted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.feedbackId);
    }

    protected FeedbackAssociateContentShownInUi(Parcel parcel) {
        this.contextBefore = parcel.readString();
        this.contextAfter = parcel.readString();
        this.candidateList = parcel.readString();
        this.isFeedbackSubmitted = parcel.readByte() != 0;
        this.feedbackId = parcel.readInt();
    }
}
