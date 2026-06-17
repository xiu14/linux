package com.ss.android.socialbase.downloader.setting;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.LruCache;
import e.a.a.a.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadSetting {
    private static final int POOL_SIZE = 16;
    private static final String TAG = "DownloadSetting";
    private static JSONObject sDisabledTaskKeys;
    private static Boolean sGlobalBugFixDefault;
    private static JSONObject sGlobalBugFixSetting;

    @Deprecated
    private static JSONObject sGlobalSetting;
    private static DownloadSetting sLastSetting;
    private static boolean sTaskSettingDisabled;
    private final Boolean mBugFixDefault;
    private final JSONObject mBugFixSetting;
    private int mDownloadId;
    private final JSONObject mTaskSetting;
    private static final LruCache<Integer, DownloadSetting> sCache = new LruCache<>(16, 16);
    private static final DownloadSetting sGlobal = new DownloadSetting(null);

    static {
        init();
    }

    private DownloadSetting(JSONObject jSONObject) {
        Boolean bool;
        this.mTaskSetting = jSONObject;
        JSONObject jSONObject2 = null;
        r0 = null;
        r0 = null;
        Boolean bool2 = null;
        if (jSONObject == null || isTaskKeyDisabled(DownloadSettingKeys.BUG_FIX)) {
            bool = null;
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject(DownloadSettingKeys.BUG_FIX);
            if (optJSONObject != null && optJSONObject.has(DownloadSettingKeys.BugFix.DEFAULT) && !isTaskKeyDisabled(DownloadSettingKeys.BugFix.DEFAULT)) {
                bool2 = Boolean.valueOf(optJSONObject.optInt(DownloadSettingKeys.BugFix.DEFAULT, 0) == 1);
            }
            Boolean bool3 = bool2;
            jSONObject2 = optJSONObject;
            bool = bool3;
        }
        this.mBugFixSetting = jSONObject2;
        this.mBugFixDefault = bool;
    }

    public static void addTaskDownloadSetting(int i, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == getGlobalSettings() || sTaskSettingDisabled) {
            return;
        }
        LruCache<Integer, DownloadSetting> lruCache = sCache;
        synchronized (lruCache) {
            DownloadSetting downloadSetting = sLastSetting;
            if (downloadSetting == null || downloadSetting.mTaskSetting != jSONObject) {
                downloadSetting = null;
                Iterator<DownloadSetting> it2 = lruCache.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DownloadSetting next = it2.next();
                    if (next.mTaskSetting == jSONObject) {
                        next.mDownloadId = i;
                        downloadSetting = next;
                        break;
                    }
                }
                if (downloadSetting == null) {
                    downloadSetting = new DownloadSetting(jSONObject);
                    downloadSetting.mDownloadId = i;
                }
                sLastSetting = downloadSetting;
            } else {
                downloadSetting.mDownloadId = i;
            }
            sCache.put(Integer.valueOf(i), downloadSetting);
        }
    }

    private static DownloadSetting create(int i) {
        DownloadInfo downloadInfo;
        return sTaskSettingDisabled ? sGlobal : (((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext() == null || (downloadInfo = ((IDownloadProcessDispatcherService) DownloadServiceManager.getService(IDownloadProcessDispatcherService.class)).getDownloadInfo(i)) == null) ? sGlobal : create(downloadInfo);
    }

    @NonNull
    public static JSONObject getGlobalSettings() {
        return ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getDownloadSetting();
    }

    public static void init() {
        JSONObject downloadSetting = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getDownloadSetting();
        sTaskSettingDisabled = downloadSetting.optInt(DownloadSettingKeys.DISABLE_TASK_SETTING, 0) == 1;
        sDisabledTaskKeys = downloadSetting.optJSONObject(DownloadSettingKeys.DISABLED_TASK_KEYS);
        JSONObject optJSONObject = downloadSetting.optJSONObject(DownloadSettingKeys.BUG_FIX);
        Boolean bool = null;
        if (optJSONObject != null && optJSONObject.has(DownloadSettingKeys.BugFix.DEFAULT)) {
            bool = Boolean.valueOf(optJSONObject.optInt(DownloadSettingKeys.BugFix.DEFAULT, 0) == 1);
        }
        sGlobalBugFixSetting = optJSONObject;
        sGlobalBugFixDefault = bool;
        if (Logger.debug()) {
            StringBuilder M = a.M("SettingUpdate:");
            M.append(downloadSetting.toString());
            Logger.globalDebug(TAG, "init", M.toString());
        }
    }

    public static boolean isTaskKeyDisabled(String str) {
        JSONObject jSONObject = sDisabledTaskKeys;
        return jSONObject != null && jSONObject.optInt(str, 0) == 1;
    }

    @NonNull
    public static DownloadSetting obtain(int i) {
        return obtain(i, null);
    }

    @NonNull
    public static DownloadSetting obtainGlobal() {
        return sGlobal;
    }

    public static void removeTaskDownloadSetting(int i) {
        DownloadSetting downloadSetting = sLastSetting;
        if (downloadSetting != null && downloadSetting.mDownloadId == i) {
            sLastSetting = null;
        }
        LruCache<Integer, DownloadSetting> lruCache = sCache;
        synchronized (lruCache) {
            lruCache.remove(Integer.valueOf(i));
        }
    }

    public static void setGlobalBugFix(String str, boolean z) {
        try {
            if (sGlobalBugFixSetting == null) {
                sGlobalBugFixSetting = new JSONObject();
            }
            sGlobalBugFixSetting.put(str, z ? 1 : 0);
        } catch (JSONException unused) {
        }
    }

    public boolean has(String str) {
        return (this.mTaskSetting == null || isTaskKeyDisabled(str)) ? getGlobalSettings().has(str) : this.mTaskSetting.has(str);
    }

    public Object opt(String str) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().opt(str) : this.mTaskSetting.opt(str);
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public boolean optBugFix(String str) {
        return optBugFix(str, false);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public JSONArray optJSONArray(String str) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().optJSONArray(str) : this.mTaskSetting.optJSONArray(str);
    }

    public JSONObject optJSONObject(String str) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().optJSONObject(str) : this.mTaskSetting.optJSONObject(str);
    }

    public long optLong(String str) {
        return optLong(str, 0L);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    @NonNull
    public static DownloadSetting obtain(DownloadInfo downloadInfo) {
        return downloadInfo == null ? sGlobal : obtain(downloadInfo.getId(), downloadInfo);
    }

    public boolean optBoolean(String str, boolean z) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().optBoolean(str, z) : this.mTaskSetting.optBoolean(str, z);
    }

    public boolean optBugFix(String str, boolean z) {
        if (this.mBugFixSetting != null && !isTaskKeyDisabled(str)) {
            if (this.mBugFixSetting.has(str)) {
                return this.mBugFixSetting.optInt(str, z ? 1 : 0) == 1;
            }
            Boolean bool = this.mBugFixDefault;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        JSONObject jSONObject = sGlobalBugFixSetting;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                return sGlobalBugFixSetting.optInt(str, z ? 1 : 0) == 1;
            }
            Boolean bool2 = sGlobalBugFixDefault;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return z;
    }

    public double optDouble(String str, double d2) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().optDouble(str, d2) : this.mTaskSetting.optDouble(str, d2);
    }

    public int optInt(String str, int i) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().optInt(str, i) : this.mTaskSetting.optInt(str, i);
    }

    public long optLong(String str, long j) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().optLong(str, j) : this.mTaskSetting.optLong(str, j);
    }

    public String optString(String str, String str2) {
        JSONObject jSONObject = this.mTaskSetting;
        return (jSONObject == null || !jSONObject.has(str) || isTaskKeyDisabled(str)) ? getGlobalSettings().optString(str, str2) : this.mTaskSetting.optString(str, str2);
    }

    private static DownloadSetting obtain(int i, DownloadInfo downloadInfo) {
        DownloadSetting downloadSetting;
        DownloadSetting downloadSetting2 = sLastSetting;
        if (downloadSetting2 != null && downloadSetting2.mDownloadId == i) {
            return downloadSetting2;
        }
        LruCache<Integer, DownloadSetting> lruCache = sCache;
        synchronized (lruCache) {
            downloadSetting = lruCache.get(Integer.valueOf(i));
        }
        if (downloadSetting == null) {
            downloadSetting = downloadInfo == null ? create(i) : create(downloadInfo);
            synchronized (lruCache) {
                lruCache.put(Integer.valueOf(i), downloadSetting);
            }
        }
        downloadSetting.mDownloadId = i;
        sLastSetting = downloadSetting;
        return downloadSetting;
    }

    private static DownloadSetting create(DownloadInfo downloadInfo) {
        if (sTaskSettingDisabled) {
            return sGlobal;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new DownloadSetting(new JSONObject(downloadSettingString));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sGlobal;
    }

    @NonNull
    public static DownloadSetting obtain(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject != getGlobalSettings() && !sTaskSettingDisabled) {
            DownloadSetting downloadSetting = sLastSetting;
            if (downloadSetting != null && downloadSetting.mTaskSetting == jSONObject) {
                return downloadSetting;
            }
            LruCache<Integer, DownloadSetting> lruCache = sCache;
            synchronized (lruCache) {
                for (DownloadSetting downloadSetting2 : lruCache.values()) {
                    if (downloadSetting2.mTaskSetting == jSONObject) {
                        sLastSetting = downloadSetting2;
                        return downloadSetting2;
                    }
                }
                DownloadSetting downloadSetting3 = new DownloadSetting(jSONObject);
                sLastSetting = downloadSetting3;
                return downloadSetting3;
            }
        }
        return sGlobal;
    }
}
