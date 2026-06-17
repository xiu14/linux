package com.bytedance.ttnet.diagnosis;

import com.bytedance.android.input.ttnet.d;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class TTNetDiagnosisService {
    public static final int ACCELERATE_TARGET = 2;
    public static final int ACTION_FORCE_CELLULAR = 1;
    public static final int ACTION_FORCE_DEFAULT = 3;
    public static final int ACTION_FORCE_WIFI = 2;
    public static final int ACTION_UNSPECIFIED = 0;
    public static final int DIAGNOSE_TARGET = 3;
    public static final int DIAGNOSE_V2_TARGET = 4;
    public static final int DNS_RESOLVE_TARGET = 0;
    public static final int NET_DETECT_ALL = -1;
    public static final int NET_DETECT_FULL_DNS = 128;
    public static final int NET_DETECT_HTTP_GET = 1;
    public static final int NET_DETECT_HTTP_ISP = 4096;
    public static final int NET_DETECT_ICMP_PING = 2;
    public static final int NET_DETECT_LOCAL_DNS = 8;
    public static final int NET_DETECT_TCP_CONNECT = 256;
    public static final int NET_DETECT_TCP_ECHO = 512;
    public static final int NET_DETECT_TCP_PERF = 2048;
    public static final int NET_DETECT_TRACEROUTE = 4;
    public static final int NET_DETECT_UDP_PERF = 1024;
    public static final int NET_DETECT_UDP_PING = 64;
    public static final int RACE_TARGETS = 1;
    public static final int RAW_DETECT_TARGETS = 5;
    private static final Map<Integer, String> sTypeStringMap;

    static {
        HashMap hashMap = new HashMap();
        sTypeStringMap = hashMap;
        hashMap.put(0, "DNS_RESOLVE_TARGET");
        hashMap.put(1, "RACE_TARGETS");
        hashMap.put(2, "ACCELERATE_TARGET");
        hashMap.put(3, "DIAGNOSE_TARGET");
        hashMap.put(4, "DIAGNOSE_V2_TARGET");
        hashMap.put(5, "RAW_DETECT_TARGETS");
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3) throws Exception {
        return createRequest(i, str, i2, 0, i3);
    }

    private static k getCronetHttpClient() throws Exception {
        if (c.c()) {
            return k.r(((d) TTNetInit.getTTNetDepend()).c());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    private static boolean isOneTargetRequestType(int i) {
        if (i != 0) {
            if (i == 1) {
                return false;
            }
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    return false;
                }
                throw new IllegalArgumentException(e.a.a.a.a.j("Illegal request type: ", i));
            }
        }
        return true;
    }

    private static boolean isValidNetDetect(int i, long j) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i == 2) {
                return j == 1 || j == 2 || j == 64;
            }
            if (i == 3 || i == 4) {
                return true;
            }
            if (i != 5) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Illegal request type: ", i));
            }
        }
        return ((-1) & j) != 0 && (j & 0) == 0;
    }

    public static void reportUserLog(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            k cronetHttpClient = getCronetHttpClient();
            if (cronetHttpClient != null) {
                cronetHttpClient.A(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static String requestTypeToString(int i) {
        return sTypeStringMap.get(Integer.valueOf(i));
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3, int i4) throws Exception {
        if (!isOneTargetRequestType(i)) {
            throw new IllegalArgumentException(e.a.a.a.a.J(e.a.a.a.a.M("Type "), requestTypeToString(i), " of request should be created with multiple targets."));
        }
        if (!isValidNetDetect(i, i2)) {
            throw new IllegalArgumentException(e.a.a.a.a.j("Illegal netDetectType: ", i2));
        }
        if (i != 0 && i != 2 && i != 3 && i != 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return new b(i, arrayList, i2, i3, i4);
    }

    public static IDiagnosisRequest createRequest(int i, List<String> list, int i2, int i3) throws Exception {
        if (!isOneTargetRequestType(i)) {
            if (!isValidNetDetect(i, i2)) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Illegal netDetectType: ", i2));
            }
            if (i == 1 || i == 5) {
                return new b(i, list, i2, 0, i3);
            }
            return null;
        }
        throw new IllegalArgumentException(e.a.a.a.a.J(e.a.a.a.a.M("Type "), requestTypeToString(i), " of request should be created with only one target."));
    }
}
