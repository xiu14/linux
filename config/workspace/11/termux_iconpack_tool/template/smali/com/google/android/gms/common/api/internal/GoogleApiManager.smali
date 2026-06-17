.class public Lcom/google/android/gms/common/api/internal/GoogleApiManager;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation


# static fields
.field public static final p:Lcom/google/android/gms/common/api/Status;

.field public static final q:Lcom/google/android/gms/common/api/Status;

.field public static final r:Ljava/lang/Object;

.field public static s:Lcom/google/android/gms/common/api/internal/GoogleApiManager;


# instance fields
.field public a:J

.field public b:Z

.field public c:Lcom/google/android/gms/common/internal/TelemetryData;

.field public d:Lcom/google/android/gms/common/internal/service/zao;

.field public final e:Landroid/content/Context;

.field public final f:Lcom/google/android/gms/common/GoogleApiAvailability;

.field public final g:Lcom/google/android/gms/common/internal/zal;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public k:Lcom/google/android/gms/common/api/internal/zaae;

.field public final l:Lq/g;

.field public final m:Lq/g;

.field public final n:Lcom/google/android/gms/internal/base/zau;

.field public volatile o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->p:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->q:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->r:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/GoogleApiAvailability;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x2710

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->a:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->b:Z

    .line 10
    .line 11
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    const/high16 v4, 0x3f400000    # 0.75f

    .line 30
    .line 31
    invoke-direct {v1, v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->k:Lcom/google/android/gms/common/api/internal/zaae;

    .line 38
    .line 39
    new-instance v1, Lq/g;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lq/g;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->l:Lq/g;

    .line 45
    .line 46
    new-instance v1, Lq/g;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Lq/g;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->m:Lq/g;

    .line 52
    .line 53
    iput-boolean v2, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->o:Z

    .line 54
    .line 55
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 56
    .line 57
    new-instance v1, Lcom/google/android/gms/internal/base/zau;

    .line 58
    .line 59
    invoke-direct {v1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 66
    .line 67
    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->f:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 68
    .line 69
    new-instance p2, Lcom/google/android/gms/common/internal/zal;

    .line 70
    .line 71
    invoke-direct {p2, p3}, Lcom/google/android/gms/common/internal/zal;-><init>(Lcom/google/android/gms/common/GoogleApiAvailabilityLight;)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->g:Lcom/google/android/gms/common/internal/zal;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget-object p2, Lcom/google/android/gms/common/util/DeviceProperties;->d:Ljava/lang/Boolean;

    .line 81
    .line 82
    if-nez p2, :cond_1

    .line 83
    .line 84
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    const/16 p3, 0x1a

    .line 87
    .line 88
    if-lt p2, p3, :cond_0

    .line 89
    .line 90
    const-string p2, "android.hardware.type.automotive"

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_0

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    const/4 v2, 0x0

    .line 100
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    sput-object p1, Lcom/google/android/gms/common/util/DeviceProperties;->d:Ljava/lang/Boolean;

    .line 105
    .line 106
    :cond_1
    sget-object p1, Lcom/google/android/gms/common/util/DeviceProperties;->d:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->o:Z

    .line 115
    .line 116
    :cond_2
    const/4 p1, 0x6

    .line 117
    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 122
    .line 123
    .line 124
    return-void
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static c(Lcom/google/android/gms/common/api/internal/ApiKey;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/ApiKey;->b:Lcom/google/android/gms/common/api/Api;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/gms/common/api/Api;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "API: "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, " is not available on this device. Connection failed with: "

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/16 v1, 0x11

    .line 34
    .line 35
    iget-object v2, p1, Lcom/google/android/gms/common/ConnectionResult;->j:Landroid/app/PendingIntent;

    .line 36
    .line 37
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 38
    .line 39
    .line 40
    return-object v0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static f(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/GoogleApiManager;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->s:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/common/internal/GmsClientSupervisor;->a()Landroid/os/HandlerThread;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v3, Lcom/google/android/gms/common/GoogleApiAvailability;->d:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 23
    .line 24
    invoke-direct {v2, p0, v1, v3}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/GoogleApiAvailability;)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->s:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->s:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-object p0

    .line 36
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->a()Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->a:Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, v0, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->i:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :cond_1
    const v0, 0xc1fa340

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->g:Lcom/google/android/gms/common/internal/zal;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/google/android/gms/common/internal/zal;->a:Landroid/util/SparseIntArray;

    .line 24
    .line 25
    const/4 v2, -0x1

    .line 26
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eq v0, v2, :cond_3

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 36
    return v0

    .line 37
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 38
    return v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final b(Lcom/google/android/gms/common/ConnectionResult;I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->f:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-class v2, Lcom/google/android/gms/common/wrappers/InstantApps;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    sget-object v4, Lcom/google/android/gms/common/wrappers/InstantApps;->a:Landroid/content/Context;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    sget-object v8, Lcom/google/android/gms/common/wrappers/InstantApps;->b:Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v8, :cond_1

    .line 25
    .line 26
    if-eq v4, v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    monitor-exit v2

    .line 34
    goto :goto_3

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_1
    :goto_0
    :try_start_1
    sput-object v7, Lcom/google/android/gms/common/wrappers/InstantApps;->b:Ljava/lang/Boolean;

    .line 39
    .line 40
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v8, 0x1a

    .line 43
    .line 44
    if-lt v4, v8, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/4 v4, 0x0

    .line 49
    :goto_1
    if-eqz v4, :cond_3

    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4}, La3/b;->z(Landroid/content/pm/PackageManager;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sput-object v4, Lcom/google/android/gms/common/wrappers/InstantApps;->b:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v8, "com.google.android.instantapps.supervisor.InstantAppsRuntime"

    .line 71
    .line 72
    invoke-virtual {v4, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    sput-object v4, Lcom/google/android/gms/common/wrappers/InstantApps;->b:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catch_0
    :try_start_3
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    sput-object v4, Lcom/google/android/gms/common/wrappers/InstantApps;->b:Ljava/lang/Boolean;

    .line 83
    .line 84
    :goto_2
    sput-object v3, Lcom/google/android/gms/common/wrappers/InstantApps;->a:Landroid/content/Context;

    .line 85
    .line 86
    sget-object v3, Lcom/google/android/gms/common/wrappers/InstantApps;->b:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    monitor-exit v2

    .line 93
    :goto_3
    if-eqz v3, :cond_4

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->c0()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    const/high16 v3, 0x8000000

    .line 101
    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    iget-object v2, p1, Lcom/google/android/gms/common/ConnectionResult;->j:Landroid/app/PendingIntent;

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    iget v2, p1, Lcom/google/android/gms/common/ConnectionResult;->i:I

    .line 108
    .line 109
    invoke-virtual {v0, v1, v7, v2}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-nez v2, :cond_6

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    sget v4, Lcom/google/android/gms/internal/common/zzd;->a:I

    .line 117
    .line 118
    or-int/2addr v4, v3

    .line 119
    invoke-static {v1, v6, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    :goto_4
    move-object v2, v7

    .line 124
    :goto_5
    if-eqz v2, :cond_7

    .line 125
    .line 126
    iget p1, p1, Lcom/google/android/gms/common/ConnectionResult;->i:I

    .line 127
    .line 128
    sget v4, Lcom/google/android/gms/common/api/GoogleApiActivity;->i:I

    .line 129
    .line 130
    const-class v4, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 131
    .line 132
    new-instance v7, Landroid/content/Intent;

    .line 133
    .line 134
    invoke-direct {v7, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 135
    .line 136
    .line 137
    const-string v4, "pending_intent"

    .line 138
    .line 139
    invoke-virtual {v7, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 140
    .line 141
    .line 142
    const-string v2, "failing_client_id"

    .line 143
    .line 144
    invoke-virtual {v7, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    const-string p2, "notify_manager"

    .line 148
    .line 149
    invoke-virtual {v7, p2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 150
    .line 151
    .line 152
    sget p2, Lcom/google/android/gms/internal/base/zap;->a:I

    .line 153
    .line 154
    or-int/2addr p2, v3

    .line 155
    invoke-static {v1, v6, v7, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/common/GoogleApiAvailability;->f(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_7
    :goto_6
    const/4 v5, 0x0

    .line 164
    :goto_7
    return v5

    .line 165
    :goto_8
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 166
    throw p1
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final d(Lcom/google/android/gms/common/api/GoogleApi;)Lcom/google/android/gms/common/api/internal/zabq;
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/common/api/GoogleApi;->e:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/google/android/gms/common/api/internal/zabq;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/gms/common/api/internal/zabq;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/common/api/internal/zabq;-><init>(Lcom/google/android/gms/common/api/internal/GoogleApiManager;Lcom/google/android/gms/common/api/GoogleApi;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, Lcom/google/android/gms/common/api/internal/zabq;->d:Lcom/google/android/gms/common/api/Api$Client;

    .line 22
    .line 23
    invoke-interface {p1}, Lcom/google/android/gms/common/api/Api$Client;->o()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->m:Lq/g;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lq/g;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/zabq;->n()V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public final e(Lcom/google/android/gms/tasks/TaskCompletionSource;ILcom/google/android/gms/common/api/GoogleApi;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    iget-object v3, p3, Lcom/google/android/gms/common/api/GoogleApi;->e:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->a()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->a()Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iget-object p3, p3, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->a:Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eqz p3, :cond_3

    .line 20
    .line 21
    iget-boolean v1, p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->i:Z

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-boolean p3, p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->j:Z

    .line 26
    .line 27
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/google/android/gms/common/api/internal/zabq;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/zabq;->d:Lcom/google/android/gms/common/api/Api$Client;

    .line 38
    .line 39
    instance-of v4, v2, Lcom/google/android/gms/common/internal/BaseGmsClient;

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    check-cast v2, Lcom/google/android/gms/common/internal/BaseGmsClient;

    .line 44
    .line 45
    iget-object v4, v2, Lcom/google/android/gms/common/internal/BaseGmsClient;->u:Lcom/google/android/gms/common/internal/zzk;

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/BaseGmsClient;->i()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    invoke-static {v1, v2, p2}, Lcom/google/android/gms/common/api/internal/zacd;->b(Lcom/google/android/gms/common/api/internal/zabq;Lcom/google/android/gms/common/internal/BaseGmsClient;I)Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    iget v2, v1, Lcom/google/android/gms/common/api/internal/zabq;->n:I

    .line 62
    .line 63
    add-int/2addr v2, v0

    .line 64
    iput v2, v1, Lcom/google/android/gms/common/api/internal/zabq;->n:I

    .line 65
    .line 66
    iget-boolean v0, p3, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->j:Z

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move v0, p3

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 72
    move-object v1, p0

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    :goto_1
    new-instance p3, Lcom/google/android/gms/common/api/internal/zacd;

    .line 75
    .line 76
    const-wide/16 v1, 0x0

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    move-wide v4, v1

    .line 86
    :goto_2
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    :cond_5
    move-object v0, p3

    .line 93
    move-wide v6, v1

    .line 94
    move-object v1, p0

    .line 95
    move v2, p2

    .line 96
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/api/internal/zacd;-><init>(Lcom/google/android/gms/common/api/internal/GoogleApiManager;ILcom/google/android/gms/common/api/internal/ApiKey;JJ)V

    .line 97
    .line 98
    .line 99
    move-object p2, v0

    .line 100
    :goto_3
    if-eqz p2, :cond_7

    .line 101
    .line 102
    iget-object p1, p1, Lcom/google/android/gms/tasks/TaskCompletionSource;->a:Lcom/google/android/gms/tasks/zzw;

    .line 103
    .line 104
    iget-object p3, v1, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v0, Lcom/google/android/gms/common/api/internal/zabk;

    .line 110
    .line 111
    invoke-direct {v0, p3}, Lcom/google/android/gms/common/api/internal/zabk;-><init>(Lcom/google/android/gms/internal/base/zau;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/tasks/Task;->b(Lcom/google/android/gms/common/api/internal/zabk;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_6
    move-object v1, p0

    .line 119
    :cond_7
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public final g(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->b(Lcom/google/android/gms/common/ConnectionResult;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 10
    .line 11
    invoke-virtual {v2, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 11

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const-wide/32 v1, 0x493e0

    .line 4
    .line 5
    .line 6
    const/16 v3, 0x11

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "Unknown message id: "

    .line 17
    .line 18
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "GoogleApiManager"

    .line 29
    .line 30
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    return v4

    .line 34
    :pswitch_0
    iput-boolean v4, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->b:Z

    .line 35
    .line 36
    return v5

    .line 37
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lcom/google/android/gms/common/api/internal/zace;

    .line 40
    .line 41
    iget-wide v0, p1, Lcom/google/android/gms/common/api/internal/zace;->c:J

    .line 42
    .line 43
    const-wide/16 v7, 0x0

    .line 44
    .line 45
    cmp-long v2, v0, v7

    .line 46
    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    new-instance v0, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 50
    .line 51
    iget v1, p1, Lcom/google/android/gms/common/api/internal/zace;->b:I

    .line 52
    .line 53
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/zace;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 54
    .line 55
    new-array v2, v5, [Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 56
    .line 57
    aput-object p1, v2, v4

    .line 58
    .line 59
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 67
    .line 68
    if-nez p1, :cond_0

    .line 69
    .line 70
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 71
    .line 72
    new-instance v1, Lcom/google/android/gms/common/internal/service/zao;

    .line 73
    .line 74
    sget-object v2, Lcom/google/android/gms/common/internal/service/zao;->i:Lcom/google/android/gms/common/api/Api;

    .line 75
    .line 76
    sget-object v3, Lcom/google/android/gms/common/api/GoogleApi$Settings;->c:Lcom/google/android/gms/common/api/GoogleApi$Settings;

    .line 77
    .line 78
    invoke-direct {v1, p1, v2, v3}, Lcom/google/android/gms/common/api/GoogleApi;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 82
    .line 83
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/internal/service/zao;->b(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 86
    .line 87
    .line 88
    return v5

    .line 89
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 90
    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    iget-object v1, v0, Lcom/google/android/gms/common/internal/TelemetryData;->i:Ljava/util/List;

    .line 94
    .line 95
    iget v0, v0, Lcom/google/android/gms/common/internal/TelemetryData;->h:I

    .line 96
    .line 97
    iget v2, p1, Lcom/google/android/gms/common/api/internal/zace;->b:I

    .line 98
    .line 99
    if-ne v0, v2, :cond_4

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget v1, p1, Lcom/google/android/gms/common/api/internal/zace;->d:I

    .line 108
    .line 109
    if-lt v0, v1, :cond_2

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 113
    .line 114
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/zace;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 115
    .line 116
    iget-object v2, v0, Lcom/google/android/gms/common/internal/TelemetryData;->i:Ljava/util/List;

    .line 117
    .line 118
    if-nez v2, :cond_3

    .line 119
    .line 120
    new-instance v2, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v2, v0, Lcom/google/android/gms/common/internal/TelemetryData;->i:Ljava/util/List;

    .line 126
    .line 127
    :cond_3
    iget-object v0, v0, Lcom/google/android/gms/common/internal/TelemetryData;->i:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 134
    .line 135
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 139
    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iget v1, v0, Lcom/google/android/gms/common/internal/TelemetryData;->h:I

    .line 143
    .line 144
    if-gtz v1, :cond_5

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->a()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_7

    .line 151
    .line 152
    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 153
    .line 154
    if-nez v1, :cond_6

    .line 155
    .line 156
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 157
    .line 158
    new-instance v2, Lcom/google/android/gms/common/internal/service/zao;

    .line 159
    .line 160
    sget-object v4, Lcom/google/android/gms/common/internal/service/zao;->i:Lcom/google/android/gms/common/api/Api;

    .line 161
    .line 162
    sget-object v7, Lcom/google/android/gms/common/api/GoogleApi$Settings;->c:Lcom/google/android/gms/common/api/GoogleApi$Settings;

    .line 163
    .line 164
    invoke-direct {v2, v1, v4, v7}, Lcom/google/android/gms/common/api/GoogleApi;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V

    .line 165
    .line 166
    .line 167
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 168
    .line 169
    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/internal/service/zao;->b(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 172
    .line 173
    .line 174
    :cond_7
    iput-object v6, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 175
    .line 176
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 177
    .line 178
    if-nez v0, :cond_1f

    .line 179
    .line 180
    new-instance v0, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 183
    .line 184
    .line 185
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/zace;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    new-instance v1, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 191
    .line 192
    iget v2, p1, Lcom/google/android/gms/common/api/internal/zace;->b:I

    .line 193
    .line 194
    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 195
    .line 196
    .line 197
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 198
    .line 199
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-wide v2, p1, Lcom/google/android/gms/common/api/internal/zace;->c:J

    .line 206
    .line 207
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 208
    .line 209
    .line 210
    return v5

    .line 211
    :pswitch_2
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 212
    .line 213
    if-eqz p1, :cond_1f

    .line 214
    .line 215
    iget v0, p1, Lcom/google/android/gms/common/internal/TelemetryData;->h:I

    .line 216
    .line 217
    if-gtz v0, :cond_9

    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->a()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_b

    .line 224
    .line 225
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 226
    .line 227
    if-nez v0, :cond_a

    .line 228
    .line 229
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 230
    .line 231
    new-instance v1, Lcom/google/android/gms/common/internal/service/zao;

    .line 232
    .line 233
    sget-object v2, Lcom/google/android/gms/common/internal/service/zao;->i:Lcom/google/android/gms/common/api/Api;

    .line 234
    .line 235
    sget-object v3, Lcom/google/android/gms/common/api/GoogleApi$Settings;->c:Lcom/google/android/gms/common/api/GoogleApi$Settings;

    .line 236
    .line 237
    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/common/api/GoogleApi;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V

    .line 238
    .line 239
    .line 240
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 241
    .line 242
    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d:Lcom/google/android/gms/common/internal/service/zao;

    .line 243
    .line 244
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/service/zao;->b(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 245
    .line 246
    .line 247
    :cond_b
    iput-object v6, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 248
    .line 249
    return v5

    .line 250
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast p1, Lcom/google/android/gms/common/api/internal/zabs;

    .line 253
    .line 254
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 255
    .line 256
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/zabs;->a:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_1f

    .line 263
    .line 264
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 265
    .line 266
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/zabs;->a:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, Lcom/google/android/gms/common/api/internal/zabq;

    .line 273
    .line 274
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/zabq;->l:Ljava/util/ArrayList;

    .line 275
    .line 276
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/zabq;->o:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 277
    .line 278
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/zabq;->c:Ljava/util/LinkedList;

    .line 279
    .line 280
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_1f

    .line 285
    .line 286
    iget-object v1, v2, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 287
    .line 288
    const/16 v6, 0xf

    .line 289
    .line 290
    invoke-virtual {v1, v6, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    iget-object v1, v2, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 294
    .line 295
    const/16 v2, 0x10

    .line 296
    .line 297
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/zabs;->b:Lcom/google/android/gms/common/Feature;

    .line 301
    .line 302
    new-instance v1, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    :cond_c
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_e

    .line 320
    .line 321
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    check-cast v6, Lcom/google/android/gms/common/api/internal/zai;

    .line 326
    .line 327
    instance-of v7, v6, Lcom/google/android/gms/common/api/internal/zac;

    .line 328
    .line 329
    if-eqz v7, :cond_c

    .line 330
    .line 331
    move-object v7, v6

    .line 332
    check-cast v7, Lcom/google/android/gms/common/api/internal/zac;

    .line 333
    .line 334
    invoke-virtual {v7, v0}, Lcom/google/android/gms/common/api/internal/zac;->g(Lcom/google/android/gms/common/api/internal/zabq;)[Lcom/google/android/gms/common/Feature;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    if-eqz v7, :cond_c

    .line 339
    .line 340
    array-length v8, v7

    .line 341
    const/4 v9, 0x0

    .line 342
    :goto_3
    if-ge v9, v8, :cond_c

    .line 343
    .line 344
    aget-object v10, v7, v9

    .line 345
    .line 346
    invoke-static {v10, p1}, Lcom/google/android/gms/common/internal/Objects;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    if-eqz v10, :cond_d

    .line 351
    .line 352
    if-ltz v9, :cond_c

    .line 353
    .line 354
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_2

    .line 358
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 359
    .line 360
    goto :goto_3

    .line 361
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    :goto_4
    if-ge v4, v0, :cond_1f

    .line 366
    .line 367
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    check-cast v2, Lcom/google/android/gms/common/api/internal/zai;

    .line 372
    .line 373
    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    new-instance v6, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    .line 377
    .line 378
    invoke-direct {v6, p1}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Lcom/google/android/gms/common/Feature;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v6}, Lcom/google/android/gms/common/api/internal/zai;->b(Ljava/lang/Exception;)V

    .line 382
    .line 383
    .line 384
    add-int/lit8 v4, v4, 0x1

    .line 385
    .line 386
    goto :goto_4

    .line 387
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast p1, Lcom/google/android/gms/common/api/internal/zabs;

    .line 390
    .line 391
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 392
    .line 393
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/zabs;->a:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 394
    .line 395
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_1f

    .line 400
    .line 401
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 402
    .line 403
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/zabs;->a:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 404
    .line 405
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    check-cast v0, Lcom/google/android/gms/common/api/internal/zabq;

    .line 410
    .line 411
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/zabq;->l:Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    if-nez p1, :cond_f

    .line 418
    .line 419
    goto/16 :goto_d

    .line 420
    .line 421
    :cond_f
    iget-boolean p1, v0, Lcom/google/android/gms/common/api/internal/zabq;->k:Z

    .line 422
    .line 423
    if-nez p1, :cond_1f

    .line 424
    .line 425
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/zabq;->d:Lcom/google/android/gms/common/api/Api$Client;

    .line 426
    .line 427
    invoke-interface {p1}, Lcom/google/android/gms/common/api/Api$Client;->b()Z

    .line 428
    .line 429
    .line 430
    move-result p1

    .line 431
    if-nez p1, :cond_10

    .line 432
    .line 433
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/zabq;->n()V

    .line 434
    .line 435
    .line 436
    return v5

    .line 437
    :cond_10
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/zabq;->d()V

    .line 438
    .line 439
    .line 440
    return v5

    .line 441
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast p1, Lcom/google/android/gms/common/api/internal/zaaf;

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 449
    .line 450
    invoke-virtual {p1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result p1

    .line 454
    if-nez p1, :cond_11

    .line 455
    .line 456
    throw v6

    .line 457
    :cond_11
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 458
    .line 459
    invoke-virtual {p1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    check-cast p1, Lcom/google/android/gms/common/api/internal/zabq;

    .line 464
    .line 465
    invoke-virtual {p1, v4}, Lcom/google/android/gms/common/api/internal/zabq;->m(Z)Z

    .line 466
    .line 467
    .line 468
    throw v6

    .line 469
    :pswitch_6
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 470
    .line 471
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 472
    .line 473
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_1f

    .line 478
    .line 479
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 480
    .line 481
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 482
    .line 483
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    check-cast p1, Lcom/google/android/gms/common/api/internal/zabq;

    .line 488
    .line 489
    invoke-virtual {p1, v5}, Lcom/google/android/gms/common/api/internal/zabq;->m(Z)Z

    .line 490
    .line 491
    .line 492
    return v5

    .line 493
    :pswitch_7
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 494
    .line 495
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 496
    .line 497
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_1f

    .line 502
    .line 503
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 504
    .line 505
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 506
    .line 507
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    check-cast p1, Lcom/google/android/gms/common/api/internal/zabq;

    .line 512
    .line 513
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/zabq;->o:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 514
    .line 515
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 516
    .line 517
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->b(Landroid/os/Handler;)V

    .line 518
    .line 519
    .line 520
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/zabq;->k:Z

    .line 521
    .line 522
    if-eqz v1, :cond_1f

    .line 523
    .line 524
    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/zabq;->e:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 525
    .line 526
    iget-object v3, p1, Lcom/google/android/gms/common/api/internal/zabq;->o:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 527
    .line 528
    iget-object v3, v3, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 529
    .line 530
    if-eqz v1, :cond_12

    .line 531
    .line 532
    const/16 v1, 0xb

    .line 533
    .line 534
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    const/16 v1, 0x9

    .line 538
    .line 539
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    iput-boolean v4, p1, Lcom/google/android/gms/common/api/internal/zabq;->k:Z

    .line 543
    .line 544
    :cond_12
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->f:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 545
    .line 546
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 547
    .line 548
    sget v2, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->a:I

    .line 549
    .line 550
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->b(Landroid/content/Context;I)I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    const/16 v1, 0x12

    .line 555
    .line 556
    if-ne v0, v1, :cond_13

    .line 557
    .line 558
    const-string v0, "Connection timed out waiting for Google Play services update to complete."

    .line 559
    .line 560
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 561
    .line 562
    const/16 v2, 0x15

    .line 563
    .line 564
    invoke-direct {v1, v2, v0, v6, v6}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 565
    .line 566
    .line 567
    goto :goto_5

    .line 568
    :cond_13
    const-string v0, "API failed to connect while resuming due to an unknown error."

    .line 569
    .line 570
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 571
    .line 572
    const/16 v2, 0x16

    .line 573
    .line 574
    invoke-direct {v1, v2, v0, v6, v6}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 575
    .line 576
    .line 577
    :goto_5
    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/internal/zabq;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 578
    .line 579
    .line 580
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/zabq;->d:Lcom/google/android/gms/common/api/Api$Client;

    .line 581
    .line 582
    const-string v0, "Timing out connection while resuming."

    .line 583
    .line 584
    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/Api$Client;->f(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    return v5

    .line 588
    :pswitch_8
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->m:Lq/g;

    .line 589
    .line 590
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    new-instance v0, Lq/b;

    .line 594
    .line 595
    invoke-direct {v0, p1}, Lq/b;-><init>(Lq/g;)V

    .line 596
    .line 597
    .line 598
    :cond_14
    :goto_6
    invoke-virtual {v0}, Lq/b;->hasNext()Z

    .line 599
    .line 600
    .line 601
    move-result p1

    .line 602
    if-eqz p1, :cond_15

    .line 603
    .line 604
    invoke-virtual {v0}, Lq/b;->next()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    check-cast p1, Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 609
    .line 610
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 611
    .line 612
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    check-cast p1, Lcom/google/android/gms/common/api/internal/zabq;

    .line 617
    .line 618
    if-eqz p1, :cond_14

    .line 619
    .line 620
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/zabq;->r()V

    .line 621
    .line 622
    .line 623
    goto :goto_6

    .line 624
    :cond_15
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->m:Lq/g;

    .line 625
    .line 626
    invoke-virtual {p1}, Lq/g;->clear()V

    .line 627
    .line 628
    .line 629
    return v5

    .line 630
    :pswitch_9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 631
    .line 632
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 633
    .line 634
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    if-eqz v0, :cond_1f

    .line 639
    .line 640
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 641
    .line 642
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 643
    .line 644
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    check-cast p1, Lcom/google/android/gms/common/api/internal/zabq;

    .line 649
    .line 650
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/zabq;->o:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 651
    .line 652
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 653
    .line 654
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->b(Landroid/os/Handler;)V

    .line 655
    .line 656
    .line 657
    iget-boolean v0, p1, Lcom/google/android/gms/common/api/internal/zabq;->k:Z

    .line 658
    .line 659
    if-eqz v0, :cond_1f

    .line 660
    .line 661
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/zabq;->n()V

    .line 662
    .line 663
    .line 664
    return v5

    .line 665
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast p1, Lcom/google/android/gms/common/api/GoogleApi;

    .line 668
    .line 669
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d(Lcom/google/android/gms/common/api/GoogleApi;)Lcom/google/android/gms/common/api/internal/zabq;

    .line 670
    .line 671
    .line 672
    return v5

    .line 673
    :pswitch_b
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 674
    .line 675
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 676
    .line 677
    .line 678
    move-result-object p1

    .line 679
    instance-of p1, p1, Landroid/app/Application;

    .line 680
    .line 681
    if-eqz p1, :cond_1f

    .line 682
    .line 683
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->e:Landroid/content/Context;

    .line 684
    .line 685
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 686
    .line 687
    .line 688
    move-result-object p1

    .line 689
    check-cast p1, Landroid/app/Application;

    .line 690
    .line 691
    sget-object v0, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->l:Lcom/google/android/gms/common/api/internal/BackgroundDetector;

    .line 692
    .line 693
    monitor-enter v0

    .line 694
    :try_start_0
    iget-boolean v3, v0, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->k:Z

    .line 695
    .line 696
    if-nez v3, :cond_16

    .line 697
    .line 698
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 702
    .line 703
    .line 704
    iput-boolean v5, v0, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->k:Z

    .line 705
    .line 706
    goto :goto_7

    .line 707
    :catchall_0
    move-exception p1

    .line 708
    goto :goto_8

    .line 709
    :cond_16
    :goto_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 710
    new-instance p1, Lcom/google/android/gms/common/api/internal/zabl;

    .line 711
    .line 712
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/internal/zabl;-><init>(Lcom/google/android/gms/common/api/internal/GoogleApiManager;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->a(Lcom/google/android/gms/common/api/internal/BackgroundDetector$BackgroundStateChangeListener;)V

    .line 716
    .line 717
    .line 718
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 719
    .line 720
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 721
    .line 722
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    if-nez v3, :cond_17

    .line 727
    .line 728
    new-instance v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 729
    .line 730
    invoke-direct {v3}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 731
    .line 732
    .line 733
    invoke-static {v3}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    if-nez v0, :cond_17

    .line 741
    .line 742
    iget v0, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 743
    .line 744
    const/16 v3, 0x64

    .line 745
    .line 746
    if-le v0, v3, :cond_17

    .line 747
    .line 748
    invoke-virtual {p1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 749
    .line 750
    .line 751
    :cond_17
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 752
    .line 753
    .line 754
    move-result p1

    .line 755
    if-nez p1, :cond_1f

    .line 756
    .line 757
    iput-wide v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->a:J

    .line 758
    .line 759
    return v5

    .line 760
    :goto_8
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 761
    throw p1

    .line 762
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 763
    .line 764
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 767
    .line 768
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 769
    .line 770
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    :cond_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    if-eqz v2, :cond_19

    .line 783
    .line 784
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    check-cast v2, Lcom/google/android/gms/common/api/internal/zabq;

    .line 789
    .line 790
    iget v4, v2, Lcom/google/android/gms/common/api/internal/zabq;->i:I

    .line 791
    .line 792
    if-ne v4, v0, :cond_18

    .line 793
    .line 794
    goto :goto_9

    .line 795
    :cond_19
    move-object v2, v6

    .line 796
    :goto_9
    if-eqz v2, :cond_1b

    .line 797
    .line 798
    iget v0, p1, Lcom/google/android/gms/common/ConnectionResult;->i:I

    .line 799
    .line 800
    const/16 v1, 0xd

    .line 801
    .line 802
    if-ne v0, v1, :cond_1a

    .line 803
    .line 804
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->f:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 805
    .line 806
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 807
    .line 808
    iget v4, p1, Lcom/google/android/gms/common/ConnectionResult;->i:I

    .line 809
    .line 810
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    sget-object v0, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 814
    .line 815
    invoke-static {v4}, Lcom/google/android/gms/common/ConnectionResult;->x0(I)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    iget-object p1, p1, Lcom/google/android/gms/common/ConnectionResult;->k:Ljava/lang/String;

    .line 820
    .line 821
    new-instance v4, Ljava/lang/StringBuilder;

    .line 822
    .line 823
    const-string v7, "Error resolution was canceled by the user, original error message: "

    .line 824
    .line 825
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    const-string v0, ": "

    .line 832
    .line 833
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object p1

    .line 843
    invoke-direct {v1, v3, p1, v6, v6}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v2, v1}, Lcom/google/android/gms/common/api/internal/zabq;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 847
    .line 848
    .line 849
    return v5

    .line 850
    :cond_1a
    iget-object v0, v2, Lcom/google/android/gms/common/api/internal/zabq;->e:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 851
    .line 852
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->c(Lcom/google/android/gms/common/api/internal/ApiKey;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    .line 853
    .line 854
    .line 855
    move-result-object p1

    .line 856
    invoke-virtual {v2, p1}, Lcom/google/android/gms/common/api/internal/zabq;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 857
    .line 858
    .line 859
    return v5

    .line 860
    :cond_1b
    const-string p1, "Could not find API instance "

    .line 861
    .line 862
    const-string v1, " while trying to fail enqueued calls."

    .line 863
    .line 864
    invoke-static {v0, p1, v1}, Landroidx/appcompat/app/b;->k(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object p1

    .line 868
    new-instance v0, Ljava/lang/Exception;

    .line 869
    .line 870
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 871
    .line 872
    .line 873
    const-string v1, "GoogleApiManager"

    .line 874
    .line 875
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 876
    .line 877
    .line 878
    return v5

    .line 879
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast p1, Lcom/google/android/gms/common/api/internal/zach;

    .line 882
    .line 883
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 884
    .line 885
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/zach;->c:Lcom/google/android/gms/common/api/GoogleApi;

    .line 886
    .line 887
    iget-object v1, v1, Lcom/google/android/gms/common/api/GoogleApi;->e:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 888
    .line 889
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    check-cast v0, Lcom/google/android/gms/common/api/internal/zabq;

    .line 894
    .line 895
    if-nez v0, :cond_1c

    .line 896
    .line 897
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/zach;->c:Lcom/google/android/gms/common/api/GoogleApi;

    .line 898
    .line 899
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->d(Lcom/google/android/gms/common/api/GoogleApi;)Lcom/google/android/gms/common/api/internal/zabq;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    :cond_1c
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/zabq;->d:Lcom/google/android/gms/common/api/Api$Client;

    .line 904
    .line 905
    invoke-interface {v1}, Lcom/google/android/gms/common/api/Api$Client;->o()Z

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    if-eqz v1, :cond_1d

    .line 910
    .line 911
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 912
    .line 913
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    iget v2, p1, Lcom/google/android/gms/common/api/internal/zach;->b:I

    .line 918
    .line 919
    if-eq v1, v2, :cond_1d

    .line 920
    .line 921
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/zach;->a:Lcom/google/android/gms/common/api/internal/zai;

    .line 922
    .line 923
    sget-object v1, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->p:Lcom/google/android/gms/common/api/Status;

    .line 924
    .line 925
    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/internal/zai;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/zabq;->r()V

    .line 929
    .line 930
    .line 931
    return v5

    .line 932
    :cond_1d
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/zach;->a:Lcom/google/android/gms/common/api/internal/zai;

    .line 933
    .line 934
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/zabq;->o(Lcom/google/android/gms/common/api/internal/zai;)V

    .line 935
    .line 936
    .line 937
    return v5

    .line 938
    :pswitch_e
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 939
    .line 940
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 941
    .line 942
    .line 943
    move-result-object p1

    .line 944
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 945
    .line 946
    .line 947
    move-result-object p1

    .line 948
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 949
    .line 950
    .line 951
    move-result v0

    .line 952
    if-eqz v0, :cond_1f

    .line 953
    .line 954
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    check-cast v0, Lcom/google/android/gms/common/api/internal/zabq;

    .line 959
    .line 960
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/zabq;->o:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 961
    .line 962
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 963
    .line 964
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->b(Landroid/os/Handler;)V

    .line 965
    .line 966
    .line 967
    iput-object v6, v0, Lcom/google/android/gms/common/api/internal/zabq;->m:Lcom/google/android/gms/common/ConnectionResult;

    .line 968
    .line 969
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/zabq;->n()V

    .line 970
    .line 971
    .line 972
    goto :goto_a

    .line 973
    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast p1, Lcom/google/android/gms/common/api/internal/zal;

    .line 976
    .line 977
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    throw v6

    .line 981
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast p1, Ljava/lang/Boolean;

    .line 984
    .line 985
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 986
    .line 987
    .line 988
    move-result p1

    .line 989
    if-eq v5, p1, :cond_1e

    .line 990
    .line 991
    goto :goto_b

    .line 992
    :cond_1e
    const-wide/16 v1, 0x2710

    .line 993
    .line 994
    :goto_b
    iput-wide v1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->a:J

    .line 995
    .line 996
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 997
    .line 998
    const/16 v0, 0xc

    .line 999
    .line 1000
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 1001
    .line 1002
    .line 1003
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1004
    .line 1005
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1006
    .line 1007
    .line 1008
    move-result-object p1

    .line 1009
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1010
    .line 1011
    .line 1012
    move-result-object p1

    .line 1013
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    if-eqz v1, :cond_1f

    .line 1018
    .line 1019
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    check-cast v1, Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 1024
    .line 1025
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->n:Lcom/google/android/gms/internal/base/zau;

    .line 1026
    .line 1027
    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    iget-wide v3, p0, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->a:J

    .line 1032
    .line 1033
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1034
    .line 1035
    .line 1036
    goto :goto_c

    .line 1037
    :cond_1f
    :goto_d
    return v5

    .line 1038
    nop

    .line 1039
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
.end method
