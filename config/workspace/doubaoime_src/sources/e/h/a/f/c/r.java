package e.h.a.f.c;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class r extends e.h.a.f.a implements e.h.a.j.b.a {
    private e.h.a.d.i b;

    /* renamed from: c, reason: collision with root package name */
    private File f9956c = null;

    @Override // e.h.a.j.b.a
    public List<String> a() {
        ArrayList arrayList = new ArrayList(1);
        File file = this.f9956c;
        if (file != null) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // e.h.a.f.a
    public String f() {
        return MonitorConstants.CUSTOM;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[Catch: IOException -> 0x00ea, TRY_LEAVE, TryCatch #2 {IOException -> 0x00ea, blocks: (B:60:0x00e6, B:53:0x00ee), top: B:59:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    @Override // e.h.a.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(e.h.a.e.a r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.f.c.r.g(e.h.a.e.a):boolean");
    }
}
