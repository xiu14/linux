package ms.bd.c;

import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class l2 extends r2 {
    public a a;
    public long b;

    public final class a implements com.bytedance.retrofit2.S.a {
        public final t4 a = new t4();

        public a() {
        }

        public static String b(String str) {
            try {
                String query = new URL(str).getQuery();
                HashMap hashMap = new HashMap();
                if (query != null) {
                    for (String str2 : query.split(ContainerUtils.FIELD_DELIMITER)) {
                        String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (split.length == 2) {
                            hashMap.put(split[0], split[1]);
                        }
                    }
                }
                return (hashMap.isEmpty() || !hashMap.containsKey(WsConstants.KEY_APP_ID)) ? "" : (String) hashMap.get(WsConstants.KEY_APP_ID);
            } catch (Exception unused) {
                return "";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0097 A[Catch: all -> 0x0574, TryCatch #3 {, blocks: (B:87:0x0043, B:89:0x0049, B:93:0x0055, B:95:0x0065, B:98:0x0070, B:100:0x0080, B:103:0x008b, B:104:0x0091, B:106:0x0097, B:110:0x00aa, B:114:0x00b7, B:118:0x00c4), top: B:86:0x0043 }] */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0448 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x03b5 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v55 */
        @Override // com.bytedance.retrofit2.S.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.bytedance.retrofit2.N a(com.bytedance.retrofit2.S.a.InterfaceC0308a r26) {
            /*
                Method dump skipped, instructions count: 1405
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.l2.a.a(com.bytedance.retrofit2.S.a$a):com.bytedance.retrofit2.N");
        }

        public final void c(String str, String str2) {
            com.bytedance.mobsec.metasec.ml.c a;
            try {
                String b = b(str2);
                if (TextUtils.isEmpty(b) || (a = com.bytedance.mobsec.metasec.ml.a.a(b)) == null) {
                    return;
                }
                for (String str3 : this.a.keySet()) {
                    if (str.contains(str3)) {
                        a.a((String) this.a.get(str3), "");
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(long j) {
        this.b = j;
        a aVar = new a();
        this.a = aVar;
        RetrofitUtils.a(aVar);
    }

    public final void finalize() {
        RetrofitUtils.k(this.a);
        super.finalize();
    }
}
