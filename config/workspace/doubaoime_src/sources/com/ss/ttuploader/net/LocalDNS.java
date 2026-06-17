package com.ss.ttuploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.ttuploader.TTUploadLog;
import com.xiaomi.mipush.sdk.Constants;
import e.a.a.a.a;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class LocalDNS extends BaseDNS {
    private static final String TAG = "LocalDNS";
    private static final int TIME_OUT = 10000;
    private InetAddress[] mAddress;
    private Future mFuture;
    private boolean mRet;

    private static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }

        @Override // java.lang.Runnable
        public void run() {
            TTUploadLog.d(LocalDNS.TAG, String.format("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                TTUploadLog.d(LocalDNS.TAG, String.format("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else {
                if (localDNS.mRet) {
                    return;
                }
                localDNS.cancel();
                TTUploadLog.d(LocalDNS.TAG, String.format("****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new TTUploadDNSInfo(0, localDNS.mHostname, null, 0L, localDNS.mId));
            }
        }
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
        this.mRet = false;
    }

    @Override // com.ss.ttuploader.net.BaseDNS
    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.ttuploader.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.ttuploader.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    @Override // com.ss.ttuploader.net.BaseDNS
    public void start() {
        try {
            this.mFuture = TTUploadThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.ttuploader.net.LocalDNS.1
                @Override // java.lang.Runnable
                public void run() {
                    TTUploadLog.d(LocalDNS.TAG, String.format("----call local dns, host:%s", LocalDNS.this.mHostname));
                    try {
                        LocalDNS localDNS = LocalDNS.this;
                        localDNS.mAddress = InetAddress.getAllByName(localDNS.mHostname);
                        LocalDNS.this.mRet = true;
                        if (LocalDNS.this.mAddress == null) {
                            TTUploadLog.d(LocalDNS.TAG, String.format("****end call local dns, not get address host:%s", LocalDNS.this.mHostname));
                            LocalDNS localDNS2 = LocalDNS.this;
                            localDNS2.notifyError(new TTUploadDNSInfo(0, localDNS2.mHostname, null, 0L, localDNS2.mId));
                            return;
                        }
                        String str = "";
                        for (int i = 0; i < LocalDNS.this.mAddress.length; i++) {
                            String hostAddress = LocalDNS.this.mAddress[i].getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                str = TextUtils.isEmpty(str) ? a.s(str, hostAddress) : a.t(str, Constants.ACCEPT_TIME_SEPARATOR_SP, hostAddress);
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            TTUploadLog.d(LocalDNS.TAG, String.format("****end call local dns, iplist null host:%s", LocalDNS.this.mHostname));
                            LocalDNS localDNS3 = LocalDNS.this;
                            localDNS3.notifyError(new TTUploadDNSInfo(0, localDNS3.mHostname, null, 0L, localDNS3.mId));
                        } else {
                            TTUploadLog.d(LocalDNS.TAG, String.format("****end call local dns, suc iplist:%s host:%s", str, LocalDNS.this.mHostname));
                            TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(0, LocalDNS.this.mHostname, str, System.currentTimeMillis() + (TTUploadDNSParser.mGlobalDefaultExpiredTime * 1000), LocalDNS.this.mId);
                            IPCache.getInstance().put(LocalDNS.this.mHostname, tTUploadDNSInfo);
                            LocalDNS.this.notifySuccess(tTUploadDNSInfo);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        LocalDNS.this.mRet = true;
                        TTUploadLog.d(LocalDNS.TAG, String.format("****end call local dns, end exception:%s host:%s", th, LocalDNS.this.mHostname));
                        LocalDNS localDNS4 = LocalDNS.this;
                        localDNS4.notifyError(new TTUploadDNSInfo(0, localDNS4.mHostname, null, 0L, localDNS4.mId));
                    }
                }
            });
        } catch (Exception e2) {
            TTUploadLog.d(TAG, String.format("****end call local dns, exception:%s host:%s", e2, this.mHostname));
            notifyError(new TTUploadDNSInfo(0, this.mHostname, null, 0L, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), com.heytap.mcssdk.constant.a.q);
    }
}
