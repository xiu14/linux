.class public Lcom/google/android/gms/common/data/SingleRefDataBufferIterator;
.super Lcom/google/android/gms/common/data/DataBufferIterator;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/common/data/DataBufferIterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public j:Ljava/lang/Object;


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataBufferIterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/gms/common/data/DataBufferIterator;->i:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput v0, p0, Lcom/google/android/gms/common/data/DataBufferIterator;->i:I

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/common/data/DataBufferIterator;->h:Lcom/google/android/gms/common/data/DataBuffer;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/data/DataBuffer;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/google/android/gms/common/data/SingleRefDataBufferIterator;->j:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v1, v0, Lcom/google/android/gms/common/data/DataBufferRef;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "DataBuffer reference of type "

    .line 43
    .line 44
    const-string v3, " is not movable"

    .line 45
    .line 46
    invoke-static {v2, v0, v3}, Landroidx/appcompat/app/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/common/data/SingleRefDataBufferIterator;->j:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lcom/google/android/gms/common/data/DataBufferRef;

    .line 57
    .line 58
    if-gez v0, :cond_2

    .line 59
    .line 60
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    const/4 v0, 0x0

    .line 67
    throw v0

    .line 68
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 69
    .line 70
    iget v1, p0, Lcom/google/android/gms/common/data/DataBufferIterator;->i:I

    .line 71
    .line 72
    const-string v2, "Cannot advance the iterator beyond "

    .line 73
    .line 74
    invoke-static {v1, v2}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0
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
