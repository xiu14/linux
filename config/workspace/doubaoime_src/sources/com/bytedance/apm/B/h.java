package com.bytedance.apm.B;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ int[] b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f3255c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f3256d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ThreadGroup f3257e;

    h(boolean z, int[] iArr, String str, int i, ThreadGroup threadGroup) {
        this.a = z;
        this.b = iArr;
        this.f3255c = str;
        this.f3256d = i;
        this.f3257e = threadGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        boolean z;
        if (!this.a) {
            int i2 = this.b[0];
            i = i.j;
            if (i2 >= i) {
                z = i.i;
                if (z) {
                    int[] iArr = this.b;
                    Thread[] threadArr = new Thread[(iArr[0] / 2) + iArr[0]];
                    iArr[0] = this.f3257e.enumerate(threadArr);
                    StringBuilder sb = new StringBuilder();
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i3 >= iArr2[0]) {
                            try {
                                com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.d("thread", "", false, null, null, i.n(this.f3255c, this.f3256d, iArr2[0], sb.toString())));
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        } else {
                            String name = threadArr[i3].getName();
                            if (!TextUtils.isEmpty(name)) {
                                sb.append(name);
                                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        try {
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.d("thread", "", false, null, null, i.n(this.f3255c, this.f3256d, this.b[0], null)));
        } catch (Exception unused2) {
        }
    }
}
