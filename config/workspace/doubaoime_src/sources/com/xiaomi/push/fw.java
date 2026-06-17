package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes2.dex */
public class fw implements fu {
    private fu a;

    private static class a {
        private static fw a = new fw();
    }

    public static fw a() {
        return a.a;
    }

    private fw() {
    }

    @Override // com.xiaomi.push.fu
    public void a(ft ftVar) {
        fu fuVar = this.a;
        if (fuVar != null) {
            fuVar.a(ftVar);
        }
    }

    @Override // com.xiaomi.push.fu
    public void a(String str, Map<String, Object> map) {
        fu fuVar = this.a;
        if (fuVar != null) {
            fuVar.a(str, map);
        }
    }
}
