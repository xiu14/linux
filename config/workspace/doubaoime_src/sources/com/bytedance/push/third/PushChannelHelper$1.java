package com.bytedance.push.third;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.android.service.manager.permission.boot.IOriginSysDialog;
import com.bytedance.common.push.e.i;

/* loaded from: classes2.dex */
class PushChannelHelper$1 implements IOriginSysDialog {
    final /* synthetic */ g this$0;
    final /* synthetic */ int val$curBusinessSysAlertType;
    final /* synthetic */ c val$curPushAdapter;
    final /* synthetic */ i val$requestResultCallback;
    final /* synthetic */ String val$scenes;

    PushChannelHelper$1(g gVar, c cVar, String str, int i, i iVar) {
        this.this$0 = gVar;
        this.val$curPushAdapter = cVar;
        this.val$scenes = str;
        this.val$curBusinessSysAlertType = i;
        this.val$requestResultCallback = iVar;
    }

    @Override // com.bytedance.android.service.manager.permission.boot.IOriginSysDialog
    public int getPushType() {
        return ((b) this.val$curPushAdapter).getPushType();
    }

    @Override // com.bytedance.android.service.manager.permission.boot.IOriginSysDialog
    public void onActivityResult(int i, int i2, Intent intent) {
        ((b) this.val$curPushAdapter).onActivityResult(i, i2, intent);
    }

    @Override // com.bytedance.android.service.manager.permission.boot.IOriginSysDialog, com.bytedance.common.push.e.i
    public void onRequestResult(boolean z, String str) {
        i iVar = this.val$requestResultCallback;
        if (iVar != null) {
            iVar.onRequestResult(z, str);
        }
    }

    @Override // com.bytedance.android.service.manager.permission.boot.IOriginSysDialog, com.bytedance.common.push.e.i
    public void onUserAgree(boolean z) {
        i iVar = this.val$requestResultCallback;
        if (iVar != null) {
            iVar.onUserAgree(z);
        }
    }

    @Override // com.bytedance.android.service.manager.permission.boot.IOriginSysDialog, com.bytedance.common.push.e.i
    public void onUserReject() {
        i iVar = this.val$requestResultCallback;
        if (iVar != null) {
            iVar.onUserReject();
        }
    }

    @Override // com.bytedance.android.service.manager.permission.boot.IOriginSysDialog
    public void showOriginSysDialog(Activity activity, i iVar) {
        ((b) this.val$curPushAdapter).requestNotificationPermission(this.val$scenes, this.val$curBusinessSysAlertType, 1, null, iVar);
    }
}
