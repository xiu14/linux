package com.ss.android.socialbase.downloader.network;

import com.ss.android.socialbase.downloader.network.NetTrafficManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class NetTrafficManagerImpl {
    private static final long BANDWIDTH_LOWER_BOUND = 3;
    private static final int BYTES_TO_BITS = 8;
    private static final double DEFAULT_DECAY_CONSTANT = 0.05d;
    private static final int DEFAULT_GOOD_BANDWIDTH = 2000;
    private static final long DEFAULT_HYSTERESIS_PERCENT = 20;
    private static final int DEFAULT_MODERATE_BANDWIDTH = 550;
    private static final int DEFAULT_POOR_BANDWIDTH = 150;
    private static final double DEFAULT_SAMPLES_TO_QUALITY_CHANGE = 5.0d;
    private static final double HYSTERESIS_BOTTOM_MULTIPLIER = 0.8d;
    private static final double HYSTERESIS_TOP_MULTIPLIER = 1.25d;
    private final AtomicReference<NetworkQuality> currentNetworkQuality;
    private volatile boolean initiateStateChange;
    private final List<NetTrafficManager.NetworkStateChangeListener> listenerList;
    private final ExponentialGeometricAverage mDownloadBandwidth;
    private AtomicReference<NetworkQuality> nextNetworkQuality;
    private int sampleCount;

    /* renamed from: com.ss.android.socialbase.downloader.network.NetTrafficManagerImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$socialbase$downloader$network$NetworkQuality;

        static {
            NetworkQuality.values();
            int[] iArr = new int[5];
            $SwitchMap$com$ss$android$socialbase$downloader$network$NetworkQuality = iArr;
            try {
                NetworkQuality networkQuality = NetworkQuality.POOR;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$ss$android$socialbase$downloader$network$NetworkQuality;
                NetworkQuality networkQuality2 = NetworkQuality.MODERATE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$ss$android$socialbase$downloader$network$NetworkQuality;
                NetworkQuality networkQuality3 = NetworkQuality.GOOD;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$ss$android$socialbase$downloader$network$NetworkQuality;
                NetworkQuality networkQuality4 = NetworkQuality.EXCELLENT;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class ConnectionClassManagerHolder {
        public static final NetTrafficManagerImpl instance = new NetTrafficManagerImpl(null);

        private ConnectionClassManagerHolder() {
        }
    }

    /* synthetic */ NetTrafficManagerImpl(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static NetTrafficManagerImpl getInstance() {
        return ConnectionClassManagerHolder.instance;
    }

    private NetworkQuality mapBandwidthQuality(double d2) {
        return d2 < 0.0d ? NetworkQuality.UNKNOWN : d2 < 150.0d ? NetworkQuality.POOR : d2 < 550.0d ? NetworkQuality.MODERATE : d2 < 2000.0d ? NetworkQuality.GOOD : NetworkQuality.EXCELLENT;
    }

    private void notifyListeners() {
        try {
            int size = this.listenerList.size();
            for (int i = 0; i < size; i++) {
                this.listenerList.get(i).onBandwidthStateChange(this.currentNetworkQuality.get());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean significantlyOutsideCurrentBand() {
        if (this.mDownloadBandwidth == null) {
            return false;
        }
        try {
            int ordinal = this.currentNetworkQuality.get().ordinal();
            double d2 = 2000.0d;
            double d3 = 550.0d;
            if (ordinal == 0) {
                d3 = 0.0d;
                d2 = 150.0d;
            } else if (ordinal == 1) {
                d2 = 550.0d;
                d3 = 150.0d;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    return true;
                }
                d2 = 3.4028234663852886E38d;
                d3 = 2000.0d;
            }
            double average = this.mDownloadBandwidth.getAverage();
            if (average > d2) {
                if (average > d2 * HYSTERESIS_TOP_MULTIPLIER) {
                    return true;
                }
            } else if (average < d3 * HYSTERESIS_BOTTOM_MULTIPLIER) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public synchronized void addBandwidth(long j, long j2) {
        NetworkQuality currentNetworkQuality;
        double d2 = ((j * 1.0d) / j2) * 8.0d;
        if (j2 == 0 || d2 < 3.0d) {
            return;
        }
        try {
            this.mDownloadBandwidth.addMeasurement(d2);
            currentNetworkQuality = getCurrentNetworkQuality();
        } catch (Throwable unused) {
        }
        if (!this.initiateStateChange) {
            if (this.currentNetworkQuality.get() != currentNetworkQuality) {
                this.initiateStateChange = true;
                this.nextNetworkQuality = new AtomicReference<>(currentNetworkQuality);
            }
            return;
        }
        this.sampleCount++;
        if (currentNetworkQuality != this.nextNetworkQuality.get()) {
            this.initiateStateChange = false;
            this.sampleCount = 1;
        }
        if (this.sampleCount >= DEFAULT_SAMPLES_TO_QUALITY_CHANGE && significantlyOutsideCurrentBand()) {
            this.initiateStateChange = false;
            this.sampleCount = 1;
            this.currentNetworkQuality.set(this.nextNetworkQuality.get());
            notifyListeners();
        }
    }

    public synchronized NetworkQuality getCurrentNetworkQuality() {
        ExponentialGeometricAverage exponentialGeometricAverage = this.mDownloadBandwidth;
        if (exponentialGeometricAverage == null) {
            return NetworkQuality.UNKNOWN;
        }
        try {
            return mapBandwidthQuality(exponentialGeometricAverage.getAverage());
        } catch (Throwable th) {
            th.printStackTrace();
            return NetworkQuality.UNKNOWN;
        }
    }

    public synchronized double getDownloadKBitsPerSecond() {
        ExponentialGeometricAverage exponentialGeometricAverage;
        exponentialGeometricAverage = this.mDownloadBandwidth;
        return exponentialGeometricAverage == null ? -1.0d : exponentialGeometricAverage.getAverage();
    }

    public NetworkQuality register(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener) {
        if (networkStateChangeListener != null) {
            this.listenerList.add(networkStateChangeListener);
        }
        return this.currentNetworkQuality.get();
    }

    public void remove(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener) {
        if (networkStateChangeListener != null) {
            this.listenerList.remove(networkStateChangeListener);
        }
    }

    public void reset() {
        try {
            ExponentialGeometricAverage exponentialGeometricAverage = this.mDownloadBandwidth;
            if (exponentialGeometricAverage != null) {
                exponentialGeometricAverage.reset();
            }
            this.currentNetworkQuality.set(NetworkQuality.UNKNOWN);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private NetTrafficManagerImpl() {
        this.mDownloadBandwidth = new ExponentialGeometricAverage(DEFAULT_DECAY_CONSTANT);
        this.initiateStateChange = false;
        this.currentNetworkQuality = new AtomicReference<>(NetworkQuality.UNKNOWN);
        this.listenerList = new CopyOnWriteArrayList();
    }
}
