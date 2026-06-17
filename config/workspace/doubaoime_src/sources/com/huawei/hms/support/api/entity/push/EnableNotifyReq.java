package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class EnableNotifyReq implements IMessageEntity {

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
        StringBuilder R = a.R("EnableNotifyReq{", "packageName='");
        a.G0(R, this.packageName, '\'', ", enable=");
        return a.L(R, this.enable, '}');
    }
}
