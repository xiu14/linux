package com.bytedance.crash.L;

import android.os.FileObserver;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
class e extends FileObserver {
    final /* synthetic */ com.bytedance.crash.p a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f4407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, String str, int i, com.bytedance.crash.p pVar, String str2) {
        super(str, i);
        this.f4407c = fVar;
        this.a = pVar;
        this.b = str2;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, @Nullable String str) {
        int g2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = null;
        try {
            str2 = this.a.a(this.b, str);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str2) && (g2 = new g(str2).g()) == Process.myPid()) {
            File file = new File(this.f4407c.f4409d, f.g(System.currentTimeMillis(), g2, false));
            File file2 = new File(this.f4407c.f4409d, "from_external_flag");
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (IOException unused2) {
                }
            }
            try {
                com.bytedance.crash.util.a.x(file, str2, false);
            } catch (IOException e2) {
                com.bytedance.crash.Q.b.f("NPTH_ANR_ERROR", e2);
            }
        }
    }
}
