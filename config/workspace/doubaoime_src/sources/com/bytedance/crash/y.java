package com.bytedance.crash;

import com.bytedance.apm.z.a;
import com.bytedance.crash.x;
import java.util.Map;

/* loaded from: classes.dex */
final class y implements a.c {

    class a implements x.a {
        final /* synthetic */ a.InterfaceC0131a a;

        a(y yVar, a.InterfaceC0131a interfaceC0131a) {
            this.a = interfaceC0131a;
        }
    }

    y() {
    }

    @Override // com.bytedance.apm.z.a.c
    public void a(Map<String, String> map) {
        x.b(map);
    }

    @Override // com.bytedance.apm.z.a.c
    public void b(a.InterfaceC0131a interfaceC0131a) {
        x.a(new a(this, interfaceC0131a));
    }
}
