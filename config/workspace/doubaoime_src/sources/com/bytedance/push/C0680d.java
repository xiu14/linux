package com.bytedance.push;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bytepoet.push.BytePoetConfig;

/* renamed from: com.bytedance.push.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0680d implements com.ss.android.g.c {
    private final boolean a;

    public C0680d(boolean z, String str) {
        this.a = z;
    }

    void a(Application application) {
        boolean z;
        String packageName = application.getPackageName();
        if (this.a) {
            try {
                Class.forName("com.bytedance.bytepoet.push.BytePoetConfig");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                com.bytedance.push.g0.f.c("init", "i18n version，configuration not exist。ignore!");
                return;
            }
        }
        if (!TextUtils.equals(packageName, BytePoetConfig.PACKAGE_NAME)) {
            throw new IllegalArgumentException("packageName is different between configuration");
        }
        if (BytePoetConfig.SUPPORT_SDK_VERSION < 1) {
            throw new IllegalArgumentException("configuration version mismatch，please go to [https://appcloud.bytedance.net/client-sdk/config] and generate new configuration again");
        }
    }

    public Pair<String, String> b() {
        return new Pair<>(C0682f.MZ_PUSH_APP_ID, C0682f.MZ_PUSH_APP_KEY);
    }
}
