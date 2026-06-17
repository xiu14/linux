package e.h.a.f.c;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class i extends e.h.a.f.a implements e.h.a.j.b.a {
    private File b = null;

    @Override // e.h.a.j.b.a
    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        File file = this.b;
        if (file != null) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // e.h.a.f.a
    public String f() {
        return "net_flow";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c A[Catch: IOException -> 0x0108, TRY_LEAVE, TryCatch #0 {IOException -> 0x0108, blocks: (B:58:0x0104, B:49:0x010c), top: B:57:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // e.h.a.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(e.h.a.e.a r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.f.c.i.g(e.h.a.e.a):boolean");
    }
}
