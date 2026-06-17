package com.bytedance.android.service.manager.permission.boot;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.common.push.e.i;

/* loaded from: classes.dex */
public interface IOriginSysDialog extends i {
    int getPushType();

    void onActivityResult(int i, int i2, Intent intent);

    @Override // com.bytedance.common.push.e.i
    /* synthetic */ void onRequestResult(boolean z, String str);

    @Override // com.bytedance.common.push.e.i
    /* synthetic */ void onUserAgree(boolean z);

    @Override // com.bytedance.common.push.e.i
    /* synthetic */ void onUserReject();

    void showOriginSysDialog(Activity activity, i iVar);
}
