package org.chromium.wschannel;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.B;
import com.ttnet.org.chromium.net.impl.CronetFrontierClient;
import com.ttnet.org.chromium.net.impl.TTServiceInfo;
import com.vivo.push.PushClient;
import java.net.CookieHandler;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.CronetClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static AbstractC0759g o = null;
    private static volatile String p = "";
    private static final String q = UUID.randomUUID().toString();
    private static volatile AtomicInteger r;
    private static volatile int s;
    private IWsChannelClient a;
    private CronetFrontierClient h;
    private B l;
    private e m;
    private org.chromium.wschannel.b n;
    private final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10762c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f10763d = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    private int f10764e = 10000;

    /* renamed from: f, reason: collision with root package name */
    private int f10765f = 10000;

    /* renamed from: g, reason: collision with root package name */
    private Map<Integer, Boolean> f10766g = new ConcurrentHashMap();
    private AtomicBoolean i = new AtomicBoolean(false);
    private volatile int j = -1;
    private volatile boolean k = false;

    /* renamed from: org.chromium.wschannel.a$a, reason: collision with other inner class name */
    final class C0488a extends com.bytedance.frameworks.baselib.network.http.p.b {

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, Object> f10767e;

        /* renamed from: f, reason: collision with root package name */
        private final List<String> f10768f;

        public C0488a(long j, Map<String, Object> map, List<String> list) {
            super(j, a.q);
            this.f10767e = map;
            this.f10768f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.i(a.this)) {
                a.this.f10763d.set(0);
                a.this.i.set(false);
                return;
            }
            int incrementAndGet = a.this.f10763d.incrementAndGet();
            if (Logger.debug()) {
                Logger.d("CronetFrontierConnection", "Fallback to websocket connection, retry attempts:" + incrementAndGet);
            }
            a.this.o();
            a.this.B(this.f10767e, this.f10768f);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("retry_attempts", incrementAndGet);
                jSONObject.put("reason", "connect timeout fallback");
                a.f(a.this, jSONObject, 1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    class b implements CronetFrontierClient.d {
        b() {
        }

        @Override // com.ttnet.org.chromium.net.impl.CronetFrontierClient.d
        public void a(int i, Map<String, String> map, byte[] bArr) {
            if (a.this.f10762c.get()) {
                if (Logger.debug()) {
                    e.a.a.a.a.D0(e.a.a.a.a.N("proxy onReceivedMessage service id:", i, " data length:"), bArr.length, "CronetFrontierConnection");
                }
                a.this.a.onMessage(bArr);
                return;
            }
            if (Logger.debug()) {
                e.a.a.a.a.D0(e.a.a.a.a.N("onReceivedMessage service id:", i, " data length:"), bArr.length, "CronetFrontierConnection");
            }
            WsChannelMsg wsChannelMsg = new WsChannelMsg();
            wsChannelMsg.T(i);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    if (entry.getKey().equals("method_id")) {
                        try {
                            wsChannelMsg.y(Integer.valueOf(entry.getValue()).intValue());
                        } catch (NumberFormatException e2) {
                            StringBuilder M = e.a.a.a.a.M("method_id is not valid: ");
                            M.append(entry.getValue());
                            Logger.e("CronetFrontierConnection", M.toString());
                            e2.printStackTrace();
                        }
                    } else if (entry.getKey().equalsIgnoreCase("payload_encoding")) {
                        wsChannelMsg.J(entry.getValue());
                    } else if (entry.getKey().equalsIgnoreCase("payload_type")) {
                        wsChannelMsg.K(entry.getValue());
                    } else if (entry.getKey().equalsIgnoreCase("msg_id")) {
                        wsChannelMsg.C(entry.getValue());
                    } else if (entry.getKey().equalsIgnoreCase("server_timing")) {
                        wsChannelMsg.R(entry.getValue());
                    } else {
                        WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                        msgHeader.c(entry.getKey());
                        msgHeader.e(entry.getValue());
                        arrayList.add(msgHeader);
                    }
                }
            }
            wsChannelMsg.B(arrayList);
            wsChannelMsg.F(bArr);
            if (wsChannelMsg.g() == null) {
                wsChannelMsg.J("");
            }
            if (wsChannelMsg.i() == null) {
                wsChannelMsg.K("");
            }
            if (Logger.debug()) {
                Logger.d("CronetFrontierConnection", "onReceivedMessage:" + wsChannelMsg);
            }
            a.this.a.onMessage(wsChannelMsg);
        }

        @Override // com.ttnet.org.chromium.net.impl.CronetFrontierClient.d
        public void b(int i, String str) {
            if (Logger.debug()) {
                Logger.d("CronetFrontierConnection", "onServiceReady ServiceId:" + i + " log info:" + str);
            }
            if (!a.this.k) {
                a.this.k = true;
                if (a.this.h != null && a.this.j != -1) {
                    a.this.h.e(a.this.j == 1);
                }
            }
            a.this.f10766g.put(Integer.valueOf(i), Boolean.TRUE);
            if (a.this.t() && a.i(a.this)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", 1);
                    jSONObject.put(WsConstants.KEY_PRIVATE_PROTOCOL_ENABLE, 1);
                    jSONObject.put(WsConstants.KEY_CONNECTION_STATE, 4);
                    jSONObject.put("url", a.p);
                    if (Logger.debug()) {
                        Logger.d("CronetFrontierConnection", "PP onConnectionStateChanged state: 4 url:" + a.p);
                    }
                    a.this.a.onConnection(jSONObject);
                } catch (Throwable unused) {
                }
            }
            a.this.a.onServiceConnectEvent(i, true, "");
        }

        @Override // com.ttnet.org.chromium.net.impl.CronetFrontierClient.d
        public void c(int i, long j, String str, Boolean bool) {
            if (Logger.debug()) {
                Logger.d("CronetFrontierConnection", "onReceivedAck serviceId:" + i + " messageId:" + j + " logInfo:" + str);
            }
        }

        @Override // com.ttnet.org.chromium.net.impl.CronetFrontierClient.d
        public void d(int i, int i2, String str) {
            if (Logger.debug()) {
                e.a.a.a.a.I0(e.a.a.a.a.O("onError ServiceId:", i, " error code:", i2, " info:"), str, "CronetFrontierConnection");
            }
            a.this.a.onServiceConnectEvent(i, false, "");
        }
    }

    static {
        CronetFrontierClient.TransportMode transportMode = CronetFrontierClient.TransportMode.QUIC;
        r = new AtomicInteger(0);
        s = -1;
    }

    public a(IWsChannelClient iWsChannelClient) {
        this.a = iWsChannelClient;
        this.m = new e(iWsChannelClient);
        try {
            Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
            Reflect.on(newInstance).call("getInitCompletedLatch");
            Reflect.on(newInstance).call("preInitCronetKernel");
        } catch (Throwable th) {
            th.printStackTrace();
            if (Logger.debug()) {
                Logger.d("CronetFrontierConnection", "TTNet init failed, cronet engine is null.");
            }
        }
        o = CronetClient.getCronetEngine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Map<String, Object> map, List<String> list) {
        this.b.set(false);
        this.f10762c.set(false);
        r.incrementAndGet();
        Object obj = map.get(WsConstants.KEY_CHANNEL_ID);
        int intValue = obj == null ? -1 : ((Integer) obj).intValue();
        if (s == -1 && intValue > 0 && r.get() == 1) {
            s = intValue;
        }
        B.a d2 = o.d(this.m, Executors.newSingleThreadExecutor());
        try {
            d2.l(list);
            d2.c(String.valueOf(map.get(WsConstants.KEY_APP_KEY)));
            d2.h(((Integer) map.get(WsConstants.KEY_FPID)).intValue());
            d2.d(((Integer) map.get("app_version")).intValue());
            d2.b(((Integer) map.get(WsConstants.KEY_APP_ID)).intValue());
            d2.g(Long.parseLong((String) map.get("device_id")));
            d2.i(Long.parseLong((String) map.get(WsConstants.KEY_INSTALL_ID)));
            if (intValue > 0) {
                int i = s;
            }
            d2.k(false);
            if (map.containsKey(WsConstants.KEY_SESSION_ID)) {
                d2.j((String) map.get(WsConstants.KEY_SESSION_ID));
            }
            String str = (String) map.get("extra");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split(ContainerUtils.FIELD_DELIMITER)) {
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (split.length == 2) {
                            hashMap.put(split[0], split[1]);
                        }
                    }
                }
            }
            try {
                HashMap hashMap2 = new HashMap();
                Map<String, String> q2 = q();
                if (Logger.debug()) {
                    Logger.d("CronetFrontierConnection", "Client key: " + q2);
                }
                if (q2 != null && !q2.isEmpty()) {
                    hashMap2.putAll(q2);
                }
                Map map2 = (Map) map.get(WsConstants.KEY_HEADERS);
                if (map2 != null && !map2.isEmpty()) {
                    hashMap2.putAll(map2);
                }
                if (!hashMap2.isEmpty()) {
                    d2.e(hashMap2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            org.chromium.wschannel.b bVar = this.n;
            if (bVar != null && bVar.c() > 0) {
                long c2 = this.n.c();
                if (Logger.debug()) {
                    Logger.d("CronetFrontierConnection", "WS destroy timeout:" + c2);
                }
                hashMap.put("ttnet_timeout_millis", String.valueOf(c2));
            }
            d2.f(hashMap);
            B a = d2.a();
            this.l = a;
            a.e();
        } catch (Throwable th2) {
            th2.printStackTrace();
            throw new IllegalArgumentException("configMap contain err params !!!");
        }
    }

    static void f(a aVar, JSONObject jSONObject, int i) throws JSONException {
        Objects.requireNonNull(aVar);
        jSONObject.put("report_type", i);
        jSONObject.put("report_time", System.currentTimeMillis());
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("report log:");
            M.append(jSONObject.toString());
            Logger.d("CronetFrontierConnection", M.toString());
        }
        org.chromium.d.U().w0(jSONObject.toString(), "private_protocol");
    }

    static boolean i(a aVar) {
        if (aVar.f10766g.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<Integer, Boolean>> it2 = aVar.f10766g.entrySet().iterator();
        while (it2.hasNext()) {
            if (!it2.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    private void p() {
        B b2 = this.l;
        if (b2 != null) {
            b2.f();
            this.l.c();
        }
        CronetFrontierClient cronetFrontierClient = this.h;
        if (cronetFrontierClient != null) {
            cronetFrontierClient.a();
            com.bytedance.frameworks.baselib.network.http.p.a.d().f(q);
            this.i.set(false);
        }
    }

    private Map<String, String> q() {
        try {
            return (Map) Class.forName("com.bytedance.ttnet.clientkey.ClientKeyManager").getMethod("getClientKeyHeaders", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String r(URI uri) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            Map<String, List<String>> map = cookieHandler != null ? cookieHandler.get(uri, hashMap) : null;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if ("cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                        int i = 0;
                        for (String str : entry.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str);
                            i++;
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(java.util.Map<java.lang.String, java.lang.Object> r26, java.util.List<java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.wschannel.a.A(java.util.Map, java.util.List):void");
    }

    public void C() {
        p();
    }

    public void o() {
        p();
    }

    public boolean s() {
        B b2;
        CronetFrontierClient cronetFrontierClient;
        if (this.b.get() && (cronetFrontierClient = this.h) != null) {
            return cronetFrontierClient.b();
        }
        if (this.b.get() || (b2 = this.l) == null) {
            return false;
        }
        return b2.d();
    }

    public boolean t() {
        return this.i.get();
    }

    public boolean u() {
        return this.b.get();
    }

    public boolean v() {
        return this.f10762c.get();
    }

    public boolean w(WsChannelMsg wsChannelMsg) {
        String[] strArr;
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("PP sendMessage data:");
            M.append(wsChannelMsg.toString());
            Logger.d("CronetFrontierConnection", M.toString());
        }
        if (this.h == null || wsChannelMsg == null) {
            return false;
        }
        int m = wsChannelMsg.m();
        if (m == 9000 && wsChannelMsg.c() == 4) {
            Iterator<WsChannelMsg.MsgHeader> it2 = wsChannelMsg.e().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                WsChannelMsg.MsgHeader next = it2.next();
                if (next != null && WsConstants.APP_STATE_BACKGROUND_KEY.equals(next.a())) {
                    String b2 = next.b();
                    if (b2.equals(PushClient.DEFAULT_REQUEST_ID)) {
                        this.j = 1;
                    } else if (b2.equals("0")) {
                        this.j = 0;
                    }
                    if (this.k && this.j != -1) {
                        this.h.e(this.j == 1);
                    }
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("method_id");
        arrayList.add(String.valueOf(wsChannelMsg.c()));
        if (!TextUtils.isEmpty(wsChannelMsg.i())) {
            arrayList.add("payload_type");
            arrayList.add(wsChannelMsg.i());
        }
        if (!TextUtils.isEmpty(wsChannelMsg.g())) {
            arrayList.add("payload_encoding");
            arrayList.add(wsChannelMsg.g());
        }
        if (wsChannelMsg.e() == null) {
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            for (WsChannelMsg.MsgHeader msgHeader : wsChannelMsg.e()) {
                if (!TextUtils.isEmpty(msgHeader.a()) && !TextUtils.isEmpty(msgHeader.b())) {
                    arrayList.add(msgHeader.a());
                    arrayList.add(msgHeader.b());
                }
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wsChannelMsg.f().length);
        allocateDirect.put(wsChannelMsg.f());
        this.h.f(m, strArr, allocateDirect);
        if (Logger.debug()) {
            Logger.d("CronetFrontierConnection", "PP sendMessage serviceId:" + m);
        }
        return true;
    }

    public boolean x(byte[] bArr) {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("PP proxy sendMessage data:");
            M.append(bArr.toString());
            Logger.d("CronetFrontierConnection", M.toString());
        }
        CronetFrontierClient cronetFrontierClient = this.h;
        if (cronetFrontierClient == null || bArr == null) {
            return false;
        }
        if (!cronetFrontierClient.c(1) && this.h != null) {
            this.h.d(new TTServiceInfo(1, new b()), null, null);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        this.h.f(1, null, allocateDirect);
        return true;
    }

    public boolean y(byte[] bArr) {
        if (Logger.debug()) {
            Logger.d("CronetFrontierConnection", "WS sendMessage data:" + bArr);
        }
        if (this.l == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        this.l.a(allocateDirect);
        return true;
    }

    public void z(boolean z) {
        this.k = z;
    }
}
