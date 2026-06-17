package com.bytedance.bdinstall.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.common.utility.NetworkUtils;

/* loaded from: classes.dex */
class i extends BroadcastReceiver {
    final /* synthetic */ j a;

    i(j jVar) {
        this.a = jVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2;
        NetworkUtils.NetworkType networkType;
        context2 = this.a.a;
        NetworkUtils.NetworkType unused = j.f4110d = NetworkUtils.e(context2);
        networkType = j.f4110d;
        networkType.name();
        int i = C0640u.a;
    }
}
