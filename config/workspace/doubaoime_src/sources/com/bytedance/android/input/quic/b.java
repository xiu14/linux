package com.bytedance.android.input.quic;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.r.j;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Objects;
import kotlin.e;
import kotlin.g;
import kotlin.s.c.l;
import kotlin.s.c.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static final b a = null;
    private static final e b = kotlin.a.c(a.a);

    static final class a extends m implements kotlin.s.b.a<ImeNetSDK> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ImeNetSDK invoke() {
            ImeNetSDK imeNetSDK = new ImeNetSDK();
            b bVar = b.a;
            j.m("ImeQuic", "init start--");
            JSONObject jSONObject = new JSONObject();
            Objects.requireNonNull(IAppGlobals.a);
            int on_init = imeNetSDK.on_init(jSONObject.toString());
            e.a.a.a.a.k0("init start ", on_init, "ImeQuic");
            if (on_init != 0) {
                e.a.a.a.a.k0("init failed: ", on_init, "ImeQuic");
            } else {
                imeNetSDK.set_callback(new com.bytedance.android.input.quic.a());
            }
            return imeNetSDK;
        }
    }

    public static final g<String, String> a(String str, long j) {
        String exc;
        String call;
        l.f(str, RemoteMessageConst.DATA);
        j.i("ImeQuic", "call timeout : " + j + " data : " + str);
        String str2 = "";
        if (j == 0) {
            call = "{\"code\":90100,\"msg\":\"sdk call timeout.\"}";
        } else {
            try {
                call = d().call(str, (int) j);
                l.e(call, "mQuicHandle.call(data, timeout.toInt())");
            } catch (Exception e2) {
                exc = e2.toString();
                e.a.a.a.a.o0("call failed : ", e2, "ImeQuic");
            }
        }
        exc = "";
        str2 = call;
        j.i("ImeQuic", "call response : " + str2);
        return new g<>(str2, exc);
    }

    public static final void b() {
        j.m("ImeQuic", "init close--");
        int on_close = d().on_close();
        e.a.a.a.a.k0("init close ", on_close, "ImeQuic");
        if (on_close != 0) {
            e.a.a.a.a.k0("close failed: ", on_close, "ImeQuic");
        }
    }

    public static final boolean c() {
        if (!(((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0)) {
            j.m("ImeQuic", "not full input mode do not connect quic");
            return false;
        }
        int on_connect = d().on_connect(true);
        e.a.a.a.a.k0("on_connect ", on_connect, "ImeQuic");
        if (on_connect == 0) {
            return true;
        }
        e.a.a.a.a.k0("conn failed: ", on_connect, "ImeQuic");
        return false;
    }

    private static final ImeNetSDK d() {
        return (ImeNetSDK) b.getValue();
    }
}
