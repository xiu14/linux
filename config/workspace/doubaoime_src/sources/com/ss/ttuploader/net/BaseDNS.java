package com.ss.ttuploader.net;

import android.os.Handler;

/* loaded from: classes2.dex */
public class BaseDNS {
    private static final int MSG_IS_CANCELLED = 0;
    private static final int MSG_IS_ERROR = 2;
    private static final int MSG_IS_RETRY = 1;
    private static final int MSG_IS_SUCCESS = 3;
    private static final String TAG = "BaseDNS";
    protected boolean mCancelled;
    protected Handler mHandler;
    public String mHostname;
    public String mId;
    protected DNSCompletionListener mListener;
    protected TTVNetClient mNetClient;

    public BaseDNS(String str, Handler handler) {
        this.mCancelled = false;
        this.mNetClient = null;
        this.mHostname = str;
        this.mHandler = handler;
        this.mId = Long.toString(System.nanoTime()) + Integer.toString(System.identityHashCode(this));
    }

    public void cancel() {
    }

    public void close() {
    }

    public boolean isRunning() {
        return true;
    }

    protected void notifyCancelled() {
        this.mHandler.sendEmptyMessage(0);
    }

    protected void notifyError(TTUploadDNSInfo tTUploadDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, tTUploadDNSInfo));
    }

    protected void notifyRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    protected void notifySuccess(TTUploadDNSInfo tTUploadDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, tTUploadDNSInfo));
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    public void start() {
    }

    public BaseDNS(String str, TTVNetClient tTVNetClient, Handler handler) {
        this.mCancelled = false;
        this.mNetClient = null;
        this.mHostname = str;
        this.mHandler = handler;
        this.mNetClient = tTVNetClient == null ? new TTHTTPNetwork() : tTVNetClient;
        this.mId = Long.toString(System.nanoTime()) + Integer.toString(System.identityHashCode(this));
    }
}
