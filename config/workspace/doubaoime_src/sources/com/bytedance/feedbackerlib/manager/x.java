package com.bytedance.feedbackerlib.manager;

import android.net.Uri;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;

/* loaded from: classes.dex */
class x implements TranslucentOnePixelActivity.b {
    final /* synthetic */ boolean a;
    final /* synthetic */ Uri b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f4845c;

    x(k kVar, boolean z, Uri uri) {
        this.f4845c = kVar;
        this.a = z;
        this.b = uri;
    }

    @Override // com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity.b
    public void a(String[] strArr, int[] iArr) {
        if (strArr.length > 0 && "android.permission.READ_EXTERNAL_STORAGE".equals(strArr[0]) && iArr.length > 0 && iArr[0] == 0) {
            k kVar = this.f4845c;
            boolean z = this.a;
            kVar.z0(this.b);
        }
    }
}
