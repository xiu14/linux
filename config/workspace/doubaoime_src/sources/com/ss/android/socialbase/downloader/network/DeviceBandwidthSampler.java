package com.ss.android.socialbase.downloader.network;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.thread.DownloadWatchDog;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class DeviceBandwidthSampler {
    private static final String TAG = "DeviceBandwidthSampler";
    private static volatile DeviceBandwidthSampler instance = null;
    private static volatile int sNetworkType = 0;
    private static long sPreviousBytes = -1;
    private long mLastTimeReading;
    private final List<ISampleListener> listenerList = new CopyOnWriteArrayList();
    private final NetTrafficManager mNetTrafficManager = NetTrafficManager.getInstance();
    private final AtomicInteger mSamplingCounter = new AtomicInteger();
    private final SamplingHandler mHandler = new SamplingHandler(DownloadWatchDog.getThreadLooper());

    public interface ISampleListener {
        void addSample();
    }

    private class SamplingHandler extends Handler {
        private static final int MSG_START = 1;
        static final long SAMPLE_TIME = 1000;

        public SamplingHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            DeviceBandwidthSampler.this.addSample();
            sendEmptyMessageDelayed(1, 1000L);
        }

        public void startSamplingThread() {
            sendEmptyMessage(1);
        }

        public void stopSamplingThread() {
            removeMessages(1);
        }
    }

    private DeviceBandwidthSampler() {
    }

    public static long getAllRxBytesWifi() {
        return TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
    }

    public static DeviceBandwidthSampler getInstance() {
        if (instance == null) {
            synchronized (DeviceBandwidthSampler.class) {
                if (instance == null) {
                    instance = new DeviceBandwidthSampler();
                }
            }
        }
        return instance;
    }

    public static boolean isMobileNet() {
        return sNetworkType == 2;
    }

    public static boolean isWifi() {
        return sNetworkType == 1;
    }

    public static void updateNetworkStatus() {
        sNetworkType = DownloadUtils.getNetworkType(DownloadComponentManager.getAppContext());
    }

    protected void addFinalSample() {
        addSample();
        sPreviousBytes = -1L;
    }

    protected void addSample() {
        try {
            updateNetworkStatus();
            long allRxBytesWifi = isWifi() ? getAllRxBytesWifi() : TrafficStats.getMobileRxBytes();
            long j = sPreviousBytes;
            long j2 = allRxBytesWifi - j;
            if (j >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.mNetTrafficManager.addBandwidth(j2, uptimeMillis - this.mLastTimeReading);
                    this.mLastTimeReading = uptimeMillis;
                }
            }
            sPreviousBytes = allRxBytesWifi;
            Iterator<ISampleListener> it2 = this.listenerList.iterator();
            while (it2.hasNext()) {
                it2.next().addSample();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean isSampling() {
        return this.mSamplingCounter.get() != 0;
    }

    public void registerSampleListener(ISampleListener iSampleListener) {
        this.listenerList.add(iSampleListener);
    }

    public void removeSampleListener(ISampleListener iSampleListener) {
        this.listenerList.remove(iSampleListener);
    }

    public void startSampling() {
        try {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "startSampling", "SamplingCounter = " + this.mSamplingCounter);
            }
            if (this.mSamplingCounter.getAndIncrement() == 0) {
                this.mHandler.startSamplingThread();
                this.mLastTimeReading = SystemClock.uptimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    public void stopSampling() {
        try {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "stopSampling", "SamplingCounter = " + this.mSamplingCounter);
            }
            if (this.mSamplingCounter.decrementAndGet() == 0) {
                this.mHandler.stopSamplingThread();
                addFinalSample();
            }
        } catch (Throwable unused) {
        }
    }
}
