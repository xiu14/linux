package com.ss.android.socialbase.downloader.cleaner;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadDirUtils;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CleanerConfig {
    private static final String KEY_CLEAN_FINISH = "key_clean_finish";
    private static final String KEY_DOWNLOAD_CACHE_CLEAN_STRATEGY = "key_download_cache_clean_strategy";
    private static final String TAG = "CleanerConfig";
    private String mPackageName;
    private int packageNameLength;
    private volatile Map<Integer, CleanItem> mCleanItemMaps = new HashMap();
    private volatile Map<Integer, CleanItem> mNeedCleanItemMaps = new HashMap();
    private volatile Map<Integer, List<Integer>> mCleanCacheKeyMaps = new HashMap();
    private volatile Set<Integer> mCleanDownloadIdSet = new HashSet();
    private volatile Map<Integer, String> mFileDirPathMap = new HashMap();
    private volatile Map<Integer, String> mFileNameMap = new HashMap();
    private volatile Map<Integer, String> mTempSavePath = new HashMap();
    private volatile boolean mFinish = false;

    private class CleanItem {
        boolean finish;
        List<String> prefixUrls;
        Set<String> savePaths;
        Set<String> scenes;

        private CleanItem() {
            this.scenes = new HashSet();
            this.prefixUrls = new ArrayList();
            this.savePaths = new HashSet();
        }

        public String toString() {
            StringBuilder M = a.M("CleanItem{finish=");
            M.append(this.finish);
            M.append(", scenes=");
            M.append(this.scenes);
            M.append(", prefixUrls=");
            M.append(this.prefixUrls);
            M.append(", savePaths=");
            M.append(this.savePaths);
            M.append('}');
            return M.toString();
        }
    }

    private void addToCleanDownloadIdSet(int i) {
        if (this.mFinish || i == 0) {
            return;
        }
        synchronized (this.mCleanDownloadIdSet) {
            this.mCleanDownloadIdSet.add(Integer.valueOf(i));
        }
    }

    private SharedPreferences getDownloadCacheSp() {
        return DownloadComponentManager.getAppContext().getSharedPreferences(DownloadConstants.SP_DOWNLOAD_CACHE, 0);
    }

    private String getString(String str) {
        return getDownloadCacheSp().getString(str, "");
    }

    private boolean matchCleanItem(CleanItem cleanItem, DownloadInfo downloadInfo) {
        if (cleanItem == null || downloadInfo == null || !(TextUtils.isEmpty(downloadInfo.getSavePath()) || DownloadDirUtils.isSavePathSecurity(downloadInfo.getSavePath()))) {
            return false;
        }
        if (!cleanItem.scenes.isEmpty() && !TextUtils.isEmpty(downloadInfo.getMonitorScene()) && cleanItem.scenes.contains(downloadInfo.getMonitorScene())) {
            return true;
        }
        if (!cleanItem.prefixUrls.isEmpty()) {
            String url = downloadInfo.getUrl();
            if (TextUtils.isEmpty(url)) {
                return false;
            }
            Iterator<String> it2 = cleanItem.prefixUrls.iterator();
            while (it2.hasNext()) {
                if (url.startsWith(it2.next())) {
                    return true;
                }
            }
        }
        if (!cleanItem.savePaths.isEmpty() && !TextUtils.isEmpty(this.mPackageName)) {
            String savePath = downloadInfo.getSavePath();
            if (TextUtils.isEmpty(savePath) || savePath.indexOf(this.mPackageName) <= 0) {
                return false;
            }
            if (savePath.endsWith("/")) {
                savePath = savePath.substring(0, savePath.length() - 1);
            }
            if (cleanItem.savePaths.contains(savePath)) {
                return true;
            }
        }
        return false;
    }

    private void parseCleanSetting(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        parseCleanSetting(new JSONObject(str));
    }

    private void putString(String str, String str2) {
        getDownloadCacheSp().edit().putString(str, str2).apply();
    }

    private void saveFilePath(DownloadInfo downloadInfo) {
        if (TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return;
        }
        this.mFileDirPathMap.put(Integer.valueOf(downloadInfo.getId()), downloadInfo.getSavePath());
        this.mFileNameMap.put(Integer.valueOf(downloadInfo.getId()), downloadInfo.getName());
        if (TextUtils.isEmpty(downloadInfo.getTempPath())) {
            return;
        }
        this.mTempSavePath.put(Integer.valueOf(downloadInfo.getId()), downloadInfo.getTempPath());
    }

    public void finish() {
        this.mFinish = true;
        this.mCleanItemMaps.clear();
        this.mNeedCleanItemMaps.clear();
        this.mCleanCacheKeyMaps.clear();
        this.mFileDirPathMap.clear();
        this.mFileNameMap.clear();
        this.mTempSavePath.clear();
        synchronized (this.mCleanDownloadIdSet) {
            this.mCleanDownloadIdSet.clear();
        }
    }

    public Map<Integer, List<Integer>> getCleanCacheKeyMaps() {
        return this.mCleanCacheKeyMaps;
    }

    public String getName(int i) {
        return this.mFileNameMap.get(Integer.valueOf(i));
    }

    public String getSavePath(int i) {
        return this.mFileDirPathMap.get(Integer.valueOf(i));
    }

    public String getTempSavePath(int i) {
        return this.mTempSavePath.get(Integer.valueOf(i));
    }

    public void init() {
        try {
            parseCleanSetting(getString(KEY_DOWNLOAD_CACHE_CLEAN_STRATEGY));
            parseCleanSetting(DownloadSetting.getGlobalSettings());
            if (this.mCleanItemMaps.isEmpty()) {
                return;
            }
            for (Map.Entry<Integer, CleanItem> entry : this.mCleanItemMaps.entrySet()) {
                CleanItem value = entry.getValue();
                if (!value.finish) {
                    this.mNeedCleanItemMaps.put(entry.getKey(), value);
                }
            }
            String packageName = DownloadComponentManager.getAppContext().getPackageName();
            this.mPackageName = packageName;
            this.packageNameLength = packageName.length();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean isExistInCleanSet(int i) {
        boolean contains;
        if (this.mFinish) {
            return false;
        }
        synchronized (this.mCleanDownloadIdSet) {
            contains = this.mCleanDownloadIdSet.contains(Integer.valueOf(i));
        }
        return contains;
    }

    public boolean isNoCacheNeedClean() {
        boolean isEmpty;
        synchronized (this.mCleanDownloadIdSet) {
            isEmpty = this.mCleanDownloadIdSet.isEmpty();
        }
        return isEmpty;
    }

    public void removeFromCleanDownloadIdSet(int i) {
        synchronized (this.mCleanDownloadIdSet) {
            if (this.mCleanDownloadIdSet.isEmpty()) {
                return;
            }
            this.mCleanDownloadIdSet.remove(Integer.valueOf(i));
        }
    }

    public boolean updateCleanDownloadId(DownloadInfo downloadInfo) {
        if (this.mNeedCleanItemMaps.isEmpty()) {
            return false;
        }
        for (Map.Entry<Integer, CleanItem> entry : this.mNeedCleanItemMaps.entrySet()) {
            if (matchCleanItem(entry.getValue(), downloadInfo)) {
                int intValue = entry.getKey().intValue();
                List<Integer> list = this.mCleanCacheKeyMaps.get(Integer.valueOf(intValue));
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(Integer.valueOf(downloadInfo.getId()));
                addToCleanDownloadIdSet(downloadInfo.getId());
                this.mCleanCacheKeyMaps.put(Integer.valueOf(intValue), list);
                saveFilePath(downloadInfo);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateCleanSetting(int r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.cleaner.CleanerConfig.updateCleanSetting(int):void");
    }

    private void parseCleanSetting(JSONObject jSONObject) throws Throwable {
        JSONArray optJSONArray;
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "parseCleanSetting", "Run");
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(DownloadSettingKeys.CacheCleaner.CLEAN_GROUP)) == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            int optInt = jSONObject2.optInt(DownloadSettingKeys.CacheCleaner.CLEAN_ID);
            if (!this.mCleanItemMaps.containsKey(Integer.valueOf(optInt))) {
                CleanItem cleanItem = new CleanItem();
                boolean optBoolean = jSONObject2.optBoolean(KEY_CLEAN_FINISH);
                cleanItem.finish = optBoolean;
                if (optBoolean) {
                    this.mCleanItemMaps.put(Integer.valueOf(optInt), cleanItem);
                    this.mCleanCacheKeyMaps.put(Integer.valueOf(optInt), new ArrayList());
                } else {
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray(DownloadSettingKeys.CacheCleaner.MONITOR_SCENE_LIST);
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            String optString = optJSONArray2.optString(i2);
                            if (!TextUtils.isEmpty(optString)) {
                                cleanItem.scenes.add(optString);
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject2.optJSONArray(DownloadSettingKeys.CacheCleaner.URL_PREFIX_LIST);
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                            String optString2 = optJSONArray3.optString(i3);
                            if (!TextUtils.isEmpty(optString2)) {
                                cleanItem.prefixUrls.add(optString2);
                            }
                        }
                    }
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray(DownloadSettingKeys.CacheCleaner.SAVE_PATH_LIST);
                    if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                        for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                            String optString3 = optJSONArray4.optString(i4);
                            if (!TextUtils.isEmpty(optString3)) {
                                cleanItem.savePaths.add(optString3);
                            }
                        }
                    }
                    if (!cleanItem.scenes.isEmpty() || !cleanItem.prefixUrls.isEmpty() || !cleanItem.savePaths.isEmpty()) {
                        this.mCleanItemMaps.put(Integer.valueOf(optInt), cleanItem);
                        this.mCleanCacheKeyMaps.put(Integer.valueOf(optInt), new ArrayList());
                    }
                }
            }
        }
        if (Logger.debug()) {
            StringBuilder M = a.M("Result: ");
            M.append(this.mCleanItemMaps);
            Logger.globalDebug(TAG, "parseCleanSetting", M.toString());
        }
    }
}
