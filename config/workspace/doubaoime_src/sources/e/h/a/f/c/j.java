package e.h.a.f.c;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class j extends e.h.a.f.a implements e.h.a.j.b.a {
    private File b = null;

    @Override // e.h.a.j.b.a
    public List<String> a() {
        ArrayList arrayList = new ArrayList(1);
        File file = this.b;
        if (file != null) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // e.h.a.f.a
    public String f() {
        return "network";
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0 A[Catch: IOException -> 0x01bc, TRY_LEAVE, TryCatch #17 {IOException -> 0x01bc, blocks: (B:79:0x01b8, B:73:0x01c0), top: B:78:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7 A[Catch: IOException -> 0x01e3, TRY_LEAVE, TryCatch #11 {IOException -> 0x01e3, blocks: (B:106:0x01df, B:97:0x01e7), top: B:105:0x01df }] */
    @Override // e.h.a.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(e.h.a.e.a r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.f.c.j.g(e.h.a.e.a):boolean");
    }
}
