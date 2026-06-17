package e.h.a.j;

import android.text.TextUtils;
import com.bytedance.apm.g;
import com.bytedance.apm.y.d;
import com.monitor.cloudmessage.utils.NetworkUtils;
import e.h.a.j.c.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a {
    static {
        new ArrayList();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return e.a.a.a.a.s(str, "-cloudMsg.zip");
        }
        return str.substring(0, lastIndexOf) + "-cloudMsg.zip";
    }

    public static void b(e.h.a.j.c.a aVar) {
        if (aVar.j() == null || aVar.j().a().size() == 0) {
            return;
        }
        if (!aVar.g() && (aVar.q() || System.currentTimeMillis() - aVar.d() >= 0) && NetworkUtils.g(e.h.a.a.g().e())) {
            if (!aVar.m()) {
                aVar.u(aVar.j().a());
            } else if (aVar.j().a().size() == 1 || aVar.p()) {
                File file = new File(aVar.j().a().get(0));
                File file2 = new File(file.getParent(), a(file.getName()));
                if (file2.exists()) {
                    file2.delete();
                }
                com.monitor.cloudmessage.utils.a.b(file2.getAbsolutePath(), (String[]) aVar.j().a().toArray(new String[aVar.j().a().size()]));
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(file2.getAbsolutePath());
                aVar.u(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String str : aVar.j().a()) {
                    File file3 = new File(str);
                    File file4 = new File(file3.getParent(), a(file3.getName()));
                    if (file4.exists()) {
                        file4.delete();
                    }
                    com.monitor.cloudmessage.utils.a.b(file4.getAbsolutePath(), str);
                    arrayList2.add(file4.getAbsolutePath());
                }
                aVar.u(arrayList2);
            }
            boolean c2 = e.h.a.j.d.a.c(aVar);
            if (aVar.n() && c2) {
                Iterator<String> it2 = aVar.j().a().iterator();
                while (it2.hasNext()) {
                    File file5 = new File(it2.next());
                    if (file5.exists()) {
                        file5.delete();
                    }
                }
            }
        }
    }

    public static void c(b bVar) {
        if (g.B()) {
            d.b("cloudmessage", "uploadInfo=" + bVar);
        }
        if (TextUtils.isEmpty(bVar.b())) {
            return;
        }
        e.h.a.j.d.a.b(bVar);
    }
}
