package com.bytedance.lego.init.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class b implements Serializable, Comparable<b> {

    @SerializedName(DBDefinition.TASK_ID)
    public String a;

    @SerializedName("moduleName")
    public String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("mustRunInMainThread")
    public boolean f5305c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("runInProcess")
    public List<String> f5306d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName(RemoteMessageConst.Notification.PRIORITY)
    public int f5307e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("delayTime")
    public DelayTime f5308f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("realPriority")
    public int f5309g;

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        int i = this.f5309g;
        int i2 = bVar.f5309g;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        throw null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5309g);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.a);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f5305c);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.b);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f5308f.name());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(this.f5307e);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        List<String> list = this.f5306d;
        if (list == null || list.isEmpty()) {
            str = null;
        } else {
            StringBuilder M = e.a.a.a.a.M("[");
            M.append(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                StringBuilder M2 = e.a.a.a.a.M(Constants.ACCEPT_TIME_SEPARATOR_SP);
                M2.append(list.get(i));
                M.append(M2.toString());
            }
            M.append("]");
            str = M.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
