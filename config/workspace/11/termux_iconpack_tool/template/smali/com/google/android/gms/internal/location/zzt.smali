.class final Lcom/google/android/gms/internal/location/zzt;
.super Lcom/google/android/gms/internal/location/zzx;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final h(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 5

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
    invoke-static {}, Lcom/google/android/gms/internal/location/zzba;->c0()Lcom/google/android/gms/internal/location/zzba;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/location/zzbj;->a()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "LocationCallback"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v2, v4, v3}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->a(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p1, Lcom/google/android/gms/internal/location/zzaz;->B:Lcom/google/android/gms/internal/location/zzav;

    .line 24
    .line 25
    monitor-enter v3

    .line 26
    :try_start_0
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzaz;->B:Lcom/google/android/gms/internal/location/zzav;

    .line 27
    .line 28
    invoke-virtual {p1, v1, v2, v0}, Lcom/google/android/gms/internal/location/zzav;->b(Lcom/google/android/gms/internal/location/zzba;Lcom/google/android/gms/common/api/internal/ListenerHolder;Lcom/google/android/gms/internal/location/zzah;)V

    .line 29
    .line 30
    .line 31
    monitor-exit v3

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p1
    .line 36
    .line 37
.end method
