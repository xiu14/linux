.class public final Lcom/google/android/gms/location/zzbf;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/location/LocationRequest;",
        ">;"
    }
.end annotation


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
    .locals 17

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
    const/16 v2, 0x66

    .line 8
    .line 9
    const-wide/32 v3, 0x36ee80

    .line 10
    .line 11
    .line 12
    const-wide/32 v5, 0x927c0

    .line 13
    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const-wide v8, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const v10, 0x7fffffff

    .line 22
    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const-wide/16 v12, 0x0

    .line 26
    .line 27
    move-wide v9, v8

    .line 28
    move-wide v13, v12

    .line 29
    const/4 v8, 0x0

    .line 30
    const v11, 0x7fffffff

    .line 31
    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 35
    .line 36
    .line 37
    move-result v15

    .line 38
    if-ge v15, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 41
    .line 42
    .line 43
    move-result v15

    .line 44
    move/from16 v16, v8

    .line 45
    .line 46
    int-to-char v8, v15

    .line 47
    packed-switch v8, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->r(Landroid/os/Parcel;I)V

    .line 51
    .line 52
    .line 53
    :goto_1
    move/from16 v8, v16

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_0
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    goto :goto_0

    .line 61
    :pswitch_1
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v13

    .line 65
    goto :goto_1

    .line 66
    :pswitch_2
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->l(Landroid/os/Parcel;I)F

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    move v12, v8

    .line 71
    goto :goto_1

    .line 72
    :pswitch_3
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    move v11, v8

    .line 77
    goto :goto_1

    .line 78
    :pswitch_4
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 79
    .line 80
    .line 81
    move-result-wide v8

    .line 82
    move-wide v9, v8

    .line 83
    goto :goto_1

    .line 84
    :pswitch_5
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    goto :goto_1

    .line 89
    :pswitch_6
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    goto :goto_1

    .line 94
    :pswitch_7
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    goto :goto_1

    .line 99
    :pswitch_8
    invoke-static {v0, v15}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    goto :goto_1

    .line 104
    :cond_0
    move/from16 v16, v8

    .line 105
    .line 106
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    .line 110
    .line 111
    invoke-direct {v0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 112
    .line 113
    .line 114
    iput v2, v0, Lcom/google/android/gms/location/LocationRequest;->h:I

    .line 115
    .line 116
    iput-wide v3, v0, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 117
    .line 118
    iput-wide v5, v0, Lcom/google/android/gms/location/LocationRequest;->j:J

    .line 119
    .line 120
    iput-boolean v7, v0, Lcom/google/android/gms/location/LocationRequest;->k:Z

    .line 121
    .line 122
    iput-wide v9, v0, Lcom/google/android/gms/location/LocationRequest;->l:J

    .line 123
    .line 124
    iput v11, v0, Lcom/google/android/gms/location/LocationRequest;->m:I

    .line 125
    .line 126
    iput v12, v0, Lcom/google/android/gms/location/LocationRequest;->n:F

    .line 127
    .line 128
    iput-wide v13, v0, Lcom/google/android/gms/location/LocationRequest;->o:J

    .line 129
    .line 130
    move/from16 v7, v16

    .line 131
    .line 132
    iput-boolean v7, v0, Lcom/google/android/gms/location/LocationRequest;->p:Z

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_data_0
    .packed-switch 0x1
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
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/location/LocationRequest;

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
