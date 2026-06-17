package e.h.a.f.c;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e extends e.h.a.f.a {
    @Override // e.h.a.f.a
    public String f() {
        return "data_clear";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        File file;
        boolean g2;
        JSONObject jSONObject = new JSONObject(aVar.c());
        if (e(jSONObject, aVar)) {
            return true;
        }
        String optString = jSONObject.optString("rootNode");
        String optString2 = jSONObject.optString("relativeDirName");
        int i = com.monitor.cloudmessage.utils.a.b;
        Context e2 = e.h.a.a.g().e();
        optString.hashCode();
        char c2 = 65535;
        switch (optString.hashCode()) {
            case -1481211727:
                if (optString.equals("data_package")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1427366653:
                if (optString.equals("sd_package_file")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1301710629:
                if (optString.equals("sd_package_cache")) {
                    c2 = 2;
                    break;
                }
                break;
            case -540898700:
                if (optString.equals("data_package_cache")) {
                    c2 = 3;
                    break;
                }
                break;
            case 70125656:
                if (optString.equals("sd_package")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1506669642:
                if (optString.equals("data_package_file")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        String str = null;
        String absolutePath = c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? c2 != 5 ? null : new File(e2.getFilesDir(), optString2).getAbsolutePath() : new File(e2.getExternalFilesDir(null).getParentFile(), optString2).getAbsolutePath() : new File(e2.getCacheDir(), optString2).getAbsolutePath() : new File(e2.getExternalCacheDir(), optString2).getAbsolutePath() : new File(e2.getExternalFilesDir(null), optString2).getAbsolutePath() : new File(e2.getFilesDir().getParentFile(), optString2).getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            file = null;
            str = "目录名为空";
        } else {
            file = new File(absolutePath);
            if (!file.exists()) {
                str = "文件/目录不存在";
            }
        }
        if (!TextUtils.isEmpty(str)) {
            h(str, aVar);
            return true;
        }
        int optInt = jSONObject.optInt("deleteStrategy", 0);
        if (optInt == 0) {
            g2 = file.isDirectory() ? com.monitor.cloudmessage.utils.a.g(file.getAbsolutePath()) : file.delete();
        } else {
            if (optInt != 1) {
                h("数据清理策略不合法", aVar);
                return true;
            }
            long optLong = jSONObject.optLong("expiration_time", -1L);
            if (optLong < 0) {
                h("数据清理过期时间为空", aVar);
            } else if (file.isDirectory()) {
                g2 = true;
                for (File file2 : file.listFiles()) {
                    if (file2.lastModified() < optLong * 1000) {
                        g2 = g2 && file.delete();
                    }
                }
            } else if (file.lastModified() < optLong * 1000) {
                g2 = file.delete();
            }
            g2 = true;
        }
        if (g2) {
            j(aVar);
        } else {
            h("数据删除失败(部分文件执行delete操作失败)", aVar);
        }
        return true;
    }
}
