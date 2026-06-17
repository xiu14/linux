package e.h.a.f.c;

import java.io.File;

/* loaded from: classes2.dex */
public class p extends e.h.a.f.a {
    @Override // e.h.a.f.a
    public String f() {
        return "sp";
    }

    @Override // e.h.a.f.a
    public synchronized boolean g(e.h.a.e.a aVar) throws Exception {
        File m = com.bytedance.feedbackerlib.a.m(e.h.a.a.g().e());
        if (m == null) {
            h("sp文件拷贝失败", aVar);
            return true;
        }
        e.h.a.i.a.a().d(aVar, m.getParentFile(), "default_sp_file_type");
        return true;
    }
}
