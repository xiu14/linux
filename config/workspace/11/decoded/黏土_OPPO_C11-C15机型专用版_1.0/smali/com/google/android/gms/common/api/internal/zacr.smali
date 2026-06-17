.class final Lcom/google/android/gms/common/api/internal/zacr;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/google/android/gms/signin/internal/zak;

.field public final synthetic i:Lcom/google/android/gms/common/api/internal/zact;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zact;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zacr;->i:Lcom/google/android/gms/common/api/internal/zact;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/zacr;->h:Lcom/google/android/gms/signin/internal/zak;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/zact;->j:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zacr;->h:Lcom/google/android/gms/signin/internal/zak;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/gms/signin/internal/zak;->i:Lcom/google/android/gms/common/ConnectionResult;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->p0()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/zacr;->i:Lcom/google/android/gms/common/api/internal/zact;

    .line 12
    .line 13
    if-eqz v2, :cond_5

    .line 14
    .line 15
    iget-object v0, v0, Lcom/google/android/gms/signin/internal/zak;->j:Lcom/google/android/gms/common/internal/zav;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lcom/google/android/gms/common/internal/zav;->j:Lcom/google/android/gms/common/ConnectionResult;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->p0()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v2, Ljava/lang/Exception;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v4, "SignInCoordinator"

    .line 38
    .line 39
    const-string v5, "Sign-in succeeded with resolve account failure: "

    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v4, v0, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 46
    .line 47
    .line 48
    iget-object v0, v3, Lcom/google/android/gms/common/api/internal/zact;->i:Lcom/google/android/gms/common/api/internal/zacs;

    .line 49
    .line 50
    check-cast v0, Lcom/google/android/gms/common/api/internal/zabu;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/zabu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, v3, Lcom/google/android/gms/common/api/internal/zact;->h:Lcom/google/android/gms/signin/zae;

    .line 56
    .line 57
    invoke-interface {v0}, Lcom/google/android/gms/common/api/Api$Client;->n()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    iget-object v1, v3, Lcom/google/android/gms/common/api/internal/zact;->i:Lcom/google/android/gms/common/api/internal/zacs;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/google/android/gms/common/internal/zav;->i:Landroid/os/IBinder;

    .line 64
    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget v2, Lcom/google/android/gms/common/internal/IAccountAccessor$Stub;->c:I

    .line 70
    .line 71
    const-string v2, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 72
    .line 73
    invoke-interface {v0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    instance-of v5, v4, Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 78
    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    move-object v0, v4

    .line 82
    check-cast v0, Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    new-instance v4, Lcom/google/android/gms/common/internal/zzw;

    .line 86
    .line 87
    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move-object v0, v4

    .line 91
    :goto_0
    iget-object v2, v3, Lcom/google/android/gms/common/api/internal/zact;->f:Ljava/util/Set;

    .line 92
    .line 93
    check-cast v1, Lcom/google/android/gms/common/api/internal/zabu;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    if-nez v2, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iput-object v0, v1, Lcom/google/android/gms/common/api/internal/zabu;->c:Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 104
    .line 105
    iput-object v2, v1, Lcom/google/android/gms/common/api/internal/zabu;->d:Ljava/util/Set;

    .line 106
    .line 107
    iget-boolean v4, v1, Lcom/google/android/gms/common/api/internal/zabu;->e:Z

    .line 108
    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/zabu;->a:Lcom/google/android/gms/common/api/Api$Client;

    .line 112
    .line 113
    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/common/api/Api$Client;->e(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/Exception;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v2, "GoogleApiManager"

    .line 123
    .line 124
    const-string v4, "Received null response from onSignInSuccess"

    .line 125
    .line 126
    invoke-static {v2, v4, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 127
    .line 128
    .line 129
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 130
    .line 131
    const/4 v2, 0x4

    .line 132
    invoke-direct {v0, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/internal/zabu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    iget-object v0, v3, Lcom/google/android/gms/common/api/internal/zact;->i:Lcom/google/android/gms/common/api/internal/zacs;

    .line 140
    .line 141
    check-cast v0, Lcom/google/android/gms/common/api/internal/zabu;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/zabu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_2
    iget-object v0, v3, Lcom/google/android/gms/common/api/internal/zact;->h:Lcom/google/android/gms/signin/zae;

    .line 147
    .line 148
    invoke-interface {v0}, Lcom/google/android/gms/common/api/Api$Client;->n()V

    .line 149
    .line 150
    .line 151
    return-void
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
