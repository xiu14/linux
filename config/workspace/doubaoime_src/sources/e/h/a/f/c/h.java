package e.h.a.f.c;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class h extends e.h.a.f.a implements e.h.a.j.b.a {
    private e.h.a.d.e b;

    /* renamed from: c, reason: collision with root package name */
    private File f9953c = null;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentLinkedQueue<b> f9954d = new ConcurrentLinkedQueue<>();

    /* renamed from: e, reason: collision with root package name */
    private b f9955e = new b(this, "error_data", "error_ids");

    class a implements com.bytedance.services.apm.api.f {
        a(h hVar) {
        }
    }

    private class b {
        public String a;
        public String b;

        public b(h hVar, String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    @Override // e.h.a.j.b.a
    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        File file = this.f9953c;
        if (file != null) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // e.h.a.f.a
    public String f() {
        return "monitor_log";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c1 A[Catch: IOException -> 0x01bd, TRY_LEAVE, TryCatch #8 {IOException -> 0x01bd, blocks: (B:80:0x01b9, B:71:0x01c1), top: B:79:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // e.h.a.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(e.h.a.e.a r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.f.c.h.g(e.h.a.e.a):boolean");
    }

    public void k(e.h.a.d.e eVar) {
        this.b = eVar;
    }
}
