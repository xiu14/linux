package com.ss.ttuploader.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.ss.ttuploader.TTUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class TTUploadDNSParser {
    public static final int DNS_TYPE_HTTP_ALI = 1;
    public static final int DNS_TYPE_HTTP_GOOGLE = 3;
    public static final int DNS_TYPE_HTTP_OWN = 2;
    public static final int DNS_TYPE_LOCAL = 0;
    public static final int MSG_IS_PARSER_ERROR = 2;
    public static final int MSG_IS_PARSER_RETRY = 1;
    public static final int MSG_IS_PARSER_SUCCESS = 3;
    public static final int PARSER_IS_BACKUP = 1;
    public static final int PARSER_IS_MAIN = 0;
    private static final String TAG = "TTUploadDNSParser";
    public static final int TTUPLOAD_DNS_BACKUP_TYPE = 1;
    public static final int TTUPLOAD_DNS_DEFAULT_EXPIRED_TIME = 2;
    public static final int TTUPLOAD_DNS_MAIN_DELAYED_USE_BACKUP_TIME = 3;
    public static final int TTUPLOAD_DNS_MAIN_TYPE = 0;
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    private static TTUploadDNSParser mInstance;
    private Handler mHandler;
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mType;
    private int mTimeOut = 5;
    private Lock mLock = new ReentrantLock();
    private Map<String, TTUploadHostProcessor> mProcessors = new HashMap();

    public TTUploadDNSParser() {
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) { // from class: com.ss.ttuploader.net.TTUploadDNSParser.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object obj = message.obj;
                TTUploadDNSInfo tTUploadDNSInfo = obj != null ? (TTUploadDNSInfo) obj : null;
                TTUploadLog.d(TTUploadDNSParser.TAG, String.format("----receive msg what:%d info:%s", Integer.valueOf(message.what), tTUploadDNSInfo));
                int i = message.what;
                if (i == 1) {
                    TTUploadDNSParser.this.processParseMsg(i, tTUploadDNSInfo);
                } else if (i == 2) {
                    TTUploadDNSParser.this.proccessFailMsg(i, tTUploadDNSInfo);
                } else if (i == 3) {
                    TTUploadDNSParser.this.proccessSucMsg(i, tTUploadDNSInfo);
                }
                TTUploadLog.d(TTUploadDNSParser.TAG, String.format("****end proc msg what:%d info:%s", Integer.valueOf(message.what), tTUploadDNSInfo));
            }
        };
    }

    private void addListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TTUploadLog.d(TAG, String.format("---add listener:%s for host:%s", tTUploadDNSParserListener, str));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(str);
            TTUploadLog.d(TAG, String.format("get processor:%s", tTUploadHostProcessor));
            if (tTUploadHostProcessor == null) {
                tTUploadHostProcessor = new TTUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                TTUploadLog.d(TAG, String.format("create processor:%s", tTUploadHostProcessor));
                z = true;
            } else {
                z = false;
            }
            if (tTUploadDNSParserListener != null && !tTUploadHostProcessor.mListeners.containsKey(tTUploadDNSParserListener)) {
                TTUploadLog.d(TAG, String.format("add listener", new Object[0]));
                tTUploadHostProcessor.mListeners.put(tTUploadDNSParserListener, 1);
            }
            this.mProcessors.put(str, tTUploadHostProcessor);
            if (z) {
                TTUploadLog.d(TAG, String.format("new processor implement parse", new Object[0]));
                tTUploadHostProcessor.processMsg(0, new TTUploadDNSInfo(mGlobalMainType, str, null, 0L, null));
            }
            this.mLock.unlock();
            TTUploadLog.d(TAG, String.format("****end add listener", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public static TTUploadDNSParser getInstance() {
        if (mInstance == null) {
            synchronized (TTUploadDNSParser.class) {
                if (mInstance == null) {
                    mInstance = new TTUploadDNSParser();
                }
            }
        }
        return mInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proccessFailMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.d(TAG, String.format("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.d(TAG, String.format("----proc fail msg what:%d host:%s", Integer.valueOf(i), tTUploadDNSInfo.mHost));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            TTUploadLog.d(TAG, String.format("get processor:%s host:%s", tTUploadHostProcessor, tTUploadDNSInfo.mHost));
            if (tTUploadHostProcessor != null && tTUploadHostProcessor.isValidSourceId(tTUploadDNSInfo.mId)) {
                tTUploadHostProcessor.processResult(i, tTUploadDNSInfo);
                if (tTUploadHostProcessor.isEnd()) {
                    TTUploadLog.d(TAG, String.format("processor end, notify result", new Object[0]));
                    for (TTUploadDNSParserListener tTUploadDNSParserListener : tTUploadHostProcessor.mListeners.keySet()) {
                        if (tTUploadDNSParserListener != null) {
                            TTUploadLog.d(TAG, String.format("listener:%s oncompletion fail", tTUploadDNSParserListener));
                            tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo.mHost, null, 0L, null);
                        }
                    }
                    tTUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(tTUploadDNSInfo.mHost);
                } else {
                    TTUploadLog.d(TAG, String.format("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            TTUploadLog.d(TAG, String.format("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proccessSucMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        HashMap<TTUploadDNSParserListener, Integer> hashMap;
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.d(TAG, String.format("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.d(TAG, String.format("----proc suc msg what:%d host:%s", Integer.valueOf(i), tTUploadDNSInfo.mHost));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            TTUploadLog.d(TAG, String.format("get processor:%s host:%s", tTUploadHostProcessor, tTUploadDNSInfo.mHost));
            if (tTUploadHostProcessor != null && (hashMap = tTUploadHostProcessor.mListeners) != null) {
                for (TTUploadDNSParserListener tTUploadDNSParserListener : hashMap.keySet()) {
                    if (tTUploadDNSParserListener != null) {
                        TTUploadLog.d(TAG, String.format("listener:%s oncompletion suc", tTUploadDNSParserListener));
                        tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo.mHost, tTUploadDNSInfo.mIpList, tTUploadDNSInfo.mExpiredTime, null);
                    }
                }
                tTUploadHostProcessor.mListeners.clear();
                this.mProcessors.remove(tTUploadDNSInfo.mHost);
                TTUploadLog.d(TAG, String.format("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            TTUploadLog.d(TAG, String.format("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processParseMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.d(TAG, String.format("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.d(TAG, String.format("----proc parser msg what:%d host:%s", Integer.valueOf(i), tTUploadDNSInfo.mHost));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            if (tTUploadHostProcessor != null) {
                TTUploadLog.d(TAG, String.format("----get processor:%s host:%s", tTUploadHostProcessor, tTUploadDNSInfo.mHost));
                tTUploadHostProcessor.processMsg(i, tTUploadDNSInfo);
            } else {
                TTUploadLog.d(TAG, String.format("****get processor null for host:%s", tTUploadDNSInfo.mHost));
            }
            this.mLock.unlock();
            TTUploadLog.d(TAG, String.format("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    private void removeListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        if (TextUtils.isEmpty(str) || tTUploadDNSParserListener == null) {
            return;
        }
        TTUploadLog.d(TAG, String.format("---remove listener:%s for host:%s", tTUploadDNSParserListener, str));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(str);
            TTUploadLog.d(TAG, String.format("get processor:%s", tTUploadHostProcessor));
            if (tTUploadHostProcessor != null) {
                TTUploadLog.d(TAG, String.format("remove listener", new Object[0]));
                tTUploadHostProcessor.mListeners.remove(tTUploadDNSParserListener);
            }
            if (tTUploadHostProcessor != null && tTUploadHostProcessor.mListeners.size() == 0) {
                TTUploadLog.d(TAG, String.format("listeners empty remove host from processors", new Object[0]));
                this.mProcessors.remove(str);
            }
            this.mLock.unlock();
            TTUploadLog.d(TAG, String.format("****end remove listener", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public static void setIntValue(int i, int i2) {
        TTUploadLog.d(TAG, String.format("****set value:%d for key:%d", Integer.valueOf(i2), Integer.valueOf(i)));
        if (i == 0) {
            mGlobalMainType = i2;
            return;
        }
        if (i == 1) {
            mGlobalBackType = i2;
        } else if (i == 2) {
            mGlobalDefaultExpiredTime = i2;
        } else {
            if (i != 3) {
                return;
            }
            mGlobalBackUpDelayedTime = i2;
        }
    }

    public void addHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        addListenerInternal(str, tTUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(i, str, null, 0L, null);
        Message message = new Message();
        message.what = 0;
        message.obj = tTUploadDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public void release() {
    }

    public void removeHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        removeListenerInternal(str, tTUploadDNSParserListener);
    }
}
