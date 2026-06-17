package e.h.a.f.c;

import java.io.File;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends e.h.a.f.a {
    private long b = 0;

    @Override // e.h.a.f.a
    public String f() {
        return "new_file";
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        File f2;
        JSONObject d2 = aVar.d();
        if (System.currentTimeMillis() - this.b < 120000) {
            com.bytedance.feedbackerlib.a.A0(aVar.b(), "2分钟不重复处理文件回捞", 0, null);
            return false;
        }
        this.b = System.currentTimeMillis();
        String optString = d2.optString("rootNode");
        String optString2 = d2.optString("relativeFilename");
        if (optString2.contains("../")) {
            throw new e.h.a.e.b("it's not allowed to use the form `../` to route in path");
        }
        if (!"systemlib_so".equals(optString)) {
            f2 = com.monitor.cloudmessage.utils.a.f(optString, optString2);
        } else {
            if (!optString2.endsWith(".so") && !optString2.endsWith(".odex") && !optString2.endsWith(".jar") && !optString2.endsWith(".vdex") && !optString2.endsWith(".art")) {
                throw new e.h.a.e.b("非so, jar, odex, vdex, art 文件无权回捞");
            }
            f2 = new File(optString2);
        }
        if (f2 == null) {
            throw new e.h.a.e.b("目录参数解析失败");
        }
        StringBuilder M = e.a.a.a.a.M("handling file upload:");
        M.append(f2.getAbsolutePath());
        com.bytedance.feedbackerlib.a.A0(aVar.b(), M.toString(), 0, null);
        if (!f2.exists()) {
            throw new e.h.a.e.b("文件或目录不存在");
        }
        if (!f2.canRead()) {
            throw new e.h.a.e.b("文件或目录无可读权限");
        }
        if (f2.isDirectory() && com.bytedance.apm.util.b.c(f2) > 134217728) {
            throw new e.h.a.e.b("回捞目录过大，禁止回捞");
        }
        File b = e.h.a.i.a.a().b();
        if (b == null) {
            throw new e.h.a.e.b("pending目录因拿不到context而未设置");
        }
        File file = new File(b, aVar.b() + "_temp");
        int i = com.monitor.cloudmessage.utils.a.b;
        if (file.exists()) {
            com.monitor.cloudmessage.utils.a.g(file.getAbsolutePath());
        }
        file.mkdirs();
        com.monitor.cloudmessage.utils.a.b(new File(file, "result.zip").getAbsolutePath(), f2.getAbsolutePath());
        e.h.a.i.a.a().d(aVar, file, d2.optString("fileContentType", "unknown"));
        return true;
    }
}
