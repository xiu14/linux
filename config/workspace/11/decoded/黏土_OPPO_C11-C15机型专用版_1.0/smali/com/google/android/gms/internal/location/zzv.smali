.class final Lcom/google/android/gms/internal/location/zzv;
.super Lcom/google/android/gms/internal/location/zzx;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final h(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 9

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/location/zzaz;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "LocationListener"

    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->b(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v7, Lcom/google/android/gms/internal/location/zzy;

    .line 11
    .line 12
    invoke-direct {v7, p0}, Lcom/google/android/gms/internal/location/zzy;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzaz;->B:Lcom/google/android/gms/internal/location/zzav;

    .line 16
    .line 17
    iget-object v1, p1, Lcom/google/android/gms/internal/location/zzav;->a:Lcom/google/android/gms/internal/location/zzbg;

    .line 18
    .line 19
    check-cast v1, Lcom/google/android/gms/internal/location/zzh;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/google/android/gms/internal/location/zzh;->a:Lcom/google/android/gms/internal/location/zzi;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->q()V

    .line 24
    .line 25
    .line 26
    iget-object v8, p1, Lcom/google/android/gms/internal/location/zzav;->b:Ljava/util/HashMap;

    .line 27
    .line 28
    monitor-enter v8

    .line 29
    :try_start_0
    iget-object v1, p1, Lcom/google/android/gms/internal/location/zzav;->b:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v4, v0

    .line 36
    check-cast v4, Lcom/google/android/gms/internal/location/zzau;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/google/android/gms/internal/location/zzau;->b()V

    .line 41
    .line 42
    .line 43
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzav;->a:Lcom/google/android/gms/internal/location/zzbg;

    .line 44
    .line 45
    check-cast p1, Lcom/google/android/gms/internal/location/zzh;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/google/android/gms/internal/location/zzh;->a()Lcom/google/android/gms/internal/location/zzam;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v1, Lcom/google/android/gms/internal/location/zzbc;

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v2, 0x2

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/location/zzbc;-><init>(ILcom/google/android/gms/internal/location/zzba;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/location/zzam;->z(Lcom/google/android/gms/internal/location/zzbc;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    monitor-exit v8

    .line 68
    return-void

    .line 69
    :goto_1
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p1
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
.end method
