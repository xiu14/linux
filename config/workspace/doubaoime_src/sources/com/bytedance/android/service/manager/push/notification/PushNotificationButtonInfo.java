package com.bytedance.android.service.manager.push.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.push.g0.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PushNotificationButtonInfo implements Parcelable {
    public static final Parcelable.Creator<PushNotificationButtonInfo> CREATOR = new Parcelable.Creator<PushNotificationButtonInfo>() { // from class: com.bytedance.android.service.manager.push.notification.PushNotificationButtonInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushNotificationButtonInfo createFromParcel(Parcel parcel) {
            return new PushNotificationButtonInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushNotificationButtonInfo[] newArray(int i) {
            return new PushNotificationButtonInfo[i];
        }
    };
    public String mButtonAction;
    public String mButtonOpenUrl;
    public String mButtonRawText;
    public String mButtonToast;

    public PushNotificationButtonInfo(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mButtonRawText = jSONObject.optString("text");
            this.mButtonAction = jSONObject.optString("action");
            this.mButtonToast = jSONObject.optString("toast");
            this.mButtonOpenUrl = jSONObject.optString("open_url");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject toJsonForEventV3() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("text", this.mButtonRawText);
            jSONObject.put("action", this.mButtonAction);
            jSONObject.put("toast", this.mButtonToast);
        } catch (JSONException e2) {
            f.e(getClass().getSimpleName(), e2.getMessage());
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mButtonRawText);
        parcel.writeString(this.mButtonAction);
        parcel.writeString(this.mButtonToast);
        parcel.writeString(this.mButtonOpenUrl);
    }

    protected PushNotificationButtonInfo(Parcel parcel) {
        this.mButtonRawText = parcel.readString();
        this.mButtonAction = parcel.readString();
        this.mButtonToast = parcel.readString();
        this.mButtonOpenUrl = parcel.readString();
    }
}
