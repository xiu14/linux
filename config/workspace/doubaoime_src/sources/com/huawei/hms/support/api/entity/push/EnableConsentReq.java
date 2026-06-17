package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class EnableConsentReq implements IMessageEntity {

    @Packed
    private boolean enable;

    @Packed
    private String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toString() {
        StringBuilder R = a.R("ConsentReq{", "packageName:");
        R.append(this.packageName);
        R.append(", enable:");
        return a.L(R, this.enable, '}');
    }
}
