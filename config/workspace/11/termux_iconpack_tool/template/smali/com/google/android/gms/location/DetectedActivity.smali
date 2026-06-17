.class public Lcom/google/android/gms/location/DetectedActivity;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/location/DetectedActivity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:I

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/location/zzq;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/location/zzq;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/location/zzr;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/google/android/gms/location/zzr;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/location/DetectedActivity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 12
    .line 13
    return-void
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
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/location/DetectedActivity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/google/android/gms/location/DetectedActivity;

    .line 7
    .line 8
    iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->h:I

    .line 9
    .line 10
    iget v2, p1, Lcom/google/android/gms/location/DetectedActivity;->h:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->i:I

    .line 15
    .line 16
    iget p1, p1, Lcom/google/android/gms/location/DetectedActivity;->i:I

    .line 17
    .line 18
    if-ne v0, p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_0
    return v1
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

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->h:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/location/DetectedActivity;->i:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    new-array v2, v2, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v0, v2, v3

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object v1, v2, v0

    .line 21
    .line 22
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->h:I

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    if-gt v0, v1, :cond_0

    .line 7
    .line 8
    if-gez v0, :cond_1

    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x4

    .line 11
    :cond_1
    if-eqz v0, :cond_b

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_a

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_9

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_8

    .line 21
    .line 22
    if-eq v0, v2, :cond_7

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    if-eq v0, v1, :cond_6

    .line 26
    .line 27
    const/4 v1, 0x7

    .line 28
    if-eq v0, v1, :cond_5

    .line 29
    .line 30
    const/16 v1, 0x8

    .line 31
    .line 32
    if-eq v0, v1, :cond_4

    .line 33
    .line 34
    const/16 v1, 0x10

    .line 35
    .line 36
    if-eq v0, v1, :cond_3

    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string v0, "IN_RAIL_VEHICLE"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const-string v0, "IN_ROAD_VEHICLE"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    const-string v0, "RUNNING"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    const-string v0, "WALKING"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    const-string v0, "TILTING"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_7
    const-string v0, "UNKNOWN"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_8
    const-string v0, "STILL"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_9
    const-string v0, "ON_FOOT"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_a
    const-string v0, "ON_BICYCLE"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_b
    const-string v0, "IN_VEHICLE"

    .line 75
    .line 76
    :goto_0
    iget v1, p0, Lcom/google/android/gms/location/DetectedActivity;->i:I

    .line 77
    .line 78
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    new-instance v3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x30

    .line 89
    .line 90
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const-string v2, "DetectedActivity [type="

    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, ", confidence="

    .line 102
    .line 103
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, "]"

    .line 110
    .line 111
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x4f45

    .line 5
    .line 6
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->h(Landroid/os/Parcel;I)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->h:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x4

    .line 14
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 18
    .line 19
    .line 20
    iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->i:I

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->i(Landroid/os/Parcel;I)V

    .line 30
    .line 31
    .line 32
    return-void
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
