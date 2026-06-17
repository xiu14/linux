package com.vivo.push.b;

import com.heytap.msp.push.callback.INotificationPermissionCallback;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a extends c {
    private ArrayList<String> a;

    public a(boolean z, String str, ArrayList<String> arrayList) {
        super(z ? INotificationPermissionCallback.CODE_HAD_PERMISSION : INotificationPermissionCallback.CODE_SHOWING, str);
        this.a = arrayList;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("tags", this.a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final String toString() {
        return "AliasCommand:" + b();
    }
}
