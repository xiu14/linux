.class public final Lcom/google/android/gms/location/zzk;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/location/ActivityRecognitionResult;",
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
    .locals 14

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->s(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    move-object v5, v1

    .line 10
    move-wide v6, v2

    .line 11
    move-wide v8, v6

    .line 12
    const/4 v10, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    const/4 v12, 0x1

    .line 18
    if-ge v11, v0, :cond_5

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    int-to-char v13, v11

    .line 25
    if-eq v13, v12, :cond_4

    .line 26
    .line 27
    const/4 v12, 0x2

    .line 28
    if-eq v13, v12, :cond_3

    .line 29
    .line 30
    const/4 v12, 0x3

    .line 31
    if-eq v13, v12, :cond_2

    .line 32
    .line 33
    const/4 v12, 0x4

    .line 34
    if-eq v13, v12, :cond_1

    .line 35
    .line 36
    const/4 v12, 0x5

    .line 37
    if-eq v13, v12, :cond_0

    .line 38
    .line 39
    invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->r(Landroid/os/Parcel;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->b(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v8

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    goto :goto_0

    .line 63
    :cond_4
    sget-object v1, Lcom/google/android/gms/location/DetectedActivity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 64
    .line 65
    invoke-static {p1, v11, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_0

    .line 70
    :cond_5
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    .line 71
    .line 72
    .line 73
    new-instance p1, Lcom/google/android/gms/location/ActivityRecognitionResult;

    .line 74
    .line 75
    invoke-direct {p1}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 76
    .line 77
    .line 78
    if-eqz v1, :cond_6

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-lez v0, :cond_6

    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    goto :goto_1

    .line 88
    :cond_6
    const/4 v0, 0x0

    .line 89
    :goto_1
    const-string v11, "Must have at least 1 detected activity"

    .line 90
    .line 91
    invoke-static {v11, v0}, Lcom/google/android/gms/common/internal/Preconditions;->a(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    cmp-long v0, v6, v2

    .line 95
    .line 96
    if-lez v0, :cond_7

    .line 97
    .line 98
    cmp-long v0, v8, v2

    .line 99
    .line 100
    if-lez v0, :cond_7

    .line 101
    .line 102
    const/4 v4, 0x1

    .line 103
    :cond_7
    const-string v0, "Must set times"

    .line 104
    .line 105
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/Preconditions;->a(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    iput-object v1, p1, Lcom/google/android/gms/location/ActivityRecognitionResult;->h:Ljava/util/ArrayList;

    .line 109
    .line 110
    iput-wide v6, p1, Lcom/google/android/gms/location/ActivityRecognitionResult;->i:J

    .line 111
    .line 112
    iput-wide v8, p1, Lcom/google/android/gms/location/ActivityRecognitionResult;->j:J

    .line 113
    .line 114
    iput v10, p1, Lcom/google/android/gms/location/ActivityRecognitionResult;->k:I

    .line 115
    .line 116
    iput-object v5, p1, Lcom/google/android/gms/location/ActivityRecognitionResult;->l:Landroid/os/Bundle;

    .line 117
    .line 118
    return-object p1
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

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/location/ActivityRecognitionResult;

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
