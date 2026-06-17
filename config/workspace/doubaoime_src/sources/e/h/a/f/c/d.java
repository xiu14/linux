package e.h.a.f.c;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends e.h.a.f.a implements e.h.a.j.b.a {
    private File b = null;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f9951c = false;

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
        return MonitorConstants.DB;
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.c());
        if (e(jSONObject, aVar)) {
            return true;
        }
        if (this.f9951c) {
            e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, aVar.b(), null);
            bVar.h(0);
            bVar.i("数据库文件正在处理中");
            e.h.a.j.a.c(bVar);
            return true;
        }
        this.f9951c = true;
        File file = null;
        try {
            file = e.h.a.g.b.a.a.a(e.h.a.a.g().e(), jSONObject.optString("db_name", ""));
        } catch (Throwable unused) {
        }
        this.f9951c = false;
        if (file == null) {
            h("Sqlite文件拷贝失败", aVar);
            return true;
        }
        this.b = file;
        e.h.a.j.c.a aVar2 = new e.h.a.j.c.a(jSONObject.optString("fileContentType", "default_db_file_type"), 0L, false, aVar.b(), this, null);
        aVar2.r(false);
        aVar2.s(true);
        e.h.a.j.a.b(aVar2);
        return true;
    }
}
