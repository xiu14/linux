package kotlinx.coroutines.N0;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.v0;

/* loaded from: classes2.dex */
public final class q {
    public static final q a;
    private static final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f10173c;

    static {
        Object obj;
        q qVar = new q();
        a = qVar;
        b = r.g("kotlinx.coroutines.fast.service.loader", true);
        Objects.requireNonNull(qVar);
        List<? extends p> h = kotlin.x.h.h(kotlin.x.h.a(defpackage.a.b()));
        Iterator it2 = h.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int loadPriority = ((p) next).getLoadPriority();
                do {
                    Object next2 = it2.next();
                    int loadPriority2 = ((p) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        p pVar = (p) obj;
        if (pVar != null) {
            try {
                v0 createDispatcher = pVar.createDispatcher(h);
                if (createDispatcher != null) {
                    f10173c = createDispatcher;
                    return;
                }
            } catch (Throwable th) {
                pVar.hintOnError();
                throw th;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    private q() {
    }
}
