package com.bytedance.apm.C;

import com.bytedance.apm.D.b;
import com.bytedance.apm.internal.ApmDelegate;

/* loaded from: classes.dex */
public class a implements b {
    @Override // com.bytedance.apm.D.b
    public boolean a(String str, String str2) {
        return com.bytedance.apm.B.b.a().c(str, str2);
    }

    @Override // com.bytedance.apm.D.b
    public boolean b(String str) {
        return ApmDelegate.i().k(str);
    }

    @Override // com.bytedance.apm.D.b
    public boolean c(String str) {
        return com.bytedance.apm.B.b.a().d(str);
    }

    @Override // com.bytedance.apm.D.b
    public boolean d(String str) {
        return com.bytedance.apm.B.b.a().b(str);
    }

    @Override // com.bytedance.apm.D.b
    public boolean getServiceSwitch(String str) {
        return ApmDelegate.i().l(str);
    }
}
