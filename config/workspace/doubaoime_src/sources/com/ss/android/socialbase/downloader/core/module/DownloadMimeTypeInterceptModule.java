package com.ss.android.socialbase.downloader.core.module;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes2.dex */
public class DownloadMimeTypeInterceptModule extends AbsDownloadModule {
    private static final String TAG = "DownloadMimeTypeInterceptModule";

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r3 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkGlobalIntercept(com.ss.android.socialbase.downloader.model.DownloadInfo r5) {
        /*
            boolean r0 = checkModuleEnabled(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            com.ss.android.socialbase.downloader.depend.IDownloadInterceptor r2 = com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.getDownloadInterceptor()     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2.intercepte()     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L20
            boolean r4 = r2 instanceof com.ss.android.socialbase.downloader.depend.AbsDownloadInterceptor     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L20
            com.ss.android.socialbase.downloader.depend.AbsDownloadInterceptor r2 = (com.ss.android.socialbase.downloader.depend.AbsDownloadInterceptor) r2     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r2.intercept(r5)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r2 = move-exception
            goto L2c
        L20:
            if (r3 == 0) goto L26
        L22:
            r5.setInterceptFlag(r0)
            goto L32
        L26:
            r5.setInterceptFlag(r1)
            goto L32
        L2a:
            r2 = move-exception
            r3 = r1
        L2c:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L26
            goto L22
        L32:
            return r3
        L33:
            r2 = move-exception
            if (r3 == 0) goto L3a
            r5.setInterceptFlag(r0)
            goto L3d
        L3a:
            r5.setInterceptFlag(r1)
        L3d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.core.module.DownloadMimeTypeInterceptModule.checkGlobalIntercept(com.ss.android.socialbase.downloader.model.DownloadInfo):boolean");
    }

    private static boolean checkModuleEnabled(DownloadInfo downloadInfo) {
        return (DownloadComponentManager.getDownloadInterceptor() == null || downloadInfo.isIgnoreInterceptor()) ? false : true;
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public IDownloadModule init(DownloadCommonParams downloadCommonParams) {
        if (checkModuleEnabled(downloadCommonParams.mDownloadInfo)) {
            return super.init(downloadCommonParams);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        if (!TextUtils.isEmpty(this.mDownloadInfo.getMimeType()) && checkGlobalIntercept(this.mDownloadInfo)) {
            throw new BaseException(DownloadErrorCode.ERROR_BIZ_INTERCEPTOR, "download global intercept mimeType");
        }
        iDownloadModuleChain.proceed();
    }
}
