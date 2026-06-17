.class public final Lcom/google/android/gms/internal/location/zzbf;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/internal/location/zzbe;",
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
    .locals 23

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
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const-wide/16 v7, 0x0

    .line 13
    .line 14
    const/4 v9, -0x1

    .line 15
    move-object v11, v2

    .line 16
    move-wide v14, v4

    .line 17
    move-wide/from16 v16, v14

    .line 18
    .line 19
    move-wide/from16 v19, v7

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    const/4 v13, 0x0

    .line 23
    const/16 v18, 0x0

    .line 24
    .line 25
    const/16 v21, 0x0

    .line 26
    .line 27
    const/16 v22, -0x1

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v2, v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-char v3, v2

    .line 40
    const/16 v4, 0x8

    .line 41
    .line 42
    packed-switch v3, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->r(Landroid/os/Parcel;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_0
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    move/from16 v22, v2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    move/from16 v21, v2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_2
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    move v12, v2

    .line 68
    goto :goto_0

    .line 69
    :pswitch_3
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->l(Landroid/os/Parcel;I)F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move/from16 v18, v2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_4
    invoke-static {v0, v2, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->t(Landroid/os/Parcel;II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    move-wide/from16 v16, v2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_5
    invoke-static {v0, v2, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->t(Landroid/os/Parcel;II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    move-wide v14, v2

    .line 94
    goto :goto_0

    .line 95
    :pswitch_6
    const/4 v3, 0x4

    .line 96
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->t(Landroid/os/Parcel;II)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    int-to-short v2, v2

    .line 104
    move v13, v2

    .line 105
    goto :goto_0

    .line 106
    :pswitch_7
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    move-wide/from16 v19, v2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_8
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v11, v2

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    .line 120
    .line 121
    .line 122
    new-instance v10, Lcom/google/android/gms/internal/location/zzbe;

    .line 123
    .line 124
    invoke-direct/range {v10 .. v22}, Lcom/google/android/gms/internal/location/zzbe;-><init>(Ljava/lang/String;ISDDFJII)V

    .line 125
    .line 126
    .line 127
    return-object v10

    .line 128
    nop

    .line 129
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

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/internal/location/zzbe;

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
