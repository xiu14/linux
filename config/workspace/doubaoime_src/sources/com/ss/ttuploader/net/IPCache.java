package com.ss.ttuploader.net;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class IPCache {
    private static IPCache mInstance = null;
    private static String mNetExtraInfo = null;
    private static int mNetType = -1;
    private ConcurrentHashMap<String, TTUploadDNSInfo> mDNSRecord = new ConcurrentHashMap<>();
    private Lock lock = new ReentrantLock();

    private IPCache() {
    }

    public static IPCache getInstance() {
        if (mInstance == null) {
            synchronized (IPCache.class) {
                if (mInstance == null) {
                    mInstance = new IPCache();
                }
            }
        }
        return mInstance;
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public TTUploadDNSInfo get(String str) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            return concurrentHashMap != null ? concurrentHashMap.get(str) : null;
        } finally {
            this.lock.unlock();
        }
    }

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    public int getRecordSize() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            return concurrentHashMap != null ? concurrentHashMap.size() : -1;
        } finally {
            this.lock.unlock();
        }
    }

    public void put(String str, TTUploadDNSInfo tTUploadDNSInfo) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, tTUploadDNSInfo);
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }
}
