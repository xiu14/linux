package com.xiaomi.mipush.sdk.aidl;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class RemoteNotificationContent implements Parcelable {
    public static final Parcelable.Creator<RemoteNotificationContent> CREATOR = new Parcelable.Creator<RemoteNotificationContent>() { // from class: com.xiaomi.mipush.sdk.aidl.RemoteNotificationContent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteNotificationContent createFromParcel(Parcel parcel) {
            return new RemoteNotificationContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteNotificationContent[] newArray(int i) {
            return new RemoteNotificationContent[i];
        }
    };
    private Bitmap mImage;
    private boolean mIsShowNotification = true;
    private String mTitle = "";
    private String mBody = "";
    private int mBadgeOperateType = -1;
    private int mBadgeNum = -1;
    private int mClickType = -1;
    private String mClickUrl = "";

    public RemoteNotificationContent() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBadgeNum() {
        return this.mBadgeNum;
    }

    public int getBadgeOperateType() {
        return this.mBadgeOperateType;
    }

    public String getBody() {
        return this.mBody;
    }

    public int getClickType() {
        return this.mClickType;
    }

    public String getClickUrl() {
        return this.mClickUrl;
    }

    public Bitmap getImage() {
        return this.mImage;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isIsShowNotification() {
        return this.mIsShowNotification;
    }

    public void readFromParcel(Parcel parcel) {
        this.mIsShowNotification = parcel.readByte() != 0;
        this.mTitle = parcel.readString();
        this.mBody = parcel.readString();
        this.mImage = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.mBadgeOperateType = parcel.readInt();
        this.mBadgeNum = parcel.readInt();
        this.mClickType = parcel.readInt();
        this.mClickUrl = parcel.readString();
    }

    public void setBadgeNum(int i) {
        this.mBadgeNum = i;
    }

    public void setBadgeOperateType(int i) {
        this.mBadgeOperateType = i;
    }

    public void setBody(String str) {
        this.mBody = str;
    }

    public void setClickType(int i) {
        this.mClickType = i;
    }

    public void setClickUrl(String str) {
        this.mClickUrl = str;
    }

    public int setImage(Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() * bitmap.getHeight() >= 49152) {
            return -1;
        }
        this.mImage = bitmap;
        return 0;
    }

    public void setIsShowNotification(boolean z) {
        this.mIsShowNotification = z;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String toString() {
        StringBuilder M = a.M("RemoteNotificationContent[mIsShowNotification:");
        M.append(this.mIsShowNotification);
        M.append(",mTitle:");
        M.append(this.mTitle);
        M.append(",mBody:");
        M.append(this.mBody);
        M.append(",mImage:");
        M.append(this.mImage);
        M.append(",mBadgeOperateType:");
        M.append(this.mBadgeOperateType);
        M.append(",mClickType:");
        M.append(this.mClickType);
        M.append(",mClickUrl:");
        M.append(this.mClickUrl);
        M.append(",mBadgeNum:");
        return a.D(M, this.mBadgeNum, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mIsShowNotification ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mBody);
        parcel.writeParcelable(this.mImage, i);
        parcel.writeInt(this.mBadgeOperateType);
        parcel.writeInt(this.mBadgeNum);
        parcel.writeInt(this.mClickType);
        parcel.writeString(this.mClickUrl);
    }

    protected RemoteNotificationContent(Parcel parcel) {
        readFromParcel(parcel);
    }
}
