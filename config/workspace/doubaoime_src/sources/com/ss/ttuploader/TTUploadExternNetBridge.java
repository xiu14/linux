package com.ss.ttuploader;

import android.text.TextUtils;
import com.bytedance.ttnet.i.d;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTUploadExternNetBridge implements TTExternNetLoaderListener {
    private Lock lock = new ReentrantLock();
    TTExternResponseInfo curResponseInfo = null;
    String extraInfo = null;
    volatile boolean isFinished = false;
    long mHandle = 0;

    private native void nativeTTNetCallback(long j);

    private native int nativeTTNetReadFileData(long j, byte[] bArr, long j2, int i);

    public void cancelTask(Object obj) {
        TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
        if (tTExternNetLoader != null) {
            tTExternNetLoader.cancelTask();
        }
    }

    public Object getExtraInfo() {
        try {
            this.lock.lock();
            return this.extraInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public Object getResponseObject() {
        try {
            this.lock.lock();
            return this.curResponseInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public int isFinished() {
        return this.isFinished ? 1 : 0;
    }

    @Override // com.ss.ttuploader.TTExternNetLoaderListener
    public void onComplete(TTExternResponseInfo tTExternResponseInfo) {
        try {
            this.lock.lock();
            this.curResponseInfo = tTExternResponseInfo;
            this.isFinished = true;
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
        }
    }

    @Override // com.ss.ttuploader.TTExternNetLoaderListener
    public void onFailed(String str, Throwable th) {
        try {
            this.lock.lock();
            this.isFinished = true;
            if (th != null) {
                this.extraInfo = th.toString();
            }
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
        }
    }

    @Override // com.ss.ttuploader.TTExternNetLoaderListener
    public int readFileData(byte[] bArr, long j, int i) {
        return nativeTTNetReadFileData(this.mHandle, bArr, j, i);
    }

    public void resetHandle() {
        try {
            this.lock.lock();
            this.mHandle = 0L;
        } finally {
            this.lock.unlock();
        }
    }

    public int sendRequest(Object obj, long j, String str, String str2, String str3, byte[] bArr, int i, int i2, int i3) {
        JSONObject jSONObject;
        int i4;
        if (obj != null && j != 0 && !TextUtils.isEmpty(str)) {
            this.mHandle = j;
            try {
                jSONObject = new JSONObject(str3);
            } catch (Exception unused) {
                jSONObject = null;
            }
            TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
            if (jSONObject != null) {
                this.curResponseInfo = null;
                try {
                    this.lock.lock();
                    this.isFinished = false;
                    this.lock.unlock();
                    d dVar = new d();
                    dVar.f5089e = i2 + i3;
                    dVar.f5091g = true;
                    try {
                        i4 = tTExternNetLoader.sendRequest(new TTExternRequestInfo(str, str2, jSONObject, bArr, dVar), this);
                    } catch (Throwable unused2) {
                        i4 = -2;
                    }
                    if (i4 < 0) {
                        return i4;
                    }
                    return 0;
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
        }
        return -1;
    }
}
