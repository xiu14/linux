package com.ss.android.socialbase.downloader.core;

import com.ss.android.socialbase.downloader.core.module.DownloadCommonParams;
import com.ss.android.socialbase.downloader.exception.BaseException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class DownloadModuleChain implements IDownloadModuleChain {
    private DownloadCommonParams mCommonParams;
    private int mIndex;
    private List<IDownloadModule> mDownloadModules = new CopyOnWriteArrayList();
    private volatile boolean mStartDownload = false;

    public DownloadModuleChain(DownloadCommonParams downloadCommonParams) {
        this.mCommonParams = downloadCommonParams;
    }

    public DownloadModuleChain addDownloadModule(IDownloadModule iDownloadModule) {
        IDownloadModule init = iDownloadModule.init(this.mCommonParams);
        if (init == null) {
            return this;
        }
        this.mDownloadModules.add(init);
        return this;
    }

    public void cancel() {
        Iterator<IDownloadModule> it2 = this.mDownloadModules.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    public boolean isStartDownload() {
        return this.mStartDownload;
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModuleChain
    public void onDownloadStart() {
        this.mStartDownload = true;
    }

    public void pause() {
        Iterator<IDownloadModule> it2 = this.mDownloadModules.iterator();
        while (it2.hasNext()) {
            it2.next().pause();
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModuleChain
    public void proceed() throws BaseException {
        if (this.mIndex == this.mDownloadModules.size()) {
            return;
        }
        IDownloadModule iDownloadModule = this.mDownloadModules.get(this.mIndex);
        this.mIndex++;
        iDownloadModule.proceed(this);
    }

    public void reset() {
        this.mIndex = 0;
    }

    public void setThrottleNetSpeed(long j) {
        Iterator<IDownloadModule> it2 = this.mDownloadModules.iterator();
        while (it2.hasNext()) {
            it2.next().setThrottleNetSpeed(j);
        }
    }
}
