package com.bytedance.ttnet.diagnosis;

import com.bytedance.common.utility.Logger;

/* loaded from: classes2.dex */
public class TTGameDiagnosisService {
    private static final String TAG = "TTGameDiagnosisService";
    private static volatile TTGameDiagnosisService sInstance;
    private IDiagnosisRequest mRequest = null;
    private volatile boolean mIsMonitoring = false;
    private IDiagnosisCallback mDiagnosisCallback = new IDiagnosisCallback() { // from class: com.bytedance.ttnet.diagnosis.a
        @Override // com.bytedance.ttnet.diagnosis.IDiagnosisCallback
        public final void onDiagnosisComplete(String str) {
            TTGameDiagnosisService.a(str);
        }
    };

    private TTGameDiagnosisService() {
    }

    static /* synthetic */ void a(String str) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("onDiagnosisComplete: ", str, TAG);
        }
    }

    public static TTGameDiagnosisService inst() {
        if (sInstance == null) {
            synchronized (TTGameDiagnosisService.class) {
                if (sInstance == null) {
                    sInstance = new TTGameDiagnosisService();
                }
            }
        }
        return sInstance;
    }

    public void doDiagnosisDuringGaming(String str) {
        synchronized (this) {
            if (this.mIsMonitoring) {
                this.mRequest.doExtraCommand("diagnosis", str);
            }
        }
    }

    public boolean isMonitoring() {
        return this.mIsMonitoring;
    }

    public void monitorBegin(String str, String str2) throws Exception {
        synchronized (this) {
            if (this.mIsMonitoring) {
                return;
            }
            IDiagnosisRequest createRequest = TTNetDiagnosisService.createRequest(4, str, 0, Integer.MAX_VALUE);
            this.mRequest = createRequest;
            createRequest.start(this.mDiagnosisCallback);
            this.mRequest.doExtraCommand("extra_info", str2);
            this.mIsMonitoring = true;
        }
    }

    public void monitorEnd() {
        monitorEnd(null);
    }

    public void monitorEnd(String str) {
        synchronized (this) {
            if (this.mIsMonitoring) {
                if (str != null) {
                    this.mRequest.doExtraCommand("extra_info", str);
                }
                this.mRequest.doExtraCommand("finish", "");
                this.mIsMonitoring = false;
            }
        }
    }
}
