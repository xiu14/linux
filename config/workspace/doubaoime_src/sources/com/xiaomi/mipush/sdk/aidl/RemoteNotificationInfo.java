package com.xiaomi.mipush.sdk.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.push.iq;
import e.a.a.a.a;
import java.util.Map;

/* loaded from: classes2.dex */
public class RemoteNotificationInfo implements Parcelable {
    public static final Parcelable.Creator<RemoteNotificationInfo> CREATOR = new Parcelable.Creator<RemoteNotificationInfo>() { // from class: com.xiaomi.mipush.sdk.aidl.RemoteNotificationInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteNotificationInfo createFromParcel(Parcel parcel) {
            return new RemoteNotificationInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteNotificationInfo[] newArray(int i) {
            return new RemoteNotificationInfo[i];
        }
    };
    private String mBody;
    private int mClickType;
    private String mClickUrl;
    private String mExtraData;
    private String mImage;
    private String mMsgId;
    private long mNotifyId;
    private String mTitle;
    private String mToken;
    private int mType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public String getExtraData() {
        return this.mExtraData;
    }

    public String getImage() {
        return this.mImage;
    }

    public String getMsgId() {
        return this.mMsgId;
    }

    public long getNotifyId() {
        return this.mNotifyId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getToken() {
        return this.mToken;
    }

    public int getType() {
        return this.mType;
    }

    public void readFromParcel(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mToken = parcel.readString();
        this.mTitle = parcel.readString();
        this.mBody = parcel.readString();
        this.mImage = parcel.readString();
        this.mNotifyId = parcel.readLong();
        this.mClickType = parcel.readInt();
        this.mClickUrl = parcel.readString();
        this.mExtraData = parcel.readString();
        this.mMsgId = parcel.readString();
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

    public void setExtraData(String str) {
        this.mExtraData = str;
    }

    public void setImage(String str) {
        this.mImage = str;
    }

    public void setMsgId(String str) {
        this.mMsgId = str;
    }

    public void setNotifyId(long j) {
        this.mNotifyId = j;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public String toString() {
        StringBuilder M = a.M("RemoteNotificationInfo[mType:");
        M.append(this.mType);
        M.append(",mToken:");
        M.append(this.mToken);
        M.append(",mTitle:");
        M.append(this.mTitle);
        M.append(",mBody:");
        M.append(this.mBody);
        M.append(",mImage:");
        M.append(this.mImage);
        M.append(",mNotifyId:");
        M.append(this.mNotifyId);
        M.append(",mClickType:");
        M.append(this.mClickType);
        M.append(",mClickUrl:");
        M.append(this.mClickUrl);
        M.append(",mExtraData:");
        M.append(this.mExtraData);
        M.append(",mMsgId:");
        return a.J(M, this.mMsgId, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mType);
        parcel.writeString(this.mToken);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mBody);
        parcel.writeString(this.mImage);
        parcel.writeLong(this.mNotifyId);
        parcel.writeInt(this.mClickType);
        parcel.writeString(this.mClickUrl);
        parcel.writeString(this.mExtraData);
        parcel.writeString(this.mMsgId);
    }

    private RemoteNotificationInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public RemoteNotificationInfo(iq iqVar) {
        Map<String, String> m525a;
        if (iqVar.m558a() == null || (m525a = iqVar.m558a().m525a()) == null) {
            return;
        }
        this.mTitle = iqVar.m558a().m532c();
        this.mBody = iqVar.m558a().d();
        this.mToken = m525a.get("_target_name");
        this.mNotifyId = iqVar.m558a().c();
        this.mMsgId = iqVar.m558a().m524a();
        String str = m525a.get("notification_large_icon_uri");
        this.mImage = TextUtils.isEmpty(str) ? m525a.get("notification_bigPic_uri") : str;
        this.mExtraData = m525a.get("hyper_crypt");
        String str2 = m525a.get("hyper_click_type");
        if (str2 != null && TextUtils.isDigitsOnly(str2)) {
            this.mClickType = Integer.parseInt(str2);
        }
        int i = this.mClickType;
        if (i == 1) {
            this.mClickUrl = m525a.get("intent_uri");
        } else {
            if (i != 2) {
                return;
            }
            this.mClickUrl = m525a.get("web_uri");
        }
    }
}
