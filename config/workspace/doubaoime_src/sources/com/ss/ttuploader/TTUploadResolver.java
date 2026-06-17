package com.ss.ttuploader;

import com.heytap.mcssdk.constant.a;
import com.ss.ttuploader.net.HTTPDNS;
import com.ss.ttuploader.net.IPCache;
import com.ss.ttuploader.net.TTUploadDNSInfo;
import com.ss.ttuploader.net.TTUploadDNSParser;
import com.ss.ttuploader.net.TTUploadDNSParserListener;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class TTUploadResolver implements TTUploadDNSParserListener {
    public static final int DNS_TYPE_IS_VERSION_1 = 1;
    public static final int DNS_TYPE_IS_VERSION_2 = 2;
    public static final int HOST_MAX_CACHE_TIME = 60000;
    private static final int MAX_CACHED = 128;
    private static final String TAG = "TTUploadResolver";
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public static volatile int mDNSVersion = 1;
    public static volatile int mIsUseTTnetDNS;
    private String mError;
    private HostInfo mHostInfo;
    private volatile String mHostName;
    private volatile String[] mIPStr;
    private volatile boolean mRet = false;
    private Thread mThread = null;
    private int mUseDNSType = mDNSVersion;

    static class HostInfo {
        public String ip;
        public long time;

        HostInfo() {
        }
    }

    static class ParserHost implements Runnable {
        String mHostName;
        TTUploadResolver mResolver;

        public ParserHost(TTUploadResolver tTUploadResolver, String str) {
            this.mResolver = null;
            this.mResolver = tTUploadResolver;
            this.mHostName = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                int r0 = com.ss.ttuploader.TTUploadResolver.mIsUseTTnetDNS
                r1 = 0
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L22
                java.lang.String r0 = r5.mHostName     // Catch: java.lang.Throwable -> L1e
                java.util.List r0 = com.bytedance.ttnet.TTNetInit.dnsLookup(r0)     // Catch: java.lang.Throwable -> L1e
                if (r0 == 0) goto L22
                java.lang.Object r4 = r0.get(r1)     // Catch: java.lang.Throwable -> L1e
                if (r4 == 0) goto L22
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1e
                java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch: java.lang.Throwable -> L1e
                r3 = r0
                r0 = r2
                goto L23
            L1e:
                r0 = move-exception
                r0.printStackTrace()
            L22:
                r0 = r1
            L23:
                if (r0 != 0) goto L39
                java.lang.String r0 = r5.mHostName     // Catch: java.net.UnknownHostException -> L2c
                java.net.InetAddress r3 = java.net.InetAddress.getByName(r0)     // Catch: java.net.UnknownHostException -> L2c
                goto L39
            L2c:
                r0 = move-exception
                r0.printStackTrace()
                com.ss.ttuploader.TTUploadResolver r4 = r5.mResolver
                java.lang.String r0 = r0.getMessage()
                com.ss.ttuploader.TTUploadResolver.access$002(r4, r0)
            L39:
                if (r3 == 0) goto L6c
                java.lang.String r0 = r3.getHostAddress()
                com.ss.ttuploader.TTUploadResolver r3 = r5.mResolver
                java.lang.String[] r4 = new java.lang.String[r2]
                com.ss.ttuploader.TTUploadResolver.access$102(r3, r4)
                com.ss.ttuploader.TTUploadResolver r3 = r5.mResolver
                java.lang.String[] r3 = com.ss.ttuploader.TTUploadResolver.access$100(r3)
                r3[r1] = r0
                com.ss.ttuploader.TTUploadResolver$HostInfo r1 = new com.ss.ttuploader.TTUploadResolver$HostInfo
                r1.<init>()
                long r3 = java.lang.System.currentTimeMillis()
                r1.time = r3
                r1.ip = r0
                java.lang.String r0 = r5.mHostName
                com.ss.ttuploader.TTUploadResolver.putHostInfo(r0, r1)
                long r3 = java.lang.System.currentTimeMillis()
                r1.time = r3
                com.ss.ttuploader.TTUploadResolver r0 = r5.mResolver
                com.ss.ttuploader.TTUploadResolver.access$202(r0, r2)
                goto L71
            L6c:
                com.ss.ttuploader.TTUploadResolver r0 = r5.mResolver
                com.ss.ttuploader.TTUploadResolver.access$202(r0, r2)
            L71:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTUploadResolver.ParserHost.run():void");
        }
    }

    private void getAddressInfoVersion_1(String str) {
        this.mHostName = str;
        if (str == null || str.length() < 1 || "".equals(str)) {
            this.mRet = true;
            return;
        }
        if (isIP(this.mHostName)) {
            this.mIPStr = new String[1];
            this.mIPStr[0] = this.mHostName;
            this.mRet = true;
            return;
        }
        Hashtable<String, HostInfo> hashtable = mCacheHosts;
        HostInfo hostInfo = hashtable.get(str);
        this.mHostInfo = hostInfo;
        if (hostInfo != null) {
            if (hostInfo.ip != null && System.currentTimeMillis() - this.mHostInfo.time < a.f6886d) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = this.mHostInfo.ip;
                this.mRet = true;
                return;
            }
            hashtable.remove(str);
            this.mHostInfo = null;
        }
        try {
            Thread thread = new Thread(new ParserHost(this, this.mHostName));
            this.mThread = thread;
            thread.start();
        } catch (Exception e2) {
            this.mRet = true;
            this.mError = e2.getMessage();
        }
    }

    private void getAddressInfoVersion_2(String str) {
        TTUploadLog.d(TAG, "----add host to parser");
        this.mHostName = str;
        TTUploadDNSInfo tTUploadDNSInfo = IPCache.getInstance().get(str);
        if (tTUploadDNSInfo != null && tTUploadDNSInfo.mIpList != null) {
            long currentTimeMillis = System.currentTimeMillis();
            TTUploadLog.d(TAG, String.format("get result from cache expiredT:%d curT:%d ", Long.valueOf(tTUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)));
            if (tTUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                TTUploadLog.d(TAG, String.format("has expired try call parse:", new Object[0]));
                TTUploadDNSParser.getInstance().addHost(str, null);
            }
            String[] split = tTUploadDNSInfo.mIpList.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (split != null && split.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
                this.mRet = true;
                TTUploadLog.d(TAG, String.format("get result from cache suc, ip:%s ", split[0]));
            }
        }
        if (this.mRet) {
            return;
        }
        TTUploadLog.d(TAG, "****add host to parser");
        TTUploadDNSParser.getInstance().addHost(str, this);
    }

    public static final boolean isIP(String str) {
        return (str.length() < 7 || str.length() > 15) ? str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']' : Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        String str2;
        synchronized (TTUploadResolver.class) {
            long currentTimeMillis = System.currentTimeMillis();
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            String str3 = null;
            if (hashtable.size() > 128) {
                Iterator<Map.Entry<String, HostInfo>> it2 = hashtable.entrySet().iterator();
                String str4 = null;
                while (it2.hasNext()) {
                    HostInfo value = it2.next().getValue();
                    str3 = it2.next().getKey();
                    if (value != 0) {
                        long j = value.time;
                        if (j < currentTimeMillis) {
                            str4 = value;
                            currentTimeMillis = j;
                        }
                    }
                }
                str2 = str3;
                str3 = str4;
            } else {
                str2 = null;
            }
            if (str3 != null && str2 != null) {
                mCacheHosts.remove(str2);
            }
            mCacheHosts.put(str, hostInfo);
        }
    }

    public static void setDNSServer(String str, String str2) {
        HTTPDNS.setDNSServerHost(str, str2);
    }

    public static void setDNSType(int i, int i2, int i3, int i4, int i5) {
        if (i == 1 || i == 2) {
            TTUploadDNSParser.setIntValue(0, i2);
            TTUploadDNSParser.setIntValue(1, i3);
            TTUploadDNSParser.setIntValue(3, i4);
            TTUploadDNSParser.setIntValue(2, i5);
            mDNSVersion = i;
        }
    }

    public static void setEnableTTNetDNS(int i) {
        mIsUseTTnetDNS = i;
    }

    public void freeAddress() {
        Thread thread;
        if (this.mUseDNSType == 1 && (thread = this.mThread) != null) {
            try {
                thread.interrupt();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.mUseDNSType == 2) {
            try {
                TTUploadDNSParser.getInstance().removeHost(this.mHostName, this);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public String getAddress() {
        if (!this.mRet || this.mIPStr == null || this.mIPStr[0] == null) {
            return null;
        }
        return this.mIPStr[0];
    }

    public void getAddressInfo(String str) {
        int i = this.mUseDNSType;
        if (i == 1) {
            getAddressInfoVersion_1(str);
        } else if (i != 2) {
            getAddressInfoVersion_1(str);
        } else {
            getAddressInfoVersion_2(str);
        }
    }

    public int isSuccess() {
        if (this.mRet) {
            return (this.mIPStr == null || this.mIPStr[0] == null) ? -1 : 1;
        }
        return 0;
    }

    @Override // com.ss.ttuploader.net.TTUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        String[] split;
        TTUploadLog.d(TAG, String.format("notify result host:%s iplist:%s ", str, str2));
        if (this.mRet) {
            return;
        }
        if (str2 != null && str != null && str.equals(this.mHostName) && (split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null && split.length > 0) {
            this.mIPStr = new String[1];
            this.mIPStr[0] = split[0];
        }
        this.mRet = true;
    }
}
