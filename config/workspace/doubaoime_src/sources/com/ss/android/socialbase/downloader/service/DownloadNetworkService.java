package com.ss.android.socialbase.downloader.service;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadNetworkService implements IDownloadNetworkService {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ss.android.socialbase.downloader.network.IDownloadHttpConnection downloadWithConnectionImpl(int r14, java.lang.String r15, java.lang.String r16, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r17, int r18, boolean r19, com.ss.android.socialbase.downloader.model.DownloadInfo r20) throws com.ss.android.socialbase.downloader.exception.BaseException, java.io.IOException {
        /*
            r13 = this;
            r7 = r18
            r10 = r13
            com.ss.android.socialbase.downloader.network.IDownloadHttpService r0 = r13.getHttpServiceInternal(r7)
            if (r0 == 0) goto L55
            r1 = 0
            r8 = 0
            r2 = 0
            if (r19 == 0) goto L1b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L17
            goto L1b
        L14:
            r0 = move-exception
            r5 = r15
            goto L40
        L17:
            r0 = move-exception
            r5 = r15
        L19:
            r4 = r0
            goto L3d
        L1b:
            r4 = r14
            r5 = r15
            r6 = r17
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r0.downloadWithConnection(r14, r15, r6)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            if (r19 == 0) goto L38
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r2
            java.lang.String r6 = "get"
            r1 = r0
            r2 = r15
            r3 = r16
            r4 = r11
            r7 = r18
            r9 = r20
            com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper.monitorDownloadConnect(r1, r2, r3, r4, r6, r7, r8, r9)
        L38:
            return r0
        L39:
            r0 = move-exception
            goto L40
        L3b:
            r0 = move-exception
            goto L19
        L3d:
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            r8 = r4
        L40:
            if (r19 == 0) goto L54
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r2
            java.lang.String r6 = "get"
            r2 = r15
            r3 = r16
            r4 = r11
            r7 = r18
            r9 = r20
            com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper.monitorDownloadConnect(r1, r2, r3, r4, r6, r7, r8, r9)
        L54:
            throw r0
        L55:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            r1 = 1022(0x3fe, float:1.432E-42)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "httpService not exist, netLib = "
            java.lang.String r3 = e.a.a.a.a.j(r3, r7)
            r2.<init>(r3)
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.service.DownloadNetworkService.downloadWithConnectionImpl(int, java.lang.String, java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):com.ss.android.socialbase.downloader.network.IDownloadHttpConnection");
    }

    private boolean enableTTNetIpRequest(DownloadInfo downloadInfo) {
        JSONObject optJSONObject;
        return (downloadInfo == null || (optJSONObject = DownloadSetting.obtain(downloadInfo.getId()).optJSONObject(DownloadSettingKeys.SEGMENT_CONFIG)) == null || optJSONObject.optInt(DownloadSettingKeys.SegmentConfig.ENABLE_TTNET_IP_REQUEST, 0) <= 0) ? false : true;
    }

    private int[] getDownloadNetLibs(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? new int[]{1, 0} : new int[]{2} : new int[]{0, 1} : new int[]{1} : new int[]{0};
    }

    private IDownloadHttpService getHttpServiceInternal(int i) {
        if (2 != i) {
            return i == 1 ? DownloadComponentManager.getHttpService() : DownloadComponentManager.getDefaultHttpService();
        }
        IDownloadHttpService httpService = DownloadComponentManager.getHttpService();
        return httpService != null ? httpService : DownloadComponentManager.getDefaultHttpService();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetworkService
    public IDownloadHttpConnection downloadWithConnection(boolean z, int i, String str, List<HttpHeader> list) throws Exception {
        return downloadWithConnection(z, i, str, null, list, 0, false, null);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetworkService
    public IDownloadHttpConnection downloadWithConnection(boolean z, int i, String str, String str2, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) throws Exception {
        List<HttpHeader> list2;
        int i3;
        IDownloadHttpConnection downloadWithConnectionImpl;
        if (!TextUtils.isEmpty(str2)) {
            List<HttpHeader> arrayList = list == null ? new ArrayList<>() : list;
            arrayList.add(new HttpHeader(DownloadConstants.EXTRA_REQUEST_HOST_IP, str2));
            if (enableTTNetIpRequest(downloadInfo)) {
                list2 = arrayList;
                i3 = i2;
            } else {
                list2 = arrayList;
                i3 = 1;
            }
        } else if (z) {
            list2 = list;
            i3 = i2;
        } else {
            i3 = 2;
            list2 = list;
        }
        int[] downloadNetLibs = getDownloadNetLibs(i3);
        int length = downloadNetLibs.length;
        int i4 = 0;
        Exception exc = null;
        while (i4 < length) {
            int i5 = i4;
            try {
                downloadWithConnectionImpl = downloadWithConnectionImpl(i, str, str2, list2, downloadNetLibs[i4], z2, downloadInfo);
            } catch (Exception e2) {
                if (downloadInfo != null && downloadInfo.isExpiredRedownload() && DownloadUtils.isResponseCode304Error(e2) && DownloadUtils.hasDownloadCacheHeader(list2)) {
                    throw e2;
                }
                exc = e2;
            }
            if (downloadWithConnectionImpl != null) {
                return downloadWithConnectionImpl;
            }
            i4 = i5 + 1;
        }
        if (exc == null) {
            return null;
        }
        throw exc;
    }
}
