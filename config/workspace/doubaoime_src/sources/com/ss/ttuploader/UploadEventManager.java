package com.ss.ttuploader;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public enum UploadEventManager {
    instance;

    private static final String TAG = "UploadEventManager";
    public static final String mImageLogType = "image_upload";
    public static final String mLogType = "video_upload";
    private JSONArray mVideoJsonArray = new JSONArray();
    private JSONArray mImageJsonArray = new JSONArray();

    UploadEventManager() {
    }

    protected void addEvent(JSONObject jSONObject) {
        synchronized (UploadEventManager.class) {
            this.mVideoJsonArray.put(jSONObject);
        }
    }

    protected void addImageEvent(JSONObject jSONObject) {
        synchronized (UploadEventManager.class) {
            this.mImageJsonArray.put(jSONObject);
        }
    }

    public JSONArray popAllEvents() {
        JSONArray jSONArray = this.mVideoJsonArray;
        synchronized (UploadEventManager.class) {
            this.mVideoJsonArray = new JSONArray();
        }
        return jSONArray;
    }

    public JSONArray popAllImageEvents() {
        JSONArray jSONArray = this.mImageJsonArray;
        synchronized (UploadEventManager.class) {
            this.mImageJsonArray = new JSONArray();
        }
        return jSONArray;
    }
}
