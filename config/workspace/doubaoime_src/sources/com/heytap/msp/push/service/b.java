package com.heytap.msp.push.service;

import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.mcssdk.d.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    private static final String a = "ParserFactory";
    private final Map<Integer, e> b;

    public static class a {
        private static final b a = new b();
    }

    private b() {
        this.b = new HashMap();
        b();
    }

    public static b a() {
        return a.a;
    }

    private void b() {
        this.b.put(Integer.valueOf(MessageConstant.MessageType.MESSAGE_SPT_ENHANCED_DATA), new com.heytap.msp.push.service.a());
        this.b.put(Integer.valueOf(MessageConstant.MessageType.MESSAGE_SPT_CALLKIT_DATA_BIND), new com.heytap.mcssdk.d.b());
        com.heytap.mcssdk.utils.e.b(a, "Default parsers registered automatically");
    }

    public e a(int i) {
        e eVar = this.b.get(Integer.valueOf(i));
        if (eVar == null) {
            com.heytap.mcssdk.utils.e.d(a, "No parser found for message type: " + i);
        }
        return eVar;
    }
}
