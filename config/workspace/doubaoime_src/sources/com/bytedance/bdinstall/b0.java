package com.bytedance.bdinstall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.ss.android.message.log.PushLog;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b0 {
    private static J a = new b(null);
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, J> f3971c = new ConcurrentHashMap<>();

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static final class b implements J {
        b(a aVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x002f, code lost:
        
            if (r4 != null) goto L16;
         */
        @Override // com.bytedance.bdinstall.J
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String a(android.content.Context r9, com.bytedance.bdinstall.Q r10) {
            /*
                r8 = this;
                java.lang.String r0 = ""
                r1 = 0
                r2 = 1
                if (r9 != 0) goto L7
                goto L36
            L7:
                com.bytedance.bdinstall.n0.c r3 = r10.z()     // Catch: java.lang.Exception -> L32
                android.net.wifi.WifiInfo r3 = r3.b()     // Catch: java.lang.Exception -> L32
                if (r3 == 0) goto L16
                java.lang.String r4 = r3.getSSID()     // Catch: java.lang.Exception -> L32
                goto L17
            L16:
                r4 = r0
            L17:
                android.content.Context r9 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L32
                java.lang.String r5 = "connectivity"
                java.lang.Object r9 = r9.getSystemService(r5)     // Catch: java.lang.Exception -> L32
                android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch: java.lang.Exception -> L32
                android.net.NetworkInfo r9 = r9.getNetworkInfo(r2)     // Catch: java.lang.Exception -> L32
                android.net.NetworkInfo$State r9 = r9.getState()     // Catch: java.lang.Exception -> L32
                android.net.NetworkInfo$State r5 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Exception -> L32
                if (r9 != r5) goto L36
                if (r4 == 0) goto L36
                goto L37
            L32:
                r9 = move-exception
                r9.printStackTrace()
            L36:
                r3 = r1
            L37:
                com.bytedance.bdinstall.n0.c r9 = r10.z()
                java.util.Objects.requireNonNull(r9)
                if (r3 == 0) goto L44
                java.lang.String r0 = r3.getMacAddress()
            L44:
                java.lang.String r9 = "02:00:00:00:00:00"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L52
                boolean r9 = android.text.TextUtils.isEmpty(r0)
                if (r9 == 0) goto Ld1
            L52:
                java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L57 java.lang.Exception -> Lcd
                goto L5b
            L57:
                r9 = move-exception
                r9.printStackTrace()     // Catch: java.lang.Exception -> Lcd
            L5b:
                java.lang.String r9 = "wlan0"
                java.lang.String r10 = "wifi.interface"
                java.lang.Object r10 = com.bytedance.bdinstall.util.r.a(r10)     // Catch: java.lang.Exception -> L6e
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L6e
                boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L6e
                if (r3 == 0) goto L6c
                goto L72
            L6c:
                r9 = r10
                goto L72
            L6e:
                r10 = move-exception
                r10.printStackTrace()     // Catch: java.lang.Exception -> Lcd
            L72:
                boolean r10 = r1.hasMoreElements()     // Catch: java.lang.Exception -> Lcd
                if (r10 == 0) goto Ld1
                java.lang.Object r10 = r1.nextElement()     // Catch: java.lang.Exception -> Lcd
                java.net.NetworkInterface r10 = (java.net.NetworkInterface) r10     // Catch: java.lang.Exception -> Lcd
                java.lang.String r3 = r10.getName()     // Catch: java.lang.Exception -> Lcd
                boolean r3 = r3.equals(r9)     // Catch: java.lang.Exception -> Lcd
                if (r3 != 0) goto L89
                goto L72
            L89:
                r3 = 0
                byte[] r10 = r10.getHardwareAddress()     // Catch: java.net.SocketException -> L8f java.lang.Exception -> Lcd
                goto L95
            L8f:
                r10 = move-exception
                r10.printStackTrace()     // Catch: java.lang.Exception -> Lcd
                byte[] r10 = new byte[r3]     // Catch: java.lang.Exception -> Lcd
            L95:
                if (r10 == 0) goto L72
                int r4 = r10.length     // Catch: java.lang.Exception -> Lcd
                if (r4 != 0) goto L9b
                goto L72
            L9b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcd
                r9.<init>()     // Catch: java.lang.Exception -> Lcd
                int r1 = r10.length     // Catch: java.lang.Exception -> Lcd
                r4 = r3
            La2:
                if (r4 >= r1) goto Lba
                r5 = r10[r4]     // Catch: java.lang.Exception -> Lcd
                java.lang.String r6 = "%02X:"
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lcd
                java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch: java.lang.Exception -> Lcd
                r7[r3] = r5     // Catch: java.lang.Exception -> Lcd
                java.lang.String r5 = java.lang.String.format(r6, r7)     // Catch: java.lang.Exception -> Lcd
                r9.append(r5)     // Catch: java.lang.Exception -> Lcd
                int r4 = r4 + 1
                goto La2
            Lba:
                int r10 = r9.length()     // Catch: java.lang.Exception -> Lcd
                if (r10 <= 0) goto Lc8
                int r10 = r9.length()     // Catch: java.lang.Exception -> Lcd
                int r10 = r10 - r2
                r9.deleteCharAt(r10)     // Catch: java.lang.Exception -> Lcd
            Lc8:
                java.lang.String r0 = r9.toString()     // Catch: java.lang.Exception -> Lcd
                goto Ld1
            Lcd:
                r9 = move-exception
                r9.printStackTrace()
            Ld1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.b0.b.a(android.content.Context, com.bytedance.bdinstall.Q):java.lang.String");
        }

        @Override // com.bytedance.bdinstall.J
        public String b(Context context, Q q) {
            try {
            } catch (Exception unused) {
                int i = C0640u.a;
            }
            if (com.bytedance.bdinstall.util.e.b(context) && b0.b.compareAndSet(false, true)) {
                return q.z().c();
            }
            if (b0.b.get()) {
                ConcurrentHashMap<String, J> concurrentHashMap = b0.f3971c;
                int i2 = C0640u.a;
                return null;
            }
            return null;
        }

        @Override // com.bytedance.bdinstall.J
        public String c(Context context, Q q) {
            String i;
            com.bytedance.bdinstall.n0.c z = q.z();
            if (context.getApplicationInfo().targetSdkVersion >= 26) {
                try {
                    i = z.i();
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(i) || TextUtils.equals(i, "unknown")) {
                    i = Build.SERIAL;
                }
                return (TextUtils.isEmpty(i) || TextUtils.equals(i, "unknown")) ? "" : i;
            }
            i = null;
            if (!TextUtils.isEmpty(i)) {
            }
            i = Build.SERIAL;
            if (TextUtils.isEmpty(i)) {
                return "";
            }
        }

        @Override // com.bytedance.bdinstall.J
        public String[] d(Context context, Q q) {
            List<SubscriptionInfo> a;
            int i;
            com.bytedance.bdinstall.n0.c z = q.z();
            String[] strArr = null;
            try {
                try {
                    a = z.a();
                } catch (SecurityException unused) {
                    int i2 = C0640u.a;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (a != null && !a.isEmpty()) {
                strArr = new String[a.size()];
                for (i = 0; i < a.size(); i++) {
                    strArr[i] = a.get(i).getIccId();
                }
                return strArr;
            }
            return new String[0];
        }

        @Override // com.bytedance.bdinstall.J
        public JSONArray e(Context context) {
            JSONArray jSONArray = new JSONArray();
            try {
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (NetworkInterface.getNetworkInterfaces() == null) {
                return new JSONArray();
            }
            Iterator it2 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it2.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it2.next();
                String name = networkInterface.getName();
                if ("dummy0".equals(name) || "wlan0".equals(name)) {
                    Iterator it3 = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it3.hasNext()) {
                        String hostAddress = ((InetAddress) it3.next()).getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress)) {
                            if (!(hostAddress.indexOf(58) < 0)) {
                                int indexOf = hostAddress.indexOf(37);
                                if ("dummy0".equals(name)) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("type", "client_tun");
                                    if (indexOf >= 0) {
                                        hostAddress = hostAddress.substring(0, indexOf);
                                    }
                                    jSONObject.put(PushLog.KEY_VALUE, hostAddress.toUpperCase());
                                    jSONArray.put(jSONObject);
                                } else if ("wlan0".equals(name) || "fe80".equalsIgnoreCase(hostAddress.split("::")[0])) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("type", "client_anpi");
                                    if (indexOf >= 0) {
                                        hostAddress = hostAddress.substring(0, indexOf);
                                    }
                                    jSONObject2.put(PushLog.KEY_VALUE, hostAddress.toUpperCase());
                                    jSONArray.put(jSONObject2);
                                }
                            }
                        }
                    }
                }
            }
            return jSONArray;
        }

        @Override // com.bytedance.bdinstall.J
        @RequiresApi(api = 26)
        public String f(Context context, int i, Q q) {
            return q.z().d(i);
        }

        @Override // com.bytedance.bdinstall.J
        @RequiresApi(api = 26)
        public String g(Context context, int i, Q q) {
            return q.z().f(i);
        }
    }

    public static J b(String str) {
        J j = f3971c.get(str);
        return j != null ? j : a;
    }
}
