.class final Lcom/google/android/gms/internal/location/zzp;
.super Lcom/google/android/gms/internal/location/zzx;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final h(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/location/zzaz;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzaz;->B:Lcom/google/android/gms/internal/location/zzav;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzav;->a:Lcom/google/android/gms/internal/location/zzbg;

    .line 6
    .line 7
    check-cast p1, Lcom/google/android/gms/internal/location/zzh;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/google/android/gms/internal/location/zzh;->a:Lcom/google/android/gms/internal/location/zzi;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/BaseGmsClient;->q()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/location/zzh;->a()Lcom/google/android/gms/internal/location/zzam;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Lcom/google/android/gms/internal/location/zzam;->C()V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/google/android/gms/common/api/Status;->l:Lcom/google/android/gms/common/api/Status;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lcom/google/android/gms/common/api/Result;)V

    .line 24
    .line 25
    .line 26
    return-void
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
