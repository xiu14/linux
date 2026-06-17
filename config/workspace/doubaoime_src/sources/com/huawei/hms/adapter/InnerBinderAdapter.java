package com.huawei.hms.adapter;

import android.content.Context;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public class InnerBinderAdapter extends BinderAdapter {
    private static final Object j = new Object();
    private static BinderAdapter k;

    private InnerBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i("InnerBinderAdapter", "InnerBinderAdapter getInstance.");
        synchronized (j) {
            if (k == null) {
                k = new InnerBinderAdapter(context, str, str2);
            }
            binderAdapter = k;
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getConnTimeOut() {
        return INotificationPermissionCallback.CODE_NOT_TOP;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getMsgDelayDisconnect() {
        return INotificationPermissionCallback.CODE_HAD_PERMISSION;
    }
}
