package com.bytedance.bdinstall.m0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.m0.m;

/* loaded from: classes.dex */
final class j implements m {
    j() {
    }

    @Override // com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        try {
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (acquireContentProviderClient == null) {
                return null;
            }
            Bundle call = acquireContentProviderClient.call("getOAID", null, null);
            acquireContentProviderClient.close();
            if (call == null) {
                return null;
            }
            if (call.getInt("code", -1) == 0) {
                m.a aVar = new m.a();
                aVar.a = call.getString("id");
                return aVar;
            }
            if (!TextUtils.isEmpty(call.getString("message"))) {
                int i = C0640u.a;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        return Build.VERSION.SDK_INT > 28;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Nubia";
    }
}
