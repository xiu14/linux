package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.d.a.a;
import com.huawei.d.a.g;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private Parcelable f7258c;

    /* renamed from: d, reason: collision with root package name */
    private String f7259d;

    /* renamed from: e, reason: collision with root package name */
    private a f7260e;

    /* renamed from: f, reason: collision with root package name */
    private int f7261f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f7261f = 1;
        this.a = str;
        this.b = str2;
        this.f7258c = null;
        this.f7259d = null;
    }

    protected abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, g<ResultT> gVar);

    public int getApiLevel() {
        return this.f7261f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.f7258c;
    }

    public String getRequestJson() {
        return this.b;
    }

    public a getToken() {
        return this.f7260e;
    }

    public String getTransactionId() {
        return this.f7259d;
    }

    public String getUri() {
        return this.a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, g<ResultT> gVar) {
        if (this.f7260e != null) {
            throw null;
        }
        StringBuilder M = e.a.a.a.a.M("doExecute, uri:");
        M.append(this.a);
        M.append(", errorCode:");
        M.append(responseErrorCode.getErrorCode());
        M.append(", transactionId:");
        M.append(this.f7259d);
        HMSLog.i("TaskApiCall", M.toString());
        doExecute(clientt, responseErrorCode, str, gVar);
    }

    public void setApiLevel(int i) {
        this.f7261f = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f7258c = parcelable;
    }

    public void setToken(a aVar) {
    }

    public void setTransactionId(String str) {
        this.f7259d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f7261f = 1;
        this.a = str;
        this.b = str2;
        this.f7258c = null;
        this.f7259d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.f7258c = null;
        this.f7259d = str3;
        this.f7261f = i;
    }
}
