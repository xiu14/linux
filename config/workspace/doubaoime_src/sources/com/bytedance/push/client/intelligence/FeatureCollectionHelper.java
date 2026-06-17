package com.bytedance.push.client.intelligence;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.bytedance.android.service.manager.push.client.intelligence.IClientFeatureService;
import com.bytedance.android.service.manager.push.client.intelligence.IFeatureCallBack;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.push.C;
import com.bytedance.push.client.intelligence.ClientIntelligenceServiceImpl;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FeatureCollectionHelper extends com.bytedance.common.push.c implements SensorEventListener, IClientFeatureService {
    public static final String CLIENT_INTELLIGENCE_TAG = "CLIENT_INTELLIGENCE-";
    private static volatile FeatureCollectionHelper mInstance;
    private boolean mAccelerometerCollectSuccess;
    private JSONObject mAccelerometerInfo;
    private Sensor mAccelerometerSensor;
    private ActivityManager mActivityManager;
    private boolean mAllowCollectClientFeature;
    private List<String> mAllowCollectClientFeatureScene;
    private AudioManager mAudioManager;
    private CountDownLatch mAudioManagerInitCountDownLatch;
    private BatteryManager mBatteryManager;
    private Context mContext;
    private float mDistance;
    private boolean mDistanceCollectSuccess;
    private Sensor mGyroScopeSensor;
    private boolean mGyroscopeCollectSuccess;
    private JSONObject mGyroscopeInfo;
    private Handler mHandler;
    private KeyguardManager mKeyguardManager;
    private long mLastBrightScreenTime;
    private long mLastRestScreenTime;
    private float mLight;
    private boolean mLightCollectSuccess;
    private Sensor mLightSensor;
    private PowerManager mPowerManager;
    private Sensor mProximitySensor;
    private CountDownLatch mPushShowCountDownLatch;
    private CountDownLatch mReportFeatureCountDownLatch;
    private com.bytedance.common.b.a mSensorAbility;
    private SensorManager mSensorManager;
    private final String TAG = "CLIENT_INTELLIGENCE-FeatureCollectionHelper";
    private final int VALUE_UNKNOWN = -1;
    private final float F_VALUE_UNKNOWN = -1.0f;
    private float xAc = -1.0f;
    private float yAc = -1.0f;
    private float zAc = -1.0f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureCollectionHelper featureCollectionHelper = FeatureCollectionHelper.this;
            featureCollectionHelper.mAudioManager = (AudioManager) featureCollectionHelper.mContext.getSystemService("audio");
            FeatureCollectionHelper.this.mAudioManagerInitCountDownLatch.countDown();
        }
    }

    class b implements Runnable {
        final /* synthetic */ com.bytedance.push.client.intelligence.e a;

        b(com.bytedance.push.client.intelligence.e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean z = true;
                FeatureCollectionHelper.this.mPushShowCountDownLatch = new CountDownLatch(1);
                FeatureCollectionHelper.this.initPushShowFeatureSensor();
                boolean await = FeatureCollectionHelper.this.mPushShowCountDownLatch.await(((C) C.a()).b().getClientIntelligenceSettings().f5814d, TimeUnit.MILLISECONDS);
                StringBuilder sb = new StringBuilder();
                sb.append("finish getFeatureForPushShow, awaitTimeout is ");
                if (await) {
                    z = false;
                }
                sb.append(z);
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", sb.toString());
                ((ClientIntelligenceServiceImpl.b) this.a).a(FeatureCollectionHelper.this.isMusicActive(), FeatureCollectionHelper.this.mDistanceCollectSuccess, FeatureCollectionHelper.this.mDistance, FeatureCollectionHelper.this.mAccelerometerCollectSuccess, FeatureCollectionHelper.this.xAc, FeatureCollectionHelper.this.yAc, FeatureCollectionHelper.this.zAc);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                com.bytedance.push.g0.f.f("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "getFeatureForPushShow callback null because InterruptedException: ", e2);
                ClientIntelligenceServiceImpl.b bVar = (ClientIntelligenceServiceImpl.b) this.a;
                Objects.requireNonNull(bVar);
                com.bytedance.push.g0.f.e("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "cur is not low Ctr because onNullFeatureCallback");
                ClientIntelligenceServiceImpl.this.mCurIsLowCtr = false;
                bVar.a.countDown();
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IFeatureCallBack b;

        c(String str, IFeatureCallBack iFeatureCallBack) {
            this.a = str;
            this.b = iFeatureCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.onFeatureCallBack(FeatureCollectionHelper.this.getClientFeatureSync(this.a));
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.common.b.a aVar = FeatureCollectionHelper.this.mSensorAbility;
            SensorManager sensorManager = FeatureCollectionHelper.this.mSensorManager;
            FeatureCollectionHelper featureCollectionHelper = FeatureCollectionHelper.this;
            aVar.c(sensorManager, featureCollectionHelper, featureCollectionHelper.mGyroScopeSensor);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.common.b.a aVar = FeatureCollectionHelper.this.mSensorAbility;
            SensorManager sensorManager = FeatureCollectionHelper.this.mSensorManager;
            FeatureCollectionHelper featureCollectionHelper = FeatureCollectionHelper.this;
            aVar.c(sensorManager, featureCollectionHelper, featureCollectionHelper.mAccelerometerSensor);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.common.b.a aVar = FeatureCollectionHelper.this.mSensorAbility;
            SensorManager sensorManager = FeatureCollectionHelper.this.mSensorManager;
            FeatureCollectionHelper featureCollectionHelper = FeatureCollectionHelper.this;
            aVar.c(sensorManager, featureCollectionHelper, featureCollectionHelper.mLightSensor);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.common.b.a aVar = FeatureCollectionHelper.this.mSensorAbility;
            SensorManager sensorManager = FeatureCollectionHelper.this.mSensorManager;
            FeatureCollectionHelper featureCollectionHelper = FeatureCollectionHelper.this;
            aVar.c(sensorManager, featureCollectionHelper, featureCollectionHelper.mProximitySensor);
        }
    }

    private class h extends BroadcastReceiver {
        h(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (TextUtils.equals("android.intent.action.SCREEN_ON", action)) {
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "监听到亮屏");
                FeatureCollectionHelper.this.mLastBrightScreenTime = System.currentTimeMillis();
            } else if (TextUtils.equals("android.intent.action.SCREEN_OFF", action)) {
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "监听到息屏");
                FeatureCollectionHelper.this.mLastRestScreenTime = System.currentTimeMillis();
            }
        }
    }

    private FeatureCollectionHelper(Context context) {
        this.mContext = context;
        com.bytedance.push.settings.n.a.b clientIntelligenceSettings = ((C) C.a()).b().getClientIntelligenceSettings();
        boolean z = clientIntelligenceSettings.b;
        this.mAllowCollectClientFeature = z;
        if (z) {
            List<String> list = clientIntelligenceSettings.n;
            this.mAllowCollectClientFeatureScene = list;
            if (list.isEmpty()) {
                return;
            }
            this.mSensorAbility = com.bytedance.common.g.a.c().e().c().o.getSensorAbility();
            this.mHandler = new Handler(Looper.getMainLooper());
            this.mGyroscopeInfo = new JSONObject();
            this.mAccelerometerInfo = new JSONObject();
            this.mSensorManager = (SensorManager) this.mContext.getSystemService("sensor");
            this.mBatteryManager = (BatteryManager) this.mContext.getSystemService("batterymanager");
            this.mAudioManagerInitCountDownLatch = new CountDownLatch(1);
            this.mHandler.post(new a());
            this.mPowerManager = (PowerManager) this.mContext.getSystemService("power");
            this.mKeyguardManager = (KeyguardManager) this.mContext.getSystemService("keyguard");
            this.mActivityManager = (ActivityManager) this.mContext.getSystemService("activity");
            if (isScreenOn()) {
                this.mLastBrightScreenTime = System.currentTimeMillis();
            } else {
                this.mLastRestScreenTime = System.currentTimeMillis();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            com.bytedance.common.g.a.c().b().registerReceiver(this.mContext, new h(null), intentFilter);
        }
    }

    private JSONObject getAudioFeature() {
        JSONObject jSONObject = new JSONObject();
        if (this.mAudioManager == null) {
            return jSONObject;
        }
        add(jSONObject, "cur_call_voice", r1.getStreamVolume(0));
        add(jSONObject, "max_call_voice", this.mAudioManager.getStreamMaxVolume(0));
        add(jSONObject, "cur_system_voice", this.mAudioManager.getStreamVolume(1));
        add(jSONObject, "max_system_voice", this.mAudioManager.getStreamMaxVolume(1));
        add(jSONObject, "cur_ring_voice", this.mAudioManager.getStreamVolume(2));
        add(jSONObject, "max_ring_voice", this.mAudioManager.getStreamMaxVolume(2));
        add(jSONObject, "cur_music_voice", this.mAudioManager.getStreamVolume(3));
        add(jSONObject, "max_music_voice", this.mAudioManager.getStreamMaxVolume(3));
        add(jSONObject, "cur_alarm_voice", this.mAudioManager.getStreamVolume(4));
        add(jSONObject, "max_alarm_voice", this.mAudioManager.getStreamMaxVolume(4));
        return jSONObject;
    }

    private int getBatteryCapacity() {
        BatteryManager batteryManager = this.mBatteryManager;
        if (batteryManager != null) {
            return batteryManager.getIntProperty(4);
        }
        return -1;
    }

    private int getBatteryStatus() {
        BatteryManager batteryManager = this.mBatteryManager;
        if (batteryManager != null) {
            return batteryManager.getIntProperty(6);
        }
        return -1;
    }

    public static FeatureCollectionHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (FeatureCollectionHelper.class) {
                if (mInstance == null) {
                    mInstance = new FeatureCollectionHelper(context);
                }
            }
        }
        return mInstance;
    }

    private int getNetWorkType() {
        NetworkUtils.NetworkType e2 = NetworkUtils.e(this.mContext);
        if (!e2.isAvailable()) {
            return 0;
        }
        if (e2.is4GOrHigher()) {
            return 4;
        }
        if (e2.is3GOrHigher()) {
            return 3;
        }
        if (e2.is2G()) {
            return 2;
        }
        return e2.isWifi() ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initPushShowFeatureSensor() {
        this.mAccelerometerCollectSuccess = false;
        this.mAccelerometerInfo = new JSONObject();
        this.xAc = -1.0f;
        this.yAc = -1.0f;
        this.zAc = -1.0f;
        this.mSensorAbility.a(this.mSensorManager, 1);
        this.mAccelerometerSensor = null;
        this.mSensorAbility.b(this.mSensorManager, this, null, 0);
        this.mDistanceCollectSuccess = false;
        this.mDistance = -1.0f;
        this.mSensorAbility.a(this.mSensorManager, 8);
        this.mProximitySensor = null;
        this.mSensorAbility.b(this.mSensorManager, this, null, 0);
    }

    private void initSensor() {
        this.mGyroscopeCollectSuccess = false;
        this.mGyroscopeInfo = new JSONObject();
        this.mSensorAbility.a(this.mSensorManager, 4);
        this.mGyroScopeSensor = null;
        this.mSensorAbility.b(this.mSensorManager, this, null, 0);
        this.mLightCollectSuccess = false;
        this.mLight = -1.0f;
        this.mSensorAbility.a(this.mSensorManager, 5);
        this.mLightSensor = null;
        this.mSensorAbility.b(this.mSensorManager, this, null, 0);
        initPushShowFeatureSensor();
    }

    private boolean isLockScreen() {
        return this.mKeyguardManager.inKeyguardRestrictedInputMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMusicActive() {
        AudioManager audioManager = this.mAudioManager;
        return audioManager != null && audioManager.isMusicActive();
    }

    private boolean isScreenOn() {
        try {
            return this.mPowerManager.isScreenOn();
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "isScreenOn error", th);
            return true;
        }
    }

    private boolean isUsingEarPhone(AudioManager audioManager) {
        int profileConnectionState;
        int profileConnectionState2;
        int profileConnectionState3;
        if (audioManager.isWiredHeadsetOn()) {
            return true;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 34 || this.mContext.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
            profileConnectionState = defaultAdapter.getProfileConnectionState(2);
            profileConnectionState2 = defaultAdapter.getProfileConnectionState(1);
            profileConnectionState3 = defaultAdapter.getProfileConnectionState(3);
        } else {
            profileConnectionState3 = 0;
            profileConnectionState = 0;
            profileConnectionState2 = 0;
        }
        if (profileConnectionState == 2) {
            profileConnectionState3 = profileConnectionState;
        } else if (profileConnectionState2 == 2) {
            profileConnectionState3 = profileConnectionState2;
        } else if (profileConnectionState3 != 2) {
            profileConnectionState3 = -1;
        }
        return profileConnectionState3 != -1;
    }

    @Override // com.bytedance.android.service.manager.push.client.intelligence.IClientFeatureService
    public void getClientFeatureAsync(IFeatureCallBack iFeatureCallBack, String str) {
        com.bytedance.common.push.d.b(new c(str, iFeatureCallBack));
    }

    @Override // com.bytedance.android.service.manager.push.client.intelligence.IClientFeatureService
    public JSONObject getClientFeatureSync(String str) {
        StringBuilder M = e.a.a.a.a.M("[getClientFeatureSync] allowCollectClientFeature is ");
        M.append(this.mAllowCollectClientFeature);
        M.append(" invokeScene is ");
        M.append(str);
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", M.toString());
        if (!this.mAllowCollectClientFeature) {
            return null;
        }
        if (!this.mAllowCollectClientFeatureScene.contains(str)) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "[getClientFeatureSync] return null because mAllowCollectClientFeatureScene not contains " + str);
            return null;
        }
        boolean z = true;
        this.mReportFeatureCountDownLatch = new CountDownLatch(1);
        initSensor();
        try {
            boolean await = this.mReportFeatureCountDownLatch.await(((C) C.a()).b().getClientIntelligenceSettings().f5814d, TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder();
            sb.append("finish getClientFeatureSync, awaitTimeout is ");
            if (await) {
                z = false;
            }
            sb.append(z);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", sb.toString());
            JSONObject jSONObject = new JSONObject();
            add(jSONObject, "client_time", System.currentTimeMillis());
            add(jSONObject, "voice", getAudioFeature());
            add(jSONObject, "is_using_ear_phone", isUsingEarPhone(this.mAudioManager));
            add(jSONObject, "is_music_active", isMusicActive());
            add(jSONObject, "cur_battery_capacity", getBatteryCapacity());
            add(jSONObject, "cur_battery_status", getBatteryStatus());
            add(jSONObject, "is_screen_on", isScreenOn());
            add(jSONObject, "last_screen_on_time", this.mLastBrightScreenTime);
            add(jSONObject, "last_screen_off_time", this.mLastRestScreenTime);
            add(jSONObject, "is_lock_screen", isLockScreen());
            add(jSONObject, "network_type", getNetWorkType());
            add(jSONObject, "gyroscope_info", this.mGyroscopeInfo);
            add(jSONObject, "accelerometer_info", this.mAccelerometerInfo);
            add(jSONObject, "lignt", this.mLight);
            add(jSONObject, "distance", this.mDistance);
            return jSONObject;
        } catch (InterruptedException e2) {
            com.bytedance.push.g0.f.f("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "error when await mReportFeatureCountDownLatch:", e2);
            return null;
        }
    }

    public synchronized void getFeatureForEventReport(IFeatureCallBack iFeatureCallBack, String str) {
        boolean z = ((C) C.a()).b().getClientIntelligenceSettings().a;
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "[getFeatureForEventReport] enableClientFeatureReport is " + z);
        if (z) {
            getClientFeatureAsync(iFeatureCallBack, str);
        } else {
            iFeatureCallBack.onFeatureCallBack(null);
        }
    }

    public synchronized void getFeatureForLocalPush(com.bytedance.push.client.intelligence.d dVar) {
        boolean z = ((C) C.a()).b().getClientIntelligenceSettings().o.a;
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "[getFeatureForLocalPush] allowCollectClientFeature is " + this.mAllowCollectClientFeature + " enableClientIntelligenceLocalPush is " + z);
        if (this.mAllowCollectClientFeature && z) {
            if (this.mAudioManagerInitCountDownLatch.getCount() > 0) {
                try {
                    this.mAudioManagerInitCountDownLatch.await();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            ((ClientIntelligenceServiceImpl.g) dVar).a(isUsingEarPhone(this.mAudioManager), isScreenOn(), isMusicActive());
            return;
        }
        com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "getFeatureForLocalPush callback null because settings is not enable");
        ClientIntelligenceServiceImpl.g gVar = (ClientIntelligenceServiceImpl.g) dVar;
        Objects.requireNonNull(gVar);
        com.bytedance.push.g0.f.e("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "cur is not low Ctr because onNullFeatureCallback");
        ClientIntelligenceServiceImpl.this.mCurIsHighCtr = false;
        gVar.a.countDown();
    }

    public synchronized void getFeatureForPushShow(com.bytedance.push.client.intelligence.e eVar) {
        boolean z = ((C) C.a()).b().getClientIntelligenceSettings().f5813c;
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "[getFeatureForPushShow] allowCollectClientFeature is " + this.mAllowCollectClientFeature + " enableClientIntelligencePushShow is " + z);
        if (this.mAllowCollectClientFeature && z) {
            com.bytedance.common.push.d.b(new b(eVar));
            return;
        }
        com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "getFeatureForPushShow callback null because settings is not enable");
        ClientIntelligenceServiceImpl.b bVar = (ClientIntelligenceServiceImpl.b) eVar;
        Objects.requireNonNull(bVar);
        com.bytedance.push.g0.f.e("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "cur is not low Ctr because onNullFeatureCallback");
        ClientIntelligenceServiceImpl.this.mCurIsLowCtr = false;
        bVar.a.countDown();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.mGyroscopeCollectSuccess && sensorEvent.sensor.getType() == 4) {
            add(this.mGyroscopeInfo, "xGy", sensorEvent.values[0]);
            add(this.mGyroscopeInfo, "yGy", sensorEvent.values[1]);
            add(this.mGyroscopeInfo, "zGy", sensorEvent.values[2]);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "陀螺仪传感器更新：" + this.mGyroscopeInfo.toString());
            com.bytedance.common.push.d.a(new d());
            this.mGyroscopeCollectSuccess = true;
        } else if (!this.mAccelerometerCollectSuccess && sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0];
            this.xAc = f2;
            this.yAc = fArr[1];
            this.zAc = fArr[2];
            add(this.mAccelerometerInfo, "xAc", f2);
            add(this.mAccelerometerInfo, "yAc", this.yAc);
            add(this.mAccelerometerInfo, "zAc", this.zAc);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "加速度传感器更新：" + this.mAccelerometerInfo.toString());
            com.bytedance.common.push.d.a(new e());
            this.mAccelerometerCollectSuccess = true;
        } else if (!this.mLightCollectSuccess && sensorEvent.sensor.getType() == 5) {
            this.mLight = sensorEvent.values[0];
            StringBuilder M = e.a.a.a.a.M("光线传感器更新：");
            M.append(this.mLight);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", M.toString());
            com.bytedance.common.push.d.a(new f());
            this.mLightCollectSuccess = true;
        } else if (!this.mDistanceCollectSuccess && sensorEvent.sensor.getType() == 8) {
            this.mDistance = sensorEvent.values[0];
            StringBuilder M2 = e.a.a.a.a.M("距离传感器更新：");
            M2.append(this.mDistance);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", M2.toString());
            com.bytedance.common.push.d.a(new g());
            this.mDistanceCollectSuccess = true;
        }
        if (this.mAccelerometerCollectSuccess && this.mDistanceCollectSuccess) {
            if (this.mPushShowCountDownLatch != null) {
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "finish get push show feature,invoke mPushShowCountDownLatch.countDown()");
                this.mPushShowCountDownLatch.countDown();
            }
            if (this.mGyroscopeCollectSuccess && this.mLightCollectSuccess && this.mReportFeatureCountDownLatch != null) {
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-FeatureCollectionHelper", "finish get report feature,invoke mReportFeatureCountDownLatch.countDown()");
                this.mReportFeatureCountDownLatch.countDown();
            }
        }
    }

    public void setAllowCollectClientFeature(boolean z) {
        this.mAllowCollectClientFeature = z;
    }
}
