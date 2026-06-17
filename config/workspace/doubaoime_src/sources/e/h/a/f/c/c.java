package e.h.a.f.c;

import android.content.Context;
import com.bytedance.services.slardar.config.IConfigManager;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends e.h.a.f.a {

    class a implements com.bytedance.services.slardar.config.a {
        final /* synthetic */ e.h.a.e.a a;

        a(e.h.a.e.a aVar) {
            this.a = aVar;
        }

        @Override // com.bytedance.services.slardar.config.a
        public void onReady() {
        }

        @Override // com.bytedance.services.slardar.config.a
        public void onRefresh(JSONObject jSONObject, boolean z) {
            try {
                try {
                    c.k(c.this, jSONObject, z, this.a);
                } catch (e.h.a.e.b e2) {
                    c.this.h(e2.getMessage(), this.a);
                } catch (Exception e3) {
                    StringWriter stringWriter = new StringWriter();
                    e3.printStackTrace(new PrintWriter(stringWriter));
                    c.this.h(String.format("系统错误：%s", stringWriter.toString()), this.a);
                }
            } finally {
                ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).unregisterConfigListener(this);
            }
        }
    }

    static void k(c cVar, JSONObject jSONObject, boolean z, e.h.a.e.a aVar) throws Exception {
        JSONObject optJSONObject;
        Objects.requireNonNull(cVar);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("disk")) == null) {
            return;
        }
        List<String> s0 = com.bytedance.android.input.k.b.a.s0(optJSONObject, "compliance_relative_paths");
        ArrayList arrayList = new ArrayList();
        if (!com.bytedance.android.input.k.b.a.e0(s0)) {
            Context e2 = e.h.a.a.g().e();
            for (String str : s0) {
                if (str.contains("internal")) {
                    arrayList.add(str.replace("internal", e2.getFilesDir().getParentFile().getAbsolutePath()));
                } else if (str.contains("external")) {
                    arrayList.add(str.replace("external", e2.getExternalFilesDir(null).getParentFile().getAbsolutePath()));
                }
            }
        }
        JSONObject d2 = aVar.d();
        File f2 = com.monitor.cloudmessage.utils.a.f(d2.optString("rootNode"), d2.optString("relativeDirName"));
        if (f2 == null) {
            throw new e.h.a.e.b("目录参数解析失败");
        }
        StringBuilder M = e.a.a.a.a.M("handling dir upload:");
        M.append(f2.getAbsolutePath());
        com.bytedance.feedbackerlib.a.A0(aVar.b(), M.toString(), 0, null);
        if (!f2.exists()) {
            throw new e.h.a.e.b("目录不存在");
        }
        File b = e.h.a.i.a.a().b();
        if (b == null) {
            throw new e.h.a.e.b("pending目录因拿不到context而未设置");
        }
        File file = new File(b, aVar.b() + "_temp");
        if (file.exists()) {
            com.monitor.cloudmessage.utils.a.g(file.getAbsolutePath());
        }
        file.mkdirs();
        boolean c2 = e.h.a.g.b.a.b.c(f2, new File(file, "dir_tree.txt"), arrayList);
        com.bytedance.apm.y.d.b("cloudmessage", e.a.a.a.a.A("dir tree generate result ", c2));
        if (!c2) {
            throw new e.h.a.e.b("目录树文件生成失败");
        }
        e.h.a.i.a.a().d(aVar, file, "log_dir_tree");
    }

    @Override // e.h.a.f.a
    public String f() {
        return "new_diskdir";
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(new a(aVar));
        return true;
    }
}
