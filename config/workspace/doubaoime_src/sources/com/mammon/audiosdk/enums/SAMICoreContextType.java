package com.mammon.audiosdk.enums;

import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreContextType {
    SAMICoreContextType_Lic_Auth(0),
    TokenVerifyOnlineContext(1),
    TokenVerifyOfflineContext(2),
    TokenVerifyMixedContext(3),
    SAMICoreContextType_AbConfig(4),
    WebSocketConnectPoolContext(5),
    WebSocketConnectPoolContextShutDown(6),
    ConnectPoolInit(7),
    ConnectPoolAddConnectClient(8),
    ConnectPoolRemoveConnectClient(9),
    ConnectPoolShutDown(10),
    TTNETDynamicInit(11),
    FrontierClientInit(12),
    FrontierClientClose(13),
    FrontierClientUpdatePingInterval(14),
    LoadOfflineAsrModel(23),
    UnloadOfflineAsrModel(24),
    StartAsrGlobalMetrics(25),
    ResetAsrGlobalMetrics(26),
    SendAsrGlobalMetrics(27),
    FrontierClientInitCell(112),
    FrontierClientCloseCell(113),
    FrontierClientUpdatePingIntervalCell(114);

    public static final HashMap<Integer, SAMICoreContextType> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreContextType[] values = values();
        for (int i = 0; i < 23; i++) {
            SAMICoreContextType sAMICoreContextType = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreContextType.getValue()), sAMICoreContextType);
        }
    }

    SAMICoreContextType(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreContextType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
