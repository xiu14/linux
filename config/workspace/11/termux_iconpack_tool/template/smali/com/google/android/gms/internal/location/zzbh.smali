.class final Lcom/google/android/gms/internal/location/zzbh;
.super Lcom/google/android/gms/location/zzbi;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/zzbi<",
        "Lcom/google/android/gms/location/LocationSettingsResult;",
        ">;"
    }
.end annotation


# virtual methods
.method public final bridge synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/location/LocationSettingsResult;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/location/LocationSettingsResult;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/location/LocationSettingsStates;)V

    .line 5
    .line 6
    .line 7
    return-object v0
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

.method public final h(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/location/zzaz;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->q()V

    .line 4
    .line 5
    .line 6
    const-string v0, "locationSettingsRequest can\'t be null nor empty."

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->a(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/location/zzay;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzan;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p0, v0, Lcom/google/android/gms/internal/location/zzay;->c:Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->v()Landroid/os/IInterface;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/google/android/gms/internal/location/zzam;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/location/zzam;->L(Lcom/google/android/gms/internal/location/zzao;)V

    .line 26
    .line 27
    .line 28
    return-void
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
