package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class h extends i {
    private static final String z = "h";
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private boolean v = false;
    private int w = -555;
    private int x = 100;
    private boolean y = false;

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i
    public BaseDispatchAction.DispatchResultEnum k(k kVar, String str, List<String> list) {
        if (Logger.debug()) {
            Logger.d(z, "tc action");
        }
        Uri parse = Uri.parse(str);
        if (this.y || !h(parse)) {
            list.set(0, str);
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        list.set(0, str);
        boolean z2 = true;
        if (this.v) {
            if (Logger.debug()) {
                Logger.d(z, "drop action");
            }
            int i = this.x;
            if (i < 100) {
                if (i > 0) {
                    if (new Random().nextInt(100) >= this.x) {
                        if (Logger.debug()) {
                            Logger.d(z, "tc drop action was probabilistic discard");
                        }
                    }
                }
                z2 = false;
            }
            if (!z2) {
                return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
            }
            list.set(0, "");
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_DROP;
        }
        if (this.r.isEmpty() && this.q.isEmpty() && this.s.isEmpty()) {
            if (TextUtils.isEmpty(this.u) || TextUtils.isEmpty(this.t)) {
                return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
            }
            list.set(0, str.replaceAll(this.t, this.u));
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT;
        }
        if (parse.getScheme() != null) {
            String scheme = parse.getScheme();
            String str2 = this.q;
            if (TextUtils.isEmpty(str2) || (!scheme.equals(str2) && (((!scheme.equals("http") && !scheme.equals("https")) || (!str2.equals("http") && !str2.equals("https"))) && ((!scheme.equals("ws") && !scheme.equals("wss")) || (!str2.equals("ws") && !str2.equals("wss")))))) {
                z2 = false;
            }
            if (z2) {
                str = str.replaceFirst(parse.getScheme(), this.q);
            }
        }
        if (parse.getHost() != null && !TextUtils.isEmpty(this.r)) {
            str = str.replaceFirst(parse.getHost(), this.r);
        }
        if (parse.getPath() != null && !TextUtils.isEmpty(this.s)) {
            str = str.replaceFirst(parse.getPath(), this.s);
        }
        list.set(0, str);
        return BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i
    public int l() {
        return -1;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i
    public int m() {
        return this.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean n(org.json.JSONObject r2, java.util.List<java.lang.Boolean> r3, java.lang.String r4, long r5) {
        /*
            r1 = this;
            r1.i(r2)
            java.lang.String r4 = "service_name"
            java.lang.String r4 = r2.optString(r4)
            r1.l = r4
            java.lang.String r4 = "scheme_replace"
            java.lang.String r4 = r2.optString(r4)
            r1.q = r4
            java.lang.String r4 = "host_replace"
            java.lang.String r4 = r2.optString(r4)
            r1.r = r4
            java.lang.String r4 = "path_replace"
            java.lang.String r4 = r2.optString(r4)
            r1.s = r4
            java.lang.String r4 = "replace"
            java.lang.String r4 = r2.optString(r4)
            r1.u = r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L4e
            java.lang.String r4 = "regex"
            java.lang.String r4 = r2.optString(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L40
            goto L45
        L40:
            java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L45
            r0 = r6
            goto L46
        L45:
            r0 = r5
        L46:
            if (r0 == 0) goto L4b
            r1.t = r4
            goto L4e
        L4b:
            r1.y = r6
            return r6
        L4e:
            java.lang.String r4 = "drop"
            int r4 = r2.optInt(r4)
            if (r4 != r6) goto L58
            r4 = r6
            goto L59
        L58:
            r4 = r5
        L59:
            r1.v = r4
            r4 = -1
            java.lang.String r0 = "drop_code"
            int r4 = r2.optInt(r0, r4)
            r0 = -555(0xfffffffffffffdd5, float:NaN)
            if (r4 == r0) goto L6e
            r0 = -5559(0xffffffffffffea49, float:NaN)
            if (r4 < r0) goto L70
            r0 = -5551(0xffffffffffffea51, float:NaN)
            if (r4 > r0) goto L70
        L6e:
            r1.w = r4
        L70:
            r4 = 100
            java.lang.String r0 = "possibility"
            int r2 = r2.optInt(r0, r4)
            if (r2 < 0) goto L7e
            if (r2 > r4) goto L7e
            r1.x = r2
        L7e:
            java.util.List<java.lang.String> r2 = r1.b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La6
            java.util.List<java.lang.String> r2 = r1.f5203c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La6
            java.util.List<java.lang.String> r2 = r1.f5204d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La6
            java.util.List<java.lang.String> r2 = r1.f5205e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La6
            java.util.List<java.lang.String> r2 = r1.f5206f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lca
        La6:
            boolean r2 = r1.v
            if (r2 != 0) goto Lcc
            java.lang.String r2 = r1.q
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcc
            java.lang.String r2 = r1.r
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcc
            java.lang.String r2 = r1.s
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcc
            java.lang.String r2 = r1.u
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcc
        Lca:
            r1.y = r6
        Lcc:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3.set(r5, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.h.n(org.json.JSONObject, java.util.List, java.lang.String, long):boolean");
    }
}
