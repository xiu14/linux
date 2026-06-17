package com.ss.android.socialbase.downloader.service;

import com.ss.android.socialbase.downloader.network.NetTrafficManager;
import com.ss.android.socialbase.downloader.network.NetworkQuality;

/* loaded from: classes2.dex */
public interface IDownloadNetTrafficManagerService {

    public static class DefaultDownloadNetTrafficManagerService implements IDownloadNetTrafficManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void addBandwidth(long j, long j2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public NetworkQuality getCurrentNetworkQuality() {
            return NetworkQuality.UNKNOWN;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public double getDownloadKBitsPerSecond() {
            return 0.0d;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public NetworkQuality register(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener) {
            return NetworkQuality.UNKNOWN;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void remove(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void reset() {
        }
    }

    void addBandwidth(long j, long j2);

    NetworkQuality getCurrentNetworkQuality();

    double getDownloadKBitsPerSecond();

    NetworkQuality register(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener);

    void remove(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener);

    void reset();
}
