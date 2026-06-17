package com.bytedance.android.service.manager.permission.boot;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import e.a.a.a.a;

/* loaded from: classes.dex */
public class AlertRequestParam {
    public String permissionRequestTipsContent;
    public String permissionRequestTipsTitle;

    public boolean needShowBannerTips() {
        return (TextUtils.isEmpty(this.permissionRequestTipsTitle) || TextUtils.isEmpty(this.permissionRequestTipsContent)) ? false : true;
    }

    @NonNull
    public String toString() {
        StringBuilder M = a.M("permissionRequestTipsTitle:");
        M.append(this.permissionRequestTipsTitle);
        M.append(" permissionRequestTipsContent:");
        M.append(this.permissionRequestTipsContent);
        return M.toString();
    }
}
