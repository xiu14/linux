package com.ss.ttuploader.net;

import android.text.TextUtils;
import com.ss.ttuploader.TTUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class TTUploadDNSParserBridge implements TTUploadDNSParserListener {
    private static final String TAG = "TTUploadDNSParserBridge";
    public String host;
    String ipList = null;
    boolean isFinish = false;
    private Lock lock = new ReentrantLock();
    private long handle = 0;

    private static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            TTUploadLog.d(TAG, "****get result:" + str);
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    boolean isFinish() {
        return this.isFinish;
    }

    @Override // com.ss.ttuploader.net.TTUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        this.lock.lock();
        try {
            if (this.isFinish) {
                TTUploadLog.d(TAG, String.format("has finished not nedd cur completion code:%d result:%s expiredTime:%d", Integer.valueOf(i), str2, Long.valueOf(j)));
            } else {
                TTUploadLog.d(TAG, String.format("receive completion code:%d result:%s", Integer.valueOf(i), str2));
                this.ipList = str2;
                this.isFinish = true;
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, str2, j, str3);
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void release() {
        this.lock.lock();
        try {
            this.handle = 0L;
            TTUploadDNSParser.getInstance().removeHost(this.host, this);
        } finally {
            this.lock.unlock();
        }
    }

    public int start(long j, String str) {
        TTUploadLog.d(TAG, "----start parse host:" + str);
        if (TextUtils.isEmpty(str)) {
            TTUploadLog.d(TAG, "****end parse fail for host:" + str);
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        try {
            this.host = str;
            TTUploadDNSInfo tTUploadDNSInfo = IPCache.getInstance().get(str);
            int i = 1;
            if (tTUploadDNSInfo != null) {
                this.ipList = tTUploadDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                TTUploadLog.d(TAG, String.format("get result from cache expiredT:%d curT:%d ", Long.valueOf(tTUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)));
                if (tTUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                    TTUploadLog.d(TAG, String.format("has expired try call parse:", new Object[0]));
                    TTUploadDNSParser.getInstance().addHost(str, null);
                }
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, this.ipList, tTUploadDNSInfo.mExpiredTime, null);
                }
            } else {
                TTUploadLog.d(TAG, "****add host to parser");
                TTUploadDNSParser.getInstance().addHost(str, this);
                i = 0;
            }
            return i;
        } finally {
            this.lock.unlock();
        }
    }
}
