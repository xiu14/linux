package com.ss.ttuploader;

import android.os.SystemClock;
import android.util.Log;
import e.b.c.a.a;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTUploadUtil {
    private static final int UPDATE_PEROID = 300000;
    private static volatile boolean mIsLibraryLoaded = false;
    private static final ReentrantLock mLock = new ReentrantLock();
    private static volatile TTLibraryLoaderProxy mProxy;
    private static volatile String mServerIP;
    private static volatile long mServerIPTime;

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static synchronized boolean initInternal() {
        synchronized (TTUploadUtil.class) {
            if (!loadLibrary()) {
                Log.e("ttmn", String.format("proxy library load fail", new Object[0]));
                return false;
            }
            Log.d("ttmn", "use defaullt loadLibrary()");
            if (systemLoadInit(mProxy != null) != 1) {
                Log.e("ttmn", String.format("library has not been loaded", new Object[0]));
                return false;
            }
            Log.d("ttmn", "init()");
            return true;
        }
    }

    public static Map<String, String> jsonToHashMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String valueOf = String.valueOf(keys.next());
            hashMap.put(valueOf, jSONObject.optString(valueOf));
        }
        return hashMap;
    }

    private static boolean loadLibrary() {
        if (mProxy == null) {
            return true;
        }
        if (mProxy != null && !mIsLibraryLoaded) {
            boolean z = a.a() || mProxy.loadLibrary("ttopenssl");
            mProxy.loadLibrary("vcn");
            mProxy.loadLibrary("vcnverify");
            mIsLibraryLoaded = z && mProxy.loadLibrary("ttvideouploader");
        }
        return mIsLibraryLoaded;
    }

    private static boolean loadVcn() {
        if (!e.j.a.a.a.a()) {
            Log.e("ttmn", "Can't load vcn");
        }
        if (e.j.a.a.a.b()) {
            return true;
        }
        Log.e("ttmn", "Can't load vcn verify");
        return true;
    }

    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!com.bytedance.android.input.k.b.a.Y(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!com.bytedance.android.input.k.b.a.Y(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setLoadProxy(TTLibraryLoaderProxy tTLibraryLoaderProxy) {
        ReentrantLock reentrantLock = mLock;
        reentrantLock.lock();
        if (tTLibraryLoaderProxy != null) {
            try {
                mProxy = tTLibraryLoaderProxy;
            } catch (Throwable th) {
                mLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    private static int systemLoadInit(boolean z) {
        if (mIsLibraryLoaded) {
            return 1;
        }
        mIsLibraryLoaded = z;
        if (!mIsLibraryLoaded) {
            if (!a.a()) {
                Log.e("ttmn", "load boringssl fail!");
            }
            if (!e.j.a.a.a.a()) {
                Log.e("ttmn", "Can't load vcn");
            }
            if (!e.j.a.a.a.b()) {
                Log.e("ttmn", "Can't load vcn verify");
            }
            try {
                Log.e("ttmn", "load openssl");
                System.loadLibrary("ttopenssl");
            } catch (UnsatisfiedLinkError e2) {
                Log.e("ttmn", "Can't load openssl library: " + e2);
            } catch (Throwable th) {
                Log.e("ttmn", "other exception when loading openssl library: " + th);
            }
            try {
                System.loadLibrary("ttvideouploader");
                mIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                Log.e("ttmn", "Can't load avmdl library: " + e3);
            } catch (Throwable th2) {
                Log.e("ttmn", "other exception when loading avmdl library: " + th2);
            }
        }
        return !mIsLibraryLoaded ? -1 : 1;
    }

    public static synchronized void updateDNSServerIP() {
        synchronized (TTUploadUtil.class) {
            if (SystemClock.elapsedRealtime() - mServerIPTime < 300000) {
                return;
            }
            new Thread(new Runnable() { // from class: com.ss.ttuploader.TTUploadUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            String unused = TTUploadUtil.mServerIP = byName.getHostAddress();
                            long unused2 = TTUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                        }
                    } catch (UnknownHostException unused3) {
                    }
                }
            }).start();
        }
    }
}
