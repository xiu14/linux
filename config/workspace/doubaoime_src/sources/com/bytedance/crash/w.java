package com.bytedance.crash;

import androidx.annotation.Nullable;
import com.bytedance.crash.Npth;
import com.bytedance.crash.x;
import com.bytedance.crash.y;
import java.util.Map;

/* loaded from: classes.dex */
class w implements AttachUserData {
    final /* synthetic */ x.a a;

    w(Npth.b bVar, x.a aVar) {
        this.a = aVar;
    }

    @Override // com.bytedance.crash.AttachUserData
    @Nullable
    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return ((y.a) this.a).a.a();
    }
}
