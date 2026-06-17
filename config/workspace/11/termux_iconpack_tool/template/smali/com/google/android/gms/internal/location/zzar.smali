.class final Lcom/google/android/gms/internal/location/zzar;
.super Lcom/google/android/gms/location/zzaz;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final d:Lcom/google/android/gms/common/api/internal/ListenerHolder;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/ListenerHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/location/zzaz;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzar;->d:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/location/LocationResult;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/location/zzap;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/location/zzap;-><init>(Lcom/google/android/gms/location/LocationResult;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzar;->d:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/ListenerHolder;->a(Lcom/google/android/gms/common/api/internal/ListenerHolder$Notifier;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public final R(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/location/zzaq;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzar;->d:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/ListenerHolder;->a(Lcom/google/android/gms/common/api/internal/ListenerHolder$Notifier;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public final declared-synchronized b()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzar;->d:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/ListenerHolder;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/ListenerHolder;->c:Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method
