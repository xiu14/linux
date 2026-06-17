package com.bytedance.bdinstall.i0;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.m0.w.e;

/* loaded from: classes.dex */
public class a extends e.a {
    private volatile String a = "";

    @Override // com.bytedance.bdinstall.m0.w.e
    public void E(int i, Bundle bundle) throws RemoteException {
        String str = "honor# OAIDCallBack handleResult retCode= " + i + " retInfo= " + bundle;
        int i2 = C0640u.a;
        if (i != 0 || bundle == null) {
            return;
        }
        this.a = bundle.getString("oa_id_flag");
    }

    public String b0() {
        return this.a;
    }

    @Override // com.bytedance.bdinstall.m0.w.e
    public void j(int i, long j, boolean z, float f2, double d2, String str) throws RemoteException {
    }
}
