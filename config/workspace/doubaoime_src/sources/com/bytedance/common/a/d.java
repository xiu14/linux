package com.bytedance.common.a;

import android.app.Application;
import android.util.Log;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.ad_test.api.AbConfig;
import com.bytedance.dataplatform.m;
import com.bytedance.dataplatform.q;
import com.bytedance.dataplatform.r;
import java.lang.reflect.Type;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d {

    public static final class a implements r {
        a() {
        }

        @Override // com.bytedance.dataplatform.r
        public <T> T a(String str, Type type, T t) {
            l.f(type, "tClass");
            return null;
        }
    }

    public static final class b implements q {
        b() {
        }

        @Override // com.bytedance.dataplatform.q
        public <T> T a(String str, Type type) {
            IAppGlobals.a.j("ImeAbTestManager", "[ISerializationService] parseObject input=" + str + " clazz=" + type);
            if (str == null || type == null) {
                return null;
            }
            return (T) e.b.e.a.a.a.a.a(str, type);
        }
    }

    public static final void a(Application application) {
        l.f(application, "application");
        IAppGlobals.a.j("ImeAbTestManager", "[init]");
        Log.i("ImeAbTestManager", "ImeAbTestManager [init]");
        c cVar = new com.bytedance.dataplatform.t.c() { // from class: com.bytedance.common.a.c
        };
        int i = m.m;
        com.bytedance.dataplatform.t.b.e(cVar, true, true);
        m.k(application, "https://abtest-ch.snssdk.com/common", true, new a(), new b(), com.bytedance.common.a.a.a, new com.bytedance.common.a.b(application));
        m.l(true);
        AbConfig.INSTANCE.initAbtestPanel();
    }
}
