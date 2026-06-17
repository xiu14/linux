package com.mammon.audiosdk;

import android.util.Log;
import com.bytedance.speech.speechaudio.SpeechAudioLoader;
import com.mammon.audiosdk.bridge.SAMICoreBridge;
import com.mammon.audiosdk.enums.SAMICoreContextType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreConnectPoolContextParameter;
import com.mammon.audiosdk.structures.SAMICoreConnectPoolSetting;
import com.mammon.audiosdk.structures.SAMICoreFrontierClientContextParameter;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.mammon.audiosdk.structures.SAMICoreWSConnectPoolParameter;
import e.a.a.a.a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class SAMICore {
    private static SAMICoreBridge globalBridge;
    private static boolean isInitContext;
    private static SAMICoreNativeLogCallback nativeLogCallBack;
    private static SAMICoreNativeTraceSpanCallback nativeTraceSpanCallback;
    private SAMICoreIdentify identify;
    private SAMICoreBridge bridge = SpeechAudioLoader.getInstance().createSAMICoreBridge();
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private boolean enableSyncInterface = false;
    private long resourceHandle = 0;
    private int[] retAarry = {SAMICoreCode.SAMI_BASE};

    static {
        SpeechAudioLoader.getInstance().load();
        globalBridge = SpeechAudioLoader.getInstance().createSAMICoreBridge();
        isInitContext = false;
    }

    public static int AddConnectPoolClient(SAMICoreConnectPoolContextParameter sAMICoreConnectPoolContextParameter) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.ConnectPoolAddConnectClient.getValue(), sAMICoreConnectPoolContextParameter);
    }

    public static int CloseCellClient() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.FrontierClientCloseCell.getValue(), null);
    }

    public static int CloseFrontierClient() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.FrontierClientClose.getValue(), null);
    }

    public static int InitABContext() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.SAMICoreContextType_AbConfig.getValue(), null);
    }

    public static int InitCellClient(SAMICoreFrontierClientContextParameter sAMICoreFrontierClientContextParameter) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.FrontierClientInitCell.getValue(), sAMICoreFrontierClientContextParameter);
    }

    public static int InitConnectPool(SAMICoreConnectPoolSetting sAMICoreConnectPoolSetting) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.ConnectPoolInit.getValue(), sAMICoreConnectPoolSetting);
    }

    public static int InitFrontierClient(SAMICoreFrontierClientContextParameter sAMICoreFrontierClientContextParameter) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.FrontierClientInit.getValue(), sAMICoreFrontierClientContextParameter);
    }

    public static int InitTTNetDynamicContext() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.TTNETDynamicInit.getValue(), null);
    }

    public static int InitWSConnectPool(SAMICoreWSConnectPoolParameter sAMICoreWSConnectPoolParameter) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.WebSocketConnectPoolContext.getValue(), sAMICoreWSConnectPoolParameter);
    }

    public static int LoadOfflineAsrModel(String str) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.LoadOfflineAsrModel.getValue(), str);
    }

    public static long RegisterLog(SAMICoreLogCallback sAMICoreLogCallback) {
        if (nativeLogCallBack == null) {
            nativeLogCallBack = new SAMICoreNativeLogCallback();
        }
        SAMICoreNativeLogCallback.setLogCallback(sAMICoreLogCallback);
        long Native_SAMICoreRegisterLogger = globalBridge.Native_SAMICoreRegisterLogger(nativeLogCallBack);
        if (Native_SAMICoreRegisterLogger != 0) {
            Log.e("mammon", "register log failed " + Native_SAMICoreRegisterLogger);
        }
        return Native_SAMICoreRegisterLogger;
    }

    public static long RegisterTraceSpanCallback(SAMICoreTraceSpanCallback sAMICoreTraceSpanCallback) {
        if (nativeTraceSpanCallback == null) {
            nativeTraceSpanCallback = new SAMICoreNativeTraceSpanCallback();
        }
        SAMICoreNativeTraceSpanCallback.setTraceSpanCallback(sAMICoreTraceSpanCallback);
        long Native_SAMICoreRegisterTraceSpanCallback = globalBridge.Native_SAMICoreRegisterTraceSpanCallback(nativeTraceSpanCallback);
        if (Native_SAMICoreRegisterTraceSpanCallback != 0) {
            Log.e("mammon", "register log failed " + Native_SAMICoreRegisterTraceSpanCallback);
        }
        return Native_SAMICoreRegisterTraceSpanCallback;
    }

    public static int RemoveConnectPoolClient(SAMICoreConnectPoolContextParameter sAMICoreConnectPoolContextParameter) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.ConnectPoolRemoveConnectClient.getValue(), sAMICoreConnectPoolContextParameter);
    }

    public static int ResetAsrGlobalMetrics() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.ResetAsrGlobalMetrics.getValue(), null);
    }

    public static int SendAsrGlobalMetrics(String str) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.SendAsrGlobalMetrics.getValue(), str);
    }

    public static int ShutDownConnectPool() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.ConnectPoolShutDown.getValue(), null);
    }

    public static int ShutDownWSConnectPool() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.WebSocketConnectPoolContextShutDown.getValue(), null);
    }

    public static int StartAsrGlobalMetrics() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.StartAsrGlobalMetrics.getValue(), null);
    }

    public static int UnloadOfflineAsrModel() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.UnloadOfflineAsrModel.getValue(), null);
    }

    public static int UpdateCellClientPingInterval(Integer num) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.FrontierClientUpdatePingIntervalCell.getValue(), num);
    }

    public static int UpdateFrontierClientPingInterval(Integer num) {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.FrontierClientUpdatePingInterval.getValue(), num);
    }

    public int SAMICoreCreateHandleByIdentify(SAMICoreIdentify sAMICoreIdentify, Object obj) {
        if (this.enableSyncInterface) {
            if (nativeLogCallBack != null) {
                StringBuilder M = a.M("[mammon] create handle with sync interface lock ");
                M.append(this.resourceHandle);
                SAMICoreNativeLogCallback.onLogReceived(4, M.toString());
            }
            this.readWriteLock.readLock().lock();
        }
        try {
            this.identify = sAMICoreIdentify;
            this.retAarry[0] = 100000;
            this.resourceHandle = this.bridge.Native_SAMICoreCreateHandleByIdentify(sAMICoreIdentify.getValue(), obj, this.retAarry);
            return this.retAarry[0];
        } finally {
            if (this.enableSyncInterface) {
                this.readWriteLock.readLock().unlock();
                if (nativeLogCallBack != null) {
                    StringBuilder M2 = a.M("[mammon] create handle with sync interface unlock ");
                    M2.append(this.resourceHandle);
                    SAMICoreNativeLogCallback.onLogReceived(4, M2.toString());
                }
            }
        }
    }

    public int SAMICoreDestroyHandle() {
        if (this.enableSyncInterface) {
            if (nativeLogCallBack != null) {
                StringBuilder M = a.M("[mammon] destroy handle with sync interface lock ");
                M.append(this.resourceHandle);
                SAMICoreNativeLogCallback.onLogReceived(4, M.toString());
            }
            this.readWriteLock.writeLock().lock();
        }
        int i = 0;
        try {
            long j = this.resourceHandle;
            if (j != 0) {
                i = this.bridge.Native_SAMICoreDestroyHandle(j);
                this.resourceHandle = 0L;
            }
            return i;
        } finally {
            if (this.enableSyncInterface) {
                this.readWriteLock.writeLock().unlock();
                if (nativeLogCallBack != null) {
                    StringBuilder M2 = a.M("[mammon] destroy handle with sync interface unlock ");
                    M2.append(this.resourceHandle);
                    SAMICoreNativeLogCallback.onLogReceived(4, M2.toString());
                }
            }
        }
    }

    public int SAMICoreGetPropertyById(SAMICorePropertyId sAMICorePropertyId, SAMICoreProperty sAMICoreProperty) {
        return this.bridge.Native_SAMICoreGetPropertyById(this.resourceHandle, sAMICorePropertyId.getValue(), sAMICoreProperty);
    }

    public int SAMICoreProcess(SAMICoreBlock sAMICoreBlock, SAMICoreBlock sAMICoreBlock2) {
        if (this.enableSyncInterface) {
            this.readWriteLock.readLock().lock();
        }
        try {
            return this.bridge.Native_SAMICoreProcess(this.resourceHandle, this.identify.getValue(), sAMICoreBlock, sAMICoreBlock2);
        } finally {
            if (this.enableSyncInterface) {
                this.readWriteLock.readLock().unlock();
            }
        }
    }

    public int SAMICoreProcessAsync(SAMICoreBlock sAMICoreBlock) {
        return this.bridge.Native_SAMICoreProcessAsync(this.resourceHandle, this.identify.getValue(), sAMICoreBlock);
    }

    public int SAMICoreSetProperty(SAMICorePropertyId sAMICorePropertyId, SAMICoreProperty sAMICoreProperty) {
        if (this.enableSyncInterface) {
            if (nativeLogCallBack != null) {
                StringBuilder M = a.M("[mammon] SetProperty with sync interface lock ");
                M.append(this.resourceHandle);
                M.append(" ");
                M.append(sAMICoreProperty != null ? sAMICoreProperty.id : sAMICorePropertyId);
                SAMICoreNativeLogCallback.onLogReceived(4, M.toString());
            }
            this.readWriteLock.readLock().lock();
        }
        try {
            long j = this.resourceHandle;
            return j != 0 ? this.bridge.Native_SAMICoreSetProperty(j, sAMICorePropertyId.getValue(), sAMICoreProperty) : 0;
        } finally {
            if (this.enableSyncInterface) {
                this.readWriteLock.readLock().unlock();
                if (nativeLogCallBack != null) {
                    StringBuilder M2 = a.M("[mammon] SetProperty with sync interface unlock ");
                    M2.append(this.resourceHandle);
                    M2.append(" ");
                    if (sAMICoreProperty != null) {
                        sAMICorePropertyId = sAMICoreProperty.id;
                    }
                    M2.append(sAMICorePropertyId);
                    SAMICoreNativeLogCallback.onLogReceived(4, M2.toString());
                }
            }
        }
    }

    public long getHandle() {
        return this.resourceHandle;
    }

    public void setEnableSyncInterface(boolean z) {
        this.enableSyncInterface = z;
    }

    public void setListener(SAMICoreCallBackListener sAMICoreCallBackListener) {
        this.bridge.setListener(sAMICoreCallBackListener);
    }

    public static int InitWSConnectPool(String str, boolean z, int i, int i2) {
        SAMICoreWSConnectPoolParameter sAMICoreWSConnectPoolParameter = new SAMICoreWSConnectPoolParameter();
        sAMICoreWSConnectPoolParameter.url = str;
        sAMICoreWSConnectPoolParameter.enable = z;
        sAMICoreWSConnectPoolParameter.poolSize = i;
        sAMICoreWSConnectPoolParameter.retryCount = i2;
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.WebSocketConnectPoolContext.getValue(), sAMICoreWSConnectPoolParameter);
    }

    public static int InitWSConnectPool(String str, String str2, boolean z, int i, int i2) {
        SAMICoreWSConnectPoolParameter sAMICoreWSConnectPoolParameter = new SAMICoreWSConnectPoolParameter();
        sAMICoreWSConnectPoolParameter.business = str;
        sAMICoreWSConnectPoolParameter.url = str2;
        sAMICoreWSConnectPoolParameter.enable = z;
        sAMICoreWSConnectPoolParameter.poolSize = i;
        sAMICoreWSConnectPoolParameter.retryCount = i2;
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.WebSocketConnectPoolContext.getValue(), sAMICoreWSConnectPoolParameter);
    }

    public static int InitWSConnectPool(String str, String str2, boolean z, int i, int i2, String str3) {
        SAMICoreWSConnectPoolParameter sAMICoreWSConnectPoolParameter = new SAMICoreWSConnectPoolParameter();
        sAMICoreWSConnectPoolParameter.business = str;
        sAMICoreWSConnectPoolParameter.url = str2;
        sAMICoreWSConnectPoolParameter.enable = z;
        sAMICoreWSConnectPoolParameter.poolSize = i;
        sAMICoreWSConnectPoolParameter.retryCount = i2;
        sAMICoreWSConnectPoolParameter.header = str3;
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.WebSocketConnectPoolContext.getValue(), sAMICoreWSConnectPoolParameter);
    }
}
