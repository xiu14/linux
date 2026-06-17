.class final Lcom/google/android/gms/internal/location/zzs;
.super Lcom/google/android/gms/internal/location/zzx;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final h(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 4

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/location/zzaz;

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/location/zzy;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/location/zzy;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/location/zzbj;->a()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "LocationListener"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v1, v3, v2}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->a(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p1, Lcom/google/android/gms/internal/location/zzaz;->B:Lcom/google/android/gms/internal/location/zzav;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_0
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzaz;->B:Lcom/google/android/gms/internal/location/zzav;

    .line 23
    .line 24
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/location/zzav;->a(Lcom/google/android/gms/common/api/internal/ListenerHolder;Lcom/google/android/gms/internal/location/zzai;)V

    .line 25
    .line 26
    .line 27
    monitor-exit v2

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
