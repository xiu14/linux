package com.ss.android.socialbase.downloader.network;

import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService;

/* loaded from: classes2.dex */
public class NetTrafficManager {
    private IDownloadNetTrafficManagerService service;

    private static class ConnectionClassManagerHolder {
        public static final NetTrafficManager instance = new NetTrafficManager();

        private ConnectionClassManagerHolder() {
        }
    }

    public interface NetworkStateChangeListener {
        void onBandwidthStateChange(NetworkQuality networkQuality);
    }

    public static NetTrafficManager getInstance() {
        return ConnectionClassManagerHolder.instance;
    }

    public void addBandwidth(long j, long j2) {
        this.service.addBandwidth(j, j2);
    }

    public NetworkQuality getCurrentNetworkQuality() {
        return this.service.getCurrentNetworkQuality();
    }

    public double getDownloadKBitsPerSecond() {
        return this.service.getDownloadKBitsPerSecond();
    }

    public NetworkQuality register(NetworkStateChangeListener networkStateChangeListener) {
        return this.service.register(networkStateChangeListener);
    }

    public void remove(NetworkStateChangeListener networkStateChangeListener) {
        this.service.remove(networkStateChangeListener);
    }

    public void reset() {
        this.service.reset();
    }

    private NetTrafficManager() {
        this.service = (IDownloadNetTrafficManagerService) DownloadServiceManager.getService(IDownloadNetTrafficManagerService.class);
    }
}
