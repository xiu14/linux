package com.bytedance.lego.init.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;

/* loaded from: classes.dex */
public class c implements Serializable, Comparable<c> {

    @SerializedName(DBDefinition.TASK_ID)
    public String a;

    @SerializedName("moduleName")
    public String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("mustRunInMainThread")
    public boolean f5310c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName(RemoteMessageConst.Notification.PRIORITY)
    public int f5311d;

    @Override // java.lang.Comparable
    public int compareTo(c cVar) {
        int i = this.f5311d;
        int i2 = cVar.f5311d;
        if (i < i2) {
            return 1;
        }
        if (i > i2) {
            return -1;
        }
        throw null;
    }

    public String toString() {
        return this.f5311d + Constants.ACCEPT_TIME_SEPARATOR_SP + this.a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f5310c + Constants.ACCEPT_TIME_SEPARATOR_SP + this.b;
    }
}
