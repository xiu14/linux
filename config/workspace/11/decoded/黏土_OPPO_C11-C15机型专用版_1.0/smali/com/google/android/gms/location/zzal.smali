.class final Lcom/google/android/gms/location/zzal;
.super Lcom/google/android/gms/internal/location/zzah;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final b()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public final e0(Lcom/google/android/gms/internal/location/zzaa;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzaa;->h:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget v1, p1, Lcom/google/android/gms/common/api/Status;->h:I

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    throw v0

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/ApiExceptionUtil;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;

    .line 12
    .line 13
    .line 14
    throw v0

    .line 15
    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    .line 16
    .line 17
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 18
    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    const-string v3, "Got null status from location service"

    .line 22
    .line 23
    invoke-direct {v1, v2, v3, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 27
    .line 28
    .line 29
    throw v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
