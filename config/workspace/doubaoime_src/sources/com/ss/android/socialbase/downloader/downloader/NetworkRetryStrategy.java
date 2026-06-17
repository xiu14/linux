package com.ss.android.socialbase.downloader.downloader;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkRetryStrategy {
    private static final String TAG = "NetworkRetryStrategy";
    private int mCurrentRetryCount = 0;
    private int mCurrentPeriodRetryCount = 0;
    private long mCurrentRetryTime = 0;
    private int mCurrentRetryResetCount = 0;
    private int mRetryCountLimit = 0;
    private int mPeriodRetryCountLimit = 0;
    private long mRetryPeriodTime = 0;
    private int mRetryResetCountLimit = 0;
    private int mTotalRetryCount = 0;
    private boolean mEnabled = false;
    private List<Long> delayIntervalMs = new ArrayList();
    private int mDownloadId = 0;

    public NetworkRetryStrategy(DownloadInfo downloadInfo) {
        int i;
        StringBuilder sb;
        try {
            initInternal(downloadInfo);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                Logger.taskError(TAG, this.mDownloadId, TAG, "Init Error" + th.toString());
                if (!Logger.debug()) {
                    return;
                }
                i = this.mDownloadId;
                sb = new StringBuilder();
            } catch (Throwable th2) {
                if (Logger.debug()) {
                    int i2 = this.mDownloadId;
                    StringBuilder M = a.M("Init retryCountLimit:");
                    M.append(this.mRetryCountLimit);
                    M.append(" delayIntervalMs:");
                    M.append(this.delayIntervalMs.toString());
                    M.append(" retryPeriodTime:");
                    M.append(this.mRetryPeriodTime);
                    M.append(" periodRetryCountLimit:");
                    M.append(this.mPeriodRetryCountLimit);
                    M.append(" retryResetCountLimit:");
                    a.E0(M, this.mRetryResetCountLimit, TAG, i2, TAG);
                }
                throw th2;
            }
        }
        if (Logger.debug()) {
            i = this.mDownloadId;
            sb = new StringBuilder();
            sb.append("Init retryCountLimit:");
            sb.append(this.mRetryCountLimit);
            sb.append(" delayIntervalMs:");
            sb.append(this.delayIntervalMs.toString());
            sb.append(" retryPeriodTime:");
            sb.append(this.mRetryPeriodTime);
            sb.append(" periodRetryCountLimit:");
            sb.append(this.mPeriodRetryCountLimit);
            sb.append(" retryResetCountLimit:");
            a.E0(sb, this.mRetryResetCountLimit, TAG, i, TAG);
        }
    }

    private void delay() {
        long longValue;
        if (this.delayIntervalMs.isEmpty()) {
            return;
        }
        try {
            if (this.mCurrentRetryCount >= this.delayIntervalMs.size()) {
                longValue = this.delayIntervalMs.get(r2.size() - 1).longValue();
            } else {
                longValue = this.delayIntervalMs.get(this.mCurrentRetryCount).longValue();
            }
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.mDownloadId, "delay", "Sleep:" + longValue);
            }
            Thread.sleep(longValue);
        } catch (Throwable th) {
            int i = this.mDownloadId;
            StringBuilder M = a.M("Error:");
            M.append(th.toString());
            Logger.taskError(TAG, i, "delay", M.toString());
            th.printStackTrace();
        }
    }

    private void initInternal(DownloadInfo downloadInfo) throws Throwable {
        JSONObject optJSONObject;
        if (downloadInfo != null) {
            int id = downloadInfo.getId();
            this.mDownloadId = id;
            optJSONObject = DownloadSetting.obtain(id).optJSONObject(DownloadSettingKeys.RETRY_STRATEGY);
        } else {
            optJSONObject = DownloadSetting.obtainGlobal().optJSONObject(DownloadSettingKeys.RETRY_STRATEGY);
        }
        if (optJSONObject == null) {
            return;
        }
        int optInt = optJSONObject.optInt("retry_count");
        if (optInt > 0) {
            this.mRetryCountLimit = optInt;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray(DownloadSettingKeys.RetryStrategy.KEY_DELAY_INTERVAL_MS);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                long optLong = optJSONArray.optLong(i);
                if (optLong > 0) {
                    this.delayIntervalMs.add(Long.valueOf(optLong));
                }
            }
        }
        long optLong2 = optJSONObject.optLong(DownloadSettingKeys.RetryStrategy.KEY_RETRY_PERIOD_MS);
        if (optLong2 > 0) {
            this.mRetryPeriodTime = optLong2;
        }
        int optInt2 = optJSONObject.optInt(DownloadSettingKeys.RetryStrategy.KEY_RETRY_COUNT_LIMIT_PERIOD);
        if (optInt2 > 0) {
            this.mPeriodRetryCountLimit = optInt2;
        }
        int optInt3 = optJSONObject.optInt(DownloadSettingKeys.RetryStrategy.KEY_RETRY_RESET_COUNT_LIMIT);
        if (optInt3 > 0) {
            this.mRetryResetCountLimit = optInt3;
        }
        if (this.mRetryCountLimit <= 0 || this.mRetryResetCountLimit <= 0) {
            return;
        }
        this.mEnabled = true;
    }

    private boolean resetLimit() {
        int i = this.mRetryResetCountLimit;
        if (i <= 0 || this.mCurrentRetryResetCount < i) {
            return false;
        }
        if (!Logger.debug()) {
            return true;
        }
        int i2 = this.mDownloadId;
        StringBuilder M = a.M("CurrentRetryResetCount:");
        M.append(this.mCurrentRetryResetCount);
        M.append(" retryResetCountLimit:");
        a.E0(M, this.mRetryResetCountLimit, TAG, i2, "resetLimit");
        return true;
    }

    private boolean retryLimit() {
        if (this.mRetryPeriodTime > 0 && this.mPeriodRetryCountLimit > 0) {
            if (this.mCurrentRetryTime == 0) {
                this.mCurrentRetryTime = System.currentTimeMillis();
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mCurrentRetryTime < this.mRetryPeriodTime) {
                if (this.mCurrentPeriodRetryCount <= this.mPeriodRetryCountLimit) {
                    return false;
                }
                if (!Logger.debug()) {
                    return true;
                }
                int i = this.mDownloadId;
                StringBuilder M = a.M("CurrentPeriodRetryCount:");
                M.append(this.mCurrentPeriodRetryCount);
                M.append(" periodRetryCountLimit:");
                M.append(this.mPeriodRetryCountLimit);
                M.append(" currentRetryPeriodTime:");
                M.append(currentTimeMillis - this.mCurrentRetryTime);
                M.append(" retryPeriodTime:");
                M.append(this.mRetryPeriodTime);
                Logger.taskDebug(TAG, i, "retryLimit", M.toString());
                return true;
            }
            this.mCurrentRetryTime = System.currentTimeMillis();
            this.mCurrentPeriodRetryCount = 0;
        }
        return false;
    }

    public boolean canRetry(BaseException baseException) {
        if (baseException == null || !this.mEnabled) {
            if (Logger.debug()) {
                int i = this.mDownloadId;
                StringBuilder M = a.M("Enabled: ");
                M.append(this.mEnabled);
                Logger.taskDebug(TAG, i, "canRetry", M.toString());
            }
            return false;
        }
        if (Logger.debug()) {
            int i2 = this.mDownloadId;
            StringBuilder M2 = a.M("CurrentRetryCount:");
            M2.append(this.mCurrentRetryCount);
            M2.append(" retryCountLimit:");
            M2.append(this.mRetryCountLimit);
            M2.append(" error:");
            M2.append(baseException.getErrorCode());
            Logger.taskDebug(TAG, i2, "canRetry", M2.toString());
        }
        if (!retryLimit()) {
            return this.mCurrentRetryCount < this.mRetryCountLimit && DownloadUtils.isNetworkError(baseException);
        }
        this.mEnabled = false;
        return false;
    }

    public void doRetry() {
        if (this.mEnabled) {
            delay();
            this.mCurrentRetryCount++;
            this.mCurrentPeriodRetryCount++;
            this.mTotalRetryCount++;
            if (Logger.debug()) {
                int i = this.mDownloadId;
                StringBuilder M = a.M("CurrentRetryCount:");
                M.append(this.mCurrentRetryCount);
                M.append(" currentPeriodRetryCount:");
                M.append(this.mCurrentPeriodRetryCount);
                M.append(" totalRetryCount:");
                a.E0(M, this.mTotalRetryCount, TAG, i, "doRetry");
            }
        }
    }

    public int getTotalRetryCount() {
        return this.mTotalRetryCount;
    }

    public void reset() {
        if (resetLimit()) {
            this.mEnabled = false;
            return;
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadId, "reset", "Reset currentRetryResetCount");
        }
        this.mCurrentRetryResetCount++;
        this.mCurrentRetryCount = 0;
    }
}
