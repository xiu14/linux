package com.bytedance.android.input.speech;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import java.util.Objects;

/* loaded from: classes.dex */
public final class BluetoothManager {
    private BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();
    private BluetoothHeadset b;

    public static final class a implements BluetoothProfile.ServiceListener {
        a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            if (i == 1) {
                BluetoothManager bluetoothManager = BluetoothManager.this;
                kotlin.s.c.l.d(bluetoothProfile, "null cannot be cast to non-null type android.bluetooth.BluetoothHeadset");
                bluetoothManager.b = (BluetoothHeadset) bluetoothProfile;
                Objects.requireNonNull(BluetoothManager.this);
                com.bytedance.android.input.r.j.i("Asr-BTBroadcastReceiver", "Bluetooth service connected");
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            if (i == 1) {
                BluetoothManager.this.b = null;
                Objects.requireNonNull(BluetoothManager.this);
                com.bytedance.android.input.r.j.i("Asr-BTBroadcastReceiver", "Bluetooth service disconnected");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BluetoothManager() {
        /*
            r6 = this;
            r6.<init>()
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            r6.a = r0
            com.bytedance.android.input.speech.BluetoothManager$bluetoothReceiver$1 r0 = new com.bytedance.android.input.speech.BluetoothManager$bluetoothReceiver$1
            r0.<init>()
            java.lang.String r0 = "Asr-BTBroadcastReceiver"
            java.lang.String r1 = "Bluetooth init"
            com.bytedance.android.input.r.j.m(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            r3 = 1
            if (r1 >= r2) goto L30
            com.bytedance.android.input.basic.IAppGlobals$a r1 = com.bytedance.android.input.basic.IAppGlobals.a
            java.util.Objects.requireNonNull(r1)
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "android.permission.BLUETOOTH"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r2)
            if (r1 != 0) goto L2e
            goto L30
        L2e:
            r1 = 0
            goto L31
        L30:
            r1 = r3
        L31:
            if (r1 == 0) goto L6c
            com.bytedance.android.input.basic.IAppGlobals$a r1 = com.bytedance.android.input.basic.IAppGlobals.a
            android.content.Context r2 = r1.getContext()
            java.lang.String r4 = "bluetooth"
            java.lang.Object r2 = r2.getSystemService(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.bluetooth.BluetoothManager"
            kotlin.s.c.l.d(r2, r4)
            android.bluetooth.BluetoothManager r2 = (android.bluetooth.BluetoothManager) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Bluetooth init bluetoothManager = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.bytedance.android.input.r.j.m(r0, r4)
            android.bluetooth.BluetoothAdapter r0 = r2.getAdapter()
            if (r0 == 0) goto L6c
            android.content.Context r1 = r1.getContext()
            com.bytedance.android.input.speech.BluetoothManager$a r2 = new com.bytedance.android.input.speech.BluetoothManager$a
            r2.<init>()
            r0.getProfileProxy(r1, r2, r3)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.BluetoothManager.<init>():void");
    }

    public final boolean b() {
        boolean z;
        String str;
        Object e2 = SettingsConfigNext.e(C0838R.string.enable_bluetooth_input);
        kotlin.s.c.l.d(e2, "null cannot be cast to non-null type kotlin.Boolean");
        if (!((Boolean) e2).booleanValue()) {
            return false;
        }
        if (!(this.a != null) || this.b == null) {
            return false;
        }
        Object systemService = IAppGlobals.a.getContext().getSystemService("audio");
        kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(1);
        kotlin.s.c.l.e(devices, "activeInputs");
        if (!(devices.length == 0)) {
            z = false;
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3 || type == 4) {
                    str = "有线耳机麦克风";
                } else if (type == 7) {
                    str = "蓝牙耳机麦克风";
                    z = true;
                } else if (type == 8) {
                    str = "蓝牙设备麦克风";
                } else if (type == 11) {
                    str = "USB外接麦克风";
                } else if (type != 15) {
                    StringBuilder M = e.a.a.a.a.M("未知麦克风类型 (");
                    M.append(audioDeviceInfo.getType());
                    M.append(')');
                    str = M.toString();
                } else {
                    str = "内置麦克风";
                }
                com.bytedance.android.input.r.j.i("AudioDeviceDetector", "input device = " + str);
            }
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        com.bytedance.android.input.r.j.i("Asr-BTBroadcastReceiver", "isBluetoothAudioConnected = true");
        return true;
    }
}
