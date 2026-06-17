package com.bytedance.crash.ensure;

import com.bytedance.crash.C0650e;
import com.bytedance.crash.monitor.l;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.services.apm.api.a;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public class EnsureApi {
    private static boolean a = false;

    public static void a() {
        if (a) {
            return;
        }
        a = true;
        try {
            IEnsure iEnsure = new IEnsure() { // from class: com.bytedance.crash.ensure.EnsureApi.1
                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z, String str) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotEmpty(Collection collection) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotNull(Object obj) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotNull(Object obj, String str) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere() {
                    l.d().i(5);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z, String str) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(int i, Throwable th, String str) {
                    ensureNotReachHere(th, str);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(String str) {
                    l.d().j(str, 5);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(Throwable th) {
                    ensureNotReachHere(th);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(String str, Map<String, String> map) {
                    l.d().k(str, map, 5);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(Throwable th, String str) {
                    ensureNotReachHere(th, str);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th) {
                    if (C0650e.a(th)) {
                        return;
                    }
                    l.d().n(th);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th, String str) {
                    if (C0650e.a(th)) {
                        return;
                    }
                    l.d().m(str, null, th, "core_exception_monitor");
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
                    if (C0650e.a(th)) {
                        return;
                    }
                    l.d().m(str, map, th, "core_exception_monitor");
                }
            };
            c.d(IEnsure.class, iEnsure);
            a.g(iEnsure);
        } catch (Throwable unused) {
        }
    }
}
