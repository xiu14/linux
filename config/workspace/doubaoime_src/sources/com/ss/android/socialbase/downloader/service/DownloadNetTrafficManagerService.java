package com.ss.android.socialbase.downloader.service;

import com.ss.android.socialbase.downloader.network.NetTrafficManager;
import com.ss.android.socialbase.downloader.network.NetTrafficManagerImpl;
import com.ss.android.socialbase.downloader.network.NetworkQuality;

/* loaded from: classes2.dex */
public class DownloadNetTrafficManagerService implements IDownloadNetTrafficManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public void addBandwidth(long j, long j2) {
        NetTrafficManagerImpl.getInstance().addBandwidth(j, j2);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public NetworkQuality getCurrentNetworkQuality() {
        return NetTrafficManagerImpl.getInstance().getCurrentNetworkQuality();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public double getDownloadKBitsPerSecond() {
        return NetTrafficManagerImpl.getInstance().getDownloadKBitsPerSecond();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public NetworkQuality register(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener) {
        return NetTrafficManagerImpl.getInstance().register(networkStateChangeListener);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public void remove(NetTrafficManager.NetworkStateChangeListener networkStateChangeListener) {
        NetTrafficManagerImpl.getInstance().remove(networkStateChangeListener);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public void reset() {
        NetTrafficManagerImpl.getInstance().reset();
    }
}
