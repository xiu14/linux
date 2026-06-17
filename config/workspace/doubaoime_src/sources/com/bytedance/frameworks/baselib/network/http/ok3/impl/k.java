package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.z;
import com.bytedance.ttnet.tnc.TNCManager;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.B;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.TlsVersion;
import okhttp3.s;
import okhttp3.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {
    private Socket F;
    private s G;
    private com.bytedance.frameworks.baselib.network.http.ok3.impl.p.b T;
    private com.bytedance.frameworks.baselib.network.http.c V;
    private com.bytedance.frameworks.baselib.network.http.b W;
    private Context X;
    private TlsVersion u;
    private okhttp3.g v;
    private s x;
    private long a = -1;
    private long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f5185c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f5186d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f5187e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f5188f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f5189g = -1;
    private long h = -1;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private long l = -1;
    private long m = -1;
    private long n = -1;
    private final AtomicLong o = new AtomicLong(-1);
    private long p = -1;
    private long q = -1;
    private final List<Pair<InetSocketAddress, Integer>> r = new ArrayList();
    private Proxy.Type s = Proxy.Type.DIRECT;
    private HandshakeType t = HandshakeType.HANDSHAKE_UNKNOWN;
    private long w = 0;
    private int y = -1;
    private long z = 0;
    private Protocol A = null;
    private String B = "";
    private boolean C = false;
    private boolean D = false;
    private String E = "";
    private String H = "";
    private int I = 0;

    /* renamed from: J, reason: collision with root package name */
    private final List<n> f5184J = new ArrayList();
    private LoadState K = LoadState.IDLE;
    private String L = "";
    private int M = -1;
    private Status N = Status.UNKNOWN;
    private String O = "";
    private boolean P = false;
    private boolean Q = false;
    private final List<com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.c> R = new ArrayList();
    private int S = 0;
    private String U = "";
    private final AtomicBoolean Y = new AtomicBoolean(false);

    public k(com.bytedance.frameworks.baselib.network.http.b bVar, Context context) {
        this.W = bVar;
        this.X = context;
    }

    private static ConnectionInfo J(Protocol protocol) {
        if (protocol == null) {
            return ConnectionInfo.CONNECTION_INFO_UNKNOWN;
        }
        int ordinal = protocol.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? ConnectionInfo.CONNECTION_INFO_UNKNOWN : ConnectionInfo.CONNECTION_INFO_QUIC_UNKNOWN_VERSION : ConnectionInfo.CONNECTION_INFO_HTTP2 : ConnectionInfo.CONNECTION_INFO_DEPRECATED_SPDY3 : ConnectionInfo.CONNECTION_INFO_HTTP1_1 : ConnectionInfo.CONNECTION_INFO_HTTP1_0;
    }

    private static long K(String str) {
        String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
        if (split.length != 2) {
            return -1L;
        }
        try {
            long parseLong = Long.parseLong(split[1]);
            if (parseLong < 0) {
                return -1L;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static long L(long j, long j2) {
        if (j2 == -1 || j == -1) {
            return -1L;
        }
        return j - j2;
    }

    private String i(Context context) {
        String str;
        boolean z;
        Object obj;
        long j;
        Set<String> a;
        InetAddress inetAddress;
        Uri parse;
        Uri parse2;
        List<String> a2;
        String[] split;
        String str2 = "Cookie";
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String f2 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().f();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(f2) && (split = f2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null) {
                arrayList.addAll(Arrays.asList(split));
            }
            com.bytedance.ttnet.k.a k = o.k();
            if (k != null && (a2 = k.a()) != null) {
                if (a2.size() > 5 && Logger.debug()) {
                    Logger.d("ok3log", "ab sdk version count must less than 5");
                }
                int i = 0;
                for (String str3 : a2) {
                    i++;
                    if (i > 5) {
                        break;
                    }
                    arrayList.add(str3);
                }
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                if (!TextUtils.isEmpty(str4)) {
                    jSONArray.put(str4);
                }
            }
            jSONObject2.put("hit", jSONArray);
            jSONObject.put("ab_test", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("load_state", this.K.ordinal());
            jSONObject3.put("method", this.L);
            jSONObject3.put("is_pending", this.N == Status.IO_PENDING);
            jSONObject3.put("status", this.N);
            if (this.N != Status.SUCCESS) {
                jSONObject3.put("net_error", this.M);
            }
            if (!TextUtils.isEmpty(this.O) && (parse2 = Uri.parse(this.O)) != null && !TextUtils.isEmpty(parse2.getScheme()) && !TextUtils.isEmpty(parse2.getHost()) && parse2.getPath() != null) {
                jSONObject3.put("origin_url", parse2.getScheme() + "://" + parse2.getHost() + parse2.getPath());
            }
            jSONObject3.put("redirect_times", this.I);
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            Iterator<n> it3 = this.f5184J.iterator();
            while (it3.hasNext()) {
                n next = it3.next();
                Iterator<n> it4 = it3;
                JSONObject jSONObject4 = new JSONObject();
                String str5 = str2;
                jSONObject4.put("code", next.a);
                jSONObject4.put("method", next.b);
                jSONObject4.put("internal", next.f5191d);
                String str6 = next.f5190c;
                if (str6 != null && (parse = Uri.parse(str6)) != null && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getHost())) {
                    String str7 = parse.getScheme() + "://" + parse.getHost();
                    jSONArray3.put(str7);
                    if (parse.getPath() != null) {
                        str7 = str7 + parse.getPath();
                    }
                    jSONObject4.put("url", str7);
                }
                jSONArray2.put(jSONObject4);
                it3 = it4;
                str2 = str5;
            }
            String str8 = str2;
            jSONObject3.put("redirect_info", jSONArray2);
            jSONObject3.put("redirecting_list", jSONArray3);
            jSONObject3.put("dispatched", this.P);
            jSONObject.put("base", jSONObject3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("code", this.y);
            jSONObject5.put("connection_info", J(this.A).mValue);
            s sVar = this.x;
            jSONObject5.put("sent_bytes", this.w + (sVar != null ? sVar.a() : 0L));
            s sVar2 = this.G;
            jSONObject5.put("received_bytes", this.z + (sVar2 != null ? sVar2.a() : 0L));
            jSONObject5.put("cached", this.C);
            jSONObject5.put("network_accessed", this.D);
            jSONObject5.put("via_proxy", this.s != Proxy.Type.DIRECT);
            s sVar3 = this.G;
            if (sVar3 != null) {
                List<String> l = sVar3.l("Set-Cookie");
                boolean z2 = !com.bytedance.android.input.k.b.a.Z(l);
                jSONObject5.put("set_cookie", z2);
                if (z2) {
                    jSONObject5.put("set_cookie_lines", l.size());
                    Iterator<String> it5 = l.iterator();
                    long j2 = 0;
                    while (it5.hasNext()) {
                        if (it5.next() != null) {
                            j2 += r13.length();
                        }
                    }
                    jSONObject5.put("set_cookie_bytes", j2);
                }
            }
            jSONObject.put("response", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            if (this.G != null) {
                for (int i2 = 0; i2 < this.G.i(); i2++) {
                    String e2 = this.G.e(i2);
                    String k2 = this.G.k(i2);
                    if (!TextUtils.isEmpty(e2) && !TextUtils.isEmpty(k2)) {
                        String lowerCase = e2.toLowerCase();
                        if (lowerCase.startsWith("x-tt-") && !lowerCase.contains("sids") && !lowerCase.contains("session") && !lowerCase.contains("token") && !lowerCase.contains("uid") && !lowerCase.contains("sign")) {
                            jSONObject6.put(e2, k2);
                        }
                    }
                }
                String d2 = this.G.d("tt-idc-switch");
                if (!TextUtils.isEmpty(d2)) {
                    jSONObject6.put("tt-idc-switch", d2);
                }
                str = this.G.d("server-timing");
                if (!TextUtils.isEmpty(str)) {
                    jSONObject6.put("server-timing", str);
                }
                List<String> a3 = a.b().a();
                if (!com.bytedance.android.input.k.b.a.Z(a3)) {
                    for (String str9 : a3) {
                        if (!TextUtils.isEmpty(str9)) {
                            jSONObject6.remove(str9);
                        }
                    }
                }
                jSONObject.put("header", jSONObject6);
            } else {
                str = "";
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("libcore", "okhttp");
            jSONObject7.put("core_ver", o.l());
            jSONObject7.put("is_main_process", com.bytedance.frameworks.baselib.network.http.p.i.c(context));
            jSONObject7.put("ttnet_version", "4.2.243.8-doubao");
            jSONObject7.put("retry_attempts", -1);
            com.bytedance.frameworks.baselib.network.http.c cVar = this.V;
            if (cVar != null) {
                Objects.requireNonNull(cVar);
            }
            jSONObject.put("other", jSONObject7);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("dns", L(this.f5185c, this.b));
            jSONObject9.put("tcp", L(this.f5187e, this.f5186d));
            jSONObject9.put("ssl", L(this.f5188f, this.f5187e));
            Object obj2 = "";
            jSONObject9.put("send", L(this.h, this.f5189g) + L(this.j, this.i));
            long L = L(this.l, this.h);
            jSONObject9.put(MonitorConstants.TTFB, L);
            jSONObject9.put("header_recv", L(this.l, this.k));
            jSONObject9.put("body_recv", L(this.n, this.m));
            jSONObject9.put("dispatch", this.q);
            q(str, jSONObject9, L);
            com.bytedance.frameworks.baselib.network.http.ok3.impl.p.b bVar = this.T;
            if (bVar != null) {
                long j3 = bVar.f5199e;
                if (j3 >= 0) {
                    jSONObject9.put("meta_dp", j3);
                }
            }
            jSONObject8.put("detailed_duration", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("start_time", this.a);
            jSONObject10.put("duration", L(this.o.get(), this.a));
            jSONObject10.put("request_sent_time", this.f5189g);
            jSONObject10.put("response_recv_time", this.k);
            jSONObject8.put("request", jSONObject10);
            jSONObject.put("timing", jSONObject8);
            JSONObject jSONObject11 = new JSONObject();
            Socket socket = this.F;
            if (socket != null && (inetAddress = socket.getInetAddress()) != null) {
                AddressFamily addressFamily = AddressFamily.ADDRESS_FAMILY_UNSPECIFIED;
                if (inetAddress instanceof Inet4Address) {
                    addressFamily = AddressFamily.ADDRESS_FAMILY_IPV4;
                } else if (inetAddress instanceof Inet6Address) {
                    addressFamily = AddressFamily.ADDRESS_FAMILY_IPV6;
                }
                jSONObject11.put("address_family", addressFamily.ordinal());
                jSONObject11.put("socket_reused", this.f5186d == -1 && this.p != -1);
                if (inetAddress.getHostAddress() != null) {
                    jSONObject11.put("remote", inetAddress.getHostAddress());
                }
            }
            JSONArray jSONArray4 = new JSONArray();
            for (Pair<InetSocketAddress, Integer> pair : this.r) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("address", ((InetSocketAddress) pair.first).toString().substring(1));
                jSONObject12.put("result", pair.second);
                jSONArray4.put(jSONObject12);
            }
            jSONObject11.put("connection_attempts", jSONArray4);
            jSONObject.put("socket", jSONObject11);
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("handshake_type", this.t.ordinal());
            jSONObject13.put("cipher_suite", this.v);
            jSONObject13.put("ssl_version", this.u);
            jSONObject.put("ssl", jSONObject13);
            JSONObject jSONObject14 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            if (this.Q) {
                jSONObject14.put("host_replace_map", 1);
                jSONObject14.put("host_replace_map_size", this.S);
                z = false;
            } else {
                List<com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.c> list = this.R;
                if (list != null) {
                    for (com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.c cVar2 : list) {
                        JSONObject jSONObject15 = new JSONObject();
                        if (cVar2.f5209d) {
                            jSONObject15.put(RemoteMessageConst.Notification.PRIORITY, cVar2.f5208c);
                            jSONObject15.put("type", cVar2.f5210e);
                            jSONObject15.put("action_hit", cVar2.f5209d);
                            if (TextUtils.isEmpty(cVar2.f5212g)) {
                                obj = obj2;
                                jSONObject15.put("replace_host", obj);
                            } else {
                                Uri parse3 = Uri.parse(cVar2.f5212g);
                                if (parse3.getHost() != null) {
                                    jSONObject15.put("replace_host", parse3.getHost());
                                }
                                obj = obj2;
                            }
                            jSONObject15.put("feedback", cVar2.f5211f);
                            long j4 = cVar2.b;
                            if (j4 > 0) {
                                jSONObject15.put("rule_id", j4);
                            }
                            if (!TextUtils.isEmpty(cVar2.a)) {
                                jSONObject15.put("service_name", cVar2.a);
                            }
                            jSONArray5.put(jSONObject15);
                        } else {
                            obj = obj2;
                        }
                        obj2 = obj;
                    }
                }
                jSONObject14.put("action_info", jSONArray5);
                jSONObject14.put("empty_action", com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().l());
                z = false;
                jSONObject14.put("host_replace_map", 0);
            }
            jSONObject14.put("source", com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().h());
            jSONObject14.put("update_time", com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().i());
            jSONObject14.put("epoch", com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().d());
            jSONObject.put("url_dispatch", jSONObject14);
            if (!TextUtils.isEmpty(com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().g())) {
                jSONObject.put("tt_tnc_etag", com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().g());
            }
            if (this.T != null) {
                JSONObject jSONObject16 = new JSONObject();
                Set<String> set = this.T.f5197c;
                if (set != null && !set.isEmpty()) {
                    jSONObject16.put("header_add", this.T.f5197c);
                }
                Set<String> set2 = this.T.f5198d;
                if (set2 != null && !set2.isEmpty()) {
                    jSONObject16.put("header_rm", this.T.f5198d);
                }
                Set<String> set3 = this.T.a;
                if (set3 != null && !set3.isEmpty()) {
                    jSONObject16.put("query_add", this.T.a);
                }
                Set<String> set4 = this.T.b;
                if (set4 != null && !set4.isEmpty()) {
                    jSONObject16.put("query_rm", this.T.b);
                }
                if (jSONObject16.length() > 0) {
                    jSONObject.put("meta_dp", jSONObject16);
                }
            }
            if (!TextUtils.isEmpty(this.U)) {
                try {
                    jSONObject.put("dns", new JSONObject(this.U));
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject17 = new JSONObject();
            com.bytedance.frameworks.baselib.network.http.c cVar3 = this.V;
            if (cVar3 != null) {
                long j5 = cVar3.f5089e;
                if (j5 > 0) {
                    jSONObject17.put("protect", j5);
                }
                Objects.requireNonNull(this.V);
                long j6 = this.V.f5087c;
                if (j6 > 0) {
                    jSONObject17.put("read", j6);
                }
                long j7 = this.V.f5088d;
                j = 0;
                if (j7 > 0) {
                    jSONObject17.put("write", j7);
                }
            } else {
                j = 0;
            }
            jSONObject.put("socket_timeout_param", jSONObject17);
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put("ipv4_reachable", NetworkUtils.h(context));
            jSONObject18.put("ipv6_reachable", com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.d.b().get());
            jSONObject.put("ifconfig", jSONObject18);
            if (o.j() != null) {
                jSONObject.put("tnc", ((TNCManager) o.j()).h());
            }
            if (com.bytedance.frameworks.baselib.network.http.o.b.j().g() != null) {
                jSONObject.put("store_idc", com.bytedance.frameworks.baselib.network.http.o.b.j().g());
            }
            if (this.x != null) {
                JSONObject jSONObject19 = new JSONObject();
                List<String> l2 = this.x.l(str8);
                boolean z3 = !com.bytedance.android.input.k.b.a.Z(l2) ? true : z;
                jSONObject19.put(str8, z3);
                if (z3) {
                    Iterator<String> it6 = l2.iterator();
                    long j8 = j;
                    while (it6.hasNext()) {
                        if (it6.next() != null) {
                            j8 += r5.length();
                        }
                    }
                    jSONObject19.put("add_cookie_bytes", j8);
                }
                String d3 = this.x.d("x-tt-token");
                if (d3 != null && !d3.isEmpty()) {
                    jSONObject19.put("token_md5", f.h.c(d3).k().h());
                }
                if ("http".equalsIgnoreCase(this.B)) {
                    if (l2 != null && !l2.isEmpty() && (a = com.bytedance.frameworks.baselib.network.c.a.a(l2)) != null) {
                        JSONArray jSONArray6 = new JSONArray();
                        Iterator<String> it7 = a.iterator();
                        while (it7.hasNext()) {
                            jSONArray6.put(it7.next());
                        }
                        jSONObject19.put("insecure_cookies", jSONArray6);
                    }
                    Set<String> b = com.bytedance.frameworks.baselib.network.c.a.b(this.x);
                    if (b != null) {
                        JSONArray jSONArray7 = new JSONArray();
                        Iterator<String> it8 = b.iterator();
                        while (it8.hasNext()) {
                            jSONArray7.put(it8.next());
                        }
                        jSONObject19.put("insecure_headers", jSONArray7);
                    }
                }
                jSONObject.put("session", jSONObject19);
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static int j(IOException iOException, int i) {
        if (iOException == null) {
            return i;
        }
        try {
            int k = k(iOException.getMessage(), i);
            if (k != i) {
                return k;
            }
            try {
                Throwable cause = iOException.getCause();
                if (cause == null) {
                    return k;
                }
                String message = cause.getMessage();
                return TextUtils.isEmpty(message) ? k : k(message, i);
            } catch (Throwable unused) {
                i = k;
                return i;
            }
        } catch (Throwable unused2) {
        }
    }

    private static int k(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.contains("ECONNRESET") || str.contains("Connection reset") || str.contains("reset by peer")) {
            return -101;
        }
        if (str.contains("ECONNREFUSED")) {
            return -102;
        }
        if (str.contains("CONNECTION_ABORTED") || str.contains("connection abort")) {
            return -103;
        }
        if (str.contains("ENETDOWN") || str.contains("Network is unreachable")) {
            return -106;
        }
        if (str.contains("EHOSTUNREACH") || str.contains("ENETUNREACH")) {
            return -109;
        }
        if (str.contains("EADDRNOTAVAIL")) {
            return -108;
        }
        if (str.contains("EADDRINUSE")) {
            return -147;
        }
        return i;
    }

    public static int l(IOException iOException) {
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return j(iOException, -104);
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof SocketException) {
            return j(iOException, -15);
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if (iOException instanceof ProtocolException) {
            return -901;
        }
        if (!(iOException instanceof HttpRetryException)) {
            return iOException instanceof UnknownServiceException ? -902 : -1;
        }
        String message = iOException.getMessage();
        return (TextUtils.isEmpty(message) || !message.contains("Too many follow-up requests")) ? -196 : -310;
    }

    private static String p(s sVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((TreeMap) sVar.j()).entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        jSONObject.put(str, (String) it2.next());
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private void q(String str, JSONObject jSONObject, long j) throws JSONException {
        boolean z;
        String[] split;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && (split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null) {
            for (String str2 : split) {
                String[] split2 = str2.split(";");
                if (split2 != null && split2.length == 2 && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        Iterator it2 = hashMap.entrySet().iterator();
        boolean z2 = false;
        boolean z3 = false;
        long j2 = -1;
        long j3 = -1;
        long j4 = -1;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Iterator it3 = it2;
            String trim = ((String) entry.getKey()).trim();
            String trim2 = ((String) entry.getValue()).trim();
            if (trim.equalsIgnoreCase("cdn-cache")) {
                String[] split3 = trim2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                z = true;
                z3 = split3.length == 2 && split3[1].equalsIgnoreCase("hit");
                z2 = true;
            } else {
                z = true;
                if (trim.equalsIgnoreCase("edge")) {
                    j3 = K(trim2);
                } else if (trim.equalsIgnoreCase("origin")) {
                    j4 = K(trim2);
                } else if (trim.equalsIgnoreCase("inner")) {
                    j2 = K(trim2);
                } else if (!TextUtils.isEmpty(trim)) {
                    jSONObject.put(trim, K(trim2));
                }
            }
            it2 = it3;
        }
        if (z2 && z3) {
            jSONObject.put("edge", j3);
            jSONObject.put("cdn-cache", "hit");
            jSONObject.put("rtt", (j == -1 || j <= j3) ? -1L : j - j3);
        } else {
            if (!z2) {
                jSONObject.put("inner", j2);
                jSONObject.put("rtt", (j == -1 || j <= j2) ? -1L : j - j2);
                return;
            }
            jSONObject.put("edge", j3);
            jSONObject.put("cdn-cache", "miss");
            if (j4 > j2) {
                jSONObject.put("origin", j4 - j2);
            } else {
                jSONObject.put("origin", -1);
            }
            jSONObject.put("inner", j2);
            jSONObject.put("rtt", (j == -1 || j <= j4 + j3) ? -1L : (j - j4) - j3);
        }
    }

    private void r() {
        Objects.requireNonNull(this.W);
        this.W.f5083d.a0(L(this.f5185c, this.b));
        this.W.f5083d.d0(L(this.f5187e, this.f5186d));
        this.W.f5083d.f0(L(this.f5188f, this.f5187e));
        this.W.f5083d.c0(L(this.h, this.f5189g) + L(this.j, this.i));
        RetrofitMetrics retrofitMetrics = this.W.f5083d;
        retrofitMetrics.F0.f5888d.f5908e = -1L;
        WeakReference<z> weakReference = retrofitMetrics.f5990c;
        if (weakReference != null) {
            weakReference.get().c(-1L);
        }
        this.W.f5083d.e0(-1L);
        this.W.f5083d.b0(L(this.n, this.m));
        this.W.f5083d.g0(L(this.o.get(), this.a));
        this.W.f5083d.i0(i(this.X));
        com.bytedance.frameworks.baselib.network.http.b bVar = this.W;
        bVar.s = this.E;
        bVar.w = this.f5186d == -1 && this.p != -1;
        bVar.t = this.w;
        bVar.u = this.z;
        Objects.requireNonNull(bVar);
        s sVar = this.x;
        if (sVar != null) {
            this.W.D = p(sVar);
            com.bytedance.frameworks.baselib.network.http.b bVar2 = this.W;
            bVar2.t = this.x.a() + bVar2.t;
        }
        s sVar2 = this.G;
        if (sVar2 != null) {
            this.W.E = p(sVar2);
            com.bytedance.frameworks.baselib.network.http.b bVar3 = this.W;
            bVar3.u = this.G.a() + bVar3.u;
        }
        com.bytedance.frameworks.baselib.network.http.b bVar4 = this.W;
        bVar4.F = this.H;
        bVar4.f5083d.G();
    }

    public void A() {
        this.K = LoadState.READING_RESPONSE;
        this.m = System.currentTimeMillis();
    }

    public void B(B b) {
        this.l = System.currentTimeMillis();
        if (this.f5188f != -1) {
            this.t = HandshakeType.HANDSHAKE_FULL;
        } else {
            this.t = HandshakeType.HANDSHAKE_RESUME;
        }
        if (b == null || this.o.get() != -1) {
            return;
        }
        this.y = b.l();
        this.A = b.I();
        if (b.o() != null) {
            this.u = b.o().d();
            this.v = b.o().a();
        }
        if (b.x()) {
            this.I++;
            n nVar = new n();
            nVar.a = b.l();
            nVar.b = b.N().method();
            String p = b.p("location");
            if (!TextUtils.isEmpty(p)) {
                try {
                    t x = b.N().url().x(p);
                    if (x != null && !TextUtils.isEmpty(x.k())) {
                        nVar.f5190c = x.toString();
                    }
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(nVar.f5190c)) {
                    nVar.f5190c = p;
                }
            }
            this.f5184J.add(nVar);
        }
        if (b.z()) {
            String p2 = b.p("content-type");
            if (!TextUtils.isEmpty(p2)) {
                this.H = p2;
            }
        }
        this.G = b.w();
    }

    public void C() {
        this.k = System.currentTimeMillis();
    }

    public void D() {
        this.f5188f = System.currentTimeMillis();
    }

    public void E() {
        this.f5187e = System.currentTimeMillis();
        this.K = LoadState.SSL_HANDSHAKE;
    }

    public void F(int i) {
        this.M = i;
    }

    public void G(String str, String str2) {
        this.O = str;
        this.L = str2;
    }

    public void H(com.bytedance.frameworks.baselib.network.http.c cVar) {
        this.V = cVar;
    }

    public void I(B b) {
        this.C = b.h() != null;
        this.D = b.D() != null;
    }

    public void a() {
        this.Y.set(true);
    }

    public void b() {
        if (this.o.compareAndSet(-1L, System.currentTimeMillis())) {
            this.K = LoadState.IDLE;
            this.N = Status.SUCCESS;
            r();
        }
    }

    public void c(IOException iOException) {
        if (this.o.compareAndSet(-1L, System.currentTimeMillis())) {
            if (this.Y.get()) {
                iOException = new IOException("Biz Canceled");
            }
            this.K = LoadState.IDLE;
            if (iOException == null || TextUtils.isEmpty(iOException.getMessage()) || !iOException.getMessage().contains("Canceled")) {
                this.N = Status.FAILED;
            } else {
                this.N = Status.CANCELED;
            }
            this.M = l(iOException);
            r();
        }
    }

    public void d() {
        this.a = System.currentTimeMillis();
        this.N = Status.IO_PENDING;
    }

    public void e(Proxy proxy) {
        System.currentTimeMillis();
        if (proxy != null) {
            this.s = proxy.type();
        }
    }

    public void f(InetSocketAddress inetSocketAddress, IOException iOException, String str) {
        System.currentTimeMillis();
        if (inetSocketAddress != null && this.o.get() == -1) {
            this.r.add(new Pair<>(inetSocketAddress, Integer.valueOf(l(iOException))));
        }
        if (!TextUtils.isEmpty(this.U) || TextUtils.isEmpty(str)) {
            return;
        }
        this.U = str;
    }

    public void g() {
        this.f5186d = System.currentTimeMillis();
        this.K = LoadState.CONNECTING;
    }

    public void h(okhttp3.h hVar) {
        if (hVar != null && this.o.get() == -1) {
            okhttp3.F.e.c cVar = (okhttp3.F.e.c) hVar;
            if (cVar.o() != null && cVar.o().getInetAddress() != null && cVar.o().getInetAddress().getHostAddress() != null) {
                this.E = cVar.o().getInetAddress().getHostAddress();
            }
            this.F = cVar.o();
        }
        this.p = System.currentTimeMillis();
    }

    public void m() {
        this.f5185c = System.currentTimeMillis();
    }

    public void n(String str) {
        this.f5185c = System.currentTimeMillis();
        this.U = str;
    }

    public void o() {
        this.b = System.currentTimeMillis();
        this.K = LoadState.RESOLVING_HOST;
    }

    public void s(String str, com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.c cVar, boolean z) {
        if (z) {
            n nVar = new n();
            nVar.a = 307;
            nVar.f5191d = true;
            nVar.b = str;
            nVar.f5190c = cVar.f5212g;
            this.f5184J.add(nVar);
            this.I++;
        }
        this.R.add(cVar);
    }

    public void t(String str, String str2, long j, boolean z, List<com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.c> list) {
        n nVar = new n();
        nVar.a = 307;
        nVar.f5191d = true;
        nVar.b = str;
        nVar.f5190c = str2;
        this.f5184J.add(nVar);
        this.I++;
        this.q = j;
        this.P = true;
        if (z) {
            this.Q = true;
            this.S = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().e().size();
        } else {
            this.R.addAll(list);
            this.Q = false;
        }
    }

    public void u(com.bytedance.frameworks.baselib.network.http.ok3.impl.p.b bVar) {
        this.T = bVar;
    }

    public void v(long j) {
        this.j = System.currentTimeMillis();
        this.w = j;
    }

    public void w() {
        this.i = System.currentTimeMillis();
    }

    public void x(Request request) {
        this.h = System.currentTimeMillis();
        if (request != null && this.o.get() == -1) {
            this.x = request.headers();
            if (request.url() != null) {
                this.B = request.url().y();
            }
        }
        this.K = LoadState.WAITING_FOR_RESPONSE;
    }

    public void y() {
        this.K = LoadState.SENDING_REQUEST;
        this.f5189g = System.currentTimeMillis();
    }

    public void z(long j) {
        this.n = System.currentTimeMillis();
        this.z = j;
    }
}
