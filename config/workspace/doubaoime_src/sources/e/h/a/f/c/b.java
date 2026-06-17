package e.h.a.f.c;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends e.h.a.f.a {
    private e.h.a.d.c b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f9949c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private volatile long f9950d = 0;

    @Override // e.h.a.f.a
    public String f() {
        return "alog";
    }

    @Override // e.h.a.f.a
    public synchronized boolean g(e.h.a.e.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.c());
        if (this.b == null) {
            boolean F = com.bytedance.apm.g.F();
            String i = com.bytedance.apm.g.i();
            if (i == null) {
                i = "";
            }
            com.bytedance.feedbackerlib.a.A0(aVar.b(), F ? "主进程收到命令，未设置ALog回捞组件。请宿主应用检查是否在合适时机设置ALog回捞组件。" : "子进程\"$processName\"收到命令，等待主进程活跃后上报。".replace("$processName", i), 0, null);
            return false;
        }
        if (System.currentTimeMillis() - this.f9950d < 180000) {
            e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, aVar.b(), null);
            bVar.h(0);
            bVar.i("3分钟内不重复执行alog回捞");
            e.h.a.j.a.c(bVar);
            return false;
        }
        this.f9950d = System.currentTimeMillis();
        List<String> b = this.b.b(jSONObject.optLong("fetch_start_time", (System.currentTimeMillis() / 1000) - 18000), jSONObject.optLong("fetch_end_time", System.currentTimeMillis() / 1000), jSONObject);
        e.h.a.e.c c2 = this.b.c();
        if (b == null || b.size() == 0) {
            e.h.a.d.c cVar = this.b;
            if ((cVar instanceof e.h.a.d.b) && (b = ((e.h.a.d.b) cVar).e()) != null && b.size() != 0) {
                c2 = e.h.a.e.c.a(true, "兜底策略数据", c2.c());
            }
        }
        if (b != null && b.size() != 0 && c2.d()) {
            this.f9949c.clear();
            this.f9949c.addAll(b);
            File b2 = e.h.a.i.a.a().b();
            if (b2 == null) {
                throw new e.h.a.e.b("pending目录因拿不到context而未设置");
            }
            File file = new File(b2, aVar.b() + "temp");
            if (file.exists()) {
                com.monitor.cloudmessage.utils.a.d(file);
            }
            file.mkdirs();
            File file2 = new File(file, aVar.b() + "-cloudMsg.zip");
            if (file2.exists()) {
                file2.delete();
            }
            String[] strArr = (String[]) b.toArray(new String[b.size()]);
            com.monitor.cloudmessage.utils.a.b(file2.getAbsolutePath(), strArr);
            com.bytedance.feedbackerlib.a.A0(aVar.b(), "Alog回捞:" + Arrays.toString(strArr) + " ErrMsg=" + c2.b(), 0, c2.c());
            e.h.a.i.a.a().d(aVar, file, "log_agile");
        } else if (!c2.d()) {
            i(c2.b(), c2.c(), aVar);
        }
        return true;
    }

    public void k(e.h.a.d.c cVar) {
        this.b = cVar;
    }
}
