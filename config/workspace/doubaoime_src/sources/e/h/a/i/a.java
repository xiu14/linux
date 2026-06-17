package e.h.a.i;

import com.bytedance.apm.g;
import com.monitor.cloudmessage.utils.NetworkUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    private final Map<String, Boolean> a = new HashMap();
    private volatile File b;

    /* renamed from: e.h.a.i.a$a, reason: collision with other inner class name */
    class C0460a implements FileFilter {
        C0460a(a aVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isFile();
        }
    }

    private static class b {
        private static final a a = new a();
    }

    public static a a() {
        return b.a;
    }

    public File b() {
        if (this.b == null) {
            if (g.h() == null) {
                return null;
            }
            this.b = new File(g.h().getFilesDir(), "cloud_uploading");
        }
        if (this.b != null && !this.b.exists()) {
            this.b.mkdirs();
        }
        return this.b;
    }

    public boolean c(String str) {
        return this.a.get(str) == Boolean.TRUE;
    }

    public synchronized void d(e.h.a.e.a aVar, File file, String str) throws Exception {
        com.bytedance.feedbackerlib.a.A0(aVar.b(), "命令产物已生成，等待上传", 0, null);
        if (this.b != null && !this.b.exists()) {
            this.b.mkdirs();
        }
        String b2 = aVar.b();
        File b3 = b();
        if (b3 == null) {
            throw new e.h.a.e.b("pending目录因拿不到context而未设置");
        }
        File file2 = new File(b3, b2);
        if (file2.exists()) {
            com.monitor.cloudmessage.utils.a.d(file2);
        }
        file.renameTo(file2);
        long c2 = com.bytedance.apm.util.b.c(file2);
        boolean z = true;
        boolean z2 = aVar.f() && c2 > 2097152;
        this.a.put(b2, Boolean.valueOf(z2));
        if (z2 && !NetworkUtils.h(e.h.a.a.g().e())) {
            com.bytedance.feedbackerlib.a.A0(aVar.b(), "产物超过阈值，等待WiFi环境执行. fileTotalSize=" + c2, 0, null);
            return;
        }
        for (File file3 : file2.listFiles(new C0460a(this))) {
            boolean R0 = com.bytedance.feedbackerlib.a.R0(b2, file3, str, "正在上传:" + file3.getName());
            StringBuilder sb = new StringBuilder();
            sb.append("文件上传");
            sb.append(R0 ? "成功" : "失败");
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(file3.getName());
            com.bytedance.feedbackerlib.a.A0(aVar.b(), sb.toString(), 0, null);
            if (!R0) {
                z = false;
            }
        }
        if (z) {
            com.bytedance.feedbackerlib.a.A0(b2, "上传成功", 2, null);
        }
        com.monitor.cloudmessage.utils.a.d(file2);
    }
}
