package com.ss.android.socialbase.downloader.downloader;

import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface ITTNetHandler {

    public static class DefaultTTNetHandler implements ITTNetHandler {
        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public void enableTTNetLogger() {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public JSONArray getABTestInfo() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public int getResponseCode(Throwable th) {
            return -1;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public IDownloadHttpService getTTNetDownloadHttpService() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public boolean isTTNetEnable() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public JSONObject mergeTNCConfig(JSONObject jSONObject) {
            return jSONObject;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public void saveABTestInfo() {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public void saveTNCConfig(String str) {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.ITTNetHandler
        public DownloadTTNetException translateTTNetException(Throwable th, String str) {
            return null;
        }
    }

    void enableTTNetLogger();

    JSONArray getABTestInfo();

    int getResponseCode(Throwable th);

    IDownloadHttpService getTTNetDownloadHttpService();

    boolean isTTNetEnable();

    JSONObject mergeTNCConfig(JSONObject jSONObject);

    void saveABTestInfo();

    void saveTNCConfig(String str);

    DownloadTTNetException translateTTNetException(Throwable th, String str);
}
