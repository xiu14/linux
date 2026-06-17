.class final Lcom/google/android/gms/security/zza;
.super Landroid/os/AsyncTask;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast p1, [Ljava/lang/Void;

    .line 7
    .line 8
    :try_start_0
    sget-object p1, Lcom/google/android/gms/security/ProviderInstaller;->a:Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    .line 9
    .line 10
    const-string p1, "Context must not be null"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Preconditions;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v1
    :try_end_0
    .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    return-object v0
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

.method public final bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    throw v1

    .line 11
    :cond_0
    sget-object v0, Lcom/google/android/gms/security/ProviderInstaller;->a:Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const-string v2, "pi"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    throw v1
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
