package e.h.a.f.c;

import com.huawei.hms.push.AttributionReporter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class m extends e.h.a.f.a implements e.h.a.j.b.a {
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
        return AttributionReporter.SYSTEM_PERMISSION;
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        if (e(new JSONObject(aVar.c()), aVar)) {
            return true;
        }
        File b = e.h.a.g.b.a.c.b(e.h.a.a.g().e());
        if (b != null) {
            this.b = b;
            e.h.a.j.a.b(new e.h.a.j.c.a("txt", 0L, false, aVar.b(), this, null));
            return true;
        }
        e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, aVar.b(), null);
        bVar.h(3);
        bVar.i("网络信息文件生成失败");
        e.h.a.j.a.c(bVar);
        return true;
    }
}
