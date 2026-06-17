package com.ss.android.socialbase.downloader.downloader;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.xiaomi.mipush.sdk.Constants;
import e.a.a.a.a;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkFailoverStrategy {
    private static final String FALLBACK_ERROR_IP = "0.0.0.0";
    private static final String TAG = "NetworkFailoverStrategy";
    private static final int TTNET_HTTP_PROTO_TYPE_HTTP1 = 1;
    private static final int TTNET_HTTP_PROTO_TYPE_HTTP2 = 2;
    private static final int TTNET_HTTP_PROTO_TYPE_QUIC = 3;
    private static final String TTNET_ISOLATION_HEADER_KEY = "x-ttnet-isolation-info";
    private static final String TTNET_ISOLATION_HEADER_VALUE = "https://dl";
    private String mDownloadHost;
    private Set<Integer> mIsolationErrorCodeSet = new HashSet();
    private int mIsolationCount = 0;
    private int mIsolationHttpProtoType = 0;
    private Set<Integer> mTimeoutErrorCodeSet = new HashSet();
    private List<Long> mConnectTimeoutList = new ArrayList();
    private List<Long> mIoTimeoutList = new ArrayList();
    private Set<Integer> mIpChangeErrorCodeSet = new HashSet();
    private int mIpChangeCountLimit = 0;
    private List<String> mBackHostList = new ArrayList();
    private Set<Integer> mBackHostErrorCodeSet = new HashSet();
    private int mBackHostCountLimit = 0;
    private List<FailoverStrategy> mFailoverStrategyList = new ArrayList();
    private int mDownloadId = 0;

    private class BackHostStrategyImpl implements FailoverStrategy {
        private boolean mBackHostEnable;
        private boolean mHandleCurrentBackHostHeader = false;
        private int mCurrentBackHostCount = -1;

        BackHostStrategyImpl() {
            this.mBackHostEnable = false;
            if (NetworkFailoverStrategy.this.mBackHostCountLimit <= 0 || NetworkFailoverStrategy.this.mBackHostList.isEmpty()) {
                return;
            }
            this.mBackHostEnable = true;
        }

        private boolean handleBackHostError(BaseException baseException) {
            if (this.mBackHostEnable && this.mCurrentBackHostCount < NetworkFailoverStrategy.this.mBackHostCountLimit) {
                boolean z = NetworkFailoverStrategy.this.mBackHostErrorCodeSet.isEmpty() || NetworkFailoverStrategy.this.mBackHostErrorCodeSet.contains(Integer.valueOf(baseException.getErrorCode()));
                if (z) {
                    int i = this.mCurrentBackHostCount + 1;
                    this.mCurrentBackHostCount = i;
                    if (i != NetworkFailoverStrategy.this.mBackHostCountLimit) {
                        return true;
                    }
                    if (Logger.debug()) {
                        int i2 = NetworkFailoverStrategy.this.mDownloadId;
                        StringBuilder M = a.M("BackHostCountLimit");
                        M.append(NetworkFailoverStrategy.this.mBackHostCountLimit);
                        M.append(" currentBackHostCount:");
                        M.append(this.mCurrentBackHostCount);
                        M.append(" errorCode:");
                        M.append(baseException.getErrorCode());
                        Logger.taskDebug(NetworkFailoverStrategy.TAG, i2, "handleBackHostError", M.toString());
                    }
                    return false;
                }
                if (Logger.debug()) {
                    int i3 = NetworkFailoverStrategy.this.mDownloadId;
                    StringBuilder X = a.X("IsMatch", z, " BackHostCountLimit:");
                    X.append(NetworkFailoverStrategy.this.mBackHostCountLimit);
                    X.append(" errorCode:");
                    X.append(baseException.getErrorCode());
                    Logger.taskDebug(NetworkFailoverStrategy.TAG, i3, "handleBackHostError", X.toString());
                }
            }
            return false;
        }

        private void handleBackHostHeader(List<HttpHeader> list) {
            int i;
            if (!this.mBackHostEnable || !this.mHandleCurrentBackHostHeader || (i = this.mCurrentBackHostCount) < 0 || i >= NetworkFailoverStrategy.this.mBackHostCountLimit) {
                return;
            }
            this.mHandleCurrentBackHostHeader = false;
            String str = (String) NetworkFailoverStrategy.this.mBackHostList.get(this.mCurrentBackHostCount % NetworkFailoverStrategy.this.mBackHostList.size());
            if (Logger.debug()) {
                Logger.taskDebug(NetworkFailoverStrategy.TAG, NetworkFailoverStrategy.this.mDownloadId, "handleBackHostHeader", "Add BackHost Header: " + str);
            }
            list.add(new HttpHeader(DownloadConstants.EXTRA_TTNET_BACK_HOST, str));
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public boolean handleError(BaseException baseException) {
            boolean handleBackHostError = handleBackHostError(baseException);
            this.mHandleCurrentBackHostHeader = handleBackHostError;
            return handleBackHostError;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public void handleHeader(List<HttpHeader> list) {
            handleBackHostHeader(list);
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public boolean isFailoverOnly() {
            return true;
        }
    }

    private class DefaultIpChangeStrategyImpl implements FailoverStrategy {
        private boolean mIpChangeEnable;
        private boolean mHandleCurrentIpChangeHeader = false;
        private int mCurrentIpChangeCount = -1;
        private Set<String> mIpChangeErrorIps = new HashSet();

        DefaultIpChangeStrategyImpl() {
            this.mIpChangeEnable = false;
            if (NetworkFailoverStrategy.this.mIpChangeCountLimit <= 0 || NetworkFailoverStrategy.this.mIpChangeErrorCodeSet.isEmpty()) {
                return;
            }
            this.mIpChangeEnable = true;
        }

        private boolean handleIpChangeError(BaseException baseException) {
            if (!this.mIpChangeEnable || !(baseException instanceof DownloadTTNetException) || this.mCurrentIpChangeCount >= NetworkFailoverStrategy.this.mIpChangeCountLimit || !NetworkFailoverStrategy.this.mIpChangeErrorCodeSet.contains(Integer.valueOf(baseException.getErrorCode()))) {
                return false;
            }
            String remoteIp = ((DownloadTTNetException) baseException).getRemoteIp();
            if (this.mCurrentIpChangeCount >= NetworkFailoverStrategy.this.mIpChangeCountLimit) {
                if (Logger.debug()) {
                    int i = NetworkFailoverStrategy.this.mDownloadId;
                    StringBuilder U = a.U(" RemoteIp:", remoteIp, " currentIpChangeCount:");
                    U.append(this.mCurrentIpChangeCount);
                    U.append(" errorCode:");
                    U.append(baseException.getErrorCode());
                    U.append(" mIpChangeErrorIps:");
                    U.append(this.mIpChangeErrorIps.toString());
                    Logger.taskDebug(NetworkFailoverStrategy.TAG, i, "handleIpChangeError", U.toString());
                }
                return false;
            }
            int i2 = this.mCurrentIpChangeCount + 1;
            this.mCurrentIpChangeCount = i2;
            if (i2 != NetworkFailoverStrategy.this.mIpChangeCountLimit) {
                if (TextUtils.isEmpty(remoteIp)) {
                    this.mIpChangeErrorIps.add(NetworkFailoverStrategy.FALLBACK_ERROR_IP);
                    return true;
                }
                this.mIpChangeErrorIps.add(remoteIp);
                return true;
            }
            if (Logger.debug()) {
                int i3 = NetworkFailoverStrategy.this.mDownloadId;
                StringBuilder M = a.M("CurrentIpChangeCount:");
                M.append(this.mCurrentIpChangeCount);
                M.append(" mIpChangeCountLimit:");
                a.E0(M, NetworkFailoverStrategy.this.mIpChangeCountLimit, NetworkFailoverStrategy.TAG, i3, "handleIpChangeError");
            }
            return false;
        }

        private void handleIpChangeHeader(List<HttpHeader> list) {
            int i;
            if (!this.mIpChangeEnable || !this.mHandleCurrentIpChangeHeader || (i = this.mCurrentIpChangeCount) < 0 || i >= NetworkFailoverStrategy.this.mIpChangeCountLimit) {
                return;
            }
            this.mHandleCurrentIpChangeHeader = false;
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = this.mIpChangeErrorIps.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            if (Logger.debug()) {
                int i2 = NetworkFailoverStrategy.this.mDownloadId;
                StringBuilder M = a.M("Add extra_ttnet_change_ip:");
                M.append(sb.toString());
                Logger.taskDebug(NetworkFailoverStrategy.TAG, i2, "handleIpChangeHeader", M.toString());
            }
            list.add(new HttpHeader(DownloadConstants.EXTRA_TTNET_CHANGE_IP, sb.toString()));
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public boolean handleError(BaseException baseException) {
            boolean handleIpChangeError = handleIpChangeError(baseException);
            this.mHandleCurrentIpChangeHeader = handleIpChangeError;
            return handleIpChangeError;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public void handleHeader(List<HttpHeader> list) {
            handleIpChangeHeader(list);
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public boolean isFailoverOnly() {
            return true;
        }
    }

    private interface FailoverStrategy {
        boolean handleError(BaseException baseException);

        void handleHeader(List<HttpHeader> list);

        boolean isFailoverOnly();
    }

    private class IsolationIpChangeStrategyImpl extends DefaultIpChangeStrategyImpl {
        private boolean mHandleCurrentIsolationHeader;
        private boolean mIsolationEnable;
        private int mIsolationIndex;

        IsolationIpChangeStrategyImpl() {
            super();
            this.mIsolationEnable = false;
            this.mHandleCurrentIsolationHeader = false;
            this.mIsolationIndex = -1;
            if (NetworkFailoverStrategy.this.mIsolationCount <= 0 || NetworkFailoverStrategy.this.mIsolationErrorCodeSet.isEmpty()) {
                return;
            }
            this.mIsolationEnable = true;
        }

        private boolean handleIsolationError(BaseException baseException) {
            if (this.mIsolationEnable && this.mIsolationIndex < NetworkFailoverStrategy.this.mIsolationCount) {
                boolean contains = NetworkFailoverStrategy.this.mIsolationErrorCodeSet.contains(Integer.valueOf(baseException.getErrorCode()));
                if (contains) {
                    int i = this.mIsolationIndex + 1;
                    this.mIsolationIndex = i;
                    if (i != NetworkFailoverStrategy.this.mIsolationCount) {
                        return true;
                    }
                    if (Logger.debug()) {
                        int i2 = NetworkFailoverStrategy.this.mDownloadId;
                        StringBuilder M = a.M("IsolationCount");
                        M.append(NetworkFailoverStrategy.this.mIsolationCount);
                        M.append(" ttnetIsolationIndex:");
                        M.append(this.mIsolationIndex);
                        M.append(" errorCode:");
                        M.append(baseException.getErrorCode());
                        Logger.taskDebug(NetworkFailoverStrategy.TAG, i2, "handleIsolationError", M.toString());
                    }
                    return false;
                }
                if (Logger.debug()) {
                    int i3 = NetworkFailoverStrategy.this.mDownloadId;
                    StringBuilder X = a.X("IsMatch", contains, " ttnetIsolationIndex:");
                    X.append(this.mIsolationIndex);
                    X.append(" errorCode:");
                    X.append(baseException.getErrorCode());
                    Logger.taskDebug(NetworkFailoverStrategy.TAG, i3, "handleIsolationError", X.toString());
                }
            }
            return false;
        }

        private boolean handleIsolationHeader(List<HttpHeader> list) {
            int i;
            if (!this.mIsolationEnable || !this.mHandleCurrentIsolationHeader || (i = this.mIsolationIndex) < 0 || i >= NetworkFailoverStrategy.this.mIsolationCount) {
                return false;
            }
            this.mHandleCurrentIsolationHeader = false;
            if (Logger.debug()) {
                Logger.taskDebug(NetworkFailoverStrategy.TAG, NetworkFailoverStrategy.this.mDownloadId, "handleIsolationHeader", "Add handleIsolationHeader: https://dl");
            }
            list.add(new HttpHeader(NetworkFailoverStrategy.TTNET_ISOLATION_HEADER_KEY, NetworkFailoverStrategy.TTNET_ISOLATION_HEADER_VALUE));
            if (NetworkFailoverStrategy.this.mIsolationHttpProtoType <= 0) {
                return true;
            }
            if (Logger.debug()) {
                a.E0(a.M("Add x-ttnet-http-proto-type: "), NetworkFailoverStrategy.this.mIsolationHttpProtoType, NetworkFailoverStrategy.TAG, NetworkFailoverStrategy.this.mDownloadId, "handleIsolationHeader");
            }
            DownloadHelper.removeHeaderKey(list, DownloadHelper.TTNET_PROTO_TYPE);
            list.add(new HttpHeader(DownloadHelper.TTNET_PROTO_TYPE, String.valueOf(NetworkFailoverStrategy.this.mIsolationHttpProtoType)));
            return true;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.DefaultIpChangeStrategyImpl, com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public boolean handleError(BaseException baseException) {
            boolean handleIsolationError = handleIsolationError(baseException);
            this.mHandleCurrentIsolationHeader = handleIsolationError;
            if (handleIsolationError) {
                super.handleError(baseException);
            }
            return this.mHandleCurrentIsolationHeader;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.DefaultIpChangeStrategyImpl, com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public void handleHeader(List<HttpHeader> list) {
            if (handleIsolationHeader(list)) {
                super.handleHeader(list);
            }
        }
    }

    private class TimeoutStrategyImpl implements FailoverStrategy {
        private boolean mTimeoutEnable;
        private int mTimeoutIndex = -1;

        TimeoutStrategyImpl() {
            this.mTimeoutEnable = false;
            if (NetworkFailoverStrategy.this.mTimeoutErrorCodeSet.isEmpty()) {
                return;
            }
            if (NetworkFailoverStrategy.this.mIoTimeoutList.isEmpty() && NetworkFailoverStrategy.this.mConnectTimeoutList.isEmpty()) {
                return;
            }
            this.mTimeoutEnable = true;
        }

        private boolean handleTimeoutError(BaseException baseException) {
            if (!this.mTimeoutEnable) {
                return false;
            }
            boolean contains = NetworkFailoverStrategy.this.mTimeoutErrorCodeSet.contains(Integer.valueOf(baseException.getErrorCode()));
            if (contains) {
                this.mTimeoutIndex++;
                return true;
            }
            if (Logger.debug()) {
                int i = NetworkFailoverStrategy.this.mDownloadId;
                StringBuilder X = a.X("IsMatch:", contains, " ttnetTimeoutIndex:");
                X.append(this.mTimeoutIndex);
                X.append(" errorCode:");
                X.append(baseException.getErrorCode());
                Logger.taskDebug(NetworkFailoverStrategy.TAG, i, "handleTimeoutError", X.toString());
            }
            return false;
        }

        private void handleTimeoutHeader(List<HttpHeader> list) {
            if (!this.mTimeoutEnable || this.mTimeoutIndex < 0) {
                return;
            }
            if (!NetworkFailoverStrategy.this.mConnectTimeoutList.isEmpty()) {
                String valueOf = String.valueOf(NetworkFailoverStrategy.this.mConnectTimeoutList.get(this.mTimeoutIndex < NetworkFailoverStrategy.this.mConnectTimeoutList.size() ? this.mTimeoutIndex : NetworkFailoverStrategy.this.mConnectTimeoutList.size() - 1));
                if (Logger.debug()) {
                    Logger.taskDebug(NetworkFailoverStrategy.TAG, NetworkFailoverStrategy.this.mDownloadId, "handleTimeoutHeader", "Add ConnectTimeout:" + valueOf);
                }
                list.add(new HttpHeader(DownloadConstants.EXTRA_TTNET_CONNECT_TIMEOUT, valueOf));
            }
            if (NetworkFailoverStrategy.this.mIoTimeoutList.isEmpty()) {
                return;
            }
            String valueOf2 = String.valueOf(NetworkFailoverStrategy.this.mIoTimeoutList.get(this.mTimeoutIndex < NetworkFailoverStrategy.this.mIoTimeoutList.size() ? this.mTimeoutIndex : NetworkFailoverStrategy.this.mIoTimeoutList.size() - 1));
            if (Logger.debug()) {
                Logger.taskDebug(NetworkFailoverStrategy.TAG, NetworkFailoverStrategy.this.mDownloadId, "handleTimeoutHeader", "Add IoTimeout:" + valueOf2);
            }
            list.add(new HttpHeader(DownloadConstants.EXTRA_TTNET_IO_TIMEOUT, valueOf2));
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public boolean handleError(BaseException baseException) {
            return handleTimeoutError(baseException);
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public void handleHeader(List<HttpHeader> list) {
            handleTimeoutHeader(list);
        }

        @Override // com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy.FailoverStrategy
        public boolean isFailoverOnly() {
            return false;
        }
    }

    public NetworkFailoverStrategy(DownloadInfo downloadInfo) {
        String str;
        int i;
        String sb;
        String str2 = " backHostCountLimit:";
        try {
            initInternal(downloadInfo);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                int i2 = this.mDownloadId;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        sb2.append("Init Error");
                        sb2.append(th.toString());
                        Logger.taskError(TAG, i2, TAG, sb2.toString());
                        if (Logger.debug()) {
                            i = this.mDownloadId;
                            StringBuilder M = a.M("Init ttnetIsolationCount:");
                            M.append(this.mIsolationCount);
                            M.append(" mIsolationErrorCodeSet:");
                            M.append(this.mIsolationErrorCodeSet.toString());
                            M.append(" mIsolationHttpProtoType:");
                            M.append(this.mIsolationHttpProtoType);
                            M.append(" ttnetTimeoutErrorCodes:");
                            M.append(this.mTimeoutErrorCodeSet.toString());
                            M.append(" ttnetConnectTimeout:");
                            M.append(this.mConnectTimeoutList.toString());
                            M.append(" ttnetIoTimeout:");
                            M.append(this.mIoTimeoutList.toString());
                            M.append(" ipChangeCountLimit:");
                            M.append(this.mIpChangeCountLimit);
                            M.append(" ipChangeErrorCodeSet:");
                            M.append(this.mIpChangeErrorCodeSet);
                            M.append(" host:");
                            M.append(this.mDownloadHost);
                            M.append(" backHostList:");
                            M.append(this.mBackHostList.toString());
                            M.append(" backHostCountLimit:");
                            M.append(this.mBackHostCountLimit);
                            M.append(" backHostErrorCodeSet:");
                            M.append(this.mBackHostErrorCodeSet);
                            sb = M.toString();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = " backHostErrorCodeSet:";
                        str2 = " backHostCountLimit:";
                        if (!Logger.debug()) {
                            throw th;
                        }
                        int i3 = this.mDownloadId;
                        StringBuilder M2 = a.M("Init ttnetIsolationCount:");
                        Throwable th3 = th;
                        M2.append(this.mIsolationCount);
                        M2.append(" mIsolationErrorCodeSet:");
                        M2.append(this.mIsolationErrorCodeSet.toString());
                        M2.append(" mIsolationHttpProtoType:");
                        M2.append(this.mIsolationHttpProtoType);
                        M2.append(" ttnetTimeoutErrorCodes:");
                        M2.append(this.mTimeoutErrorCodeSet.toString());
                        M2.append(" ttnetConnectTimeout:");
                        M2.append(this.mConnectTimeoutList.toString());
                        M2.append(" ttnetIoTimeout:");
                        M2.append(this.mIoTimeoutList.toString());
                        M2.append(" ipChangeCountLimit:");
                        M2.append(this.mIpChangeCountLimit);
                        M2.append(" ipChangeErrorCodeSet:");
                        M2.append(this.mIpChangeErrorCodeSet);
                        M2.append(" host:");
                        M2.append(this.mDownloadHost);
                        M2.append(" backHostList:");
                        M2.append(this.mBackHostList.toString());
                        M2.append(str2);
                        M2.append(this.mBackHostCountLimit);
                        M2.append(str);
                        M2.append(this.mBackHostErrorCodeSet);
                        Logger.taskDebug(TAG, i3, TAG, M2.toString());
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = " backHostErrorCodeSet:";
                }
            } catch (Throwable th5) {
                th = th5;
                str = " backHostErrorCodeSet:";
            }
        }
        if (Logger.debug()) {
            i = this.mDownloadId;
            StringBuilder M3 = a.M("Init ttnetIsolationCount:");
            M3.append(this.mIsolationCount);
            M3.append(" mIsolationErrorCodeSet:");
            M3.append(this.mIsolationErrorCodeSet.toString());
            M3.append(" mIsolationHttpProtoType:");
            M3.append(this.mIsolationHttpProtoType);
            M3.append(" ttnetTimeoutErrorCodes:");
            M3.append(this.mTimeoutErrorCodeSet.toString());
            M3.append(" ttnetConnectTimeout:");
            M3.append(this.mConnectTimeoutList.toString());
            M3.append(" ttnetIoTimeout:");
            M3.append(this.mIoTimeoutList.toString());
            M3.append(" ipChangeCountLimit:");
            M3.append(this.mIpChangeCountLimit);
            M3.append(" ipChangeErrorCodeSet:");
            M3.append(this.mIpChangeErrorCodeSet);
            M3.append(" host:");
            M3.append(this.mDownloadHost);
            M3.append(" backHostList:");
            M3.append(this.mBackHostList.toString());
            M3.append(" backHostCountLimit:");
            M3.append(this.mBackHostCountLimit);
            M3.append(" backHostErrorCodeSet:");
            M3.append(this.mBackHostErrorCodeSet);
            sb = M3.toString();
            Logger.taskDebug(TAG, i, TAG, sb);
        }
        this.mFailoverStrategyList.add(new TimeoutStrategyImpl());
        this.mFailoverStrategyList.add(new DefaultIpChangeStrategyImpl());
        this.mFailoverStrategyList.add(new IsolationIpChangeStrategyImpl());
        this.mFailoverStrategyList.add(new BackHostStrategyImpl());
        this.mFailoverStrategyList.add(new TimeoutStrategyImpl());
    }

    private void initInternal(DownloadInfo downloadInfo) throws Throwable {
        JSONObject optJSONObject;
        String[] split;
        if (downloadInfo != null) {
            this.mDownloadId = downloadInfo.getId();
            this.mDownloadHost = new URL(downloadInfo.getUrl()).getHost();
            optJSONObject = DownloadSetting.obtain(this.mDownloadId).optJSONObject(DownloadSettingKeys.NETWORK_FAILOVER_STRATEGY);
        } else {
            optJSONObject = DownloadSetting.obtainGlobal().optJSONObject(DownloadSettingKeys.NETWORK_FAILOVER_STRATEGY);
        }
        if (optJSONObject == null) {
            return;
        }
        int optInt = optJSONObject.optInt(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_BACK_HOST_COUNT_LIMIT);
        if (optInt > 0) {
            this.mBackHostCountLimit = optInt;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_BACK_HOST);
        if (!TextUtils.isEmpty(this.mDownloadHost) && optJSONArray != null && optJSONArray.length() > 0) {
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                }
                String optString = optJSONArray.optString(i);
                if (TextUtils.isEmpty(optString) || (split = optString.split(Constants.COLON_SEPARATOR)) == null || split.length != 2 || !this.mDownloadHost.equals(split[0]) || TextUtils.isEmpty(split[1])) {
                    i++;
                } else {
                    String[] split2 = split[1].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (split2 != null && split2.length > 0) {
                        for (String str : split2) {
                            if (!TextUtils.isEmpty(str)) {
                                this.mBackHostList.add(str);
                            }
                        }
                    }
                }
            }
        }
        JSONArray optJSONArray2 = optJSONObject.optJSONArray(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_BACK_HOST_ERROR_CODE);
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                int optInt2 = optJSONArray2.optInt(i2);
                if (optInt2 > 0) {
                    this.mBackHostErrorCodeSet.add(Integer.valueOf(optInt2));
                }
            }
        }
        int optInt3 = optJSONObject.optInt(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_ISOLATION_COUNT);
        if (optInt3 > 0) {
            this.mIsolationCount = optInt3;
        }
        JSONArray optJSONArray3 = optJSONObject.optJSONArray(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_ISOLATION_ERROR_CODE);
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                int optInt4 = optJSONArray3.optInt(i3);
                if (optInt4 > 0) {
                    this.mIsolationErrorCodeSet.add(Integer.valueOf(optInt4));
                }
            }
        }
        int optInt5 = optJSONObject.optInt(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_ISOLATION_HTTP_PROTO_TYPE);
        if (1 == optInt5 || 2 == optInt5 || 3 == optInt5) {
            this.mIsolationHttpProtoType = optInt5;
        }
        JSONArray optJSONArray4 = optJSONObject.optJSONArray(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_TIMEOUT_ERROR_CODE);
        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                int optInt6 = optJSONArray4.optInt(i4);
                if (optInt6 > 0) {
                    this.mTimeoutErrorCodeSet.add(Integer.valueOf(optInt6));
                }
            }
        }
        JSONArray optJSONArray5 = optJSONObject.optJSONArray(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_TIMEOUT_CONNECT);
        if (optJSONArray5 != null && optJSONArray5.length() > 0) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                long optLong = optJSONArray5.optLong(i5);
                if (optLong > 0) {
                    this.mConnectTimeoutList.add(Long.valueOf(optLong));
                }
            }
        }
        JSONArray optJSONArray6 = optJSONObject.optJSONArray(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_TIMEOUT_IO);
        if (optJSONArray6 != null && optJSONArray6.length() > 0) {
            for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                long optLong2 = optJSONArray6.optLong(i6);
                if (optLong2 > 0) {
                    this.mIoTimeoutList.add(Long.valueOf(optLong2));
                }
            }
        }
        JSONArray optJSONArray7 = optJSONObject.optJSONArray(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_IP_CHANGE_ERROR_CODE);
        if (optJSONArray7 != null && optJSONArray7.length() > 0) {
            for (int i7 = 0; i7 < optJSONArray7.length(); i7++) {
                int optInt7 = optJSONArray7.optInt(i7);
                if (optInt7 > 0) {
                    this.mIpChangeErrorCodeSet.add(Integer.valueOf(optInt7));
                }
            }
        }
        int optInt8 = optJSONObject.optInt(DownloadSettingKeys.NetworkFailoverStrategy.KEY_TTNET_IP_CHANGE_COUNT_LIMIT);
        if (optInt8 > 0) {
            this.mIpChangeCountLimit = optInt8;
        }
    }

    public void handleError(BaseException baseException) {
        if (baseException == null) {
            return;
        }
        for (FailoverStrategy failoverStrategy : this.mFailoverStrategyList) {
            boolean handleError = failoverStrategy.handleError(baseException);
            if (failoverStrategy.isFailoverOnly() && handleError) {
                return;
            }
        }
    }

    public void handleHeader(List<HttpHeader> list) {
        if (list == null) {
            return;
        }
        Iterator<FailoverStrategy> it2 = this.mFailoverStrategyList.iterator();
        while (it2.hasNext()) {
            it2.next().handleHeader(list);
        }
    }
}
