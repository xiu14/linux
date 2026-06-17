.class public final Lcom/google/android/gms/auth/api/signin/zae;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->s(Landroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move-object v6, v2

    .line 10
    move-object v7, v6

    .line 11
    move-object v11, v7

    .line 12
    move-object v12, v11

    .line 13
    move-object v14, v12

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ge v4, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    int-to-char v13, v4

    .line 29
    packed-switch v13, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->r(Landroid/os/Parcel;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_0
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v14

    .line 40
    goto :goto_0

    .line 41
    :pswitch_1
    sget-object v2, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 42
    .line 43
    invoke-static {v0, v4, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    goto :goto_0

    .line 48
    :pswitch_2
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    goto :goto_0

    .line 53
    :pswitch_3
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    goto :goto_0

    .line 58
    :pswitch_4
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    goto :goto_0

    .line 63
    :pswitch_5
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    goto :goto_0

    .line 68
    :pswitch_6
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    goto :goto_0

    .line 73
    :pswitch_7
    sget-object v7, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 74
    .line 75
    invoke-static {v0, v4, v7}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    move-object v7, v4

    .line 80
    check-cast v7, Landroid/accounts/Account;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_8
    sget-object v6, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 84
    .line 85
    invoke-static {v0, v4, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    goto :goto_0

    .line 90
    :pswitch_9
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    .line 96
    .line 97
    .line 98
    new-instance v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 99
    .line 100
    new-instance v13, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    if-nez v2, :cond_1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    :goto_1
    if-ge v3, v0, :cond_2

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    add-int/lit8 v3, v3, 0x1

    .line 119
    .line 120
    check-cast v1, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;

    .line 121
    .line 122
    iget v15, v1, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;->i:I

    .line 123
    .line 124
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v15

    .line 128
    invoke-virtual {v13, v15, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    :goto_2
    invoke-direct/range {v4 .. v14}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v4

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 138
    .line 139
    .line 140
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 2
    .line 3
    return-object p1
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method
