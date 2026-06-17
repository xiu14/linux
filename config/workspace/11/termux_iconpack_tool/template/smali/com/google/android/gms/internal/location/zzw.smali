.class final Lcom/google/android/gms/internal/location/zzw;
.super Lcom/google/android/gms/internal/location/zzx;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final h(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 7

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/location/zzaz;

    .line 2
    .line 3
    new-instance v6, Lcom/google/android/gms/internal/location/zzy;

    .line 4
    .line 5
    invoke-direct {v6, p0}, Lcom/google/android/gms/internal/location/zzy;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzaz;->B:Lcom/google/android/gms/internal/location/zzav;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzav;->a:Lcom/google/android/gms/internal/location/zzbg;

    .line 11
    .line 12
    check-cast p1, Lcom/google/android/gms/internal/location/zzh;

    .line 13
    .line 14
    iget-object v0, p1, Lcom/google/android/gms/internal/location/zzh;->a:Lcom/google/android/gms/internal/location/zzi;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/BaseGmsClient;->q()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/location/zzh;->a()Lcom/google/android/gms/internal/location/zzam;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Lcom/google/android/gms/internal/location/zzbc;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x2

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/location/zzbc;-><init>(ILcom/google/android/gms/internal/location/zzba;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/location/zzam;->z(Lcom/google/android/gms/internal/location/zzbc;)V

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
.end method
