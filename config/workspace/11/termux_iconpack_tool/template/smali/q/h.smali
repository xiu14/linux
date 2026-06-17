.class public final Lq/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:I

.field public d:I


# virtual methods
.method public final a(Lr1/g;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq/h;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lq/h;->c:I

    .line 4
    .line 5
    aput-object p1, v0, v1

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iget p1, p0, Lq/h;->d:I

    .line 10
    .line 11
    and-int/2addr p1, v1

    .line 12
    iput p1, p0, Lq/h;->c:I

    .line 13
    .line 14
    iget v1, p0, Lq/h;->b:I

    .line 15
    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    array-length p1, v0

    .line 19
    sub-int v2, p1, v1

    .line 20
    .line 21
    shl-int/lit8 v3, p1, 0x1

    .line 22
    .line 23
    if-ltz v3, :cond_0

    .line 24
    .line 25
    new-array v4, v3, [Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-static {v0, v4, v5, v1, p1}, Lq4/h;->P([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lq/h;->a:[Ljava/lang/Object;

    .line 32
    .line 33
    iget v1, p0, Lq/h;->b:I

    .line 34
    .line 35
    invoke-static {v0, v4, v2, v5, v1}, Lq4/h;->P([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 36
    .line 37
    .line 38
    iput-object v4, p0, Lq/h;->a:[Ljava/lang/Object;

    .line 39
    .line 40
    iput v5, p0, Lq/h;->b:I

    .line 41
    .line 42
    iput p1, p0, Lq/h;->c:I

    .line 43
    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    iput v3, p0, Lq/h;->d:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 50
    .line 51
    const-string v0, "Max array capacity exceeded"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_1
    return-void
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
