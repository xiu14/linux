package com.vivo.push.b;

import com.heytap.msp.push.callback.INotificationPermissionCallback;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class z extends c {
    private ArrayList<String> a;

    public z(boolean z, String str, ArrayList<String> arrayList) {
        super(z ? INotificationPermissionCallback.CODE_FREQUENT : INotificationPermissionCallback.CODE_UNSUPPORT, str);
        this.a = arrayList;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("tags", (Serializable) this.a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final String toString() {
        return "TagCommand";
    }
}
