package com.ss.android.socialbase.downloader.cleaner;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.socialbase.downloader.logger.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public class Detecter {
    private static final int COUNT_INIT = 0;
    private static final int DETECT_COUNT_MAX = 3;
    private static final int SMOOTH_COUNT_MAX = 10;
    private static final String TAG = "Detecter";
    private static final int THREAD_STUCK_MAX = 200;
    private static final int THREAD_STUCK_MIN = 50;
    private IDetecterEventCallback eventCallback;
    private volatile DetecterState mState = DetecterState.DETECTER_INIT;
    private volatile Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    private volatile Semaphore mMainThreadResponseSem = new Semaphore(0);
    private ExecutorService mDetecterThreadPool = Executors.newCachedThreadPool();
    private volatile boolean mIsStop = false;
    private int mSmoothHitCount = 0;
    private int mStuckHitCount = 0;

    private enum DetecterState {
        DETECTER_INIT,
        DETECTER_STUCK,
        DETECTER_SMOOTH
    }

    interface IDetecterEventCallback {
        void onSmooth();

        void onStuck();
    }

    public Detecter(IDetecterEventCallback iDetecterEventCallback) {
        this.eventCallback = iDetecterEventCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkStuck(long j, long j2) {
        long j3 = j2 - j;
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "CheckStuck", "ping main thread duration=" + j3);
        }
        tryUpdateState(j3);
    }

    private void tryUpdateState(long j) {
        if (j >= 200) {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "tryUpdateState", ">200ms enter real stuck");
            }
            this.mSmoothHitCount = 0;
            if (isStuck()) {
                return;
            }
            this.mStuckHitCount = 0;
            transToNewState(DetecterState.DETECTER_STUCK);
            return;
        }
        if (j >= 50) {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "tryUpdateState", "50ms<=duration<=200ms enter maybe stuck");
            }
            this.mSmoothHitCount = 0;
            if (isStuck()) {
                return;
            }
            int i = this.mStuckHitCount + 1;
            this.mStuckHitCount = i;
            if (i >= 3) {
                this.mStuckHitCount = 0;
                transToNewState(DetecterState.DETECTER_STUCK);
                return;
            }
            return;
        }
        this.mStuckHitCount = 0;
        if (isSmooth()) {
            return;
        }
        int i2 = this.mSmoothHitCount;
        if (i2 == 10) {
            transToNewState(DetecterState.DETECTER_SMOOTH);
            this.mSmoothHitCount++;
        } else if (i2 < 10) {
            this.mSmoothHitCount = i2 + 1;
        }
    }

    boolean isSmooth() {
        return DetecterState.DETECTER_SMOOTH == this.mState;
    }

    boolean isStuck() {
        return DetecterState.DETECTER_STUCK == this.mState;
    }

    public void start() {
        synchronized (this) {
            if (this.mState == DetecterState.DETECTER_INIT) {
                this.mState = DetecterState.DETECTER_SMOOTH;
                this.mDetecterThreadPool.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.cleaner.Detecter.1
                    @Override // java.lang.Runnable
                    public void run() {
                        while (true) {
                            Detecter.this.mMainThreadHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.cleaner.Detecter.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Detecter.this.mMainThreadResponseSem.release();
                                }
                            });
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                Detecter.this.mMainThreadResponseSem.acquire();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                            if (Detecter.this.mIsStop) {
                                Detecter.this.mIsStop = false;
                                return;
                            } else {
                                Detecter.this.checkStuck(currentTimeMillis, System.currentTimeMillis());
                                try {
                                    Thread.sleep(500L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public void stop() {
        this.mIsStop = true;
        this.eventCallback = null;
        this.mMainThreadResponseSem.release();
    }

    void transToNewState(final DetecterState detecterState) {
        this.mState = detecterState;
        this.mDetecterThreadPool.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.cleaner.Detecter.2
            @Override // java.lang.Runnable
            public void run() {
                DetecterState detecterState2 = DetecterState.DETECTER_STUCK;
                DetecterState detecterState3 = detecterState;
                if (detecterState2 == detecterState3) {
                    if (Logger.debug()) {
                        Logger.globalDebug(Detecter.TAG, "transToNewState", "transToNewState to stuck");
                    }
                    Detecter.this.eventCallback.onStuck();
                } else if (DetecterState.DETECTER_SMOOTH == detecterState3) {
                    if (Logger.debug()) {
                        Logger.globalDebug(Detecter.TAG, "transToNewState", "transToNewState to smooth");
                    }
                    Detecter.this.eventCallback.onSmooth();
                }
            }
        });
    }
}
