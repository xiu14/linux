package ms.bd.c;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.N;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q4 extends q2 {
    public static int c(InterfaceC0701e interfaceC0701e, N n) {
        if (interfaceC0701e == null || n == null) {
            return 80004;
        }
        if (!(interfaceC0701e instanceof com.bytedance.retrofit2.q)) {
            return 80005;
        }
        ((com.bytedance.retrofit2.q) interfaceC0701e).doCollect();
        com.bytedance.retrofit2.client.c h = n.h();
        if (h == null) {
            return 80006;
        }
        Object b = h.b();
        if (!(b instanceof com.bytedance.ttnet.i.b)) {
            return 80007;
        }
        com.bytedance.ttnet.i.b bVar = (com.bytedance.ttnet.i.b) b;
        if (bVar != null) {
            return d(bVar.A);
        }
        return 80008;
    }

    public static int d(String str) {
        if (str == null || "" == str) {
            return 80000;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject((String) y2.a(16777217, 0, 0L, "068a89", new byte[]{35, 53, 88, 16}));
            if (jSONObject == null) {
                return 80001;
            }
            String string = jSONObject.getString((String) y2.a(16777217, 0, 0L, "e572de", new byte[]{103, 35, 69, 82, 78, 97}));
            if (string != null && ((String) y2.a(16777217, 0, 0L, "f8a77a", new byte[]{68, 15, 49, 96, 45, 69, 86})) != string) {
                return jSONObject.getInt((String) y2.a(16777217, 0, 0L, "c40d00", new byte[]{124, 51, 87, 47, 10, 53, 114, 26, 115}));
            }
            return 80002;
        } catch (Throwable unused) {
            return 80003;
        }
    }

    public static String e(List list) {
        if (list != null && list.size() > 0) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.bytedance.retrofit2.client.b bVar = (com.bytedance.retrofit2.client.b) it2.next();
                if (bVar != null && ((String) y2.a(16777217, 0, 0L, "53ec95", new byte[]{60, 124, 2, 3, 75, 46, 57, 21, 61, 55})).equalsIgnoreCase(bVar.a())) {
                    return bVar.b();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x045b A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:62:0x0426, B:65:0x042d, B:68:0x0434, B:71:0x043b, B:74:0x0442, B:77:0x0449, B:80:0x0450, B:83:0x0457, B:85:0x045b, B:90:0x0475, B:91:0x047f, B:93:0x04b6, B:95:0x04c5, B:98:0x04c8, B:112:0x04ce, B:115:0x04e1, B:119:0x051e, B:120:0x051f, B:97:0x04c6), top: B:61:0x0426, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b6 A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:62:0x0426, B:65:0x042d, B:68:0x0434, B:71:0x043b, B:74:0x0442, B:77:0x0449, B:80:0x0450, B:83:0x0457, B:85:0x045b, B:90:0x0475, B:91:0x047f, B:93:0x04b6, B:95:0x04c5, B:98:0x04c8, B:112:0x04ce, B:115:0x04e1, B:119:0x051e, B:120:0x051f, B:97:0x04c6), top: B:61:0x0426, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] f(java.lang.String r43, byte[] r44, java.lang.String r45, java.lang.String r46, java.util.HashMap r47, java.lang.String r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.q4.f(java.lang.String, byte[], java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, boolean):java.lang.Object[]");
    }

    public static int g(InterfaceC0701e interfaceC0701e, N n) {
        com.bytedance.ttnet.i.b bVar;
        if (interfaceC0701e == null || n == null || !(interfaceC0701e instanceof com.bytedance.retrofit2.q)) {
            return -1;
        }
        ((com.bytedance.retrofit2.q) interfaceC0701e).doCollect();
        com.bytedance.retrofit2.client.c h = n.h();
        if (h == null) {
            return -1;
        }
        Object b = h.b();
        if (!(b instanceof com.bytedance.ttnet.i.b) || (bVar = (com.bytedance.ttnet.i.b) b) == null) {
            return -1;
        }
        return h(bVar.A);
    }

    public static int h(String str) {
        if (str != null && "" != str) {
            try {
                return new JSONObject(str).getJSONObject((String) y2.a(16777217, 0, 0L, "2f1d8d", new byte[]{49, 97, 81, 0, 8, 125, 34, 66})).getInt((String) y2.a(16777217, 0, 0L, "ca1c12", new byte[]{113, 108, 70, 18}));
            } catch (Throwable unused) {
                return -1;
            }
        }
        return -1;
    }
}
