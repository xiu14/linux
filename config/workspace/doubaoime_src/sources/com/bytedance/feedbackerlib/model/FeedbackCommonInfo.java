package com.bytedance.feedbackerlib.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.service.d;
import com.bytedance.feedbackerlib.util.k;

/* loaded from: classes.dex */
public class FeedbackCommonInfo extends d.a implements Parcelable {
    public static final Parcelable.Creator<FeedbackCommonInfo> CREATOR = new a();
    private final Feedbacker.IFeedbackCommonInfo b;

    /* renamed from: c, reason: collision with root package name */
    private final Feedbacker.n f4913c;

    /* renamed from: d, reason: collision with root package name */
    private final Feedbacker.o f4914d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.feedbackerlib.service.d f4915e;

    static class a implements Parcelable.Creator<FeedbackCommonInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public FeedbackCommonInfo createFromParcel(Parcel parcel) {
            return new FeedbackCommonInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FeedbackCommonInfo[] newArray(int i) {
            return new FeedbackCommonInfo[i];
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedbackCommonInfo.this.f4913c.f();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedbackCommonInfo.this.f4914d.g();
        }
    }

    public FeedbackCommonInfo(@NonNull Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo) {
        this.b = iFeedbackCommonInfo;
        this.f4913c = iFeedbackCommonInfo.getOnFeedbackClickListener();
        this.f4914d = iFeedbackCommonInfo.getOnMediasUploadFailedListener();
        this.f4915e = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public void f() throws RemoteException {
        if (this.f4913c != null) {
            k.a(new b());
            return;
        }
        com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public void g() throws RemoteException {
        if (this.f4914d != null) {
            k.a(new c());
            return;
        }
        com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
        if (dVar != null) {
            dVar.g();
        }
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public String getALogFilesDir() throws RemoteException {
        Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo = this.b;
        if (iFeedbackCommonInfo == null || TextUtils.isEmpty(iFeedbackCommonInfo.getALogFilesDir())) {
            com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
            if (dVar != null) {
                return dVar.getALogFilesDir();
            }
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("aLogFilesDir: ");
        M.append(this.b.getALogFilesDir());
        Log.d("mIFeedbackCommonInfo", M.toString());
        return this.b.getALogFilesDir();
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public int getAid() throws RemoteException {
        Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo = this.b;
        if (iFeedbackCommonInfo == null || iFeedbackCommonInfo.getAid() <= 0) {
            com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
            if (dVar != null) {
                return dVar.getAid();
            }
            return -1;
        }
        StringBuilder M = e.a.a.a.a.M("aid: ");
        M.append(this.b.getAid());
        Log.d("mIFeedbackCommonInfo", M.toString());
        return this.b.getAid();
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public String getAppId() throws RemoteException {
        Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo = this.b;
        if (iFeedbackCommonInfo == null || TextUtils.isEmpty(iFeedbackCommonInfo.getAppId())) {
            com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
            if (dVar != null) {
                return dVar.getAppId();
            }
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("appId: ");
        M.append(this.b.getAppId());
        Log.d("mIFeedbackCommonInfo", M.toString());
        return this.b.getAppId();
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public String getChannel() throws RemoteException {
        Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo = this.b;
        if (iFeedbackCommonInfo == null || TextUtils.isEmpty(iFeedbackCommonInfo.getChannel())) {
            com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
            if (dVar != null) {
                return dVar.getChannel();
            }
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("channel: ");
        M.append(this.b.getChannel());
        Log.d("mIFeedbackCommonInfo", M.toString());
        return this.b.getChannel();
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public String getDid() throws RemoteException {
        Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo = this.b;
        if (iFeedbackCommonInfo == null || TextUtils.isEmpty(iFeedbackCommonInfo.getDid())) {
            com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
            if (dVar != null) {
                return dVar.getDid();
            }
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("did: ");
        M.append(this.b.getDid());
        Log.d("mIFeedbackCommonInfo", M.toString());
        return this.b.getDid();
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public String getUpdateVersionCode() throws RemoteException {
        Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo = this.b;
        if (iFeedbackCommonInfo == null || TextUtils.isEmpty(iFeedbackCommonInfo.getUpdateVersionCode())) {
            com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
            if (dVar != null) {
                return dVar.getUpdateVersionCode();
            }
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("UpdateVersionCode: ");
        M.append(this.b.getUpdateVersionCode());
        Log.d("mIFeedbackCommonInfo", M.toString());
        return this.b.getUpdateVersionCode();
    }

    @Override // com.bytedance.feedbackerlib.service.d
    public String getUserId() throws RemoteException {
        Feedbacker.IFeedbackCommonInfo iFeedbackCommonInfo = this.b;
        if (iFeedbackCommonInfo == null || TextUtils.isEmpty(iFeedbackCommonInfo.getUserId())) {
            com.bytedance.feedbackerlib.service.d dVar = this.f4915e;
            if (dVar != null) {
                return dVar.getUserId();
            }
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("userId: ");
        M.append(this.b.getUserId());
        Log.d("mIFeedbackCommonInfo", M.toString());
        return this.b.getUserId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this);
    }

    protected FeedbackCommonInfo(Parcel parcel) {
        com.bytedance.feedbackerlib.model.a aVar;
        com.bytedance.feedbackerlib.service.d n0 = d.a.n0(parcel.readStrongBinder());
        this.f4915e = n0;
        if (n0 != null) {
            try {
                aVar = new com.bytedance.feedbackerlib.model.a(this, n0.getAid(), n0.getAppId(), n0.getDid(), n0.getUpdateVersionCode(), n0.getChannel(), n0.getALogFilesDir());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.b = aVar;
            this.f4913c = null;
            this.f4914d = null;
        }
        aVar = null;
        this.b = aVar;
        this.f4913c = null;
        this.f4914d = null;
    }
}
