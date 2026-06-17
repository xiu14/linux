package com.bytedance.android.input.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class FeedbackContentShownInUi implements Parcelable {
    public static final Parcelable.Creator<FeedbackContentShownInUi> CREATOR = new a();
    public final String candidateList;
    public final String context;
    public final int feedbackId;
    public final String input;
    public final boolean isFeedbackSubmitted;

    class a implements Parcelable.Creator<FeedbackContentShownInUi> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public FeedbackContentShownInUi createFromParcel(Parcel parcel) {
            return new FeedbackContentShownInUi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FeedbackContentShownInUi[] newArray(int i) {
            return new FeedbackContentShownInUi[i];
        }
    }

    public FeedbackContentShownInUi(String str, String str2, String str3, boolean z, int i) {
        this.input = str;
        this.context = str2;
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
        parcel.writeString(this.input);
        parcel.writeString(this.context);
        parcel.writeString(this.candidateList);
        parcel.writeByte(this.isFeedbackSubmitted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.feedbackId);
    }

    protected FeedbackContentShownInUi(Parcel parcel) {
        this.input = parcel.readString();
        this.context = parcel.readString();
        this.candidateList = parcel.readString();
        this.isFeedbackSubmitted = parcel.readByte() != 0;
        this.feedbackId = parcel.readInt();
    }
}
